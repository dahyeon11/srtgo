/**
 * SRT (Super Rapid Train) API client
 */

import axios, { AxiosInstance } from 'axios';
import {
  SRT_API_ENDPOINTS,
  SRT_DEFAULT_HEADERS,
  EMAIL_REGEX,
  PHONE_NUMBER_REGEX,
  STATION_CODE,
  STATION_NAME,
  TRAIN_NAME,
  RESERVE_JOBID
} from './constants';
import {
  SRTError,
  SRTLoginError,
  SRTResponseError,
  SRTNotLoggedInError,
  SRTNetFunnelError
} from './errors';
import { Passenger } from './passengers';
import { SeatType, SRTTrainData, SRTTicketData } from './types';

/**
 * SRT Ticket class
 */
export class SRTTicket {
  private static readonly SEAT_TYPE: { [key: string]: string } = {
    '1': '일반실',
    '2': '특실'
  };

  private static readonly DISCOUNT_TYPE: { [key: string]: string } = {
    '000': '어른/청소년',
    '101': '탄력운임기준할인',
    '105': '자유석 할인',
    '106': '입석 할인',
    '107': '역방향석 할인',
    '108': '출입구석 할인',
    '109': '가족석 일반전환 할인',
    '201': '어린이',
    '204': '경로',
    '205': '1~3급 장애인',
    '206': '4~6급 장애인'
  };

  car: string;
  seat: string;
  seatTypeCode: string;
  seatType: string;
  passengerTypeCode: string;
  passengerType: string;
  price: number;
  originalPrice: number;
  discount: number;
  isWaiting: boolean;

  constructor(data: SRTTicketData) {
    this.car = data.scarNo;
    this.seat = data.seatNo;
    this.seatTypeCode = data.psrmClCd;
    this.seatType = SRTTicket.SEAT_TYPE[this.seatTypeCode] || '알 수 없음';
    this.passengerTypeCode = data.dcntKndCd;
    this.passengerType = SRTTicket.DISCOUNT_TYPE[this.passengerTypeCode] || '기타 할인';
    this.price = parseInt(data.rcvdAmt);
    this.originalPrice = parseInt(data.stdrPrc);
    this.discount = parseInt(data.dcntPrc);
    this.isWaiting = this.seat === '';
  }

  toString(): string {
    if (this.isWaiting) {
      return `예약대기 (${this.seatType}) ${this.passengerType} [${this.price}원(${this.discount}원 할인)]`;
    }
    return `${this.car}호차 ${this.seat} (${this.seatType}) ${this.passengerType} [${this.price}원(${this.discount}원 할인)]`;
  }
}

/**
 * SRT Train class
 */
export class SRTTrain {
  trainCode: string;
  trainName: string;
  trainNumber: string;
  depDate: string;
  depTime: string;
  depStationCode: string;
  depStationName: string;
  depStationRunOrder: string;
  depStationConstitutionOrder: string;
  arrDate: string;
  arrTime: string;
  arrStationCode: string;
  arrStationName: string;
  arrStationRunOrder: string;
  arrStationConstitutionOrder: string;
  generalSeatState: string;
  specialSeatState: string;
  reserveWaitPossibleName: string;
  reserveWaitPossibleCode: number;

  constructor(data: SRTTrainData) {
    this.trainCode = data.stlbTrnClsfCd;
    this.trainName = TRAIN_NAME[this.trainCode] || 'Unknown';
    this.trainNumber = data.trnNo;

    this.depDate = data.dptDt;
    this.depTime = data.dptTm;
    this.depStationCode = data.dptRsStnCd;
    this.depStationName = STATION_NAME[this.depStationCode] || 'Unknown';
    this.depStationRunOrder = data.dptStnRunOrdr;
    this.depStationConstitutionOrder = data.dptStnConsOrdr;

    this.arrDate = data.arvDt;
    this.arrTime = data.arvTm;
    this.arrStationCode = data.arvRsStnCd;
    this.arrStationName = STATION_NAME[this.arrStationCode] || 'Unknown';
    this.arrStationRunOrder = data.arvStnRunOrdr;
    this.arrStationConstitutionOrder = data.arvStnConsOrdr;

    this.generalSeatState = data.gnrmRsvPsbStr;
    this.specialSeatState = data.sprmRsvPsbStr;
    this.reserveWaitPossibleName = data.rsvWaitPsbCdNm;
    this.reserveWaitPossibleCode = parseInt(data.rsvWaitPsbCd);
  }

