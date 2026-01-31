package com.korail.talk.network.dao.cart;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class AddCartDao extends BaseDao {

    public class AddCartRequest extends BaseRequest {
        private String hidPnrNo;

        public AddCartRequest() {
        }

        public String getHidPnrNo() {
            return this.hidPnrNo;
        }

        public void setHidPnrNo(String str) {
            this.hidPnrNo = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CartService cartService = (CartService) getService(CartService.class);
        AddCartRequest addCartRequest = (AddCartRequest) getRequest();
        return cartService.addCart(addCartRequest.getDevice(), addCartRequest.getVersion(), addCartRequest.getKey(), addCartRequest.getHidPnrNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_add_cart;
    }
}
