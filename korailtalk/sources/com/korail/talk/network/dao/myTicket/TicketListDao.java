package com.korail.talk.network.dao.myTicket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TicketListDao extends BaseDao {
    private boolean isPending = true;

    public class ReservationList {
        private List<TicketList> ticket_list;

        public ReservationList() {
        }

        public List<TicketList> getTicket_list() {
            return this.ticket_list;
        }

        public void setTicket_list(List<TicketList> list) {
            this.ticket_list = list;
        }
    }

    public class TicketList implements Serializable {
        private List<TrainInfo> train_info;

        public TicketList() {
        }

        public List<TrainInfo> getTrain_info() {
            return this.train_info;
        }

        public void setTrain_info(List<TrainInfo> list) {
            this.train_info = list;
        }
    }

    public class TicketListRequest extends BaseRequest {
        private String hAbrdDtFrom;
        private String hAbrdDtTo;
        private String hPageNo;
        private String hidName;
        private String hidPwd;
        private String hidTeleNo;
        private String hiduserYn;
        private String tsRsStnCd;
        private String txtDeviceId;
        private String txtIndex;

        public TicketListRequest() {
        }

        public String getHidName() {
            return this.hidName;
        }

        public String getHidPwd() {
            return this.hidPwd;
        }

        public String getHidTeleNo() {
            return this.hidTeleNo;
        }

        public String getHiduserYn() {
            return this.hiduserYn;
        }

        public String getTsRsStnCd() {
            return this.tsRsStnCd;
        }

        public String getTxtDeviceId() {
            return this.txtDeviceId;
        }

        public String getTxtIndex() {
            return this.txtIndex;
        }

        public String gethAbrdDtFrom() {
            return this.hAbrdDtFrom;
        }

        public String gethAbrdDtTo() {
            return this.hAbrdDtTo;
        }

        public String gethPageNo() {
            return this.hPageNo;
        }

        public void setHidName(String str) {
            this.hidName = str;
        }

        public void setHidPwd(String str) {
            this.hidPwd = str;
        }

        public void setHidTeleNo(String str) {
            this.hidTeleNo = str;
        }

        public void setHiduserYn(String str) {
            this.hiduserYn = str;
        }

        public void setTsRsStnCd(String str) {
            this.tsRsStnCd = str;
        }

        public void setTxtDeviceId(String str) {
            this.txtDeviceId = str;
        }

        public void setTxtIndex(String str) {
            this.txtIndex = str;
        }

        public void sethAbrdDtFrom(String str) {
            this.hAbrdDtFrom = str;
        }

        public void sethAbrdDtTo(String str) {
            this.hAbrdDtTo = str;
        }

        public void sethPageNo(String str) {
            this.hPageNo = str;
        }
    }

    public class TicketListResponse extends BaseResponse {
        private List<ReservationList> reservation_list;

        public TicketListResponse() {
        }

        public List<ReservationList> getReservation_list() {
            return this.reservation_list;
        }
    }

    public class TrainInfo implements Serializable {
        private String apdUsrFlg;
        private String cmtrVlidFlg;
        private String dvcInfoSmnsFlg;
        private String h_abrd_ps_nm;
        private String h_arv_dt;
        private String h_arv_rs_stn_cd;
        private String h_arv_rs_stn_nm;
        private String h_arv_tm;
        private String h_buy_ps_nm;
        private String h_dpt_dt;
        private String h_dpt_rs_stn_cd;
        private String h_dpt_rs_stn_nm;
        private String h_dpt_tm;
        private String h_jrny_sqno;
        private String h_orgtk_ret_pwd;
        private String h_orgtk_ret_sale_dt;
        private String h_orgtk_sale_dt;
        private String h_orgtk_sale_sqno;
        private String h_orgtk_wct_no;
        private String h_pbp_acep_tgt_flg;
        private String h_pnr_no;
        private String h_psg_tp_cd;
        private String h_psrm_cl_cd;
        private String h_rcvd_amt;
        private String h_rsv_chg_tno;
        private String h_run_dt;
        private String h_seat_cnt;
        private String h_seat_no;
        private String h_seat_no_end;
        private String h_sgr_nm_1;
        private String h_sgr_nm_2;
        private String h_srcar_no;
        private String h_tk_knd_cd;
        private String h_tk_knd_nm;
        private String h_tk_sqno;
        private String h_trn_clsf_cd;
        private String h_trn_clsf_nm;
        private String h_trn_no;
        private String pbpRsvNo;
        private String runClsFlg;
        private String stpvFlg;
        private String trnSpsFlg;

        public TrainInfo() {
        }

        public String getApdUsrFlg() {
            return this.apdUsrFlg;
        }

        public String getCmtrVlidFlg() {
            return this.cmtrVlidFlg;
        }

        public String getDvcInfoSmnsFlg() {
            return this.dvcInfoSmnsFlg;
        }

        public String getH_abrd_ps_nm() {
            return this.h_abrd_ps_nm;
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

        public String getH_arv_tm() {
            return this.h_arv_tm;
        }

        public String getH_buy_ps_nm() {
            return this.h_buy_ps_nm;
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

        public String getH_dpt_tm() {
            return this.h_dpt_tm;
        }

        public String getH_jrny_sqno() {
            return this.h_jrny_sqno;
        }

        public String getH_orgtk_ret_pwd() {
            return this.h_orgtk_ret_pwd;
        }

        public String getH_orgtk_ret_sale_dt() {
            return this.h_orgtk_ret_sale_dt;
        }

        public String getH_orgtk_sale_dt() {
            return this.h_orgtk_sale_dt;
        }

        public String getH_orgtk_sale_sqno() {
            return this.h_orgtk_sale_sqno;
        }

        public String getH_orgtk_wct_no() {
            return this.h_orgtk_wct_no;
        }

        public String getH_pbp_acep_tgt_flg() {
            return this.h_pbp_acep_tgt_flg;
        }

        public String getH_pnr_no() {
            return this.h_pnr_no;
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

        public String getH_rsv_chg_tno() {
            return this.h_rsv_chg_tno;
        }

        public String getH_run_dt() {
            return this.h_run_dt;
        }

        public String getH_seat_cnt() {
            return this.h_seat_cnt;
        }

        public String getH_seat_no() {
            return this.h_seat_no;
        }

        public String getH_seat_no_end() {
            return this.h_seat_no_end;
        }

        public String getH_sgr_nm_1() {
            return this.h_sgr_nm_1;
        }

        public String getH_sgr_nm_2() {
            return this.h_sgr_nm_2;
        }

        public String getH_srcar_no() {
            return this.h_srcar_no;
        }

        public String getH_tk_knd_cd() {
            return this.h_tk_knd_cd;
        }

        public String getH_tk_knd_nm() {
            return this.h_tk_knd_nm;
        }

        public String getH_tk_sqno() {
            return this.h_tk_sqno;
        }

        public String getH_trn_clsf_cd() {
            return this.h_trn_clsf_cd;
        }

        public String getH_trn_clsf_nm() {
            return this.h_trn_clsf_nm;
        }

        public String getH_trn_no() {
            return this.h_trn_no;
        }

        public String getPbpRsvNo() {
            return this.pbpRsvNo;
        }

        public String getRunClsFlg() {
            return this.runClsFlg;
        }

        public String getStpvFlg() {
            return this.stpvFlg;
        }

        public String getTrnSpsFlg() {
            return this.trnSpsFlg;
        }

        public void setStpvFlg(String str) {
            this.stpvFlg = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        MyTicketService myTicketService = (MyTicketService) getService(MyTicketService.class);
        TicketListRequest ticketListRequest = (TicketListRequest) getRequest();
        return myTicketService.getTicketList(ticketListRequest.getDevice(), ticketListRequest.getVersion(), ticketListRequest.getKey(), ticketListRequest.getTxtDeviceId(), ticketListRequest.getTxtIndex(), ticketListRequest.gethPageNo(), ticketListRequest.gethAbrdDtFrom(), ticketListRequest.gethAbrdDtTo(), ticketListRequest.getHiduserYn(), ticketListRequest.getHidName(), ticketListRequest.getHidTeleNo(), ticketListRequest.getHidPwd(), ticketListRequest.getTsRsStnCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_list;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return this.isPending;
    }

    public void isPending(boolean z8) {
        this.isPending = z8;
    }
}
