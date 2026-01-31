package com.korail.talk.data;

import java.io.Serializable;

/* loaded from: classes.dex */
public class DisabilityReservationData implements Serializable {
    public String mReservationResponse;
    public int mSelectedPosition;
    private String mTxtPnrNo;

    public String getReservationResponse() {
        return this.mReservationResponse;
    }

    public int getSelectedPosition() {
        return this.mSelectedPosition;
    }

    public String getTxtPnrNo() {
        return this.mTxtPnrNo;
    }

    public void setReservationResponse(String str) {
        this.mReservationResponse = str;
    }

    public void setSelectedPosition(int i8) {
        this.mSelectedPosition = i8;
    }

    public void setTxtPnrNo(String str) {
        this.mTxtPnrNo = str;
    }
}
