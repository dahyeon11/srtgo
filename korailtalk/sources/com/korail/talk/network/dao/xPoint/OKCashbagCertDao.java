package com.korail.talk.network.dao.xPoint;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class OKCashbagCertDao extends BaseDao {

    public class OKCashbagCertRequest extends BaseRequest {
        private String cpNo;

        public OKCashbagCertRequest() {
        }

        public String getCpNo() {
            return this.cpNo;
        }

        public void setCpNo(String str) {
            this.cpNo = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        XPointService xPointService = (XPointService) getService(XPointService.class);
        OKCashbagCertRequest oKCashbagCertRequest = (OKCashbagCertRequest) getRequest();
        return xPointService.certifyOKCashbag(oKCashbagCertRequest.getDevice(), oKCashbagCertRequest.getVersion(), oKCashbagCertRequest.getKey(), oKCashbagCertRequest.getCpNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_certify_okcashbag;
    }
}
