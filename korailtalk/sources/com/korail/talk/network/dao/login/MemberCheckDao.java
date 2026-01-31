package com.korail.talk.network.dao.login;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MemberCheckDao extends BaseDao {

    public class MemberCheckRequest extends BaseRequest {
        private String custNm;
        private String hmpgPwd;

        public MemberCheckRequest() {
        }

        public String getCustNm() {
            return this.custNm;
        }

        public String getHmpgPwd() {
            return this.hmpgPwd;
        }

        public void setCustNm(String str) {
            this.custNm = str;
        }

        public void setHmpgPwd(String str) {
            this.hmpgPwd = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        LoginService loginService = (LoginService) getService(LoginService.class);
        MemberCheckRequest memberCheckRequest = (MemberCheckRequest) getRequest();
        return loginService.memberCheck(memberCheckRequest.getDevice(), memberCheckRequest.getVersion(), memberCheckRequest.getHmpgPwd(), memberCheckRequest.getCustNm());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_member_check;
    }
}
