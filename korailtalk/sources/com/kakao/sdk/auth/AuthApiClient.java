package com.kakao.sdk.auth;

import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import f7.InterfaceC5519a;
import f7.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class AuthApiClient {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0755i instance$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.auth.AuthApiClient$Companion$instance$2
        @Override // f7.InterfaceC5519a
        public final AuthApiClient invoke() {
            return new AuthApiClient(null, null, 3, null);
        }
    });
    private final AuthApiManager manager;
    private final TokenManagerProvider tokenManagerProvider;

    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/AuthApiClient;"))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final AuthApiClient getInstance() {
            return (AuthApiClient) AuthApiClient.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    public AuthApiClient() {
        this(null, null, 3, null);
    }

    public static final AuthApiClient getInstance() {
        return Companion.getInstance();
    }

    public static /* synthetic */ void issueAccessToken$default(AuthApiClient authApiClient, String str, String str2, p pVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        authApiClient.issueAccessToken(str, str2, pVar);
    }

    public static /* synthetic */ void issueAccessTokenWithCert$default(AuthApiClient authApiClient, String str, String str2, p pVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        authApiClient.issueAccessTokenWithCert(str, str2, pVar);
    }

    public static /* synthetic */ void refreshAccessToken$default(AuthApiClient authApiClient, OAuthToken oAuthToken, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0 && (oAuthToken = authApiClient.tokenManagerProvider.getManager().getToken()) == null) {
            throw new ClientError(ClientErrorCause.TokenNotFound, "Refresh token not found. You must login first.");
        }
        authApiClient.refreshAccessToken(oAuthToken, pVar);
    }

    public static /* synthetic */ void refreshToken$default(AuthApiClient authApiClient, OAuthToken oAuthToken, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0 && (oAuthToken = authApiClient.tokenManagerProvider.getManager().getToken()) == null) {
            throw new ClientError(ClientErrorCause.TokenNotFound, "Refresh token not found. You must login first.");
        }
        authApiClient.refreshToken(oAuthToken, pVar);
    }

    public final void agt(p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.manager.agt$auth_release(callback);
    }

    public final TokenManagerProvider getTokenManagerProvider() {
        return this.tokenManagerProvider;
    }

    public final boolean hasToken() {
        return this.manager.hasToken$auth_release();
    }

    public final void issueAccessToken(String code, String str, p callback) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.manager.issueAccessToken$auth_release(code, str, callback);
    }

    public final void issueAccessTokenWithCert(String code, String str, p callback) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.manager.issueAccessTokenWithCert$auth_release(code, str, callback);
    }

    public final void refreshAccessToken(p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        refreshAccessToken$default(this, null, callback, 1, null);
    }

    public final void refreshToken(p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        refreshToken$default(this, null, callback, 1, null);
    }

    public AuthApiClient(AuthApiManager manager, TokenManagerProvider tokenManagerProvider) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(tokenManagerProvider, "tokenManagerProvider");
        this.manager = manager;
        this.tokenManagerProvider = tokenManagerProvider;
    }

    public final void refreshAccessToken(OAuthToken oldToken, p callback) {
        Intrinsics.checkNotNullParameter(oldToken, "oldToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.manager.refreshToken$auth_release(oldToken, callback);
    }

    public final void refreshToken(OAuthToken oldToken, p callback) {
        Intrinsics.checkNotNullParameter(oldToken, "oldToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.manager.refreshToken$auth_release(oldToken, callback);
    }

    public /* synthetic */ AuthApiClient(AuthApiManager authApiManager, TokenManagerProvider tokenManagerProvider, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? AuthApiManager.Companion.getInstance() : authApiManager, (i8 & 2) != 0 ? TokenManagerProvider.Companion.getInstance() : tokenManagerProvider);
    }
}
