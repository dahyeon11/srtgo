package com.kakao.sdk.link;

import C7.C;
import C7.D;
import C7.I;
import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import android.content.Context;
import com.kakao.sdk.link.model.ImageUploadResult;
import com.kakao.sdk.link.model.ValidationResult;
import com.kakao.sdk.network.ApiCallback;
import com.kakao.sdk.network.ApiFactory;
import com.kakao.sdk.template.model.DefaultTemplate;
import f7.InterfaceC5519a;
import f7.p;
import java.io.File;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class LinkClient {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0755i instance$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.link.LinkClient$Companion$instance$2
        @Override // f7.InterfaceC5519a
        public final LinkClient invoke() {
            return new LinkClient(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    });
    private final LinkApi linkApi;
    private final KakaoLinkIntentClient linkIntentClient;

    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/link/LinkClient;"))};

        private Companion() {
        }

        public static /* synthetic */ void instance$annotations() {
        }

        public final LinkClient getInstance() {
            InterfaceC0755i interfaceC0755i = LinkClient.instance$delegate;
            KProperty kProperty = $$delegatedProperties[0];
            return (LinkClient) interfaceC0755i.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LinkClient() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void customTemplate$default(LinkClient linkClient, Context context, long j8, Map map, Map map2, p pVar, int i8, Object obj) {
        linkClient.customTemplate(context, j8, (i8 & 4) != 0 ? null : map, (i8 & 8) != 0 ? null : map2, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defaultTemplate$default(LinkClient linkClient, Context context, DefaultTemplate defaultTemplate, Map map, p pVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            map = null;
        }
        linkClient.defaultTemplate(context, defaultTemplate, map, pVar);
    }

    public static final LinkClient getInstance() {
        return Companion.getInstance();
    }

    public static /* synthetic */ void scrapImage$default(LinkClient linkClient, String str, boolean z8, p pVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        linkClient.scrapImage(str, z8, pVar);
    }

    public static /* synthetic */ void scrapTemplate$default(LinkClient linkClient, Context context, String str, Long l8, Map map, Map map2, p pVar, int i8, Object obj) {
        linkClient.scrapTemplate(context, str, (i8 & 4) != 0 ? null : l8, (i8 & 8) != 0 ? null : map, (i8 & 16) != 0 ? null : map2, pVar);
    }

    public static /* synthetic */ void uploadImage$default(LinkClient linkClient, File file, boolean z8, p pVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        linkClient.uploadImage(file, z8, pVar);
    }

    public final void customTemplate(Context context, long j8, p pVar) {
        customTemplate$default(this, context, j8, null, null, pVar, 12, null);
    }

    public final void defaultTemplate(Context context, DefaultTemplate defaultTemplate, p pVar) {
        defaultTemplate$default(this, context, defaultTemplate, null, pVar, 4, null);
    }

    public final KakaoLinkIntentClient getLinkIntentClient() {
        return this.linkIntentClient;
    }

    public final boolean isKakaoLinkAvailable(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return this.linkIntentClient.isKakaoLinkAvailable(context);
    }

    public final void scrapImage(String str, p pVar) {
        scrapImage$default(this, str, false, pVar, 2, null);
    }

    public final void scrapTemplate(Context context, String str, p pVar) {
        scrapTemplate$default(this, context, str, null, null, null, pVar, 28, null);
    }

    public final void uploadImage(File file, p pVar) {
        uploadImage$default(this, file, false, pVar, 2, null);
    }

    public LinkClient(LinkApi linkApi, KakaoLinkIntentClient linkIntentClient) {
        Intrinsics.checkParameterIsNotNull(linkApi, "linkApi");
        Intrinsics.checkParameterIsNotNull(linkIntentClient, "linkIntentClient");
        this.linkApi = linkApi;
        this.linkIntentClient = linkIntentClient;
    }

    public final void customTemplate(Context context, long j8, Map<String, String> map, p pVar) {
        customTemplate$default(this, context, j8, map, null, pVar, 8, null);
    }

    public final void defaultTemplate(final Context context, DefaultTemplate defaultTemplate, final Map<String, String> map, final p callback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(defaultTemplate, "defaultTemplate");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        this.linkApi.validateDefault(defaultTemplate).enqueue(new ApiCallback<ValidationResult>() { // from class: com.kakao.sdk.link.LinkClient.defaultTemplate.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(ValidationResult validationResult, Throwable th) {
                if (validationResult == null) {
                    callback.invoke(null, th);
                    return;
                }
                try {
                    callback.invoke(KakaoLinkIntentClient.linkResultFromResponse$default(LinkClient.this.getLinkIntentClient(), context, validationResult, map, null, null, 24, null), null);
                } catch (Throwable th2) {
                    callback.invoke(null, th2);
                }
            }
        });
    }

    public final void scrapImage(String imageUrl, boolean z8, final p callback) {
        Intrinsics.checkParameterIsNotNull(imageUrl, "imageUrl");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        this.linkApi.scrapImage(imageUrl, Boolean.valueOf(z8)).enqueue(new ApiCallback<ImageUploadResult>() { // from class: com.kakao.sdk.link.LinkClient.scrapImage.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(ImageUploadResult imageUploadResult, Throwable th) {
                callback.invoke(imageUploadResult, th);
            }
        });
    }

    public final void scrapTemplate(Context context, String str, Long l8, p pVar) {
        scrapTemplate$default(this, context, str, l8, null, null, pVar, 24, null);
    }

    public final void uploadImage(File image, boolean z8, final p callback) {
        Intrinsics.checkParameterIsNotNull(image, "image");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        LinkApi linkApi = this.linkApi;
        D.b bVarCreateFormData = D.b.createFormData("file", image.getName(), I.create(C.parse("image/*"), image));
        Intrinsics.checkExpressionValueIsNotNull(bVarCreateFormData, "MultipartBody.Part.creat…*\"), image)\n            )");
        linkApi.uploadImage(bVarCreateFormData, Boolean.valueOf(z8)).enqueue(new ApiCallback<ImageUploadResult>() { // from class: com.kakao.sdk.link.LinkClient.uploadImage.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(ImageUploadResult imageUploadResult, Throwable th) {
                callback.invoke(imageUploadResult, th);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LinkClient(LinkApi linkApi, KakaoLinkIntentClient kakaoLinkIntentClient, int i8, DefaultConstructorMarker defaultConstructorMarker) throws SecurityException {
        if ((i8 & 1) != 0) {
            Object objCreate = ApiFactory.INSTANCE.getKapi().create(LinkApi.class);
            Intrinsics.checkExpressionValueIsNotNull(objCreate, "ApiFactory.kapi.create(LinkApi::class.java)");
            linkApi = (LinkApi) objCreate;
        }
        this(linkApi, (i8 & 2) != 0 ? KakaoLinkIntentClient.Companion.getInstance() : kakaoLinkIntentClient);
    }

    public final void customTemplate(final Context context, long j8, Map<String, String> map, final Map<String, String> map2, final p callback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        this.linkApi.validateCustom(j8, map).enqueue(new ApiCallback<ValidationResult>() { // from class: com.kakao.sdk.link.LinkClient.customTemplate.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(ValidationResult validationResult, Throwable th) {
                if (validationResult == null) {
                    callback.invoke(null, th);
                    return;
                }
                try {
                    callback.invoke(KakaoLinkIntentClient.linkResultFromResponse$default(LinkClient.this.getLinkIntentClient(), context, validationResult, map2, null, null, 24, null), null);
                } catch (Throwable th2) {
                    callback.invoke(null, th2);
                }
            }
        });
    }

    public final void scrapTemplate(Context context, String str, Long l8, Map<String, String> map, p pVar) {
        scrapTemplate$default(this, context, str, l8, map, null, pVar, 16, null);
    }

    public final void scrapTemplate(final Context context, String url, Long l8, Map<String, String> map, final Map<String, String> map2, final p callback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(url, "url");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        this.linkApi.validateScrap(url, l8, map).enqueue(new ApiCallback<ValidationResult>() { // from class: com.kakao.sdk.link.LinkClient.scrapTemplate.1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(ValidationResult validationResult, Throwable th) {
                if (validationResult == null) {
                    callback.invoke(null, th);
                    return;
                }
                try {
                    callback.invoke(KakaoLinkIntentClient.linkResultFromResponse$default(LinkClient.this.getLinkIntentClient(), context, validationResult, map2, null, null, 24, null), null);
                } catch (Throwable th2) {
                    callback.invoke(null, th2);
                }
            }
        });
    }
}
