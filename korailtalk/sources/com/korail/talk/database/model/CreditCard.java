package com.korail.talk.database.model;

import com.j256.ormlite.field.DatabaseField;

/* loaded from: classes.dex */
public class CreditCard {

    @DatabaseField
    private String businessNum;

    @DatabaseField
    private String cardNickname;

    @DatabaseField
    private String cardNumber;

    @DatabaseField
    private String cardType;

    @DatabaseField
    private String cardValidateMonth;

    @DatabaseField
    private String cardValidateYear;

    @DatabaseField(generatedId = true)
    private int id;

    public String getBusinessNum() {
        return this.businessNum;
    }

    public String getCardNickname() {
        return this.cardNickname;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getCardValidateMonth() {
        return this.cardValidateMonth;
    }

    public String getCardValidateYear() {
        return this.cardValidateYear;
    }

    public int getId() {
        return this.id;
    }

    public void setBusinessNum(String str) {
        this.businessNum = str;
    }

    public void setCardNickname(String str) {
        this.cardNickname = str;
    }

    public void setCardNumber(String str) {
        this.cardNumber = str;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public void setCardValidateMonth(String str) {
        this.cardValidateMonth = str;
    }

    public void setCardValidateYear(String str) {
        this.cardValidateYear = str;
    }

    public void setId(int i8) {
        this.id = i8;
    }
}
