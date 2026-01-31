package com.korail.talk.data;

/* loaded from: classes.dex */
public class PointData {
    private String customerNo;
    private String month;
    private String password;
    private String pointCardNumber;
    private String pointType;
    private int usePoint;
    private String year;

    public String getCrdVlidTrm() {
        return getYear().substring(2) + getMonth();
    }

    public String getCustomerNo() {
        return this.customerNo;
    }

    public String getMonth() {
        return this.month;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPointCardNumber() {
        return this.pointCardNumber;
    }

    public String getPointType() {
        return this.pointType;
    }

    public int getUsePoint() {
        return this.usePoint;
    }

    public String getYear() {
        return this.year;
    }

    public void setCustomerNo(String str) {
        this.customerNo = str;
    }

    public void setMonth(String str) {
        this.month = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setPointCardNumber(String str) {
        this.pointCardNumber = str;
    }

    public void setPointType(String str) {
        this.pointType = str;
    }

    public void setUsePoint(int i8) {
        this.usePoint = i8;
    }

    public void setYear(String str) {
        this.year = str;
    }
}
