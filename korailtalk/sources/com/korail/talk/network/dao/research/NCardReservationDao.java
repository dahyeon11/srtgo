package com.korail.talk.network.dao.research;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.data.reservation.RJrny;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class NCardReservationDao extends BaseDao implements Serializable {

    public class NCardReservationRequest extends BaseRequest implements Serializable {
        public static final String APD_CUST_NAME = "apdCustName_";
        public static final String CUSTOM_STATION_INFO = "CUSTOM_STATION_INFO";
        public String custMgNo;
        public String dcntCrdKndMgNo;
        public String usePsbTno;
        public String vlidTrmStDt;
        private final String JRNY_CNT = RJrny.JRNY_CNT;
        private final String JRNY_TP_CD = RJrny.JRNY_TP_CD;
        private final String RUN_DT = RJrny.RUN_DT;
        private final String TRN_NO = RJrny.TRN_NO;
        private final String DPT_RS_STN_CD = RJrny.DPT_RS_STN_CD;
        private final String ARV_RS_STN_CD = RJrny.ARV_RS_STN_CD;
        private final String APD_USR_CNT = "apdUsrCnt";
        private final String CUST_MG_NO = "custMgNo_";
        private final String APD_CUST_TEL = "apdCustTeln_";
        public HashMap<String, String> jrnyInfo = new HashMap<>();
        public HashMap<String, String> apdUsrInfo = new HashMap<>();
        private HashMap<String, String> mCustomData = new LinkedHashMap();

        public NCardReservationRequest() {
        }

        public HashMap<String, String> getApdUsrInfo() {
            return this.apdUsrInfo;
        }

        public String getCustMgNo() {
            return this.custMgNo;
        }

        public HashMap<String, String> getCustomData() {
            return this.mCustomData;
        }

        public String getDcntCrdKndMgNo() {
            return this.dcntCrdKndMgNo;
        }

        public HashMap<String, String> getJrnyInfo() {
            return this.jrnyInfo;
        }

        public String getUsePsbTno() {
            return this.usePsbTno;
        }

        public String getVlidTrmStDt() {
            return this.vlidTrmStDt;
        }

        public void setApdCustName(int i8, String str) {
            this.apdUsrInfo.put(APD_CUST_NAME + i8, str);
        }

        public void setApdCustTel(int i8, String str) {
            this.apdUsrInfo.put("apdCustTeln_" + i8, str);
        }

        public void setArvRsStnCd(int i8, String str) {
            this.jrnyInfo.put(RJrny.ARV_RS_STN_CD + i8, str);
        }

        public void setCustMgNo(String str) {
            this.custMgNo = str;
        }

        public void setDcntCrdKndMgNo(String str) {
            this.dcntCrdKndMgNo = str;
        }

        public void setDptRsStnCd(int i8, String str) {
            this.jrnyInfo.put(RJrny.DPT_RS_STN_CD + i8, str);
        }

        public void setJrnyCnt(String str) {
            this.jrnyInfo.put(RJrny.JRNY_CNT, str);
        }

        public void setJrnyTpCd(int i8, String str) {
            this.jrnyInfo.put(RJrny.JRNY_TP_CD + i8, str);
        }

        public void setRunDt(int i8, String str) {
            this.jrnyInfo.put(RJrny.RUN_DT + i8, str);
        }

        public void setStationInfo(int i8, String str) {
            this.mCustomData.put(CUSTOM_STATION_INFO + i8, str);
        }

        public void setTrnNo(int i8, String str) {
            this.jrnyInfo.put(RJrny.TRN_NO + i8, str);
        }

        public void setUsePsbTno(String str) {
            this.usePsbTno = str;
        }

        public void setUserCnt(String str) {
            this.apdUsrInfo.put("apdUsrCnt", str);
        }

        public void setVlidTrmStDt(String str) {
            this.vlidTrmStDt = str;
        }

        public void setCustMgNo(int i8, String str) {
            this.apdUsrInfo.put("custMgNo_" + i8, str);
        }
    }

    public class NCardReservationResponse extends BaseResponse implements Serializable {
        private String lumpStlTgtNo;
        private String mStationInfo;
        private String mUserNames;
        private String rcvdAmt;
        private String usePsbTno;
        private String vlidTrmClsDt;
        private String vlidTrmStDt;

        public NCardReservationResponse() {
        }

        public String getLumpStlTgtNo() {
            return this.lumpStlTgtNo;
        }

        public String getRcvdAmt() {
            return this.rcvdAmt;
        }

        public String getStationInfo() {
            return this.mStationInfo;
        }

        public String getUsePsbTno() {
            return this.usePsbTno;
        }

        public String getUserNames() {
            return this.mUserNames;
        }

        public String getVlidTrmClsDt() {
            return this.vlidTrmClsDt;
        }

        public String getVlidTrmStDt() {
            return this.vlidTrmStDt;
        }

        public void setStationInfo(String str) {
            this.mStationInfo = str;
        }

        public void setUserNames(String str) {
            this.mUserNames = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ResearchService researchService = (ResearchService) getService(ResearchService.class);
        NCardReservationRequest nCardReservationRequest = (NCardReservationRequest) getRequest();
        return researchService.setNCardReservation(nCardReservationRequest.getDevice(), nCardReservationRequest.getVersion(), nCardReservationRequest.getKey(), nCardReservationRequest.getDcntCrdKndMgNo(), nCardReservationRequest.getCustMgNo(), nCardReservationRequest.getVlidTrmStDt(), nCardReservationRequest.getUsePsbTno(), nCardReservationRequest.getJrnyInfo(), nCardReservationRequest.getApdUsrInfo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_n_card_reservation;
    }
}
