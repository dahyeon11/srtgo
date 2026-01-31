package com.korail.talk.database.model;

import com.j256.ormlite.field.DatabaseField;

/* loaded from: classes.dex */
public class MainPopupData {
    public static final int CHECK_TYPE_HIDDEN = 0;
    public static final int CHECK_TYPE_SHOW = 1;

    @DatabaseField
    private String buttonType;

    @DatabaseField
    private int checkType;

    @DatabaseField
    private String clsBtn;

    @DatabaseField
    private String confirmDate;

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String imageUrl;

    @DatabaseField
    private String isExternalBrowser;

    @DatabaseField
    private String isShow;

    @DatabaseField
    private String linkTitle;

    @DatabaseField
    private String linkUrl;

    @DatabaseField
    private String message;

    @DatabaseField
    private int noticeId;

    @DatabaseField
    private String size;

    @DatabaseField
    private String title;

    @DatabaseField
    private String voice;

    public String getButtonType() {
        return this.buttonType;
    }

    public int getCheckType() {
        return this.checkType;
    }

    public String getClsBtn() {
        return this.clsBtn;
    }

    public String getConfirmDate() {
        return this.confirmDate;
    }

    public String getExternalBrowser() {
        return this.isExternalBrowser;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getLinkTitle() {
        return this.linkTitle;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String getMessage() {
        return this.message;
    }

    public int getNoticeId() {
        return this.noticeId;
    }

    public boolean getShow() {
        return this.isShow.equalsIgnoreCase("Y");
    }

    public String getSize() {
        return this.size;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVoice() {
        return this.voice;
    }

    public void setButtonType(String str) {
        this.buttonType = str;
    }

    public void setCheckType(int i8) {
        this.checkType = i8;
    }

    public void setClsBtn(String str) {
        this.clsBtn = str;
    }

    public void setConfirmDate(String str) {
        this.confirmDate = str;
    }

    public void setExternalBrowser(String str) {
        this.isExternalBrowser = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setLinkTitle(String str) {
        this.linkTitle = str;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setNoticeId(int i8) {
        this.noticeId = i8;
    }

    public void setShow(String str) {
        this.isShow = str;
    }

    public void setSize(String str) {
        this.size = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVoice(String str) {
        this.voice = str;
    }
}
