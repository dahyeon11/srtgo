package com.korail.talk.data;

import android.content.Intent;

/* loaded from: classes.dex */
public class PlayAppData {
    private Intent intent;
    private boolean isFinishActivity;
    private boolean isShowDialog;
    private Object[] messageList;
    private String packageName;
    private String title;

    public Intent getIntent() {
        return this.intent;
    }

    public Object[] getMessageList() {
        return this.messageList;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isFinishActivity() {
        return this.isFinishActivity;
    }

    public boolean isShowDialog() {
        return this.isShowDialog;
    }

    public void setFinishActivity(boolean z8) {
        this.isFinishActivity = z8;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public void setMessageList(Object... objArr) {
        this.messageList = (Object[]) objArr.clone();
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setShowDialog(boolean z8) {
        this.isShowDialog = z8;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
