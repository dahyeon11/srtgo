package com.kakao.sdk.auth.network;

import C7.E;
import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.network.ApiFactory;
import com.kakao.sdk.network.KakaoAgentInterceptor;
import f7.InterfaceC5519a;
import kotlin.jvm.internal.Intrinsics;
import r4.g;
import retrofit2.x;

/* loaded from: classes.dex */
public final class ApiFactoryKt {
    private static final InterfaceC0755i kapiWithOAuth$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.auth.network.ApiFactoryKt$kapiWithOAuth$2
        @Override // f7.InterfaceC5519a
        public final x invoke() {
            ApiFactory apiFactory = ApiFactory.INSTANCE;
            String strStringPlus = Intrinsics.stringPlus(g.SECURE_PROTOCOL, KakaoSdk.INSTANCE.getHosts().getKapi());
            int i8 = 1;
            E.b bVarAddInterceptor = new E.b().addInterceptor(new KakaoAgentInterceptor(null, i8, 0 == true ? 1 : 0)).addInterceptor(new AccessTokenInterceptor(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0)).addInterceptor(new RequiredScopesInterceptor(0 == true ? 1 : 0, i8, 0 == true ? 1 : 0)).addInterceptor(apiFactory.getLoggingInterceptor());
            Intrinsics.checkNotNullExpressionValue(bVarAddInterceptor, "Builder()\n            .addInterceptor(KakaoAgentInterceptor())\n            .addInterceptor(AccessTokenInterceptor())\n            .addInterceptor(RequiredScopesInterceptor())\n            .addInterceptor(ApiFactory.loggingInterceptor)");
            return ApiFactory.withClientAndAdapter$default(apiFactory, strStringPlus, bVarAddInterceptor, null, 4, null);
        }
    });
    private static final InterfaceC0755i kauth$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.auth.network.ApiFactoryKt$kauth$2
        @Override // f7.InterfaceC5519a
        public final x invoke() {
            ApiFactory apiFactory = ApiFactory.INSTANCE;
            String strStringPlus = Intrinsics.stringPlus(g.SECURE_PROTOCOL, KakaoSdk.INSTANCE.getHosts().getKauth());
            E.b bVarAddInterceptor = new E.b().addInterceptor(new KakaoAgentInterceptor(null, 1, 0 == true ? 1 : 0)).addInterceptor(apiFactory.getLoggingInterceptor());
            Intrinsics.checkNotNullExpressionValue(bVarAddInterceptor, "Builder()\n            .addInterceptor(KakaoAgentInterceptor())\n            .addInterceptor(ApiFactory.loggingInterceptor)");
            return ApiFactory.withClientAndAdapter$default(apiFactory, strStringPlus, bVarAddInterceptor, null, 4, null);
        }
    });

    public static final x getKapiWithOAuth(ApiFactory apiFactory) {
        Intrinsics.checkNotNullParameter(apiFactory, "<this>");
        return (x) kapiWithOAuth$delegate.getValue();
    }

    public static final x getKauth(ApiFactory apiFactory) {
        Intrinsics.checkNotNullParameter(apiFactory, "<this>");
        return (x) kauth$delegate.getValue();
    }
}
