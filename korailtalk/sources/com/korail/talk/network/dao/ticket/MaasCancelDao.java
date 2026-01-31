package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MaasCancelDao extends BaseDao {

    public class MaasCancelRequest extends BaseRequest {
        private String custMgNo;
        private String lumpStlTgtNo;

        public MaasCancelRequest() {
        }

        public String getCustMgNo() {
            return this.custMgNo;
        }

        public String getLumpStlTgtNo() {
            return this.lumpStlTgtNo;
        }

        public void setCustMgNo(String str) {
            this.custMgNo = str;
        }

        public void setLumpStlTgtNo(String str) {
            this.lumpStlTgtNo = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        MaasCancelRequest maasCancelRequest = (MaasCancelRequest) getRequest();
        return ticketService.getMaasCancel(maasCancelRequest.getDevice(), maasCancelRequest.getVersion(), maasCancelRequest.getCustMgNo(), maasCancelRequest.getLumpStlTgtNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_maas_cancel;
    }
}
