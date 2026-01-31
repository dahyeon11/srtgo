package com.korail.talk.network.dao.payment;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.request.payment.IPaymentRequest;
import com.korail.talk.network.request.payment.PaymentMethod;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class RsvPaymentDao extends BaseDao implements Serializable {

    public class RsvPaymentRequest extends BaseRequest implements IPaymentRequest {
        private String hidPnrNo;
        private String hidRsvChgNo;
        private String jobSqNo1;
        private String jobSqNo2;
        private PaymentMethod paymentMethod = new PaymentMethod();
        private String wctNo;

        public RsvPaymentRequest() {
        }

        @Override // com.korail.talk.network.request.payment.IPaymentRequest
        public String getEasyPaymentMethod() {
            return this.paymentMethod.get("spayDvCd_1_1");
        }

        public String getHidPnrNo() {
            return this.hidPnrNo;
        }

        public String getHidRsvChgNo() {
            return this.hidRsvChgNo;
        }

        public String getJobSqNno2() {
            return this.jobSqNo2;
        }

        public String getJobSqNo1() {
            return this.jobSqNo1;
        }

        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public String getWctNo() {
            return this.wctNo;
        }

        public void setHidPnrNo(String str) {
            this.hidPnrNo = str;
        }

        public void setHidRsvChgNo(String str) {
            this.hidRsvChgNo = str;
        }

        public void setJobSqNo1(String str) {
            this.jobSqNo1 = str;
        }

        public void setJobSqNo2(String str) {
            this.jobSqNo2 = str;
        }

        public void setPaymentMethod(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public void setWctNo(String str) {
            this.wctNo = str;
        }
    }

    public class RsvPaymentResponse extends BaseResponse {
        private String h_im_flg;
        private List<TkCouponInfo> tk_coupon_info;

        public RsvPaymentResponse() {
        }

        public String getH_im_flg() {
            return this.h_im_flg;
        }

        public List<TkCouponInfo> getTk_coupon_info() {
            return this.tk_coupon_info;
        }
    }

    public class TkCouponInfo {
        private String h_cert_pwd;
        private String h_coup_no;
        private String h_fdcert_mg_cls_dt;
        private String h_fdcert_mg_st_dt;
        private String h_tk_ret_no;

        public TkCouponInfo() {
        }

        public String getH_cert_pwd() {
            return this.h_cert_pwd;
        }

        public String getH_coup_no() {
            return this.h_coup_no;
        }

        public String getH_fdcert_mg_cls_dt() {
            return this.h_fdcert_mg_cls_dt;
        }

        public String getH_fdcert_mg_st_dt() {
            return this.h_fdcert_mg_st_dt;
        }

        public String getH_tk_ret_no() {
            return this.h_tk_ret_no;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PaymentService paymentService = (PaymentService) getService(PaymentService.class);
        RsvPaymentRequest rsvPaymentRequest = (RsvPaymentRequest) getRequest();
        return paymentService.payment(rsvPaymentRequest.getDevice(), rsvPaymentRequest.getVersion(), rsvPaymentRequest.getKey(), rsvPaymentRequest.getHidPnrNo(), rsvPaymentRequest.getWctNo(), rsvPaymentRequest.getJobSqNo1(), rsvPaymentRequest.getJobSqNno2(), rsvPaymentRequest.getHidRsvChgNo(), rsvPaymentRequest.getPaymentMethod());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_rsv_payment;
    }
}
