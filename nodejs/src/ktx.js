/**
 * KTX (Korail) client module
 * Ported from Python ktx.py
 */

import fetch from 'node-fetch';
import { URLSearchParams } from 'url';
import CryptoJS from 'crypto-js';

// Constants
const EMAIL_REGEX = /[^@]+@[^@]+\.[^@]+/;
const PHONE_NUMBER_REGEX = /(\d{3})-(\d{3,4})-(\d{4})/;

const USER_AGENT = 'Dalvik/2.1.0 (Linux; U; Android 14; SM-S912N Build/UP1A.231005.007)';

const DEFAULT_HEADERS = {
  'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8',
  'User-Agent': USER_AGENT,
  Host: 'smart.letskorail.com',
  Connection: 'Keep-Alive',
  'Accept-Encoding': 'gzip',
};

const KORAIL_MOBILE = 'https://smart.letskorail.com:443/classes/com.korail.mobile';
const API_ENDPOINTS = {
  login: `${KORAIL_MOBILE}.login.Login`,
  logout: `${KORAIL_MOBILE}.common.logout`,
  search_schedule: `${KORAIL_MOBILE}.seatMovie.ScheduleView`,
  reserve: `${KORAIL_MOBILE}.certification.TicketReservation`,
  cancel: `${KORAIL_MOBILE}.reservationCancel.ReservationCancelChk`,
  myticketseat: `${KORAIL_MOBILE}.refunds.SelTicketInfo`,
  myticketlist: `${KORAIL_MOBILE}.myTicket.MyTicketList`,
  myreservationview: `${KORAIL_MOBILE}.reservation.ReservationView`,
  myreservationlist: `${KORAIL_MOBILE}.certification.ReservationList`,
  pay: `${KORAIL_MOBILE}.payment.ReservationPayment`,
  refund: `${KORAIL_MOBILE}.refunds.RefundsRequest`,
  code: `${KORAIL_MOBILE}.common.code.do`,
  ncard_schedule: `${KORAIL_MOBILE}.research.dcntCrdScheduleView.do`,
  assign_schedule: `${KORAIL_MOBILE}.research.assignScheduleView.do`,
  ncard_reservation: `${KORAIL_MOBILE}.research.dcntCrdInfo.do`,
  ncard_history: `${KORAIL_MOBILE}.ticket.dcntCrdUseQry.do`,
  ncard_extension: `${KORAIL_MOBILE}.reservation.dcntCrdExtn.do`,
};

// Schedule class
class Schedule {
  constructor(data) {
    this.trainType = data.h_trn_clsf_cd;
    this.trainTypeName = data.h_trn_clsf_nm;
    this.trainGroup = data.h_trn_gp_cd;
    this.trainNo = data.h_trn_no;
    this.delayTime = data.h_expct_dlay_hr;

    this.depName = data.h_dpt_rs_stn_nm;
    this.depCode = data.h_dpt_rs_stn_cd;
    this.depDate = data.h_dpt_dt;
    this.depTime = data.h_dpt_tm;

    this.arrName = data.h_arv_rs_stn_nm;
    this.arrCode = data.h_arv_rs_stn_cd;
    this.arrDate = data.h_arv_dt;
    this.arrTime = data.h_arv_tm;

    this.runDate = data.h_run_dt;
  }

  toString() {
    const depTime = `${this.depTime.slice(0, 2)}:${this.depTime.slice(2, 4)}`;
    const arrTime = `${this.arrTime.slice(0, 2)}:${this.arrTime.slice(2, 4)}`;
    const depDate = `${parseInt(this.depDate.slice(4, 6), 10).toString().padStart(2, '0')}/${parseInt(this.depDate.slice(6), 10).toString().padStart(2, '0')}`;
    const trainLine = `[${this.trainTypeName.slice(0, 3)} ${this.trainNo}]`.padEnd(11);
    return `${trainLine}${depDate} ${depTime}~${arrTime}  ${this.depName}~${this.arrName}`;
  }
}

// Train class
export class Train extends Schedule {
  constructor(data) {
    super(data);
    this.reservePossible = data.h_rsv_psb_flg;
    this.reservePossibleName = data.h_rsv_psb_nm;
    this.specialSeat = data.h_spe_rsv_cd;
    this.generalSeat = data.h_gen_rsv_cd;
    this.waitReserveFlag = data.h_wait_rsv_flg ? parseInt(data.h_wait_rsv_flg) : null;
  }

  toString() {
    let repr = super.toString();
    const depM = parseInt(this.depTime.slice(0, 2)) * 60 + parseInt(this.depTime.slice(2, 4));
    const arrM = parseInt(this.arrTime.slice(0, 2)) * 60 + parseInt(this.arrTime.slice(2, 4));
    let duration = arrM - depM;
    if (duration < 0) duration += 24 * 60;

    if (this.reservePossibleName) {
      repr += `  특실 ${this.hasSpecialSeat() ? '가능' : '매진'}`;
      repr += `, 일반실 ${this.hasGeneralSeat() ? '가능' : '매진'}`;
      if (this.waitReserveFlag >= 0) {
        repr += `, 예약대기 ${this.hasGeneralWaitingList() ? '가능' : '매진'}`;
      }
    }
    repr += ` (${String(duration).padStart(3)}분)`;
    return repr;
  }

