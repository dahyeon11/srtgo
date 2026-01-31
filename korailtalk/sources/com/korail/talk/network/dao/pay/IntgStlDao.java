package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.request.payment.IPaymentRequest;
import com.korail.talk.network.request.payment.PaymentMethod;
import java.io.Serializable;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class IntgStlDao extends BaseDao implements Serializable {

    public class IntgStlRequest extends BaseRequest implements IPaymentRequest {
        private String cart_LumpStlTgtNo;
        private String ctlDvCd;
        private String hidRsvChgNo;
        private PaymentMethod paymentMethod;
        private String stlPrsJobId;

        public IntgStlRequest() {
            setStlPrsJobId("0001");
            this.paymentMethod = new PaymentMethod();
        }

        public String getCart_LumpStlTgtNo() {
            return this.cart_LumpStlTgtNo;
        }

        public String getCtlDvCd() {
            return this.ctlDvCd;
        }

        @Override // com.korail.talk.network.request.payment.IPaymentRequest
        public String getEasyPaymentMethod() {
            return this.paymentMethod.get("spayDvCd_1_1");
        }

        public String getHidRsvChgNo() {
            return this.hidRsvChgNo;
        }

        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public String getStlPrsJobId() {
            return this.stlPrsJobId;
        }

        public void setCart_LumpStlTgtNo(String str) {
            this.cart_LumpStlTgtNo = str;
        }

        public void setCtlDvCd(String str) {
            this.ctlDvCd = str;
        }

        public void setHidRsvChgNo(String str) {
            this.hidRsvChgNo = str;
        }

        public void setPaymentMethod(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public void setStlPrsJobId(String str) {
            this.stlPrsJobId = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PayService payService = (PayService) getService(PayService.class);
        IntgStlRequest intgStlRequest = (IntgStlRequest) getRequest();
        return payService.intgStl(intgStlRequest.getDevice(), intgStlRequest.getVersion(), intgStlRequest.getKey(), intgStlRequest.getCtlDvCd(), intgStlRequest.getStlPrsJobId(), intgStlRequest.getCart_LumpStlTgtNo(), intgStlRequest.getPaymentMethod());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cart_payment;
    }
}
