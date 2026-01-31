package com.korail.talk.network.dao.gifticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class GifticketHistoryDao extends BaseDao {

    public class GifticketDetailData implements Serializable {
        private String dataDvCd;
        private String rmkCont;
        private String stlNo;
        private String stlSqno;
        private String txnAmt;
        private String txnDt;

        public GifticketDetailData() {
        }

        public String getDataDvCd() {
            return this.dataDvCd;
        }

        public String getRmkCont() {
            return this.rmkCont;
        }

        public String getStlNo() {
            return this.stlNo;
        }

        public String getStlSqno() {
            return this.stlSqno;
        }

        public String getTxnAmt() {
            return this.txnAmt;
        }

        public String getTxnDt() {
            return this.txnDt;
        }
    }

    public class GifticketHistoryRequest extends BaseRequest {
        private String qryNum;
        private String tkId;

        public GifticketHistoryRequest() {
        }

        public String getTkId() {
            return this.tkId;
        }

        public void setQryNum(String str) {
            this.qryNum = str;
        }

        public void setTkId(String str) {
            this.tkId = str;
        }
    }

    public class GifticketHistoryResponse extends BaseResponse {
        private String fllwQryFlg;
        private String qryCnt;
        private List<GifticketDetailData> txnList;

        public GifticketHistoryResponse() {
        }

        public List<GifticketDetailData> getTxnList() {
            return this.txnList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        GifticketService gifticketService = (GifticketService) getService(GifticketService.class);
        GifticketHistoryRequest gifticketHistoryRequest = (GifticketHistoryRequest) getRequest();
        return gifticketService.historyGifticket(gifticketHistoryRequest.getDevice(), gifticketHistoryRequest.getVersion(), gifticketHistoryRequest.getKey(), gifticketHistoryRequest.getTkId());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_gifticket_history;
    }
}
