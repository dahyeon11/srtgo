package com.korail.talk.data;

/* loaded from: classes.dex */
public class DiscountObjectData {
    private int index;
    private Object object;
    private String title;

    public DiscountObjectData() {
    }

    public int getIndex() {
        return this.index;
    }

    public Object getObject() {
        return this.object;
    }

    public String getTitle() {
        return this.title;
    }

    public void setIndex(int i8) {
        this.index = i8;
    }

    public void setObject(Object obj) {
        this.object = obj;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public DiscountObjectData(int i8, String str, Object obj) {
        this.index = i8;
        this.title = str;
        this.object = obj;
    }
}
