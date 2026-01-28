#!/usr/bin/env node

/**
 * SRTgo - K-Train Reservation Helper (Node.js)
 * Ported from Python srtgo.py
 */

import { program } from 'commander';
import inquirer from 'inquirer';
import chalk from 'chalk';
import Conf from 'conf';
import TelegramBot from 'node-telegram-bot-api';

import {
  SRT, SRTError, SRTNetFunnelError, SRTTrain,
  Adult, Child, Senior, Disability1To3, Disability4To6,
  SeatType, STATION_CODE as SRT_STATION_CODE,
} from './srt.js';

import {
  Korail, KorailError, Train,
  AdultPassenger, ChildPassenger, SeniorPassenger,
  Disability1To3Passenger, Disability4To6Passenger,
  ReserveOption, TrainType,
} from './ktx.js';

// Config store (replaces keyring)
const config = new Conf({ projectName: 'srtgo' });

// Constants
const STATIONS = {
  SRT: [
    '수서', '동탄', '평택지제', '경주', '곡성', '공주', '광주송정', '구례구',
    '김천(구미)', '나주', '남원', '대전', '동대구', '마산', '목포', '밀양',
    '부산', '서대구', '순천', '여수EXPO', '여천', '오송', '울산(통도사)', '익산',
    '전주', '정읍', '진영', '진주', '창원', '창원중앙', '천안아산', '포항',
  ],
  KTX: [
    '서울', '용산', '영등포', '광명', '수원', '천안아산', '오송', '대전',
    '서대전', '김천구미', '동대구', '경주', '포항', '밀양', '구포', '부산',
    '울산(통도사)', '마산', '창원중앙', '경산', '논산', '익산', '정읍', '광주송정',
    '목포', '전주', '순천', '여수EXPO', '청량리', '강릉', '행신', '정동진',
  ],
};

const DEFAULT_STATIONS = {
  SRT: ['수서', '대전', '동대구', '부산'],
  KTX: ['서울', '대전', '동대구', '부산'],
};

const RESERVE_INTERVAL_SHAPE = 4;
const RESERVE_INTERVAL_SCALE = 0.25;
const RESERVE_INTERVAL_MIN = 0.25;

const WAITING_BAR = ['|', '/', '-', '\\'];

// Gamma-distributed random sleep
function gammavariate(shape, scale) {
  // Marsaglia and Tsang's method
  if (shape < 1) {
    return gammavariate(shape + 1, scale) * Math.pow(Math.random(), 1 / shape);
  }
  const d = shape - 1 / 3;
  const c = 1 / Math.sqrt(9 * d);
  while (true) {
    let x, v;
    do {
      x = normalRandom();
      v = 1 + c * x;
    } while (v <= 0);
    v = v * v * v;
    const u = Math.random();
    if (u < 1 - 0.0331 * (x * x) * (x * x)) return d * v * scale;
    if (Math.log(u) < 0.5 * x * x + d * (1 - v + Math.log(v))) return d * v * scale;
  }
}

function normalRandom() {
  let u = 0, v = 0;
  while (u === 0) u = Math.random();
  while (v === 0) v = Math.random();
  return Math.sqrt(-2.0 * Math.log(u)) * Math.cos(2.0 * Math.PI * v);
}

function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

function sleepInterval() {
  const interval = (gammavariate(RESERVE_INTERVAL_SHAPE, RESERVE_INTERVAL_SCALE) + RESERVE_INTERVAL_MIN) * 1000;
  return sleep(interval);
}

// Telegram
async function sendTelegram(text) {
  const token = config.get('telegram.token');
  const chatId = config.get('telegram.chatId');
  if (token && chatId) {
    try {
      const bot = new TelegramBot(token);
      await bot.sendMessage(chatId, text);
    } catch (e) {
      console.error('텔레그램 전송 실패:', e.message);
    }
  }
}

