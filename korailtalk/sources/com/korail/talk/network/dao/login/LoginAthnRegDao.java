package com.korail.talk.network.dao.login;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class LoginAthnRegDao extends BaseDao {

    public class LoginAthnRegRequest extends BaseRequest {
        private String custId;
        private String lognTpCd;

        public LoginAthnRegRequest() {
        }

        public String getCustId() {
            return this.custId;
        }

        public String getLognTpCd() {
            return this.lognTpCd;
        }

        public void setCustId(String str) {
            this.custId = str;
        }

        public void setLognTpCd(String str) {
            this.lognTpCd = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        LoginService loginService = (LoginService) getService(LoginService.class);
        LoginAthnRegRequest loginAthnRegRequest = (LoginAthnRegRequest) getRequest();
        return loginService.loginAthnReg(loginAthnRegRequest.getDevice(), loginAthnRegRequest.getVersion(), loginAthnRegRequest.getKey(), loginAthnRegRequest.getLognTpCd(), loginAthnRegRequest.getCustId());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_login_athn_reg;
    }
}
