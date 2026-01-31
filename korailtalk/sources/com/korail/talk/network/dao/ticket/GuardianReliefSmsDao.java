package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class GuardianReliefSmsDao extends BaseDao implements Serializable {

    public class GuardianReliefSmsRequest extends BaseRequest implements Serializable {
        public String jrnySqno;
        public String pnrNo;
        public String rcvPsHndyTeln;

        public GuardianReliefSmsRequest() {
        }

        public String getJrnySqno() {
            return this.jrnySqno;
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public String getRcvPsHndyTeln() {
            return this.rcvPsHndyTeln;
        }

        public void setJrnySqno(String str) {
            this.jrnySqno = str;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }

        public void setRcvPsHndyTeln(String str) {
            this.rcvPsHndyTeln = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        GuardianReliefSmsRequest guardianReliefSmsRequest = (GuardianReliefSmsRequest) getRequest();
        return ticketService.gurdSmsSnd(guardianReliefSmsRequest.getDevice(), guardianReliefSmsRequest.getVersion(), guardianReliefSmsRequest.getKey(), guardianReliefSmsRequest.getPnrNo(), guardianReliefSmsRequest.getJrnySqno(), guardianReliefSmsRequest.getRcvPsHndyTeln());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_guardian_relief_sms;
    }
}
