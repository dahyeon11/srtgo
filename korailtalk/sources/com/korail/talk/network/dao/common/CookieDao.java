package com.korail.talk.network.dao.common;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CookieDao extends BaseDao {

    public class RsvWaitResponse extends BaseResponse {
        private String mutMrkVrfCd;

        public RsvWaitResponse() {
        }

        public String getMutMrkVrfCd() {
            return this.mutMrkVrfCd;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        return ((CommonService) getService(CommonService.class)).ckValue();
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ck_value;
    }
}
