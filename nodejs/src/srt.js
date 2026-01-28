/**
 * SRT (Super Rapid Train) client module
 * Ported from Python srt.py
 */

import fetch from 'node-fetch';
import { URLSearchParams } from 'url';

// Constants
const EMAIL_REGEX = /[^@]+@[^@]+\.[^@]+/;
const PHONE_NUMBER_REGEX = /(\d{3})-(\d{3,4})-(\d{4})/;

const USER_AGENT =
  'Mozilla/5.0 (Linux; Android 14; SM-S912N Build/UP1A.231005.007; wv) AppleWebKit/537.36' +
  '(KHTML, like Gecko) Version/4.0 Chrome/131.0.6778.260 Mobile Safari/537.36SRT-APP-Android V.2.0.33';

const DEFAULT_HEADERS = {
  'User-Agent': USER_AGENT,
  Accept: 'application/json',
};

const RESERVE_JOBID = {
  PERSONAL: '1101',
  STANDBY: '1102',
};

export const STATION_CODE = {
  '수서': '0551', '동탄': '0552', '평택지제': '0553', '경주': '0508',
  '곡성': '0049', '공주': '0514', '광주송정': '0036', '구례구': '0050',
  '김천(구미)': '0507', '나주': '0037', '남원': '0048', '대전': '0010',
  '동대구': '0015', '마산': '0059', '목포': '0041', '밀양': '0017',
  '부산': '0020', '서대구': '0506', '순천': '0051', '여수EXPO': '0053',
  '여천': '0139', '오송': '0297', '울산(통도사)': '0509', '익산': '0030',
  '전주': '0045', '정읍': '0033', '진영': '0056', '진주': '0063',
  '창원': '0057', '창원중앙': '0512', '천안아산': '0502', '포항': '0515',
};

const STATION_NAME = Object.fromEntries(
  Object.entries(STATION_CODE).map(([name, code]) => [code, name])
);

const TRAIN_NAME = {
  '00': 'KTX', '02': '무궁화', '03': '통근열차', '04': '누리로',
  '05': '전체', '07': 'KTX-산천', '08': 'ITX-새마을', '09': 'ITX-청춘',
  '10': 'KTX-산천', '17': 'SRT', '18': 'ITX-마음',
};

const WINDOW_SEAT = { null: '000', true: '012', false: '013' };

const SRT_MOBILE = 'https://app.srail.or.kr:443';
const API_ENDPOINTS = {
  main: `${SRT_MOBILE}/main/main.do`,
  login: `${SRT_MOBILE}/apb/selectListApb01080_n.do`,
  logout: `${SRT_MOBILE}/login/loginOut.do`,
  search_schedule: `${SRT_MOBILE}/ara/selectListAra10007_n.do`,
  reserve: `${SRT_MOBILE}/arc/selectListArc05013_n.do`,
  tickets: `${SRT_MOBILE}/atc/selectListAtc14016_n.do`,
  ticket_info: `${SRT_MOBILE}/ard/selectListArd02019_n.do`,
  cancel: `${SRT_MOBILE}/ard/selectListArd02045_n.do`,
  standby_option: `${SRT_MOBILE}/ata/selectListAta01135_n.do`,
  payment: `${SRT_MOBILE}/ata/selectListAta09036_n.do`,
  reserve_info: `${SRT_MOBILE}/atc/getListAtc14087.do`,
  reserve_info_referer: `${SRT_MOBILE}/common/ATC/ATC0201L/view.do?pnrNo=`,
  refund: `${SRT_MOBILE}/atc/selectListAtc02063_n.do`,
};

// Errors
export class SRTError extends Error {
  constructor(msg) {
    super(msg);
    this.msg = msg;
    this.name = 'SRTError';
  }
}

export class SRTLoginError extends SRTError {
  constructor(msg) { super(msg); this.name = 'SRTLoginError'; }
}

export class SRTResponseError extends SRTError {
  constructor(msg) { super(msg); this.name = 'SRTResponseError'; }
}

export class SRTDuplicateError extends SRTResponseError {
  constructor(msg) { super(msg); this.name = 'SRTDuplicateError'; }
}

