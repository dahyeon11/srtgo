package com.korail.talk.network.dao.gifticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class GifticketBookingDao extends BaseDao {

    public class GifticketBookingRequest extends BaseRequest {
        private String gdUtlPsNm;
        private String itmCnt;
        private String mbCrdNo;
        private String mrkAmt;
        private String prnbCnt;

        public GifticketBookingRequest() {
        }

        public String getGdUtlPsNm() {
            return this.gdUtlPsNm;
        }

        public String getItmCnt() {
            return this.itmCnt;
        }

        public String getMbCrdNo() {
            return this.mbCrdNo;
        }

        public String getMrkAmt() {
            return this.mrkAmt;
        }

        public String getPrnbCnt() {
            return this.prnbCnt;
        }

        public void setGdUtlPsNm(String str) {
            this.gdUtlPsNm = str;
        }

        public void setItmCnt(String str) {
            this.itmCnt = str;
        }

        public void setMbCrdNo(String str) {
            this.mbCrdNo = str;
        }

        public void setMrkAmt(String str) {
            this.mrkAmt = str;
        }

        public void setPrnbCnt(String str) {
            this.prnbCnt = str;
        }
    }

    public class GifticketBookingResponse extends BaseResponse {
        private String lumpStlTgtNo;
        private String prsCnqeVal;
        private String rcvdAmt;

        public GifticketBookingResponse() {
        }

        public String getLumpStlTgtNo() {
            return this.lumpStlTgtNo;
        }

        public String getPrsCnqeVal() {
            return this.prsCnqeVal;
        }

        public String getRcvdAmt() {
            return this.rcvdAmt;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        GifticketService gifticketService = (GifticketService) getService(GifticketService.class);
        GifticketBookingRequest gifticketBookingRequest = (GifticketBookingRequest) getRequest();
        return gifticketService.bookingGifticket(gifticketBookingRequest.getDevice(), gifticketBookingRequest.getVersion(), gifticketBookingRequest.getKey(), gifticketBookingRequest.getItmCnt(), gifticketBookingRequest.getMrkAmt(), gifticketBookingRequest.getPrnbCnt(), gifticketBookingRequest.getMbCrdNo(), gifticketBookingRequest.getGdUtlPsNm());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_gifticket_reservation;
    }
}
