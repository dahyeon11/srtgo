package com.korail.talk.network.dao.refund;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class RefundCommissionDao extends BaseDao {

    public class RefundCommissionRequest extends BaseRequest {
        private String h_comp_cert_no;
        private String h_comp_nm;
        private String h_orgtk_ret_pwd;
        private String h_orgtk_ret_sale_dt;
        private String h_orgtk_sale_sqno;
        private String h_orgtk_wct_no;

        public RefundCommissionRequest() {
        }

        public String getH_comp_cert_no() {
            return this.h_comp_cert_no;
        }

        public String getH_comp_nm() {
            return this.h_comp_nm;
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

        public void setH_comp_cert_no(String str) {
            this.h_comp_cert_no = str;
        }

        public void setH_comp_nm(String str) {
            this.h_comp_nm = str;
        }

        public void setH_orgtk_ret_pwd(String str) {
            this.h_orgtk_ret_pwd = str;
        }

        public void setH_orgtk_ret_sale_dt(String str) {
            this.h_orgtk_ret_sale_dt = str;
        }

        public void setH_orgtk_sale_sqno(String str) {
            this.h_orgtk_sale_sqno = str;
        }

        public void setH_orgtk_wct_no(String str) {
            this.h_orgtk_wct_no = str;
        }
    }

    public class RefundCommissionResponse extends BaseResponse {
        private String h_msg_cd2;
        private String h_msg_txt2;
        private String prg_psb_flg;
        private String ret_amt;
        private String ret_fee;
        private String tk_ret_tms_dv_cd;
        private String use_psb_mlg_num;

        public RefundCommissionResponse() {
        }

        public String getH_msg_cd2() {
            return this.h_msg_cd2;
        }

        public String getH_msg_txt2() {
            return this.h_msg_txt2;
        }

        public String getPrg_psb_flg() {
            return this.prg_psb_flg;
        }

        public String getRet_amt() {
            return this.ret_amt;
        }

        public String getRet_fee() {
            return this.ret_fee;
        }

        public String getTk_ret_tms_dv_cd() {
            return this.tk_ret_tms_dv_cd;
        }

        public String getUse_psb_mlg_num() {
            return this.use_psb_mlg_num;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        RefundService refundService = (RefundService) getService(RefundService.class);
        RefundCommissionRequest refundCommissionRequest = (RefundCommissionRequest) getRequest();
        return refundService.getTicketCommission(refundCommissionRequest.getDevice(), refundCommissionRequest.getVersion(), refundCommissionRequest.getKey(), refundCommissionRequest.getH_orgtk_ret_sale_dt(), refundCommissionRequest.getH_orgtk_wct_no(), refundCommissionRequest.getH_orgtk_sale_sqno(), refundCommissionRequest.getH_orgtk_ret_pwd(), refundCommissionRequest.getH_comp_nm(), refundCommissionRequest.getH_comp_cert_no());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_commition;
    }
}
