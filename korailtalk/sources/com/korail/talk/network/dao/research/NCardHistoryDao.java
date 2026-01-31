package com.korail.talk.network.dao.research;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class NCardHistoryDao extends BaseDao {

    public class NCardHistoryInfo {
        private String apdUsrFlg;
        private String arvStnNm;
        private String custNm;
        private String dptStnNm;
        private String runDt1;

        public NCardHistoryInfo() {
        }

        public String getApdUsrFlg() {
            return this.apdUsrFlg;
        }

        public String getArvStnNm() {
            return this.arvStnNm;
        }

        public String getCustNm() {
            return this.custNm;
        }

        public String getDptStnNm() {
            return this.dptStnNm;
        }

        public String getRunDt1() {
            return this.runDt1;
        }

        public void setApdUsrFlg(String str) {
            this.apdUsrFlg = str;
        }

        public void setArvStnNm(String str) {
            this.arvStnNm = str;
        }

        public void setCustNm(String str) {
            this.custNm = str;
        }

        public void setDptStnNm(String str) {
            this.dptStnNm = str;
        }

        public void setRunDt1(String str) {
            this.runDt1 = str;
        }
    }

    public class NCardHistoryRequest extends BaseRequest {
        private String dcntCrdNo;

        public NCardHistoryRequest() {
        }

        public String getDcntCrdNo() {
            return this.dcntCrdNo;
        }

        public void setDcntCrdNo(String str) {
            this.dcntCrdNo = str;
        }
    }

    public class NCardHistoryResponse extends BaseResponse {
        private List<NCardHistoryInfo> tkUseList;

        public NCardHistoryResponse() {
        }

        public List<NCardHistoryInfo> getTkUseList() {
            return this.tkUseList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ResearchService researchService = (ResearchService) getService(ResearchService.class);
        NCardHistoryRequest nCardHistoryRequest = (NCardHistoryRequest) getRequest();
        return researchService.getNCardHistory(nCardHistoryRequest.getDevice(), nCardHistoryRequest.getVersion(), nCardHistoryRequest.getKey(), nCardHistoryRequest.getDcntCrdNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_n_card_history;
    }
}
