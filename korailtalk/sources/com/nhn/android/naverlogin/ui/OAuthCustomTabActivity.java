package com.nhn.android.naverlogin.ui;

import D6.b;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.fragment.app.ActivityC1010e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import com.kakao.sdk.auth.Constants;
import com.nhn.android.naverlogin.OAuthLoginDefine;
import com.nhn.android.naverlogin.connection.gen.OAuthQueryGenerator;
import com.nhn.android.naverlogin.data.OAuthErrorCode;
import com.nhn.android.naverlogin.data.OAuthIntent;
import com.nhn.android.naverlogin.data.OAuthLoginBrowserIntentParam;
import com.nhn.android.naverlogin.data.OAuthLoginData;
import com.nhn.android.naverlogin.ui.view.CustomTabDialogFragment;
import com.nhn.android.naverlogin.util.CustomTabsManager;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: classes.dex */
public class OAuthCustomTabActivity extends ActivityC1010e {
    public static final String SAVE_CUSTOM_TAB_OPEN = "isCustomTabOpen";
    public static final String TAG = "OAuthCustomTabActivity";

    /* renamed from: a, reason: collision with root package name */
    private boolean f29661a;

    /* renamed from: b, reason: collision with root package name */
    private CustomTabsManager f29662b;

    /* renamed from: c, reason: collision with root package name */
    private d f29663c;

    class a implements CustomTabDialogFragment.OnPackageSelectListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29664a;

        a(String str) {
            this.f29664a = str;
        }

        @Override // com.nhn.android.naverlogin.ui.view.CustomTabDialogFragment.OnPackageSelectListener
        public void onPackageSelect(PackageInfo packageInfo) {
            if (packageInfo != null) {
                OAuthCustomTabActivity.this.f29662b.launchUrl(packageInfo.packageName, this.f29664a);
                return;
            }
            OAuthCustomTabActivity oAuthCustomTabActivity = OAuthCustomTabActivity.this;
            OAuthErrorCode oAuthErrorCode = OAuthErrorCode.CLIENT_USER_CANCEL;
            oAuthCustomTabActivity.w(null, oAuthErrorCode.getCode(), oAuthErrorCode.getDesc());
        }
    }

    private void u() {
        Intent intent = getIntent();
        if (intent != null) {
            C6.a.d(TAG, "read request");
            String stringExtra = intent.getStringExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_KEY_CLIENT_ID);
            String stringExtra2 = intent.getStringExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_KEY_CALLBACK_URL);
            String stringExtra3 = intent.getStringExtra("state");
            v(new OAuthQueryGenerator().generateRequestCustomTabAuthorizationUrl(stringExtra, new OAuthLoginData(stringExtra, null, stringExtra2, stringExtra3).getInitState(), stringExtra2, b.getBaseInstance().getLocaleString(this), com.nhn.android.idp.common.connection.b.getNetworkState(this), OAuthLoginDefine.VERSION));
        }
    }

    private void v(String str) {
        List<PackageInfo> customTabsPackages = CustomTabsManager.getCustomTabsPackages(this);
        if (customTabsPackages.size() == 1) {
            this.f29662b.launchUrl(customTabsPackages.get(0).packageName, str);
            return;
        }
        x xVarBeginTransaction = getSupportFragmentManager().beginTransaction();
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(CustomTabDialogFragment.DIALOG_TAG);
        if (fragmentFindFragmentByTag != null) {
            xVarBeginTransaction.remove(fragmentFindFragmentByTag);
        }
        xVarBeginTransaction.addToBackStack(null);
        CustomTabDialogFragment customTabDialogFragmentNewInstance = CustomTabDialogFragment.newInstance(customTabsPackages);
        customTabDialogFragmentNewInstance.setPackageSelectListener(new a(str));
        customTabDialogFragmentNewInstance.show(xVarBeginTransaction, CustomTabDialogFragment.DIALOG_TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.putExtra(OAuthIntent.EXTRA_OAUTH_STATE, str);
        intent.putExtra(OAuthIntent.EXTRA_OAUTH_ERROR_CODE, str2);
        intent.putExtra(OAuthIntent.EXTRA_OAUTH_ERROR_DESCRIPTION, str3);
        y(intent);
    }

    private void x(String str, String str2, String str3, String str4) {
        Intent intent = new Intent();
        intent.putExtra(OAuthIntent.EXTRA_OAUTH_CODE, str);
        intent.putExtra(OAuthIntent.EXTRA_OAUTH_STATE, str2);
        intent.putExtra(OAuthIntent.EXTRA_OAUTH_ERROR_CODE, str3);
        intent.putExtra(OAuthIntent.EXTRA_OAUTH_ERROR_DESCRIPTION, str4);
        y(intent);
    }

    private void y(Intent intent) {
        intent.setAction(CustomTabsManager.ACTION_NAVER_CUSTOM_TAB);
        this.f29662b.sendCustomTabResult(intent);
        setResult(0);
        finish();
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws UnsupportedEncodingException {
        super.onCreate(bundle);
        if (bundle == null) {
            C6.a.d(TAG, "Open Custom Tab Activity");
            this.f29662b = new CustomTabsManager(this);
            u();
        }
        if (bundle == null || !bundle.getBoolean(SAVE_CUSTOM_TAB_OPEN, false)) {
            return;
        }
        onNewIntent(getIntent());
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) throws UnsupportedEncodingException {
        C6.a.d(TAG, "open by Intent url");
        String stringExtra = intent.getStringExtra(Constants.CODE);
        String stringExtra2 = intent.getStringExtra("state");
        String stringExtra3 = intent.getStringExtra("error");
        String decodedString = OAuthWebviewUrlUtil.getDecodedString(intent.getStringExtra(Constants.ERROR_DESCRIPTION));
        if (stringExtra != null || stringExtra3 != null) {
            x(stringExtra, stringExtra2, stringExtra3, decodedString);
        } else {
            OAuthErrorCode oAuthErrorCode = OAuthErrorCode.CLIENT_ERROR_PARSING_FAIL;
            w(stringExtra2, oAuthErrorCode.getCode(), oAuthErrorCode.getDesc());
        }
    }

    @Override // androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPause() {
        super.onPause();
        d dVar = this.f29663c;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C6.a.d(TAG, "load custom tab open state");
        this.f29661a = bundle.getBoolean(SAVE_CUSTOM_TAB_OPEN, false);
    }

    @Override // androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f29661a) {
            OAuthErrorCode oAuthErrorCode = OAuthErrorCode.CLIENT_USER_CANCEL;
            w(null, oAuthErrorCode.getCode(), oAuthErrorCode.getDesc());
        }
        this.f29661a = true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C6.a.d(TAG, "save custom tab open state");
        bundle.putBoolean(SAVE_CUSTOM_TAB_OPEN, this.f29661a);
        this.f29662b = new CustomTabsManager(this);
    }
}
