package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class SelfCheckinRegisterDao extends BaseDao {

    public class SelfCheckinRegisterRequest extends BaseRequest {
        private String cpsNo;
        private String jrnySqno;
        private String saleDd;
        private String saleSqno;
        private String saleWctNo;
        private String scarNo;
        private String seatNo;
        private String tkRetPwd;

        public SelfCheckinRegisterRequest() {
        }

        public String getCpsNo() {
            return this.cpsNo;
        }

        public String getJrnySqno() {
            return this.jrnySqno;
        }

        public String getSaleDd() {
            return this.saleDd;
        }

        public String getSaleSqno() {
            return this.saleSqno;
        }

        public String getSaleWctNo() {
            return this.saleWctNo;
        }

        public String getScarNo() {
            return this.scarNo;
        }

        public String getSeatNo() {
            return this.seatNo;
        }

        public String getTkRetPwd() {
            return this.tkRetPwd;
        }

        public void setCpsNo(String str) {
            this.cpsNo = str;
        }

        public void setJrnySqno(String str) {
            this.jrnySqno = str;
        }

        public void setSaleDd(String str) {
            this.saleDd = str;
        }

        public void setSaleSqno(String str) {
            this.saleSqno = str;
        }

        public void setSaleWctNo(String str) {
            this.saleWctNo = str;
        }

        public void setScarNo(String str) {
            this.scarNo = str;
        }

        public void setSeatNo(String str) {
            this.seatNo = str;
        }

        public void setTkRetPwd(String str) {
            this.tkRetPwd = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        SelfCheckinRegisterRequest selfCheckinRegisterRequest = (SelfCheckinRegisterRequest) getRequest();
        return ticketService.selfCheckinRegister(selfCheckinRegisterRequest.getDevice(), selfCheckinRegisterRequest.getVersion(), selfCheckinRegisterRequest.getKey(), selfCheckinRegisterRequest.getCpsNo(), selfCheckinRegisterRequest.getScarNo(), selfCheckinRegisterRequest.getSeatNo(), selfCheckinRegisterRequest.getSaleWctNo(), selfCheckinRegisterRequest.getSaleDd(), selfCheckinRegisterRequest.getSaleSqno(), selfCheckinRegisterRequest.getTkRetPwd(), selfCheckinRegisterRequest.getJrnySqno());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_self_checkin_register;
    }
}
