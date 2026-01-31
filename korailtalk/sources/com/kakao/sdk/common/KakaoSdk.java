package com.kakao.sdk.common;

import android.content.Context;
import com.kakao.sdk.common.model.ApplicationContextInfo;
import com.kakao.sdk.common.model.ApprovalType;
import com.kakao.sdk.common.model.ServerHosts;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class KakaoSdk {
    public static final KakaoSdk INSTANCE = new KakaoSdk();
    public static ApplicationContextInfo applicationContextInfo;
    public static ApprovalType approvalType;
    public static ServerHosts hosts;
    private static boolean loggingEnabled;
    public static Type type;

    public enum Type {
        KOTLIN,
        RX_KOTLIN
    }

    private KakaoSdk() {
    }

    public static final void init(Context context, String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        init$default(context, appKey, null, null, null, null, 60, null);
    }

    public static /* synthetic */ void init$default(Context context, String str, String str2, Boolean bool, ServerHosts serverHosts, ApprovalType approvalType2, int i8, Object obj) {
        init(context, str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : bool, (i8 & 16) != 0 ? null : serverHosts, (i8 & 32) != 0 ? null : approvalType2);
    }

    public final String getAppKey() {
        return getApplicationContextInfo().getAppKey();
    }

    public final ApplicationContextInfo getApplicationContextInfo() {
        ApplicationContextInfo applicationContextInfo2 = applicationContextInfo;
        if (applicationContextInfo2 != null) {
            return applicationContextInfo2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContextInfo");
        throw null;
    }

    public final ApprovalType getApprovalType() {
        ApprovalType approvalType2 = approvalType;
        if (approvalType2 != null) {
            return approvalType2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("approvalType");
        throw null;
    }

    public final ServerHosts getHosts() {
        ServerHosts serverHosts = hosts;
        if (serverHosts != null) {
            return serverHosts;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hosts");
        throw null;
    }

    public final String getKaHeader() {
        return getApplicationContextInfo().getKaHeader();
    }

    public final String getKeyHash() {
        return getApplicationContextInfo().getSigningKeyHash();
    }

    public final boolean getLoggingEnabled() {
        return loggingEnabled;
    }

    public final String getRedirectUri() {
        return getApplicationContextInfo().getRedirectUri();
    }

    public final Type getType() {
        Type type2 = type;
        if (type2 != null) {
            return type2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        throw null;
    }

    public final void setApplicationContextInfo(ApplicationContextInfo applicationContextInfo2) {
        Intrinsics.checkNotNullParameter(applicationContextInfo2, "<set-?>");
        applicationContextInfo = applicationContextInfo2;
    }

    public final void setApprovalType(ApprovalType approvalType2) {
        Intrinsics.checkNotNullParameter(approvalType2, "<set-?>");
        approvalType = approvalType2;
    }

    public final void setHosts(ServerHosts serverHosts) {
        Intrinsics.checkNotNullParameter(serverHosts, "<set-?>");
        hosts = serverHosts;
    }

    public final void setLoggingEnabled(boolean z8) {
        loggingEnabled = z8;
    }

    public final void setType(Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<set-?>");
        type = type2;
    }

    public static final void init(Context context, String appKey, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        init$default(context, appKey, str, null, null, null, 56, null);
    }

    public static final void init(Context context, String appKey, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        init$default(context, appKey, str, bool, null, null, 48, null);
    }

    public static final void init(Context context, String appKey, String str, Boolean bool, ServerHosts serverHosts) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        init$default(context, appKey, str, bool, serverHosts, null, 32, null);
    }

    public static final void init(Context context, String appKey, String str, Boolean bool, ServerHosts serverHosts, ApprovalType approvalType2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        KakaoSdk kakaoSdk = INSTANCE;
        if (str == null) {
            str = Intrinsics.stringPlus("kakao", appKey);
        }
        String str2 = str;
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        if (serverHosts == null) {
            serverHosts = new ServerHosts();
        }
        ServerHosts serverHosts2 = serverHosts;
        if (approvalType2 == null) {
            approvalType2 = new ApprovalType();
        }
        kakaoSdk.init(context, appKey, str2, zBooleanValue, serverHosts2, approvalType2, Type.KOTLIN);
    }

    public final void init(Context context, String appKey, String customScheme, boolean z8, ServerHosts hosts2, ApprovalType approvalType2, Type type2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(customScheme, "customScheme");
        Intrinsics.checkNotNullParameter(hosts2, "hosts");
        Intrinsics.checkNotNullParameter(approvalType2, "approvalType");
        Intrinsics.checkNotNullParameter(type2, "type");
        setHosts(hosts2);
        loggingEnabled = z8;
        setType(type2);
        setApprovalType(approvalType2);
        setApplicationContextInfo(new ApplicationContextInfo(context, appKey, customScheme, type2));
    }
}
