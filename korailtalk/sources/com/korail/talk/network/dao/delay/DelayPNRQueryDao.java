package com.korail.talk.network.dao.delay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DelayPNRQueryDao extends BaseDao {
    public static final String JOB_DV_CD_RESERVATION = "0";
    public static final String JOB_DV_CD_TICKET_CHANGE = "1";

    public class Delay {
        private String dlayAcptFlg;
        private String jrnyOrdr;
        private String jrnyTpCd;
        private String runDt;
        private String trnNo;

        public Delay() {
        }

        public String getDlayAcptFlg() {
            return this.dlayAcptFlg;
        }

        public String getJrnyOrdr() {
            return this.jrnyOrdr;
        }

        public String getJrnyTpCd() {
            return this.jrnyTpCd;
        }

        public String getRunDt() {
            return this.runDt;
        }

        public String getTrnNo() {
            return this.trnNo;
        }
    }

    public class DelayPNRQueryRequest extends BaseRequest {
        private String jobDvCd;
        private List<String> ogtkWctNoList;
        private int pnrCnt;
        private List<String> pnrList;

        public DelayPNRQueryRequest() {
        }

        public String getJobDvCd() {
            return this.jobDvCd;
        }

        public List<String> getOgtkWctNoList() {
            return this.ogtkWctNoList;
        }

        public int getPnrCnt() {
            return this.pnrCnt;
        }

        public List<String> getPnrList() {
            return this.pnrList;
        }

        public void setJobDvCd(String str) {
            this.jobDvCd = str;
        }

        public void setOgtkWctNoList(List<String> list) {
            this.ogtkWctNoList = list;
        }

        public void setPnrCnt(int i8) {
            this.pnrCnt = i8;
        }

        public void setPnrList(List<String> list) {
            this.pnrList = list;
        }
    }

    public class DelayPNRQueryResponse extends BaseResponse {
        private List<Main> mainList;

        public DelayPNRQueryResponse() {
        }

        public List<Main> getMain() {
            return this.mainList;
        }
    }

    public class Main {
        private List<Delay> dlayList;
        private String pnrNo;

        public Main() {
        }

        public List<Delay> getDelay() {
            return this.dlayList;
        }

        public String getPnrNo() {
            return this.pnrNo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        DelayService delayService = (DelayService) getService(DelayService.class);
        DelayPNRQueryRequest delayPNRQueryRequest = (DelayPNRQueryRequest) getRequest();
        return delayService.executeDelayPNRQuery(delayPNRQueryRequest.getDevice(), delayPNRQueryRequest.getVersion(), delayPNRQueryRequest.getKey(), delayPNRQueryRequest.getJobDvCd(), delayPNRQueryRequest.getPnrCnt(), delayPNRQueryRequest.getPnrList(), delayPNRQueryRequest.getOgtkWctNoList());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_delay_pnr_query;
    }
}
