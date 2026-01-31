package com.korail.talk.network.dao.trainsInfo;

import I4.b;
import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import java.util.LinkedHashMap;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class Price2FareDao extends BaseDao {

    public class Price2Fare {
        public static final String jrnySqnoString = "jrnySqno";
        public static final String psrmClNmString = "psrmClNm";
        public static final String rcvdFareString = "rcvdFare";
        public static final String rcvdPrcString = "rcvdPrc";
        public static final String sumAmtString = "sumAmt";
        public static final String trnNoString = "trnNo";
        private String jrnySqno;
        private String psrmClNm;
        private String rcvdFare;
        private String rcvdPrc;
        private String sumAmt;
        private String trnNo;

        public Price2Fare() {
        }

        public String getJrnySqno() {
            return this.jrnySqno;
        }

        public String getJrnySqnoStr() {
            return jrnySqnoString;
        }

        public String getPsrmClNm() {
            return this.psrmClNm;
        }

        public String getPsrmClNmStr() {
            return psrmClNmString;
        }

        public String getRcvdFare() {
            return this.rcvdFare;
        }

        public String getRcvdFareStr() {
            return rcvdFareString;
        }

        public String getRcvdPrc() {
            return this.rcvdPrc;
        }

        public String getRcvdPrcStr() {
            return rcvdPrcString;
        }

        public String getSumAmt() {
            return this.sumAmt;
        }

        public String getSumAmtStr() {
            return sumAmtString;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public String getTrnNoStr() {
            return trnNoString;
        }
    }

    public class Price2FareParams extends LinkedHashMap<String, String> {
        private final String trnGpCd = "trnGpCd";
        private final String stlbTrnClsfCd = "stlbTrnClsfCd";
        private final String dptRsStnCd = "dptRsStnCd";
        private final String arvRsStnCd = b.ARV_RS_STN_CD;
        private final String runDt = "runDt";
        private final String trnNo = Price2Fare.trnNoString;
        private final String gdNo = "gdNo";
        private final String rqSeatAttCd = "rqSeatAttCd";

        public Price2FareParams() {
        }

        public void setArvRsStnCd(String str) {
            put(b.ARV_RS_STN_CD, str);
        }

        public void setDptRsStnCd(String str) {
            put("dptRsStnCd", str);
        }

        public void setGdNo(String str) {
            put("gdNo", str);
        }

        public void setRqSeatAttCd(String str) {
            put("rqSeatAttCd", str);
        }

        public void setRunDt(String str) {
            put("runDt", str);
        }

        public void setStlbTrnClsfCd(String str) {
            put("stlbTrnClsfCd", str);
        }

        public void setTrnGpCd(String str) {
            put("trnGpCd", str);
        }

        public void setTrnNo(String str) {
            put(Price2Fare.trnNoString, str);
        }
    }

    public class Price2FareRequest extends BaseRequest {
        private String chtnDvCd;
        private int mSelectIndex;
        private RsvInquiryResponse.TrainInfo[] mTrainInfo;
        private Price2FareParams price2FareParams;
        private String trnCnt;
        private String txtMenuId;

        public Price2FareRequest() {
        }

        public String getChtnDvCd() {
            return this.chtnDvCd;
        }

        public LinkedHashMap<String, String> getPrice2FareParams() {
            return this.price2FareParams;
        }

        public RsvInquiryResponse.TrainInfo[] getTrainInfo() {
            return this.mTrainInfo;
        }

        public String getTrnCnt() {
            return this.trnCnt;
        }

        public String getTxtMenuId() {
            return this.txtMenuId;
        }

        public void setChtnDvCd(String str) {
            this.chtnDvCd = str;
        }

        public void setPrice2FareParams(Price2FareParams price2FareParams) {
            this.price2FareParams = price2FareParams;
        }

        public void setTrainInfo(RsvInquiryResponse.TrainInfo[] trainInfoArr) {
            this.mTrainInfo = trainInfoArr;
        }

        public void setTrnCnt(String str) {
            this.trnCnt = this.trnCnt;
        }

        public void setTxtMenuId(String str) {
            this.txtMenuId = str;
        }
    }

    public class Price2FareResponse extends BaseResponse {
        private List<Price2Fare> prcList;

        public Price2FareResponse() {
        }

        public List<Price2Fare> getPrcList() {
            return this.prcList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TrainsInfoService trainsInfoService = (TrainsInfoService) getService(TrainsInfoService.class);
        Price2FareRequest price2FareRequest = (Price2FareRequest) getRequest();
        return trainsInfoService.getPrice2Fare(price2FareRequest.getDevice(), price2FareRequest.getVersion(), price2FareRequest.getKey(), price2FareRequest.getTxtMenuId(), price2FareRequest.getChtnDvCd(), price2FareRequest.getTrnCnt(), price2FareRequest.getPrice2FareParams());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_price_2_fare;
    }
}
