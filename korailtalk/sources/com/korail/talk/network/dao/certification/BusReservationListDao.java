package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.ArrayList;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class BusReservationListDao extends ReservationDao {

    public class BusInquiryRequest extends BaseRequest implements Serializable {
        private String arvRsStnCd;
        private String dptDt;
        private String dptRsStnCd;
        private String dptTm;
        private BusInquiryResponse mReservationResponse;
        private String psrmClCd;
        private String rsvSaleDvCd;
        private String seatAttCd;
        private String trnGpCd;
        private String trnNo;

        public BusInquiryRequest() {
        }

        public String getArvRsStnCd() {
            return this.arvRsStnCd;
        }

        public String getDptDt() {
            return this.dptDt;
        }

        public String getDptRsStnCd() {
            return this.dptRsStnCd;
        }

        public String getDptTm() {
            return this.dptTm;
        }

        public String getPsrmClCd() {
            return this.psrmClCd;
        }

        public BusInquiryResponse getReservationResponse() {
            return this.mReservationResponse;
        }

        public String getRsvSaleDvCd() {
            return this.rsvSaleDvCd;
        }

        public String getSeatAttCd() {
            return this.seatAttCd;
        }

        public String getTrnGpCd() {
            return this.trnGpCd;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public void setArvRsStnCd(String str) {
            this.arvRsStnCd = str;
        }

        public void setDptDt(String str) {
            this.dptDt = str;
        }

        public void setDptRsStnCd(String str) {
            this.dptRsStnCd = str;
        }

        public void setDptTm(String str) {
            this.dptTm = str;
        }

        public void setPsrmClCd(String str) {
            this.psrmClCd = str;
        }

        public void setReservationResponse(BusInquiryResponse busInquiryResponse) {
            this.mReservationResponse = busInquiryResponse;
        }

        public void setRsvSaleDvCd(String str) {
            this.rsvSaleDvCd = str;
        }

        public void setSeatAttCd(String str) {
            this.seatAttCd = str;
        }

        public void setTrnGpCd(String str) {
            this.trnGpCd = str;
        }

        public void setTrnNo(String str) {
            this.trnNo = str;
        }
    }

    public class BusInquiryResponse extends BaseResponse implements Serializable {
        private String fllwPgExt;
        private String lgtmShtmDvCd;
        private ArrayList<BusList> trainList;

        public BusInquiryResponse() {
        }

        public String getFllwPgExt() {
            return this.fllwPgExt;
        }

        public String getLgtmShtmDvCd() {
            return this.lgtmShtmDvCd;
        }

        public ArrayList<BusList> getTrainList() {
            return this.trainList;
        }

        public void setFllwPgExt(String str) {
            this.fllwPgExt = str;
        }

        public void setLgtmShtmDvCd(String str) {
            this.lgtmShtmDvCd = str;
        }

        public void setTrainList(ArrayList<BusList> arrayList) {
            this.trainList = arrayList;
        }
    }

    public class BusList implements Serializable {
        private String arvDt;
        private String arvRsStnCd;
        private String arvStnRunOrdr;
        private String arvTm;
        private String chtnDvCd;
        private String dptDt;
        private String dptRsStnCd;
        private String dptStnRunOrdr;
        private String dptTm;
        private String gnrmRestSeatNum;
        private String ocurDlayTnum;
        private String restFresNum;
        private String restStndNum;
        private String runDt;
        private String sprmRestSeatNum;
        private String stlbTrnClsfCd;
        private String trnGpCd;
        private String trnNo;
        private String trnOrdNo;
        private String ymsAplFlg;

        public BusList() {
        }

        public String getArvDt() {
            return this.arvDt;
        }

        public String getArvRsStnCd() {
            return this.arvRsStnCd;
        }

        public String getArvStnRunOrdr() {
            return this.arvStnRunOrdr;
        }

        public String getArvTm() {
            return this.arvTm;
        }

        public String getChtnDvCd() {
            return this.chtnDvCd;
        }

        public String getDptDt() {
            return this.dptDt;
        }

        public String getDptRsStnCd() {
            return this.dptRsStnCd;
        }

        public String getDptStnRunOrdr() {
            return this.dptStnRunOrdr;
        }

        public String getDptTm() {
            return this.dptTm;
        }

        public String getGnrmRestSeatNum() {
            return this.gnrmRestSeatNum;
        }

        public String getOcurDlayTnum() {
            return this.ocurDlayTnum;
        }

        public String getRestFresNum() {
            return this.restFresNum;
        }

        public String getRestStndNum() {
            return this.restStndNum;
        }

        public String getRunDt() {
            return this.runDt;
        }

        public String getSprmRestSeatNum() {
            return this.sprmRestSeatNum;
        }

        public String getStlbTrnClsfCd() {
            return this.stlbTrnClsfCd;
        }

        public String getTrnGpCd() {
            return this.trnGpCd;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public String getTrnOrdNo() {
            return this.trnOrdNo;
        }

        public String getYmsAplFlg() {
            return this.ymsAplFlg;
        }

        public void setArvDt(String str) {
            this.arvDt = str;
        }

        public void setArvRsStnCd(String str) {
            this.arvRsStnCd = str;
        }

        public void setArvStnRunOrdr(String str) {
            this.arvStnRunOrdr = str;
        }

        public void setArvTm(String str) {
            this.arvTm = str;
        }

        public void setChtnDvCd(String str) {
            this.chtnDvCd = str;
        }

        public void setDptDt(String str) {
            this.dptDt = str;
        }

        public void setDptRsStnCd(String str) {
            this.dptRsStnCd = str;
        }

        public void setDptStnRunOrdr(String str) {
            this.dptStnRunOrdr = str;
        }

        public void setDptTm(String str) {
            this.dptTm = str;
        }

        public void setGnrmRestSeatNum(String str) {
            this.gnrmRestSeatNum = str;
        }

        public void setOcurDlayTnum(String str) {
            this.ocurDlayTnum = str;
        }

        public void setRestFresNum(String str) {
            this.restFresNum = str;
        }

        public void setRestStndNum(String str) {
            this.restStndNum = str;
        }

        public void setRunDt(String str) {
            this.runDt = str;
        }

        public void setSprmRestSeatNum(String str) {
            this.sprmRestSeatNum = str;
        }

        public void setStlbTrnClsfCd(String str) {
            this.stlbTrnClsfCd = str;
        }

        public void setTrnGpCd(String str) {
            this.trnGpCd = str;
        }

        public void setTrnNo(String str) {
            this.trnNo = str;
        }

        public void setTrnOrdNo(String str) {
            this.trnOrdNo = str;
        }

        public void setYmsAplFlg(String str) {
            this.ymsAplFlg = str;
        }
    }

    @Override // com.korail.talk.network.dao.certification.ReservationDao, com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        BusReservationService busReservationService = (BusReservationService) getService(BusReservationService.class);
        BusInquiryRequest busInquiryRequest = (BusInquiryRequest) getRequest();
        busReservationService.reservationList(busInquiryRequest.getDevice(), busInquiryRequest.getVersion(), busInquiryRequest.getKey(), busInquiryRequest.getDptDt(), busInquiryRequest.getDptRsStnCd(), busInquiryRequest.getArvRsStnCd(), busInquiryRequest.getTrnGpCd(), busInquiryRequest.getPsrmClCd(), busInquiryRequest.getDptTm(), busInquiryRequest.getTrnNo(), busInquiryRequest.getSeatAttCd(), busInquiryRequest.getRsvSaleDvCd());
        return busReservationService.reservationList(busInquiryRequest.getDevice(), busInquiryRequest.getVersion(), busInquiryRequest.getKey(), busInquiryRequest.getDptDt(), busInquiryRequest.getDptRsStnCd(), busInquiryRequest.getArvRsStnCd(), busInquiryRequest.getTrnGpCd(), busInquiryRequest.getPsrmClCd(), busInquiryRequest.getDptTm(), busInquiryRequest.getTrnNo(), busInquiryRequest.getSeatAttCd(), busInquiryRequest.getRsvSaleDvCd());
    }

    @Override // com.korail.talk.network.dao.certification.ReservationDao, com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_bus_reservation_list;
    }
}
