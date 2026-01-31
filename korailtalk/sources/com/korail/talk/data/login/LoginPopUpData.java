package com.korail.talk.data.login;

import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public class LoginPopUpData implements Serializable {
    private Class aClass;
    private String[] mBtnNames;
    private String mCheckBoxMessage;
    private int mDialogType;
    private HashMap<String, String> mExecuteData;
    private String mMessage;
    private int mRequestCode;
    private String mTitle;
    private String mUrl;
    private boolean isDim = false;
    private boolean hasHtml = false;

    public Class getAClass() {
        return this.aClass;
    }

    public String[] getBtnNames() {
        return this.mBtnNames;
    }

    public String getCheckBoxMessage() {
        return this.mCheckBoxMessage;
    }

    public int getDialogType() {
        return this.mDialogType;
    }

    public HashMap<String, String> getExecuteData() {
        return this.mExecuteData;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public int getRequestCode() {
        return this.mRequestCode;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean isDim() {
        return this.isDim;
    }

    public boolean isHasHtml() {
        return this.hasHtml;
    }

    public void setAClass(Class cls) {
        this.aClass = cls;
    }

    public void setBtnNames(String[] strArr) {
        this.mBtnNames = strArr;
    }

    public void setCheckBoxMessage(String str) {
        this.mCheckBoxMessage = str;
    }

    public void setDialogType(int i8) {
        this.mDialogType = i8;
    }

    public void setDim(boolean z8) {
        this.isDim = z8;
    }

    public void setExecuteData(HashMap<String, String> map) {
        this.mExecuteData = map;
    }

    public void setHasHtml(boolean z8) {
        this.hasHtml = z8;
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setRequestCode(int i8) {
        this.mRequestCode = i8;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }
}
