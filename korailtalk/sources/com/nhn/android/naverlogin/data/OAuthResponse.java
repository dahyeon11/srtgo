package com.nhn.android.naverlogin.data;

import android.text.TextUtils;
import com.kakao.sdk.auth.Constants;
import java.util.Map;

/* loaded from: classes.dex */
public class OAuthResponse {

    /* renamed from: a, reason: collision with root package name */
    private String f29654a;

    /* renamed from: b, reason: collision with root package name */
    private String f29655b;

    /* renamed from: c, reason: collision with root package name */
    private long f29656c;

    /* renamed from: d, reason: collision with root package name */
    private String f29657d;

    /* renamed from: e, reason: collision with root package name */
    private String f29658e;

    /* renamed from: f, reason: collision with root package name */
    private OAuthErrorCode f29659f;

    /* renamed from: g, reason: collision with root package name */
    private String f29660g;

    public OAuthResponse(Map<String, String> map) {
        this.f29655b = map.get(Constants.ACCESS_TOKEN);
        this.f29657d = map.get(Constants.REFRESH_TOKEN);
        this.f29658e = map.get(Constants.TOKEN_TYPE);
        try {
            this.f29656c = Long.parseLong(map.get(Constants.EXPIRES_IN));
        } catch (Exception unused) {
            this.f29656c = 3600L;
        }
        this.f29659f = OAuthErrorCode.fromString(map.get("error"));
        this.f29660g = map.get(Constants.ERROR_DESCRIPTION);
        this.f29654a = map.get("result");
    }

    public String getAccessToken() {
        return this.f29655b;
    }

    public OAuthErrorCode getErrorCode() {
        return this.f29659f;
    }

    public String getErrorDesc() {
        return this.f29660g;
    }

    public long getExpiresIn() {
        return this.f29656c;
    }

    public String getRefreshToken() {
        return this.f29657d;
    }

    public String getResultValue() {
        return this.f29654a;
    }

    public String getTokenType() {
        return this.f29658e;
    }

    public boolean isSuccess() {
        return TextUtils.isEmpty(this.f29659f.getCode()) && !TextUtils.isEmpty(this.f29655b);
    }

    public OAuthResponse(OAuthErrorCode oAuthErrorCode) {
        this.f29659f = oAuthErrorCode;
        this.f29660g = oAuthErrorCode.getDesc();
    }

    public OAuthResponse(OAuthErrorCode oAuthErrorCode, String str) {
        this.f29659f = oAuthErrorCode;
        this.f29660g = str;
    }
}
