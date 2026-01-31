package com.korail.talk.network.dao.pass;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CommReservationDao extends BaseDao {

    public class CommReservationRequest extends BaseRequest {
        private String hidAppArvStnCd;
        private String hidAppArvStnNm;
        private String hidAppDptStnCd;
        private String hidAppDptStnNm;
        private String hidChtrnStnCd;
        private String hidChtrnStnNm;
        private String hidCmtrKndCd;
        private String hidCmtrUtlAgeCd;
        private String hidCmtrUtlTrmCd;
        private String hidCmtrUtlTrmNm;
        private String hidDtour1;
        private String hidDtour2;
        private String hidTrnGpCd1;
        private String hidTrnGpCd2;
        private String hidTrnNo1;
        private String hidTrnNo2;
        private String hidUseOpenDt;
        private String stationInfo;

        public CommReservationRequest() {
        }

        public String getHidAppArvStnCd() {
            return this.hidAppArvStnCd;
        }

        public String getHidAppArvStnNm() {
            return this.hidAppArvStnNm;
        }

        public String getHidAppDptStnCd() {
            return this.hidAppDptStnCd;
        }

        public String getHidAppDptStnNm() {
            return this.hidAppDptStnNm;
        }

        public String getHidChtrnStnCd() {
            return this.hidChtrnStnCd;
        }

        public String getHidChtrnStnNm() {
            return this.hidChtrnStnNm;
        }

        public String getHidCmtrKndCd() {
            return this.hidCmtrKndCd;
        }

        public String getHidCmtrUtlAgeCd() {
            return this.hidCmtrUtlAgeCd;
        }

        public String getHidCmtrUtlTrmCd() {
            return this.hidCmtrUtlTrmCd;
        }

        public String getHidCmtrUtlTrmNm() {
            return this.hidCmtrUtlTrmNm;
        }

        public String getHidDtour1() {
            return this.hidDtour1;
        }

        public String getHidDtour2() {
            return this.hidDtour2;
        }

        public String getHidTrnGpCd1() {
            return this.hidTrnGpCd1;
        }

        public String getHidTrnGpCd2() {
            return this.hidTrnGpCd2;
        }

        public String getHidTrnNo1() {
            return this.hidTrnNo1;
        }

        public String getHidTrnNo2() {
            return this.hidTrnNo2;
        }

        public String getHidUseOpenDt() {
            return this.hidUseOpenDt;
        }

        public String getStationInfo() {
            return this.stationInfo;
        }

        public void setHidAppArvStnCd(String str) {
            this.hidAppArvStnCd = str;
        }

        public void setHidAppArvStnNm(String str) {
            this.hidAppArvStnNm = str;
        }

        public void setHidAppDptStnCd(String str) {
            this.hidAppDptStnCd = str;
        }

        public void setHidAppDptStnNm(String str) {
            this.hidAppDptStnNm = str;
        }

        public void setHidChtrnStnCd(String str) {
            this.hidChtrnStnCd = str;
        }

        public void setHidChtrnStnNm(String str) {
            this.hidChtrnStnNm = str;
        }

        public void setHidCmtrKndCd(String str) {
            this.hidCmtrKndCd = str;
        }

        public void setHidCmtrUtlAgeCd(String str) {
            this.hidCmtrUtlAgeCd = str;
        }

        public void setHidCmtrUtlTrmCd(String str) {
            this.hidCmtrUtlTrmCd = str;
        }

        public void setHidCmtrUtlTrmNm(String str) {
            this.hidCmtrUtlTrmNm = str;
        }

        public void setHidDtour1(String str) {
            this.hidDtour1 = str;
        }

        public void setHidDtour2(String str) {
            this.hidDtour2 = str;
        }

        public void setHidTrnGpCd1(String str) {
            this.hidTrnGpCd1 = str;
        }

        public void setHidTrnGpCd2(String str) {
            this.hidTrnGpCd2 = str;
        }

        public void setHidTrnNo1(String str) {
            this.hidTrnNo1 = str;
        }

        public void setHidTrnNo2(String str) {
            this.hidTrnNo2 = str;
        }

        public void setHidUseOpenDt(String str) {
            this.hidUseOpenDt = str;
        }

        public void setStationInfo(String str) {
            this.stationInfo = str;
        }
    }

    public class CommReservationResponse extends BaseResponse {
        private String h_guide;
        private MainInfo main_info;

        public class MainInfo implements Serializable {
            private String h_age;
            private String h_app_arv_rs_stn_cd;
            private String h_app_arv_rs_stn_nm;
            private String h_app_dpt_rs_stn_cd;
            private String h_app_dpt_rs_stn_nm;
            private String h_arv_stn_cons_ordr_1;
            private String h_arv_stn_cons_ordr_2;
            private String h_arv_tm;
            private String h_chg_mg_dv_cd;
            private String h_chg_mg_no;
            private String h_chtrn_rs_stn_cd;
            private String h_chtrn_rs_stn_nm;
            private String h_cmtr_knd_cd;
            private String h_cmtr_srt_cd;
            private String h_cmtr_utl_age_cd;
            private String h_cmtr_utl_trm_cd;
            private String h_cmtr_utl_trm_nm;
            private String h_cust_nm;
            private String h_cust_no;
            private String h_dpt_stn_cons_ordr_1;
            private String h_dpt_stn_cons_ordr_2;
            private String h_dpt_tm;
            private String h_dtour1;
            private String h_dtour2;
            private String h_exs_ln_acm_dst;
            private String h_holiday_cls_dt;
            private String h_holiday_flg;
            private String h_holiday_st_dt;
            private String h_new_ln_acm_dst;
            private String h_otm_rcvd_amt;
            private String h_prc_cl_cd_1;
            private String h_prc_cl_cd_2;
            private String h_psg_tp_cd;
            private String h_psrm_cl_cd;
            private String h_rcvd_amt;
            private String h_rcvd_fare;
            private String h_rcvd_prc;
            private String h_rout_cd_1;
            private String h_rout_cd_2;
            private String h_rsv_trm_dup;
            private String h_schd_trvl_dv_cd;
            private String h_stx_amt;
            private String h_taxt_spl_prce;
            private String h_trn_clsf_cd_1;
            private String h_trn_clsf_cd_2;
            private String h_trn_gp_cd;
            private String h_trn_no_1;
            private String h_trn_no_2;
            private String h_und_dv_cd_1;
            private String h_und_dv_cd_2;
            private String h_use_cls_dt;
            private String h_use_open_dt;
            private String h_use_psb_dno;
            private String h_use_psb_tno;
            private boolean isIncludeHoliday;
            private String mStationInfo;
            private String mUserNames;

            public MainInfo() {
            }

            public String getH_age() {
                return this.h_age;
            }

            public String getH_app_arv_rs_stn_cd() {
                return this.h_app_arv_rs_stn_cd;
            }

            public String getH_app_arv_rs_stn_nm() {
                return this.h_app_arv_rs_stn_nm;
            }

            public String getH_app_dpt_rs_stn_cd() {
                return this.h_app_dpt_rs_stn_cd;
            }

            public String getH_app_dpt_rs_stn_nm() {
                return this.h_app_dpt_rs_stn_nm;
            }

            public String getH_arv_stn_cons_ordr_1() {
                return this.h_arv_stn_cons_ordr_1;
            }

            public String getH_arv_stn_cons_ordr_2() {
                return this.h_arv_stn_cons_ordr_2;
            }

            public String getH_arv_tm() {
                return this.h_arv_tm;
            }

            public String getH_chg_mg_dv_cd() {
                return this.h_chg_mg_dv_cd;
            }

            public String getH_chg_mg_no() {
                return this.h_chg_mg_no;
            }

            public String getH_chtrn_rs_stn_cd() {
                return this.h_chtrn_rs_stn_cd;
            }

            public String getH_chtrn_rs_stn_nm() {
                return this.h_chtrn_rs_stn_nm;
            }

            public String getH_cmtr_knd_cd() {
                return this.h_cmtr_knd_cd;
            }

            public String getH_cmtr_srt_cd() {
                return this.h_cmtr_srt_cd;
            }

            public String getH_cmtr_utl_age_cd() {
                return this.h_cmtr_utl_age_cd;
            }

            public String getH_cmtr_utl_trm_cd() {
                return this.h_cmtr_utl_trm_cd;
            }

            public String getH_cmtr_utl_trm_nm() {
                return this.h_cmtr_utl_trm_nm;
            }

            public String getH_cust_nm() {
                return this.h_cust_nm;
            }

            public String getH_cust_no() {
                return this.h_cust_no;
            }

            public String getH_dpt_stn_cons_ordr_1() {
                return this.h_dpt_stn_cons_ordr_1;
            }

            public String getH_dpt_stn_cons_ordr_2() {
                return this.h_dpt_stn_cons_ordr_2;
            }

            public String getH_dpt_tm() {
                return this.h_dpt_tm;
            }

            public String getH_dtour1() {
                return this.h_dtour1;
            }

            public String getH_dtour2() {
                return this.h_dtour2;
            }

            public String getH_exs_ln_acm_dst() {
                return this.h_exs_ln_acm_dst;
            }

            public String getH_holiday_cls_dt() {
                return this.h_holiday_cls_dt;
            }

            public String getH_holiday_flg() {
                return this.h_holiday_flg;
            }

            public String getH_holiday_st_dt() {
                return this.h_holiday_st_dt;
            }

            public String getH_new_ln_acm_dst() {
                return this.h_new_ln_acm_dst;
            }

            public String getH_otm_rcvd_amt() {
                return this.h_otm_rcvd_amt;
            }

            public String getH_prc_cl_cd_1() {
                return this.h_prc_cl_cd_1;
            }

            public String getH_prc_cl_cd_2() {
                return this.h_prc_cl_cd_2;
            }

            public String getH_psg_tp_cd() {
                return this.h_psg_tp_cd;
            }

            public String getH_psrm_cl_cd() {
                return this.h_psrm_cl_cd;
            }

            public String getH_rcvd_amt() {
                return this.h_rcvd_amt;
            }

            public String getH_rcvd_fare() {
                return this.h_rcvd_fare;
            }

            public String getH_rcvd_prc() {
                return this.h_rcvd_prc;
            }

            public String getH_rout_cd_1() {
                return this.h_rout_cd_1;
            }

            public String getH_rout_cd_2() {
                return this.h_rout_cd_2;
            }

            public String getH_rsv_trm_dup() {
                return this.h_rsv_trm_dup;
            }

            public String getH_schd_trvl_dv_cd() {
                return this.h_schd_trvl_dv_cd;
            }

            public String getH_stx_amt() {
                return this.h_stx_amt;
            }

            public String getH_taxt_spl_prce() {
                return this.h_taxt_spl_prce;
            }

            public String getH_trn_clsf_cd_1() {
                return this.h_trn_clsf_cd_1;
            }

            public String getH_trn_clsf_cd_2() {
                return this.h_trn_clsf_cd_2;
            }

            public String getH_trn_gp_cd() {
                return this.h_trn_gp_cd;
            }

            public String getH_trn_no_1() {
                return this.h_trn_no_1;
            }

            public String getH_trn_no_2() {
                return this.h_trn_no_2;
            }

            public String getH_und_dv_cd_1() {
                return this.h_und_dv_cd_1;
            }

            public String getH_und_dv_cd_2() {
                return this.h_und_dv_cd_2;
            }

            public String getH_use_cls_dt() {
                return this.h_use_cls_dt;
            }

            public String getH_use_open_dt() {
                return this.h_use_open_dt;
            }

            public String getH_use_psb_dno() {
                return this.h_use_psb_dno;
            }

            public String getH_use_psb_tno() {
                return this.h_use_psb_tno;
            }

            public String getStationInfo() {
                return this.mStationInfo;
            }

            public String getUserNames() {
                return this.mUserNames;
            }

            public boolean isIncludeHoliday() {
                return this.isIncludeHoliday;
            }

            public void setIncludeHoliday(boolean z8) {
                this.isIncludeHoliday = z8;
            }

            public void setStationInfo(String str) {
                this.mStationInfo = str;
            }

            public void setUserNames(String str) {
                this.mUserNames = str;
            }
        }

        public CommReservationResponse() {
        }

        public String getH_guide() {
            return this.h_guide;
        }

        public MainInfo getMain_info() {
            return this.main_info;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassService passService = (PassService) getService(PassService.class);
        CommReservationRequest commReservationRequest = (CommReservationRequest) getRequest();
        return passService.commReservation(commReservationRequest.getDevice(), commReservationRequest.getVersion(), commReservationRequest.getKey(), commReservationRequest.getHidCmtrKndCd(), commReservationRequest.getHidCmtrUtlTrmCd(), commReservationRequest.getHidCmtrUtlTrmNm(), commReservationRequest.getHidCmtrUtlAgeCd(), commReservationRequest.getHidUseOpenDt(), commReservationRequest.getHidAppDptStnCd(), commReservationRequest.getHidAppDptStnNm(), commReservationRequest.getHidAppArvStnCd(), commReservationRequest.getHidAppArvStnNm(), commReservationRequest.getHidChtrnStnCd(), commReservationRequest.getHidChtrnStnNm(), commReservationRequest.getHidTrnNo1(), commReservationRequest.getHidTrnNo2(), commReservationRequest.getHidTrnGpCd1(), commReservationRequest.getHidTrnGpCd2(), commReservationRequest.getHidDtour1(), commReservationRequest.getHidDtour2());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_comm_reservation;
    }
}
