package com.korail.talk.network.dao.railplus;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class AutoChargeDao extends BaseDao {

    public class AutoChargeRequest extends BaseRequest {
        private String jobDvCd;
        private String prepCrdNo;

        public AutoChargeRequest() {
        }

        public String getJobDvCd() {
            return this.jobDvCd;
        }

        public String getPrepCrdNo() {
            return this.prepCrdNo;
        }

        public void setJobDvCd(String str) {
            this.jobDvCd = str;
        }

        public void setPrepCrdNo(String str) {
            this.prepCrdNo = str;
        }
    }

    public class AutoChargeResponse extends BaseResponse {
        private String psbFlg;

        public AutoChargeResponse() {
        }

        public String getPsbFlg() {
            return this.psbFlg;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        RailPlusService railPlusService = (RailPlusService) getService(RailPlusService.class);
        AutoChargeRequest autoChargeRequest = (AutoChargeRequest) getRequest();
        return railPlusService.getAutoCharge(autoChargeRequest.getDevice(), autoChargeRequest.getVersion(), autoChargeRequest.getKey(), autoChargeRequest.getJobDvCd(), autoChargeRequest.getPrepCrdNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_auto_charge;
    }
}