  generalSeatAvailable(): boolean {
    return this.generalSeatState.includes('예약가능');
  }

  specialSeatAvailable(): boolean {
    return this.specialSeatState.includes('예약가능');
  }

  reserveStandbyAvailable(): boolean {
    return this.reserveWaitPossibleCode === 9;
  }

  seatAvailable(): boolean {
    return this.generalSeatAvailable() || this.specialSeatAvailable();
  }

  toString(): string {
    const depHour = this.depTime.substring(0, 2);
    const depMin = this.depTime.substring(2, 4);
    const arrHour = this.arrTime.substring(0, 2);
    const arrMin = this.arrTime.substring(2, 4);

    let duration = (parseInt(arrHour) * 60 + parseInt(arrMin)) - (parseInt(depHour) * 60 + parseInt(depMin));
    if (duration < 0) duration += 24 * 60;

    const month = this.depDate.substring(4, 6);
    const day = this.depDate.substring(6, 8);

    const trainLine = `[${this.trainName} ${this.trainNumber}]`.padEnd(11);

    let msg = `${trainLine}${month}/${day} ${depHour}:${depMin}~${arrHour}:${arrMin}  `;
    msg += `${this.depStationName}~${this.arrStationName}  `;
    msg += `특실 ${this.specialSeatState}, 일반실 ${this.generalSeatState}`;

    if (this.reserveWaitPossibleCode >= 0) {
      msg += `, 예약대기 ${this.reserveWaitPossibleName}`;
    }

    msg += ` (${duration.toString().padStart(3)}분)`;
    return msg;
  }
}

/**
 * SRT Reservation class
 */
export class SRTReservation {
  reservationNumber: string;
  totalCost: number;
  seatCount: number;
  trainCode: string;
  trainName: string;
  trainNumber: string;
  depDate: string;
  depTime: string;
  depStationCode: string;
  depStationName: string;
  arrTime: string;
  arrStationCode: string;
  arrStationName: string;
  paymentDate: string;
  paymentTime: string;
  paid: boolean;
  isRunning: boolean;
  isWaiting: boolean;
  private _tickets: SRTTicket[];

  constructor(train: any, pay: any, tickets: SRTTicket[]) {
    this.reservationNumber = train.pnrNo;
    this.totalCost = parseInt(train.rcvdAmt);
    this.seatCount = train.tkSpecNum || parseInt(train.seatNum);

    this.trainCode = pay.stlbTrnClsfCd;
    this.trainName = TRAIN_NAME[this.trainCode] || 'Unknown';
    this.trainNumber = pay.trnNo;

    this.depDate = pay.dptDt;
    this.depTime = pay.dptTm;
    this.depStationCode = pay.dptRsStnCd;
    this.depStationName = STATION_NAME[this.depStationCode] || 'Unknown';

    this.arrTime = pay.arvTm;
    this.arrStationCode = pay.arvRsStnCd;
    this.arrStationName = STATION_NAME[this.arrStationCode] || 'Unknown';

    this.paymentDate = pay.iseLmtDt;
    this.paymentTime = pay.iseLmtTm;
    this.paid = pay.stlFlg === 'Y';
    this.isRunning = !('tkSpecNum' in train);
    this.isWaiting = !(this.paid || this.paymentDate || this.paymentTime);

    this._tickets = tickets;
  }

  get tickets(): SRTTicket[] {
    return this._tickets;
  }

  toString(): string {
    let base = `[${this.trainName}] `;
    base += `${this.depDate.substring(4, 6)}월 ${this.depDate.substring(6, 8)}일, `;
    base += `${this.depStationName}~${this.arrStationName}`;
    base += `(${this.depTime.substring(0, 2)}:${this.depTime.substring(2, 4)}~`;
    base += `${this.arrTime.substring(0, 2)}:${this.arrTime.substring(2, 4)}) `;
    base += `${this.totalCost}원(${this.seatCount}석)`;

    if (!this.paid) {
      if (!this.isWaiting) {
        base += `, 구입기한 ${this.paymentDate.substring(4, 6)}월 ${this.paymentDate.substring(6, 8)}일 `;
        base += `${this.paymentTime.substring(0, 2)}:${this.paymentTime.substring(2, 4)}`;
      } else if (!this.isRunning) {
        base += ', 예약대기';
      }
    }

    if (this.isRunning) {
      base += ' (운행중)';
    }

    return base;
  }
}

