package com.kakao.sdk.network;

import C7.E;
import O7.a;
import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.SdkLog;
import f7.InterfaceC5519a;
import kotlin.jvm.internal.Intrinsics;
import r4.g;
import retrofit2.c;
import retrofit2.x;

/* loaded from: classes.dex */
public final class ApiFactory {
    public static final ApiFactory INSTANCE = new ApiFactory();
    private static final InterfaceC0755i loggingInterceptor$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.network.ApiFactory$loggingInterceptor$2
        @Override // f7.InterfaceC5519a
        public final O7.a invoke() {
            O7.a aVar = new O7.a(new a.b() { // from class: com.kakao.sdk.network.ApiFactory$loggingInterceptor$2$interceptor$1
                @Override // O7.a.b
                public void log(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    SdkLog.Companion.i(message);
                }
            });
            aVar.setLevel(a.EnumC0062a.HEADERS);
            return aVar;
        }
    });
    private static final InterfaceC0755i kapi$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.network.ApiFactory$kapi$2
        @Override // f7.InterfaceC5519a
        public final x invoke() {
            ApiFactory apiFactory = ApiFactory.INSTANCE;
            String strStringPlus = Intrinsics.stringPlus(g.SECURE_PROTOCOL, KakaoSdk.INSTANCE.getHosts().getKapi());
            E.b bVarAddInterceptor = new E.b().addInterceptor(new KakaoAgentInterceptor(null, 1, 0 == true ? 1 : 0)).addInterceptor(new AppKeyInterceptor(null, 1, null)).addInterceptor(apiFactory.getLoggingInterceptor());
            Intrinsics.checkNotNullExpressionValue(bVarAddInterceptor, "Builder()\n                .addInterceptor(KakaoAgentInterceptor())\n                .addInterceptor(AppKeyInterceptor())\n                .addInterceptor(loggingInterceptor)");
            return ApiFactory.withClientAndAdapter$default(apiFactory, strStringPlus, bVarAddInterceptor, null, 4, null);
        }
    });

    private ApiFactory() {
    }

    public static /* synthetic */ x withClientAndAdapter$default(ApiFactory apiFactory, String str, E.b bVar, c.a aVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            aVar = null;
        }
        return apiFactory.withClientAndAdapter(str, bVar, aVar);
    }

    public final x getKapi() {
        return (x) kapi$delegate.getValue();
    }

    public final O7.a getLoggingInterceptor() {
        return (O7.a) loggingInterceptor$delegate.getValue();
    }

    public final x withClientAndAdapter(String url, E.b clientBuilder, c.a aVar) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clientBuilder, "clientBuilder");
        x.b bVarClient = new x.b().baseUrl(url).addConverterFactory(new KakaoRetrofitConverterFactory()).addConverterFactory(c8.a.create(KakaoJson.INSTANCE.getBase())).client(clientBuilder.build());
        if (aVar != null) {
            bVarClient.addCallAdapterFactory(aVar);
        }
        x xVarBuild = bVarClient.build();
        Intrinsics.checkNotNullExpressionValue(xVarBuild, "builder.build()");
        return xVarBuild;
    }
}
