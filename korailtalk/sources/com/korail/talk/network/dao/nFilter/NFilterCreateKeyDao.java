package com.korail.talk.network.dao.nFilter;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class NFilterCreateKeyDao extends BaseDao {

    public class NFilterCreateKeyResponse extends BaseResponse {
        private String publicKey;

        public NFilterCreateKeyResponse() {
        }

        public String getPublicKey() {
            return this.publicKey;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        NFilterService nFilterService = (NFilterService) getService(NFilterService.class);
        BaseRequest request = getRequest();
        return nFilterService.createKey(request.getDevice(), request.getVersion(), request.getKey());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_n_filter_create_key;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return false;
    }
}
