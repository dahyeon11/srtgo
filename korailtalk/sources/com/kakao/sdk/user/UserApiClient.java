package com.kakao.sdk.user;

import R6.AbstractC0756j;
import R6.G;
import R6.InterfaceC0755i;
import android.content.Context;
import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.AuthCodeClient;
import com.kakao.sdk.auth.TokenManagerProvider;
import com.kakao.sdk.auth.model.CertTokenInfo;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.auth.model.Prompt;
import com.kakao.sdk.auth.network.ApiFactoryKt;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.network.ApiCallback;
import com.kakao.sdk.network.ApiFactory;
import com.kakao.sdk.user.UserApi;
import com.kakao.sdk.user.model.AccessTokenInfo;
import com.kakao.sdk.user.model.ScopeInfo;
import com.kakao.sdk.user.model.User;
import com.kakao.sdk.user.model.UserServiceTerms;
import com.kakao.sdk.user.model.UserShippingAddresses;
import f7.InterfaceC5519a;
import f7.l;
import f7.p;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class UserApiClient {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0755i instance$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.user.UserApiClient$Companion$instance$2
        @Override // f7.InterfaceC5519a
        public final UserApiClient invoke() {
            return new UserApiClient(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    });
    private final TokenManagerProvider tokenManagerProvider;
    private final UserApi userApi;

    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/user/UserApiClient;"))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final UserApiClient getInstance() {
            return (UserApiClient) UserApiClient.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    public UserApiClient() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void certLoginWithKakaoAccount$default(UserApiClient userApiClient, Context context, List list, String str, String str2, List list2, List list3, String str3, p pVar, int i8, Object obj) throws NoSuchAlgorithmException {
        userApiClient.certLoginWithKakaoAccount(context, (i8 & 2) != 0 ? null : list, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : list2, (i8 & 32) != 0 ? null : list3, (i8 & 64) != 0 ? null : str3, pVar);
    }

    public static /* synthetic */ void certLoginWithKakaoTalk$default(UserApiClient userApiClient, Context context, List list, String str, int i8, String str2, List list2, List list3, p pVar, int i9, Object obj) throws NoSuchAlgorithmException {
        userApiClient.certLoginWithKakaoTalk(context, (i9 & 2) != 0 ? null : list, (i9 & 4) != 0 ? null : str, (i9 & 8) != 0 ? 10012 : i8, (i9 & 16) != 0 ? null : str2, (i9 & 32) != 0 ? null : list2, (i9 & 64) != 0 ? null : list3, pVar);
    }

    public static final UserApiClient getInstance() {
        return Companion.getInstance();
    }

    public static /* synthetic */ void loginWithKakaoAccount$default(UserApiClient userApiClient, Context context, List list, String str, String str2, List list2, List list3, p pVar, int i8, Object obj) throws NoSuchAlgorithmException {
        userApiClient.loginWithKakaoAccount(context, (i8 & 2) != 0 ? null : list, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : list2, (i8 & 32) != 0 ? null : list3, pVar);
    }

    public static /* synthetic */ void loginWithKakaoTalk$default(UserApiClient userApiClient, Context context, int i8, String str, List list, List list2, p pVar, int i9, Object obj) throws NoSuchAlgorithmException {
        if ((i9 & 2) != 0) {
            i8 = AuthCodeClient.DEFAULT_REQUEST_CODE;
        }
        userApiClient.loginWithKakaoTalk(context, i8, (i9 & 4) != 0 ? null : str, (i9 & 8) != 0 ? null : list, (i9 & 16) != 0 ? null : list2, pVar);
    }

    public static /* synthetic */ void loginWithNewScopes$default(UserApiClient userApiClient, Context context, List list, String str, p pVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str = null;
        }
        userApiClient.loginWithNewScopes(context, list, str, pVar);
    }

    private final List<Prompt> makeCertPrompts(List<? extends Prompt> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(Prompt.CERT);
        return arrayList;
    }

    public static /* synthetic */ void me$default(UserApiClient userApiClient, boolean z8, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        userApiClient.me(z8, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void scopes$default(UserApiClient userApiClient, List list, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = null;
        }
        userApiClient.scopes(list, pVar);
    }

    public static /* synthetic */ void serviceTerms$default(UserApiClient userApiClient, String str, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = null;
        }
        userApiClient.serviceTerms(str, pVar);
    }

    public static /* synthetic */ void shippingAddresses$default(UserApiClient userApiClient, Date date, Integer num, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            date = null;
        }
        if ((i8 & 2) != 0) {
            num = null;
        }
        userApiClient.shippingAddresses(date, num, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void signup$default(UserApiClient userApiClient, Map map, l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            map = null;
        }
        userApiClient.signup(map, lVar);
    }

    public final void accessTokenInfo(final p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.userApi.accessTokenInfo().enqueue(new ApiCallback<AccessTokenInfo>() { // from class: com.kakao.sdk.user.UserApiClient.accessTokenInfo.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(AccessTokenInfo accessTokenInfo, Throwable th) {
                callback.invoke(accessTokenInfo, th);
            }
        });
    }

    public final void certLoginWithKakaoAccount(Context context, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, null, null, null, null, null, null, callback, 126, null);
    }

    public final void certLoginWithKakaoTalk(Context context, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, null, null, 0, null, null, null, callback, 126, null);
    }

    public final boolean isKakaoTalkLoginAvailable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AuthCodeClient.Companion.getInstance().isKakaoTalkLoginAvailable(context);
    }

    public final void loginWithKakaoAccount(Context context, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loginWithKakaoAccount$default(this, context, null, null, null, null, null, callback, 62, null);
    }

    public final void loginWithKakaoTalk(Context context, int i8, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loginWithKakaoTalk$default(this, context, i8, null, null, null, callback, 28, null);
    }

    public final void loginWithNewScopes(final Context context, final List<String> scopes, final String str, final p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthApiClient.Companion.getInstance().agt(new p() { // from class: com.kakao.sdk.user.UserApiClient.loginWithNewScopes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // f7.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws NoSuchAlgorithmException {
                invoke((String) obj, (Throwable) obj2);
                return G.INSTANCE;
            }

            public final void invoke(String str2, Throwable th) throws NoSuchAlgorithmException {
                if (th != null) {
                    callback.invoke(null, th);
                    return;
                }
                AuthCodeClient.Companion companion = AuthCodeClient.Companion;
                final String strCodeVerifier = companion.codeVerifier();
                AuthCodeClient companion2 = companion.getInstance();
                Context context2 = context;
                List<String> list = scopes;
                String str3 = str;
                final p pVar = callback;
                AuthCodeClient.authorizeWithKakaoAccount$default(companion2, context2, null, null, list, str3, str2, null, null, false, null, null, strCodeVerifier, new p() { // from class: com.kakao.sdk.user.UserApiClient.loginWithNewScopes.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // f7.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((String) obj, (Throwable) obj2);
                        return G.INSTANCE;
                    }

                    public final void invoke(String str4, Throwable th2) {
                        if (th2 != null) {
                            pVar.invoke(null, th2);
                            return;
                        }
                        AuthApiClient companion3 = AuthApiClient.Companion.getInstance();
                        Intrinsics.checkNotNull(str4);
                        String str5 = strCodeVerifier;
                        final p pVar2 = pVar;
                        companion3.issueAccessToken(str4, str5, new p() { // from class: com.kakao.sdk.user.UserApiClient.loginWithNewScopes.1.1.1
                            {
                                super(2);
                            }

                            @Override // f7.p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((OAuthToken) obj, (Throwable) obj2);
                                return G.INSTANCE;
                            }

                            public final void invoke(OAuthToken oAuthToken, Throwable th3) {
                                pVar2.invoke(oAuthToken, th3);
                            }
                        });
                    }
                }, 1990, null);
            }
        });
    }

    public final void logout(final l callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.userApi.logout().enqueue(new ApiCallback<G>() { // from class: com.kakao.sdk.user.UserApiClient.logout.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(G g8, Throwable th) {
                UserApiClient.this.tokenManagerProvider.getManager().clear();
                callback.invoke(th);
            }
        });
    }

    public final void me(p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        me$default(this, false, callback, 1, null);
    }

    public final void revokeScopes(List<String> scopes, final p callback) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.userApi.revokeScopes(KakaoJson.INSTANCE.toJson(scopes)).enqueue(new ApiCallback<ScopeInfo>() { // from class: com.kakao.sdk.user.UserApiClient.revokeScopes.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(ScopeInfo scopeInfo, Throwable th) {
                callback.invoke(scopeInfo, th);
            }
        });
    }

    public final void scopes(List<String> list, final p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.userApi.scopes(list == null ? null : KakaoJson.INSTANCE.toJson(list)).enqueue(new ApiCallback<ScopeInfo>() { // from class: com.kakao.sdk.user.UserApiClient.scopes.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(ScopeInfo scopeInfo, Throwable th) {
                callback.invoke(scopeInfo, th);
            }
        });
    }

    public final void serviceTerms(String str, final p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.userApi.serviceTerms(str).enqueue(new ApiCallback<UserServiceTerms>() { // from class: com.kakao.sdk.user.UserApiClient.serviceTerms.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(UserServiceTerms userServiceTerms, Throwable th) {
                callback.invoke(userServiceTerms, th);
            }
        });
    }

    public final void shippingAddresses(p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        shippingAddresses$default(this, null, null, callback, 3, null);
    }

    public final void signup(Map<String, String> map, final l callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.userApi.signup(map).enqueue(new ApiCallback<G>() { // from class: com.kakao.sdk.user.UserApiClient.signup.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(G g8, Throwable th) {
                callback.invoke(th);
            }
        });
    }

    public final void unlink(final l callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.userApi.unlink().enqueue(new ApiCallback<G>() { // from class: com.kakao.sdk.user.UserApiClient.unlink.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(G g8, Throwable th) {
                if (th == null) {
                    UserApiClient.this.tokenManagerProvider.getManager().clear();
                }
                callback.invoke(th);
            }
        });
    }

    public final void updateProfile(Map<String, String> properties, final l callback) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.userApi.updateProfile(properties).enqueue(new ApiCallback<G>() { // from class: com.kakao.sdk.user.UserApiClient.updateProfile.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(G g8, Throwable th) {
                callback.invoke(th);
            }
        });
    }

    public UserApiClient(UserApi userApi, TokenManagerProvider tokenManagerProvider) {
        Intrinsics.checkNotNullParameter(userApi, "userApi");
        Intrinsics.checkNotNullParameter(tokenManagerProvider, "tokenManagerProvider");
        this.userApi = userApi;
        this.tokenManagerProvider = tokenManagerProvider;
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, list, null, null, null, null, null, callback, 124, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, list, null, 0, null, null, null, callback, 124, null);
    }

    public final void loginWithKakaoAccount(Context context, List<? extends Prompt> list, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loginWithKakaoAccount$default(this, context, list, null, null, null, null, callback, 60, null);
    }

    public final void loginWithKakaoTalk(Context context, int i8, String str, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loginWithKakaoTalk$default(this, context, i8, str, null, null, callback, 24, null);
    }

    public final void me(boolean z8, final p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        UserApi.DefaultImpls.me$default(this.userApi, z8, null, 2, null).enqueue(new ApiCallback<User>() { // from class: com.kakao.sdk.user.UserApiClient.me.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(User user, Throwable th) {
                callback.invoke(user, th);
            }
        });
    }

    public final void shippingAddresses(Date date, p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        shippingAddresses$default(this, date, null, callback, 2, null);
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, list, str, null, null, null, null, callback, 120, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i8, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, list, str, i8, null, null, null, callback, 112, null);
    }

    public final void loginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loginWithKakaoAccount$default(this, context, list, str, null, null, null, callback, 56, null);
    }

    public final void loginWithKakaoTalk(Context context, int i8, String str, List<String> list, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loginWithKakaoTalk$default(this, context, i8, str, list, null, callback, 16, null);
    }

    public final void shippingAddresses(Date date, Integer num, final p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        UserApi.DefaultImpls.shippingAddresses$default(this.userApi, null, date, num, 1, null).enqueue(new ApiCallback<UserShippingAddresses>() { // from class: com.kakao.sdk.user.UserApiClient.shippingAddresses.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(UserShippingAddresses userShippingAddresses, Throwable th) {
                callback.invoke(userShippingAddresses, th);
            }
        });
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, list, str, str2, null, null, null, callback, 112, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i8, String str2, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, list, str, i8, str2, null, null, callback, 96, null);
    }

    public final void loginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loginWithKakaoAccount$default(this, context, list, str, str2, null, null, callback, 48, null);
    }

    public final void loginWithKakaoTalk(Context context, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loginWithKakaoTalk$default(this, context, 0, null, null, null, callback, 30, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UserApiClient(UserApi userApi, TokenManagerProvider tokenManagerProvider, int i8, DefaultConstructorMarker defaultConstructorMarker) throws SecurityException {
        if ((i8 & 1) != 0) {
            Object objCreate = ApiFactoryKt.getKapiWithOAuth(ApiFactory.INSTANCE).create(UserApi.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "ApiFactory.kapiWithOAuth.create(UserApi::class.java)");
            userApi = (UserApi) objCreate;
        }
        this(userApi, (i8 & 2) != 0 ? TokenManagerProvider.Companion.getInstance() : tokenManagerProvider);
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, List<String> list2, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, list, str, str2, list2, null, null, callback, 96, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i8, String str2, List<String> list2, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, list, str, i8, str2, list2, null, callback, 64, null);
    }

    public final void loginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, List<String> list2, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loginWithKakaoAccount$default(this, context, list, str, str2, list2, null, callback, 32, null);
    }

    public final void loginWithKakaoTalk(Context context, int i8, String str, List<String> list, List<String> list2, final p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthCodeClient.Companion companion = AuthCodeClient.Companion;
        final String strCodeVerifier = companion.codeVerifier();
        companion.getInstance().authorizeWithKakaoTalk(context, null, null, i8, str, list, list2, strCodeVerifier, new p() { // from class: com.kakao.sdk.user.UserApiClient.loginWithKakaoTalk.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // f7.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, (Throwable) obj2);
                return G.INSTANCE;
            }

            public final void invoke(String str2, Throwable th) {
                if (th != null) {
                    callback.invoke(null, th);
                    return;
                }
                AuthApiClient companion2 = AuthApiClient.Companion.getInstance();
                Intrinsics.checkNotNull(str2);
                String str3 = strCodeVerifier;
                final p pVar = callback;
                companion2.issueAccessToken(str2, str3, new p() { // from class: com.kakao.sdk.user.UserApiClient.loginWithKakaoTalk.1.1
                    {
                        super(2);
                    }

                    @Override // f7.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((OAuthToken) obj, (Throwable) obj2);
                        return G.INSTANCE;
                    }

                    public final void invoke(OAuthToken oAuthToken, Throwable th2) {
                        pVar.invoke(oAuthToken, th2);
                    }
                });
            }
        });
    }

    public final void shippingAddresses(long j8, final p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        UserApi.DefaultImpls.shippingAddresses$default(this.userApi, Long.valueOf(j8), null, null, 6, null).enqueue(new ApiCallback<UserShippingAddresses>() { // from class: com.kakao.sdk.user.UserApiClient.shippingAddresses.2
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(UserShippingAddresses userShippingAddresses, Throwable th) {
                callback.invoke(userShippingAddresses, th);
            }
        });
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, List<String> list2, List<String> list3, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, list, str, str2, list2, list3, null, callback, 64, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, String str, p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, list, str, 0, null, null, null, callback, 120, null);
    }

    public final void loginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, List<String> list2, List<String> list3, final p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthCodeClient.Companion companion = AuthCodeClient.Companion;
        final String strCodeVerifier = companion.codeVerifier();
        AuthCodeClient.authorizeWithKakaoAccount$default(companion.getInstance(), context, list, null, null, str2, null, list2, list3, false, str, null, strCodeVerifier, new p() { // from class: com.kakao.sdk.user.UserApiClient.loginWithKakaoAccount.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // f7.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, (Throwable) obj2);
                return G.INSTANCE;
            }

            public final void invoke(String str3, Throwable th) {
                if (th != null) {
                    callback.invoke(null, th);
                    return;
                }
                AuthApiClient companion2 = AuthApiClient.Companion.getInstance();
                Intrinsics.checkNotNull(str3);
                String str4 = strCodeVerifier;
                final p pVar = callback;
                companion2.issueAccessToken(str3, str4, new p() { // from class: com.kakao.sdk.user.UserApiClient.loginWithKakaoAccount.1.1
                    {
                        super(2);
                    }

                    @Override // f7.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((OAuthToken) obj, (Throwable) obj2);
                        return G.INSTANCE;
                    }

                    public final void invoke(OAuthToken oAuthToken, Throwable th2) {
                        pVar.invoke(oAuthToken, th2);
                    }
                });
            }
        }, 1324, null);
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, List<String> list2, List<String> list3, String str3, final p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthCodeClient.Companion companion = AuthCodeClient.Companion;
        final String strCodeVerifier = companion.codeVerifier();
        AuthCodeClient.authorizeWithKakaoAccount$default(companion.getInstance(), context, makeCertPrompts(list), str, null, str2, null, list2, list3, false, str3, null, strCodeVerifier, new p() { // from class: com.kakao.sdk.user.UserApiClient.certLoginWithKakaoAccount.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // f7.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, (Throwable) obj2);
                return G.INSTANCE;
            }

            public final void invoke(String str4, Throwable th) {
                if (th != null) {
                    callback.invoke(null, th);
                    return;
                }
                AuthApiClient companion2 = AuthApiClient.Companion.getInstance();
                Intrinsics.checkNotNull(str4);
                String str5 = strCodeVerifier;
                final p pVar = callback;
                companion2.issueAccessTokenWithCert(str4, str5, new p() { // from class: com.kakao.sdk.user.UserApiClient.certLoginWithKakaoAccount.1.1
                    {
                        super(2);
                    }

                    @Override // f7.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((CertTokenInfo) obj, (Throwable) obj2);
                        return G.INSTANCE;
                    }

                    public final void invoke(CertTokenInfo certTokenInfo, Throwable th2) {
                        pVar.invoke(certTokenInfo, th2);
                    }
                });
            }
        }, 1320, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i8, String str2, List<String> list2, List<String> list3, final p callback) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthCodeClient.Companion companion = AuthCodeClient.Companion;
        final String strCodeVerifier = companion.codeVerifier();
        companion.getInstance().authorizeWithKakaoTalk(context, makeCertPrompts(list), str, i8, str2, list2, list3, strCodeVerifier, new p() { // from class: com.kakao.sdk.user.UserApiClient.certLoginWithKakaoTalk.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // f7.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, (Throwable) obj2);
                return G.INSTANCE;
            }

            public final void invoke(String str3, Throwable th) {
                if (th != null) {
                    callback.invoke(null, th);
                    return;
                }
                AuthApiClient companion2 = AuthApiClient.Companion.getInstance();
                Intrinsics.checkNotNull(str3);
                String str4 = strCodeVerifier;
                final p pVar = callback;
                companion2.issueAccessTokenWithCert(str3, str4, new p() { // from class: com.kakao.sdk.user.UserApiClient.certLoginWithKakaoTalk.1.1
                    {
                        super(2);
                    }

                    @Override // f7.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((CertTokenInfo) obj, (Throwable) obj2);
                        return G.INSTANCE;
                    }

                    public final void invoke(CertTokenInfo certTokenInfo, Throwable th2) {
                        pVar.invoke(certTokenInfo, th2);
                    }
                });
            }
        });
    }
}