export class SRTNotLoggedInError extends SRTError {
  constructor(msg = 'Not logged in') { super(msg); this.name = 'SRTNotLoggedInError'; }
}

export class SRTNetFunnelError extends SRTError {
  constructor(msg) { super(msg); this.name = 'SRTNetFunnelError'; }
}

// Passenger classes
export class Passenger {
  constructor(name, typeCode, count) {
    this.name = name;
    this.typeCode = typeCode;
    this.count = count;
  }

  toString() {
    return `${this.name} ${this.count}명`;
  }

  static combine(passengers) {
    const map = new Map();
    for (const p of passengers) {
      const key = p.constructor.name;
      if (map.has(key)) {
        map.get(key).count += p.count;
      } else {
        map.set(key, new p.constructor(p.count));
      }
    }
    return [...map.values()].filter(p => p.count > 0);
  }

  static totalCount(passengers) {
    return String(passengers.reduce((sum, p) => sum + p.count, 0));
  }

  static getPassengerDict(passengers, specialSeat = false, windowSeat = null) {
    const combined = Passenger.combine(passengers);
    const data = {
      totPrnb: Passenger.totalCount(combined),
      psgGridcnt: String(combined.length),
      locSeatAttCd1: WINDOW_SEAT[String(windowSeat)] || '000',
      rqSeatAttCd1: '015',
      dirSeatAttCd1: '009',
      smkSeatAttCd1: '000',
      etcSeatAttCd1: '000',
      psrmClCd1: specialSeat ? '2' : '1',
    };
    combined.forEach((p, i) => {
      data[`psgTpCd${i + 1}`] = p.typeCode;
      data[`psgInfoPerPrnb${i + 1}`] = String(p.count);
    });
    return data;
  }
}

export class Adult extends Passenger {
  constructor(count = 1) { super('어른/청소년', '1', count); }
}
export class Child extends Passenger {
  constructor(count = 1) { super('어린이', '5', count); }
}
export class Senior extends Passenger {
  constructor(count = 1) { super('경로', '4', count); }
}
export class Disability1To3 extends Passenger {
  constructor(count = 1) { super('장애 1~3급', '2', count); }
}
export class Disability4To6 extends Passenger {
  constructor(count = 1) { super('장애 4~6급', '3', count); }
}

// SeatType enum
export const SeatType = {
  GENERAL_FIRST: 1,
  GENERAL_ONLY: 2,
  SPECIAL_FIRST: 3,
  SPECIAL_ONLY: 4,
};

// SRTTicket
export class SRTTicket {
  static SEAT_TYPE = { '1': '일반실', '2': '특실' };
  static DISCOUNT_TYPE = {
    '000': '어른/청소년', '101': '탄력운임기준할인', '105': '자유석 할인',
    '106': '입석 할인', '107': '역방향석 할인', '108': '출입구석 할인',
    '109': '가족석 일반전환 할인', '111': '구간별 특정운임', '112': '열차별 특정운임',
    '201': '어린이', '204': '경로', '205': '1~3급 장애인', '206': '4~6급 장애인',
  };

  constructor(data) {
    this.car = data.scarNo;
    this.seat = data.seatNo;
    this.seatTypeCode = data.psrmClCd;
    this.seatType = SRTTicket.SEAT_TYPE[this.seatTypeCode];
    this.passengerTypeCode = data.dcntKndCd;
    this.passengerType = SRTTicket.DISCOUNT_TYPE[this.passengerTypeCode] || '기타 할인';
    this.price = parseInt(data.rcvdAmt);
    this.originalPrice = parseInt(data.stdrPrc);
    this.discount = parseInt(data.dcntPrc);
    this.isWaiting = this.seat === '';
  }

  toString() {
    if (this.isWaiting) {
      return `예약대기 (${this.seatType}) ${this.passengerType}[${this.price}원(${this.discount}원 할인)]`;
    }
    return `${this.car}호차 ${this.seat} (${this.seatType}) ${this.passengerType} [${this.price}원(${this.discount}원 할인)]`;
  }
}

