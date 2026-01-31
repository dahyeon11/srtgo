package com.nhn.android.naverlogin.data;

import android.text.TextUtils;

/* loaded from: classes.dex */
public enum OAuthErrorCode {
    NONE("", ""),
    SERVER_ERROR_INVALID_REQUEST("invalid_request", "invalid_request"),
    SERVER_ERROR_UNAUTHORIZED_CLIENT("unauthorized_client", "unauthorized_client"),
    SERVER_ERROR_ACCESS_DENIED("access_denied", "access_denied"),
    SERVER_ERROR_UNSUPPORTED_RESPONSE_TYPE("unsupported_response_type", "unsupported_response_type"),
    SERVER_ERROR_INVALID_SCOPE("invalid_scope", "invalid_scope"),
    SERVER_ERROR_SERVER_ERROR("server_error", "server_error"),
    SERVER_ERROR_TEMPORARILY_UNAVAILABLE("temporarily_unavailable", "temporarily_unavailable"),
    ERROR_NO_CATAGORIZED("no_catagorized_error", "no_catagorized_error"),
    CLIENT_ERROR_PARSING_FAIL("parsing_fail", "parsing_fail"),
    CLIENT_ERROR_NO_CLIENTID("invalid_request", "no_clientid"),
    CLIENT_ERROR_NO_CLIENTSECRET("invalid_request", "no_clientsecret"),
    CLIENT_ERROR_NO_CLIENTNAME("invalid_request", "no_clientname"),
    CLIENT_ERROR_NO_CALLBACKURL("invalid_request", "no_callbackurl"),
    CLIENT_ERROR_CONNECTION_ERROR("server_error", "connection_error"),
    CLIENT_ERROR_CERTIFICATION_ERROR("server_error", "certification_error"),
    CLIENT_USER_CANCEL("user_cancel", "user_cancel");


    /* renamed from: a, reason: collision with root package name */
    private String f29632a;

    /* renamed from: b, reason: collision with root package name */
    private String f29633b;

    OAuthErrorCode(String str, String str2) {
        this.f29632a = str;
        this.f29633b = str2;
    }

    public static OAuthErrorCode fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return NONE;
        }
        for (OAuthErrorCode oAuthErrorCode : values()) {
            if (str.equalsIgnoreCase(oAuthErrorCode.f29632a)) {
                return oAuthErrorCode;
            }
            if (str.equalsIgnoreCase(oAuthErrorCode.name())) {
                return oAuthErrorCode;
            }
        }
        return ERROR_NO_CATAGORIZED;
    }

    public String getCode() {
        return this.f29632a;
    }

    public String getDesc() {
        return this.f29633b;
    }

    public void setDesc(String str) {
        this.f29633b = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f29632a;
    }
}