  hasSpecialSeat() { return this.specialSeat === '11'; }
  hasGeneralSeat() { return this.generalSeat === '11'; }
  hasSeat() { return this.hasGeneralSeat() || this.hasSpecialSeat(); }
  hasWaitingList() { return this.hasGeneralWaitingList(); }
  hasGeneralWaitingList() { return this.waitReserveFlag === 9; }
}

// Ticket class
export class Ticket extends Train {
  constructor(data) {
    const rawData = data.ticket_list[0].train_info[0];
    super(rawData);
    this.seatNoEnd = rawData.h_seat_no_end;
    this.seatNoCount = parseInt(rawData.h_seat_cnt);
    this.buyerName = rawData.h_buy_ps_nm;
    this.saleDate = rawData.h_orgtk_sale_dt;
    this.pnrNo = rawData.h_pnr_no;
    this.saleInfo1 = rawData.h_orgtk_wct_no;
    this.saleInfo2 = rawData.h_orgtk_ret_sale_dt;
    this.saleInfo3 = rawData.h_orgtk_sale_sqno;
    this.saleInfo4 = rawData.h_orgtk_ret_pwd;
    this.price = parseInt(rawData.h_rcvd_amt);
    this.carNo = rawData.h_srcar_no;
    this.seatNo = rawData.h_seat_no;
  }

  toString() {
    let repr = Schedule.prototype.toString.call(this);
    repr += ` => ${this.carNo}호`;
    if (this.seatNoCount !== 1) {
      repr += ` ${this.seatNo}~${this.seatNoEnd}`;
    } else {
      repr += ` ${this.seatNo}`;
    }
    repr += `, ${this.price}원`;
    return repr;
  }

  getTicketNo() {
    return [this.saleInfo1, this.saleInfo2, this.saleInfo3, this.saleInfo4].join('-');
  }
}

// Reservation class
export class Reservation extends Train {
  constructor(data) {
    super(data);
    this.depDate = data.h_run_dt;
    this.arrDate = data.h_run_dt;
    this.rsvId = data.h_pnr_no;
    this.seatNoCount = parseInt(data.h_tot_seat_cnt);
    this.buyLimitDate = data.h_ntisu_lmt_dt;
    this.buyLimitTime = data.h_ntisu_lmt_tm;
    this.price = parseInt(data.h_rsv_amt);
    this.journeyNo = data.txtJrnySqno || '001';
    this.journeyCnt = data.txtJrnyCnt || '01';
    this.rsvChgNo = data.hidRsvChgNo || '00000';
    this.isWaiting = this.buyLimitDate === '00000000' || this.buyLimitTime === '235959';
  }

  toString() {
    let repr = super.toString();
    repr += `, ${this.price}원(${this.seatNoCount}석)`;
    if (this.isWaiting) {
      repr += ', 예약대기';
    } else {
      const bld = `${parseInt(this.buyLimitDate.slice(4, 6))}월 ${parseInt(this.buyLimitDate.slice(6))}일`;
      const blt = `${this.buyLimitTime.slice(0, 2)}:${this.buyLimitTime.slice(2, 4)}`;
      repr += `, 구입기한 ${bld} ${blt}`;
    }
    return repr;
  }
}

// Seat class
export class Seat {
  constructor(data) {
    this.car = data.h_srcar_no;
    this.seat = data.h_seat_no;
    this.seatType = data.h_psrm_cl_nm;
    this.passengerType = data.h_psg_tp_dv_nm;
    this.price = parseInt(data.h_rcvd_amt || '0');
    this.originalPrice = parseInt(data.h_seat_prc || '0');
    this.discount = parseInt(data.h_dcnt_amt || '0');
    this.isWaiting = this.seat === '';
  }

  toString() {
    if (this.isWaiting) {
      return `예약대기 (${this.seatType}) ${this.passengerType}[${this.price}원(${this.discount}원 할인)]`;
    }
    return `${this.car}호차 ${this.seat} (${this.seatType}) ${this.passengerType} [${this.price}원(${this.discount}원 할인)]`;
  }
}

// Passenger classes
export class Passenger {
  constructor(typecode, count = 1, discountType = '000', card = '', cardNo = '', cardPw = '') {
    this.typecode = typecode;
    this.count = count;
    this.discountType = discountType;
    this.card = card;
    this.cardNo = cardNo;
    this.cardPw = cardPw;
  }

  groupKey() {
    return `${this.typecode}_${this.discountType}_${this.card}_${this.cardNo}_${this.cardPw}`;
  }

  getDict(index) {
    const idx = String(index);
    return {
      [`txtPsgTpCd${idx}`]: this.typecode,
      [`txtDiscKndCd${idx}`]: this.discountType,
      [`txtCompaCnt${idx}`]: this.count,
      [`txtCardCode_${idx}`]: this.card,
      [`txtCardNo_${idx}`]: this.cardNo,
      [`txtCardPw_${idx}`]: this.cardPw,
    };
  }

