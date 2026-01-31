package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TossAutoStlKeyQryDao extends BaseDao {

    public class SimplePayInfo {
        private String acntNo;
        private String binNo;
        private String imageUrl;
        private String pwdErrTno;
        private String spayDvCd;
        private String spayStlKeyVal;
        private String stlBankCd;
        private String stlBankNm;
        private String stlCrdCoCd;

        public SimplePayInfo() {
        }

        public String getAcntNo() {
            return this.acntNo;
        }

        public String getBinNo() {
            return this.binNo;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        public String getPwdErrTno() {
            return this.pwdErrTno;
        }

        public String getSpayDvCd() {
            return this.spayDvCd;
        }

        public String getSpayStlKeyVal() {
            return this.spayStlKeyVal;
        }

        public String getStlBankCd() {
            return this.stlBankCd;
        }

        public String getStlBankNm() {
            return this.stlBankNm;
        }

        public String getStlCrdCoCd() {
            return this.stlCrdCoCd;
        }
    }

    public class StlKeyQryRequest extends BaseRequest {
        private String spayDvCd;

        public StlKeyQryRequest() {
        }

        public String getSpayDvCd() {
            return this.spayDvCd;
        }

        public void setSpayDvCd(String str) {
            this.spayDvCd = str;
        }
    }

    public class StlKeyQryResponse extends BaseResponse {
        private List<SimplePayInfo> spayList;

        public StlKeyQryResponse() {
        }

        public List<SimplePayInfo> getSpayList() {
            return this.spayList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PayService payService = (PayService) getService(PayService.class);
        StlKeyQryRequest stlKeyQryRequest = (StlKeyQryRequest) getRequest();
        return payService.stlKeyQry(stlKeyQryRequest.getDevice(), stlKeyQryRequest.getVersion(), stlKeyQryRequest.getKey(), stlKeyQryRequest.getSpayDvCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_stl_key_qry;
    }
}
