package com.korail.talk.network.dao.push;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class PushUpdateDao extends BaseDao {
    private boolean mIsPending;

    public class PushUpdateRequest extends BaseRequest {
        private String arvUsrInpTnum;
        private String dptUsrInpTnum;
        private String job_dv_cd;
        private String tnsm_flg1;
        private String tnsm_flg2;
        private String tnsm_flg3;
        private String tnsm_flg4;

        public PushUpdateRequest() {
        }

        public String getArvUsrInpTnum() {
            return this.arvUsrInpTnum;
        }

        public String getDptUsrInpTnum() {
            return this.dptUsrInpTnum;
        }

        public String getJob_dv_cd() {
            return this.job_dv_cd;
        }

        public String getTnsm_flg1() {
            return this.tnsm_flg1;
        }

        public String getTnsm_flg2() {
            return this.tnsm_flg2;
        }

        public String getTnsm_flg3() {
            return this.tnsm_flg3;
        }

        public String getTnsm_flg4() {
            return this.tnsm_flg4;
        }

        public void setArvUsrInpTnum(String str) {
            this.arvUsrInpTnum = str;
        }

        public void setDptUsrInpTnum(String str) {
            this.dptUsrInpTnum = str;
        }

        public void setJob_dv_cd(String str) {
            this.job_dv_cd = str;
        }

        public void setTtnsm_flg1(String str) {
            this.tnsm_flg1 = str;
        }

        public void setTtnsm_flg2(String str) {
            this.tnsm_flg2 = str;
        }

        public void setTtnsm_flg3(String str) {
            this.tnsm_flg3 = str;
        }

        public void setTtnsm_flg4(String str) {
            this.tnsm_flg4 = str;
        }
    }

    public class PushUpdateResponse extends BaseResponse {
        private String arvUsrInpTnum;
        private String dptUsrInpTnum;
        private String prs_cnqe_msg_cd;
        private String tnsm_flg1;
        private String tnsm_flg2;
        private String tnsm_flg3;
        private String tnsm_flg4;

        public PushUpdateResponse() {
        }

        public String getArvUsrInpTnum() {
            return this.arvUsrInpTnum;
        }

        public String getDptUsrInpTnum() {
            return this.dptUsrInpTnum;
        }

        public String getPrs_cnqe_msg_cd() {
            return this.prs_cnqe_msg_cd;
        }

        public String getTnsm_flg1() {
            return this.tnsm_flg1;
        }

        public String getTnsm_flg2() {
            return this.tnsm_flg2;
        }

        public String getTnsm_flg3() {
            return this.tnsm_flg3;
        }

        public String getTnsm_flg4() {
            return this.tnsm_flg4;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PushService pushService = (PushService) getService(PushService.class);
        PushUpdateRequest pushUpdateRequest = (PushUpdateRequest) getRequest();
        return pushService.pushUpdate(pushUpdateRequest.getDevice(), pushUpdateRequest.getVersion(), pushUpdateRequest.getJob_dv_cd(), pushUpdateRequest.getTnsm_flg1(), pushUpdateRequest.getTnsm_flg2(), pushUpdateRequest.getTnsm_flg3(), pushUpdateRequest.getTnsm_flg4(), pushUpdateRequest.getDptUsrInpTnum(), pushUpdateRequest.getArvUsrInpTnum());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_push_update;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return this.mIsPending;
    }

    public void setPending(boolean z8) {
        this.mIsPending = z8;
    }
}
