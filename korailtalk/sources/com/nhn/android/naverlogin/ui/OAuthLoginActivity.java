package com.nhn.android.naverlogin.ui;

import E6.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginDefine;
import com.nhn.android.naverlogin.connection.OAuthLoginConnection;
import com.nhn.android.naverlogin.data.OAuthErrorCode;
import com.nhn.android.naverlogin.data.OAuthIntent;
import com.nhn.android.naverlogin.data.OAuthLoginBrowserIntentParam;
import com.nhn.android.naverlogin.data.OAuthLoginData;
import com.nhn.android.naverlogin.data.OAuthLoginPreferenceManager;
import com.nhn.android.naverlogin.data.OAuthResponse;
import com.nhn.android.naverlogin.util.CustomTabsListener;
import com.nhn.android.naverlogin.util.CustomTabsManager;

/* loaded from: classes.dex */
public class OAuthLoginActivity extends Activity {

    /* renamed from: g */
    private static int f29666g = 100;

    /* renamed from: h */
    private static int f29667h = -1;

    /* renamed from: b */
    private Context f29669b;

    /* renamed from: c */
    private OAuthLoginData f29670c;

    /* renamed from: d */
    private String f29671d;

    /* renamed from: a */
    private OAuthLoginDialogMng f29668a = new OAuthLoginDialogMng();

    /* renamed from: e */
    private boolean f29672e = false;

    /* renamed from: f */
    private CustomTabsListener f29673f = new a();

    class a implements CustomTabsListener {
        a() {
        }

        @Override // com.nhn.android.naverlogin.util.CustomTabsListener
        public void onReceive(Intent intent) throws InterruptedException {
            if (intent == null) {
                intent = new Intent();
                OAuthErrorCode oAuthErrorCode = OAuthErrorCode.CLIENT_USER_CANCEL;
                intent.putExtra(OAuthIntent.EXTRA_OAUTH_ERROR_CODE, oAuthErrorCode.getCode());
                intent.putExtra(OAuthIntent.EXTRA_OAUTH_ERROR_DESCRIPTION, oAuthErrorCode.getDesc());
            }
            OAuthLoginActivity.this.onActivityResult(OAuthLoginActivity.f29667h, -1, intent);
        }
    }

