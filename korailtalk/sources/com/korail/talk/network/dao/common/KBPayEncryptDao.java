package com.korail.talk.network.dao.common;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.common.EncryptDao;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class KBPayEncryptDao extends BaseDao {

    public class KBpayEncryptRequest extends BaseRequest {
        private String type;
        private List<String> valueList;

        public KBpayEncryptRequest() {
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

    public class KBpayEncryptResponse extends BaseResponse {
        private String BIZ_NUM;
        private String CHANNEL_ID;
        private String PURCHASE_PRODUCT_INFO;
        private String REQ_DATE_TIME;
        private String SELLER_NAME;
        private String SELLER_NUM;
        private List<EncryptDao.EncryptValueList> encValueList;

        public KBpayEncryptResponse() {
        }

        public String getBIZ_NUM() {
            return this.BIZ_NUM;
        }

        public String getCHANNEL_ID() {
            return this.CHANNEL_ID;
        }

        public List<EncryptDao.EncryptValueList> getEncValueList() {
            return this.encValueList;
        }

        public String getPURCHASE_PRODUCT_INFO() {
            return this.PURCHASE_PRODUCT_INFO;
        }

        public String getREQ_DATE_TIME() {
            return this.REQ_DATE_TIME;
        }

        public String getSELLER_NAME() {
            return this.SELLER_NAME;
        }

        public String getSELLER_NUM() {
            return this.SELLER_NUM;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CommonService commonService = (CommonService) getService(CommonService.class);
        KBpayEncryptRequest kBpayEncryptRequest = (KBpayEncryptRequest) getRequest();
        return commonService.getKBPayEncrypt(kBpayEncryptRequest.getDevice(), kBpayEncryptRequest.getVersion(), kBpayEncryptRequest.getKey(), kBpayEncryptRequest.getType(), kBpayEncryptRequest.getValueList());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_kb_pay_encrypt;
    }
}
