package com.korail.talk.data;

/* loaded from: classes.dex */
public class CreditCardData {
    private String cardNumber;
    private String certNumber;
    private String creditCardType;
    private String installmentType;
    private String month;
    private String password;
    private String year;

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getCertNumber() {
        return this.certNumber;
    }

    public String getCrdVlidTrm() {
        return getYear().substring(2) + getMonth();
    }

    public String getCreditCardType() {
        return this.creditCardType;
    }

    public String getInstallmentType() {
        return this.installmentType;
    }

    public String getMonth() {
        return this.month;
    }

    public String getPassword() {
        return this.password;
    }

    public String getYear() {
        return this.year;
    }

    public void setCardNumber(String str) {
        this.cardNumber = str;
    }

    public void setCertNumber(String str) {
        this.certNumber = str;
    }

    public void setCreditCardType(String str) {
        this.creditCardType = str;
    }

    public void setInstallmentType(String str) {
        this.installmentType = str;
    }

    public void setMonth(String str) {
        this.month = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setYear(String str) {
        this.year = str;
    }
}
