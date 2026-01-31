package com.korail.talk.database.model;

import com.j256.ormlite.field.DatabaseField;
import java.io.Serializable;

/* loaded from: classes.dex */
public class SMSData implements Serializable {

    @DatabaseField
    private String phoneNumber;

    @DatabaseField(id = true)
    private String pnrNo;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPnrNo() {
        return this.pnrNo;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPnrNo(String str) {
        this.pnrNo = str;
    }
}
