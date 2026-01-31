package com.kakao.sdk.auth;

import C7.K;
import R6.AbstractC0756j;
import R6.G;
import R6.InterfaceC0755i;
import R6.q;
import R6.r;
import com.kakao.sdk.auth.AuthApi;
import com.kakao.sdk.auth.model.AccessTokenResponse;
import com.kakao.sdk.auth.model.AgtResponse;
import com.kakao.sdk.auth.model.CertTokenInfo;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.auth.network.ApiFactoryKt;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApplicationInfo;
import com.kakao.sdk.common.model.ApprovalType;
import com.kakao.sdk.common.model.AuthError;
import com.kakao.sdk.common.model.AuthErrorCause;
import com.kakao.sdk.common.model.AuthErrorResponse;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.ContextInfo;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.network.ApiFactory;
import f7.InterfaceC5519a;
import f7.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import retrofit2.InterfaceC6201b;
import retrofit2.d;
import retrofit2.h;
import retrofit2.w;

/* loaded from: classes.dex */
public final class AuthApiManager {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0755i instance$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.auth.AuthApiManager$Companion$instance$2
        @Override // f7.InterfaceC5519a
        public final AuthApiManager invoke() {
            return new AuthApiManager(null, null, null, null, null, 31, null);
        }
    });
    private final ApplicationInfo applicationInfo;
    private final ApprovalType approvalType;
    private final AuthApi authApi;
    private final ContextInfo contextInfo;
    private final TokenManagerProvider tokenManagerProvider;

    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/AuthApiManager;"))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final AuthApiManager getInstance() {
            return (AuthApiManager) AuthApiManager.instance$delegate.getValue();
        }

        public final Throwable translateError(Throwable t8) {
            K kErrorBody;
            Object objM67constructorimpl;
            Intrinsics.checkNotNullParameter(t8, "t");
            try {
                if (!(t8 instanceof h)) {
                    return t8;
                }
                w<?> wVarResponse = ((h) t8).response();
                String strString = null;
                if (wVarResponse != null && (kErrorBody = wVarResponse.errorBody()) != null) {
                    strString = kErrorBody.string();
                }
                KakaoJson kakaoJson = KakaoJson.INSTANCE;
                Intrinsics.checkNotNull(strString);
                AuthErrorResponse authErrorResponse = (AuthErrorResponse) kakaoJson.fromJson(strString, AuthErrorResponse.class);
                try {
                    q.a aVar = q.Companion;
                    objM67constructorimpl = q.m67constructorimpl((AuthErrorCause) kakaoJson.fromJson(authErrorResponse.getError(), AuthErrorCause.class));
                } catch (Throwable th) {
                    q.a aVar2 = q.Companion;
                    objM67constructorimpl = q.m67constructorimpl(r.createFailure(th));
                }
                AuthErrorCause authErrorCause = AuthErrorCause.Unknown;
                if (q.m72isFailureimpl(objM67constructorimpl)) {
                    objM67constructorimpl = authErrorCause;
                }
                return new AuthError(((h) t8).code(), (AuthErrorCause) objM67constructorimpl, authErrorResponse);
            } catch (Throwable th2) {
                return th2;
            }
        }

        private Companion() {
        }
    }

    public AuthApiManager() {
        this(null, null, null, null, null, 31, null);
    }

    public static final AuthApiManager getInstance() {
        return Companion.getInstance();
    }

    public static /* synthetic */ void issueAccessToken$auth_release$default(AuthApiManager authApiManager, String str, String str2, p pVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        authApiManager.issueAccessToken$auth_release(str, str2, pVar);
    }

    public static /* synthetic */ void issueAccessTokenWithCert$auth_release$default(AuthApiManager authApiManager, String str, String str2, p pVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        authApiManager.issueAccessTokenWithCert$auth_release(str, str2, pVar);
    }

    public static /* synthetic */ void refreshToken$auth_release$default(AuthApiManager authApiManager, OAuthToken oAuthToken, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0 && (oAuthToken = authApiManager.tokenManagerProvider.getManager().getToken()) == null) {
            throw new ClientError(ClientErrorCause.TokenNotFound, "Refresh token not found. You must login first.");
        }
        authApiManager.refreshToken$auth_release(oAuthToken, pVar);
    }

    public final void agt$auth_release(final p callback) {
        String accessToken;
        G g8;
        Intrinsics.checkNotNullParameter(callback, "callback");
        OAuthToken token = this.tokenManagerProvider.getManager().getToken();
        if (token == null || (accessToken = token.getAccessToken()) == null) {
            g8 = null;
        } else {
            this.authApi.agt(getApplicationInfo().getAppKey(), accessToken).enqueue(new d() { // from class: com.kakao.sdk.auth.AuthApiManager$agt$1$1
                @Override // retrofit2.d
                public void onFailure(InterfaceC6201b<AgtResponse> call, Throwable t8) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t8, "t");
                    callback.invoke(null, t8);
                }

                @Override // retrofit2.d
                public void onResponse(InterfaceC6201b<AgtResponse> call, w<AgtResponse> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    AgtResponse agtResponseBody = response.body();
                    if (agtResponseBody == null) {
                        callback.invoke(null, AuthApiManager.Companion.translateError(new h(response)));
                    } else {
                        callback.invoke(agtResponseBody.getAgt(), null);
                    }
                }
            });
            g8 = G.INSTANCE;
        }
        if (g8 == null) {
            callback.invoke(null, new ClientError(ClientErrorCause.TokenNotFound, "Access token not found. You must login first."));
        }
    }

    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public final ApprovalType getApprovalType() {
        return this.approvalType;
    }

    public final ContextInfo getContextInfo() {
        return this.contextInfo;
    }

    public final TokenManagerProvider getTokenManagerProvider() {
        return this.tokenManagerProvider;
    }

    public final boolean hasToken$auth_release() {
        return this.tokenManagerProvider.getManager().getToken() != null;
    }

    public final void issueAccessToken$auth_release(String code, String str, final p callback) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthApi.DefaultImpls.issueAccessToken$default(this.authApi, this.applicationInfo.getAppKey(), this.contextInfo.getSigningKeyHash(), code, this.applicationInfo.getRedirectUri(), str, this.approvalType.getValue(), null, 64, null).enqueue(new d() { // from class: com.kakao.sdk.auth.AuthApiManager$issueAccessToken$1
            @Override // retrofit2.d
            public void onFailure(InterfaceC6201b<AccessTokenResponse> call, Throwable t8) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t8, "t");
                callback.invoke(null, t8);
            }

            @Override // retrofit2.d
            public void onResponse(InterfaceC6201b<AccessTokenResponse> call, w<AccessTokenResponse> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    callback.invoke(null, AuthApiManager.Companion.translateError(new h(response)));
                    return;
                }
                AccessTokenResponse accessTokenResponseBody = response.body();
                if (accessTokenResponseBody == null) {
                    callback.invoke(null, new ClientError(ClientErrorCause.Unknown, "No body"));
                    return;
                }
                AuthApiManager authApiManager = this;
                p pVar = callback;
                OAuthToken oAuthTokenFromResponse$default = OAuthToken.Companion.fromResponse$default(OAuthToken.Companion, accessTokenResponseBody, null, 2, null);
                authApiManager.getTokenManagerProvider().getManager().setToken(oAuthTokenFromResponse$default);
                pVar.invoke(oAuthTokenFromResponse$default, null);
            }
        });
    }

    public final void issueAccessTokenWithCert$auth_release(String code, String str, final p callback) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthApi.DefaultImpls.issueAccessToken$default(this.authApi, this.applicationInfo.getAppKey(), this.contextInfo.getSigningKeyHash(), code, this.applicationInfo.getRedirectUri(), str, this.approvalType.getValue(), null, 64, null).enqueue(new d() { // from class: com.kakao.sdk.auth.AuthApiManager$issueAccessTokenWithCert$1
            @Override // retrofit2.d
            public void onFailure(InterfaceC6201b<AccessTokenResponse> call, Throwable t8) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t8, "t");
                callback.invoke(null, t8);
            }

            @Override // retrofit2.d
            public void onResponse(InterfaceC6201b<AccessTokenResponse> call, w<AccessTokenResponse> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    callback.invoke(null, AuthApiManager.Companion.translateError(new h(response)));
                    return;
                }
                AccessTokenResponse accessTokenResponseBody = response.body();
                if (accessTokenResponseBody == null) {
                    callback.invoke(null, new ClientError(ClientErrorCause.Unknown, "No body"));
                    return;
                }
                p pVar = callback;
                AuthApiManager authApiManager = this;
                OAuthToken oAuthTokenFromResponse$default = OAuthToken.Companion.fromResponse$default(OAuthToken.Companion, accessTokenResponseBody, null, 2, null);
                String txId = accessTokenResponseBody.getTxId();
                if (txId == null) {
                    pVar.invoke(null, new ClientError(ClientErrorCause.Unknown, "txId is null"));
                } else {
                    authApiManager.getTokenManagerProvider().getManager().setToken(oAuthTokenFromResponse$default);
                    pVar.invoke(new CertTokenInfo(oAuthTokenFromResponse$default, txId), null);
                }
            }
        });
    }

    public final void refreshToken$auth_release(p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        refreshToken$auth_release$default(this, null, callback, 1, null);
    }

    public AuthApiManager(AuthApi authApi, TokenManagerProvider tokenManagerProvider, ApplicationInfo applicationInfo, ContextInfo contextInfo, ApprovalType approvalType) {
        Intrinsics.checkNotNullParameter(authApi, "authApi");
        Intrinsics.checkNotNullParameter(tokenManagerProvider, "tokenManagerProvider");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(contextInfo, "contextInfo");
        Intrinsics.checkNotNullParameter(approvalType, "approvalType");
        this.authApi = authApi;
        this.tokenManagerProvider = tokenManagerProvider;
        this.applicationInfo = applicationInfo;
        this.contextInfo = contextInfo;
        this.approvalType = approvalType;
    }

    public final void refreshToken$auth_release(final OAuthToken oldToken, final p callback) {
        Intrinsics.checkNotNullParameter(oldToken, "oldToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthApi.DefaultImpls.refreshToken$default(this.authApi, this.applicationInfo.getAppKey(), this.contextInfo.getSigningKeyHash(), oldToken.getRefreshToken(), this.approvalType.getValue(), null, 16, null).enqueue(new d() { // from class: com.kakao.sdk.auth.AuthApiManager$refreshToken$1
            @Override // retrofit2.d
            public void onFailure(InterfaceC6201b<AccessTokenResponse> call, Throwable t8) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t8, "t");
                callback.invoke(null, t8);
            }

            @Override // retrofit2.d
            public void onResponse(InterfaceC6201b<AccessTokenResponse> call, w<AccessTokenResponse> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    callback.invoke(null, AuthApiManager.Companion.translateError(new h(response)));
                    return;
                }
                AccessTokenResponse accessTokenResponseBody = response.body();
                if (accessTokenResponseBody == null) {
                    callback.invoke(null, new ClientError(ClientErrorCause.Unknown, "No body"));
                    return;
                }
                OAuthToken oAuthToken = oldToken;
                AuthApiManager authApiManager = this;
                p pVar = callback;
                OAuthToken oAuthTokenFromResponse = OAuthToken.Companion.fromResponse(accessTokenResponseBody, oAuthToken);
                authApiManager.getTokenManagerProvider().getManager().setToken(oAuthTokenFromResponse);
                pVar.invoke(oAuthTokenFromResponse, null);
            }
        });
    }

    public static /* synthetic */ OAuthToken refreshToken$auth_release$default(AuthApiManager authApiManager, OAuthToken oAuthToken, int i8, Object obj) {
        if ((i8 & 1) != 0 && (oAuthToken = authApiManager.tokenManagerProvider.getManager().getToken()) == null) {
            throw new ClientError(ClientErrorCause.TokenNotFound, "Refresh token not found. You must login first.");
        }
        return authApiManager.refreshToken$auth_release(oAuthToken);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AuthApiManager(AuthApi authApi, TokenManagerProvider tokenManagerProvider, ApplicationInfo applicationInfo, ContextInfo contextInfo, ApprovalType approvalType, int i8, DefaultConstructorMarker defaultConstructorMarker) throws SecurityException {
        if ((i8 & 1) != 0) {
            Object objCreate = ApiFactoryKt.getKauth(ApiFactory.INSTANCE).create(AuthApi.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "ApiFactory.kauth.create(AuthApi::class.java)");
            authApi = (AuthApi) objCreate;
        }
        this(authApi, (i8 & 2) != 0 ? TokenManagerProvider.Companion.getInstance() : tokenManagerProvider, (i8 & 4) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : applicationInfo, (i8 & 8) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : contextInfo, (i8 & 16) != 0 ? KakaoSdk.INSTANCE.getApprovalType() : approvalType);
    }

    public final OAuthToken refreshToken$auth_release(OAuthToken oldToken) throws Throwable {
        Intrinsics.checkNotNullParameter(oldToken, "oldToken");
        w wVarExecute = AuthApi.DefaultImpls.refreshToken$default(this.authApi, this.applicationInfo.getAppKey(), this.contextInfo.getSigningKeyHash(), oldToken.getRefreshToken(), this.approvalType.getValue(), null, 16, null).execute();
        AccessTokenResponse accessTokenResponse = (AccessTokenResponse) wVarExecute.body();
        OAuthToken oAuthTokenFromResponse = accessTokenResponse == null ? null : OAuthToken.Companion.fromResponse(accessTokenResponse, oldToken);
        if (oAuthTokenFromResponse != null) {
            this.tokenManagerProvider.getManager().setToken(oAuthTokenFromResponse);
            return oAuthTokenFromResponse;
        }
        throw Companion.translateError(new h(wVarExecute));
    }
}
