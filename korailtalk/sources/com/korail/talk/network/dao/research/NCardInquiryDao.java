package com.korail.talk.network.dao.research;

import android.text.Spanned;
import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class NCardInquiryDao extends BaseDao implements Serializable {

    public class NCardInquiryRequest extends BaseRequest implements Serializable {
        private String arvRsStnNm;
        private String dcntCrdKndCd;
        private String dcntCrdKndMgNo;
        private String dirtChtnDvCd;
        private String dptDt;
        private String dptRsStnNm;
        private String dptTm;
        private String qryPgNo;
        private int sectionNo;
        private String trnGpCd;
        private String usePsbTno;
        private String useTrmDno;

        public NCardInquiryRequest() {
        }

        public String getArvRsStnNm() {
            return this.arvRsStnNm;
        }

        public String getDcntCrdKndCd() {
            return this.dcntCrdKndCd;
        }

        public String getDcntCrdKndMgNo() {
            return this.dcntCrdKndMgNo;
        }

        public String getDirtChtnDvCd() {
            return this.dirtChtnDvCd;
        }

        public String getDptDt() {
            return this.dptDt;
        }

        public String getDptRsStnNm() {
            return this.dptRsStnNm;
        }

        public String getDptTm() {
            return this.dptTm;
        }

        public String getQryPgNo() {
            return this.qryPgNo;
        }

        public int getSectionNo() {
            return this.sectionNo;
        }

        public String getTrnGpCd() {
            return this.trnGpCd;
        }

        public String getUsePsbTno() {
            return this.usePsbTno;
        }

        public String getUseTrmDno() {
            return this.useTrmDno;
        }

        public void setArvRsStnNm(String str) {
            this.arvRsStnNm = str;
        }

        public void setDcntCrdKndCd(String str) {
            this.dcntCrdKndCd = str;
        }

        public void setDcntCrdKndMgNo(String str) {
            this.dcntCrdKndMgNo = str;
        }

        public void setDirtChtnDvCd(String str) {
            this.dirtChtnDvCd = str;
        }

        public void setDptDt(String str) {
            this.dptDt = str;
        }

        public void setDptRsStnNm(String str) {
            this.dptRsStnNm = str;
        }

        public void setDptTm(String str) {
            this.dptTm = str;
        }

        public void setQryPgNo(String str) {
            this.qryPgNo = str;
        }

        public void setSectionNo(int i8) {
            this.sectionNo = i8;
        }

        public void setTrnGpCd(String str) {
            this.trnGpCd = str;
        }

        public void setUsePsbTno(String str) {
            this.usePsbTno = str;
        }

        public void setUseTrmDno(String str) {
            this.useTrmDno = str;
        }
    }

    public class NCardInquiryResponse extends BaseResponse {
        private String fllwPgExt;
        private List<TrainInfo> trnScdlList;

        public NCardInquiryResponse() {
        }

        public String getFllwPgExt() {
            return this.fllwPgExt;
        }

        public List<TrainInfo> getTrnScdlList() {
            return this.trnScdlList;
        }
    }

    public class TrainInfo {
        private String arvRsStnCd;
        private String arvRsStnNm;
        private String arvStnConsOrdr;
        private String cmtrPrc;
        private String dirtChtnDvCd;
        private String dptRsStnCd;
        private String dptRsStnNm;
        private String dptStnConsOrdr;
        private String dturCd;
        private String dturNm;
        private String routCd;
        private String runDt;
        private Spanned stationInfo;
        private String stationStringInfo;
        private String trnGpCd;
        private String trnNo;

        public TrainInfo() {
        }

        public String getArvRsStnCd() {
            return this.arvRsStnCd;
        }

        public String getArvRsStnNm() {
            return this.arvRsStnNm;
        }

        public String getArvStnConsOrdr() {
            return this.arvStnConsOrdr;
        }

        public String getCmtrPrc() {
            return this.cmtrPrc;
        }

        public String getDirtChtnDvCd() {
            return this.dirtChtnDvCd;
        }

        public String getDptRsStnCd() {
            return this.dptRsStnCd;
        }

        public String getDptRsStnNm() {
            return this.dptRsStnNm;
        }

        public String getDptStnConsOrdr() {
            return this.dptStnConsOrdr;
        }

        public String getDturCd() {
            return this.dturCd;
        }

        public String getDturNm() {
            return this.dturNm;
        }

        public String getRoutCd() {
            return this.routCd;
        }

        public String getRunDt() {
            return this.runDt;
        }

        public Spanned getStationInfo() {
            return this.stationInfo;
        }

        public String getStationStringInfo() {
            return this.stationStringInfo;
        }

        public String getTrnGpCd() {
            return this.trnGpCd;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public void setStationInfo(Spanned spanned) {
            this.stationInfo = spanned;
        }

        public void setStationStringInfo(String str) {
            this.stationStringInfo = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ResearchService researchService = (ResearchService) getService(ResearchService.class);
        NCardInquiryRequest nCardInquiryRequest = (NCardInquiryRequest) getRequest();
        return researchService.getNCardSchedultView(nCardInquiryRequest.getDevice(), nCardInquiryRequest.getVersion(), nCardInquiryRequest.getKey(), nCardInquiryRequest.getDptDt(), nCardInquiryRequest.getDptRsStnNm(), nCardInquiryRequest.getArvRsStnNm(), nCardInquiryRequest.getDptTm(), nCardInquiryRequest.getTrnGpCd(), nCardInquiryRequest.getDirtChtnDvCd(), nCardInquiryRequest.getDcntCrdKndCd(), nCardInquiryRequest.getDcntCrdKndMgNo(), nCardInquiryRequest.getUseTrmDno(), nCardInquiryRequest.getUsePsbTno(), nCardInquiryRequest.getQryPgNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_n_card_inquiry;
    }
}
