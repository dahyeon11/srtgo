package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MaasServiceDetailListDao extends BaseDao {

    public class AddSrvItem implements Serializable {
        private String addSrvDvCd;
        private String addSrvGdCd;
        private String addSrvId;
        private String addSrvMrkEntId;
        private String addSrvMrkEntNm;
        private String addSrvNm;
        private String addSrvPrgSttCd;
        private String addSrvReqNo;
        private String cgPsRefAtclCont;
        private String coptEntRsvNo;
        private String dlivPsbClsTm;
        private String dlivPsbStTm;
        private String leadMsgCont1;
        private String leadMsgCont2;
        private String pnrNo;
        private String reqDt;
        private String reqQnty;
        private String rsvSpecUrl;
        private String utlClsDt;
        private String utlStDt;

        public AddSrvItem() {
        }

        public String getAddSrvDvCd() {
            return this.addSrvDvCd;
        }

        public String getAddSrvGdCd() {
            return this.addSrvGdCd;
        }

        public String getAddSrvId() {
            return this.addSrvId;
        }

        public String getAddSrvMrkEntId() {
            return this.addSrvMrkEntId;
        }

        public String getAddSrvMrkEntNm() {
            return this.addSrvMrkEntNm;
        }

        public String getAddSrvNm() {
            return this.addSrvNm;
        }

        public String getAddSrvPrgSttCd() {
            return this.addSrvPrgSttCd;
        }

        public String getAddSrvReqNo() {
            return this.addSrvReqNo;
        }

        public String getCgPsRefAtclCont() {
            return this.cgPsRefAtclCont;
        }

        public String getCoptEntRsvNo() {
            return this.coptEntRsvNo;
        }

        public String getDlivPsbClsTm() {
            return this.dlivPsbClsTm;
        }

        public String getDlivPsbStTm() {
            return this.dlivPsbStTm;
        }

        public String getLeadMsgCont1() {
            return this.leadMsgCont1;
        }

        public String getLeadMsgCont2() {
            return this.leadMsgCont2;
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public String getReqDt() {
            return this.reqDt;
        }

        public String getReqQnty() {
            return this.reqQnty;
        }

        public String getRsvSpecUrl() {
            return this.rsvSpecUrl;
        }

        public String getUtlClsDt() {
            return this.utlClsDt;
        }

        public String getUtlStDt() {
            return this.utlStDt;
        }
    }

    public class MaasServivceDetailRequest extends BaseRequest {
        private String qryDtFrom;
        private String qryDtTo;

        public MaasServivceDetailRequest() {
        }

        public String getQryDtFrom() {
            return this.qryDtFrom;
        }

        public String getQryDtTo() {
            return this.qryDtTo;
        }

        public void setQryDtFrom(String str) {
            this.qryDtFrom = str;
        }

        public void setQryDtTo(String str) {
            this.qryDtTo = str;
        }
    }

    public class MaasServivceDetailResponse extends BaseResponse {
        private List<AddSrvItem> addSrvList;

        public MaasServivceDetailResponse() {
        }

        public List<AddSrvItem> getAddSrvList() {
            return this.addSrvList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        MaasServivceDetailRequest maasServivceDetailRequest = (MaasServivceDetailRequest) getRequest();
        return ticketService.getMaasServiceDetailList(maasServivceDetailRequest.getDevice(), maasServivceDetailRequest.getVersion(), maasServivceDetailRequest.getQryDtFrom(), maasServivceDetailRequest.getQryDtTo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_maas_service_detail;
    }
}
