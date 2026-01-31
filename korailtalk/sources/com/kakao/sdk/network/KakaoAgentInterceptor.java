package com.kakao.sdk.network;

import C7.B;
import C7.H;
import C7.J;
import com.kakao.sdk.common.Constants;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ContextInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class KakaoAgentInterceptor implements B {
    private final ContextInfo contextInfo;

    public KakaoAgentInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final ContextInfo getContextInfo() {
        return this.contextInfo;
    }

    @Override // C7.B
    public J intercept(B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        H hRequest = chain.request();
        J jProceed = chain.proceed(hRequest.newBuilder().addHeader(Constants.KA, this.contextInfo.getKaHeader()).build());
        Intrinsics.checkNotNullExpressionValue(jProceed, "chain.proceed(request)");
        return jProceed;
    }

    public KakaoAgentInterceptor(ContextInfo contextInfo) {
        Intrinsics.checkNotNullParameter(contextInfo, "contextInfo");
        this.contextInfo = contextInfo;
    }

    public /* synthetic */ KakaoAgentInterceptor(ContextInfo contextInfo, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : contextInfo);
    }
}
