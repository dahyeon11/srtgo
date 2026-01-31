package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TicketRsvInquiryDao extends BaseDao {

    public class TicketRsvInquiryRequest extends BaseRequest {
        private String hidPnrNo;

        public TicketRsvInquiryRequest() {
        }

        public String getHidPnrNo() {
            return this.hidPnrNo;
        }

        public void setHidPnrNo(String str) {
            this.hidPnrNo = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CertificationService certificationService = (CertificationService) getService(CertificationService.class);
        TicketRsvInquiryRequest ticketRsvInquiryRequest = (TicketRsvInquiryRequest) getRequest();
        return certificationService.inquiryTicketRsv(ticketRsvInquiryRequest.getDevice(), ticketRsvInquiryRequest.getVersion(), ticketRsvInquiryRequest.getKey(), ticketRsvInquiryRequest.getHidPnrNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_inquiry;
    }
}
