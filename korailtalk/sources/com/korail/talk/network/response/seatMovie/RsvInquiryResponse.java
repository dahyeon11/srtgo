package com.korail.talk.network.response.seatMovie;

import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class RsvInquiryResponse extends BaseResponse implements Serializable {
    private String h_ectb_trn_no_next;
    private String h_gd_no;
    private String h_next_pg_flg;
    private String h_notice_msg;
    private String h_prcd_trn_no_next;
    private String h_qry_st_no_next;
    private String h_rslt_cnt;
    private String h_trn_no_next;
    private TrainInfos trn_infos;

    public class RcmdGdList implements Serializable {
        private String dcntAmt;
        private String dcntSurRt;
        private String famtPctDvCd;
        private String gdNm;
        private String gdNo;
        private String rcvdFare;
        private String rcvdPrc;
        private String rcvdPrc2;

        public RcmdGdList() {
        }

        public String getDcntAmt() {
            return this.dcntAmt;
        }

        public String getDcntSurRt() {
            return this.dcntSurRt;
        }

        public String getFamtPctDvCd() {
            return this.famtPctDvCd;
        }

        public String getGdNm() {
            return this.gdNm;
        }

        public String getGdNo() {
            return this.gdNo;
        }

        public String getRcvdFare() {
            return this.rcvdFare;
        }

        public String getRcvdPrc() {
            return this.rcvdPrc;
        }

        public String getRcvdPrc2() {
            return this.rcvdPrc2;
        }
    }

    public class TrainInfo implements Serializable {
        private String dturViaPopp;
        private String elevDmgCtrl;
        private String h_arv_dt;
        private String h_arv_rs_stn_cd;
        private String h_arv_rs_stn_nm;
        private String h_arv_stn_cons_ordr;
        private String h_arv_stn_run_ordr;
        private String h_arv_tm;
        private String h_car_tp_nm;
        private String h_chg_trn_dv_cd;
        private String h_chg_trn_seq;
        private String h_cnec_trfc_nd_hm;
        private String h_cnec_trfc_psb_flg;
        private String h_cnec_trfc_rcvd_prc;
        private String h_dlay_sale_flg;
        private String h_dpt_dt;
        private String h_dpt_rs_stn_cd;
        private String h_dpt_rs_stn_nm;
        private String h_dpt_stn_cons_ordr;
        private String h_dpt_stn_run_ordr;
        private String h_dpt_tm;
        private String h_dtour_flg;
        private String h_dtour_txt;
        private String h_expct_dlay_hr;
        private String h_expn_dpt_dlay_tnum;
        private String h_free_rsv_cd;
        private String h_free_sracar_cnt;
        private String h_gen_psrm_cl_nm;
        private String h_gen_rsv_cd;
        private String h_gen_rsv_cd2;
        private String h_info_txt;
        private String h_jrny_rsv_cd;
        private String h_jrny_rsv_nm;
        private String h_nonstop_msg;
        private String h_nonstop_msg_txt;
        private String h_popup_msg;
        private String h_rcvd_amt;
        private String h_rcvd_fare;
        private String h_rcvd_prc2;
        private String h_rd_seat_map_flg;
        private String h_rsv_psb_nm;
        private String h_run_dt;
        private String h_run_tm;
        private String h_seat_att_cd;
        private String h_smns_trn_flg;
        private String h_spe_disc_rt;
        private String h_spe_psrm_cl_nm;
        private String h_spe_rsv_cd;
        private String h_spe_rsv_cd2;
        private String h_spe_rsv_psb_nm;
        private String h_station_popup_msg;
        private String h_stnd_rsv_cd;
        private String h_train_disc_gen_rt;
        private String h_trn_clsf_cd;
        private String h_trn_clsf_nm;
        private String h_trn_gp_cd;
        private String h_trn_no;
        private String h_use_tim_care_atcl_cont;
        private String h_wait_rsv_flg;
        private String h_yms_apl_flg;
        private List<RcmdGdList> rcmdGdList;
        private int totPsgCnt;
        private String txtGdNo;

        public TrainInfo() {
        }

        public String getDtourTxt() {
            return this.h_dtour_txt;
        }

        public String getElevDmgCtrl() {
            return this.elevDmgCtrl;
        }

        public String getH_arv_dt() {
            return this.h_arv_dt;
        }

        public String getH_arv_rs_stn_cd() {
            return this.h_arv_rs_stn_cd;
        }

        public String getH_arv_rs_stn_nm() {
            return this.h_arv_rs_stn_nm;
        }

        public String getH_arv_stn_cons_ordr() {
            return this.h_arv_stn_cons_ordr;
        }

        public String getH_arv_stn_run_ordr() {
            return this.h_arv_stn_run_ordr;
        }

        public String getH_arv_tm() {
            return this.h_arv_tm;
        }

        public String getH_car_tp_nm() {
            return this.h_car_tp_nm;
        }

        public String getH_chg_trn_dv_cd() {
            return this.h_chg_trn_dv_cd;
        }

        public String getH_chg_trn_seq() {
            return this.h_chg_trn_seq;
        }

        public String getH_cnec_trfc_nd_hm() {
            return this.h_cnec_trfc_nd_hm;
        }

        public String getH_cnec_trfc_psb_flg() {
            return this.h_cnec_trfc_psb_flg;
        }

        public String getH_cnec_trfc_rcvd_prc() {
            return this.h_cnec_trfc_rcvd_prc;
        }

        public String getH_dlay_sale_flg() {
            return this.h_dlay_sale_flg;
        }

        public String getH_dpt_dt() {
            return this.h_dpt_dt;
        }

        public String getH_dpt_rs_stn_cd() {
            return this.h_dpt_rs_stn_cd;
        }

        public String getH_dpt_rs_stn_nm() {
            return this.h_dpt_rs_stn_nm;
        }

        public String getH_dpt_stn_cons_ordr() {
            return this.h_dpt_stn_cons_ordr;
        }

        public String getH_dpt_stn_run_ordr() {
            return this.h_dpt_stn_run_ordr;
        }

        public String getH_dpt_tm() {
            return this.h_dpt_tm;
        }

        public String getH_dtour_flg() {
            return this.h_dtour_flg;
        }

        public String getH_expct_dlay_hr() {
            return this.h_expct_dlay_hr;
        }

        public String getH_expn_dpt_dlay_tnum() {
            return this.h_expn_dpt_dlay_tnum;
        }

        public String getH_free_rsv_cd() {
            return this.h_free_rsv_cd;
        }

        public String getH_free_sracar_cnt() {
            return this.h_free_sracar_cnt;
        }

        public String getH_gen_psrm_cl_nm() {
            return this.h_gen_psrm_cl_nm;
        }

        public String getH_gen_rsv_cd() {
            return this.h_gen_rsv_cd;
        }

        public String getH_gen_rsv_cd2() {
            return this.h_gen_rsv_cd2;
        }

        public String getH_info_txt() {
            return this.h_info_txt;
        }

        public String getH_jrny_rsv_cd() {
            return this.h_jrny_rsv_cd;
        }

        public String getH_jrny_rsv_nm() {
            return this.h_jrny_rsv_nm;
        }

        public String getH_nonstop_msg() {
            return this.h_nonstop_msg;
        }

        public String getH_nonstop_msg_txt() {
            return this.h_nonstop_msg_txt;
        }

        public String getH_popup_msg() {
            return this.h_popup_msg;
        }

        public String getH_rcvd_amt() {
            return this.h_rcvd_amt;
        }

        public String getH_rcvd_fare() {
            return this.h_rcvd_fare;
        }

        public String getH_rd_seat_map_flg() {
            return this.h_rd_seat_map_flg;
        }

        public String getH_rsv_psb_nm() {
            return this.h_rsv_psb_nm;
        }

        public String getH_run_dt() {
            return this.h_run_dt;
        }

        public String getH_run_tm() {
            return this.h_run_tm;
        }

        public String getH_seat_att_cd() {
            return this.h_seat_att_cd;
        }

        public String getH_smns_trn_flg() {
            return this.h_smns_trn_flg;
        }

        public String getH_spe_disc_rt() {
            return this.h_spe_disc_rt;
        }

        public String getH_spe_psrm_cl_nm() {
            return this.h_spe_psrm_cl_nm;
        }

        public String getH_spe_rsv_cd() {
            return this.h_spe_rsv_cd;
        }

        public String getH_spe_rsv_cd2() {
            return this.h_spe_rsv_cd2;
        }

        public String getH_spe_rsv_psb_nm() {
            return this.h_spe_rsv_psb_nm;
        }

        public String getH_station_popup_msg() {
            return this.h_station_popup_msg;
        }

        public String getH_stnd_rsv_cd() {
            return this.h_stnd_rsv_cd;
        }

        public String getH_train_disc_gen_rt() {
            return this.h_train_disc_gen_rt;
        }

        public String getH_trn_clsf_cd() {
            return this.h_trn_clsf_cd;
        }

        public String getH_trn_clsf_nm() {
            return this.h_trn_clsf_nm;
        }

        public String getH_trn_gp_cd() {
            return this.h_trn_gp_cd;
        }

        public String getH_trn_no() {
            return this.h_trn_no;
        }

        public String getH_use_tim_care_atcl_cont() {
            return this.h_use_tim_care_atcl_cont;
        }

        public String getH_wait_rsv_flg() {
            return this.h_wait_rsv_flg;
        }

        public String getH_yms_apl_flg() {
            return this.h_yms_apl_flg;
        }

        public List<RcmdGdList> getRcmdGdList() {
            return this.rcmdGdList;
        }

        public int getTotPsgCnt() {
            return this.totPsgCnt;
        }

        public String getTxtGdNo() {
            return this.txtGdNo;
        }

        public String getdturViaPopp() {
            return this.dturViaPopp;
        }

        public void setH_arv_rs_stn_cd(String str) {
            this.h_arv_rs_stn_cd = str;
        }

        public void setH_arv_rs_stn_nm(String str) {
            this.h_arv_rs_stn_nm = str;
        }

        public void setH_arv_stn_run_ordr(String str) {
            this.h_arv_stn_run_ordr = str;
        }

        public void setH_dpt_dt(String str) {
            this.h_dpt_dt = str;
        }

        public void setH_dpt_rs_stn_cd(String str) {
            this.h_dpt_rs_stn_cd = str;
        }

        public void setH_dpt_rs_stn_nm(String str) {
            this.h_dpt_rs_stn_nm = str;
        }

        public void setH_dpt_stn_run_ordr(String str) {
            this.h_dpt_stn_run_ordr = str;
        }

        public void setH_run_dt(String str) {
            this.h_run_dt = str;
        }

        public void setH_seat_att_cd(String str) {
            this.h_seat_att_cd = str;
        }

        public void setH_smns_trn_flg(String str) {
            this.h_smns_trn_flg = str;
        }

        public void setH_trn_clsf_cd(String str) {
            this.h_trn_clsf_cd = str;
        }

        public void setH_trn_clsf_nm(String str) {
            this.h_trn_clsf_nm = str;
        }

        public void setH_trn_gp_cd(String str) {
            this.h_trn_gp_cd = str;
        }

        public void setH_trn_no(String str) {
            this.h_trn_no = str;
        }

        public void setTotPsgCnt(int i8) {
            this.totPsgCnt = i8;
        }

        public void setTxtGdNo(String str) {
            this.txtGdNo = str;
        }

        public void setdturViaPopp(String str) {
            this.dturViaPopp = str;
        }
    }

    public class TrainInfos {
        private String h_merge_rsv_psb_flg;
        private List<TrainInfo> trn_info;

        public TrainInfos() {
        }

        public String getH_merge_rsv_psb_flg() {
            return this.h_merge_rsv_psb_flg;
        }

        public List<TrainInfo> getTrn_info() {
            return this.trn_info;
        }
    }

    public String getH_ectb_trn_no_next() {
        return this.h_ectb_trn_no_next;
    }

    public String getH_gd_no() {
        return this.h_gd_no;
    }

    public String getH_next_pg_flg() {
        return this.h_next_pg_flg;
    }

    public String getH_notice_msg() {
        return this.h_notice_msg;
    }

    public String getH_prcd_trn_no_next() {
        return this.h_prcd_trn_no_next;
    }

    public String getH_qry_st_no_next() {
        return this.h_qry_st_no_next;
    }

    public String getH_rslt_cnt() {
        return this.h_rslt_cnt;
    }

    public String getH_trn_no_next() {
        return this.h_trn_no_next;
    }

    public TrainInfos getTrn_infos() {
        return this.trn_infos;
    }
}
