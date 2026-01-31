package com.korail.talk.network.dao.refund;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class RefundExecuteTicketRefundDao extends BaseDao {

    public class RefundExecuteTicketRefundRequest extends BaseRequest {
        private String acepCustNm;
        private String custTeln;
        private String ogtkRetPwd;
        private String ogtkSaleDt;
        private String ogtkSaleSqno;
        private String ogtkSaleWctNo;
        private String pnrNo;
        public String retAmt;
        private String retDvCd;
        public String retFee;
        private String retRsnCd;
        private String tkKndCd;

        public RefundExecuteTicketRefundRequest() {
        }

        public String getAcepCustNm() {
            return this.acepCustNm;
        }

        public String getCustTeln() {
            return this.custTeln;
        }

        public String getOgtkRetPwd() {
            return this.ogtkRetPwd;
        }

        public String getOgtkSaleDt() {
            return this.ogtkSaleDt;
        }

        public String getOgtkSaleSqno() {
            return this.ogtkSaleSqno;
        }

        public String getOgtkSaleWctNo() {
            return this.ogtkSaleWctNo;
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public String getRetAmt() {
            return this.retAmt;
        }

        public String getRetDvCd() {
            return this.retDvCd;
        }

        public String getRetFee() {
            return this.retFee;
        }

        public String getRetRsnCd() {
            return this.retRsnCd;
        }

        public String getTkKndCd() {
            return this.tkKndCd;
        }

        public void setAcepCustNm(String str) {
            this.acepCustNm = str;
        }

        public void setCustTeln(String str) {
            this.custTeln = str;
        }

        public void setOgtkRetPwd(String str) {
            this.ogtkRetPwd = str;
        }

        public void setOgtkSaleDt(String str) {
            this.ogtkSaleDt = str;
        }

        public void setOgtkSaleSqno(String str) {
            this.ogtkSaleSqno = str;
        }

        public void setOgtkSaleWctNo(String str) {
            this.ogtkSaleWctNo = str;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }

        public void setRetAmt(String str) {
            this.retAmt = str;
        }

        public void setRetDvCd(String str) {
            this.retDvCd = str;
        }

        public void setRetFee(String str) {
            this.retFee = str;
        }

        public void setRetRsnCd(String str) {
            this.retRsnCd = str;
        }

        public void setTkKndCd(String str) {
            this.tkKndCd = str;
        }
    }

    public class RefundExecuteTicketRefundResponse extends BaseResponse {
        private String h_ret_dv_cd;

        public RefundExecuteTicketRefundResponse() {
        }

        public String getH_ret_dv_cd() {
            return this.h_ret_dv_cd;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        RefundService refundService = (RefundService) getService(RefundService.class);
        RefundExecuteTicketRefundRequest refundExecuteTicketRefundRequest = (RefundExecuteTicketRefundRequest) getRequest();
        return refundService.executeOnlineRefunds(refundExecuteTicketRefundRequest.getDevice(), refundExecuteTicketRefundRequest.getVersion(), refundExecuteTicketRefundRequest.getKey(), refundExecuteTicketRefundRequest.getPnrNo(), refundExecuteTicketRefundRequest.getTkKndCd(), refundExecuteTicketRefundRequest.getRetDvCd(), refundExecuteTicketRefundRequest.getRetRsnCd(), refundExecuteTicketRefundRequest.getOgtkSaleDt(), refundExecuteTicketRefundRequest.getOgtkSaleWctNo(), refundExecuteTicketRefundRequest.getOgtkSaleSqno(), refundExecuteTicketRefundRequest.getOgtkRetPwd(), refundExecuteTicketRefundRequest.getRetAmt(), refundExecuteTicketRefundRequest.getRetFee(), refundExecuteTicketRefundRequest.getCustTeln(), refundExecuteTicketRefundRequest.getAcepCustNm());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_execute_ticket_refund;
    }
}
