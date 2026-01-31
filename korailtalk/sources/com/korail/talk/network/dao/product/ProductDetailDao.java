package com.korail.talk.network.dao.product;

import K4.b;
import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class ProductDetailDao extends BaseDao {

    public class EntityOne {
        private String strGdConsItmNm;

        public EntityOne() {
        }

        public String getStrGdConsItmNm() {
            return this.strGdConsItmNm;
        }
    }

    public class ProductDetailRequest extends BaseRequest {
        private String txtVrRsvNo;
        private String txtVrRsvSqNo;

        public ProductDetailRequest() {
        }

        public String getTxtVrRsvNo() {
            return this.txtVrRsvNo;
        }

        public String getTxtVrRsvSqNo() {
            return this.txtVrRsvSqNo;
        }

        public void setTxtVrRsvNo(String str) {
            this.txtVrRsvNo = str;
        }

        public void setTxtVrRsvSqNo(String str) {
            this.txtVrRsvSqNo = str;
        }
    }

    public class ProductDetailResponse extends BaseResponse {
        private ProductInfo mainInfo;

        public ProductDetailResponse() {
        }

        public ProductInfo getMainInfo() {
            return this.mainInfo;
        }
    }

    public class ProductInfo {
        private List<EntityOne> entityOne;
        private String strCncDlnDt;
        private String strCncRetAmt;
        private String strCncRetFee;
        private String strGdNm;
        private String strGdSqno;
        private String strInt11;
        private String strRcvdAmt;
        private String strRsvSttNm;
        private b strStlSttCd;
        private String strTotStlAmt;
        private String strUtlTrmCont;
        private String strVrRsvNo;

        public ProductInfo() {
        }

        public List<EntityOne> getEntityOne() {
            return this.entityOne;
        }

        public String getStrCncDlnDt() {
            return this.strCncDlnDt;
        }

        public String getStrCncRetAmt() {
            return this.strCncRetAmt;
        }

        public String getStrCncRetFee() {
            return this.strCncRetFee;
        }

        public String getStrGdNm() {
            return this.strGdNm;
        }

        public String getStrGdSqno() {
            return this.strGdSqno;
        }

        public String getStrInt11() {
            return this.strInt11;
        }

        public String getStrRcvdAmt() {
            return this.strRcvdAmt;
        }

        public String getStrRsvSttNm() {
            return this.strRsvSttNm;
        }

        public b getStrStlSttCd() {
            return this.strStlSttCd;
        }

        public String getStrTotStlAmt() {
            return this.strTotStlAmt;
        }

        public String getStrUtlTrmCont() {
            return this.strUtlTrmCont;
        }

        public String getStrVrRsvNo() {
            return this.strVrRsvNo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ProductService productService = (ProductService) getService(ProductService.class);
        ProductDetailRequest productDetailRequest = (ProductDetailRequest) getRequest();
        return productService.getProductDetail(productDetailRequest.getDevice(), productDetailRequest.getVersion(), productDetailRequest.getKey(), productDetailRequest.getTxtVrRsvNo(), productDetailRequest.getTxtVrRsvSqNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_reservation_product_detail;
    }
}
