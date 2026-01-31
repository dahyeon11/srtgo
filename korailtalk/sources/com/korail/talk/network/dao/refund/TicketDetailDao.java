package com.korail.talk.network.dao.refund;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.data.addService.ExtraProductInfo;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TicketDetailDao extends BaseDao {

    public class AddSrvList implements Serializable {
        private List<ExtraProductInfo> pnrList;

        public AddSrvList() {
        }

        public List<ExtraProductInfo> getPnrList() {
            return this.pnrList;
        }
    }

    public class AppSegInfo implements Serializable {
        private String arvRsStnNm;
        private String dcntCrdAplSegSqno;
        private String dptRsStnNm;
        private String jrnySqno;
        private String jrnyTpCd;
        private String stlbDturDvNm;
        private String trnGpCd;

        public AppSegInfo() {
        }

        public String getArvRsStnNm() {
            return this.arvRsStnNm;
        }

        public String getDcntCrdAplSegSqno() {
            return this.dcntCrdAplSegSqno;
        }

        public String getDptRsStnNm() {
            return this.dptRsStnNm;
        }

        public String getJrnySqno() {
            return this.jrnySqno;
        }

        public String getJrnyTpCd() {
            return this.jrnyTpCd;
        }

        public String getStlbDturDvNm() {
            return this.stlbDturDvNm;
        }

        public String getTrnGpCd() {
            return this.trnGpCd;
        }
    }

    public class CompanionInfo implements Serializable {
        public String h_cmpa_btdt;
        public String h_cmpa_nm;
        public String h_cmpa_sex_dv_cd;

        public CompanionInfo() {
        }

        public String getH_cmpa_btdt() {
            return this.h_cmpa_btdt;
        }

        public String getH_cmpa_nm() {
            return this.h_cmpa_nm;
        }

        public String getH_cmpa_sex_dv_cd() {
            return this.h_cmpa_sex_dv_cd;
        }
    }

    public class DelayInfo implements Serializable {
        private String actArvDlayTnum;
        private String actDptDlayTnum;
        private String expnArvDlayTnum;
        private String expnDptDlayTnum;
        private String orgTmnRsStnNm1;
        private String orgTmnRsStnNm2;

        public DelayInfo() {
        }

        public String getActArvDlayTnum() {
            return this.actArvDlayTnum;
        }

        public String getActDptDlayTnum() {
            return this.actDptDlayTnum;
        }

        public String getExpArvDlayTnum() {
            return this.expnArvDlayTnum;
        }

        public String getExpDptDlayTnum() {
            return this.expnDptDlayTnum;
        }

        public String getOrgTmnRsStnNm1() {
            return this.orgTmnRsStnNm1;
        }

        public String getOrgTmnRsStnNm2() {
            return this.orgTmnRsStnNm2;
        }
    }

    public class DiscountCardInfo implements Serializable {
        private List<AppSegInfo> appSegList;
        private String h_dcnt_crd_no;
        String h_dcnt_crd_trm_extn_psb_flg;

        public DiscountCardInfo() {
        }

        public List<AppSegInfo> getAppSeg_info() {
            return this.appSegList;
        }

        public String getH_dcnt_crd_no() {
            return this.h_dcnt_crd_no;
        }

        public String getH_dcnt_crd_trm_extn_psb_flg() {
            return this.h_dcnt_crd_trm_extn_psb_flg;
        }
    }

    public class FamilyInfo implements Serializable {
        private String psgNm;

        public FamilyInfo() {
        }

        public String getPsgNm() {
            return this.psgNm;
        }
    }

    public class Limousine implements Serializable {
        private String abrdSpot;
        private String guide;
        private String runTm;

        public Limousine() {
        }

        public String getAbrdSpot() {
            return this.abrdSpot;
        }

        public String getGuide() {
            return this.guide;
        }

        public String getRunTm() {
            return this.runTm;
        }
    }

    public class TicketDetailRequest extends BaseRequest {
        private String h_purchase_history;
        private String retPwd;
        private String saleDt;
        private String saleSqNo;
        private String wctNo;

        public TicketDetailRequest() {
        }

        public String getH_purchase_history() {
            return this.h_purchase_history;
        }

        public String getRetPwd() {
            return this.retPwd;
        }

        public String getSaleDt() {
            return this.saleDt;
        }

        public String getSaleSqNo() {
            return this.saleSqNo;
        }

        public String getWctNo() {
            return this.wctNo;
        }

        public void setH_purchase_history(String str) {
            this.h_purchase_history = str;
        }

        public void setRetPwd(String str) {
            this.retPwd = str;
        }

        public void setSaleDt(String str) {
            this.saleDt = str;
        }

        public void setSaleSqNo(String str) {
            this.saleSqNo = str;
        }

        public void setWctNo(String str) {
            this.wctNo = str;
        }
    }

    public class TicketDetailResponse extends BaseResponse implements Serializable {
        private String addSrvCancel;
        private String addSrvFlg;
        private AddSrvList addSrvList;
        private List<CompanionInfo> cmpa_info;
        private String cstmzPhrase;
        private DiscountCardInfo dcnt_crd_info;
        private List<DelayInfo> dtlList;
        private String gurdSmsFlg;
        private String h_abrd_ps_nm;
        private String h_abrd_ps_sex;
        private String h_cmtr_utl_trm_age_cd;
        private String h_cmtr_utl_trm_cd_nm;
        private String h_compa_brth;
        private String h_compa_nm;
        private String h_dlay_flg;
        private String h_dlay_tk_flg;
        private String h_dscp_no;
        private String h_dtour;
        private String h_orgtk_ret_pwd;
        private String h_orgtk_ret_sale_dt;
        private String h_orgtk_sale_sqno;
        private String h_orgtk_wct_no;
        private String h_pbp_acep_tgt_flg;
        private String h_pnr_no;
        private String h_qrcode;
        private String h_ret_flg;
        private String h_sale_dt;
        private String h_sale_tm;
        private String h_schd_tk_knd_cd;
        private String h_tk_knd_cd;
        private String h_tk_knd_nm;
        private String h_tot_disc_amt;
        private String h_tot_fare_amt;
        private String h_tot_rcvd_amt;
        private String h_trn_running_flg;
        private String h_wct_nm;
        private Limousine limousine;
        private String limousineRsvPsbFlg;
        private String mlgSaveFlg;
        private String parkingLotUrl;
        private String pbpAcepPsQryFlg;
        private String pbpAcepPsbFlg;
        private List<FamilyInfo> psgNmList;
        private String retPsbFlg;
        private String s_brth;
        private String seatAppPsbFlg;
        private String stnLeadFlg;
        private String stndAppPsbFlg;
        private String ticketTimeBgColor;
        private TicketInfos ticket_infos;
        private String tripChgFlg;
        private String whchSrvRcpFlg;
        private String whchSrvReqPsbFlg;

        public TicketDetailResponse() {
        }

        public String getAddSrvCancel() {
            return this.addSrvCancel;
        }

        public String getAddSrvFlg() {
            return this.addSrvFlg;
        }

        public AddSrvList getAddSrvList() {
            return this.addSrvList;
        }

        public List<CompanionInfo> getCmpa_info() {
            return this.cmpa_info;
        }

        public String getCstmzPhrase() {
            return this.cstmzPhrase;
        }

        public DiscountCardInfo getDcnt_crd_info() {
            return this.dcnt_crd_info;
        }

        public List<DelayInfo> getDtlList() {
            return this.dtlList;
        }

        public String getGurdSmsFlg() {
            return this.gurdSmsFlg;
        }

        public String getH_abrd_ps_nm() {
            return this.h_abrd_ps_nm;
        }

        public String getH_abrd_ps_sex() {
            return this.h_abrd_ps_sex;
        }

        public String getH_cmtr_utl_trm_age_cd() {
            return this.h_cmtr_utl_trm_age_cd;
        }

        public String getH_cmtr_utl_trm_cd_nm() {
            return this.h_cmtr_utl_trm_cd_nm;
        }

        public String getH_compa_brth() {
            return this.h_compa_brth;
        }

        public String getH_compa_nm() {
            return this.h_compa_nm;
        }

        public String getH_dlay_flg() {
            return this.h_dlay_flg;
        }

        public String getH_dlay_tk_flg() {
            return this.h_dlay_tk_flg;
        }

        public String getH_dscp_no() {
            return this.h_dscp_no;
        }

        public String getH_dtour() {
            return this.h_dtour;
        }

        public String getH_orgtk_ret_pwd() {
            return this.h_orgtk_ret_pwd;
        }

        public String getH_orgtk_ret_sale_dt() {
            return this.h_orgtk_ret_sale_dt;
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

        public String getH_qrcode() {
            return this.h_qrcode;
        }

        public String getH_ret_flg() {
            return this.h_ret_flg;
        }

        public String getH_sale_dt() {
            return this.h_sale_dt;
        }

        public String getH_sale_tm() {
            return this.h_sale_tm;
        }

        public String getH_schd_tk_knd_cd() {
            return this.h_schd_tk_knd_cd;
        }

        public String getH_tk_knd_cd() {
            return this.h_tk_knd_cd;
        }

        public String getH_tk_knd_nm() {
            return this.h_tk_knd_nm;
        }

        public String getH_tot_disc_amt() {
            return this.h_tot_disc_amt;
        }

        public String getH_tot_fare_amt() {
            return this.h_tot_fare_amt;
        }

        public String getH_tot_rcvd_amt() {
            return this.h_tot_rcvd_amt;
        }

        public String getH_trn_running_flg() {
            return this.h_trn_running_flg;
        }

        public String getH_wct_nm() {
            return this.h_wct_nm;
        }

        public Limousine getLimousine() {
            return this.limousine;
        }

        public String getLimousineRsvPsbFlg() {
            return this.limousineRsvPsbFlg;
        }

        public String getMlgSaveFlg() {
            return this.mlgSaveFlg;
        }

        public String getParkingLotUrl() {
            return this.parkingLotUrl;
        }

        public String getPbpAcepPsQryFl() {
            return this.pbpAcepPsQryFlg;
        }

        public String getPbpAcepPsbFlg() {
            return this.pbpAcepPsbFlg;
        }

        public List<FamilyInfo> getPsgNmList() {
            return this.psgNmList;
        }

        public String getRetPsbFlg() {
            return this.retPsbFlg;
        }

        public String getS_brth() {
            return this.s_brth;
        }

        public String getSeatAppPsbFlg() {
            return this.seatAppPsbFlg;
        }

        public String getStnLeadFlg() {
            return this.stnLeadFlg;
        }

        public String getStndAppPsbFlg() {
            return this.stndAppPsbFlg;
        }

        public String getTicketTimeBgColor() {
            return this.ticketTimeBgColor;
        }

        public TicketInfos getTicket_infos() {
            return this.ticket_infos;
        }

        public String getTripChgFlg() {
            return this.tripChgFlg;
        }

        public String getWhchSrvRcpFlg() {
            return this.whchSrvRcpFlg;
        }

        public String getWhchSrvReqPsbFlg() {
            return this.whchSrvReqPsbFlg;
        }

        public void setH_pbp_acep_tgt_flg(String str) {
            this.h_pbp_acep_tgt_flg = str;
        }
    }

    public class TicketInfo implements Serializable {
        private String cabFaclLead;
        private String h_arv_dt;
        private String h_arv_rs_stn_cd;
        private String h_arv_rs_stn_nm;
        private String h_arv_tm;
        private String h_ddck_scar_no;
        private String h_dpt_dt;
        private String h_dpt_rs_stn_cd;
        private String h_dpt_rs_stn_nm;
        private String h_dpt_tm;
        private String h_dvd_anx_dv_cd;
        private String h_itx_sixed_yn;
        private String h_jrny_sqno;
        private String h_jrny_tp_cd;
        private String h_menu_actv_flg;
        private String h_plf_no;
        private String h_psrm_cl_cd;
        private String h_psrm_cl_nm;
        private String h_trn_clsf_cd;
        private String h_trn_clsf_nm;
        private String h_trn_gp_cd;
        private String h_trn_no;
        private List<TicketSeatInfo> tk_seat_info;
        private String vrBnrUrl;

        public TicketInfo() {
        }

        public String getCabFaclLead() {
            return this.cabFaclLead;
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

        public String getH_ddck_scar_no() {
            return this.h_ddck_scar_no;
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

        public String getH_dvd_anx_dv_cd() {
            return this.h_dvd_anx_dv_cd;
        }

        public String getH_itx_sixed_yn() {
            return this.h_itx_sixed_yn;
        }

        public String getH_jrny_sqno() {
            return this.h_jrny_sqno;
        }

        public String getH_jrny_tp_cd() {
            return this.h_jrny_tp_cd;
        }

        public String getH_menu_actv_flg() {
            return this.h_menu_actv_flg;
        }

        public String getH_plf_no() {
            return this.h_plf_no;
        }

        public String getH_psrm_cl_cd() {
            return this.h_psrm_cl_cd;
        }

        public String getH_psrm_cl_nm() {
            return this.h_psrm_cl_nm;
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

        public List<TicketSeatInfo> getTk_seat_info() {
            return this.tk_seat_info;
        }

        public String getVrBnrUrl() {
            return this.vrBnrUrl;
        }
    }

    public class TicketInfos implements Serializable {
        private List<TicketInfo> ticket_info;

        public TicketInfos() {
        }

        public List<TicketInfo> getTicket_info() {
            return this.ticket_info;
        }
    }

    public class TicketSeatInfo implements Serializable {
        private String h_buy_ps_nm;
        private String h_chckn_stt_cd;
        private String h_dcnt_knd_cd;
        private String h_dcnt_knd_nm;
        private String h_psg_tp_cd;
        private String h_psg_tp_nm;
        private String h_seat_att_cd_2;
        private String h_seat_att_cd_4;
        private String h_seat_no;
        private String h_sgr_nm;
        private String h_srcar_no;

        public TicketSeatInfo() {
        }

        public String getH_buy_ps_nm() {
            return this.h_buy_ps_nm;
        }

        public String getH_chckn_stt_cd() {
            return this.h_chckn_stt_cd;
        }

        public String getH_dcnt_knd_cd() {
            return this.h_dcnt_knd_cd;
        }

        public String getH_dcnt_knd_nm() {
            return this.h_dcnt_knd_nm;
        }

        public String getH_psg_tp_cd() {
            return this.h_psg_tp_cd;
        }

        public String getH_psg_tp_nm() {
            return this.h_psg_tp_nm;
        }

        public String getH_seat_att_cd_2() {
            return this.h_seat_att_cd_2;
        }

        public String getH_seat_att_cd_4() {
            return this.h_seat_att_cd_4;
        }

        public String getH_seat_no() {
            return this.h_seat_no;
        }

        public String getH_sgr_nm() {
            return this.h_sgr_nm;
        }

        public String getH_srcar_no() {
            return this.h_srcar_no;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        RefundService refundService = (RefundService) getService(RefundService.class);
        TicketDetailRequest ticketDetailRequest = (TicketDetailRequest) getRequest();
        return refundService.getTicketDetail(ticketDetailRequest.getDevice(), ticketDetailRequest.getVersion(), ticketDetailRequest.getKey(), ticketDetailRequest.getSaleDt(), ticketDetailRequest.getWctNo(), ticketDetailRequest.getSaleSqNo(), ticketDetailRequest.getRetPwd(), ticketDetailRequest.getH_purchase_history());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_detail;
    }
}