// Station helpers
function getStation(railType) {
  const stations = STATIONS[railType];
  const stationKey = config.get(`${railType}.station`);
  if (!stationKey) return { stations, selected: DEFAULT_STATIONS[railType] };
  return { stations, selected: stationKey.split(',') };
}

// Options
function getOptions() {
  const options = config.get('SRT.options') || '';
  return options ? options.split(',') : [];
}

// Login
async function login(railType, debug = false) {
  const id = config.get(`${railType}.id`);
  const pw = config.get(`${railType}.pass`);
  if (!id || !pw) {
    await setLogin(railType, debug);
    return login(railType, debug);
  }
  try {
    const RailClass = railType === 'SRT' ? SRT : Korail;
    const rail = new RailClass(id, pw, { autoLogin: true, verbose: debug });
    await rail.init();
    if (!rail.isLogin) {
      console.log(chalk.yellow(`\n${railType} 로그인 실패. 다시 로그인 설정을 해주세요.`));
      config.delete(`${railType}.ok`);
      await setLogin(railType, debug);
      return login(railType, debug);
    }
    return rail;
  } catch (err) {
    console.log(chalk.red(`\n${railType} 로그인 중 오류 발생!`));
    console.error(chalk.yellow(`에러: ${err.message}`));
    if (debug && err.stack) {
      console.error(chalk.gray(err.stack));
    }
    config.delete(`${railType}.ok`);
    await setLogin(railType, debug);
    return login(railType, debug);
  }
}

// Menu functions
async function setStation(railType) {
  const { stations, selected } = getStation(railType);
  const { stationList } = await inquirer.prompt([{
    type: 'checkbox',
    name: 'stationList',
    message: '역 선택 (Space: 선택, Enter: 완료)',
    choices: stations,
    default: selected,
    pageSize: 15,
  }]);

  if (!stationList.length) {
    console.log('선택된 역이 없습니다.');
    return false;
  }
  config.set(`${railType}.station`, stationList.join(','));
  console.log(`선택된 역: ${stationList.join(',')}`);
  return true;
}

async function editStation(railType) {
  const current = config.get(`${railType}.station`) || '';
  const { stationText } = await inquirer.prompt([{
    type: 'input',
    name: 'stationText',
    message: '역 수정 (예: 수서,대전,동대구)',
    default: current,
  }]);

  if (!stationText) {
    console.log('선택된 역이 없습니다.');
    return false;
  }
  const selected = stationText.split(',').map(s => s.trim());
  const hangul = /[가-힣]+/;
  for (const station of selected) {
    if (!hangul.test(station)) {
      console.log(`'${station}'는 잘못된 입력입니다. 기본 역으로 설정합니다.`);
      config.set(`${railType}.station`, DEFAULT_STATIONS[railType].join(','));
      return false;
    }
  }
  config.set(`${railType}.station`, selected.join(','));
  console.log(`선택된 역: ${selected.join(',')}`);
  return true;
}

async function setOptions() {
  const defaultOptions = getOptions();
  const { options } = await inquirer.prompt([{
    type: 'checkbox',
    name: 'options',
    message: '예매 옵션 선택 (Space: 선택, Enter: 완료)',
    choices: [
      { name: '어린이', value: 'child' },
      { name: '경로우대', value: 'senior' },
      { name: '중증장애인', value: 'disability1to3' },
      { name: '경증장애인', value: 'disability4to6' },
      { name: 'KTX만', value: 'ktx' },
    ],
    default: defaultOptions,
  }]);
  config.set('SRT.options', options.join(','));
}

async function setTelegram() {
  const token = config.get('telegram.token') || '';
  const chatId = config.get('telegram.chatId') || '';

  const answers = await inquirer.prompt([
    { type: 'input', name: 'token', message: '텔레그램 token', default: token },
    { type: 'input', name: 'chatId', message: '텔레그램 chat_id', default: chatId },
  ]);

  try {
    config.set('telegram.ok', '1');
    config.set('telegram.token', answers.token);
    config.set('telegram.chatId', answers.chatId);
    await sendTelegram('[SRTGO] 텔레그램 설정 완료');
    console.log('텔레그램 설정이 완료되었습니다.');
    return true;
  } catch (err) {
    console.error(err);
    config.delete('telegram.ok');
    return false;
  }
}

