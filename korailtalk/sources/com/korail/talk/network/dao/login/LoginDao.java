package com.korail.talk.network.dao.login;

import com.korail.talk.application.KTApplication;
import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class LoginDao extends BaseDao {

    public class LoginRequest extends BaseRequest {
        private String checkValidPw;
        private String custId;
        private String etrPath;
        private String idx;
        private String loginId;
        private String loginPw;
        private String loginType;

        public LoginRequest() {
        }

        public String getCheckValidPw() {
            return this.checkValidPw;
        }

        public String getCustId() {
            return this.custId;
        }

        public String getEtrPath() {
            return this.etrPath;
        }

        public String getIdx() {
            return this.idx;
        }

        public String getLoginId() {
            return this.loginId;
        }

        public String getLoginPw() {
            return this.loginPw;
        }

        public String getLoginType() {
            return this.loginType;
        }

        public void setCheckValidPw(String str) {
            this.checkValidPw = str;
        }

        public void setCustId(String str) {
            this.custId = str;
        }

        public void setEtrPath(String str) {
            this.etrPath = str;
        }

        public void setIdx(String str) {
            this.idx = str;
        }

        public void setLoginId(String str) {
            this.loginId = str;
        }

        public void setLoginPw(String str) {
            this.loginPw = str;
        }

        public void setLoginType(String str) {
            this.loginType = str;
        }
    }

    public class LoginResponse extends BaseResponse {
        private String coupClsFlg;
        private String dlayDscpInfo;
        private String encryptCustNo;
        private String encryptHMbCrdNo;
        private String encryptMbCrdNo;
        private String notiTpCd;
        private String strAthnFlg5;
        private String strAthnFlg7;
        private String strBtdt;
        private String strCpNo;
        private String strCustClCd;
        private String strCustDvCd;
        private String strCustLeadFlg;
        private String strCustMgSrtCd;
        private String strCustNm;
        private String strCustNo;
        private String strCustSrtCd;
        private String strEmailAdr;
        private String strHdcpFlg;
        private String strHdcpTpCd;
        private String strHdcpTpCdNm;
        private String strLognTpCd6;
        private String strMbCrdNo;
        private String strRedirectUrl;
        private String strSubtDcsClCd;
        private String strYouthAgrFlg;

        public LoginResponse() {
        }

        public String getCoupClsFlg() {
            return this.coupClsFlg;
        }

        public String getDlayDscpInfo() {
            return this.dlayDscpInfo;
        }

        public String getEncryptCustNo() {
            return this.encryptCustNo;
        }

        public String getEncryptHMbCrdNo() {
            return this.encryptHMbCrdNo;
        }

        public String getEncryptMbCrdNo() {
            return this.encryptMbCrdNo;
        }

        public String getNotiTpCd() {
            return this.notiTpCd;
        }

        public String getStrAthnFlg5() {
            return this.strAthnFlg5;
        }

        public String getStrAthnFlg7() {
            return this.strAthnFlg7;
        }

        public String getStrBtdt() {
            return this.strBtdt;
        }

        public String getStrCpNo() {
            return this.strCpNo;
        }

        public String getStrCustClCd() {
            return this.strCustClCd;
        }

        public String getStrCustDvCd() {
            return this.strCustDvCd;
        }

        public String getStrCustLeadFlg() {
            return this.strCustLeadFlg;
        }

        public String getStrCustMgSrtCd() {
            return this.strCustMgSrtCd;
        }

        public String getStrCustNm() {
            return this.strCustNm;
        }

        public String getStrCustNo() {
            return this.strCustNo;
        }

        public String getStrCustSrtCd() {
            return this.strCustSrtCd;
        }

        public String getStrEmailAdr() {
            return this.strEmailAdr;
        }

        public String getStrHdcpFlg() {
            return this.strHdcpFlg;
        }

        public String getStrHdcpTpCd() {
            return this.strHdcpTpCd;
        }

        public String getStrHdcpTpCdNm() {
            return this.strHdcpTpCdNm;
        }

        public String getStrLognTpCd6() {
            return this.strLognTpCd6;
        }

        public String getStrMbCrdNo() {
            return this.strMbCrdNo;
        }

        public String getStrRedirectUrl() {
            return this.strRedirectUrl;
        }

        public String getStrSubtDcsClCd() {
            return this.strSubtDcsClCd;
        }

        public String getStrYouthAgrFlg() {
            return this.strYouthAgrFlg;
        }

        public void setStrAthnFlg5(String str) {
            this.strAthnFlg5 = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        LoginService loginService = (LoginService) getService(LoginService.class);
        LoginRequest loginRequest = (LoginRequest) getRequest();
        LoginResponse loginResponseLogin = loginService.login(loginRequest.getDevice(), loginRequest.getVersion(), loginRequest.getKey(), loginRequest.getLoginId(), loginRequest.getLoginPw(), loginRequest.getLoginType(), loginRequest.getCheckValidPw(), loginRequest.getCustId(), loginRequest.getEtrPath(), loginRequest.getIdx());
        KTApplication.getInstance().setSessionId();
        return loginResponseLogin;
    }

    public int getId() {
        return AbstractC5955f.dao_login;
    }
}
