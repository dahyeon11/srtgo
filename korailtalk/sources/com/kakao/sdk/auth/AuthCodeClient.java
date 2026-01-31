package com.kakao.sdk.auth;

import R6.AbstractC0756j;
import R6.G;
import R6.InterfaceC0755i;
import R6.q;
import R6.r;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Base64;
import com.kakao.sdk.auth.model.Prompt;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApplicationInfo;
import com.kakao.sdk.common.model.ApprovalType;
import com.kakao.sdk.common.model.AuthError;
import com.kakao.sdk.common.model.AuthErrorCause;
import com.kakao.sdk.common.model.AuthErrorResponse;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.ContextInfo;
import com.kakao.sdk.common.model.KakaoSdkError;
import com.kakao.sdk.common.util.IntentResolveClient;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.SdkLog;
import f7.InterfaceC5519a;
import f7.l;
import f7.p;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import l7.C5900f;
import maum.m2u.map.Map;

/* loaded from: classes.dex */
public final class AuthCodeClient {
    public static final int DEFAULT_REQUEST_CODE = 10012;
    private final ApplicationInfo applicationInfo;
    private final ApprovalType approvalType;
    private final ContextInfo contextInfo;
    private final IntentResolveClient intentResolveClient;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0755i instance$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.auth.AuthCodeClient$Companion$instance$2
        @Override // f7.InterfaceC5519a
        public final AuthCodeClient invoke() {
            return new AuthCodeClient(null, null, null, null, 15, null);
        }
    });

    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/AuthCodeClient;"))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final String codeChallenge(byte[] codeVerifier) {
            Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
            String strEncodeToString = Base64.encodeToString(MessageDigest.getInstance(Constants.CODE_CHALLENGE_ALGORITHM).digest(codeVerifier), 11);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(\n                MessageDigest.getInstance(Constants.CODE_CHALLENGE_ALGORITHM).digest(codeVerifier),\n                Base64.NO_WRAP or Base64.NO_PADDING or Base64.URL_SAFE\n            )");
            return strEncodeToString;
        }

        public final String codeVerifier() throws NoSuchAlgorithmException {
            MessageDigest messageDigest = MessageDigest.getInstance(Constants.CODE_VERIFIER_ALGORITHM);
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            byte[] bytes = string.getBytes(C5900f.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(bytes), 3);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(\n                MessageDigest.getInstance(Constants.CODE_VERIFIER_ALGORITHM).digest(\n                    UUID.randomUUID().toString().toByteArray()\n                ),\n                Base64.NO_WRAP or Base64.NO_PADDING\n            )");
            return strEncodeToString;
        }

        public final AuthCodeClient getInstance() {
            return (AuthCodeClient) AuthCodeClient.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    public AuthCodeClient() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ void authorizeWithKakaoAccount$default(AuthCodeClient authCodeClient, Context context, List list, String str, List list2, String str2, String str3, List list3, List list4, boolean z8, String str4, Map map, String str5, p pVar, int i8, Object obj) {
        authCodeClient.authorizeWithKakaoAccount(context, (i8 & 2) != 0 ? null : list, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : list2, (i8 & 16) != 0 ? null : str2, (i8 & 32) != 0 ? null : str3, (i8 & 64) != 0 ? null : list3, (i8 & 128) != 0 ? null : list4, (i8 & 256) != 0 ? false : z8, (i8 & 512) != 0 ? null : str4, (i8 & 1024) != 0 ? null : map, (i8 & 2048) != 0 ? null : str5, pVar);
    }

    public static /* synthetic */ void authorizeWithKakaoTalk$default(AuthCodeClient authCodeClient, Context context, List list, String str, int i8, String str2, List list2, List list3, String str3, p pVar, int i9, Object obj) {
        authCodeClient.authorizeWithKakaoTalk(context, (i9 & 2) != 0 ? null : list, (i9 & 4) != 0 ? null : str, (i9 & 8) != 0 ? 10012 : i8, (i9 & 16) != 0 ? null : str2, (i9 & 32) != 0 ? null : list2, (i9 & 64) != 0 ? null : list3, (i9 & 128) != 0 ? null : str3, pVar);
    }

    public static final AuthCodeClient getInstance() {
        return Companion.getInstance();
    }

    public final void authorizeWithKakaoAccount(Context context, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, null, null, null, null, null, null, null, false, null, null, null, callback, 4094, null);
    }

    public final void authorizeWithKakaoTalk(Context context, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, null, null, 0, null, null, null, null, callback, 254, null);
    }

    public final boolean isKakaoTalkLoginAvailable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.intentResolveClient.resolveTalkIntent(context, AuthCodeIntentFactory.INSTANCE.talkBase()) != null;
    }

    public final /* synthetic */ ResultReceiver resultReceiver$auth_release(final p callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final Handler handler = new Handler(Looper.getMainLooper());
        return new ResultReceiver(handler) { // from class: com.kakao.sdk.auth.AuthCodeClient$resultReceiver$1
            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i8, Bundle bundle) {
                Object objM67constructorimpl;
                SdkLog.Companion.d(Intrinsics.stringPlus("***** AUTH CODE RESULT: ", bundle));
                if (i8 != -1) {
                    if (i8 != 0) {
                        callback.invoke(null, new IllegalArgumentException("Unknown resultCode in RxAuthCodeClient#onReceivedResult()"));
                        return;
                    }
                    Serializable serializable = bundle == null ? null : bundle.getSerializable(Constants.KEY_EXCEPTION);
                    if (serializable == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.kakao.sdk.common.model.KakaoSdkError");
                    }
                    callback.invoke(null, (KakaoSdkError) serializable);
                    return;
                }
                Uri uri = bundle == null ? null : (Uri) bundle.getParcelable(Constants.KEY_URL);
                String queryParameter = uri == null ? null : uri.getQueryParameter(Constants.CODE);
                if (queryParameter != null) {
                    callback.invoke(queryParameter, null);
                    return;
                }
                String queryParameter2 = uri == null ? null : uri.getQueryParameter("error");
                if (queryParameter2 == null) {
                    queryParameter2 = Constants.INSTANCE.getUNKNOWN_ERROR();
                }
                Intrinsics.checkNotNullExpressionValue(queryParameter2, "uri?.getQueryParameter(Constants.ERROR) ?: Constants.UNKNOWN_ERROR");
                String queryParameter3 = uri == null ? null : uri.getQueryParameter(Constants.ERROR_DESCRIPTION);
                p pVar = callback;
                try {
                    q.a aVar = q.Companion;
                    objM67constructorimpl = q.m67constructorimpl((AuthErrorCause) KakaoJson.INSTANCE.fromJson(queryParameter2, AuthErrorCause.class));
                } catch (Throwable th) {
                    q.a aVar2 = q.Companion;
                    objM67constructorimpl = q.m67constructorimpl(r.createFailure(th));
                }
                AuthErrorCause authErrorCause = AuthErrorCause.Unknown;
                if (q.m72isFailureimpl(objM67constructorimpl)) {
                    objM67constructorimpl = authErrorCause;
                }
                pVar.invoke(null, new AuthError(Map.MapException.StatusCode.AUTH_INVALID_AUTH_TOKEN_VALUE, (AuthErrorCause) objM67constructorimpl, new AuthErrorResponse(queryParameter2, queryParameter3)));
            }
        };
    }

    public AuthCodeClient(IntentResolveClient intentResolveClient, ApplicationInfo applicationInfo, ContextInfo contextInfo, ApprovalType approvalType) {
        Intrinsics.checkNotNullParameter(intentResolveClient, "intentResolveClient");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(contextInfo, "contextInfo");
        Intrinsics.checkNotNullParameter(approvalType, "approvalType");
        this.intentResolveClient = intentResolveClient;
        this.applicationInfo = applicationInfo;
        this.contextInfo = contextInfo;
        this.approvalType = approvalType;
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, null, null, null, null, null, null, false, null, null, null, callback, 4092, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, null, 0, null, null, null, null, callback, 252, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, null, null, null, null, null, false, null, null, null, callback, 4088, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i8, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, str, i8, null, null, null, null, callback, 240, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, null, null, null, null, false, null, null, null, callback, 4080, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i8, String str2, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, str, i8, str2, null, null, null, callback, 224, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, null, null, null, false, null, null, null, callback, 4064, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i8, String str2, List<String> list2, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, str, i8, str2, list2, null, null, callback, 192, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, null, null, false, null, null, null, callback, 4032, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i8, String str2, List<String> list2, List<String> list3, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, str, i8, str2, list2, list3, null, callback, 128, null);
    }

    public /* synthetic */ AuthCodeClient(IntentResolveClient intentResolveClient, ApplicationInfo applicationInfo, ContextInfo contextInfo, ApprovalType approvalType, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? IntentResolveClient.Companion.getInstance() : intentResolveClient, (i8 & 2) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : applicationInfo, (i8 & 4) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : contextInfo, (i8 & 8) != 0 ? KakaoSdk.INSTANCE.getApprovalType() : approvalType);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, null, false, null, null, null, callback, 3968, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, str, 0, null, null, null, null, callback, 248, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, list4, false, null, null, null, callback, 3840, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i8, String str2, List<String> list2, List<String> list3, String str3, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!isKakaoTalkLoginAvailable(context)) {
            callback.invoke(null, new ClientError(ClientErrorCause.NotSupported, "KakaoTalk not installed"));
            return;
        }
        try {
            AuthCodeIntentFactory authCodeIntentFactory = AuthCodeIntentFactory.INSTANCE;
            String appKey = this.applicationInfo.getAppKey();
            String redirectUri = this.applicationInfo.getRedirectUri();
            String kaHeader = this.contextInfo.getKaHeader();
            Bundle bundle = new Bundle();
            if (list2 != null) {
                bundle.putString(Constants.CHANNEL_PUBLIC_ID, S6.r.joinToString$default(list2, ",", null, null, 0, null, null, 62, null));
            }
            if (list3 != null) {
                bundle.putString(Constants.SERVICE_TERMS, S6.r.joinToString$default(list3, ",", null, null, 0, null, null, 62, null));
            }
            String value = this.approvalType.getValue();
            if (value != null) {
                bundle.putString(Constants.APPROVAL_TYPE, value);
            }
            if (str3 != null) {
                Companion companion = Companion;
                byte[] bytes = str3.getBytes(C5900f.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                bundle.putString(Constants.CODE_CHALLENGE, companion.codeChallenge(bytes));
                bundle.putString(Constants.CODE_CHALLENGE_METHOD, Constants.CODE_CHALLENGE_METHOD_VALUE);
            }
            if (list != null) {
                bundle.putString(Constants.PROMPT, S6.r.joinToString$default(list, ",", null, null, 0, null, new l() { // from class: com.kakao.sdk.auth.AuthCodeClient$authorizeWithKakaoTalk$1$5$1
                    @Override // f7.l
                    public final CharSequence invoke(Prompt prompt) {
                        Intrinsics.checkNotNullParameter(prompt, "prompt");
                        return prompt.getValue();
                    }
                }, 30, null));
            }
            if (str != null) {
                bundle.putString("state", str);
            }
            if (str2 != null) {
                bundle.putString(Constants.NONCE, str2);
            }
            G g8 = G.INSTANCE;
            context.startActivity(authCodeIntentFactory.talk(context, i8, appKey, redirectUri, kaHeader, bundle, resultReceiver$auth_release(callback)));
        } catch (Throwable th) {
            SdkLog.Companion.e(th);
            callback.invoke(null, th);
        }
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, boolean z8, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, list4, z8, null, null, null, callback, 3584, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, boolean z8, String str4, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, list4, z8, str4, null, null, callback, 3072, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, boolean z8, String str4, java.util.Map<String, String> map, p callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, list4, z8, str4, map, null, callback, 2048, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, boolean z8, String str4, java.util.Map<String, String> map, String str5, p callback) {
        String strCodeChallenge;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        UriUtility uriUtility = new UriUtility(null, 1, null);
        String appKey = this.applicationInfo.getAppKey();
        String redirectUri = this.applicationInfo.getRedirectUri();
        String kaHeader = this.contextInfo.getKaHeader();
        String value = this.approvalType.getValue();
        if (str5 == null) {
            strCodeChallenge = null;
        } else {
            Companion companion = Companion;
            byte[] bytes = str5.getBytes(C5900f.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            strCodeChallenge = companion.codeChallenge(bytes);
        }
        Uri uriAuthorize = uriUtility.authorize(appKey, str3, redirectUri, list2, kaHeader, list3, list4, list, str, str4, str2, value, strCodeChallenge, str5 == null ? null : Constants.CODE_CHALLENGE_METHOD_VALUE);
        if (z8 && map != null) {
            uriAuthorize = uriUtility.accountLoginAndAuthorize(uriAuthorize, map);
        }
        SdkLog.Companion.i(uriAuthorize);
        try {
            context.startActivity(AuthCodeIntentFactory.INSTANCE.account(context, uriAuthorize, this.applicationInfo.getRedirectUri(), resultReceiver$auth_release(callback)));
        } catch (Throwable th) {
            SdkLog.Companion.e(th);
            callback.invoke(null, th);
        }
    }
}
