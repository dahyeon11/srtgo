package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DlvRcvCustDao extends BaseDao {

    public class DlvRcvCustwRequest extends BaseRequest {
        private String saleDt;
        private String saleSqno;
        private String saleWctNo;
        private String tkRetPwd;

        public DlvRcvCustwRequest() {
        }

        public String getSaleDt() {
            return this.saleDt;
        }

        public String getSaleSqno() {
            return this.saleSqno;
        }

        public String getSaleWctNo() {
            return this.saleWctNo;
        }

        public String getTkRetPwd() {
            return this.tkRetPwd;
        }

        public void setSaleDt(String str) {
            this.saleDt = str;
        }

        public void setSaleSqno(String str) {
            this.saleSqno = str;
        }

        public void setSaleWctNo(String str) {
            this.saleWctNo = str;
        }

        public void setTkRetPwd(String str) {
            this.tkRetPwd = str;
        }
    }

    public class DlvRcvCustwResponse extends BaseResponse {
        private String acepCustMgNo;
        private String acepCustNm;
        private String acepCustTeln;
        private String mbCrdNo;

        public DlvRcvCustwResponse() {
        }

        public String getAcepCustMgNo() {
            return this.acepCustMgNo;
        }

        public String getAcepCustNm() {
            return this.acepCustNm;
        }

        public String getAcepCustTeln() {
            return this.acepCustTeln;
        }

        public String getMbCrdNo() {
            return this.mbCrdNo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        DlvRcvCustwRequest dlvRcvCustwRequest = (DlvRcvCustwRequest) getRequest();
        return ticketService.dlvRcvCust(dlvRcvCustwRequest.getDevice(), dlvRcvCustwRequest.getVersion(), dlvRcvCustwRequest.getKey(), dlvRcvCustwRequest.getSaleWctNo(), dlvRcvCustwRequest.getSaleDt(), dlvRcvCustwRequest.getSaleSqno(), dlvRcvCustwRequest.getTkRetPwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_delivery_ncard_user_info;
    }
}