// SRTReservation
export class SRTReservation {
  constructor(train, pay, tickets) {
    this.reservationNumber = train.pnrNo;
    this.totalCost = parseInt(train.rcvdAmt);
    this.seatCount = train.tkSpecNum || parseInt(train.seatNum);

    this.trainCode = pay.stlbTrnClsfCd;
    this.trainName = TRAIN_NAME[this.trainCode];
    this.trainNumber = pay.trnNo;

    this.depDate = pay.dptDt;
    this.depTime = pay.dptTm;
    this.depStationCode = pay.dptRsStnCd;
    this.depStationName = STATION_NAME[this.depStationCode];

    this.arrTime = pay.arvTm;
    this.arrStationCode = pay.arvRsStnCd;
    this.arrStationName = STATION_NAME[this.arrStationCode];

    this.paymentDate = pay.iseLmtDt;
    this.paymentTime = pay.iseLmtTm;
    this.paid = pay.stlFlg === 'Y';
    this.isRunning = !('tkSpecNum' in train);
    this.isWaiting = !(this.paid || this.paymentDate || this.paymentTime);

    this._tickets = tickets;
  }

  get tickets() { return this._tickets; }

  toString() {
    let base = `[${this.trainName}] ${this.depDate.slice(4, 6)}월 ${this.depDate.slice(6, 8)}일, ` +
      `${this.depStationName}~${this.arrStationName}` +
      `(${this.depTime.slice(0, 2)}:${this.depTime.slice(2, 4)}~${this.arrTime.slice(0, 2)}:${this.arrTime.slice(2, 4)}) ` +
      `${this.totalCost}원(${this.seatCount}석)`;

    if (!this.paid) {
      if (!this.isWaiting) {
        base += `, 구입기한 ${this.paymentDate.slice(4, 6)}월 ${this.paymentDate.slice(6, 8)}일 ` +
          `${this.paymentTime.slice(0, 2)}:${this.paymentTime.slice(2, 4)}`;
      } else if (!this.isRunning) {
        base += ', 예약대기';
      }
    }
    if (this.isRunning) base += ' (운행중)';
    return base;
  }
}

// SRTResponseData
class SRTResponseData {
  constructor(responseText) {
    this._json = JSON.parse(responseText);
    this._status = this._parse();
  }

  _parse() {
    if (this._json.resultMap) return this._json.resultMap[0];
    if (this._json.ErrorCode && this._json.ErrorMsg) {
      throw new SRTResponseError(`Undefined result status "[${this._json.ErrorCode}]: ${this._json.ErrorMsg}"`);
    }
    throw new SRTError(`Unexpected case [${JSON.stringify(this._json)}]`);
  }

  success() {
    const result = this._status.strResult;
    if (result == null) throw new SRTResponseError('Response status is not given');
    if (result === 'SUCC') return true;
    if (result === 'FAIL') return false;
    throw new SRTResponseError(`Undefined result status "${result}"`);
  }

  message() { return this._status.msgTxt || ''; }
  getAll() { return { ...this._json }; }
  getStatus() { return { ...this._status }; }
}

// SRTTrain
export class SRTTrain {
  constructor(data) {
    this.trainCode = data.stlbTrnClsfCd;
    this.trainName = TRAIN_NAME[this.trainCode];
    this.trainNumber = data.trnNo;

    this.depDate = data.dptDt;
    this.depTime = data.dptTm;
    this.depStationCode = data.dptRsStnCd;
    this.depStationName = STATION_NAME[this.depStationCode];
    this.depStationRunOrder = data.dptStnRunOrdr;
    this.depStationConstitutionOrder = data.dptStnConsOrdr;

    this.arrDate = data.arvDt;
    this.arrTime = data.arvTm;
    this.arrStationCode = data.arvRsStnCd;
    this.arrStationName = STATION_NAME[this.arrStationCode];
    this.arrStationRunOrder = data.arvStnRunOrdr;
    this.arrStationConstitutionOrder = data.arvStnConsOrdr;

    this.generalSeatState = data.gnrmRsvPsbStr;
    this.specialSeatState = data.sprmRsvPsbStr;
    this.reserveWaitPossibleName = data.rsvWaitPsbCdNm;
    this.reserveWaitPossibleCode = parseInt(data.rsvWaitPsbCd);
  }

