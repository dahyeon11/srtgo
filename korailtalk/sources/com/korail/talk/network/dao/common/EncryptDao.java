package com.korail.talk.network.dao.common;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class EncryptDao extends BaseDao {

    public class EncryptRequest extends BaseRequest {
        private String type;
        private List<String> valueList;

        public EncryptRequest() {
        }

        public String getType() {
            return this.type;
        }

        public List<String> getValueList() {
            return this.valueList;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setValueList(List<String> list) {
            this.valueList = list;
        }
    }

    public class EncryptResponse extends BaseResponse {
        private List<EncryptValueList> encValueList;

        public EncryptResponse() {
        }

        public List<EncryptValueList> getEncValueList() {
            return this.encValueList;
        }
    }

    public class EncryptValueList {
        private String encValue;

        public EncryptValueList() {
        }

        public String getEncValue() {
            return this.encValue;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CommonService commonService = (CommonService) getService(CommonService.class);
        EncryptRequest encryptRequest = (EncryptRequest) getRequest();
        return commonService.getEncrypt(encryptRequest.getDevice(), encryptRequest.getVersion(), encryptRequest.getKey(), encryptRequest.getType(), encryptRequest.getValueList());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_encrypt;
    }
}
