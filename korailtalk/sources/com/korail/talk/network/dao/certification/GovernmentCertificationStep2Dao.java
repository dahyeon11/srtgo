package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class GovernmentCertificationStep2Dao extends BaseDao {

    public class GovernmentCertificationStep2Request extends BaseRequest {
        private String csrfToken;

        public GovernmentCertificationStep2Request() {
        }

        public String getCsrfToken() {
            return this.csrfToken;
        }

        public void setCsrfToken(String str) {
            this.csrfToken = str;
        }
    }

    public class GovernmentCertificationStep2Response extends BaseResponse {
        private String code;
        private String message;
        private String pbepInfo;
        private String result;
        private String txCompleteCode;

        public GovernmentCertificationStep2Response() {
        }

        public String getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public String getPbepInfo() {
            return this.pbepInfo;
        }

        public String getResult() {
            return this.result;
        }

        public String getTxCompleteCode() {
            return this.txCompleteCode;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CertificationService certificationService = (CertificationService) getService(CertificationService.class);
        GovernmentCertificationStep2Request governmentCertificationStep2Request = (GovernmentCertificationStep2Request) getRequest();
        return certificationService.govermentCertification2(governmentCertificationStep2Request.getDevice(), governmentCertificationStep2Request.getVersion(), governmentCertificationStep2Request.getCsrfToken());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_government_certification_step2;
    }
}
