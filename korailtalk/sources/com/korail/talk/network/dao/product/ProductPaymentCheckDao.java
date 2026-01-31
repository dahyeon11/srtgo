package com.korail.talk.network.dao.product;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class ProductPaymentCheckDao extends BaseDao {

    public class MainInfo {
        private String strLumpStlTgtNo;
        private int strMrkAmtSum;

        public MainInfo() {
        }

        public String getStrLumpStlTgtNo() {
            return this.strLumpStlTgtNo;
        }

        public int getStrMrkAmtSum() {
            return this.strMrkAmtSum;
        }
    }

    public class ProductPaymentCheckRequest extends BaseRequest {
        private String txtRsvGdSqno;
        private String txtVrRsNo;

        public ProductPaymentCheckRequest() {
        }

        public String getTxtRsvGdSqno() {
            return this.txtRsvGdSqno;
        }

        public String getTxtVrRsNo() {
            return this.txtVrRsNo;
        }

        public void setTxtRsvGdSqno(String str) {
            this.txtRsvGdSqno = str;
        }

        public void setTxtVrRsNo(String str) {
            this.txtVrRsNo = str;
        }
    }

    public class ProductPaymentCheckResponse extends BaseResponse {
        private MainInfo mainInfo;

        public ProductPaymentCheckResponse() {
        }

        public MainInfo getMainInfo() {
            return this.mainInfo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ProductService productService = (ProductService) getService(ProductService.class);
        ProductPaymentCheckRequest productPaymentCheckRequest = (ProductPaymentCheckRequest) getRequest();
        return productService.paymentCheck(productPaymentCheckRequest.getDevice(), productPaymentCheckRequest.getVersion(), productPaymentCheckRequest.getKey(), productPaymentCheckRequest.getTxtVrRsNo(), productPaymentCheckRequest.getTxtRsvGdSqno());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_product_payment_check;
    }
}
