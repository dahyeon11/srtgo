package com.korail.talk.network.dao.common;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DecryptDao extends BaseDao {

    public class DecryptRequest extends BaseRequest {
        private String easyPayType;
        private String mAutoChargeRequestType;
        private String type;
        private List<String> valueList;

        public DecryptRequest() {
        }

        public String getAutoChargeRequestType() {
            return this.mAutoChargeRequestType;
        }

        public String getEasyPayType() {
            return this.easyPayType;
        }

        public String getType() {
            return this.type;
        }

        public List<String> getValueList() {
            return this.valueList;
        }

        public void setAutoChargeRequestType(String str) {
            this.mAutoChargeRequestType = str;
        }

        public void setEasyPayType(String str) {
            this.easyPayType = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setValueList(List<String> list) {
            this.valueList = list;
        }
    }

    public class DecryptResponse extends BaseResponse {
        private List<DecryptValueList> decValueList;

        public DecryptResponse() {
        }

        public List<DecryptValueList> getDecValueList() {
            return this.decValueList;
        }
    }

    public class DecryptValueList {
        private String decValue;

        public DecryptValueList() {
        }

        public String getDecValue() {
            return this.decValue;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CommonService commonService = (CommonService) getService(CommonService.class);
        DecryptRequest decryptRequest = (DecryptRequest) getRequest();
        return commonService.getDecrypt(decryptRequest.getDevice(), decryptRequest.getVersion(), decryptRequest.getKey(), decryptRequest.getType(), decryptRequest.getValueList());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_decrypt;
    }
}