  static reduce(passengers) {
    const groups = new Map();
    for (const p of passengers) {
      const key = p.groupKey();
      if (groups.has(key)) {
        groups.get(key).count += p.count;
      } else {
        groups.set(key, new p.constructor(p.count, p.discountType, p.card, p.cardNo, p.cardPw));
      }
    }
    return [...groups.values()].filter(p => p.count > 0);
  }
}

export class AdultPassenger extends Passenger {
  constructor(count = 1, discountType = '000', card = '', cardNo = '', cardPw = '') {
    super('1', count, discountType, card, cardNo, cardPw);
  }
}

export class ChildPassenger extends Passenger {
  constructor(count = 1, discountType = '000', card = '', cardNo = '', cardPw = '') {
    super('3', count, discountType, card, cardNo, cardPw);
  }
}

export class SeniorPassenger extends Passenger {
  constructor(count = 1, discountType = '131', card = '', cardNo = '', cardPw = '') {
    super('1', count, discountType, card, cardNo, cardPw);
  }
}

export class Disability1To3Passenger extends Passenger {
  constructor(count = 1, discountType = '111', card = '', cardNo = '', cardPw = '') {
    super('1', count, discountType, card, cardNo, cardPw);
  }
}

export class Disability4To6Passenger extends Passenger {
  constructor(count = 1, discountType = '112', card = '', cardNo = '', cardPw = '') {
    super('1', count, discountType, card, cardNo, cardPw);
  }
}

// Options
export const TrainType = {
  KTX: '100', SAEMAEUL: '101', MUGUNGHWA: '102', TONGGUEN: '103',
  NURIRO: '102', ALL: '109', AIRPORT: '105',
  KTX_SANCHEON: '100', ITX_SAEMAEUL: '101', ITX_CHEONGCHUN: '104',
};

export const ReserveOption = {
  GENERAL_FIRST: 'GENERAL_FIRST',
  GENERAL_ONLY: 'GENERAL_ONLY',
  SPECIAL_FIRST: 'SPECIAL_FIRST',
  SPECIAL_ONLY: 'SPECIAL_ONLY',
};

// Errors
export class KorailError extends Error {
  constructor(msg, code = null) {
    super(msg);
    this.msg = msg;
    this.code = code;
    this.name = 'KorailError';
  }
}

export class NeedToLoginError extends KorailError {
  static codes = new Set(['P058']);
  constructor(code) { super('Need to Login', code); this.name = 'NeedToLoginError'; }
}

export class NoResultsError extends KorailError {
  static codes = new Set(['P100', 'WRG000000', 'WRD000061', 'WRT300005']);
  constructor(code) { super('No Results', code); this.name = 'NoResultsError'; }
}

export class SoldOutError extends KorailError {
  static codes = new Set(['IRT010110', 'ERR211161']);
  constructor(code) { super('Sold out', code); this.name = 'SoldOutError'; }
}

export class NetFunnelError extends Error {
  constructor(msg) { super(msg); this.msg = msg; this.name = 'NetFunnelError'; }
}

// NetFunnelHelper
class NetFunnelHelper {
  static NETFUNNEL_URL = 'http://nf.letskorail.com/ts.wseq';
  static WAIT_STATUS_PASS = '200';
  static WAIT_STATUS_FAIL = '201';
  static ALREADY_COMPLETED = '502';
  static OP_CODE = { getTidchkEnter: '5101', chkEnter: '5002', setComplete: '5004' };

  constructor() {
    this._headers = {
      Host: 'nf.letskorail.com',
      Connection: 'Keep-Alive',
      'User-Agent': 'Apache-HttpClient/UNAVAILABLE (java 1.4)',
    };
    this._cachedKey = null;
    this._lastFetchTime = 0;
    this._cacheTtl = 50;
  }

  async run() {
    const currentTime = Date.now() / 1000;
    if (this._isCacheValid(currentTime)) return this._cachedKey;

    try {
      let { status, key, nwait } = await this._start();
      this._cachedKey = key;
      this._lastFetchTime = currentTime;

      while (status === NetFunnelHelper.WAIT_STATUS_FAIL) {
        process.stdout.write(`\r현재 ${nwait}명 대기중...`);
        await new Promise(r => setTimeout(r, 1000));
        ({ status, key, nwait } = await this._check());
        this._cachedKey = key;
      }

      const result = await this._complete();
      if (result.status === NetFunnelHelper.WAIT_STATUS_PASS ||
          result.status === NetFunnelHelper.ALREADY_COMPLETED) {
        return this._cachedKey;
      }
      this.clear();
      throw new NetFunnelError('Failed to complete NetFunnel');
    } catch (ex) {
      this.clear();
      throw new NetFunnelError(String(ex));
    }
  }

  clear() {
    this._cachedKey = null;
    this._lastFetchTime = 0;
  }

  async _start() { return this._makeRequest('getTidchkEnter'); }
  async _check() { return this._makeRequest('chkEnter'); }
  async _complete() { return this._makeRequest('setComplete'); }

