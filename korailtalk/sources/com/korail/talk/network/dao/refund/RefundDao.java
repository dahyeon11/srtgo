package com.korail.talk.network.dao.refund;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;
import z4.t;

/* loaded from: classes.dex */
public class RefundDao extends BaseDao {

    public class RefundRequest extends BaseRequest {
        private String h_mlg_stl;
        private String h_orgtk_ret_pwd;
        private String h_orgtk_sale_dt;
        private String h_orgtk_sale_sqno;
        private String h_orgtk_wct_no;
        private String latitude;
        private String longitude;
        private String pbpAcepTgtFlg;
        private String tk_ret_tms_dv_cd;
        private String trnNo;
        private String txtPnrNo;

        public RefundRequest() {
        }

        public String getH_mlg_stl() {
            return this.h_mlg_stl;
        }

        public String getH_orgtk_ret_pwd() {
            return this.h_orgtk_ret_pwd;
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

        public String getLatitude() {
            return this.latitude;
        }

        public String getLongitude() {
            return this.longitude;
        }

        public String getPbpAcepTgtFlg() {
            return this.pbpAcepTgtFlg;
        }

        public String getTk_ret_tms_dv_cd() {
            return this.tk_ret_tms_dv_cd;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public String getTxtPnrNo() {
            return this.txtPnrNo;
        }

        public void setH_mlg_stl(String str) {
            this.h_mlg_stl = str;
        }

        public void setH_orgtk_ret_pwd(String str) {
            this.h_orgtk_ret_pwd = str;
        }

        public void setH_orgtk_sale_dt(String str) {
            this.h_orgtk_sale_dt = str;
        }

        public void setH_orgtk_sale_sqno(String str) {
            this.h_orgtk_sale_sqno = str;
        }

        public void setH_orgtk_wct_no(String str) {
            this.h_orgtk_wct_no = str;
        }

        public void setLatitude(String str) {
            this.latitude = str;
        }

        public void setLongitude(String str) {
            this.longitude = str;
        }

        public void setPbpAcepTgtFlg(String str) {
            this.pbpAcepTgtFlg = str;
        }

        public void setTk_ret_tms_dv_cd(String str) {
            this.tk_ret_tms_dv_cd = str;
        }

        public void setTrnNo(String str) {
            this.trnNo = str;
        }

        public void setTxtPnrNo(String str) {
            this.txtPnrNo = str;
        }
    }

    public class RefundResponse extends BaseResponse {
        private List<StlList> stlList;

        public RefundResponse() {
        }

        public List<StlList> getStlList() {
            return this.stlList;
        }
    }

    public class StlList {
        private String stl_mns_cd;

        public StlList() {
        }

        public String getStl_mns_cd() {
            return this.stl_mns_cd;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        RefundService refundService = (RefundService) getService(RefundService.class);
        RefundRequest refundRequest = (RefundRequest) getRequest();
        t.e("PbpAcepTgtFlg : " + refundRequest.getPbpAcepTgtFlg());
        return refundService.returnTicket(refundRequest.getDevice(), refundRequest.getVersion(), refundRequest.getKey(), refundRequest.getTxtPnrNo(), refundRequest.getH_orgtk_sale_dt(), refundRequest.getH_orgtk_wct_no(), refundRequest.getH_orgtk_sale_sqno(), refundRequest.getH_orgtk_ret_pwd(), refundRequest.getH_mlg_stl(), refundRequest.getTk_ret_tms_dv_cd(), refundRequest.getTrnNo(), refundRequest.getPbpAcepTgtFlg(), refundRequest.getLatitude(), refundRequest.getLongitude());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_return;
    }
}
