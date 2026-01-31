package com.korail.talk.network.dao.product;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class ProductCancelDao extends BaseDao {

    public class ProductCancelRequest extends BaseRequest {
        private String txtGdSqno;
        private String txtVrRsNo;

        public ProductCancelRequest() {
        }

        public String getTxtGdSqno() {
            return this.txtGdSqno;
        }

        public String getTxtVrRsNo() {
            return this.txtVrRsNo;
        }

        public void setTxtGdSqno(String str) {
            this.txtGdSqno = str;
        }

        public void setTxtVrRsNo(String str) {
            this.txtVrRsNo = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ProductService productService = (ProductService) getService(ProductService.class);
        ProductCancelRequest productCancelRequest = (ProductCancelRequest) getRequest();
        return productService.productCancel(productCancelRequest.getDevice(), productCancelRequest.getVersion(), productCancelRequest.getKey(), productCancelRequest.getTxtVrRsNo(), productCancelRequest.getTxtGdSqno());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_reservation_product_cancel;
    }
}
