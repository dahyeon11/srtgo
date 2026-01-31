package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TossAutoStlKeyPrsDao extends BaseDao {

    public class StlKeyPrsRequest extends BaseRequest {
        private String acntNo;
        private String binNo;
        private String jobDvCd;
        private String spayDvCd;
        private String spayStlKeyVal;
        private String stlBankCd;

        public StlKeyPrsRequest() {
        }

        public String getAcntNo() {
            return this.acntNo;
        }

        public String getBinNo() {
            return this.binNo;
        }

        public String getJobDvCd() {
            return this.jobDvCd;
        }

        public String getSpayDvCd() {
            return this.spayDvCd;
        }

        public String getSpayStlKeyVal() {
            return this.spayStlKeyVal;
        }

        public String getStlBankCd() {
            return this.stlBankCd;
        }

        public void setAcntNo(String str) {
            this.acntNo = str;
        }

        public void setBinNo(String str) {
            this.binNo = str;
        }

        public void setJobDvCd(String str) {
            this.jobDvCd = str;
        }

        public void setSpayDvCd(String str) {
            this.spayDvCd = str;
        }

        public void setSpayStlKeyVal(String str) {
            this.spayStlKeyVal = str;
        }

        public void setStlBankCd(String str) {
            this.stlBankCd = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PayService payService = (PayService) getService(PayService.class);
        StlKeyPrsRequest stlKeyPrsRequest = (StlKeyPrsRequest) getRequest();
        return payService.stlKeyPrs(stlKeyPrsRequest.getDevice(), stlKeyPrsRequest.getVersion(), stlKeyPrsRequest.getKey(), stlKeyPrsRequest.getJobDvCd(), stlKeyPrsRequest.getSpayDvCd(), stlKeyPrsRequest.getSpayStlKeyVal(), stlKeyPrsRequest.getStlBankCd(), stlKeyPrsRequest.getAcntNo(), stlKeyPrsRequest.getBinNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_stl_key_prs;
    }
}
