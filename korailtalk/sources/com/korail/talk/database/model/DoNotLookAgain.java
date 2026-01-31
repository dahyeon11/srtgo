package com.korail.talk.database.model;

import com.j256.ormlite.field.DatabaseField;

/* loaded from: classes.dex */
public class DoNotLookAgain {

    @DatabaseField
    private String confirmDate;

    @DatabaseField(id = true, uniqueCombo = true)
    private String custMgNo;

    @DatabaseField(uniqueCombo = true)
    private int doNotLookAgainType;

    public String getConfirmDate() {
        return this.confirmDate;
    }

    public String getCustMgNo() {
        return this.custMgNo;
    }

    public int getDoNotLookAgainType() {
        return this.doNotLookAgainType;
    }

    public void setConfirmDate(String str) {
        this.confirmDate = str;
    }

    public void setCustMgNo(String str) {
        this.custMgNo = str;
    }

    public void setDoNotLookAgainType(int i8) {
        this.doNotLookAgainType = i8;
    }
}
