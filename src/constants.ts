/**
 * Constants for SRT and KTX
 */

export const EMAIL_REGEX = /[^@]+@[^@]+\.[^@]+/;
export const PHONE_NUMBER_REGEX = /(\d{3})-(\d{3,4})-(\d{4})/;

// SRT Constants
export const SRT_USER_AGENT =
  'Mozilla/5.0 (Linux; Android 14; SM-S912N Build/UP1A.231005.007; wv) AppleWebKit/537.36' +
  '(KHTML, like Gecko) Version/4.0 Chrome/131.0.6778.260 Mobile Safari/537.36SRT-APP-Android V.2.0.33';

export const SRT_DEFAULT_HEADERS = {
  'User-Agent': SRT_USER_AGENT,
  'Accept': 'application/json'
};

export const SRT_MOBILE = 'https://app.srail.or.kr:443';

export const SRT_API_ENDPOINTS = {
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
  refund: `${SRT_MOBILE}/atc/selectListAtc02063_n.do`
};

export const RESERVE_JOBID = {
  PERSONAL: '1101',  // 개인예약
  STANDBY: '1102'    // 예약대기
};

export const STATION_CODE: { [key: string]: string } = {
  '수서': '0551',
  '동탄': '0552',
  '평택지제': '0553',
  '경주': '0508',
  '곡성': '0049',
  '공주': '0514',
  '광주송정': '0036',
  '구례구': '0050',
  '김천(구미)': '0507',
  '나주': '0037',
  '남원': '0048',
  '대전': '0010',
  '동대구': '0015',
  '마산': '0059',
  '목포': '0041',
  '밀양': '0017',
  '부산': '0020',
  '서대구': '0506',
  '순천': '0051',
  '여수EXPO': '0053',
  '여천': '0139',
  '오송': '0297',
  '울산(통도사)': '0509',
  '익산': '0030',
  '전주': '0045',
  '정읍': '0033',
  '진영': '0056',
  '진주': '0063',
  '창원': '0057',
  '창원중앙': '0512',
  '천안아산': '0502',
  '포항': '0515'
};

export const STATION_NAME: { [key: string]: string } = Object.fromEntries(
  Object.entries(STATION_CODE).map(([name, code]) => [code, name])
);

export const TRAIN_NAME: { [key: string]: string } = {
  '00': 'KTX',
  '02': '무궁화',
  '03': '통근열차',
  '04': '누리로',
  '05': '전체',
  '07': 'KTX-산천',
  '08': 'ITX-새마을',
  '09': 'ITX-청춘',
  '10': 'KTX-산천',
  '17': 'SRT',
  '18': 'ITX-마음'
};

export const WINDOW_SEAT: { [key: string]: string } = {
  'none': '000',
  'true': '012',
  'false': '013'
};

// KTX Constants
export const KTX_USER_AGENT = 'Dalvik/2.1.0 (Linux; U; Android 14; SM-S912N Build/UP1A.231005.007)';

export const KTX_DEFAULT_HEADERS = {
  'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8',
  'User-Agent': KTX_USER_AGENT,
  'Host': 'smart.letskorail.com',
  'Connection': 'Keep-Alive',
  'Accept-Encoding': 'gzip'
};

export const KORAIL_MOBILE = 'https://smart.letskorail.com:443/classes/com.korail.mobile';

export const KTX_API_ENDPOINTS = {
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
  code: `${KORAIL_MOBILE}.common.code.do`
};
