package com.kakao.sdk.auth.network;

import C7.H;
import com.kakao.sdk.common.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AccessTokenInterceptorKt {
    public static final H withAccessToken(H h8, String accessToken) {
        Intrinsics.checkNotNullParameter(h8, "<this>");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return h8.newBuilder().removeHeader(Constants.AUTHORIZATION).addHeader(Constants.AUTHORIZATION, Intrinsics.stringPlus("Bearer ", accessToken)).build();
    }
}