/**
 * NetFunnel Helper for handling wait queue
 */
class NetFunnelHelper {
  private static readonly WAIT_STATUS_PASS = '200';
  private static readonly WAIT_STATUS_FAIL = '201';
  private static readonly ALREADY_COMPLETED = '502';

  private static readonly OP_CODE = {
    getTidchkEnter: '5101',
    chkEnter: '5002',
    setComplete: '5004'
  };

  private session: AxiosInstance;
  private cachedKey: string | null = null;
  private lastFetchTime: number = 0;
  private cacheTtl: number = 48; // 48 seconds
  private debug: boolean;

  constructor(debug: boolean = false) {
    this.session = axios.create({
      headers: {
        'User-Agent': 'Mozilla/5.0',
        'Accept': '*/*',
        'Accept-Language': 'ko,en;q=0.9,en-US;q=0.8',
        'Cache-Control': 'no-cache',
        'Connection': 'keep-alive',
        'Pragma': 'no-cache'
      }
    });
    this.debug = debug;
  }

  async run(): Promise<string> {
    const currentTime = Date.now() / 1000;
    if (this.isCacheValid(currentTime)) {
      return this.cachedKey!;
    }

    try {
      let [status, key, nwait, ip] = await this.start();
      this.cachedKey = key;
      this.lastFetchTime = currentTime;

      while (status === NetFunnelHelper.WAIT_STATUS_FAIL) {
        process.stdout.write(`\r현재 ${nwait}명 대기중...`);
        await new Promise(resolve => setTimeout(resolve, 1000));
        [status, key, nwait, ip] = await this.check(ip);
        this.cachedKey = key;
      }

      [status] = await this.complete(ip);
      if (status === NetFunnelHelper.WAIT_STATUS_PASS || status === NetFunnelHelper.ALREADY_COMPLETED) {
        return this.cachedKey!;
      }

      this.clear();
      throw new SRTNetFunnelError('Failed to complete NetFunnel');
    } catch (ex) {
      this.clear();
      throw new SRTNetFunnelError(String(ex));
    }
  }

  clear(): void {
    this.cachedKey = null;
    this.lastFetchTime = 0;
  }

  private async start(): Promise<[string, string, string, string]> {
    return this.makeRequest('getTidchkEnter');
  }

  private async check(ip?: string): Promise<[string, string, string, string]> {
    return this.makeRequest('chkEnter', ip);
  }

  private async complete(ip?: string): Promise<[string, string, string, string]> {
    return this.makeRequest('setComplete', ip);
  }

  private async makeRequest(opcode: string, ip?: string): Promise<[string, string, string, string]> {
    const url = `https://${ip || 'nf.letskorail.com'}/ts.wseq`;
    const params = this.buildParams(NetFunnelHelper.OP_CODE[opcode as keyof typeof NetFunnelHelper.OP_CODE]);

    const response = await this.session.get(url, { params });
    if (this.debug) {
      console.log(response.data);
    }

    const parsed = this.parse(response.data);
    return [parsed.status, parsed.key, parsed.nwait, parsed.ip];
  }

  private buildParams(opcode: string): { [key: string]: string } {
    const params: { [key: string]: string } = {
      opcode,
      nfid: '0',
      prefix: `NetFunnel.gRtype=${opcode};`,
      js: 'true',
      [Date.now().toString()]: ''
    };

    if (opcode === NetFunnelHelper.OP_CODE.getTidchkEnter || opcode === NetFunnelHelper.OP_CODE.chkEnter) {
      params.sid = 'service_1';
      params.aid = 'act_10';
      if (opcode === NetFunnelHelper.OP_CODE.chkEnter) {
        params.key = this.cachedKey || '';
        params.ttl = '1';
      }
    } else if (opcode === NetFunnelHelper.OP_CODE.setComplete) {
      params.key = this.cachedKey || '';
    }

    return params;
  }

