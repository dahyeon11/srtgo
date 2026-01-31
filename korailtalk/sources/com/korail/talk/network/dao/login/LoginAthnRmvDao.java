package com.korail.talk.network.dao.login;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class LoginAthnRmvDao extends BaseDao {

    public class LoginAthnRmvRequest extends BaseRequest {
        private String lognTpCd;
        private String srvQryDvVal;

        public LoginAthnRmvRequest() {
        }

        public String getLognTpCd() {
            return this.lognTpCd;
        }

        public String getSrvQryDvVal() {
            return this.srvQryDvVal;
        }

        public void setLognTpCd(String str) {
            this.lognTpCd = str;
        }

        public void setSrvQryDvVal(String str) {
            this.srvQryDvVal = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        LoginService loginService = (LoginService) getService(LoginService.class);
        LoginAthnRmvRequest loginAthnRmvRequest = (LoginAthnRmvRequest) getRequest();
        return loginService.loginAthnRmv(loginAthnRmvRequest.getDevice(), loginAthnRmvRequest.getVersion(), loginAthnRmvRequest.getKey(), loginAthnRmvRequest.getSrvQryDvVal(), loginAthnRmvRequest.getLognTpCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_login_athn_rmv;
    }
}
