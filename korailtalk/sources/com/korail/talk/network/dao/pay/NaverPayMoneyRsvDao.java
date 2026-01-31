package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class NaverPayMoneyRsvDao extends BaseDao {

    public class NaverPayMoneyRsvRequest extends BaseRequest {
        public int productAmount;
        public int productCount;

        public NaverPayMoneyRsvRequest() {
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

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PayService payService = (PayService) getService(PayService.class);
        NaverPayMoneyRsvRequest naverPayMoneyRsvRequest = (NaverPayMoneyRsvRequest) getRequest();
        return payService.naverPayMoneyRsv(naverPayMoneyRsvRequest.getDevice(), naverPayMoneyRsvRequest.getVersion(), naverPayMoneyRsvRequest.getKey(), naverPayMoneyRsvRequest.getProductCount(), naverPayMoneyRsvRequest.getProductAmount());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_naver_pay_money_rsv;
    }
}