  private parse(response: string): { status: string; key: string; nwait: string; ip: string } {
    const resultMatch = response.match(/NetFunnel\.gControl\.result='([^']+)'/);
    if (!resultMatch) {
      throw new SRTNetFunnelError('Failed to parse NetFunnel response');
    }

    const [, resultStr] = resultMatch;
    const [code, status, paramsStr] = resultStr.split(':', 3);

    if (!paramsStr) {
      throw new SRTNetFunnelError('Failed to parse NetFunnel response');
    }

    const params: { [key: string]: string } = { code, status };
    paramsStr.split('&').forEach(param => {
      const [key, value] = param.split('=', 2);
      if (key && value !== undefined) {
        params[key] = value;
      }
    });

    return {
      status: params.status,
      key: params.key || '',
      nwait: params.nwait || '',
      ip: params.ip || ''
    };
  }

  private isCacheValid(currentTime: number): boolean {
    return !!(this.cachedKey && (currentTime - this.lastFetchTime) < this.cacheTtl);
  }
}

/**
 * SRT Response Data parser
 */
class SRTResponseData {
  private static readonly STATUS_SUCCESS = 'SUCC';
  private static readonly STATUS_FAIL = 'FAIL';

  private json: any;
  private status: any;

  constructor(response: string) {
    this.json = JSON.parse(response);
    this.status = this.parse();
  }

  private parse(): any {
    if ('resultMap' in this.json) {
      return this.json.resultMap[0];
    }

    if ('ErrorCode' in this.json && 'ErrorMsg' in this.json) {
      throw new SRTResponseError(
        `Undefined result status "[${this.json.ErrorCode}]: ${this.json.ErrorMsg}]"`
      );
    }

    throw new SRTError(`Unexpected case [${JSON.stringify(this.json)}]`);
  }

  success(): boolean {
    const result = this.status.strResult;
    if (result === undefined) {
      throw new SRTResponseError('Response status is not given');
    }

    if (result === SRTResponseData.STATUS_SUCCESS) {
      return true;
    }
    if (result === SRTResponseData.STATUS_FAIL) {
      return false;
    }

    throw new SRTResponseError(`Undefined result status "${result}"`);
  }

  message(): string {
    return this.status.msgTxt || '';
  }

  getAll(): any {
    return { ...this.json };
  }

  getStatus(): any {
    return { ...this.status };
  }
}

/**
 * Main SRT API client class
 */
export class SRT {
  private session: AxiosInstance;
  private netfunnel: NetFunnelHelper;
  private srtId: string;
  private srtPw: string;
  private verbose: boolean;
  public isLogin: boolean = false;
  public membershipNumber: string | null = null;
  public membershipName: string | null = null;
  public phoneNumber: string | null = null;

  constructor(srtId: string, srtPw: string, autoLogin: boolean = true, verbose: boolean = false) {
    this.session = axios.create({
      headers: SRT_DEFAULT_HEADERS
    });
    this.netfunnel = new NetFunnelHelper(verbose);
    this.srtId = srtId;
    this.srtPw = srtPw;
    this.verbose = verbose;

    if (autoLogin) {
      this.login().catch(err => {
        throw err;
      });
    }
  }

  private log(msg: string): void {
    if (this.verbose) {
      console.log('[*] ' + msg);
    }
  }

  async login(srtId?: string, srtPw?: string): Promise<boolean> {
    const id = srtId || this.srtId;
    const pw = srtPw || this.srtPw;

    let loginType = '1';
    if (EMAIL_REGEX.test(id)) {
      loginType = '2';
    } else if (PHONE_NUMBER_REGEX.test(id)) {
      loginType = '3';
    }

    const cleanId = loginType === '3' ? id.replace(/-/g, '') : id;

    const data = {
      auto: 'Y',
      check: 'Y',
      page: 'menu',
      deviceKey: '-',
      customerYn: '',
      login_referer: SRT_API_ENDPOINTS.main,
      srchDvCd: loginType,
      srchDvNm: cleanId,
      hmpgPwdCphd: pw
    };

    const response = await this.session.post(SRT_API_ENDPOINTS.login, data);
    this.log(response.data);

    if (response.data.includes('존재하지않는 회원입니다')) {
      throw new SRTLoginError(JSON.parse(response.data).MSG);
    }
    if (response.data.includes('비밀번호 오류')) {
      throw new SRTLoginError(JSON.parse(response.data).MSG);
    }
    if (response.data.includes('Your IP Address Blocked')) {
      throw new SRTLoginError(response.data.trim());
    }

    this.isLogin = true;
    const userInfo = JSON.parse(response.data).userMap;
    this.membershipNumber = userInfo.MB_CRD_NO;
    this.membershipName = userInfo.CUST_NM;
    this.phoneNumber = userInfo.MBL_PHONE;

    console.log(
      `로그인 성공: ${this.membershipName} (멤버십번호: ${this.membershipNumber}, 전화번호: ${this.phoneNumber})`
    );
    return true;
  }

