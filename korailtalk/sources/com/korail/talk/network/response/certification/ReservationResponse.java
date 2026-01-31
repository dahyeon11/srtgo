package com.korail.talk.network.response.certification;

import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class ReservationResponse extends BaseResponse implements Serializable {
    private List<Dfpy> dfpyList;
    private String h_add_srv_flg;
    private String h_cust_mg_no;
    private String h_fmly_info_cfm_flg;
    private int h_hdcp_ctfc_num;
    private String h_ise_psb_dt;
    private String h_ise_psb_tm;
    private String h_jrny_cnt;
    private String h_msg_mndry;
    private String h_msg_txt5;
    private String h_ntisu_lmt;
    private String h_ntisu_lmt_dt;
    private String h_ntisu_lmt_tm;
    private String h_pay_limit_msg;
    private String h_payment_flg;
    private String h_payment_msg;
    private String h_pnr_no;
    private String h_pre_stl_tgt_flg;
    private String h_sprm_fare;
    private String h_tmp_job_sqno1;
    private String h_tmp_job_sqno2;
    private String h_tot_dcnt_amt;
    private String h_tot_fare;
    private String h_tot_prc;
    private String h_tot_rcvd_amt;
    private String h_wct_no;
    private JrnyInfos jrny_infos;
    private int ogtkRcvdAmt;
    private PsgDiscAddInfos psgDiscAdd_infos;
    private PsgInfos psg_infos;
    private int scnIndcAmt;
    private List<StopStn> stopStnList;
    private List<TK> tkList;
    private int totRetAmt;

    public class Dfpy implements Serializable {
        private String dfpyNo;
        private String dfpySrtCd;
        private String dscpMgNo;
        private int stlAmt;

        public Dfpy() {
        }

        public String getDfpyNo() {
            return this.dfpyNo;
        }

        public String getDfpySrtCd() {
            return this.dfpySrtCd;
        }

        public String getDscpMgNo() {
            return this.dscpMgNo;
        }

        public int getStlAmt() {
            return this.stlAmt;
        }
    }

    public class JrnyInfo implements Serializable {
        private String h_arv_rs_stn_cd;
        private String h_arv_rs_stn_nm;
        private String h_arv_stn_cons_ordr;
        private String h_arv_tm;
        private String h_dpt_dt;
        private String h_dpt_rs_stn_cd;
        private String h_dpt_rs_stn_nm;
        private String h_dpt_stn_cons_ordr;
        private String h_dpt_tm;
        private int h_fres_cnt;
        private String h_jrny_sqno;
        private String h_jrny_tp_cd;
        private String h_rsv_chg_no;
        private int h_seat_cnt;
        private String h_stlb_trn_clsf_cd;
        private int h_tot_seat_cnt;
        private int h_tot_stnd_cnt;
        private String h_trn_clsf_cd;
        private String h_trn_clsf_nm;
        private String h_trn_gp_cd;
        private String h_trn_no;
        private String lumpStlTgtNo;
        private SeatInfos seat_infos;

        public JrnyInfo() {
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

        public String getH_arv_tm() {
            return this.h_arv_tm;
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

        public String getH_dpt_tm() {
            return this.h_dpt_tm;
        }

        public int getH_fres_cnt() {
            return this.h_fres_cnt;
        }

        public String getH_jrny_sqno() {
            return this.h_jrny_sqno;
        }

        public String getH_jrny_tp_cd() {
            return this.h_jrny_tp_cd;
        }

        public String getH_rsv_chg_no() {
            return this.h_rsv_chg_no;
        }

        public int getH_seat_cnt() {
            return this.h_seat_cnt;
        }

        public String getH_stlb_trn_clsf_cd() {
            return this.h_stlb_trn_clsf_cd;
        }

        public int getH_tot_seat_cnt() {
            return this.h_tot_seat_cnt;
        }

        public int getH_tot_stnd_cnt() {
            return this.h_tot_stnd_cnt;
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

        public String getLumpStlTgtNo() {
            return this.lumpStlTgtNo;
        }

        public SeatInfos getSeat_infos() {
            return this.seat_infos;
        }
    }

    public class JrnyInfos implements Serializable {
        private List<JrnyInfo> jrny_info;

        public JrnyInfos() {
        }

        public List<JrnyInfo> getJrny_info() {
            return this.jrny_info;
        }
    }

    public class PsgDiscAddInfo implements Serializable {
        private String h_duty_ref_rcgn_ps_dv_cd;
        private int h_psg_sqno;

        public PsgDiscAddInfo() {
        }

        public String getH_duty_ref_rcgn_ps_dv_cd() {
            return this.h_duty_ref_rcgn_ps_dv_cd;
        }

        public int getH_psg_sqno() {
            return this.h_psg_sqno;
        }
    }

    public class PsgDiscAddInfos implements Serializable {
        private List<PsgDiscAddInfo> psgDiscAdd_info;

        public PsgDiscAddInfos() {
        }

        public List<PsgDiscAddInfo> getPsgDiscAdd_info() {
            return this.psgDiscAdd_info;
        }
    }

    public class PsgInfo implements Serializable {
        private String dlayOgtkRetPwd;
        private String dlayOgtkSaleDt;
        private String dlayOgtkSaleSqno;
        private String dlayOgtkWctNo;
        private String h_dcnt_knd_cd;
        private String h_dcnt_knd_cd2;
        private String h_dcsp_no;
        private String h_dcsp_no2;
        private String h_psg_info_per_prnb;
        private String h_psg_tp_cd;

        public PsgInfo() {
        }

        public String getDlayOgtkRetPwd() {
            return this.dlayOgtkRetPwd;
        }

        public String getDlayOgtkSaleDt() {
            return this.dlayOgtkSaleDt;
        }

        public String getDlayOgtkSaleSqno() {
            return this.dlayOgtkSaleSqno;
        }

        public String getDlayOgtkWctNo() {
            return this.dlayOgtkWctNo;
        }

        public String getH_dcnt_knd_cd() {
            return this.h_dcnt_knd_cd;
        }

        public String getH_dcnt_knd_cd2() {
            return this.h_dcnt_knd_cd2;
        }

        public String getH_dcsp_no() {
            return this.h_dcsp_no;
        }

        public String getH_dcsp_no2() {
            return this.h_dcsp_no2;
        }

        public String getH_psg_info_per_prnb() {
            return this.h_psg_info_per_prnb;
        }

        public String getH_psg_tp_cd() {
            return this.h_psg_tp_cd;
        }
    }

    public class PsgInfos implements Serializable {
        private List<PsgInfo> psg_info;

        public PsgInfos() {
        }

        public List<PsgInfo> getPsgInfos() {
            return this.psg_info;
        }
    }

    public class SeatInfo implements Serializable {
        private String dcnt_reld_no;
        public String h_dcnt_knd_cd1;
        public String h_dcnt_knd_cd2;
        public String h_dcnt_knd_cd3;
        public String h_dcnt_knd_cd4;
        public String h_dcnt_knd_cd5;
        private String h_dir_seat_att_cd;
        private String h_psg_tp_cd;
        private String h_psrm_cl_cd;
        private String h_psrm_cl_nm;
        private String h_rcvd_amt;
        private String h_rq_seat_att_cd;
        private String h_seat_fare;
        private String h_seat_no;
        private String h_seat_prc;
        private String h_sgr_nm;
        private String h_srcar_no;

        public SeatInfo() {
        }

        public String getDcnt_reld_no() {
            return this.dcnt_reld_no;
        }

        public String getH_dcnt_knd_cd1() {
            return this.h_dcnt_knd_cd1;
        }

        public String getH_dcnt_knd_cd2() {
            return this.h_dcnt_knd_cd2;
        }

        public String getH_dcnt_knd_cd3() {
            return this.h_dcnt_knd_cd3;
        }

        public String getH_dcnt_knd_cd4() {
            return this.h_dcnt_knd_cd4;
        }

        public String getH_dcnt_knd_cd5() {
            return this.h_dcnt_knd_cd5;
        }

        public String getH_dir_seat_att_cd() {
            return this.h_dir_seat_att_cd;
        }

        public String getH_psg_tp_cd() {
            return this.h_psg_tp_cd;
        }

        public String getH_psrm_cl_cd() {
            return this.h_psrm_cl_cd;
        }

        public String getH_psrm_cl_nm() {
            return this.h_psrm_cl_nm;
        }

        public String getH_rcvd_amt() {
            return this.h_rcvd_amt;
        }

        public String getH_rq_seat_att_cd() {
            return this.h_rq_seat_att_cd;
        }

        public String getH_seat_fare() {
            return this.h_seat_fare;
        }

        public String getH_seat_no() {
            return this.h_seat_no;
        }

        public String getH_seat_prc() {
            return this.h_seat_prc;
        }

        public String getH_sgr_nm() {
            return this.h_sgr_nm;
        }

        public String getH_srcar_no() {
            return this.h_srcar_no;
        }
    }

    public class SeatInfos implements Serializable {
        private List<SeatInfo> seat_info;

        public SeatInfos() {
        }

        public List<SeatInfo> getSeat_info() {
            return this.seat_info;
        }
    }

    public class StopStn implements Serializable {
        public String pnrNo;

        public StopStn() {
        }

        public String getPnrNo() {
            return this.pnrNo;
        }
    }

    public class TK implements Serializable {
        public String saleWctNo;

        public TK() {
        }

        public String getSaleWctNo() {
            return this.saleWctNo;
        }
    }

    public List<Dfpy> getDfpyList() {
        return this.dfpyList;
    }

    public String getH_add_srv_flg() {
        return this.h_add_srv_flg;
    }

    public String getH_cust_mg_no() {
        return this.h_cust_mg_no;
    }

    public String getH_fmly_info_cfm_flg() {
        return this.h_fmly_info_cfm_flg;
    }

    public int getH_hdcp_ctfc_num() {
        return this.h_hdcp_ctfc_num;
    }

    public String getH_ise_psb_dt() {
        return this.h_ise_psb_dt;
    }

    public String getH_ise_psb_tm() {
        return this.h_ise_psb_tm;
    }

    public String getH_jrny_cnt() {
        return this.h_jrny_cnt;
    }

    public String getH_msg_mndry() {
        return this.h_msg_mndry;
    }

    public String getH_msg_txt5() {
        return this.h_msg_txt5;
    }

    public String getH_ntisu_lmt() {
        return this.h_ntisu_lmt;
    }

    public String getH_ntisu_lmt_dt() {
        return this.h_ntisu_lmt_dt;
    }

    public String getH_ntisu_lmt_tm() {
        return this.h_ntisu_lmt_tm;
    }

    public String getH_payment_flg() {
        return this.h_payment_flg;
    }

    public String getH_payment_msg() {
        return this.h_payment_msg;
    }

    public String getH_pnr_no() {
        return this.h_pnr_no;
    }

    public String getH_pre_stl_tgt_flg() {
        return this.h_pre_stl_tgt_flg;
    }

    public String getH_sprm_fare() {
        return this.h_sprm_fare;
    }

    public String getH_tmp_job_sqno1() {
        return this.h_tmp_job_sqno1;
    }

    public String getH_tmp_job_sqno2() {
        return this.h_tmp_job_sqno2;
    }

    public String getH_tot_dcnt_amt() {
        return this.h_tot_dcnt_amt;
    }

    public String getH_tot_fare() {
        return this.h_tot_fare;
    }

    public String getH_tot_prc() {
        return this.h_tot_prc;
    }

    public String getH_tot_rcvd_amt() {
        return this.h_tot_rcvd_amt;
    }

    public String getH_wct_no() {
        return this.h_wct_no;
    }

    public JrnyInfos getJrny_infos() {
        return this.jrny_infos;
    }

    public int getOgtkRcvdAmt() {
        return this.ogtkRcvdAmt;
    }

    public String getPayLimitMsg() {
        return this.h_pay_limit_msg;
    }

    public PsgDiscAddInfos getPsgDiscAdd_infos() {
        return this.psgDiscAdd_infos;
    }

    public PsgInfos getPsg_infos() {
        return this.psg_infos;
    }

    public int getScnIndcAmt() {
        return this.scnIndcAmt;
    }

    public List<StopStn> getStopStnList() {
        return this.stopStnList;
    }

    public List<TK> getTkList() {
        return this.tkList;
    }

    public Integer getTotRetAmt() {
        return Integer.valueOf(this.totRetAmt);
    }

    public void setH_ise_psb_dt(String str) {
        this.h_ise_psb_dt = str;
    }

    public void setH_ise_psb_tm(String str) {
        this.h_ise_psb_tm = str;
    }

    public void setH_payment_flg(String str) {
        this.h_payment_flg = str;
    }

    public void setH_payment_msg(String str) {
        this.h_payment_msg = str;
    }

    public void setPsgDiscAdd_infos(PsgDiscAddInfos psgDiscAddInfos) {
        this.psgDiscAdd_infos = psgDiscAddInfos;
    }
}
