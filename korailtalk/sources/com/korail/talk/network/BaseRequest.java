package com.korail.talk.network;

import java.io.Serializable;

/* loaded from: classes.dex */
public class BaseRequest implements Serializable {
    public static final String ANDROID = "AD";
    public static final String APP_KEY = "korail1234567890";
    public static final String VERSION = "250601001";
    private String device;
    private String key;
    private String version;

    public BaseRequest() {
        setDevice(ANDROID);
        setVersion("250601001");
        setKey(APP_KEY);
    }

    public String getDevice() {
        return this.device;
    }

    public String getKey() {
        return this.key;
    }

    public String getVersion() {
        return this.version;
    }

    public void setDevice(String str) {
        this.device = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