  async logout(): Promise<boolean> {
    if (!this.isLogin) {
      return true;
    }

    const response = await this.session.post(SRT_API_ENDPOINTS.logout);
    this.log(response.data);

    if (response.status !== 200) {
      throw new SRTResponseError(response.data);
    }

    this.isLogin = false;
    this.membershipNumber = null;
    return true;
  }

  async searchTrain(
    dep: string,
    arr: string,
    date?: string,
    time?: string,
    timeLimit?: string,
    passengers?: Passenger[],
    availableOnly: boolean = true
  ): Promise<SRTTrain[]> {
    if (!(dep in STATION_CODE) || !(arr in STATION_CODE)) {
      throw new Error(`Invalid station: "${dep}" or "${arr}"`);
    }

    const now = new Date();
    const today = now.toISOString().substring(0, 10).replace(/-/g, '');
    const searchDate = date || today;

    if (searchDate < today) {
      throw new Error('Date cannot be before today');
    }

    const currentTime = now.toTimeString().substring(0, 8).replace(/:/g, '');
    const searchTime = searchDate === today
      ? (time && time > currentTime ? time : currentTime)
      : (time || '000000');

    const passengerList = Passenger.combine(passengers || [new (require('./passengers').Adult)()]);

    const data: any = {
      chtnDvCd: '1',
      dptDt: searchDate,
      dptTm: searchTime,
      dptDt1: searchDate,
      dptTm1: searchTime.substring(0, 2) + '0000',
      dptRsStnCd: STATION_CODE[dep],
      arvRsStnCd: STATION_CODE[arr],
      stlbTrnClsfCd: '05',
      trnGpCd: 109,
      trnNo: '',
      psgNum: Passenger.totalCount(passengerList).toString(),
      seatAttCd: '015',
      arriveTime: 'N',
      tkDptDt: '',
      tkDptTm: '',
      tkTrnNo: '',
      tkTripChgFlg: '',
      dlayTnumAplFlg: 'Y',
      netfunnelKey: await this.netfunnel.run()
    };

    const response = await this.session.post(SRT_API_ENDPOINTS.search_schedule, data);
    this.log(response.data);

    const parser = new SRTResponseData(response.data);
    if (!parser.success()) {
      throw new SRTResponseError(parser.message());
    }

    const trains = parser.getAll().outDataSets.dsOutput1
      .filter((t: any) => t.stlbTrnClsfCd === '17')
      .map((t: any) => new SRTTrain(t))
      .filter((train: SRTTrain) => {
        if (availableOnly && !train.seatAvailable()) return false;
        if (timeLimit && train.depTime > timeLimit) return false;
        return true;
      });

    return trains;
  }

  async reserve(
    train: SRTTrain,
    passengers?: Passenger[],
    option: SeatType = SeatType.GENERAL_FIRST,
    windowSeat?: boolean
  ): Promise<SRTReservation> {
    if (!train.seatAvailable() && train.reserveWaitPossibleCode >= 0) {
      const reservation = await this.reserveStandby(train, passengers, option, this.phoneNumber || undefined);
      if (this.phoneNumber) {
        const agreeClassChange = option === SeatType.SPECIAL_FIRST || option === SeatType.GENERAL_FIRST;
        await this.reserveStandbyOptionSettings(
          reservation,
          true,
          agreeClassChange,
          this.phoneNumber
        );
      }
      return reservation;
    }

    return this._reserve(RESERVE_JOBID.PERSONAL, train, passengers, option, undefined, windowSeat);
  }

