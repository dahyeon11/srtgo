package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MeritCertDao extends BaseDao {

    public class MeritCertRequest extends BaseRequest {
        private String txtAbrdDt;
        private String txtAcptPwd;
        private String txtFreeDiscCertNo;
        private String txtJuminNo7;
        private int viewIndex;

        public MeritCertRequest() {
        }

        public String getTxtAbrdDt() {
            return this.txtAbrdDt;
        }

        public String getTxtAcptPwd() {
            return this.txtAcptPwd;
        }

        public String getTxtFreeDiscCertNo() {
            return this.txtFreeDiscCertNo;
        }

        public String getTxtJuminNo7() {
            return this.txtJuminNo7;
        }

        public int getViewIndex() {
            return this.viewIndex;
        }

        public void setTxtAbrdDt(String str) {
            this.txtAbrdDt = str;
        }

        public void setTxtAcptPwd(String str) {
            this.txtAcptPwd = str;
        }

        public void setTxtFreeDiscCertNo(String str) {
            this.txtFreeDiscCertNo = str;
        }

        public void setTxtJuminNo7(String str) {
            this.txtJuminNo7 = str;
        }

        public void setViewIndex(int i8) {
            this.viewIndex = i8;
        }
    }

    public class MeritCertResponse extends BaseResponse {
        private String h_free_acm_use_tno;
        private String h_free_disc_cert_no;
        private String h_free_psb_tno;

        public MeritCertResponse() {
        }

        public String getH_free_acm_use_tno() {
            return this.h_free_acm_use_tno;
        }

        public String getH_free_disc_cert_no() {
            return this.h_free_disc_cert_no;
        }

        public String getH_free_psb_tno() {
            return this.h_free_psb_tno;
        }

        public void setH_free_acm_use_tno(String str) {
            this.h_free_acm_use_tno = str;
        }

        public void setH_free_disc_cert_no(String str) {
            this.h_free_disc_cert_no = str;
        }

        public void setH_free_psb_tno(String str) {
            this.h_free_psb_tno = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CertificationService certificationService = (CertificationService) getService(CertificationService.class);
        MeritCertRequest meritCertRequest = (MeritCertRequest) getRequest();
        return certificationService.certMerit(meritCertRequest.getDevice(), meritCertRequest.getVersion(), meritCertRequest.getKey(), meritCertRequest.getTxtFreeDiscCertNo(), meritCertRequest.getTxtAcptPwd(), meritCertRequest.getTxtJuminNo7(), meritCertRequest.getTxtAbrdDt());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cert_merit;
    }
}
