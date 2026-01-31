package com.korail.talk.data.reservation;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class ReservationMessageData implements Serializable {
    private List<String> mMessageList;
    private String mTitle;

    public List<String> getMessageList() {
        return this.mMessageList;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setMessageList(List<String> list) {
        this.mMessageList = list;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
