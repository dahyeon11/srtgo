package com.kakao.sdk.link;

import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import android.net.Uri;
import com.google.gson.l;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApplicationInfo;
import com.kakao.sdk.common.model.ContextInfo;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.template.model.DefaultTemplate;
import f7.InterfaceC5519a;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class WebSharerClient {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0755i instance$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.link.WebSharerClient$Companion$instance$2
        @Override // f7.InterfaceC5519a
        public final WebSharerClient invoke() {
            return new WebSharerClient(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    });
    private final ApplicationInfo applicationInfo;
    private final ContextInfo contextInfo;

    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/link/WebSharerClient;"))};

        private Companion() {
        }

        public static /* synthetic */ void instance$annotations() {
        }

        public final WebSharerClient getInstance() {
            InterfaceC0755i interfaceC0755i = WebSharerClient.instance$delegate;
            KProperty kProperty = $$delegatedProperties[0];
            return (WebSharerClient) interfaceC0755i.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WebSharerClient() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final Uri.Builder baseUriBuilder(Map<String, String> map) {
        Uri.Builder builder = new Uri.Builder().scheme(com.kakao.sdk.common.Constants.SCHEME).authority(KakaoSdk.INSTANCE.getHosts().getSharer()).path(Constants.SHARER_PATH).appendQueryParameter("app_key", this.applicationInfo.getAppKey()).appendQueryParameter("ka", this.contextInfo.getKaHeader());
        if (map != null) {
            builder.appendQueryParameter(Constants.LCBA, KakaoJson.INSTANCE.toJson(map));
        }
        Intrinsics.checkExpressionValueIsNotNull(builder, "builder");
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Uri customTemplateUri$default(WebSharerClient webSharerClient, long j8, Map map, Map map2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            map = null;
        }
        if ((i8 & 4) != 0) {
            map2 = null;
        }
        return webSharerClient.customTemplateUri(j8, map, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Uri defaultTemplateUri$default(WebSharerClient webSharerClient, DefaultTemplate defaultTemplate, Map map, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            map = null;
        }
        return webSharerClient.defaultTemplateUri(defaultTemplate, map);
    }

    public static final WebSharerClient getInstance() {
        return Companion.getInstance();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Uri scrapTemplateUri$default(WebSharerClient webSharerClient, String str, Long l8, Map map, Map map2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            l8 = null;
        }
        if ((i8 & 4) != 0) {
            map = null;
        }
        if ((i8 & 8) != 0) {
            map2 = null;
        }
        return webSharerClient.scrapTemplateUri(str, l8, map, map2);
    }

    public final Uri customTemplateUri(long j8) {
        return customTemplateUri$default(this, j8, null, null, 6, null);
    }

    public final Uri defaultTemplateUri(DefaultTemplate defaultTemplate) {
        return defaultTemplateUri$default(this, defaultTemplate, null, 2, null);
    }

    public final Uri scrapTemplateUri(String str) {
        return scrapTemplateUri$default(this, str, null, null, null, 14, null);
    }

    public WebSharerClient(ContextInfo contextInfo, ApplicationInfo applicationInfo) {
        Intrinsics.checkParameterIsNotNull(contextInfo, "contextInfo");
        Intrinsics.checkParameterIsNotNull(applicationInfo, "applicationInfo");
        this.contextInfo = contextInfo;
        this.applicationInfo = applicationInfo;
    }

    public final Uri customTemplateUri(long j8, Map<String, String> map) {
        return customTemplateUri$default(this, j8, map, null, 4, null);
    }

    public final Uri defaultTemplateUri(DefaultTemplate template, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(template, "template");
        l lVar = new l();
        lVar.add("template_object", KakaoJson.INSTANCE.getBase().toJsonTree(template));
        lVar.addProperty(Constants.LINK_VER, Constants.LINKVER_40);
        Uri uriBuild = baseUriBuilder(map).appendQueryParameter(Constants.VALIDATION_ACTION, Constants.VALIDATION_DEFAULT).appendQueryParameter(Constants.VALIDATION_PARAMS, lVar.toString()).build();
        Intrinsics.checkExpressionValueIsNotNull(uriBuild, "builder.build()");
        return uriBuild;
    }

    public final Uri scrapTemplateUri(String str, Long l8) {
        return scrapTemplateUri$default(this, str, l8, null, null, 12, null);
    }

    public /* synthetic */ WebSharerClient(ContextInfo contextInfo, ApplicationInfo applicationInfo, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : contextInfo, (i8 & 2) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : applicationInfo);
    }

    public final Uri customTemplateUri(long j8, Map<String, String> map, Map<String, String> map2) {
        l lVar = new l();
        lVar.addProperty(Constants.TEMPLATE_ID, Long.valueOf(j8));
        if (map != null) {
            lVar.addProperty(Constants.TEMPLATE_ARGS, KakaoJson.INSTANCE.toJson(map));
        }
        lVar.addProperty(Constants.LINK_VER, Constants.LINKVER_40);
        Uri uriBuild = baseUriBuilder(map2).appendQueryParameter(Constants.VALIDATION_ACTION, Constants.VALIDATION_CUSTOM).appendQueryParameter(Constants.VALIDATION_PARAMS, lVar.toString()).build();
        Intrinsics.checkExpressionValueIsNotNull(uriBuild, "builder.build()");
        return uriBuild;
    }

    public final Uri scrapTemplateUri(String str, Long l8, Map<String, String> map) {
        return scrapTemplateUri$default(this, str, l8, map, null, 8, null);
    }

    public final Uri scrapTemplateUri(String requestUrl, Long l8, Map<String, String> map, Map<String, String> map2) {
        Intrinsics.checkParameterIsNotNull(requestUrl, "requestUrl");
        l lVar = new l();
        lVar.addProperty(Constants.REQUEST_URL, requestUrl);
        if (l8 != null) {
            lVar.addProperty(Constants.TEMPLATE_ID, Long.valueOf(l8.longValue()));
        }
        if (map != null) {
            lVar.addProperty(Constants.TEMPLATE_ARGS, KakaoJson.INSTANCE.toJson(map));
        }
        lVar.addProperty(Constants.LINK_VER, Constants.LINKVER_40);
        Uri uriBuild = baseUriBuilder(map2).appendQueryParameter(Constants.VALIDATION_ACTION, Constants.VALIDATION_SCRAP).appendQueryParameter(Constants.VALIDATION_PARAMS, lVar.toString()).build();
        Intrinsics.checkExpressionValueIsNotNull(uriBuild, "builder.build()");
        return uriBuild;
    }
}