  async _makeRequest(opcode) {
    const params = this._buildParams(NetFunnelHelper.OP_CODE[opcode]);
    const qs = new URLSearchParams(params).toString();
    const r = await fetch(`${NetFunnelHelper.NETFUNNEL_URL}?${qs}`, { headers: this._headers });
    const text = await r.text();
    return this._parse(text);
  }

  _buildParams(opcode) {
    const params = { opcode };
    if (opcode === NetFunnelHelper.OP_CODE.getTidchkEnter ||
        opcode === NetFunnelHelper.OP_CODE.chkEnter) {
      params.sid = 'service_1';
      params.aid = 'act_8';
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
    const [status, paramsStr] = response.split(':', 2);
    if (!paramsStr) throw new NetFunnelError('Failed to parse NetFunnel response');
    const params = {};
    for (const part of paramsStr.split('&')) {
      if (part.includes('=')) {
        const [k, v] = part.split('=', 2);
        params[k] = v;
      }
    }
    params.status = status;
    return params;
  }

  _isCacheValid(currentTime) {
    return this._cachedKey && (currentTime - this._lastFetchTime) < this._cacheTtl;
  }
}

// Helper
function buildFormData(data) {
  const params = new URLSearchParams();
  for (const [k, v] of Object.entries(data)) {
    if (v != null) params.append(k, String(v));
  }
  return params;
}

// Korail class
export class Korail {
  constructor(korailId, korailPw, { autoLogin = true, verbose = false } = {}) {
    this._headers = { ...DEFAULT_HEADERS };
    this._cookies = {};
    this._device = 'AD';
    this._version = '240531001';
    this._key = 'korail1234567890';
    this._idx = null;
    this._netfunnel = new NetFunnelHelper();
    this.korailId = korailId;
    this.korailPw = korailPw;
    this.verbose = verbose;
    this.logined = false;
    this.membershipNumber = null;
    this.name = null;
    this.email = null;
    this.phoneNumber = null;
    this._autoLogin = autoLogin;
  }

  // Alias for compatibility with srtgo.js
  get isLogin() { return this.logined; }

  async init() {
    if (this._autoLogin) await this.login();
    return this;
  }

  _log(msg) { if (this.verbose) console.log(`[*] ${msg}`); }

  _getCookieHeader() {
    return Object.entries(this._cookies).map(([k, v]) => `${k}=${v}`).join('; ');
  }

  _updateCookies(response) {
    const setCookies = response.headers.raw()['set-cookie'];
    if (setCookies) {
      for (const cookie of setCookies) {
        const [pair] = cookie.split(';');
        const [k, v] = pair.split('=', 2);
        this._cookies[k.trim()] = (v || '').trim();
      }
    }
  }

  async _post(url, data) {
    const headers = { ...this._headers, Cookie: this._getCookieHeader() };
    const r = await fetch(url, {
      method: 'POST',
      headers,
      body: buildFormData(data),
    });
    this._updateCookies(r);
    return r;
  }

  async _get(url, params) {
    const headers = { ...this._headers, Cookie: this._getCookieHeader() };
    const qs = new URLSearchParams(params).toString();
    const r = await fetch(`${url}?${qs}`, { headers });
    this._updateCookies(r);
    return r;
  }

  async __encPassword(password) {
    const data = { code: 'app.login.cphd' };
    const r = await this._post(API_ENDPOINTS.code, data);
    const text = await r.text();
    const j = JSON.parse(text);

    if (j.strResult === 'SUCC' && j['app.login.cphd']) {
      this._idx = j['app.login.cphd'].idx;
      const key = j['app.login.cphd'].key;
      const encryptKey = CryptoJS.enc.Utf8.parse(key);
      const iv = CryptoJS.enc.Utf8.parse(key.slice(0, 16));
      const encrypted = CryptoJS.AES.encrypt(password, encryptKey, {
        iv, mode: CryptoJS.mode.CBC, padding: CryptoJS.pad.Pkcs7,
      });
      // Double base64 encoding
      const firstBase64 = encrypted.toString(); // already base64
      const secondBase64 = Buffer.from(firstBase64).toString('base64');
      return secondBase64;
    }
    return false;
  }

  async login(korailId, korailPw) {
    if (korailId) this.korailId = korailId;
    if (korailPw) this.korailPw = korailPw;

    let txtInputFlg = '2';
    if (EMAIL_REGEX.test(this.korailId)) txtInputFlg = '5';
    else if (PHONE_NUMBER_REGEX.test(this.korailId)) txtInputFlg = '4';

    const encPw = await this.__encPassword(this.korailPw);

    const data = {
      Device: this._device,
      Version: this._version,
      Key: this._key,
      txtMemberNo: this.korailId,
      txtPwd: encPw,
      txtInputFlg: txtInputFlg,
      idx: this._idx,
    };

    const r = await this._post(API_ENDPOINTS.login, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);

    if (j.strResult === 'SUCC' && j.strMbCrdNo) {
      this.membershipNumber = j.strMbCrdNo;
      this.name = j.strCustNm;
      this.email = j.strEmailAdr;
      this.phoneNumber = j.strCpNo;
      console.log(`로그인 성공: ${this.name} (멤버십번호: ${this.membershipNumber}, 전화번호: ${this.phoneNumber})`);
      this.logined = true;
      return true;
    }
    this.logined = false;
    return false;
  }

