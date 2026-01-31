package com.kakao.sdk.auth.network;

import C7.B;
import C7.H;
import C7.J;
import C7.K;
import R6.G;
import android.content.Context;
import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.AuthCodeClient;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApiError;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.model.ApplicationContextInfo;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.network.ExceptionWrapper;
import f7.p;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class RequiredScopesInterceptor implements B {
    private final ApplicationContextInfo contextInfo;

    public RequiredScopesInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // C7.B
    public J intercept(B.a chain) throws InterruptedException, ExceptionWrapper {
        List<String> list;
        List<String> list2;
        String accessToken;
        Intrinsics.checkNotNullParameter(chain, "chain");
        H hRequest = chain.request();
        Intrinsics.checkNotNullExpressionValue(hRequest, "chain.request()");
        J jProceed = chain.proceed(hRequest);
        K kBody = jProceed.body();
        J jProceed2 = null;
        String strString = kBody == null ? null : kBody.string();
        J newResponse = jProceed.newBuilder().body(K.create(kBody == null ? null : kBody.contentType(), strString == null ? "" : strString)).build();
        Intrinsics.checkNotNullExpressionValue(newResponse, "newResponse");
        if (!newResponse.isSuccessful()) {
            ApiErrorResponse apiErrorResponse = strString == null ? null : (ApiErrorResponse) KakaoJson.INSTANCE.fromJson(strString, ApiErrorResponse.class);
            ApiErrorCause apiErrorCause = apiErrorResponse == null ? null : (ApiErrorCause) KakaoJson.INSTANCE.fromJson(String.valueOf(apiErrorResponse.getCode()), ApiErrorCause.class);
            if (apiErrorCause != null) {
                ApiError apiError = new ApiError(newResponse.code(), apiErrorCause, apiErrorResponse);
                final List<String> requiredScopes = apiError.getResponse().getRequiredScopes();
                ApiErrorCause reason = apiError.getReason();
                ApiErrorCause apiErrorCause2 = ApiErrorCause.InsufficientScope;
                if (reason == apiErrorCause2 && (list2 = requiredScopes) != null && !list2.isEmpty()) {
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    AuthApiClient.Companion.getInstance().agt(new p() { // from class: com.kakao.sdk.auth.network.RequiredScopesInterceptor$intercept$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // f7.p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws NoSuchAlgorithmException {
                            invoke((String) obj, (Throwable) obj2);
                            return G.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(String str, Throwable th) throws NoSuchAlgorithmException {
                            if (th != 0) {
                                objectRef2.element = th;
                                countDownLatch.countDown();
                                return;
                            }
                            AuthCodeClient.Companion companion = AuthCodeClient.Companion;
                            final String strCodeVerifier = companion.codeVerifier();
                            AuthCodeClient companion2 = companion.getInstance();
                            Context applicationContext = this.contextInfo.getApplicationContext();
                            List<String> list3 = requiredScopes;
                            final Ref.ObjectRef<Throwable> objectRef3 = objectRef2;
                            final CountDownLatch countDownLatch2 = countDownLatch;
                            final Ref.ObjectRef<OAuthToken> objectRef4 = objectRef;
                            AuthCodeClient.authorizeWithKakaoAccount$default(companion2, applicationContext, null, null, list3, null, str, null, null, false, null, null, strCodeVerifier, new p() { // from class: com.kakao.sdk.auth.network.RequiredScopesInterceptor$intercept$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // f7.p
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((String) obj, (Throwable) obj2);
                                    return G.INSTANCE;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(String str2, Throwable th2) {
                                    if (th2 != 0) {
                                        objectRef3.element = th2;
                                        countDownLatch2.countDown();
                                        return;
                                    }
                                    AuthApiClient companion3 = AuthApiClient.Companion.getInstance();
                                    Intrinsics.checkNotNull(str2);
                                    String str3 = strCodeVerifier;
                                    final Ref.ObjectRef<OAuthToken> objectRef5 = objectRef4;
                                    final Ref.ObjectRef<Throwable> objectRef6 = objectRef3;
                                    final CountDownLatch countDownLatch3 = countDownLatch2;
                                    companion3.issueAccessToken(str2, str3, new p() { // from class: com.kakao.sdk.auth.network.RequiredScopesInterceptor.intercept.1.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // f7.p
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((OAuthToken) obj, (Throwable) obj2);
                                            return G.INSTANCE;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        public final void invoke(OAuthToken oAuthToken, Throwable th3) {
                                            objectRef5.element = oAuthToken;
                                            objectRef6.element = th3;
                                            countDownLatch3.countDown();
                                        }
                                    });
                                }
                            }, 2006, null);
                        }
                    });
                    countDownLatch.await();
                    OAuthToken oAuthToken = (OAuthToken) objectRef.element;
                    if (oAuthToken != null && (accessToken = oAuthToken.getAccessToken()) != null) {
                        H hRequest2 = newResponse.request();
                        Intrinsics.checkNotNullExpressionValue(hRequest2, "response.request()");
                        jProceed2 = chain.proceed(AccessTokenInterceptorKt.withAccessToken(hRequest2, accessToken));
                    }
                    if (jProceed2 != null) {
                        return jProceed2;
                    }
                    T t8 = objectRef2.element;
                    Intrinsics.checkNotNull(t8);
                    throw new ExceptionWrapper((Throwable) t8);
                }
                if (apiError.getReason() == apiErrorCause2 && ((list = requiredScopes) == null || list.isEmpty())) {
                    int statusCode = apiError.getStatusCode();
                    ApiErrorCause apiErrorCause3 = ApiErrorCause.Unknown;
                    throw new ExceptionWrapper(new ApiError(statusCode, apiErrorCause3, new ApiErrorResponse(apiErrorCause3.getErrorCode(), "requiredScopes not exist", null, apiError.getResponse().getRequiredScopes(), apiError.getResponse().getAllowedScopes(), 4, null)));
                }
            }
        }
        return newResponse;
    }

    public RequiredScopesInterceptor(ApplicationContextInfo contextInfo) {
        Intrinsics.checkNotNullParameter(contextInfo, "contextInfo");
        this.contextInfo = contextInfo;
    }

    public /* synthetic */ RequiredScopesInterceptor(ApplicationContextInfo applicationContextInfo, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : applicationContextInfo);
    }
}
