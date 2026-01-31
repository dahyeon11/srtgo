package com.kakao.sdk.auth.network;

import C7.B;
import C7.H;
import C7.J;
import C7.K;
import R6.G;
import com.kakao.sdk.auth.AuthApiManager;
import com.kakao.sdk.auth.TokenManagerProvider;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.model.ApiError;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.network.ExceptionWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AccessTokenInterceptor implements B {
    private final AuthApiManager manager;
    private final TokenManagerProvider tokenManagerProvider;

    public AccessTokenInterceptor() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // C7.B
    public J intercept(B.a chain) {
        H request;
        String accessToken;
        Intrinsics.checkNotNullParameter(chain, "chain");
        OAuthToken token = this.tokenManagerProvider.getManager().getToken();
        String accessToken2 = token == null ? null : token.getAccessToken();
        if (accessToken2 == null) {
            request = null;
        } else {
            H hRequest = chain.request();
            Intrinsics.checkNotNullExpressionValue(hRequest, "chain.request()");
            request = AccessTokenInterceptorKt.withAccessToken(hRequest, accessToken2);
        }
        if (request == null) {
            request = chain.request();
        }
        Intrinsics.checkNotNullExpressionValue(request, "request");
        J jProceed = chain.proceed(request);
        K kBody = jProceed.body();
        String strString = kBody == null ? null : kBody.string();
        J newResponse = jProceed.newBuilder().body(K.create(kBody == null ? null : kBody.contentType(), strString == null ? "" : strString)).build();
        Intrinsics.checkNotNullExpressionValue(newResponse, "newResponse");
        if (!newResponse.isSuccessful()) {
            ApiErrorResponse apiErrorResponse = strString == null ? null : (ApiErrorResponse) KakaoJson.INSTANCE.fromJson(strString, ApiErrorResponse.class);
            ApiErrorCause apiErrorCause = apiErrorResponse != null ? (ApiErrorCause) KakaoJson.INSTANCE.fromJson(String.valueOf(apiErrorResponse.getCode()), ApiErrorCause.class) : null;
            if (apiErrorCause != null && new ApiError(newResponse.code(), apiErrorCause, apiErrorResponse).getReason() == ApiErrorCause.InvalidToken) {
                synchronized (this) {
                    OAuthToken token2 = this.tokenManagerProvider.getManager().getToken();
                    if (token2 != null) {
                        if (Intrinsics.areEqual(token2.getAccessToken(), accessToken2)) {
                            try {
                                accessToken = this.manager.refreshToken$auth_release(token2).getAccessToken();
                            } catch (Throwable th) {
                                throw new ExceptionWrapper(th);
                            }
                        } else {
                            accessToken = token2.getAccessToken();
                        }
                        J jProceed2 = chain.proceed(AccessTokenInterceptorKt.withAccessToken(request, accessToken));
                        Intrinsics.checkNotNullExpressionValue(jProceed2, "chain.proceed(request.withAccessToken(accessToken))");
                        return jProceed2;
                    }
                    G g8 = G.INSTANCE;
                }
            }
        }
        return newResponse;
    }

    public AccessTokenInterceptor(TokenManagerProvider tokenManagerProvider, AuthApiManager manager) {
        Intrinsics.checkNotNullParameter(tokenManagerProvider, "tokenManagerProvider");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.tokenManagerProvider = tokenManagerProvider;
        this.manager = manager;
    }

    public /* synthetic */ AccessTokenInterceptor(TokenManagerProvider tokenManagerProvider, AuthApiManager authApiManager, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? TokenManagerProvider.Companion.getInstance() : tokenManagerProvider, (i8 & 2) != 0 ? AuthApiManager.Companion.getInstance() : authApiManager);
    }
}
