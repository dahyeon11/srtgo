package com.korail.talk.network.dao.login;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MemberDropDao extends BaseDao {

    public class MemberDropRequest extends BaseRequest {
        public MemberDropRequest() {
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        LoginService loginService = (LoginService) getService(LoginService.class);
        MemberDropRequest memberDropRequest = (MemberDropRequest) getRequest();
        return loginService.memberDrop(memberDropRequest.getDevice(), memberDropRequest.getVersion());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_member_drop;
    }
}
