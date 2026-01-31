package com.korail.talk.network.request.inquiry;

import java.io.Serializable;
import z4.N;

/* loaded from: classes.dex */
public class TrainInquiryRequest extends RsvInquiryRequest implements Serializable, Cloneable {
    private String adjStnScdlOfrFlg;
    private String ebizCrossCheck;
    private String etrPath;
    private String mbCrdNo;
    private String pgPrCnt;
    private String qryDvCd;
    private String qryStNo;
    private String qryStTrnNo;
    private String rtYn;
    private String srtCheckYn;
    private String tkDptDt;
    private String tkDptTm;
    private String tkPsrmClCd;
    private String tkRcvdAmt;
    private String tkTrnNo;
    private String txtJobDv;

    public String getAdjStnScdlOfrFlg() {
        return N.isNotNull(this.adjStnScdlOfrFlg) ? this.adjStnScdlOfrFlg : "N";
    }

    public String getEbizCrossCheck() {
        return N.isNotNull(this.ebizCrossCheck) ? this.ebizCrossCheck : "N";
    }

    public String getEtrPath() {
        return this.etrPath;
    }

    public String getMbCrdNo() {
        return this.mbCrdNo;
    }

    @Override // com.korail.talk.network.request.inquiry.RsvInquiryRequest
    public String getPgPrCnt() {
        return this.pgPrCnt;
    }

    @Override // com.korail.talk.network.request.inquiry.RsvInquiryRequest
    public String getQryDvCd() {
        return this.qryDvCd;
    }

    @Override // com.korail.talk.network.request.inquiry.RsvInquiryRequest
    public String getQryStNo() {
        return this.qryStNo;
    }

    @Override // com.korail.talk.network.request.inquiry.RsvInquiryRequest
    public String getQryStTrnNo() {
        return this.qryStTrnNo;
    }

    public String getRtYn() {
        return N.isNotNull(this.rtYn) ? this.rtYn : "N";
    }

    public String getSrtCheckYn() {
        return N.isNotNull(this.srtCheckYn) ? this.srtCheckYn : "N";
    }

    public String getTkDptDt() {
        return this.tkDptDt;
    }

    public String getTkDptTm() {
        return this.tkDptTm;
    }

    public String getTkPsrmClCd() {
        return this.tkPsrmClCd;
    }

    public String getTkRcvdAmt() {
        return this.tkRcvdAmt;
    }

    public String getTkTrnNo() {
        return this.tkTrnNo;
    }

    public String getTxtJobDv() {
        return this.txtJobDv;
    }

    public void setAdjStnScdlOfrFlg(String str) {
        this.adjStnScdlOfrFlg = str;
    }

    public void setEbizCrossCheck(String str) {
        this.ebizCrossCheck = str;
    }

    public void setEtrPath(String str) {
        this.etrPath = str;
    }

    public void setMbCrdNo(String str) {
        this.mbCrdNo = str;
    }

    @Override // com.korail.talk.network.request.inquiry.RsvInquiryRequest
    public void setPgPrCnt(String str) {
        this.pgPrCnt = str;
    }

    @Override // com.korail.talk.network.request.inquiry.RsvInquiryRequest
    public void setQryDvCd(String str) {
        this.qryDvCd = str;
    }

    @Override // com.korail.talk.network.request.inquiry.RsvInquiryRequest
    public void setQryStNo(String str) {
        this.qryStNo = str;
    }

    @Override // com.korail.talk.network.request.inquiry.RsvInquiryRequest
    public void setQryStTrnNo(String str) {
        this.qryStTrnNo = str;
    }

    public void setRtYn(String str) {
        this.rtYn = str;
    }

    public void setSrtCheckYn(String str) {
        this.srtCheckYn = str;
    }

    public void setTkDptDt(String str) {
        this.tkDptDt = str;
    }

    public void setTkDptTm(String str) {
        this.tkDptTm = str;
    }

    public void setTkPsrmClCd(String str) {
        this.tkPsrmClCd = str;
    }

    public void setTkRcvdAmt(String str) {
        this.tkRcvdAmt = str;
    }

    public void setTkTrnNo(String str) {
        this.tkTrnNo = str;
    }

    public void setTxtJobDv(String str) {
        this.txtJobDv = str;
    }

    @Override // com.korail.talk.network.request.inquiry.RsvInquiryRequest
    /* renamed from: clone */
    public TrainInquiryRequest mo405clone() {
        return (TrainInquiryRequest) super.mo405clone();
    }
}