async function setCard() {
  const cardInfo = {
    number: config.get('card.number') || '',
    password: config.get('card.password') || '',
    birthday: config.get('card.birthday') || '',
    expire: config.get('card.expire') || '',
  };

  const hasSaved = (field) => cardInfo[field] ? ' (저장됨, Enter로 유지)' : '';

  const answers = await inquirer.prompt([
    { type: 'password', name: 'number', message: `신용카드 번호 (하이픈 제외)${hasSaved('number')}`, mask: '*' },
    { type: 'password', name: 'password', message: `카드 비밀번호 앞 2자리${hasSaved('password')}`, mask: '*' },
    { type: 'password', name: 'birthday', message: `생년월일 (YYMMDD) / 사업자등록번호${hasSaved('birthday')}`, mask: '*' },
    { type: 'password', name: 'expire', message: `카드 유효기간 (YYMM)${hasSaved('expire')}`, mask: '*' },
  ]);

  // 입력되지 않은 필드는 기존 값 유지
  for (const [key, value] of Object.entries(answers)) {
    if (value || !cardInfo[key]) {
      config.set(`card.${key}`, value);
    }
  }
  config.set('card.ok', '1');
  console.log(chalk.green('카드 정보가 저장되었습니다.'));
}

async function payCard(rail, reservation, debug = false) {
  if (config.get('card.ok')) {
    const birthday = config.get('card.birthday');
    try {
      return await rail.payWithCard(
        reservation,
        config.get('card.number'),
        config.get('card.password'),
        birthday,
        config.get('card.expire'),
        0,
        birthday.length === 6 ? 'J' : 'S'
      );
    } catch (e) {
      console.log(chalk.red('결제 실패!'));
      console.error(chalk.yellow(`에러: ${e.message}`));
      if (debug && e.stack) {
        console.error(chalk.gray(e.stack));
      }
      return false;
    }
  }
  return false;
}

async function setLogin(railType = 'SRT', debug = false) {
  const credentials = {
    id: config.get(`${railType}.id`) || '',
    pass: config.get(`${railType}.pass`) || '',
  };

  const answers = await inquirer.prompt([
    { type: 'input', name: 'id', message: `${railType} 계정 아이디 (멤버십 번호, 이메일, 전화번호)`, default: credentials.id },
    { type: 'password', name: 'pass', message: `${railType} 계정 패스워드${credentials.pass ? ' (저장됨, Enter로 유지)' : ''}`, mask: '*' },
  ]);

  // 비밀번호가 입력되지 않았으면 기존 값 사용
  if (!answers.pass && credentials.pass) {
    answers.pass = credentials.pass;
  }

  try {
    const RailClass = railType === 'SRT' ? SRT : Korail;
    const rail = new RailClass(answers.id, answers.pass, { autoLogin: true, verbose: debug });
    await rail.init();

    if (rail.isLogin) {
      config.set(`${railType}.id`, answers.id);
      config.set(`${railType}.pass`, answers.pass);
      config.set(`${railType}.ok`, '1');
      console.log(chalk.green(`\n${railType} 로그인 성공!`));
      return true;
    } else {
      console.log(chalk.red(`\n${railType} 로그인 실패: 아이디 또는 비밀번호를 확인해주세요.`));
      config.delete(`${railType}.ok`);
      return false;
    }
  } catch (err) {
    console.log(chalk.red(`\n${railType} 로그인 실패!`));
    console.error(chalk.yellow(`에러: ${err.message}`));
    if (debug && err.stack) {
      console.error(chalk.gray(err.stack));
    }
    config.delete(`${railType}.ok`);
    return false;
  }
}

