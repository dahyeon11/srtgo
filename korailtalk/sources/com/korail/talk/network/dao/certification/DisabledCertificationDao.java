package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DisabledCertificationDao extends BaseDao {

    public class DisabledCertificationRequest extends BaseRequest {
        private String hdcpGrade;
        private int position;
        private String regNum;

        public DisabledCertificationRequest() {
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

    public class DisabledCertificationResponse extends BaseResponse {
        private String btdt;
        private String certificate;
        private String hdcpTpCd;
        private String subtDcsClCd;

        public DisabledCertificationResponse() {
        }

        public String getBtdt() {
            return this.btdt;
        }

        public String getCertificate() {
            return this.certificate;
        }

        public String getHdcpTpCd() {
            return this.hdcpTpCd;
        }

        public String getSubtDcsClCd() {
            return this.subtDcsClCd;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CertificationService certificationService = (CertificationService) getService(CertificationService.class);
        DisabledCertificationRequest disabledCertificationRequest = (DisabledCertificationRequest) getRequest();
        return certificationService.disabledCertification(disabledCertificationRequest.getDevice(), disabledCertificationRequest.getVersion(), disabledCertificationRequest.getKey(), disabledCertificationRequest.getRegNum(), disabledCertificationRequest.getHdcpGrade());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_disabled;
    }
}
