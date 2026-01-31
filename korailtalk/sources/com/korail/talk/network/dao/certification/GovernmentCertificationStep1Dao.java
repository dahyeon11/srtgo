package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class GovernmentCertificationStep1Dao extends BaseDao {

    public class GovernmentCertificationResponse extends BaseResponse {
        private String app;
        private String csrfToken;

        public GovernmentCertificationResponse() {
        }

        public String getApp() {
            return this.app;
        }

        public String getCsrfToken() {
            return this.csrfToken;
        }
    }

    public class GovernmentCertificationStep1Request extends BaseRequest {
        private String hdcpGrade;
        private int position;
        private String regNum;

        public GovernmentCertificationStep1Request() {
        }

        public String getHdcpGrade() {
            return this.hdcpGrade;
        }

        public int getPosition() {
            return this.position;
        }

        public String getRegNum() {
            return this.regNum;
        }

        public void setHdcpGrade(String str) {
            this.hdcpGrade = str;
        }

        public void setPosition(int i8) {
            this.position = i8;
        }

        public void setRegNum(String str) {
            this.regNum = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CertificationService certificationService = (CertificationService) getService(CertificationService.class);
        GovernmentCertificationStep1Request governmentCertificationStep1Request = (GovernmentCertificationStep1Request) getRequest();
        return certificationService.govermentCertification1(governmentCertificationStep1Request.getDevice(), governmentCertificationStep1Request.getVersion());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_government_certification_step1;
    }
}
