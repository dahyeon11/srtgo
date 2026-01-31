package com.korail.talk.network.dao.login;

import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class AutoLoginDao extends LoginDao {
    private boolean mIsPending;

    @Override // com.korail.talk.network.dao.login.LoginDao, com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_auto_login;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return this.mIsPending;
    }

    public void setPending(boolean z8) {
        this.mIsPending = z8;
    }
}
