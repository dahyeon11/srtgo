package com.korail.talk.network.dao.delay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DelayPNRAcceptDao extends BaseDao {
    public static final String JOB_DV_CD_RESERVATION = "0";
    public static final String JOB_DV_CD_TICKET_CHANGE = "1";

    public class DelayPNRAcceptRequest extends BaseRequest {
        private String jobDvCd;
        private List<String> ogtkWctNo;
        private int pnrCnt;
        private List<String> pnrList;

        public DelayPNRAcceptRequest() {
        }

        public String getJobDvCd() {
            return this.jobDvCd;
        }

        public List<String> getOgtkWctNo() {
            return this.ogtkWctNo;
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

        public void setOgtkWctNo(List<String> list) {
            this.ogtkWctNo = list;
        }

        public void setPnrCnt(int i8) {
            this.pnrCnt = i8;
        }

        public void setPnrList(List<String> list) {
            this.pnrList = list;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        DelayService delayService = (DelayService) getService(DelayService.class);
        DelayPNRAcceptRequest delayPNRAcceptRequest = (DelayPNRAcceptRequest) getRequest();
        return delayService.executeDelayPNRAccept(delayPNRAcceptRequest.getDevice(), delayPNRAcceptRequest.getVersion(), delayPNRAcceptRequest.getKey(), delayPNRAcceptRequest.getJobDvCd(), delayPNRAcceptRequest.getPnrCnt(), delayPNRAcceptRequest.getPnrList(), delayPNRAcceptRequest.getOgtkWctNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_delay_pnr_accept;
    }
}
