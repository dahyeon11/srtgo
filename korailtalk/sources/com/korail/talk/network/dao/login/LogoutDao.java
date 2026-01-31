package com.korail.talk.network.dao.login;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class LogoutDao extends BaseDao {
    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        return ((LoginService) getService(LoginService.class)).logout();
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_logout;
    }
}