// Format date helpers
function formatDate(d) {
  return `${d.getFullYear()}${String(d.getMonth() + 1).padStart(2, '0')}${String(d.getDate()).padStart(2, '0')}`;
}

function formatTime(d) {
  return `${String(d.getHours()).padStart(2, '0')}${String(d.getMinutes()).padStart(2, '0')}${String(d.getSeconds()).padStart(2, '0')}`;
}

// Reserve function
async function reserve(railType = 'SRT', debug = false) {
  let rail = await login(railType, debug);
  const isSrt = railType === 'SRT';

  const now = new Date(Date.now() + 10 * 60 * 1000);
  const today = formatDate(now);
  const thisTime = formatTime(now);

  let departure = config.get(`${railType}.departure`) || (isSrt ? '수서' : '서울');
  let arrival = config.get(`${railType}.arrival`) || '동대구';
  if (departure === arrival) {
    arrival = departure === '수서' || departure === '서울' ? '동대구' : null;
    departure = arrival ? departure : (isSrt ? '수서' : '서울');
  }

  const defaults = {
    departure,
    arrival,
    date: config.get(`${railType}.date`) || today,
    time: config.get(`${railType}.time`) || '120000',
    adult: parseInt(config.get(`${railType}.adult`) || '1'),
    child: parseInt(config.get(`${railType}.child`) || '0'),
    senior: parseInt(config.get(`${railType}.senior`) || '0'),
    disability1to3: parseInt(config.get(`${railType}.disability1to3`) || '0'),
    disability4to6: parseInt(config.get(`${railType}.disability4to6`) || '0'),
  };

  const { selected: stationKeys } = getStation(railType);
  const options = getOptions();

  // Date choices (next 28 days)
  const dateChoices = [];
  for (let i = 0; i < 28; i++) {
    const d = new Date(now.getTime() + i * 24 * 60 * 60 * 1000);
    const days = ['일', '월', '화', '수', '목', '금', '토'];
    const label = `${d.getFullYear()}/${String(d.getMonth() + 1).padStart(2, '0')}/${String(d.getDate()).padStart(2, '0')} ${days[d.getDay()]}`;
    dateChoices.push({ name: label, value: formatDate(d) });
  }

  // Time choices
  const timeChoices = [];
  for (let h = 0; h < 24; h++) {
    timeChoices.push({ name: String(h).padStart(2, '0'), value: `${String(h).padStart(2, '0')}0000` });
  }

  const passengerTypes = {
    child: '어린이',
    senior: '경로우대',
    disability1to3: '1~3급 장애인',
    disability4to6: '4~6급 장애인',
  };

  // Build questions
  const questions = [
    { type: 'list', name: 'departure', message: '출발역 선택', choices: stationKeys, default: defaults.departure, pageSize: 10 },
    { type: 'list', name: 'arrival', message: '도착역 선택', choices: stationKeys, default: defaults.arrival, pageSize: 10 },
    { type: 'list', name: 'date', message: '출발 날짜 선택', choices: dateChoices, default: defaults.date, pageSize: 10 },
    { type: 'list', name: 'time', message: '출발 시각 선택', choices: timeChoices, default: defaults.time, pageSize: 10 },
    { type: 'list', name: 'adult', message: '성인 승객수', choices: [...Array(10).keys()], default: defaults.adult },
  ];

  for (const [key, label] of Object.entries(passengerTypes)) {
    if (options.includes(key)) {
      questions.push({
        type: 'list', name: key, message: `${label} 승객수`,
        choices: [...Array(10).keys()], default: defaults[key],
      });
    }
  }

  const info = await inquirer.prompt(questions);

  if (info.departure === info.arrival) {
    console.log(chalk.red.bgGreen('출발역과 도착역이 같습니다') + '\n');
    return;
  }

  // Save preferences
  for (const [key, value] of Object.entries(info)) {
    config.set(`${railType}.${key}`, String(value));
  }

  // Adjust time
  if (info.date === today && parseInt(info.time) < parseInt(thisTime)) {
    info.time = thisTime;
  }

  // Build passengers
  const passengerClasses = isSrt
    ? { adult: Adult, child: Child, senior: Senior, disability1to3: Disability1To3, disability4to6: Disability4To6 }
    : { adult: AdultPassenger, child: ChildPassenger, senior: SeniorPassenger, disability1to3: Disability1To3Passenger, disability4to6: Disability4To6Passenger };

  const PASSENGER_TYPE = {
    [isSrt ? 'Adult' : 'AdultPassenger']: '어른/청소년',
    [isSrt ? 'Child' : 'ChildPassenger']: '어린이',
    [isSrt ? 'Senior' : 'SeniorPassenger']: '경로우대',
    [isSrt ? 'Disability1To3' : 'Disability1To3Passenger']: '1~3급 장애인',
    [isSrt ? 'Disability4To6' : 'Disability4To6Passenger']: '4~6급 장애인',
  };

  const passengers = [];
  let totalCount = 0;
  for (const [key, Cls] of Object.entries(passengerClasses)) {
    const count = info[key] || 0;
    if (count > 0) {
      passengers.push(new Cls(count));
      totalCount += count;
    }
  }

  if (!passengers.length) {
    console.log(chalk.red.bgGreen('승객수는 0이 될 수 없습니다') + '\n');
    return;
  }

  if (totalCount >= 10) {
    console.log(chalk.red.bgGreen('승객수는 10명을 초과할 수 없습니다') + '\n');
    return;
  }

  const passengerMsg = passengers.map(p => `${PASSENGER_TYPE[p.constructor.name] || p.constructor.name} ${p.count}명`);
  console.log(passengerMsg.join(', '));

  // Search for trains
  const searchParams = {
    dep: info.departure,
    arr: info.arrival,
    date: info.date,
    time: info.time,
    passengers: [new passengerClasses.adult(totalCount)],
  };

  if (isSrt) {
    searchParams.availableOnly = false;
  } else {
    searchParams.includeNoSeats = true;
    if (options.includes('ktx')) searchParams.trainType = TrainType.KTX;
  }

  let trains;
  try {
    trains = await rail.searchTrain(
      searchParams.dep, searchParams.arr, searchParams.date, searchParams.time,
      isSrt
        ? { passengers: searchParams.passengers, availableOnly: searchParams.availableOnly }
        : { passengers: searchParams.passengers, includeNoSeats: searchParams.includeNoSeats, trainType: searchParams.trainType }
    );
  } catch (e) {
    console.log(chalk.red('열차 검색 실패: 예약 가능한 열차가 없습니다'));
    console.error(chalk.yellow(`에러: ${e.message}`));
    if (debug && e.stack) {
      console.error(chalk.gray(e.stack));
    }
    return;
  }

  if (!trains || !trains.length) {
    console.log(chalk.red.bgGreen('예약 가능한 열차가 없습니다') + '\n');
    return;
  }

  // Decorate train names
  function trainDecorator(train) {
    let msg = train.toString();
    return msg.replace(/예약가능/g, chalk.green('가능'))
      .replace(/가능/g, chalk.green('가능'))
      .replace(/신청하기/g, chalk.green('가능'));
  }

  // Train selection
  const trainChoices = trains.map((t, i) => ({ name: trainDecorator(t), value: i }));
  const { selectedTrains } = await inquirer.prompt([{
    type: 'checkbox',
    name: 'selectedTrains',
    message: '예약할 열차 선택 (Space: 선택, Enter: 완료)',
    choices: trainChoices,
    pageSize: 15,
  }]);

  if (!selectedTrains || !selectedTrains.length) {
    console.log(chalk.red.bgGreen('선택한 열차가 없습니다!') + '\n');
    return;
  }

  // Seat type preference
  const seatTypeEnum = isSrt ? SeatType : ReserveOption;
  const { seatType, pay } = await inquirer.prompt([
    {
      type: 'list', name: 'seatType', message: '선택 유형',
      choices: [
        { name: '일반실 우선', value: isSrt ? seatTypeEnum.GENERAL_FIRST : seatTypeEnum.GENERAL_FIRST },
        { name: '일반실만', value: isSrt ? seatTypeEnum.GENERAL_ONLY : seatTypeEnum.GENERAL_ONLY },
        { name: '특실 우선', value: isSrt ? seatTypeEnum.SPECIAL_FIRST : seatTypeEnum.SPECIAL_FIRST },
        { name: '특실만', value: isSrt ? seatTypeEnum.SPECIAL_ONLY : seatTypeEnum.SPECIAL_ONLY },
      ],
    },
    { type: 'confirm', name: 'pay', message: '예매 시 카드 결제', default: false },
  ]);

  // Reserve function
  async function doReserve(train) {
    const reserve = await rail.reserve(train, passengers, seatType);
    let msg = reserve.toString();
    if (reserve.tickets && reserve.tickets.length) {
      msg += '\n' + reserve.tickets.map(t => t.toString()).join('\n');
    }
    console.log(chalk.green(`\n\n🎫 🎉 예매 성공!!! 🎉 🎫\n${msg}\n`));

    if (pay && !reserve.isWaiting) {
      const paid = await payCard(rail, reserve, debug);
      if (paid) {
        console.log(chalk.green.bgRed('\n\n💳 ✨ 결제 성공!!! ✨ 💳\n\n'));
        msg += '\n결제 완료';
      }
    }
    await sendTelegram(msg);
  }

  // Check seat availability
  function isSeatAvailable(train, seatTypeOption) {
    if (isSrt) {
      if (!train.seatAvailable()) return train.reserveStandbyAvailable();
      if (seatTypeOption === SeatType.GENERAL_FIRST || seatTypeOption === SeatType.SPECIAL_FIRST) return train.seatAvailable();
      if (seatTypeOption === SeatType.GENERAL_ONLY) return train.generalSeatAvailable();
      return train.specialSeatAvailable();
    } else {
      if (!train.hasSeat()) return train.hasWaitingList();
      if (seatTypeOption === ReserveOption.GENERAL_FIRST || seatTypeOption === ReserveOption.SPECIAL_FIRST) return train.hasSeat();
      if (seatTypeOption === ReserveOption.GENERAL_ONLY) return train.hasGeneralSeat();
      return train.hasSpecialSeat();
    }
  }

  // Handle error
  async function handleError(ex, msg = null) {
    const errMsg = msg || `\nException: ${ex}, Type: ${ex.constructor.name}, Message: ${ex.msg || ex.message || 'No message'}`;
    console.log(errMsg);
    await sendTelegram(errMsg);
    const { cont } = await inquirer.prompt([{ type: 'confirm', name: 'cont', message: '계속할까요', default: true }]);
    return cont;
  }

  // Reservation loop
  let iTry = 0;
  const startTime = Date.now();
  while (true) {
    try {
      iTry++;
      const elapsed = Math.floor((Date.now() - startTime) / 1000);
      const hours = String(Math.floor(elapsed / 3600)).padStart(2, '0');
      const minutes = String(Math.floor((elapsed % 3600) / 60)).padStart(2, '0');
      const seconds = String(elapsed % 60).padStart(2, '0');
      process.stdout.write(`\r예매 대기 중... ${WAITING_BAR[iTry & 3]} ${String(iTry).padStart(4)} (${hours}:${minutes}:${seconds}) `);

      trains = await rail.searchTrain(
        searchParams.dep, searchParams.arr, searchParams.date, searchParams.time,
        isSrt
          ? { passengers: searchParams.passengers, availableOnly: searchParams.availableOnly }
          : { passengers: searchParams.passengers, includeNoSeats: searchParams.includeNoSeats, trainType: searchParams.trainType }
      );

      for (const i of selectedTrains) {
        if (isSeatAvailable(trains[i], seatType)) {
          await doReserve(trains[i]);
          return;
        }
      }
      await sleepInterval();

    } catch (ex) {
      if (ex instanceof SRTError) {
        const msg = ex.msg || '';
        if (msg.includes('정상적인 경로로 접근 부탁드립니다') || ex instanceof SRTNetFunnelError) {
          if (debug) console.log(`\nException: ${ex}\nType: ${ex.constructor.name}\nMessage: ${msg}`);
          rail.clear();
        } else if (msg.includes('로그인 후 사용하십시오')) {
          if (debug) console.log(`\nException: ${ex}\nType: ${ex.constructor.name}\nMessage: ${msg}`);
          rail = await login(railType, debug);
          if (!rail.isLogin && !(await handleError(ex))) return;
        } else if (!['잔여석없음', '사용자가 많아 접속이 원활하지 않습니다', '예약대기 접수가 마감되었습니다', '예약대기자한도수초과'].some(e => msg.includes(e))) {
          if (!(await handleError(ex))) return;
        }
        await sleepInterval();
      } else if (ex instanceof KorailError) {
        const msg = ex.msg || '';
        if (msg.includes('Need to Login')) {
          rail = await login(railType, debug);
          if (!rail.isLogin && !(await handleError(ex))) return;
        } else if (!['Sold out', '잔여석없음', '예약대기자한도수초과'].some(e => msg.includes(e))) {
          if (!(await handleError(ex))) return;
        }
        await sleepInterval();
      } else if (ex.name === 'SyntaxError' || ex.message?.includes('JSON')) {
        if (debug) console.log(`\nJSON parse error: ${ex.message}`);
        await sleepInterval();
        rail = await login(railType, debug);
      } else if (ex.code === 'ECONNRESET' || ex.code === 'ETIMEDOUT' || ex.message?.includes('fetch')) {
        if (!(await handleError(ex, '연결이 끊겼습니다'))) return;
        rail = await login(railType, debug);
      } else {
        if (debug) console.log('\nUndefined exception');
        if (!(await handleError(ex))) return;
        rail = await login(railType, debug);
      }
    }
  }
}