  async logout() {
    await this._get(API_ENDPOINTS.logout, {});
    this.logined = false;
  }

  _resultCheck(j) {
    if (j.strResult === 'FAIL') {
      const code = j.h_msg_cd;
      const txt = j.h_msg_txt;
      if (NoResultsError.codes.has(code)) throw new NoResultsError(code);
      if (NeedToLoginError.codes.has(code)) throw new NeedToLoginError(code);
      if (SoldOutError.codes.has(code)) throw new SoldOutError(code);
      throw new KorailError(txt, code);
    }
    return true;
  }

  async searchTrain(dep, arr, date, time, { trainType = TrainType.ALL, passengers, includeNoSeats = false, includeWaitingList = false } = {}) {
    const kstNow = new Date();
    date = date || _formatDate(kstNow);
    time = time || _formatTime(kstNow);
    passengers = Passenger.reduce(passengers || [new AdultPassenger()]);

    const counts = {
      adult: passengers.filter(p => p instanceof AdultPassenger).reduce((s, p) => s + p.count, 0),
      child: passengers.filter(p => p instanceof ChildPassenger).reduce((s, p) => s + p.count, 0),
      senior: passengers.filter(p => p instanceof SeniorPassenger).reduce((s, p) => s + p.count, 0),
      disability1to3: passengers.filter(p => p instanceof Disability1To3Passenger).reduce((s, p) => s + p.count, 0),
      disability4to6: passengers.filter(p => p instanceof Disability4To6Passenger).reduce((s, p) => s + p.count, 0),
    };

    const data = {
      Device: this._device, Version: this._version, Sid: '',
      txtMenuId: '11', radJobId: '1',
      selGoTrain: trainType, txtTrnGpCd: trainType,
      txtGoStart: dep, txtGoEnd: arr,
      txtGoAbrdDt: date, txtGoHour: time,
      txtPsgFlg_1: counts.adult, txtPsgFlg_2: counts.child,
      txtPsgFlg_3: counts.senior, txtPsgFlg_4: counts.disability1to3,
      txtPsgFlg_5: counts.disability4to6,
      txtSeatAttCd_2: '000', txtSeatAttCd_3: '000',
      txtSeatAttCd_4: '015', ebizCrossCheck: 'N',
      srtCheckYn: 'N', rtYn: 'N', adjStnScdlOfrFlg: 'N',
      mbCrdNo: this.membershipNumber,
    };

    const r = await this._get(API_ENDPOINTS.search_schedule, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);

    if (this._resultCheck(j)) {
      let trains = (j.trn_infos?.trn_info || []).map(info => new Train(info));
      const filters = [t => t.hasSeat()];
      if (includeNoSeats) filters.push(t => !t.hasSeat());
      if (includeWaitingList) filters.push(t => t.hasWaitingList());
      trains = trains.filter(t => filters.some(f => f(t)));
      if (!trains.length) throw new NoResultsError();
      return trains;
    }
  }

