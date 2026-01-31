package com.korail.talk.network.dao.addService;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.data.addService.ExtraProductInfo;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class ExtraProductListDao extends BaseDao {

    public class ExtraProductListRequest extends BaseRequest {
        private String pnrNo;

        public ExtraProductListRequest() {
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }
    }

    public class ExtraProductListResponse extends BaseResponse {
        private List<ExtraProductInfo> pnrList;

        public ExtraProductListResponse() {
        }

        public List<ExtraProductInfo> getPnrList() {
            return this.pnrList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        AddService addService = (AddService) getService(AddService.class);
        ExtraProductListRequest extraProductListRequest = (ExtraProductListRequest) getRequest();
        return addService.getExtraProductList(extraProductListRequest.getDevice(), extraProductListRequest.getVersion(), extraProductListRequest.getKey(), extraProductListRequest.getPnrNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_extra_product_list;
    }
}
