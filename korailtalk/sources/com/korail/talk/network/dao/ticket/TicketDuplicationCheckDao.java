package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TicketDuplicationCheckDao extends BaseDao {

    public class DuplicationCheckRequest extends BaseRequest {
        private String pnrNo;

        public DuplicationCheckRequest() {
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }
    }

    public class DuplicationCheckResponse extends BaseResponse {
        private int rsvCnt;

        public DuplicationCheckResponse() {
        }

        public int getRsvCnt() {
            return this.rsvCnt;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        DuplicationCheckRequest duplicationCheckRequest = (DuplicationCheckRequest) getRequest();
        return ticketService.duplicationCheck(duplicationCheckRequest.getDevice(), duplicationCheckRequest.getVersion(), duplicationCheckRequest.getKey(), duplicationCheckRequest.getPnrNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_duplication_check;
    }
}