  async reserve(train, passengers, option = ReserveOption.GENERAL_FIRST) {
    const reservingSeat = train.hasSeat() || train.waitReserveFlag < 0;
    let isSpecialSeat;
    if (reservingSeat) {
      isSpecialSeat = {
        [ReserveOption.GENERAL_ONLY]: false,
        [ReserveOption.SPECIAL_ONLY]: true,
        [ReserveOption.GENERAL_FIRST]: !train.hasGeneralSeat(),
        [ReserveOption.SPECIAL_FIRST]: train.hasSpecialSeat(),
      }[option];
    } else {
      isSpecialSeat = {
        [ReserveOption.GENERAL_ONLY]: false,
        [ReserveOption.SPECIAL_ONLY]: true,
        [ReserveOption.GENERAL_FIRST]: false,
        [ReserveOption.SPECIAL_FIRST]: true,
      }[option];
    }

    passengers = Passenger.reduce(passengers || [new AdultPassenger()]);
    const cnt = passengers.reduce((s, p) => s + p.count, 0);

    const data = {
      Device: this._device, Version: this._version, Key: this._key,
      txtMenuId: '11', txtJobId: reservingSeat ? '1101' : '1102',
      txtGdNo: '', hidFreeFlg: 'N', txtTotPsgCnt: cnt,
      txtSeatAttCd1: '000', txtSeatAttCd2: '000',
      txtSeatAttCd3: '000', txtSeatAttCd4: '015', txtSeatAttCd5: '000',
      txtStndFlg: 'N', txtSrcarCnt: '0',
      txtJrnyCnt: '1', txtJrnySqno1: '001', txtJrnyTpCd1: '11',
      txtDptDt1: train.depDate, txtDptRsStnCd1: train.depCode,
      txtDptTm1: train.depTime, txtArvRsStnCd1: train.arrCode,
      txtTrnNo1: train.trainNo, txtRunDt1: train.runDate,
      txtTrnClsfCd1: train.trainType, txtTrnGpCd1: train.trainGroup,
      txtPsrmClCd1: isSpecialSeat ? '2' : '1', txtChgFlg1: '',
      txtJrnySqno2: '', txtJrnyTpCd2: '', txtDptDt2: '',
      txtDptRsStnCd2: '', txtDptTm2: '', txtArvRsStnCd2: '',
      txtTrnNo2: '', txtRunDt2: '', txtTrnClsfCd2: '',
      txtPsrmClCd2: '', txtChgFlg2: '',
    };

    passengers.forEach((psg, i) => {
      Object.assign(data, psg.getDict(i + 1));
    });

    const r = await this._get(API_ENDPOINTS.reserve, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    if (this._resultCheck(j)) {
      const rsvId = j.h_pnr_no;
      return this.reservations(rsvId);
    }
    throw new SoldOutError();
  }

  async tickets() {
    const data = {
      Device: this._device, Version: this._version, Key: this._key,
      txtDeviceId: '', txtIndex: '1', h_page_no: '1',
      h_abrd_dt_from: '', h_abrd_dt_to: '', hiduserYn: 'Y',
    };

    const r = await this._get(API_ENDPOINTS.myticketlist, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    try {
      if (this._resultCheck(j)) {
        const ticketList = [];
        for (const info of (j.reservation_list || [])) {
          const ticket = new Ticket(info);
          const seatData = {
            Device: this._device, Version: this._version, Key: this._key,
            h_orgtk_wct_no: ticket.saleInfo1,
            h_orgtk_ret_sale_dt: ticket.saleInfo2,
            h_orgtk_sale_sqno: ticket.saleInfo3,
            h_orgtk_ret_pwd: ticket.saleInfo4,
          };
          const sr = await this._get(API_ENDPOINTS.myticketseat, seatData);
          const st = await sr.text();
          const sj = JSON.parse(st);
          if (this._resultCheck(sj)) {
            const seat = sj.ticket_infos?.ticket_info?.[0]?.tk_seat_info?.[0];
            if (seat) {
              ticket.seatNo = seat.h_seat_no;
              ticket.seatNoEnd = null;
            }
          }
          ticketList.push(ticket);
        }
        return ticketList;
      }
    } catch (e) {
      if (e instanceof NoResultsError) return [];
      throw e;
    }
    return [];
  }

  async reservations(rsvId = null) {
    const data = {
      Device: this._device, Version: this._version, Key: this._key,
    };
    const r = await this._get(API_ENDPOINTS.myreservationview, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    try {
      if (!this._resultCheck(j)) return [];

      const jrnyInfo = j.jrny_infos?.jrny_info || [];
      const reserves = [];

      for (const info of jrnyInfo) {
        const trainInfo = info.train_infos?.train_info || [];
        for (const tinfo of trainInfo) {
          const reservation = new Reservation(tinfo);
          const ticketResult = await this.ticketInfo(reservation.rsvId);
          if (ticketResult) {
            reservation.tickets = ticketResult.tickets;
            reservation.wctNo = ticketResult.wctNo;
          }
          if (rsvId && reservation.rsvId === rsvId) return reservation;
          reserves.push(reservation);
        }
      }
      return reserves;
    } catch (e) {
      if (e instanceof NoResultsError) return [];
      throw e;
    }
  }

  async ticketInfo(rsvId) {
    const data = {
      Device: this._device, Version: this._version, Key: this._key,
      hidPnrNo: rsvId,
    };
    const r = await this._get(API_ENDPOINTS.myreservationlist, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    try {
      if (!this._resultCheck(j)) return null;
      const wctNo = j.h_wct_no;
      const jrnyInfo = j.jrny_infos?.jrny_info;
      if (jrnyInfo && jrnyInfo.length > 0) {
        const seatInfo = jrnyInfo[0].seat_infos?.seat_info;
        if (seatInfo) {
          return { tickets: seatInfo.map(s => new Seat(s)), wctNo };
        }
      }
      return null;
    } catch (e) {
      if (e instanceof NoResultsError) return null;
      throw e;
    }
  }

  async payWithCard(rsv, cardNumber, cardPassword, birthday, cardExpire, installment = 0, cardType = 'J') {
    if (!(rsv instanceof Reservation)) throw new TypeError('rsv must be a Reservation instance');
    const data = {
      Device: this._device, Version: this._version, Key: this._key,
      hidPnrNo: rsv.rsvId, hidWctNo: rsv.wctNo,
      hidTmpJobSqno1: '000000', hidTmpJobSqno2: '000000',
      hidRsvChgNo: '000', hidInrecmnsGridcnt: '1',
      hidStlMnsSqno1: '1', hidStlMnsCd1: '02',
      hidMnsStlAmt1: String(rsv.price), hidCrdInpWayCd1: '@',
      hidStlCrCrdNo1: cardNumber, hidVanPwd1: cardPassword,
      hidCrdVlidTrm1: cardExpire, hidIsmtMnthNum1: installment,
      hidAthnDvCd1: cardType, hidAthnVal1: birthday, hiduserYn: 'Y',
    };
    const r = await this._post(API_ENDPOINTS.pay, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    return this._resultCheck(j);
  }

  async cancel(rsv) {
    if (!(rsv instanceof Reservation)) throw new TypeError('rsv must be a Reservation instance');
    const data = {
      Device: this._device, Version: this._version, Key: this._key,
      txtPnrNo: rsv.rsvId, txtJrnySqno: rsv.journeyNo,
      txtJrnyCnt: rsv.journeyCnt, hidRsvChgNo: rsv.rsvChgNo,
    };
    const r = await this._post(API_ENDPOINTS.cancel, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    return this._resultCheck(j);
  }

  async refund(ticket) {
    const data = {
      Device: this._device, Version: this._version, Key: this._key,
      txtPrnNo: ticket.pnrNo,
      h_orgtk_sale_dt: ticket.saleInfo2,
      h_orgtk_sale_wct_no: ticket.saleInfo1,
      h_orgtk_sale_sqno: ticket.saleInfo3,
      h_orgtk_ret_pwd: ticket.saleInfo4,
      h_mlg_stl: 'N', tk_ret_tms_dv_cd: '21',
      trnNo: ticket.trainNo,
      pbpAcepTgtFlg: 'N', latitude: '', longitude: '',
    };
    const r = await this._post(API_ENDPOINTS.refund, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    return this._resultCheck(j);
  }

  async fetchNCardInfo() {
    // 기존 티켓 목록에서 N카드 정보를 추출
    const data = {
      Device: this._device, Version: this._version, Key: this._key,
      txtDeviceId: '', txtIndex: '1', h_page_no: '1',
      h_abrd_dt_from: '', h_abrd_dt_to: '', hiduserYn: 'Y',
    };

    const r = await this._get(API_ENDPOINTS.myticketlist, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    this._resultCheck(j);

    const ncards = [];
    for (const info of (j.reservation_list || [])) {
      const ticket = new Ticket(info);
      // 티켓 상세 조회 (dcnt_crd_info 포함)
      const detailData = {
        Device: this._device, Version: this._version, Key: this._key,
        h_orgtk_wct_no: ticket.saleInfo1,
        h_orgtk_ret_sale_dt: ticket.saleInfo2,
        h_orgtk_sale_sqno: ticket.saleInfo3,
        h_orgtk_ret_pwd: ticket.saleInfo4,
      };
      const dr = await this._post(API_ENDPOINTS.myticketseat, detailData);
      const dt = await dr.text();
      this._log(dt);
      const dj = JSON.parse(dt);

      if (dj.strResult === 'SUCC' && dj.dcnt_crd_info) {
        const crdInfo = dj.dcnt_crd_info;
        const appSegList = crdInfo.appSegList || [];
        const dcntCrdKndCd = crdInfo.h_dcnt_crd_knd_cd || '';
        const remainUses = parseInt(crdInfo.h_noty_use_tno) || 0;
        const usedCount = parseInt(crdInfo.h_use_tno) || 0;
        const totalUses = remainUses + usedCount;
        // dcntCrdKndMgNo 자동 추론
        // h_dcnt_crd_knd_cd가 "B2N"이면 1구간 V1 (B2N18120402/03)만 해당
        // 그 외("MMM" 등)는 V2 계열
        const is2Month = totalUses >= 10 && totalUses <= 20;
        let dcntCrdKndMgNo = '';
        if (dcntCrdKndCd === 'B2N') {
          // 1구간 V1만 dcntCrdKndCd="B2N" 사용
          dcntCrdKndMgNo = is2Month ? 'B2N18120402' : 'B2N18120403';
        } else {
          // MMM (V2) - 구간 수는 appSegList로 추론 불가, 1인/1구간 기본값
          dcntCrdKndMgNo = is2Month ? 'B2N23100501' : 'B2N23100502';
        }

        ncards.push({
          dcntCrdNo: crdInfo.h_dcnt_crd_no,
          dcntCrdKndCd,
          dcntCrdKndMgNo,
          totalUses: String(totalUses),
          remainUses,
          usedCount,
          extnPsbFlg: crdInfo.h_dcnt_crd_trm_extn_psb_flg,
          appSegList,
          tkKndCd: dj.h_tk_knd_cd,
          tkKndNm: dj.h_tk_knd_nm,
          pnrNo: dj.h_pnr_no,
          ticket,
          raw: dj,
        });
      }
    }
    return ncards;
  }

  async searchNCardTrain(dep, arr, date, time, { stlbDturDvNm1 = '', psgNum1 = 1, trnGpCd = '109' } = {}) {
    // 기존 N카드로 열차 조회: assignScheduleView.do 사용 (POST)
    // menuId="A2" (N카드), psrmClCd="9" (전체), seatAttCd1="015" (일반석)
    const kstNow = new Date();
    const todayDate = _formatDate(kstNow);
    const searchDate = date && date >= todayDate ? date : todayDate;
    const searchTime = searchDate === todayDate ? _formatTime(kstNow) : '000000';

    const data = {
      Device: this._device, Version: this._version, Key: this._key,
      menuId: 'A2',
      dptDt: searchDate,
      dptTm: time || searchTime,
      dptRsStnNm: dep,
      arvRsStnNm: arr,
      trnGpCd,
      psrmClCd: '9',
      seatAttCd1: '015',
      psgNum1,
      stlbDturDvNm1: stlbDturDvNm1,
      dirtChtnDvCd: '1',
      chtnArvRsStnNm: '',
    };

    const r = await this._post(API_ENDPOINTS.assign_schedule, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    if (this._resultCheck(j)) {
      const trainInfos = j.trn_infos?.trn_info || [];
      return { trains: trainInfos, hasNextPage: j.h_next_pg_flg === 'Y', raw: j };
    }
  }

  async reserveNCard({ dcntCrdKndMgNo, custMgNo, vlidTrmStDt, usePsbTno, jrnyInfo = {}, apdUsrInfo = {} } = {}) {
    const data = {
      Device: this._device, Version: this._version, Key: this._key,
      dcntCrdKndMgNo: dcntCrdKndMgNo || '',
      custMgNo: custMgNo || this.membershipNumber || '',
      vlidTrmStDt: vlidTrmStDt || '',
      usePsbTno: usePsbTno || '',
      ...jrnyInfo,
      ...apdUsrInfo,
    };

    const r = await this._post(API_ENDPOINTS.ncard_reservation, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    this._resultCheck(j);
    return j;
  }

  async reserveWithNCard(trainData, dcntCrdNo, psrmClCd = '1') {
    // 기존 N카드로 예약: 일반 예약 API (TicketReservation)에 할인코드 153 + 카드번호
    // Java: d4/a.java getNCardReservationRequest(TicketDetailResponse, SeatAssignData)
    const data = {
      Device: this._device, Version: this._version, Key: this._key,
      txtMenuId: 'A2',
      txtJobId: '1101',
      txtGdNo: '',
      hidFreeFlg: 'N',
      txtStndFlg: 'N',
      txtSrcarCnt: '0',
      // Seat attributes (from d4/a.java b() method)
      txtSeatAttCd1: '000',   // q.DISABLE
      txtSeatAttCd2: '000',   // l.DEFAULT
      txtSeatAttCd3: '000',   // n.DEFAULT
      txtSeatAttCd4: '015',   // p.DEFAULT (일반석)
      txtSeatAttCd5: '000',   // m.DISABLE
      // Passenger (1명, 할인코드 153 = N카드)
      txtTotPsgCnt: '1',
      txtPsgTpCd1: '1',
      txtDiscKndCd1: '153',
      txtCompaCnt1: '1',
      txtCardCode_1: '',
      txtCardNo_1: dcntCrdNo,
      txtCardPw_1: '',
      // Journey
      txtJrnyCnt: '1',
      txtJrnySqno1: '001',
      txtJrnyTpCd1: '11',
      txtDptDt1: trainData.h_dpt_dt,
      txtDptRsStnCd1: trainData.h_dpt_rs_stn_cd,
      txtDptTm1: trainData.h_dpt_tm,
      txtArvRsStnCd1: trainData.h_arv_rs_stn_cd,
      txtTrnNo1: trainData.h_trn_no,
      txtRunDt1: trainData.h_run_dt,
      txtTrnClsfCd1: trainData.h_trn_clsf_cd,
      txtTrnGpCd1: trainData.h_trn_gp_cd,
      txtPsrmClCd1: psrmClCd,  // '1'=일반실, '2'=특실
      txtChgFlg1: '',
      // Empty second journey
      txtJrnySqno2: '', txtJrnyTpCd2: '', txtDptDt2: '',
      txtDptRsStnCd2: '', txtDptTm2: '', txtArvRsStnCd2: '',
      txtTrnNo2: '', txtRunDt2: '', txtTrnClsfCd2: '',
      txtPsrmClCd2: '', txtChgFlg2: '',
    };

    const r = await this._get(API_ENDPOINTS.reserve, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    if (this._resultCheck(j)) {
      const rsvId = j.h_pnr_no;
      return this.reservations(rsvId);
    }
    throw new KorailError('N카드 예약 실패');
  }

  async getNCardHistory(dcntCrdNo) {
    const data = {
      Device: this._device, Version: this._version, Key: this._key,
      dcntCrdNo,
    };
    const r = await this._get(API_ENDPOINTS.ncard_history, data);
    const text = await r.text();
    this._log(text);
    const j = JSON.parse(text);
    this._resultCheck(j);
    return j;
  }

  clear() {
    this._netfunnel.clear();
  }
}

function _formatDate(d) {
  return `${d.getFullYear()}${String(d.getMonth() + 1).padStart(2, '0')}${String(d.getDate()).padStart(2, '0')}`;
}

function _formatTime(d) {
  return `${String(d.getHours()).padStart(2, '0')}${String(d.getMinutes()).padStart(2, '0')}${String(d.getSeconds()).padStart(2, '0')}`;
}
