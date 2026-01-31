package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MaasServiceCancelFeeDao extends BaseDao {

    public class MaasServiceCancelFeeRequest extends BaseRequest {
        private String addSrvDvCd;
        private String addSrvReqNo;
        private String coptEntRsvNo;

        public MaasServiceCancelFeeRequest() {
        }

        public String getAddSrvDvCd() {
            return this.addSrvDvCd;
        }

        public String getAddSrvReqNo() {
            return this.addSrvReqNo;
        }

        public String getCoptEntRsvNo() {
            return this.coptEntRsvNo;
        }

        public void setAddSrvDvCd(String str) {
            this.addSrvDvCd = str;
        }

        public void setAddSrvReqNo(String str) {
            this.addSrvReqNo = str;
        }

        public void setCoptEntRsvNo(String str) {
            this.coptEntRsvNo = str;
        }
    }

    public class MaasServiceCancelFeeResponse extends BaseResponse {
        private String cncRetFee;

        public MaasServiceCancelFeeResponse() {
        }

        public String getCncRetFee() {
            return this.cncRetFee;
        }

        public void setCncRetFee(String str) {
            this.cncRetFee = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        MaasServiceCancelFeeRequest maasServiceCancelFeeRequest = (MaasServiceCancelFeeRequest) getRequest();
        return ticketService.getMaasServiceCancelFee(maasServiceCancelFeeRequest.getDevice(), maasServiceCancelFeeRequest.getVersion(), maasServiceCancelFeeRequest.getKey(), maasServiceCancelFeeRequest.getAddSrvReqNo(), maasServiceCancelFeeRequest.getAddSrvDvCd(), maasServiceCancelFeeRequest.getCoptEntRsvNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_maas_service_cancel_fee;
    }
}
