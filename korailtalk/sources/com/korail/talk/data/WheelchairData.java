package com.korail.talk.data;

import java.io.Serializable;

/* loaded from: classes.dex */
public class WheelchairData implements Serializable {
    private String dptDt;
    private boolean isShowCancelButton;
    private String saleDt;
    private String sqNo;
    private String trnNm;
    private String wctNo;

    public String getDptDt() {
        return this.dptDt;
    }

    public String getSaleDt() {
        return this.saleDt;
    }

    public String getSqNo() {
        return this.sqNo;
    }

    public String getTrnNm() {
        return this.trnNm;
    }

    public String getWctNo() {
        return this.wctNo;
    }

    public boolean isShowCancelButton() {
        return this.isShowCancelButton;
    }

    public void setDptDt(String str) {
        this.dptDt = str;
    }

    public void setSaleDt(String str) {
        this.saleDt = str;
    }

    public void setShowCancelButton(boolean z8) {
        this.isShowCancelButton = z8;
    }

    public void setSqNo(String str) {
        this.sqNo = str;
    }

    public void setTrnNm(String str) {
        this.trnNm = str;
    }

    public void setWctNo(String str) {
        this.wctNo = str;
    }
}
