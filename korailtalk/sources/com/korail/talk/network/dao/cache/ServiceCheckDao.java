package com.korail.talk.network.dao.cache;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseResponse;
import java.util.Date;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class ServiceCheckDao extends BaseDao {
    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        return ((CacheService) getService(CacheService.class)).checkService(new Date().getTime());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_check_service;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return false;
    }
}