  toString() {
    const depH = this.depTime.slice(0, 2), depM = this.depTime.slice(2, 4);
    const arrH = this.arrTime.slice(0, 2), arrM = this.arrTime.slice(2, 4);
    let duration = (parseInt(arrH) * 60 + parseInt(arrM)) - (parseInt(depH) * 60 + parseInt(depM));
    if (duration < 0) duration += 24 * 60;
    const month = this.depDate.slice(4, 6), day = this.depDate.slice(6, 8);
    const trainLine = `[${this.trainName} ${this.trainNumber}]`.padEnd(11);
    let msg = `${trainLine}${month}/${day} ${depH}:${depM}~${arrH}:${arrM}  ${this.depStationName}~${this.arrStationName}  특실 ${this.specialSeatState}, 일반실 ${this.generalSeatState}`;
    if (this.reserveWaitPossibleCode >= 0) msg += `, 예약대기 ${this.reserveWaitPossibleName}`;
    msg += ` (${String(duration).padStart(3)}분)`;
    return msg;
  }

  generalSeatAvailable() { return this.generalSeatState.includes('예약가능'); }
  specialSeatAvailable() { return this.specialSeatState.includes('예약가능'); }
  reserveStandbyAvailable() { return this.reserveWaitPossibleCode === 9; }
  seatAvailable() { return this.generalSeatAvailable() || this.specialSeatAvailable(); }
}

// NetFunnelHelper
class NetFunnelHelper {
  static WAIT_STATUS_PASS = '200';
  static WAIT_STATUS_FAIL = '201';
  static ALREADY_COMPLETED = '502';
  static OP_CODE = { getTidchkEnter: '5101', chkEnter: '5002', setComplete: '5004' };

  constructor(debug = false) {
    this._headers = {
      'User-Agent': USER_AGENT,
      Accept: '*/*',
      'Accept-Language': 'ko,en;q=0.9,en-US;q=0.8',
      'Cache-Control': 'no-cache',
      Connection: 'keep-alive',
      Pragma: 'no-cache',
      Referer: SRT_MOBILE,
    };
    this._cachedKey = null;
    this._lastFetchTime = 0;
    this._cacheTtl = 48;
    this.debug = debug;
  }

  async run() {
    const currentTime = Date.now() / 1000;
    if (this._isCacheValid(currentTime)) return this._cachedKey;

    try {
      let { status, key, nwait, ip } = await this._start();
      this._cachedKey = key;
      this._lastFetchTime = currentTime;

      while (status === NetFunnelHelper.WAIT_STATUS_FAIL) {
        process.stdout.write(`\r현재 ${nwait}명 대기중...`);
        await new Promise(r => setTimeout(r, 1000));
        ({ status, key, nwait, ip } = await this._check(ip));
        this._cachedKey = key;
      }

      const result = await this._complete(ip);
      if (result.status === NetFunnelHelper.WAIT_STATUS_PASS ||
          result.status === NetFunnelHelper.ALREADY_COMPLETED) {
        return this._cachedKey;
      }
      this.clear();
      throw new SRTNetFunnelError('Failed to complete NetFunnel');
    } catch (ex) {
      this.clear();
      throw new SRTNetFunnelError(String(ex));
    }
  }

  clear() {
    this._cachedKey = null;
    this._lastFetchTime = 0;
  }

  async _start() { return this._makeRequest('getTidchkEnter'); }
  async _check(ip) { return this._makeRequest('chkEnter', ip); }
  async _complete(ip) { return this._makeRequest('setComplete', ip); }

  async _makeRequest(opcode, ip) {
    const url = `https://${ip || 'nf.letskorail.com'}/ts.wseq`;
    const params = this._buildParams(NetFunnelHelper.OP_CODE[opcode]);
    const qs = new URLSearchParams(params).toString();
    const r = await fetch(`${url}?${qs}`, { headers: this._headers });
    const text = await r.text();
    if (this.debug) console.log(text);
    return this._parse(text);
  }

