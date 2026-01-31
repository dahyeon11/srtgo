package com.korail.talk.network.dao.addService;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.ArrayList;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DealCarBuyDao extends BaseDao {

    public class DealCarBuyRequest extends BaseRequest {
        public int addSrvCnt;
        public ArrayList<String> addSrvReqNo;

        public DealCarBuyRequest() {
        }

        public int getAddSrvCnt() {
            return this.addSrvCnt;
        }

        public ArrayList<String> getAddSrvReqNo() {
            return this.addSrvReqNo;
        }

        public void setAddSrvCnt(int i8) {
            this.addSrvCnt = i8;
        }

        public void setAddSrvReqNo(ArrayList<String> arrayList) {
            this.addSrvReqNo = arrayList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        AddService addService = (AddService) getService(AddService.class);
        DealCarBuyRequest dealCarBuyRequest = (DealCarBuyRequest) getRequest();
        return addService.dealCarBuy(dealCarBuyRequest.getDevice(), dealCarBuyRequest.getVersion(), dealCarBuyRequest.getKey(), dealCarBuyRequest.getAddSrvCnt(), dealCarBuyRequest.getAddSrvReqNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_deal_car_return;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return false;
    }
}
