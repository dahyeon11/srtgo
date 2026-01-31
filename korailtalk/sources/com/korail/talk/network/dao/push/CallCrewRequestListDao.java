package com.korail.talk.network.dao.push;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CallCrewRequestListDao extends BaseDao {

    public class CallCrewDaoListRequest extends BaseRequest {
        private String qryDvCd;

        public CallCrewDaoListRequest() {
        }

        public String getQryDvCd() {
            return this.qryDvCd;
        }

        public void setQryDvCd(String str) {
            this.qryDvCd = str;
        }
    }

    public class CallCrewListResponse extends BaseResponse {
        private List<PrsList> prsList;

        public CallCrewListResponse() {
        }

        public List<PrsList> getPrsist() {
            return this.prsList;
        }
    }

    public class PrsList {
        private String intgMsgCd;
        private String prsCont;

        public PrsList() {
        }

        public String getIntgMsgCd() {
            return this.intgMsgCd;
        }

        public String getPrsCont() {
            return this.prsCont;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PushService pushService = (PushService) getService(PushService.class);
        CallCrewDaoListRequest callCrewDaoListRequest = (CallCrewDaoListRequest) getRequest();
        return pushService.callCrewRequestList(callCrewDaoListRequest.getDevice(), callCrewDaoListRequest.getVersion(), callCrewDaoListRequest.getKey(), callCrewDaoListRequest.getQryDvCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_call_crew_request_list;
    }
}