  _buildParams(opcode) {
    const params = {
      opcode,
      nfid: '0',
      prefix: `NetFunnel.gRtype=${opcode};`,
      js: 'true',
      [String(Date.now())]: '',
    };
    if (opcode === NetFunnelHelper.OP_CODE.getTidchkEnter ||
        opcode === NetFunnelHelper.OP_CODE.chkEnter) {
      params.sid = 'service_1';
      params.aid = 'act_10';
      if (opcode === NetFunnelHelper.OP_CODE.chkEnter) {
        params.key = this._cachedKey;
        params.ttl = '1';
      }
    } else if (opcode === NetFunnelHelper.OP_CODE.setComplete) {
      params.key = this._cachedKey;
    }
    return params;
  }

  _parse(response) {
    const match = response.match(/NetFunnel\.gControl\.result='([^']+)'/);
    if (!match) throw new SRTNetFunnelError('Failed to parse NetFunnel response');
    const [code, status, paramsStr] = match[1].split(':', 3);
    if (!paramsStr) throw new SRTNetFunnelError('Failed to parse NetFunnel response');
    const params = {};
    for (const part of paramsStr.split('&')) {
      if (part.includes('=')) {
        const [k, v] = part.split('=', 2);
        params[k] = v;
      }
    }
    params.code = code;
    params.status = status;
    return params;
  }

  _isCacheValid(currentTime) {
    return this._cachedKey && (currentTime - this._lastFetchTime) < this._cacheTtl;
  }
}

// Helper to build URLSearchParams from data object
function buildFormData(data) {
  const params = new URLSearchParams();
  for (const [k, v] of Object.entries(data)) {
    if (v != null) params.append(k, String(v));
  }
  return params;
}

// SRT class
export class SRT {
  constructor(srtId, srtPw, { autoLogin = true, verbose = false } = {}) {
    this._headers = { ...DEFAULT_HEADERS };
    this._cookies = {};
    this._netfunnel = new NetFunnelHelper(verbose);
    this.srtId = srtId;
    this.srtPw = srtPw;
    this.verbose = verbose;
    this.isLogin = false;
    this.membershipNumber = null;
    this.membershipName = null;
    this.phoneNumber = null;
    this._autoLogin = autoLogin;
  }

  async init() {
    if (this._autoLogin) await this.login();
    return this;
  }

  _log(msg) {
    if (this.verbose) console.log('[*] ' + msg);
  }

  _getCookieHeader() {
    return Object.entries(this._cookies).map(([k, v]) => `${k}=${v}`).join('; ');
  }

  _updateCookies(response) {
    const setCookies = response.headers.raw()['set-cookie'];
    if (setCookies) {
      for (const cookie of setCookies) {
        const [pair] = cookie.split(';');
        const [k, v] = pair.split('=', 2);
        this._cookies[k.trim()] = v.trim();
      }
    }
  }

  async _post(url, data) {
    const headers = {
      ...this._headers,
      'Content-Type': 'application/x-www-form-urlencoded',
      Cookie: this._getCookieHeader(),
    };
    const r = await fetch(url, {
      method: 'POST',
      headers,
      body: buildFormData(data),
      redirect: 'manual',
    });
    this._updateCookies(r);
    return r;
  }

  async login(srtId, srtPw) {
    srtId = srtId || this.srtId;
    srtPw = srtPw || this.srtPw;

    let loginType = '1';
    if (EMAIL_REGEX.test(srtId)) loginType = '2';
    else if (PHONE_NUMBER_REGEX.test(srtId)) {
      loginType = '3';
      srtId = srtId.replace(/-/g, '');
    }

    const data = {
      auto: 'Y', check: 'Y', page: 'menu', deviceKey: '-',
      customerYn: '', login_referer: API_ENDPOINTS.main,
      srchDvCd: loginType, srchDvNm: srtId, hmpgPwdCphd: srtPw,
    };

    const r = await this._post(API_ENDPOINTS.login, data);
    const text = await r.text();
    this._log(text);

    if (text.includes('존재하지않는 회원입니다')) throw new SRTLoginError(JSON.parse(text).MSG);
    if (text.includes('비밀번호 오류')) throw new SRTLoginError(JSON.parse(text).MSG);
    if (text.includes('Your IP Address Blocked')) throw new SRTLoginError(text.trim());

    this.isLogin = true;
    const userInfo = JSON.parse(text).userMap;
    this.membershipNumber = userInfo.MB_CRD_NO;
    this.membershipName = userInfo.CUST_NM;
    this.phoneNumber = userInfo.MBL_PHONE;

    console.log(`로그인 성공: ${this.membershipName} (멤버십번호: ${this.membershipNumber}, 전화번호: ${this.phoneNumber})`);
    return true;
  }

