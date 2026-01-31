package com.korail.talk.network.dao.gifticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class GifticketListDao extends BaseDao {

    public class GifticketInfo implements Serializable {
        private String intgCustNm1;
        private String intgCustNm2;
        private String nowPontValNum;
        private String rcvDt;
        private String retAmt;
        private String retDt;
        private String retTm;
        private String tkId;
        private String txnAmt;
        private String useClsDt;
        private String usePontValNum;
        private String usePsbFlg;

        public GifticketInfo() {
        }

        public String getIntgCustNm1() {
            return this.intgCustNm1;
        }

        public String getIntgCustNm2() {
            return this.intgCustNm2;
        }

        public String getNowPontValNum() {
            return this.nowPontValNum;
        }

        public String getRcvDt() {
            return this.rcvDt;
        }

        public String getRetAmt() {
            return this.retAmt;
        }

        public String getRetDt() {
            return this.retDt;
        }

        public String getRetTm() {
            return this.retTm;
        }

        public String getTkId() {
            return this.tkId;
        }

        public String getTxnAmt() {
            return this.txnAmt;
        }

        public String getUseClsDt() {
            return this.useClsDt;
        }

        public String getUsePontValNum() {
            return this.usePontValNum;
        }

        public String getUsePsbFlg() {
            return this.usePsbFlg;
        }
    }

    public class GifticketListRequest extends BaseRequest {
        private String abrdDtFrom;
        private String abrdDtTo;
        private String fllwQryFlg;
        private String qryDvCd;
        private String qryNumNext;
        private String qryVal;
        private String trnOprBzDvCd;
        private String usePsbFlg;

        public GifticketListRequest() {
        }

        public String getAbrdDtFrom() {
            return this.abrdDtFrom;
        }

        public String getAbrdDtTo() {
            return this.abrdDtTo;
        }

        public String getFllwQryFlg() {
            return this.fllwQryFlg;
        }

        public String getQryDvCd() {
            return this.qryDvCd;
        }

        public String getQryNumNext() {
            return this.qryNumNext;
        }

        public String getQryVal() {
            return this.qryVal;
        }

        public String getTrnOprBzDvCd() {
            return this.trnOprBzDvCd;
        }

        public String getUsePsbFlg() {
            return this.usePsbFlg;
        }

        public void setAbrdDtFrom(String str) {
            this.abrdDtFrom = str;
        }

        public void setAbrdDtTo(String str) {
            this.abrdDtTo = str;
        }

        public void setFllwQryFlg(String str) {
            this.fllwQryFlg = str;
        }

        public void setQryDvCd(String str) {
            this.qryDvCd = str;
        }

        public void setQryNumNext(String str) {
            this.qryNumNext = str;
        }

        public void setQryVal(String str) {
            this.qryVal = str;
        }

        public void setTrnOprBzDvCd(String str) {
            this.trnOprBzDvCd = str;
        }

        public void setUsePsbFlg(String str) {
            this.usePsbFlg = str;
        }
    }

    public class GifticketListResponse extends BaseResponse {
        private List<GifticketInfo> gdList;
        private String qryCnt;
        private String qryNumNext;

        public GifticketListResponse() {
        }

        public List<GifticketInfo> getGifticketInfoList() {
            return this.gdList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        GifticketService gifticketService = (GifticketService) getService(GifticketService.class);
        GifticketListRequest gifticketListRequest = (GifticketListRequest) getRequest();
        return gifticketService.getGifticketList(gifticketListRequest.getDevice(), gifticketListRequest.getVersion(), gifticketListRequest.getKey(), gifticketListRequest.getQryDvCd(), gifticketListRequest.getQryVal(), gifticketListRequest.getAbrdDtFrom(), gifticketListRequest.getAbrdDtTo(), gifticketListRequest.getUsePsbFlg(), gifticketListRequest.getQryNumNext(), gifticketListRequest.getFllwQryFlg(), gifticketListRequest.getTrnOprBzDvCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_gifticket_list;
    }
}
