package com.korail.talk.data;

import java.io.Serializable;

/* loaded from: classes.dex */
public class StbkData implements Serializable {
    public static final int CHANGE_PASSWORD = 3;
    public static final int DEFAULT = 0;
    public static final int PAYMENT = 1;
    public static final int REGISTER_ACCOUNT = 2;
    private String acntNo;
    private String imageUrl;
    private String password;
    private String phoneNumber;
    private String stbkTxnNo;
    private String stlBankCd;
    private int subType;
    private int type;

    public String getAcntNo() {
        return this.acntNo;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getStbkTxnNo() {
        return this.stbkTxnNo;
    }

    public String getStlBankCd() {
        return this.stlBankCd;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getType() {
        return this.type;
    }

    public void setAcntNo(String str) {
        this.acntNo = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setStbkTxnNo(String str) {
        this.stbkTxnNo = str;
    }

    public void setStlBankCd(String str) {
        this.stlBankCd = str;
    }

    public void setSubType(int i8) {
        this.subType = i8;
    }

    public void setType(int i8) {
        this.type = i8;
    }
}