  async reserveStandby(
    train: SRTTrain,
    passengers?: Passenger[],
    option: SeatType = SeatType.GENERAL_FIRST,
    mblPhone?: string
  ): Promise<SRTReservation> {
    let adjustedOption = option;
    if (option === SeatType.SPECIAL_FIRST) {
      adjustedOption = SeatType.SPECIAL_ONLY;
    } else if (option === SeatType.GENERAL_FIRST) {
      adjustedOption = SeatType.GENERAL_ONLY;
    }

    return this._reserve(RESERVE_JOBID.STANDBY, train, passengers, adjustedOption, mblPhone);
  }

  private async _reserve(
    jobid: string,
    train: SRTTrain,
    passengers?: Passenger[],
    option: SeatType = SeatType.GENERAL_FIRST,
    mblPhone?: string,
    windowSeat?: boolean
  ): Promise<SRTReservation> {
    if (!this.isLogin) {
      throw new SRTNotLoggedInError();
    }

    if (!(train instanceof SRTTrain)) {
      throw new TypeError('"train" must be SRTTrain instance');
    }

    if (train.trainName !== 'SRT') {
      throw new Error(`Expected "SRT" train, got ${train.trainName}`);
    }

    const passengerList = Passenger.combine(passengers || [new (require('./passengers').Adult)()]);

    const isSpecialSeat = {
      [SeatType.GENERAL_ONLY]: false,
      [SeatType.SPECIAL_ONLY]: true,
      [SeatType.GENERAL_FIRST]: !train.generalSeatAvailable(),
      [SeatType.SPECIAL_FIRST]: train.specialSeatAvailable()
    }[option];

    const data: any = {
      jobId: jobid,
      jrnyCnt: '1',
      jrnyTpCd: '11',
      jrnySqno1: '001',
      stndFlg: 'N',
      trnGpCd1: '300',
      trnGpCd: '109',
      grpDv: '0',
      rtnDv: '0',
      stlbTrnClsfCd1: train.trainCode,
      dptRsStnCd1: train.depStationCode,
      dptRsStnCdNm1: train.depStationName,
      arvRsStnCd1: train.arrStationCode,
      arvRsStnCdNm1: train.arrStationName,
      dptDt1: train.depDate,
      dptTm1: train.depTime,
      arvTm1: train.arrTime,
      trnNo1: String(parseInt(train.trainNumber)).padStart(5, '0'),
      runDt1: train.depDate,
      dptStnConsOrdr1: train.depStationConstitutionOrder,
      arvStnConsOrdr1: train.arrStationConstitutionOrder,
      dptStnRunOrdr1: train.depStationRunOrder,
      arvStnRunOrdr1: train.arrStationRunOrder,
      mblPhone: mblPhone,
      netfunnelKey: await this.netfunnel.run()
    };

    if (jobid === RESERVE_JOBID.PERSONAL) {
      data.reserveType = '11';
    }

    Object.assign(data, Passenger.getPassengerDict(passengerList, isSpecialSeat, windowSeat));

    const response = await this.session.post(SRT_API_ENDPOINTS.reserve, data);
    this.log(response.data);

    const parser = new SRTResponseData(response.data);
    if (!parser.success()) {
      throw new SRTResponseError(parser.message());
    }

    const reservationNumber = parser.getAll().reservListMap[0].pnrNo;

    const reservations = await this.getReservations();
    const reservation = reservations.find(r => r.reservationNumber === reservationNumber);

    if (!reservation) {
      throw new SRTError('Ticket not found: check reservation status');
    }

    return reservation;
  }

  async reserveStandbyOptionSettings(
    reservation: SRTReservation | string,
    isAgreeSMS: boolean,
    isAgreeClassChange: boolean,
    telNo?: string
  ): Promise<boolean> {
    if (!this.isLogin) {
      throw new SRTNotLoggedInError();
    }

    const reservationNumber = typeof reservation === 'string'
      ? reservation
      : reservation.reservationNumber;

    const data = {
      pnrNo: reservationNumber,
      psrmClChgFlg: isAgreeClassChange ? 'Y' : 'N',
      smsSndFlg: isAgreeSMS ? 'Y' : 'N',
      telNo: isAgreeSMS && telNo ? telNo : ''
    };

    const response = await this.session.post(SRT_API_ENDPOINTS.standby_option, data);
    this.log(response.data);

    return response.status === 200;
  }

