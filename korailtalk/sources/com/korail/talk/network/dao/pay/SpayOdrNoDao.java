package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.ArrayList;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class SpayOdrNoDao extends BaseDao {

    public class SpayOdrNoRequest extends BaseRequest {
        private ArrayList<String> lumpStlTgtNo;
        private String spayDvCd;
        private String tgtCnt;
        private String totTxnAmt;

        public SpayOdrNoRequest() {
        }

        public ArrayList<String> getLumpStlTgtNo() {
            return this.lumpStlTgtNo;
        }

        public String getSpayDvCd() {
            return this.spayDvCd;
        }

        public String getTgtCnt() {
            return this.tgtCnt;
        }

        public String getTotTxnAmt() {
            return this.totTxnAmt;
        }

        public void setLumpStlTgtNo(ArrayList<String> arrayList) {
            this.lumpStlTgtNo = arrayList;
        }

        public void setSpayDvCd(String str) {
            this.spayDvCd = str;
        }

        public void setTgtCnt(String str) {
            this.tgtCnt = str;
        }

        public void setTotTxnAmt(String str) {
            this.totTxnAmt = str;
        }
    }

    public class SpayOdrNoResponse extends BaseResponse {
        private String fllwScnAppUrlAdr;
        private String prprNo;
        private String spayTid;

        public SpayOdrNoResponse() {
        }

        public String getFllwScnAppUrlAdr() {
            return this.fllwScnAppUrlAdr;
        }

        public String getPrprNo() {
            return this.prprNo;
        }

        public String getSpayTid() {
            return this.spayTid;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PayService payService = (PayService) getService(PayService.class);
        SpayOdrNoRequest spayOdrNoRequest = (SpayOdrNoRequest) getRequest();
        return payService.getSpayOdrNo(spayOdrNoRequest.getDevice(), spayOdrNoRequest.getVersion(), spayOdrNoRequest.getKey(), spayOdrNoRequest.getSpayDvCd(), spayOdrNoRequest.getTotTxnAmt(), spayOdrNoRequest.getTgtCnt(), spayOdrNoRequest.getLumpStlTgtNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_spay_odr_no;
    }
}