  async logout() {
    if (!this.isLogin) return true;
    await this._post(API_ENDPOINTS.logout, {});
    this.isLogin = false;
    this.membershipNumber = null;
    return true;
  }

  async searchTrain(dep, arr, date, time, { timeLimit, passengers, availableOnly = true } = {}) {
    if (!(dep in STATION_CODE) || !(arr in STATION_CODE)) {
      throw new Error(`Invalid station: "${dep}" or "${arr}"`);
    }

    const now = new Date();
    const today = _formatDate(now);
    date = date || today;
    if (date < today) throw new Error('Date cannot be before today');

    if (date === today) {
      const nowTime = _formatTime(now);
      time = time && time > nowTime ? time : nowTime;
    } else {
      time = time || '000000';
    }

    passengers = Passenger.combine(passengers || [new Adult()]);

    const data = {
      chtnDvCd: '1', dptDt: date, dptTm: time,
      dptDt1: date, dptTm1: time.slice(0, 2) + '0000',
      dptRsStnCd: STATION_CODE[dep], arvRsStnCd: STATION_CODE[arr],
      stlbTrnClsfCd: '05', trnGpCd: '109', trnNo: '',
      psgNum: Passenger.totalCount(passengers),
      seatAttCd: '015', arriveTime: 'N',
      tkDptDt: '', tkDptTm: '', tkTrnNo: '', tkTripChgFlg: '',
      dlayTnumAplFlg: 'Y',
      netfunnelKey: await this._netfunnel.run(),
    };

    const r = await this._post(API_ENDPOINTS.search_schedule, data);
    const text = await r.text();
    this._log(text);
    const parser = new SRTResponseData(text);

    if (!parser.success()) throw new SRTResponseError(parser.message());

    const allData = parser.getAll();
    return allData.outDataSets.dsOutput1
      .filter(t => t.stlbTrnClsfCd === '17')
      .map(t => new SRTTrain(t))
      .filter(t => (!availableOnly || t.seatAvailable()) && (!timeLimit || t.depTime <= timeLimit));
  }

  async reserve(train, passengers, option = SeatType.GENERAL_FIRST, windowSeat = null) {
    if (!train.seatAvailable() && train.reserveWaitPossibleCode >= 0) {
      const reservation = await this.reserveStandby(train, passengers, option, this.phoneNumber);
      if (this.phoneNumber) {
        const agreeClassChange = option === SeatType.SPECIAL_FIRST || option === SeatType.GENERAL_FIRST;
        await this.reserveStandbyOptionSettings(reservation, true, agreeClassChange, this.phoneNumber);
      }
      return reservation;
    }
    return this._reserve(RESERVE_JOBID.PERSONAL, train, passengers, option, null, windowSeat);
  }

  async reserveStandby(train, passengers, option = SeatType.GENERAL_FIRST, mblPhone = null) {
    if (option === SeatType.SPECIAL_FIRST) option = SeatType.SPECIAL_ONLY;
    else if (option === SeatType.GENERAL_FIRST) option = SeatType.GENERAL_ONLY;
    return this._reserve(RESERVE_JOBID.STANDBY, train, passengers, option, mblPhone);
  }