    private class b extends AsyncTask {
        private b() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public OAuthResponse doInBackground(Void... voidArr) {
            try {
                return OAuthLoginConnection.requestAccessToken(OAuthLoginActivity.this.f29669b, OAuthLoginActivity.this.f29670c.getClientId(), OAuthLoginActivity.this.f29670c.getClientSecret(), OAuthLoginActivity.this.f29670c.getState(), OAuthLoginActivity.this.f29670c.getCode());
            } catch (Exception unused) {
                return new OAuthResponse(OAuthErrorCode.CLIENT_ERROR_CONNECTION_ERROR);
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(OAuthResponse oAuthResponse) {
            try {
                OAuthLoginActivity.this.f29668a.hideProgressDlg();
            } catch (Exception unused) {
            }
            try {
                Intent intent = new Intent();
                OAuthLoginPreferenceManager oAuthLoginPreferenceManager = new OAuthLoginPreferenceManager(OAuthLoginActivity.this.f29669b);
                if (oAuthResponse.isSuccess()) {
                    oAuthLoginPreferenceManager.setAccessToken(oAuthResponse.getAccessToken());
                    oAuthLoginPreferenceManager.setRefreshToken(oAuthResponse.getRefreshToken());
                    oAuthLoginPreferenceManager.setExpiresAt((System.currentTimeMillis() / 1000) + oAuthResponse.getExpiresIn());
                    oAuthLoginPreferenceManager.setTokenType(oAuthResponse.getTokenType());
                    OAuthErrorCode oAuthErrorCode = OAuthErrorCode.NONE;
                    oAuthLoginPreferenceManager.setLastErrorCode(oAuthErrorCode);
                    oAuthLoginPreferenceManager.setLastErrorDesc(oAuthErrorCode.getDesc());
                    intent.putExtra(OAuthIntent.EXTRA_OAUTH_ACCESS_TOKEN, oAuthResponse.getAccessToken());
                    intent.putExtra(OAuthIntent.EXTRA_OAUTH_REFRESH_TOKEN, oAuthResponse.getRefreshToken());
                    intent.putExtra(OAuthIntent.EXTRA_OAUTH_EXPIRES_IN, oAuthResponse.getExpiresIn());
                    intent.putExtra(OAuthIntent.EXTRA_OAUTH_TOKEN_TYPE, oAuthResponse.getTokenType());
                    OAuthLoginActivity.this.setResult(-1, intent);
                } else {
                    if (oAuthResponse.getErrorCode() == OAuthErrorCode.NONE) {
                        OAuthLoginActivity.this.g(OAuthErrorCode.CLIENT_USER_CANCEL);
                        return;
                    }
                    oAuthLoginPreferenceManager.setLastErrorCode(oAuthResponse.getErrorCode());
                    oAuthLoginPreferenceManager.setLastErrorDesc(oAuthResponse.getErrorDesc());
                    intent.putExtra(OAuthIntent.EXTRA_OAUTH_ERROR_CODE, oAuthResponse.getErrorCode().getCode());
                    intent.putExtra(OAuthIntent.EXTRA_OAUTH_ERROR_DESCRIPTION, oAuthResponse.getErrorDesc());
                    OAuthLoginActivity.this.setResult(0, intent);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            OAuthLoginActivity.this.finish();
            try {
                OAuthLoginActivity.this.k(oAuthResponse.isSuccess());
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            try {
                OAuthLoginActivity.this.f29668a.showProgressDlg(OAuthLoginActivity.this.f29669b, OAuthLoginActivity.this.f29669b.getString(d.naveroauthlogin_string_getting_token), null);
            } catch (Exception unused) {
            }
        }

        /* synthetic */ b(OAuthLoginActivity oAuthLoginActivity, a aVar) {
            this();
        }
    }

    public void g(OAuthErrorCode oAuthErrorCode) throws InterruptedException {
        if (!C6.a.isRealVersion()) {
            C6.a.d("GILSUB", "Login finishWithErrorResult()");
        }
        Intent intent = new Intent();
        OAuthLoginPreferenceManager oAuthLoginPreferenceManager = new OAuthLoginPreferenceManager(this.f29669b);
        oAuthLoginPreferenceManager.setLastErrorCode(oAuthErrorCode);
        oAuthLoginPreferenceManager.setLastErrorDesc(oAuthErrorCode.getDesc());
        intent.putExtra(OAuthIntent.EXTRA_OAUTH_ERROR_CODE, oAuthErrorCode.getCode());
        intent.putExtra(OAuthIntent.EXTRA_OAUTH_ERROR_DESCRIPTION, oAuthErrorCode.getDesc());
        setResult(0, intent);
        finish();
        k(false);
    }

    private boolean h(Bundle bundle) throws InterruptedException {
        this.f29669b = this;
        OAuthLoginPreferenceManager oAuthLoginPreferenceManager = new OAuthLoginPreferenceManager(this.f29669b);
        String clientId = oAuthLoginPreferenceManager.getClientId();
        String clientSecret = oAuthLoginPreferenceManager.getClientSecret();
        String callbackUrl = oAuthLoginPreferenceManager.getCallbackUrl();
        String string = bundle == null ? null : bundle.getString("OAuthLoginData_state");
        this.f29671d = oAuthLoginPreferenceManager.getClientName();
        if (TextUtils.isEmpty(clientId)) {
            g(OAuthErrorCode.CLIENT_ERROR_NO_CLIENTID);
            return false;
        }
        if (TextUtils.isEmpty(clientSecret)) {
            g(OAuthErrorCode.CLIENT_ERROR_NO_CLIENTSECRET);
            return false;
        }
        if (TextUtils.isEmpty(this.f29671d)) {
            g(OAuthErrorCode.CLIENT_ERROR_NO_CLIENTNAME);
            return false;
        }
        if (TextUtils.isEmpty(callbackUrl)) {
            g(OAuthErrorCode.CLIENT_ERROR_NO_CALLBACKURL);
            return false;
        }
        this.f29670c = new OAuthLoginData(clientId, clientSecret, callbackUrl, string);
        return true;
    }

    private Intent i(Class cls, String str, String str2, String str3) {
        Intent intent = cls == null ? new Intent() : new Intent(this, (Class<?>) cls);
        intent.putExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_KEY_CLIENT_ID, str);
        intent.putExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_KEY_CALLBACK_URL, str3);
        intent.putExtra("state", str2);
        intent.putExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_KEY_OAUTH_SDK_VERSION, OAuthLoginDefine.VERSION);
        return intent;
    }

    private Intent j(String str, String str2, String str3) {
        return i(null, str, str2, str3);
    }

    public void k(boolean z8) {
        if (OAuthLogin.mOAuthLoginHandler != null) {
            Message message = new Message();
            message.what = z8 ? 1 : 0;
            OAuthLogin.mOAuthLoginHandler.sendMessage(message);
        }
    }

    private void l() throws InterruptedException {
        OAuthLoginData oAuthLoginData = this.f29670c;
        if (oAuthLoginData == null) {
            g(OAuthErrorCode.CLIENT_ERROR_NO_CLIENTID);
        } else {
            m(oAuthLoginData);
        }
    }

    private void m(OAuthLoginData oAuthLoginData) {
        if (!C6.a.isRealVersion()) {
            C6.a.d("OAuthLoginActivity", "startLoginActivity()");
        }
        if (OAuthLoginDefine.LOGIN_BY_WEBVIEW_ONLY || !(p(oAuthLoginData) || o(oAuthLoginData))) {
            n(oAuthLoginData);
        }
    }

    private void n(OAuthLoginData oAuthLoginData) {
        if (!C6.a.isRealVersion()) {
            C6.a.d("OAuthLoginActivity", "startLoginActivity() with webview");
        }
        startActivityForResult(i(OAuthLoginInAppBrowserActivity.class, oAuthLoginData.getClientId(), oAuthLoginData.getInitState(), oAuthLoginData.getCallbackUrl()), f29666g);
    }

    private boolean o(OAuthLoginData oAuthLoginData) {
        if (!CustomTabsManager.isCustomTabAvailable(this)) {
            return false;
        }
        new CustomTabsManager(this).setCustomTabListener(this.f29673f);
        Intent intentI = i(OAuthCustomTabActivity.class, oAuthLoginData.getClientId(), oAuthLoginData.getInitState(), oAuthLoginData.getCallbackUrl());
        intentI.addFlags(65536);
        startActivityForResult(intentI, f29667h);
        return true;
    }

    private boolean p(OAuthLoginData oAuthLoginData) {
        try {
            Intent intentJ = j(oAuthLoginData.getClientId(), oAuthLoginData.getInitState(), oAuthLoginData.getCallbackUrl());
            intentJ.putExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_KEY_APP_NAME, this.f29671d);
            if (!D6.b.isIntentFilterExist(this.f29669b, OAuthLoginDefine.NAVER_PACKAGE_NAME, OAuthLoginDefine.ACTION_OAUTH_LOGIN)) {
                return false;
            }
            if (!C6.a.isRealVersion()) {
                C6.a.d("OAuthLoginActivity", "startLoginActivity() with naapp");
            }
            intentJ.setPackage(OAuthLoginDefine.NAVER_PACKAGE_NAME);
            intentJ.setAction(OAuthLoginDefine.ACTION_OAUTH_LOGIN);
            startActivityForResult(intentJ, f29666g);
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) throws InterruptedException {
        super.onActivityResult(i8, i9, intent);
        if (i8 == f29667h && i9 == 0) {
            C6.a.d("OAuthLoginActivity", "activity call by customtab");
            return;
        }
        if (intent == null) {
            g(OAuthErrorCode.CLIENT_USER_CANCEL);
            return;
        }
        String stringExtra = intent.getStringExtra(OAuthIntent.EXTRA_OAUTH_STATE);
        String stringExtra2 = intent.getStringExtra(OAuthIntent.EXTRA_OAUTH_CODE);
        String stringExtra3 = intent.getStringExtra(OAuthIntent.EXTRA_OAUTH_ERROR_CODE);
        String stringExtra4 = intent.getStringExtra(OAuthIntent.EXTRA_OAUTH_ERROR_DESCRIPTION);
        this.f29670c.setMiddleResult(stringExtra2, stringExtra, stringExtra3, stringExtra4);
        if (!C6.a.isRealVersion()) {
            C6.a.d("GILSUB", "Login onActivityResult()");
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            new b(this, null).execute(new Void[0]);
            return;
        }
        OAuthLoginPreferenceManager oAuthLoginPreferenceManager = new OAuthLoginPreferenceManager(this.f29669b);
        oAuthLoginPreferenceManager.setLastErrorCode(OAuthErrorCode.fromString(stringExtra3));
        oAuthLoginPreferenceManager.setLastErrorDesc(stringExtra4);
        setResult(0, intent);
        finish();
        k(false);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws InterruptedException {
        super.onCreate(bundle);
        if (!C6.a.isRealVersion()) {
            C6.a.d("OAuthLoginActivity", "onCreate()");
        }
        if (h(bundle)) {
            if (bundle != null) {
                this.f29672e = bundle.getBoolean("IsLoginActivityStarted");
            }
            if (this.f29672e) {
                return;
            }
            this.f29672e = true;
            if (!C6.a.isRealVersion()) {
                C6.a.d("OAuthLoginActivity", "onCreate() first");
            }
            l();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (C6.a.isRealVersion()) {
            return;
        }
        C6.a.d("OAuthLoginActivity", "onPause()");
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (!C6.a.isRealVersion()) {
            C6.a.d("OAuthLoginActivity", "onRestoreInstanceState()");
        }
        if (bundle != null) {
            this.f29672e = bundle.getBoolean("IsLoginActivityStarted");
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (C6.a.isRealVersion()) {
            return;
        }
        C6.a.d("OAuthLoginActivity", "onResume()");
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!C6.a.isRealVersion()) {
            C6.a.d("OAuthLoginActivity", "Login onSaveInstanceState()");
        }
        bundle.putBoolean("IsLoginActivityStarted", this.f29672e);
        bundle.putString("OAuthLoginData_state", this.f29670c.getInitState());
    }
}
