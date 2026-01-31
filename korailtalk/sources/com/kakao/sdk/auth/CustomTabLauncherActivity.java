package com.kakao.sdk.auth;

import R6.G;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.appcompat.app.e;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.KakaoSdkError;
import com.kakao.sdk.common.util.KakaoCustomTabsClient;
import com.kakao.sdk.common.util.SdkLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class CustomTabLauncherActivity extends e {
    private ServiceConnection customTabsConnection;
    private boolean customTabsOpened;
    private Uri fullUri;
    private Handler internalHandler;
    private ResultReceiver resultReceiver;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-1, reason: not valid java name */
    public static final boolean m398loadData$lambda1(CustomTabLauncherActivity this$0, Message it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        SdkLog.Companion.i("handle delay message");
        this$0.sendError(new ClientError(ClientErrorCause.Cancelled, null, 2, 0 == true ? 1 : 0));
        return true;
    }

    private final void openBrowserWithoutBinding(Uri uri) {
        try {
            KakaoCustomTabsClient.INSTANCE.open(this, uri);
        } catch (ActivityNotFoundException e8) {
            SdkLog.Companion.w(e8);
            sendError(new ClientError(ClientErrorCause.NotSupported, "No browser has been installed on a device."));
        }
    }

    private final void openChromeCustomTab(Uri uri) {
        SdkLog.Companion companion = SdkLog.Companion;
        companion.i(Intrinsics.stringPlus("Authorize Uri: ", uri));
        try {
            ServiceConnection serviceConnectionOpenWithDefault = KakaoCustomTabsClient.INSTANCE.openWithDefault(this, uri);
            this.customTabsConnection = serviceConnectionOpenWithDefault;
            if (serviceConnectionOpenWithDefault == null) {
                companion.i("try to open chrome without service binding");
                openBrowserWithoutBinding(uri);
            }
        } catch (UnsupportedOperationException e8) {
            SdkLog.Companion.w(e8);
            openBrowserWithoutBinding(uri);
        }
    }

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

    private final void sendOK(Uri uri) {
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            if (resultReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resultReceiver");
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(Constants.KEY_URL, uri);
            G g8 = G.INSTANCE;
            resultReceiver.send(-1, bundle);
        }
        finish();
    }

    public void loadData(Intent intent) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && (bundle = extras.getBundle(Constants.KEY_BUNDLE)) != null) {
                Parcelable parcelable = bundle.getParcelable(Constants.KEY_RESULT_RECEIVER);
                if (parcelable == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.os.ResultReceiver");
                }
                this.resultReceiver = (ResultReceiver) parcelable;
                Parcelable parcelable2 = bundle.getParcelable(Constants.KEY_FULL_URI);
                if (parcelable2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.Uri");
                }
                this.fullUri = (Uri) parcelable2;
            }
            this.internalHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.kakao.sdk.auth.a
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return CustomTabLauncherActivity.m398loadData$lambda1(this.f27530a, message);
                }
            });
        } catch (Throwable th) {
            SdkLog.Companion.e(th);
            ClientError clientError = new ClientError(ClientErrorCause.Unknown, null, 2, 0 == true ? 1 : 0);
            clientError.initCause(th);
            G g8 = G.INSTANCE;
            sendError(clientError);
        }
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        loadData(intent);
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ServiceConnection serviceConnection = this.customTabsConnection;
        if (serviceConnection == null) {
            return;
        }
        unbindService(serviceConnection);
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Uri data;
        Handler handler;
        super.onNewIntent(intent);
        SdkLog.Companion.i("onNewIntent");
        setIntent(intent);
        Handler handler2 = this.internalHandler;
        if (Intrinsics.areEqual(handler2 == null ? null : Boolean.valueOf(handler2.hasMessages(0)), Boolean.TRUE) && (handler = this.internalHandler) != null) {
            handler.removeMessages(0);
        }
        this.internalHandler = null;
        if (intent != null && (data = intent.getData()) != null) {
            sendOK(data);
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.customTabsOpened = savedInstanceState.getBoolean(Constants.KEY_CUSTOM_TABS_OPENED, this.customTabsOpened);
    }

    @Override // androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        Handler handler;
        super.onResume();
        if (this.customTabsOpened) {
            SdkLog.Companion.i("trigger delay message");
            Handler handler2 = this.internalHandler;
            if (!Intrinsics.areEqual(handler2 != null ? Boolean.valueOf(handler2.hasMessages(0)) : null, Boolean.FALSE) || (handler = this.internalHandler) == null) {
                return;
            }
            handler.sendEmptyMessageDelayed(0, 100L);
            return;
        }
        this.customTabsOpened = true;
        Uri uri = this.fullUri;
        if (uri == null) {
            sendError(new ClientError(ClientErrorCause.IllegalState, "url has been not initialized."));
        } else if (uri != null) {
            openChromeCustomTab(uri);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("fullUri");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(Constants.KEY_CUSTOM_TABS_OPENED, this.customTabsOpened);
    }
}
