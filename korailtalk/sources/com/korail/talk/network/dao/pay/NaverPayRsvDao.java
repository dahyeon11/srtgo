package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class NaverPayRsvDao extends BaseDao {

    public class NaverPayRsvRequest extends BaseRequest {
        public int productAmount;
        public int productCount;

        public NaverPayRsvRequest() {
        }

        public int getProductAmount() {
            return this.productAmount;
        }

        public int getProductCount() {
            return this.productCount;
        }

        public void setProductAmount(int i8) {
            this.productAmount = i8;
        }

        public void setProductCount(int i8) {
            this.productCount = i8;
        }
    }

    public class NaverPayRsvResponse extends BaseResponse {
        public String stlScnUrl;

        public NaverPayRsvResponse() {
        }

        public String getStlScnUrl() {
            return this.stlScnUrl;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PayService payService = (PayService) getService(PayService.class);
        NaverPayRsvRequest naverPayRsvRequest = (NaverPayRsvRequest) getRequest();
        return payService.naverPayRsv(naverPayRsvRequest.getDevice(), naverPayRsvRequest.getVersion(), naverPayRsvRequest.getKey(), naverPayRsvRequest.getProductCount(), naverPayRsvRequest.getProductAmount());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_naver_pay_rsv;
    }
}
