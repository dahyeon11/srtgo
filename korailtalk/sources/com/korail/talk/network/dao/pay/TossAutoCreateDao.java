package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TossAutoCreateDao extends BaseDao {

    public class TossAutoCResponse extends BaseResponse {
        private String billingKey;
        private String checkoutAndroidUri;
        private String checkoutIosUri;
        private String checkoutUri;

        public TossAutoCResponse() {
        }

        public String getBillingKey() {
            return this.billingKey;
        }

        public String getCheckoutAndroidUri() {
            return this.checkoutAndroidUri;
        }

        public String getCheckoutIosUri() {
            return this.checkoutIosUri;
        }

        public String getCheckoutUri() {
            return this.checkoutUri;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PayService payService = (PayService) getService(PayService.class);
        BaseRequest request = getRequest();
        return payService.tossautoC(request.getDevice(), request.getVersion(), request.getKey());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_toss_auto_c;
    }
}
