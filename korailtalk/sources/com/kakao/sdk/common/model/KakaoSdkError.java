package com.kakao.sdk.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class KakaoSdkError extends RuntimeException {
    private final String msg;

    public /* synthetic */ KakaoSdkError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getMsg() {
        return this.msg;
    }

    public final boolean isInvalidTokenError() {
        if (this instanceof AuthError) {
            if (((AuthError) this).getReason() == AuthErrorCause.InvalidGrant) {
                return true;
            }
        } else if ((this instanceof ApiError) && ((ApiError) this).getReason() == ApiErrorCause.InvalidToken) {
            return true;
        }
        return false;
    }

    private KakaoSdkError(String str) {
        super(str);
        this.msg = str;
    }
}