  async getReservations(paidOnly: boolean = false): Promise<SRTReservation[]> {
    if (!this.isLogin) {
      throw new SRTNotLoggedInError();
    }

    const response = await this.session.post(SRT_API_ENDPOINTS.tickets, { pageNo: '0' });
    this.log(response.data);

    const parser = new SRTResponseData(response.data);
    if (!parser.success()) {
      throw new SRTResponseError(parser.message());
    }

    const data = parser.getAll();
    const reservations: SRTReservation[] = [];

    for (let i = 0; i < data.trainListMap.length; i++) {
      const train = data.trainListMap[i];
      const pay = data.payListMap[i];

      if (paidOnly && pay.stlFlg === 'N') {
        continue;
      }

      const tickets = await this.ticketInfo(train.pnrNo);
      reservations.push(new SRTReservation(train, pay, tickets));
    }

    return reservations;
  }

  async ticketInfo(reservation: SRTReservation | string): Promise<SRTTicket[]> {
    if (!this.isLogin) {
      throw new SRTNotLoggedInError();
    }

    const reservationNumber = typeof reservation === 'string'
      ? reservation
      : reservation.reservationNumber;

    const response = await this.session.post(SRT_API_ENDPOINTS.ticket_info, {
      pnrNo: reservationNumber,
      jrnySqno: '1'
    });
    this.log(response.data);

    const parser = new SRTResponseData(response.data);
    if (!parser.success()) {
      throw new SRTResponseError(parser.message());
    }

    return parser.getAll().trainListMap.map((ticket: any) => new SRTTicket(ticket));
  }

  async cancel(reservation: SRTReservation | string): Promise<boolean> {
    if (!this.isLogin) {
      throw new SRTNotLoggedInError();
    }

    const reservationNumber = typeof reservation === 'string'
      ? reservation
      : reservation.reservationNumber;

    const data = {
      pnrNo: reservationNumber,
      jrnyCnt: '1',
      rsvChgTno: '0'
    };

    const response = await this.session.post(SRT_API_ENDPOINTS.cancel, data);
    this.log(response.data);

    const parser = new SRTResponseData(response.data);
    if (!parser.success()) {
      throw new SRTResponseError(parser.message());
    }

    return true;
  }

  async payWithCard(
    reservation: SRTReservation,
    number: string,
    password: string,
    validationNumber: string,
    expireDate: string,
    installment: number = 0,
    cardType: string = 'J'
  ): Promise<boolean> {
    if (!this.isLogin) {
      throw new SRTNotLoggedInError();
    }

    const data = {
      stlDmnDt: new Date().toISOString().substring(0, 10).replace(/-/g, ''),
      mbCrdNo: this.membershipNumber,
      stlMnsSqno1: '1',
      ststlGridcnt: '1',
      totNewStlAmt: reservation.totalCost,
      athnDvCd1: cardType,
      vanPwd1: password,
      crdVlidTrm1: expireDate,
      stlMnsCd1: '02',
      rsvChgTno: '0',
      chgMcs: '0',
      ismtMnthNum1: installment,
      ctlDvCd: '3102',
      cgPsId: 'korail',
      pnrNo: reservation.reservationNumber,
      totPrnb: reservation.seatCount,
      mnsStlAmt1: reservation.totalCost,
      crdInpWayCd1: '@',
      athnVal1: validationNumber,
      stlCrCrdNo1: number,
      jrnyCnt: '1',
      strJobId: '3102',
      inrecmnsGridcnt: '1',
      dptTm: reservation.depTime,
      arvTm: reservation.arrTime,
      dptStnConsOrdr2: '000000',
      arvStnConsOrdr2: '000000',
      trnGpCd: '300',
      pageNo: '-',
      rowCnt: '-',
      pageUrl: ''
    };

    const response = await this.session.post(SRT_API_ENDPOINTS.payment, data);
    this.log(response.data);

    const result = JSON.parse(response.data);
    if (result.outDataSets.dsOutput0[0].strResult === 'FAIL') {
      throw new SRTResponseError(result.outDataSets.dsOutput0[0].msgTxt);
    }

    return true;
  }

  clearNetfunnel(): void {
    this.netfunnel.clear();
  }
}
