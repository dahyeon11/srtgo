package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class RecentDeliveryHistoryDao extends BaseDao {

    public class Acep implements Serializable {
        private String acepCustMgFlg;
        private String acepCustMgNo;
        private String acepCustNm;
        private String acepCustTeln;
        private String acepCustTeln2;
        private String mbCrdNo;

        public Acep() {
        }

        public String getAcepCustMgFlg() {
            return this.acepCustMgFlg;
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

        public String getAcepCustTeln2() {
            return this.acepCustTeln2;
        }

        public String getMbCrdNo() {
            return this.mbCrdNo;
        }
    }

    public class RcntDlvHstRequest extends BaseRequest {
        String custMgNo;

        public RcntDlvHstRequest() {
        }

        public String getCustMgNo() {
            return this.custMgNo;
        }

        public void setCustMgNo(String str) {
            this.custMgNo = str;
        }
    }

    public class RcntDlvHstResponse extends BaseResponse {
        private List<Acep> acepList;

        public RcntDlvHstResponse() {
        }

        public List<Acep> getAcepList() {
            return this.acepList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        RcntDlvHstRequest rcntDlvHstRequest = (RcntDlvHstRequest) getRequest();
        return ticketService.rcntDlvHst(rcntDlvHstRequest.getDevice(), rcntDlvHstRequest.getVersion(), rcntDlvHstRequest.getKey(), rcntDlvHstRequest.getCustMgNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_recent_delivery_history;
    }
}
