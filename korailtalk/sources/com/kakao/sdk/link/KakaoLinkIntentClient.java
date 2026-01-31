package com.kakao.sdk.link;

import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.gson.i;
import com.google.gson.l;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApplicationInfo;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.ContextInfo;
import com.kakao.sdk.common.util.IntentResolveClient;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.SdkLog;
import com.kakao.sdk.link.model.KakaoLinkAttachment;
import com.kakao.sdk.link.model.LinkResult;
import com.kakao.sdk.link.model.ValidationResult;
import f7.InterfaceC5519a;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class KakaoLinkIntentClient {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0755i instance$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.link.KakaoLinkIntentClient$Companion$instance$2
        @Override // f7.InterfaceC5519a
        public final KakaoLinkIntentClient invoke() {
            return new KakaoLinkIntentClient(null, null, null, 7, null);
        }
    });
    private final ApplicationInfo applicationInfo;
    private final ContextInfo contextInfo;
    private final IntentResolveClient intentResolveClient;

    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/link/KakaoLinkIntentClient;"))};

        private Companion() {
        }

        public final KakaoLinkIntentClient getInstance() {
            InterfaceC0755i interfaceC0755i = KakaoLinkIntentClient.instance$delegate;
            KProperty kProperty = $$delegatedProperties[0];
            return (KakaoLinkIntentClient) interfaceC0755i.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KakaoLinkIntentClient() {
        this(null, null, null, 7, null);
    }

    private final int attachmentSize(String str, ValidationResult validationResult, Map<String, String> map) {
        i iVar = validationResult.getTemplateMsg().get("P");
        Intrinsics.checkExpressionValueIsNotNull(iVar, "response.templateMsg[\"P\"]");
        l asJsonObject = iVar.getAsJsonObject();
        i iVar2 = validationResult.getTemplateMsg().get("C");
        Intrinsics.checkExpressionValueIsNotNull(iVar2, "response.templateMsg[\"C\"]");
        return KakaoJson.INSTANCE.toJson(new KakaoLinkAttachment(null, null, str, asJsonObject, iVar2.getAsJsonObject(), validationResult.getTemplateId(), validationResult.getTemplateArgs(), extrasWithServerCallbacks(this.contextInfo.getExtras(), map), 3, null)).length();
    }

    private final l extrasWithServerCallbacks(l lVar, Map<String, String> map) {
        l clone = lVar.deepCopy();
        if (map == null) {
            Intrinsics.checkExpressionValueIsNotNull(clone, "clone");
            return clone;
        }
        clone.addProperty(Constants.LCBA, KakaoJson.INSTANCE.toJson(map));
        Intrinsics.checkExpressionValueIsNotNull(clone, "clone");
        return clone;
    }

    public static /* synthetic */ LinkResult linkResultFromResponse$default(KakaoLinkIntentClient kakaoLinkIntentClient, Context context, ValidationResult validationResult, Map map, String str, String str2, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            str = kakaoLinkIntentClient.applicationInfo.getAppKey();
        }
        String str3 = str;
        if ((i8 & 16) != 0) {
            str2 = kakaoLinkIntentClient.contextInfo.getAppVer();
        }
        return kakaoLinkIntentClient.linkResultFromResponse(context, validationResult, map, str3, str2);
    }

    private final Uri.Builder linkUriBuilder() {
        return new Uri.Builder().scheme(Constants.LINK_SCHEME).authority(Constants.LINK_AUTHORITY);
    }

    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public final ContextInfo getContextInfo() {
        return this.contextInfo;
    }

    public final IntentResolveClient getIntentResolveClient() {
        return this.intentResolveClient;
    }

    public final boolean isKakaoLinkAvailable(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return this.intentResolveClient.resolveTalkIntent(context, new Intent("android.intent.action.VIEW", linkUriBuilder().build())) != null;
    }

    public final LinkResult linkResultFromResponse(Context context, ValidationResult validationResult, Map<String, String> map) {
        return linkResultFromResponse$default(this, context, validationResult, map, null, null, 24, null);
    }

    public KakaoLinkIntentClient(ContextInfo contextInfo, ApplicationInfo applicationInfo, IntentResolveClient intentResolveClient) {
        Intrinsics.checkParameterIsNotNull(contextInfo, "contextInfo");
        Intrinsics.checkParameterIsNotNull(applicationInfo, "applicationInfo");
        Intrinsics.checkParameterIsNotNull(intentResolveClient, "intentResolveClient");
        this.contextInfo = contextInfo;
        this.applicationInfo = applicationInfo;
        this.intentResolveClient = intentResolveClient;
    }

    public final LinkResult linkResultFromResponse(Context context, ValidationResult validationResult, Map<String, String> map, String str) {
        return linkResultFromResponse$default(this, context, validationResult, map, str, null, 16, null);
    }

    public /* synthetic */ KakaoLinkIntentClient(ContextInfo contextInfo, ApplicationInfo applicationInfo, IntentResolveClient intentResolveClient, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : contextInfo, (i8 & 2) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : applicationInfo, (i8 & 4) != 0 ? IntentResolveClient.Companion.getInstance() : intentResolveClient);
    }

    public final LinkResult linkResultFromResponse(Context context, ValidationResult response, Map<String, String> map, String appKey, String appVer) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(response, "response");
        Intrinsics.checkParameterIsNotNull(appKey, "appKey");
        Intrinsics.checkParameterIsNotNull(appVer, "appVer");
        int iAttachmentSize = attachmentSize(appKey, response, map);
        if (iAttachmentSize <= 10240) {
            Uri uriBuild = linkUriBuilder().appendQueryParameter(Constants.LINKVER, Constants.LINKVER_40).appendQueryParameter(Constants.APP_KEY, appKey).appendQueryParameter(Constants.APP_VER, appVer).appendQueryParameter(Constants.TEMPLATE_ID, String.valueOf(response.getTemplateId())).appendQueryParameter(Constants.TEMPLATE_ARGS, String.valueOf(response.getTemplateArgs())).appendQueryParameter(Constants.TEMPLATE_JSON, response.getTemplateMsg().toString()).appendQueryParameter("extras", extrasWithServerCallbacks(this.contextInfo.getExtras(), map).toString()).build();
            SdkLog.Companion.i(uriBuild);
            Intent intentAddFlags = new Intent("android.intent.action.SEND", uriBuild).addFlags(335544320);
            Intrinsics.checkExpressionValueIsNotNull(intentAddFlags, "Intent(Intent.ACTION_SEN….FLAG_ACTIVITY_CLEAR_TOP)");
            Intent intentResolveTalkIntent = this.intentResolveClient.resolveTalkIntent(context, intentAddFlags);
            if (intentResolveTalkIntent != null) {
                KakaoJson kakaoJson = KakaoJson.INSTANCE;
                return new LinkResult(intentResolveTalkIntent, (Map) kakaoJson.fromJson(String.valueOf(response.getWarningMsg()), Map.class), (Map) kakaoJson.fromJson(String.valueOf(response.getArgumentMsg()), Map.class));
            }
            throw new ClientError(ClientErrorCause.NotSupported, "Kakaotalk not installed");
        }
        throw new ClientError(ClientErrorCause.BadParameter, "KakaoLink intent size is " + iAttachmentSize + " bytes. It should be less than 10240 bytes.");
    }
}
