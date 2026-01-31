package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MaasServiceCancelDao extends BaseDao {

    public class MaasServiceCancelRequest extends BaseRequest {
        private String cncAddSrvReqNo;
        private String cncRetFee;
        private String cncTgtCnt;
        private String pnrNo;

        public MaasServiceCancelRequest() {
        }

        public String getCncAddSrvReqNo() {
            return this.cncAddSrvReqNo;
        }

        public String getCncRetFee() {
            return this.cncRetFee;
        }

        public String getCncTgtCnt() {
            return this.cncTgtCnt;
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public void setCncAddSrvReqNo(String str) {
            this.cncAddSrvReqNo = str;
        }

        public void setCncRetFee(String str) {
            this.cncRetFee = str;
        }

        public void setCncTgtCnt(String str) {
            this.cncTgtCnt = str;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        MaasServiceCancelRequest maasServiceCancelRequest = (MaasServiceCancelRequest) getRequest();
        return ticketService.getMaasServiceCancel(maasServiceCancelRequest.getDevice(), maasServiceCancelRequest.getVersion(), maasServiceCancelRequest.getPnrNo(), maasServiceCancelRequest.getCncTgtCnt(), maasServiceCancelRequest.getCncAddSrvReqNo(), maasServiceCancelRequest.getCncRetFee());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_maas_service_cancel;
    }
}
