package com.kakao.sdk.network;

import C7.B;
import C7.J;
import com.kakao.sdk.common.Constants;
import com.kakao.sdk.common.KakaoSdk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AppKeyInterceptor implements B {
    private final String appKey;

    public AppKeyInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // C7.B
    public J intercept(B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        J jProceed = chain.proceed(chain.request().newBuilder().addHeader(Constants.AUTHORIZATION, Intrinsics.stringPlus("KakaoAK ", this.appKey)).build());
        Intrinsics.checkNotNullExpressionValue(jProceed, "chain.proceed(request)");
        return jProceed;
    }

    public AppKeyInterceptor(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.appKey = appKey;
    }

    public /* synthetic */ AppKeyInterceptor(String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo().getAppKey() : str);
    }
}
