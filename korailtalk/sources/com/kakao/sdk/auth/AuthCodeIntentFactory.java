package com.kakao.sdk.auth;

import R6.G;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AuthCodeIntentFactory {
    public static final AuthCodeIntentFactory INSTANCE = new AuthCodeIntentFactory();

    private AuthCodeIntentFactory() {
    }

    public final Intent account(Context context, Uri fullUri, String redirectUri, ResultReceiver resultReceiver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fullUri, "fullUri");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        Intent intent = new Intent(context, (Class<?>) AuthCodeHandlerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.KEY_RESULT_RECEIVER, resultReceiver);
        bundle.putParcelable(Constants.KEY_FULL_URI, fullUri);
        bundle.putString(Constants.KEY_REDIRECT_URI, redirectUri);
        G g8 = G.INSTANCE;
        Intent intentAddFlags = intent.putExtra(Constants.KEY_BUNDLE, bundle).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "Intent(context, AuthCodeHandlerActivity::class.java)\n            .putExtra(Constants.KEY_BUNDLE, Bundle().apply {\n                putParcelable(Constants.KEY_RESULT_RECEIVER, resultReceiver)\n                putParcelable(Constants.KEY_FULL_URI, fullUri)\n                putString(Constants.KEY_REDIRECT_URI, redirectUri)\n            })\n            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)");
        return intentAddFlags;
    }

    public final Intent talk(Context context, int i8, String clientId, String redirectUri, String kaHeader, Bundle extras, ResultReceiver resultReceiver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(kaHeader, "kaHeader");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        Intent intent = new Intent(context, (Class<?>) TalkAuthCodeActivity.class);
        Intent intentTalkBase = talkBase();
        Constants constants = Constants.INSTANCE;
        Intent intentPutExtra = intent.putExtra(Constants.KEY_LOGIN_INTENT, intentTalkBase.putExtra(constants.getEXTRA_APPLICATION_KEY(), clientId).putExtra(constants.getEXTRA_REDIRECT_URI(), redirectUri).putExtra(constants.getEXTRA_KA_HEADER(), kaHeader).putExtra(constants.getEXTRA_EXTRAPARAMS(), extras)).putExtra(Constants.KEY_REQUEST_CODE, i8);
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.KEY_RESULT_RECEIVER, resultReceiver);
        G g8 = G.INSTANCE;
        Intent intentPutExtra2 = intentPutExtra.putExtra(Constants.KEY_BUNDLE, bundle);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "Intent(context, TalkAuthCodeActivity::class.java)\n            .putExtra(Constants.KEY_LOGIN_INTENT,\n                talkBase()\n                    .putExtra(Constants.EXTRA_APPLICATION_KEY, clientId)\n                    .putExtra(Constants.EXTRA_REDIRECT_URI, redirectUri)\n                    .putExtra(Constants.EXTRA_KA_HEADER, kaHeader)\n                    .putExtra(Constants.EXTRA_EXTRAPARAMS, extras)\n            )\n            .putExtra(Constants.KEY_REQUEST_CODE, requestCode)\n            .putExtra(Constants.KEY_BUNDLE, Bundle().apply {\n                putParcelable(Constants.KEY_RESULT_RECEIVER, resultReceiver)\n            })");
        return intentPutExtra2;
    }

    public final Intent talkBase() {
        Intent intentAddCategory = new Intent(Constants.CAPRI_LOGGED_IN_ACTIVITY).addCategory("android.intent.category.DEFAULT");
        Intrinsics.checkNotNullExpressionValue(intentAddCategory, "Intent(Constants.CAPRI_LOGGED_IN_ACTIVITY).addCategory(Intent.CATEGORY_DEFAULT)");
        return intentAddCategory;
    }
}