  async _reserve(jobid, train, passengers, option = SeatType.GENERAL_FIRST, mblPhone = null, windowSeat = null) {
    if (!this.isLogin) throw new SRTNotLoggedInError();
    if (!(train instanceof SRTTrain)) throw new TypeError('"train" must be SRTTrain instance');
    if (train.trainName !== 'SRT') throw new Error(`Expected "SRT" train, got ${train.trainName}`);

    passengers = Passenger.combine(passengers || [new Adult()]);

    const isSpecialSeat = {
      [SeatType.GENERAL_ONLY]: false,
      [SeatType.SPECIAL_ONLY]: true,
      [SeatType.GENERAL_FIRST]: !train.generalSeatAvailable(),
      [SeatType.SPECIAL_FIRST]: train.specialSeatAvailable(),
    }[option];

    const data = {
      jobId: jobid, jrnyCnt: '1', jrnyTpCd: '11', jrnySqno1: '001',
      stndFlg: 'N', trnGpCd1: '300', trnGpCd: '109', grpDv: '0', rtnDv: '0',
      stlbTrnClsfCd1: train.trainCode,
      dptRsStnCd1: train.depStationCode, dptRsStnCdNm1: train.depStationName,
      arvRsStnCd1: train.arrStationCode, arvRsStnCdNm1: train.arrStationName,
      dptDt1: train.depDate, dptTm1: train.depTime, arvTm1: train.arrTime,
      trnNo1: String(parseInt(train.trainNumber)).padStart(5, '0'),
      runDt1: train.depDate,
      dptStnConsOrdr1: train.depStationConstitutionOrder,
      arvStnConsOrdr1: train.arrStationConstitutionOrder,
      dptStnRunOrdr1: train.depStationRunOrder,
      arvStnRunOrdr1: train.arrStationRunOrder,
      mblPhone: mblPhone,
      netfunnelKey: await this._netfunnel.run(),
      ...Passenger.getPassengerDict(passengers, isSpecialSeat, windowSeat),
    };

    if (jobid === RESERVE_JOBID.PERSONAL) data.reserveType = '11';

    const r = await this._post(API_ENDPOINTS.reserve, data);
    const text = await r.text();
    this._log(text);
    const parser = new SRTResponseData(text);

    if (!parser.success()) throw new SRTResponseError(parser.message());

    const reservationNumber = parser.getAll().reservListMap[0].pnrNo;
    const reservations = await this.getReservations();
    const found = reservations.find(t => t.reservationNumber === reservationNumber);
    if (!found) throw new SRTError('Ticket not found: check reservation status');
    return found;
  }

  async reserveStandbyOptionSettings(reservation, isAgreeSMS, isAgreeClassChange, telNo) {
    if (!this.isLogin) throw new SRTNotLoggedInError();
    const reservationNumber = reservation.reservationNumber || reservation;
    const data = {
      pnrNo: reservationNumber,
      psrmClChgFlg: isAgreeClassChange ? 'Y' : 'N',
      smsSndFlg: isAgreeSMS ? 'Y' : 'N',
      telNo: isAgreeSMS ? telNo : '',
    };
    const r = await this._post(API_ENDPOINTS.standby_option, data);
    return r.status === 200;
  }

  async getReservations(paidOnly = false) {
    if (!this.isLogin) throw new SRTNotLoggedInError();
    const r = await this._post(API_ENDPOINTS.tickets, { pageNo: '0' });
    const text = await r.text();
    this._log(text);
    const parser = new SRTResponseData(text);
    if (!parser.success()) throw new SRTResponseError(parser.message());

    const allData = parser.getAll();
    const result = [];
    const trains = allData.trainListMap;
    const pays = allData.payListMap;
    for (let i = 0; i < trains.length; i++) {
      if (paidOnly && pays[i].stlFlg === 'N') continue;
      const ticketInfos = await this.ticketInfo(trains[i].pnrNo);
      result.push(new SRTReservation(trains[i], pays[i], ticketInfos));
    }
    return result;
  }

  async ticketInfo(reservation) {
    if (!this.isLogin) throw new SRTNotLoggedInError();
    const reservationNumber = reservation?.reservationNumber || reservation;
    const r = await this._post(API_ENDPOINTS.ticket_info, { pnrNo: reservationNumber, jrnySqno: '1' });
    const text = await r.text();
    this._log(text);
    const parser = new SRTResponseData(text);
    if (!parser.success()) throw new SRTResponseError(parser.message());
    return parser.getAll().trainListMap.map(t => new SRTTicket(t));
  }

