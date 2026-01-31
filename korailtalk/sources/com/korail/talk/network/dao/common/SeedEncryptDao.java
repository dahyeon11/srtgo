package com.korail.talk.network.dao.common;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class SeedEncryptDao extends BaseDao {

    public class EncValueList {
        private String encValue;

        public EncValueList() {
        }

        public String getEncValue() {
            return this.encValue;
        }
    }

    public class SeedEncryptRequest extends BaseRequest {
        private List<String> mValueList;

        public SeedEncryptRequest() {
        }

        public List<String> getValueList() {
            return this.mValueList;
        }

        public void setValueList(List<String> list) {
            this.mValueList = list;
        }
    }

    public class SeedEncryptResponse extends BaseResponse {
        private List<EncValueList> encValueList;

        public SeedEncryptResponse() {
        }

        public List<EncValueList> getEncValueList() {
            return this.encValueList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CommonService commonService = (CommonService) getService(CommonService.class);
        SeedEncryptRequest seedEncryptRequest = (SeedEncryptRequest) getRequest();
        return commonService.seedEncrypt(seedEncryptRequest.getDevice(), seedEncryptRequest.getVersion(), seedEncryptRequest.getKey(), seedEncryptRequest.getValueList());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_seed_encrypt;
    }
}
