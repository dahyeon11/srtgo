package com.korail.talk.network.dao.gifticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class GifticketReturnDao extends BaseDao {

    public class GifticketReturnRequest extends BaseRequest {
        private String tkId;

        public GifticketReturnRequest() {
        }

        public String getTkId() {
            return this.tkId;
        }

        public void setTkId(String str) {
            this.tkId = str;
        }
    }

    public class GifticketReturnResponse extends BaseResponse {
        private String prsFlg;

        public GifticketReturnResponse() {
        }

        public String getPrsFlg() {
            return this.prsFlg;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        GifticketService gifticketService = (GifticketService) getService(GifticketService.class);
        GifticketReturnRequest gifticketReturnRequest = (GifticketReturnRequest) getRequest();
        return gifticketService.returnGifticket(gifticketReturnRequest.getDevice(), gifticketReturnRequest.getVersion(), gifticketReturnRequest.getKey(), gifticketReturnRequest.getTkId());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_gifticket_reservation;
    }
}
