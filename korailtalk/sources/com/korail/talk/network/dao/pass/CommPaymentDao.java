package com.korail.talk.network.dao.pass;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.pass.PassPaymentDao;
import com.korail.talk.network.request.payment.IPaymentRequest;
import com.korail.talk.network.request.payment.PaymentMethod;
import java.io.Serializable;
import java.util.Map;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CommPaymentDao extends BaseDao implements Serializable {

    public class CommPaymentRequest extends BaseRequest implements IPaymentRequest {
        private Map<String, String> commPaymentMap;
        private String hidPayAmount;
        private PaymentMethod paymentMethod = new PaymentMethod();

        public CommPaymentRequest() {
        }

        public Map<String, String> getCommPaymentMap() {
            return this.commPaymentMap;
        }

        @Override // com.korail.talk.network.request.payment.IPaymentRequest
        public String getEasyPaymentMethod() {
            return this.paymentMethod.get("spayDvCd_1_1");
        }

        public String getHidPayAmount() {
            return this.hidPayAmount;
        }

        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public void setCommPaymentMap(Map<String, String> map) {
            this.commPaymentMap = map;
        }

        public void setHidPayAmount(String str) {
            this.hidPayAmount = str;
        }

        public void setPaymentMethod(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
        }
    }

    public class CommPaymentResponse extends BaseResponse {
        private PassPaymentDao.MainInfo main_info;

        public CommPaymentResponse() {
        }

        public PassPaymentDao.MainInfo getMain_info() {
            return this.main_info;
        }
    }

    public class MainInfo {
        private String h_pnr_no;

        public MainInfo() {
        }

        public String getH_pnr_no() {
            return this.h_pnr_no;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassService passService = (PassService) getService(PassService.class);
        CommPaymentRequest commPaymentRequest = (CommPaymentRequest) getRequest();
        return passService.commPayment(commPaymentRequest.getDevice(), commPaymentRequest.getVersion(), commPaymentRequest.getKey(), commPaymentRequest.getHidPayAmount(), commPaymentRequest.getCommPaymentMap(), commPaymentRequest.getPaymentMethod());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_comm_payment;
    }
}
