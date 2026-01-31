package com.kakao.sdk.auth;

import R6.G;
import S6.r;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.appcompat.app.e;
import com.kakao.sdk.common.model.AuthError;
import com.kakao.sdk.common.model.AuthErrorCause;
import com.kakao.sdk.common.model.AuthErrorResponse;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.KakaoSdkError;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.SdkLog;
import com.kakao.sdk.v2.auth.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import maum.m2u.map.Map;

/* loaded from: classes.dex */
public final class TalkAuthCodeActivity extends e {
    private ResultReceiver resultReceiver;
    private final String EXTRA_ERROR_TYPE = "com.kakao.sdk.talk.error.type";
    private final String EXTRA_ERROR_DESCRIPTION = "com.kakao.sdk.talk.error.description";
    private final String NOT_SUPPORT_ERROR = "NotSupportError";
    private final String UNKNOWN_ERROR = "UnknownError";
    private final String PROTOCOL_ERROR = "ProtocolError";
    private final String APPLICATION_ERROR = "ApplicationError";
    private final String AUTH_CODE_ERROR = "AuthCodeError";
    private final String CLIENT_INFO_ERROR = "ClientInfoError";

    private final void sendError(KakaoSdkError kakaoSdkError) {
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            if (resultReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resultReceiver");
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable(Constants.KEY_EXCEPTION, kakaoSdkError);
            G g8 = G.INSTANCE;
            resultReceiver.send(0, bundle);
        }
        finish();
    }

    public final String getAPPLICATION_ERROR() {
        return this.APPLICATION_ERROR;
    }

    public final String getAUTH_CODE_ERROR() {
        return this.AUTH_CODE_ERROR;
    }

    public final String getCLIENT_INFO_ERROR() {
        return this.CLIENT_INFO_ERROR;
    }

    public final String getEXTRA_ERROR_DESCRIPTION() {
        return this.EXTRA_ERROR_DESCRIPTION;
    }

    public final String getEXTRA_ERROR_TYPE() {
        return this.EXTRA_ERROR_TYPE;
    }

    public final String getNOT_SUPPORT_ERROR() {
        return this.NOT_SUPPORT_ERROR;
    }

    public final String getPROTOCOL_ERROR() {
        return this.PROTOCOL_ERROR;
    }

    public final String getUNKNOWN_ERROR() {
        return this.UNKNOWN_ERROR;
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        Bundle bundle = new Bundle();
        int i10 = 2;
        String str = null;
        byte b9 = 0;
        byte b10 = 0;
        byte b11 = 0;
        if (intent == null || i9 == 0) {
            sendError(new ClientError(ClientErrorCause.Cancelled, b10 == true ? 1 : 0, i10, b9 == true ? 1 : 0));
            return;
        }
        if (i9 != -1) {
            throw new IllegalArgumentException("");
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            sendError(new ClientError(ClientErrorCause.Unknown, "No result from KakaoTalk."));
            return;
        }
        String string = extras.getString(this.EXTRA_ERROR_TYPE);
        String string2 = extras.getString(this.EXTRA_ERROR_DESCRIPTION);
        if (Intrinsics.areEqual(string, "access_denied")) {
            sendError(new ClientError(ClientErrorCause.Cancelled, str, i10, b11 == true ? 1 : 0));
            return;
        }
        if (string != null) {
            AuthErrorCause authErrorCause = (AuthErrorCause) KakaoJson.INSTANCE.fromJson(string, AuthErrorCause.class);
            if (authErrorCause == null) {
                authErrorCause = AuthErrorCause.Unknown;
            }
            if (string2 == null) {
                string2 = "no error description";
            }
            sendError(new AuthError(Map.MapException.StatusCode.AUTH_INVALID_AUTH_TOKEN_VALUE, authErrorCause, new AuthErrorResponse(string, string2)));
            return;
        }
        Object obj = extras.get(Constants.INSTANCE.getEXTRA_REDIRECT_URL());
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        bundle.putParcelable(Constants.KEY_URL, Uri.parse((String) obj));
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultReceiver");
            throw null;
        }
        resultReceiver.send(-1, bundle);
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.activity_talk_auth_code);
        try {
            Bundle extras2 = getIntent().getExtras();
            if (extras2 == null) {
                throw new IllegalArgumentException("no extras.");
            }
            Bundle bundle2 = extras2.getBundle(Constants.KEY_BUNDLE);
            if (bundle2 != null) {
                Parcelable parcelable = bundle2.getParcelable(Constants.KEY_RESULT_RECEIVER);
                if (parcelable == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.os.ResultReceiver");
                }
                this.resultReceiver = (ResultReceiver) parcelable;
            }
            int i8 = extras2.getInt(Constants.KEY_REQUEST_CODE);
            SdkLog.Companion companion = SdkLog.Companion;
            companion.i(Intrinsics.stringPlus("requestCode: ", Integer.valueOf(i8)));
            Intent intent = (Intent) extras2.getParcelable(Constants.KEY_LOGIN_INTENT);
            companion.i("loginIntent:");
            if (intent != null && (extras = intent.getExtras()) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append('\t');
                Constants constants = Constants.INSTANCE;
                sb.append(constants.getEXTRA_APPLICATION_KEY());
                sb.append(" : ");
                sb.append((Object) extras.getString(constants.getEXTRA_APPLICATION_KEY()));
                companion.i(sb.toString());
                companion.i('\t' + constants.getEXTRA_REDIRECT_URI() + " : " + ((Object) extras.getString(constants.getEXTRA_REDIRECT_URI())));
                companion.i('\t' + constants.getEXTRA_KA_HEADER() + " : " + ((Object) extras.getString(constants.getEXTRA_KA_HEADER())));
                Bundle bundle3 = extras.getBundle(constants.getEXTRA_EXTRAPARAMS());
                if (bundle3 != null) {
                    companion.i(Intrinsics.stringPlus("\t", constants.getEXTRA_EXTRAPARAMS()));
                    Set<String> setKeySet = bundle3.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet()");
                    Set<String> set = setKeySet;
                    ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(set, 10));
                    for (String str : set) {
                        arrayList.add("\t\t" + ((Object) str) + " : " + bundle3.get(str));
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        SdkLog.Companion.i((String) it.next());
                    }
                }
            }
            startActivityForResult(intent, i8);
        } catch (Throwable th) {
            SdkLog.Companion.e(th);
            ClientError clientError = new ClientError(ClientErrorCause.Unknown, null, 2, 0 == true ? 1 : 0);
            clientError.initCause(th);
            G g8 = G.INSTANCE;
            sendError(clientError);
        }
    }
}