// Check reservation
async function checkReservation(railType = 'SRT', debug = false) {
  const rail = await login(railType, debug);
  const isSrt = railType === 'SRT';

  while (true) {
    let reservations, tickets;
    try {
      reservations = isSrt ? await rail.getReservations() : await rail.reservations();
      tickets = isSrt ? [] : await rail.tickets();
    } catch (e) {
      console.log(chalk.red('예약 내역을 가져오는데 실패했습니다'));
      console.error(chalk.yellow(`에러: ${e.message}`));
      if (debug && e.stack) {
        console.error(chalk.gray(e.stack));
      }
      return;
    }

    const allReservations = [];
    for (const t of tickets) {
      t.isTicket = true;
      allReservations.push(t);
    }
    for (const r of reservations) {
      r.isTicket = r.paid || false;
      allReservations.push(r);
    }

    if (!reservations.length && !tickets.length) {
      console.log(chalk.red.bgGreen('예약 내역이 없습니다') + '\n');
      return;
    }

    const choices = allReservations.map((r, i) => ({ name: r.toString(), value: i }));
    choices.push({ name: '텔레그램으로 예매 정보 전송', value: -2 });
    choices.push({ name: '돌아가기', value: -1 });

    const { choice } = await inquirer.prompt([{
      type: 'list', name: 'choice', message: '예약 취소 (Enter: 결정)', choices, pageSize: 15,
    }]);

    if (choice === -1 || choice == null) return;

    if (choice === -2) {
      const out = ['[ 예매 내역 ]'];
      for (const r of allReservations) {
        out.push(`🚅${r.toString()}`);
        if (isSrt && r.tickets) out.push(...r.tickets.map(t => t.toString()));
      }
      await sendTelegram(out.join('\n'));
      return;
    }

    const selectedReservation = allReservations[choice];
    if (!selectedReservation.isTicket && !selectedReservation.isWaiting) {
      const { action } = await inquirer.prompt([{
        type: 'list', name: 'action', message: `결재 대기 승차권: ${selectedReservation.toString()}`,
        choices: [{ name: '결제하기', value: 1 }, { name: '취소하기', value: 2 }],
      }]);

      if (action === 1) {
        const paid = await payCard(rail, selectedReservation, debug);
        if (paid) console.log(chalk.green.bgRed('\n\n💳 ✨ 결제 성공!!! ✨ 💳\n\n'));
      } else if (action === 2) {
        try {
          await rail.cancel(selectedReservation);
          console.log(chalk.green('예약이 취소되었습니다.'));
        } catch (e) {
          console.log(chalk.red('예약 취소 실패!'));
          console.error(chalk.yellow(`에러: ${e.message}`));
          if (debug && e.stack) console.error(chalk.gray(e.stack));
        }
      }
      return;
    }

    const { confirm } = await inquirer.prompt([{
      type: 'confirm', name: 'confirm', message: chalk.red.bgGreen('정말 취소하시겠습니까'), default: false,
    }]);

    if (confirm) {
      try {
        if (selectedReservation.isTicket) {
          await rail.refund(selectedReservation);
        } else {
          await rail.cancel(selectedReservation);
        }
        console.log(chalk.green('처리가 완료되었습니다.'));
      } catch (e) {
        console.log(chalk.red('처리 중 오류가 발생했습니다!'));
        console.error(chalk.yellow(`에러: ${e.message}`));
        if (debug && e.stack) console.error(chalk.gray(e.stack));
      }
      return;
    }
  }
}

