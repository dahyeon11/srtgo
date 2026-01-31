package com.kakao.sdk.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class ServerHosts {
    public static final Companion Companion = new Companion(null);
    private final String kauth = "kauth.kakao.com";
    private final String kapi = "kapi.kakao.com";
    private final String account = "accounts.kakao.com";
    private final String mobileAccount = "auth.kakao.com";
    private final String sharer = "sharer.kakao.com";
    private final String navi = "kakaonavi-wguide.kakao.com";
    private final String channel = "pf.kakao.com";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public String getAccount() {
        return this.account;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getKapi() {
        return this.kapi;
    }

    public String getKauth() {
        return this.kauth;
    }

    public String getMobileAccount() {
        return this.mobileAccount;
    }

    public String getNavi() {
        return this.navi;
    }

    public String getSharer() {
        return this.sharer;
    }
}
