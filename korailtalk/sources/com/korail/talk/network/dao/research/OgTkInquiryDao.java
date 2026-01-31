package com.korail.talk.network.dao.research;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.response.research.OrgTk;
import java.util.HashMap;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class OgTkInquiryDao extends BaseDao {

    public class OgTkInquiryRequest extends BaseRequest {
        private HashMap<String, String> ogTkData;
        private int tkCnt;

        public OgTkInquiryRequest() {
        }

        public HashMap<String, String> getOgTkData() {
            return this.ogTkData;
        }

        public int getTkCnt() {
            return this.tkCnt;
        }

        public void setOgTkData(HashMap<String, String> map) {
            this.ogTkData = map;
        }

        public void setTkCnt(int i8) {
            this.tkCnt = i8;
        }
    }

    public class OgTkInquiryResponse extends BaseResponse {
        private List<OrgTk> orgTkList;

        public OgTkInquiryResponse() {
        }

        public List<OrgTk> getOrgTkList() {
            return this.orgTkList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ResearchService researchService = (ResearchService) getService(ResearchService.class);
        OgTkInquiryRequest ogTkInquiryRequest = (OgTkInquiryRequest) getRequest();
        return researchService.getTicketOriginalInquiry(ogTkInquiryRequest.getDevice(), ogTkInquiryRequest.getVersion(), ogTkInquiryRequest.getKey(), ogTkInquiryRequest.getTkCnt(), ogTkInquiryRequest.getOgTkData());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_og_tk_inquiry;
    }
}
