package com.korail.talk.network.dao.pass;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.request.payment.IPaymentRequest;
import com.korail.talk.network.request.payment.PaymentMethod;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class PassPaymentDao extends BaseDao implements Serializable {

    public class MainInfo {
        private String h_pnr_no;

        public MainInfo() {
        }

        public String getH_pnr_no() {
            return this.h_pnr_no;
        }
    }

    public class PassPaymentRequest extends BaseRequest implements IPaymentRequest {
        private String h_rcvd_prc;
        private String hidPayAmount;
        private String hidWctNo;
        private Map<String, String> passPaymentMap;
        private PaymentMethod paymentMethod = new PaymentMethod();

        public PassPaymentRequest() {
        }

        @Override // com.korail.talk.network.request.payment.IPaymentRequest
        public String getEasyPaymentMethod() {
            return this.paymentMethod.get("spayDvCd_1_1");
        }

        public String getH_rcvd_prc() {
            return this.h_rcvd_prc;
        }

        public String getHidPayAmount() {
            return this.hidPayAmount;
        }

        public String getHidWctNo() {
            return this.hidWctNo;
        }

        public Map<String, String> getPassPaymentMap() {
            return this.passPaymentMap;
        }

        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public void setH_rcvd_prc(String str) {
            this.h_rcvd_prc = str;
        }

        public void setHashMap(HashMap<String, String> map) {
            this.passPaymentMap.putAll(map);
        }

        public void setHidPayAmount(String str) {
            this.hidPayAmount = str;
        }

        public void setHidWctNo(String str) {
            this.hidWctNo = str;
        }

        public void setPassPaymentMap(Map<String, String> map) {
            this.passPaymentMap = map;
        }

        public void setPaymentMethod(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
        }
    }

    public class PassPaymentResponse extends BaseResponse {
        private MainInfo main_info;

        public PassPaymentResponse() {
        }

        public MainInfo getMain_info() {
            return this.main_info;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassService passService = (PassService) getService(PassService.class);
        PassPaymentRequest passPaymentRequest = (PassPaymentRequest) getRequest();
        return passService.passPayment(passPaymentRequest.getDevice(), passPaymentRequest.getVersion(), passPaymentRequest.getKey(), passPaymentRequest.getHidPayAmount(), passPaymentRequest.getH_rcvd_prc(), passPaymentRequest.getHidWctNo(), passPaymentRequest.getPassPaymentMap(), passPaymentRequest.getPaymentMethod());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_pass_payment;
    }
}
