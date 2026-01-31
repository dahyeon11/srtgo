package com.kakao.sdk.auth;

import S6.r;
import android.net.Uri;
import com.kakao.sdk.auth.model.Prompt;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ServerHosts;
import f7.l;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class UriUtility {
    private final ServerHosts hosts;

    public UriUtility() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Uri accountLoginAndAuthorize$default(UriUtility uriUtility, Uri uri, Map map, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            map = null;
        }
        return uriUtility.accountLoginAndAuthorize(uri, map);
    }

    public final Uri accountLoginAndAuthorize(Uri authorizeUri, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(authorizeUri, "authorizeUri");
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(com.kakao.sdk.common.Constants.SCHEME).authority(this.hosts.getMobileAccount()).path(Constants.ACCOUNT_LOGIN_PATH).appendQueryParameter(Constants.ACCOUNT_LOGIN_PARAM_CONTINUE, authorizeUri.toString());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderAppendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "Builder()\n            .scheme(com.kakao.sdk.common.Constants.SCHEME)\n            .authority(hosts.mobileAccount)\n            .path(Constants.ACCOUNT_LOGIN_PATH)\n            .appendQueryParameter(Constants.ACCOUNT_LOGIN_PARAM_CONTINUE, authorizeUri.toString())\n            .apply {\n                accountParameters?.forEach {\n                    appendQueryParameter(it.key, it.value)\n                }\n            }.build()");
        return uriBuild;
    }

    public final Uri authorize(String clientId, String str, String redirectUri, List<String> list, String str2, List<String> list2, List<String> list3, List<? extends Prompt> list4, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(com.kakao.sdk.common.Constants.SCHEME).authority(this.hosts.getKauth()).path(Constants.AUTHORIZE_PATH).appendQueryParameter(Constants.CLIENT_ID, clientId).appendQueryParameter(Constants.REDIRECT_URI, redirectUri).appendQueryParameter(Constants.RESPONSE_TYPE, Constants.CODE);
        if (str != null) {
            builderAppendQueryParameter.appendQueryParameter(Constants.AGT, str);
        }
        List<String> list5 = list;
        if (list5 != null && !list5.isEmpty()) {
            builderAppendQueryParameter.appendQueryParameter(Constants.SCOPE, r.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
        if (list2 != null) {
            builderAppendQueryParameter.appendQueryParameter(Constants.CHANNEL_PUBLIC_ID, r.joinToString$default(list2, ",", null, null, 0, null, null, 62, null));
        }
        if (list3 != null) {
            builderAppendQueryParameter.appendQueryParameter(Constants.SERVICE_TERMS, r.joinToString$default(list3, ",", null, null, 0, null, null, 62, null));
        }
        if (list4 != null) {
            builderAppendQueryParameter.appendQueryParameter(Constants.PROMPT, r.joinToString$default(list4, ",", null, null, 0, null, new l() { // from class: com.kakao.sdk.auth.UriUtility$authorize$1$4$1
                @Override // f7.l
                public final CharSequence invoke(Prompt prompt) {
                    Intrinsics.checkNotNullParameter(prompt, "prompt");
                    return prompt.getValue();
                }
            }, 30, null));
        }
        if (str3 != null) {
            builderAppendQueryParameter.appendQueryParameter("state", str3);
        }
        if (str4 != null) {
            builderAppendQueryParameter.appendQueryParameter(Constants.LOGIN_HINT, str4);
        }
        if (str5 != null) {
            builderAppendQueryParameter.appendQueryParameter(Constants.NONCE, str5);
        }
        if (str6 != null) {
            builderAppendQueryParameter.appendQueryParameter(Constants.APPROVAL_TYPE, str6);
        }
        if (str7 != null) {
            builderAppendQueryParameter.appendQueryParameter(Constants.CODE_CHALLENGE, str7);
        }
        if (str8 != null) {
            builderAppendQueryParameter.appendQueryParameter(Constants.CODE_CHALLENGE_METHOD, str8);
        }
        Uri uriBuild = builderAppendQueryParameter.appendQueryParameter("ka", str2).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "Builder()\n            .scheme(com.kakao.sdk.common.Constants.SCHEME)\n            .authority(hosts.kauth).path(Constants.AUTHORIZE_PATH)\n            .appendQueryParameter(Constants.CLIENT_ID, clientId)\n            .appendQueryParameter(Constants.REDIRECT_URI, redirectUri)\n            .appendQueryParameter(Constants.RESPONSE_TYPE, Constants.CODE).apply {\n                agt?.let { appendQueryParameter(Constants.AGT, agt) }\n                if (!scopes.isNullOrEmpty()) {\n                    appendQueryParameter(Constants.SCOPE, scopes.joinToString(\",\"))\n                }\n                channelPublicIds?.let {\n                    appendQueryParameter(\n                        Constants.CHANNEL_PUBLIC_ID,\n                        channelPublicIds.joinToString(\",\")\n                    )\n                }\n                serviceTerms?.let {\n                    appendQueryParameter(\n                        Constants.SERVICE_TERMS,\n                        serviceTerms.joinToString(\",\")\n                    )\n                }\n                prompts?.let { prompts ->\n                    appendQueryParameter(\n                        Constants.PROMPT,\n                        prompts.joinToString(\",\") { prompt -> prompt.value }\n                    )\n                }\n                state?.let { appendQueryParameter(Constants.STATE, it) }\n                loginHint?.let { appendQueryParameter(Constants.LOGIN_HINT, it) }\n                nonce?.let { appendQueryParameter(Constants.NONCE, it) }\n                approvalType?.let { appendQueryParameter(Constants.APPROVAL_TYPE, it) }\n                codeChallenge?.let { appendQueryParameter(Constants.CODE_CHALLENGE, it) }\n                codeChallengeMethod?.let {\n                    appendQueryParameter(\n                        Constants.CODE_CHALLENGE_METHOD,\n                        it\n                    )\n                }\n            }\n            .appendQueryParameter(Constants.KA_HEADER, kaHeader)\n            .build()");
        return uriBuild;
    }

    public UriUtility(ServerHosts hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        this.hosts = hosts;
    }

    public /* synthetic */ UriUtility(ServerHosts serverHosts, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? KakaoSdk.INSTANCE.getHosts() : serverHosts);
    }
}
