package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class SelfCheckinCancelDao extends BaseDao {

    public class SelfCheckinCancelRequest extends BaseRequest {
        private String jrnySqno;
        private String saleDt;
        private String saleSqno;
        private String saleWctNo;
        private String tkRetPwd;

        public SelfCheckinCancelRequest() {
        }

        public String getJrnySqno() {
            return this.jrnySqno;
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

        public void setJrnySqno(String str) {
            this.jrnySqno = str;
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

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        SelfCheckinCancelRequest selfCheckinCancelRequest = (SelfCheckinCancelRequest) getRequest();
        return ticketService.selfCheckinCancel(selfCheckinCancelRequest.getDevice(), selfCheckinCancelRequest.getVersion(), selfCheckinCancelRequest.getKey(), selfCheckinCancelRequest.getSaleWctNo(), selfCheckinCancelRequest.getSaleDt(), selfCheckinCancelRequest.getSaleSqno(), selfCheckinCancelRequest.getTkRetPwd(), selfCheckinCancelRequest.getJrnySqno());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_self_checkin_cancel;
    }
}
