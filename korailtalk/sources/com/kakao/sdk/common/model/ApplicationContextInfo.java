package com.kakao.sdk.common.model;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.l;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.util.Utility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ApplicationContextInfo implements ApplicationInfo, ContextInfo {
    private final String mAppVer;
    private final Context mApplicationContext;
    private final String mClientId;
    private final String mCustomScheme;
    private final l mExtras;
    private final String mKaHeader;
    private final String mKeyHash;
    private final byte[] mSalt;
    private final SharedPreferences mSharedPreferences;

    public ApplicationContextInfo(Context context, String appKey, String customScheme, KakaoSdk.Type sdkType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(customScheme, "customScheme");
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        this.mClientId = appKey;
        this.mCustomScheme = customScheme;
        Utility utility = Utility.INSTANCE;
        this.mKaHeader = utility.getKAHeader(context, sdkType);
        this.mKeyHash = utility.getKeyHash(context);
        this.mExtras = utility.getExtras(context, sdkType);
        SharedPreferences sharedPreferences = context.getSharedPreferences(appKey, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(appKey, Context.MODE_PRIVATE)");
        this.mSharedPreferences = sharedPreferences;
        String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        Intrinsics.checkNotNullExpressionValue(str, "context.packageManager.getPackageInfo(context.packageName, 0).versionName");
        this.mAppVer = str;
        this.mSalt = utility.androidId(context);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.mApplicationContext = applicationContext;
    }

    @Override // com.kakao.sdk.common.model.ApplicationInfo
    public String getAppKey() {
        return this.mClientId;
    }

    @Override // com.kakao.sdk.common.model.ContextInfo
    public String getAppVer() {
        return this.mAppVer;
    }

    public final Context getApplicationContext() {
        return this.mApplicationContext;
    }

    @Override // com.kakao.sdk.common.model.ApplicationInfo
    public String getCustomScheme() {
        return this.mCustomScheme;
    }

    @Override // com.kakao.sdk.common.model.ContextInfo
    public l getExtras() {
        return this.mExtras;
    }

    @Override // com.kakao.sdk.common.model.ContextInfo
    public String getKaHeader() {
        return this.mKaHeader;
    }

    @Override // com.kakao.sdk.common.model.ApplicationInfo
    public String getRedirectUri() {
        return Intrinsics.stringPlus(this.mCustomScheme, "://oauth");
    }

    @Override // com.kakao.sdk.common.model.ContextInfo
    public byte[] getSalt() {
        return this.mSalt;
    }

    public final SharedPreferences getSharedPreferences() {
        return this.mSharedPreferences;
    }

    @Override // com.kakao.sdk.common.model.ContextInfo
    public String getSigningKeyHash() {
        return this.mKeyHash;
    }
}
