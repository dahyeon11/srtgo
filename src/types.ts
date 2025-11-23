/**
 * Type definitions for SRTgo TypeScript
 */

export enum SeatType {
  GENERAL_FIRST = 1,  // 일반실 우선
  GENERAL_ONLY = 2,   // 일반실만
  SPECIAL_FIRST = 3,  // 특실 우선
  SPECIAL_ONLY = 4    // 특실만
}

export enum ReserveOption {
  GENERAL_FIRST = 'GENERAL_FIRST',
  GENERAL_ONLY = 'GENERAL_ONLY',
  SPECIAL_FIRST = 'SPECIAL_FIRST',
  SPECIAL_ONLY = 'SPECIAL_ONLY'
}

export enum TrainType {
  KTX = '100',
  SAEMAEUL = '101',
  MUGUNGHWA = '102',
  TONGGUEN = '103',
  NURIRO = '102',
  ALL = '109',
  AIRPORT = '105',
  KTX_SANCHEON = '100',
  ITX_SAEMAEUL = '101',
  ITX_CHEONGCHUN = '104'
}

export interface PassengerData {
  name: string;
  typeCode: string;
  count: number;
}

export interface SRTTrainData {
  stlbTrnClsfCd: string;
  trnNo: string;
  dptDt: string;
  dptTm: string;
  dptRsStnCd: string;
  dptStnRunOrdr: string;
  dptStnConsOrdr: string;
  arvDt: string;
  arvTm: string;
  arvRsStnCd: string;
  arvStnRunOrdr: string;
  arvStnConsOrdr: string;
  gnrmRsvPsbStr: string;
  sprmRsvPsbStr: string;
  rsvWaitPsbCdNm: string;
  rsvWaitPsbCd: string;
}

export interface SRTTicketData {
  scarNo: string;
  seatNo: string;
  psrmClCd: string;
  dcntKndCd: string;
  rcvdAmt: string;
  stdrPrc: string;
  dcntPrc: string;
}

export interface SRTReservationData {
  train: any;
  pay: any;
  tickets: SRTTicketData[];
}

export interface KTXTrainData {
  h_trn_clsf_cd: string;
  h_trn_clsf_nm: string;
  h_trn_gp_cd: string;
  h_trn_no: string;
  h_expct_dlay_hr: string;
  h_dpt_rs_stn_nm: string;
  h_dpt_rs_stn_cd: string;
  h_dpt_dt: string;
  h_dpt_tm: string;
  h_arv_rs_stn_nm: string;
  h_arv_rs_stn_cd: string;
  h_arv_dt: string;
  h_arv_tm: string;
  h_run_dt: string;
  h_rsv_psb_flg?: string;
  h_rsv_psb_nm?: string;
  h_spe_rsv_cd?: string;
  h_gen_rsv_cd?: string;
  h_wait_rsv_flg?: string;
}

export interface HTTPHeaders {
  [key: string]: string;
}

export interface ReservationInfo {
  reservationNumber?: string;
  rsv_id?: string;
  totalCost: number;
  seatCount: number;
  trainName: string;
  trainNumber: string;
  depDate: string;
  depTime: string;
  depStationName: string;
  arrTime: string;
  arrStationName: string;
  paid?: boolean;
  isWaiting?: boolean;
}
