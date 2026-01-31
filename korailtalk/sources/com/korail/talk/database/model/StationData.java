package com.korail.talk.database.model;

import com.j256.ormlite.field.DatabaseField;

/* loaded from: classes.dex */
public class StationData {

    @DatabaseField
    private String doNotLookADay;

    @DatabaseField
    private boolean doNotLookAgain;

    @DatabaseField
    private String group;

    @DatabaseField(id = true)
    private int id;

    @DatabaseField
    private String latitude;

    @DatabaseField
    private String longitude;

    @DatabaseField
    private String major;

    @DatabaseField
    private String popupLinkTitle;

    @DatabaseField
    private String popupLinkUrl;

    @DatabaseField
    private String popupMessage;

    @DatabaseField
    private int popupType;

    @DatabaseField
    private String stnCd;

    @DatabaseField
    private String stnNm;

    public String getDoNotLookADay() {
        return this.doNotLookADay;
    }

    public boolean getDoNotLookAgain() {
        return this.doNotLookAgain;
    }

    public String getGroup() {
        return this.group;
    }

    public int getId() {
        return this.id;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getMajor() {
        return this.major;
    }

    public String getPopupLinkTitle() {
        return this.popupLinkTitle;
    }

    public String getPopupLinkUrl() {
        return this.popupLinkUrl;
    }

    public String getPopupMessage() {
        return this.popupMessage;
    }

    public int getPopupType() {
        return this.popupType;
    }

    public String getStnCd() {
        return this.stnCd;
    }

    public String getStnNm() {
        return this.stnNm;
    }

    public void setDoNotLookADay(String str) {
        this.doNotLookADay = str;
    }

    public void setDoNotLookAgain(boolean z8) {
        this.doNotLookAgain = z8;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public void setMajor(String str) {
        this.major = str;
    }

    public void setPopupLinkTitle(String str) {
        this.popupLinkTitle = str;
    }

    public void setPopupLinkUrl(String str) {
        this.popupLinkUrl = str;
    }

    public void setPopupMessage(String str) {
        this.popupMessage = str;
    }

    public void setPopupType(int i8) {
        this.popupType = i8;
    }

    public void setStnCd(String str) {
        this.stnCd = str;
    }

    public void setStnNm(String str) {
        this.stnNm = str;
    }
}