  async cancel(reservation) {
    if (!this.isLogin) throw new SRTNotLoggedInError();
    const reservationNumber = reservation?.reservationNumber || reservation;
    const data = { pnrNo: reservationNumber, jrnyCnt: '1', rsvChgTno: '0' };
    const r = await this._post(API_ENDPOINTS.cancel, data);
    const text = await r.text();
    this._log(text);
    const parser = new SRTResponseData(text);
    if (!parser.success()) throw new SRTResponseError(parser.message());
    return true;
  }

  async payWithCard(reservation, number, password, validationNumber, expireDate, installment = 0, cardType = 'J') {
    if (!this.isLogin) throw new SRTNotLoggedInError();
    const now = new Date();
    const stlDmnDt = _formatDate(now);
    const data = {
      stlDmnDt, mbCrdNo: this.membershipNumber,
      stlMnsSqno1: '1', ststlGridcnt: '1', totNewStlAmt: reservation.totalCost,
      athnDvCd1: cardType, vanPwd1: password, crdVlidTrm1: expireDate,
      stlMnsCd1: '02', rsvChgTno: '0', chgMcs: '0',
      ismtMnthNum1: installment, ctlDvCd: '3102', cgPsId: 'korail',
      pnrNo: reservation.reservationNumber, totPrnb: reservation.seatCount,
      mnsStlAmt1: reservation.totalCost, crdInpWayCd1: '@',
      athnVal1: validationNumber, stlCrCrdNo1: number,
      jrnyCnt: '1', strJobId: '3102', inrecmnsGridcnt: '1',
      dptTm: reservation.depTime, arvTm: reservation.arrTime,
      dptStnConsOrdr2: '000000', arvStnConsOrdr2: '000000',
      trnGpCd: '300', pageNo: '-', rowCnt: '-', pageUrl: '',
    };
    const r = await this._post(API_ENDPOINTS.payment, data);
    const text = await r.text();
    this._log(text);
    const response = JSON.parse(text);
    if (response.outDataSets.dsOutput0[0].strResult === 'FAIL') {
      throw new SRTResponseError(response.outDataSets.dsOutput0[0].msgTxt);
    }
    return true;
  }

  async reserveInfo(reservation) {
    const referer = API_ENDPOINTS.reserve_info_referer + reservation.reservationNumber;
    const headers = { ...this._headers, Referer: referer, Cookie: this._getCookieHeader() };
    const r = await fetch(API_ENDPOINTS.reserve_info, { method: 'POST', headers });
    this._updateCookies(r);
    const text = await r.text();
    this._log(text);
    const response = JSON.parse(text);
    if (response.ErrorCode === '0' && response.ErrorMsg === '') {
      return response.outDataSets.dsOutput1[0];
    }
    throw new SRTResponseError(response.ErrorMsg);
  }

  async refund(reservation) {
    const info = await this.reserveInfo(reservation);
    const data = {
      pnr_no: info.pnrNo,
      cnc_dmn_cont: '승차권 환불로 취소',
      saleDt: info.ogtkSaleDt,
      saleWctNo: info.ogtkSaleWctNo,
      saleSqno: info.ogtkSaleSqno,
      tkRetPwd: info.ogtkRetPwd,
      psgNm: info.buyPsNm,
    };
    const r = await this._post(API_ENDPOINTS.refund, data);
    const text = await r.text();
    this._log(text);
    const response = new SRTResponseData(text);
    if (!response.success()) throw new SRTResponseError(response.message());
    return true;
  }

  clear() {
    this._log('Clearing the netfunnel key');
    this._netfunnel.clear();
  }
}

// Helpers
function _formatDate(d) {
  return `${d.getFullYear()}${String(d.getMonth() + 1).padStart(2, '0')}${String(d.getDate()).padStart(2, '0')}`;
}

function _formatTime(d) {
  return `${String(d.getHours()).padStart(2, '0')}${String(d.getMinutes()).padStart(2, '0')}${String(d.getSeconds()).padStart(2, '0')}`;
}
