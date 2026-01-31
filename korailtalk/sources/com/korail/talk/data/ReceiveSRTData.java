package com.korail.talk.data;

import java.io.Serializable;
import z4.C6634h;
import z4.N;

/* loaded from: classes.dex */
public class ReceiveSRTData implements Serializable {
    private String mutMrkVrfCd;
    private String radJobId;
    private String selGotrain;
    private String txtGoAbrdDt;
    private String txtGoEnd;
    private String txtGoHour;
    private String txtGoStart;
    private String txtGoTrnNo;
    private String txtJobDv;
    private String txtMenuId;
    private String txtPsgFlg_1;
    private String txtPsgFlg_2;
    private String txtPsgFlg_3;
    private String txtPsgFlg_4;
    private String txtPsgFlg_5;
    private String txtPsgFlg_6;
    private String txtSeatAttCd_2;
    private String txtSeatAttCd_3;
    private String txtSeatAttCd_4;
    private String txtTrnGpCd;

    public int getAdultCount() {
        return N.getInteger(this.txtPsgFlg_1);
    }

    public String getArrivalStation() {
        return this.txtGoEnd;
    }

    public CalendarData getCalendarInfo() {
        return C6634h.getCalendarInfo(C6634h.getCalendarFromString(this.txtGoAbrdDt + this.txtGoHour, "yyyyMMddHHmmss"));
    }

    public int getChildAccompanyCount() {
        return N.getInteger(this.txtPsgFlg_6);
    }

    public int getChildCount() {
        return N.getInteger(this.txtPsgFlg_2);
    }

    public String getDepartureStation() {
        return this.txtGoStart;
    }

    public int getHighDisabledCount() {
        return N.getInteger(this.txtPsgFlg_4);
    }

    public int getLowDisabledCount() {
        return N.getInteger(this.txtPsgFlg_5);
    }

    public int getSeniorCount() {
        return N.getInteger(this.txtPsgFlg_3);
    }

    public String getTrainNo() {
        return this.txtGoTrnNo;
    }

    public void setMutMrkVrfCd(String str) {
        this.mutMrkVrfCd = str;
    }

    public void setRadJobId(String str) {
        this.radJobId = str;
    }

    public void setSelGotrain(String str) {
        this.selGotrain = str;
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

    public void setTxtJobDv(String str) {
        this.txtJobDv = str;
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

    public void setTxtPsgFlg_6(String str) {
        this.txtPsgFlg_6 = str;
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
}
