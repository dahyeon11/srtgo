package com.korail.talk.network.dao.login;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MemberCertDao extends BaseDao {

    public class MemberCertRequest extends BaseRequest {
        private String acept;
        private String memNum;
        private String txtAcptPsNm;
        private String txtCpNo;
        private String txtEmailNo;

        public MemberCertRequest() {
        }

        public String getAcept() {
            return this.acept;
        }

        public String getMemNum() {
            return this.memNum;
        }

        public String getTxtAcptPsNm() {
            return this.txtAcptPsNm;
        }

        public String getTxtCpNo() {
            return this.txtCpNo;
        }

        public String getTxtEmailNo() {
            return this.txtEmailNo;
        }

        public void setAcept(String str) {
            this.acept = str;
        }

        public void setMemNum(String str) {
            this.memNum = str;
        }

        public void setTxtAcptPsNm(String str) {
            this.txtAcptPsNm = str;
        }

        public void setTxtCpNo(String str) {
            this.txtCpNo = str;
        }

        public void setTxtEmailNo(String str) {
            this.txtEmailNo = str;
        }
    }

    public class MemberCertResponse extends BaseResponse {
        private String mbCrdNo;
        private String strCustNo;

        public MemberCertResponse() {
        }

        public String getMbCrdNo() {
            return this.mbCrdNo;
        }

        public String getStrCustNo() {
            return this.strCustNo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        LoginService loginService = (LoginService) getService(LoginService.class);
        MemberCertRequest memberCertRequest = (MemberCertRequest) getRequest();
        return loginService.certMember(memberCertRequest.getDevice(), memberCertRequest.getVersion(), memberCertRequest.getKey(), memberCertRequest.getTxtAcptPsNm(), memberCertRequest.getAcept(), memberCertRequest.getTxtCpNo(), memberCertRequest.getMemNum(), memberCertRequest.getTxtEmailNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cert_member;
    }
}
