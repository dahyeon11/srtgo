package com.korail.talk.network.request.inquiry;

import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import java.io.Serializable;
import java.util.List;
import r4.d;

/* loaded from: classes.dex */
public class RsvInquiryRequest extends BaseRequest implements Serializable, Cloneable {
    private int adultCount;
    private String chtnCnt;
    private String chtnRsStnCd1;
    private String pgPrCnt;
    private String qryDvCd;
    private String qryStNo;
    private String qryStTrnNo;
    private String qryStTrnNo2;
    private String radJobId;
    private String selGoTrain;
    private int totalCount;
    private String trnGpCd1;
    private String trnGpCnt;
    private String txtGoAbrdDt;
    private String txtGoEnd;
    private String txtGoHour;
    private String txtGoStart;
    private String txtGoTrnNo;
    private String txtMenuId;
    private String txtPsgFlg_1;
    private String txtPsgFlg_2;
    private String txtPsgFlg_3;
    private String txtPsgFlg_4;
    private String txtPsgFlg_5;
    private String txtSeatAttCd_2;
    private String txtSeatAttCd_3;
    private String txtSeatAttCd_4;
    private String txtTrnGpCd;

    public int getAdultCount() {
        return this.adultCount;
    }

    public String getChtnCnt() {
        return this.chtnCnt;
    }

    public String getChtnRsStnCd() {
        return this.chtnRsStnCd1;
    }

    public String getPgPrCnt() {
        return this.pgPrCnt;
    }

    public String getQryDvCd() {
        return this.qryDvCd;
    }

    public String getQryStNo() {
        return this.qryStNo;
    }

    public String getQryStTrnNo() {
        return this.qryStTrnNo;
    }

    public String getQryStTrnNo2() {
        return this.qryStTrnNo2;
    }

    public String getRadJobId() {
        return this.radJobId;
    }

    public String getSelGoTrain() {
        return this.selGoTrain;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public String getTrnGpCd() {
        return this.trnGpCd1;
    }

    public String getTrnGpCnt() {
        return this.trnGpCnt;
    }

    public String getTxtGoAbrdDt() {
        return this.txtGoAbrdDt;
    }

    public String getTxtGoEnd() {
        return this.txtGoEnd;
    }

    public String getTxtGoHour() {
        return this.txtGoHour;
    }

    public String getTxtGoStart() {
        return this.txtGoStart;
    }

    public String getTxtGoTrnNo() {
        return this.txtGoTrnNo;
    }

    public String getTxtMenuId() {
        return this.txtMenuId;
    }

    public String getTxtPsgFlg_1() {
        return this.txtPsgFlg_1;
    }

    public String getTxtPsgFlg_2() {
        return this.txtPsgFlg_2;
    }

    public String getTxtPsgFlg_3() {
        return this.txtPsgFlg_3;
    }

    public String getTxtPsgFlg_4() {
        return this.txtPsgFlg_4;
    }

    public String getTxtPsgFlg_5() {
        return this.txtPsgFlg_5;
    }

    public String getTxtSeatAttCd_2() {
        return this.txtSeatAttCd_2;
    }

    public String getTxtSeatAttCd_3() {
        return this.txtSeatAttCd_3;
    }

    public String getTxtSeatAttCd_4() {
        return this.txtSeatAttCd_4;
    }

    public String getTxtTrnGpCd() {
        return this.txtTrnGpCd;
    }

    public void setAdultCount(int i8) {
        this.adultCount = i8;
    }

    public void setChtnCnt(String str) {
        this.chtnCnt = str;
    }

    public void setChtnRsStnCd(String str) {
        this.chtnRsStnCd1 = str;
    }

    public void setNextStartTime(List<RsvInquiryResponse.TrainInfo> list) {
        StringBuffer stringBuffer = new StringBuffer();
        if (d.DIRECT_SQ_NO.getCode().equals(list.get(list.size() - 1).getH_chg_trn_seq())) {
            stringBuffer.append(list.get(list.size() - 1).getH_dpt_tm());
        } else {
            stringBuffer.append(list.get(list.size() - 2).getH_dpt_tm());
        }
        setTxtGoHour(stringBuffer.toString());
    }

    public void setNextTimeTC(String str, String str2) {
        setQryStNo(str);
        setQryStTrnNo(str2);
    }

    public void setPgPrCnt(String str) {
        this.pgPrCnt = str;
    }

    public void setQryDvCd(String str) {
        this.qryDvCd = str;
    }

    public void setQryStNo(String str) {
        this.qryStNo = str;
    }

    public void setQryStTrnNo(String str) {
        this.qryStTrnNo = str;
    }

    public void setQryStTrnNo2(String str) {
        this.qryStTrnNo2 = str;
    }

    public void setRadJobId(String str) {
        this.radJobId = str;
    }

    public void setSelGoTrain(String str) {
        this.selGoTrain = str;
    }

    public void setSelectTransferPage(String str, String str2) {
        setQryStNo(str);
        setPgPrCnt(str2);
    }

    public void setSelectTransferPages(String str, String str2) {
        setQryStTrnNo(str);
        setQryStTrnNo2(str2);
    }

    public void setTotalCount(int i8) {
        this.totalCount = i8;
    }

    public void setTrnGpCd(String str) {
        this.trnGpCd1 = str;
    }

    public void setTrnGpCnt(String str) {
        this.trnGpCnt = str;
    }

    public void setTxtGoAbrdDt(String str) {
        this.txtGoAbrdDt = str;
    }

    public void setTxtGoEnd(String str) {
        this.txtGoEnd = str;
    }

    public void setTxtGoHour(String str) {
        this.txtGoHour = str;
    }

    public void setTxtGoStart(String str) {
        this.txtGoStart = str;
    }

    public void setTxtGoTrnNo(String str) {
        this.txtGoTrnNo = str;
    }

    public void setTxtMenuId(String str) {
        this.txtMenuId = str;
    }

    public void setTxtPsgFlg_1(String str) {
        this.txtPsgFlg_1 = str;
    }

    public void setTxtPsgFlg_2(String str) {
        this.txtPsgFlg_2 = str;
    }

    public void setTxtPsgFlg_3(String str) {
        this.txtPsgFlg_3 = str;
    }

    public void setTxtPsgFlg_4(String str) {
        this.txtPsgFlg_4 = str;
    }

    public void setTxtPsgFlg_5(String str) {
        this.txtPsgFlg_5 = str;
    }

    public void setTxtSeatAttCd_2(String str) {
        this.txtSeatAttCd_2 = str;
    }

    public void setTxtSeatAttCd_3(String str) {
        this.txtSeatAttCd_3 = str;
    }

    public void setTxtSeatAttCd_4(String str) {
        this.txtSeatAttCd_4 = str;
    }

    public void setTxtTrnGpCd(String str) {
        this.txtTrnGpCd = str;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RsvInquiryRequest mo405clone() {
        return (RsvInquiryRequest) super.clone();
    }
}
