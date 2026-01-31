package com.nhn.android.naverlogin;

import E6.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.nhn.android.idp.common.connection.b;
import com.nhn.android.idp.common.connection.c;
import com.nhn.android.naverlogin.connection.OAuthLoginConnection;
import com.nhn.android.naverlogin.data.OAuthErrorCode;
import com.nhn.android.naverlogin.data.OAuthLoginPreferenceManager;
import com.nhn.android.naverlogin.data.OAuthLoginState;
import com.nhn.android.naverlogin.data.OAuthResponse;
import com.nhn.android.naverlogin.ui.OAuthLoginActivity;
import com.nhn.android.naverlogin.ui.OAuthLoginDialogMng;

/* loaded from: classes.dex */
public class OAuthLogin {

    /* renamed from: a, reason: collision with root package name */
    private static OAuthLogin f29624a;
    public static OAuthLoginHandler mOAuthLoginHandler;

    class a implements b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f29625a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OAuthLoginHandler f29626b;

        a(Activity activity, OAuthLoginHandler oAuthLoginHandler) {
            this.f29625a = activity;
            this.f29626b = oAuthLoginHandler;
        }

        @Override // com.nhn.android.idp.common.connection.b.d
        public void onResult(boolean z8) {
            if (z8) {
                OAuthLogin.this.startOauthLoginActivity(this.f29625a, this.f29626b);
            }
        }
    }

    private class b extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private Context f29628a;

        /* renamed from: b, reason: collision with root package name */
        private OAuthLoginDialogMng f29629b = new OAuthLoginDialogMng();

        b(Context context) {
            this.f29628a = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            return OAuthLogin.this.refreshAccessToken(this.f29628a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            try {
                this.f29629b.hideProgressDlg();
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                OAuthLogin.mOAuthLoginHandler.run(true);
            } else {
                this.f29628a.startActivity(new Intent(this.f29628a, (Class<?>) OAuthLoginActivity.class));
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            OAuthLoginDialogMng oAuthLoginDialogMng = this.f29629b;
            Context context = this.f29628a;
            oAuthLoginDialogMng.showProgressDlg(context, context.getString(d.naveroauthlogin_string_getting_token), null);
        }
    }

    private OAuthLogin() {
    }

    private boolean a(Context context) {
        if (context == null) {
            C6.a.i("OAuthLogin", "context is null");
            return false;
        }
        OAuthLoginPreferenceManager oAuthLoginPreferenceManager = new OAuthLoginPreferenceManager(context);
        if (TextUtils.isEmpty(oAuthLoginPreferenceManager.getClientId())) {
            C6.a.i("OAuthLogin", "CliendId is null");
            return false;
        }
        if (!TextUtils.isEmpty(oAuthLoginPreferenceManager.getClientSecret())) {
            return true;
        }
        C6.a.i("OAuthLogin", "CliendSecret is null");
        return false;
    }

    public static OAuthLogin getInstance() {
        if (f29624a == null) {
            f29624a = new OAuthLogin();
        }
        return f29624a;
    }

    public static String getVersion() {
        return OAuthLoginDefine.VERSION;
    }

    public void disableSimpleLoginActivity() {
        OAuthLoginDefine.LOGIN_BY_WEBVIEW_ONLY = true;
    }

    public String getAccessToken(Context context) {
        String accessToken = new OAuthLoginPreferenceManager(context).getAccessToken();
        if (TextUtils.isEmpty(accessToken)) {
            return null;
        }
        return accessToken;
    }

    public long getExpiresAt(Context context) {
        return new OAuthLoginPreferenceManager(context).getExpiresAt();
    }

    public OAuthErrorCode getLastErrorCode(Context context) {
        return new OAuthLoginPreferenceManager(context).getLastErrorCode();
    }

    public String getLastErrorDesc(Context context) {
        return new OAuthLoginPreferenceManager(context).getLastErrorDesc();
    }

    public String getRefreshToken(Context context) {
        String refreshToken = new OAuthLoginPreferenceManager(context).getRefreshToken();
        if (TextUtils.isEmpty(refreshToken)) {
            return null;
        }
        return refreshToken;
    }

    public OAuthLoginState getState(Context context) {
        if (!a(context)) {
            return OAuthLoginState.NEED_INIT;
        }
        OAuthLoginPreferenceManager oAuthLoginPreferenceManager = new OAuthLoginPreferenceManager(context);
        return TextUtils.isEmpty(oAuthLoginPreferenceManager.getAccessToken()) ? TextUtils.isEmpty(oAuthLoginPreferenceManager.getRefreshToken()) ? OAuthLoginState.NEED_LOGIN : OAuthLoginState.NEED_REFRESH_TOKEN : OAuthLoginState.OK;
    }

    public String getTokenType(Context context) {
        String tokenType = new OAuthLoginPreferenceManager(context).getTokenType();
        if (TextUtils.isEmpty(tokenType)) {
            return null;
        }
        return tokenType;
    }

    public void init(Context context, String str, String str2, String str3) throws InterruptedException {
        init(context, str, str2, str3, D6.b.getPackageName(context));
    }

    public void logout(Context context) throws InterruptedException {
        OAuthLoginPreferenceManager oAuthLoginPreferenceManager = new OAuthLoginPreferenceManager(context);
        oAuthLoginPreferenceManager.setAccessToken("");
        oAuthLoginPreferenceManager.setRefreshToken("");
        oAuthLoginPreferenceManager.setLastErrorCode(OAuthErrorCode.NONE);
        oAuthLoginPreferenceManager.setLastErrorDesc("");
    }

    public boolean logoutAndDeleteToken(Context context) throws InterruptedException {
        OAuthLoginPreferenceManager oAuthLoginPreferenceManager = new OAuthLoginPreferenceManager(context);
        String clientId = oAuthLoginPreferenceManager.getClientId();
        String clientSecret = oAuthLoginPreferenceManager.getClientSecret();
        String accessToken = oAuthLoginPreferenceManager.getAccessToken();
        logout(context);
        try {
            OAuthResponse oAuthResponseDeleteToken = OAuthLoginConnection.deleteToken(context, clientId, clientSecret, accessToken);
            if ("success".equalsIgnoreCase(oAuthResponseDeleteToken.getResultValue())) {
                return true;
            }
            oAuthLoginPreferenceManager.setLastErrorCode(oAuthResponseDeleteToken.getErrorCode());
            oAuthLoginPreferenceManager.setLastErrorDesc(oAuthResponseDeleteToken.getErrorDesc());
            return false;
        } catch (Exception e8) {
            e8.printStackTrace();
            oAuthLoginPreferenceManager.setLastErrorCode(OAuthErrorCode.ERROR_NO_CATAGORIZED);
            oAuthLoginPreferenceManager.setLastErrorDesc(e8.getMessage());
            return false;
        }
    }

    public String refreshAccessToken(Context context) throws InterruptedException {
        OAuthLoginPreferenceManager oAuthLoginPreferenceManager = new OAuthLoginPreferenceManager(context);
        OAuthResponse oAuthResponseRequestRefreshToken = OAuthLoginConnection.requestRefreshToken(context, oAuthLoginPreferenceManager.getClientId(), oAuthLoginPreferenceManager.getClientSecret(), oAuthLoginPreferenceManager.getRefreshToken());
        String accessToken = oAuthResponseRequestRefreshToken.getAccessToken();
        if (TextUtils.isEmpty(accessToken)) {
            return null;
        }
        oAuthLoginPreferenceManager.setAccessToken(oAuthResponseRequestRefreshToken.getAccessToken());
        oAuthLoginPreferenceManager.setExpiresAt((System.currentTimeMillis() / 1000) + oAuthResponseRequestRefreshToken.getExpiresIn());
        return accessToken;
    }

    public String requestApi(Context context, String str, String str2) {
        String str3 = "bearer " + str;
        if (!C6.a.isRealVersion()) {
            C6.a.d("OAuthLogin", "at:" + str + ", url:" + str2);
            StringBuilder sb = new StringBuilder();
            sb.append("header:");
            sb.append(str3);
            C6.a.d("OAuthLogin", sb.toString());
        }
        c cVarRequest = com.nhn.android.idp.common.connection.a.request(context, str2, (String) null, (String) null, str3);
        if (!C6.a.isRealVersion()) {
            C6.a.d("OAuthLogin", "res.statuscode" + cVarRequest.mStatusCode);
            C6.a.d("OAuthLogin", "res.content" + cVarRequest.mContent);
        }
        if (cVarRequest == null) {
            return null;
        }
        return cVarRequest.mContent;
    }

    public void setMarketLinkWorking(boolean z8) {
        OAuthLoginDefine.MARKET_LINK_WORKING = z8;
    }

    public void showDevelopersLog(boolean z8) {
        C6.a.setAsRealVersion(z8);
    }

    public void startOauthLoginActivity(Activity activity, OAuthLoginHandler oAuthLoginHandler) {
        if (com.nhn.android.idp.common.connection.b.checkConnectivity(activity, true, new a(activity, oAuthLoginHandler))) {
            mOAuthLoginHandler = oAuthLoginHandler;
            if (TextUtils.isEmpty(getRefreshToken(activity))) {
                activity.startActivity(new Intent(activity, (Class<?>) OAuthLoginActivity.class));
            } else {
                new b(activity).execute(new Void[0]);
            }
        }
    }

    @Deprecated
    public void init(Context context, String str, String str2, String str3, String str4) throws InterruptedException {
        OAuthLoginPreferenceManager oAuthLoginPreferenceManager = new OAuthLoginPreferenceManager(context);
        oAuthLoginPreferenceManager.setClientId(str);
        oAuthLoginPreferenceManager.setClientSecret(str2);
        oAuthLoginPreferenceManager.setClientName(str3);
        oAuthLoginPreferenceManager.setCallbackUrl(str4);
        oAuthLoginPreferenceManager.setLastErrorCode(OAuthErrorCode.NONE);
        oAuthLoginPreferenceManager.setLastErrorDesc("");
        C6.a.setTagPrefix("NaverOAuthLogin|" + D6.b.getPackageName(context) + "|");
        CookieSyncManager.createInstance(context);
    }
}
