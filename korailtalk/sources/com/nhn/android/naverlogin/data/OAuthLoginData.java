package com.nhn.android.naverlogin.data;

import C6.a;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public class OAuthLoginData {

    /* renamed from: a, reason: collision with root package name */
    private String f29634a;

    /* renamed from: b, reason: collision with root package name */
    private String f29635b;

    /* renamed from: c, reason: collision with root package name */
    private String f29636c;

    /* renamed from: d, reason: collision with root package name */
    private String f29637d;

    /* renamed from: e, reason: collision with root package name */
    private String f29638e;

    /* renamed from: f, reason: collision with root package name */
    private String f29639f;

    /* renamed from: g, reason: collision with root package name */
    private OAuthErrorCode f29640g;

    /* renamed from: h, reason: collision with root package name */
    private String f29641h;

    public OAuthLoginData(String str, String str2, String str3) {
        b(str, str2, str3, null);
    }

    private String a() {
        String string = new BigInteger(130, new SecureRandom()).toString(32);
        try {
            return URLEncoder.encode(string, "UTF-8");
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return string;
        }
    }

    private void b(String str, String str2, String str3, String str4) {
        this.f29634a = str;
        this.f29635b = str2;
        this.f29636c = str3;
        if (TextUtils.isEmpty(str4)) {
            this.f29637d = a();
        } else {
            this.f29637d = str4;
        }
    }

    private boolean c() {
        if (this.f29637d.equalsIgnoreCase(this.f29638e)) {
            return true;
        }
        if (a.isRealVersion()) {
            return false;
        }
        a.d("OAuthLoginData", "state is not valid. init:" + this.f29637d + ", check:" + this.f29638e);
        return false;
    }

    public String getCallbackUrl() {
        return this.f29636c;
    }

    public String getClientId() {
        return this.f29634a;
    }

    public String getClientSecret() {
        return this.f29635b;
    }

    public String getCode() {
        if (c()) {
            return this.f29639f;
        }
        return null;
    }

    public OAuthErrorCode getErrorCode() {
        return this.f29640g;
    }

    public String getErrorDesc() {
        return this.f29641h;
    }

    public String getInitState() {
        return this.f29637d;
    }

    public String getState() {
        return this.f29638e;
    }

    public boolean isSuccess() {
        return TextUtils.isEmpty(this.f29640g.getCode()) && c() && !TextUtils.isEmpty(this.f29639f);
    }

    public void setMiddleResult(String str, String str2, String str3, String str4) {
        this.f29639f = str;
        this.f29638e = str2;
        this.f29640g = OAuthErrorCode.fromString(str3);
        this.f29641h = str4;
    }

    public OAuthLoginData(String str, String str2, String str3, String str4) {
        b(str, str2, str3, str4);
    }
}
