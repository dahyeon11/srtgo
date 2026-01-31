package com.kakao.sdk.auth;

import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.util.AESCipher;
import com.kakao.sdk.common.util.Cipher;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.PersistentKVStore;
import com.kakao.sdk.common.util.SdkLog;
import com.kakao.sdk.common.util.SharedPrefsWrapper;
import f7.InterfaceC5519a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class TokenManager implements TokenManageable {
    public static final String atExpiresAtKey = "com.kakao.token.OAuthToken.ExpiresAt";
    public static final String atKey = "com.kakao.token.AccessToken";
    public static final String rtExpiresAtKey = "com.kakao.token.RefreshToken.ExpiresAt";
    public static final String rtKey = "com.kakao.token.RefreshToken";
    public static final String secureModeKey = "com.kakao.token.KakaoSecureMode";
    public static final String tokenKey = "com.kakao.sdk.oauth_token";
    public static final String versionKey = "com.kakao.sdk.version";
    private final PersistentKVStore appCache;
    private OAuthToken currentToken;
    private final Cipher encryptor;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0755i instance$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.auth.TokenManager$Companion$instance$2
        @Override // f7.InterfaceC5519a
        public final TokenManager invoke() {
            return new TokenManager(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    });

    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/TokenManager;"))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final TokenManager getInstance() {
            return (TokenManager) TokenManager.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    public TokenManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final TokenManager getInstance() {
        return Companion.getInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111 A[Catch: Exception -> 0x0126, TRY_LEAVE, TryCatch #2 {Exception -> 0x0126, blocks: (B:50:0x0106, B:53:0x0111), top: B:68:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void migrateFromOldVersion() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.auth.TokenManager.migrateFromOldVersion():void");
    }

    @Override // com.kakao.sdk.auth.TokenManageable
    public void clear() {
        this.currentToken = null;
        this.appCache.remove(tokenKey).commit();
    }

    public final PersistentKVStore getAppCache() {
        return this.appCache;
    }

    public final Cipher getEncryptor() {
        return this.encryptor;
    }

    @Override // com.kakao.sdk.auth.TokenManageable
    public OAuthToken getToken() {
        return this.currentToken;
    }

    @Override // com.kakao.sdk.auth.TokenManageable
    public synchronized void setToken(OAuthToken token) {
        Intrinsics.checkNotNullParameter(token, "token");
        OAuthToken oAuthToken = new OAuthToken(token.getAccessToken(), token.getAccessTokenExpiresAt(), token.getRefreshToken(), token.getRefreshTokenExpiresAt(), null, token.getScopes(), 16, null);
        try {
            this.appCache.putString(tokenKey, this.encryptor.encrypt(KakaoJson.INSTANCE.toJson(oAuthToken))).commit();
        } catch (Throwable th) {
            SdkLog.Companion.e(th);
        }
        this.currentToken = oAuthToken;
    }

    public TokenManager(PersistentKVStore appCache, Cipher encryptor) {
        Intrinsics.checkNotNullParameter(appCache, "appCache");
        Intrinsics.checkNotNullParameter(encryptor, "encryptor");
        this.appCache = appCache;
        this.encryptor = encryptor;
        OAuthToken oAuthToken = null;
        if (PersistentKVStore.DefaultImpls.getString$default(appCache, versionKey, null, 2, null) == null) {
            migrateFromOldVersion();
        }
        String string$default = PersistentKVStore.DefaultImpls.getString$default(appCache, tokenKey, null, 2, null);
        if (string$default != null) {
            try {
                oAuthToken = (OAuthToken) KakaoJson.INSTANCE.fromJson(getEncryptor().decrypt(string$default), OAuthToken.class);
            } catch (Throwable th) {
                SdkLog.Companion.e(th);
            }
        }
        this.currentToken = oAuthToken;
    }

    public /* synthetic */ TokenManager(PersistentKVStore persistentKVStore, Cipher cipher, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? new SharedPrefsWrapper(KakaoSdk.INSTANCE.getApplicationContextInfo().getSharedPreferences()) : persistentKVStore, (i8 & 2) != 0 ? new AESCipher(null, 1, null) : cipher);
    }
}
