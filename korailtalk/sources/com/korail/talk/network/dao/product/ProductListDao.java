package com.korail.talk.network.dao.product;

import K4.b;
import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class ProductListDao extends BaseDao {

    public class MainInfo {
        private List<ReservationProduct> entity;
        private String strTotCnt;

        public MainInfo() {
        }

        public List<ReservationProduct> getEntity() {
            return this.entity;
        }

        public String getStrTotCnt() {
            return this.strTotCnt;
        }
    }

    public class ProductListRequest extends BaseRequest {
        private int txtCntPerPage;
        private int txtSelPage;

        public ProductListRequest() {
        }

        public int getTxtCntPerPage() {
            return this.txtCntPerPage;
        }

        public int getTxtSelPage() {
            return this.txtSelPage;
        }

        public void setTxtCntPerPage(int i8) {
            this.txtCntPerPage = i8;
        }

        public void setTxtSelPage(int i8) {
            this.txtSelPage = i8;
        }
    }

    public class ProductListResponse extends BaseResponse {
        private MainInfo mainInfo;

        public ProductListResponse() {
        }

        public MainInfo getMainInfo() {
            return this.mainInfo;
        }
    }

    public class ReservationProduct {
        private String strGdNm;
        private String strRsvSttCd;
        private String strRsvSttNm;
        private String strStlDlnDt;
        private b strStlSttCd;
        private String strVrRsvNo;

        public ReservationProduct() {
        }

        public String getStrGdNm() {
            return this.strGdNm;
        }

        public String getStrRsvSttCd() {
            return this.strRsvSttCd;
        }

        public String getStrRsvSttNm() {
            return this.strRsvSttNm;
        }

        public String getStrStlDlnDt() {
            return this.strStlDlnDt;
        }

        public b getStrStlSttCd() {
            return this.strStlSttCd;
        }

        public String getStrVrRsvNo() {
            return this.strVrRsvNo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ProductService productService = (ProductService) getService(ProductService.class);
        ProductListRequest productListRequest = (ProductListRequest) getRequest();
        return productService.getProductList(productListRequest.getDevice(), productListRequest.getVersion(), productListRequest.getKey(), productListRequest.getTxtSelPage(), productListRequest.getTxtCntPerPage());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_reservation_product;
    }
}