// Main menu
async function main(options) {
  const debug = options.debug || false;

  const MENU_CHOICES = [
    { name: '예매 시작', value: 1 },
    { name: '예매 확인/결제/취소', value: 2 },
    { name: '로그인 설정', value: 3 },
    { name: '텔레그램 설정', value: 4 },
    { name: '카드 설정', value: 5 },
    { name: '역 설정', value: 6 },
    { name: '역 직접 수정', value: 7 },
    { name: '예매 옵션 설정', value: 8 },
    { name: '나가기', value: -1 },
  ];

  const RAIL_CHOICES = [
    { name: chalk.red('SRT'), value: 'SRT' },
    { name: chalk.cyan('KTX'), value: 'KTX' },
    { name: '취소', value: -1 },
  ];

  while (true) {
    const { choice } = await inquirer.prompt([{
      type: 'list', name: 'choice', message: '메뉴 선택 (↕:이동, Enter: 선택)',
      choices: MENU_CHOICES, pageSize: 10,
    }]);

    if (choice === -1) break;

    let railType = null;
    if ([1, 2, 3, 6, 7].includes(choice)) {
      const { rail } = await inquirer.prompt([{
        type: 'list', name: 'rail', message: '열차 선택 (↕:이동, Enter: 선택)',
        choices: RAIL_CHOICES,
      }]);
      if (rail === -1 || rail == null) continue;
      railType = rail;
    }

    try {
      switch (choice) {
        case 1: await reserve(railType, debug); break;
        case 2: await checkReservation(railType, debug); break;
        case 3: await setLogin(railType, debug); break;
        case 4: await setTelegram(); break;
        case 5: await setCard(); break;
        case 6: await setStation(railType); break;
        case 7: await editStation(railType); break;
        case 8: await setOptions(); break;
      }
    } catch (e) {
      if (e.name === 'ExitPromptError' || e.message?.includes('User force closed')) {
        // User pressed Ctrl+C
        continue;
      }
      console.log(chalk.red('\n오류가 발생했습니다!'));
      console.error(chalk.yellow(`에러: ${e.message}`));
      if (debug && e.stack) console.error(chalk.gray(e.stack));
    }
  }
}

// CLI setup
program
  .name('srtgo')
  .description('SRTgo: K-Train Reservation Helper')
  .version('1.0.0')
  .option('--debug', 'Debug mode')
  .action(main);

program.parse();
