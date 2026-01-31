package com.korail.talk.database.model.old;

import com.j256.ormlite.field.DatabaseField;

/* loaded from: classes.dex */
public class CreditCard {

    @DatabaseField
    private String cardNickname;

    @DatabaseField
    private String cardNumber;

    @DatabaseField
    private String cardValidateMonth;

    @DatabaseField
    private String cardValidateYear;

    @DatabaseField(generatedId = true)
    private int id;

    public String getCardNickname() {
        return this.cardNickname;
    }

    public String getCardNumber() {
        return this.cardNumber;
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

    public void setCardNickname(String str) {
        this.cardNickname = str;
    }

    public void setCardNumber(String str) {
        this.cardNumber = str;
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
