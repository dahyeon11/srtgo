package com.korail.talk.network.dao.passCard;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DCCouponCertDao extends BaseDao {

    public class DCCouponCertRequest extends BaseRequest {
        private int couponInputViewIndex;
        private String txtCertNo;
        private String txtCertPwd;

        public DCCouponCertRequest() {
        }

        public int getCouponInputViewIndex() {
            return this.couponInputViewIndex;
        }

        public String getTxtCertNo() {
            return this.txtCertNo;
        }

        public String getTxtCertPwd() {
            return this.txtCertPwd;
        }

        public void setCouponInputViewIndex(int i8) {
            this.couponInputViewIndex = i8;
        }

        public void setTxtCertNo(String str) {
            this.txtCertNo = str;
        }

        public void setTxtCertPwd(String str) {
            this.txtCertPwd = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassCardService passCardService = (PassCardService) getService(PassCardService.class);
        DCCouponCertRequest dCCouponCertRequest = (DCCouponCertRequest) getRequest();
        return passCardService.certDCCoupon(dCCouponCertRequest.getDevice(), dCCouponCertRequest.getVersion(), dCCouponCertRequest.getKey(), dCCouponCertRequest.getTxtCertNo(), dCCouponCertRequest.getTxtCertPwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cert_coupon;
    }
}
