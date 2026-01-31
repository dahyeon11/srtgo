package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CongresspersonCertDao extends BaseDao {

    public class CongresspersonCertRequest extends BaseRequest {
        private String abrdDt;
        private String certNo;
        private String freeDiscCertNo;
        private int viewIndex;

        public CongresspersonCertRequest() {
        }

        public int getViewIndex() {
            return this.viewIndex;
        }

        public String getabrdDt() {
            return this.abrdDt;
        }

        public String getcertNo() {
            return this.certNo;
        }

        public String getfreeDiscCertNo() {
            return this.freeDiscCertNo;
        }

        public void setViewIndex(int i8) {
            this.viewIndex = i8;
        }

        public void setabrdDt(String str) {
            this.abrdDt = str;
        }

        public void setcertNo(String str) {
            this.certNo = str;
        }

        public void setfreeDiscCertNo(String str) {
            this.freeDiscCertNo = str;
        }
    }

    public class CongresspersonCertResponse extends BaseResponse {
        private String freeDiscCertNo;

        public CongresspersonCertResponse() {
        }

        public String getfreeDiscCertNo() {
            return this.freeDiscCertNo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CertificationService certificationService = (CertificationService) getService(CertificationService.class);
        CongresspersonCertRequest congresspersonCertRequest = (CongresspersonCertRequest) getRequest();
        return certificationService.certCongressperson(congresspersonCertRequest.getDevice(), congresspersonCertRequest.getVersion(), congresspersonCertRequest.getKey(), congresspersonCertRequest.getfreeDiscCertNo(), congresspersonCertRequest.getcertNo(), congresspersonCertRequest.getabrdDt());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cert_congressperson;
    }
}
