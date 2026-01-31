package com.nhn.android.naverlogin.ui;

import Q7.X;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.nhn.android.naverlogin.OAuthLoginDefine;
import com.nhn.android.naverlogin.connection.gen.OAuthQueryGenerator;
import com.nhn.android.naverlogin.data.OAuthLoginBrowserIntentParam;
import com.nhn.android.naverlogin.data.OAuthLoginData;
import com.nhn.android.naverlogin.ui.view.OAuthLoginLayoutNaverAppDownloadBanner;
import com.nhn.android.naverlogin.util.OAuthLoginUiUtil;

/* loaded from: classes.dex */
public class OAuthLoginInAppBrowserActivity extends Activity implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private int f29678a;

    /* renamed from: b, reason: collision with root package name */
    private Context f29679b;

    /* renamed from: c, reason: collision with root package name */
    private OAuthLoginLayoutNaverAppDownloadBanner f29680c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f29681d;

    /* renamed from: e, reason: collision with root package name */
    private WebView f29682e;

    /* renamed from: f, reason: collision with root package name */
    private ProgressBar f29683f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f29684g;

    /* renamed from: h, reason: collision with root package name */
    private LinearLayout f29685h;

    /* renamed from: i, reason: collision with root package name */
    private String f29686i;

    /* renamed from: j, reason: collision with root package name */
    private OAuthLoginData f29687j;

    /* renamed from: l, reason: collision with root package name */
    private String f29689l;
    public String mInOAuthUrl;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29688k = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f29690m = true;

    /* renamed from: n, reason: collision with root package name */
    private boolean f29691n = true;

    /* renamed from: o, reason: collision with root package name */
    final DownloadListener f29692o = new b();

    public class OAuthLoginInAppBrowserOutIntentData {
        public static final String RESULT_CALLBACK = "RESULT_CALLBACK";

        public OAuthLoginInAppBrowserOutIntentData() {
        }
    }

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (OAuthLoginInAppBrowserActivity.this.f29678a == 0) {
                OAuthLoginInAppBrowserActivity oAuthLoginInAppBrowserActivity = OAuthLoginInAppBrowserActivity.this;
                oAuthLoginInAppBrowserActivity.f29678a = oAuthLoginInAppBrowserActivity.f29684g.getHeight();
            }
            if (OAuthLoginInAppBrowserActivity.this.f29678a > OAuthLoginInAppBrowserActivity.this.f29684g.getHeight()) {
                OAuthLoginInAppBrowserActivity.this.f29685h.setVisibility(8);
            } else {
                OAuthLoginInAppBrowserActivity.this.f29685h.setVisibility(0);
            }
        }
    }

    class b implements DownloadListener {
        b() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            try {
                OAuthLoginInAppBrowserActivity.this.startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
                try {
                    intent.setData(Uri.parse(str));
                    OAuthLoginInAppBrowserActivity.this.startActivity(intent);
                } catch (Exception unused) {
                }
            }
        }
    }

    private class c extends WebChromeClient {
        private c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i8) {
            if (OAuthLoginInAppBrowserActivity.this.f29683f != null) {
                OAuthLoginInAppBrowserActivity.this.f29683f.setProgress(i8);
            }
        }

        /* synthetic */ c(OAuthLoginInAppBrowserActivity oAuthLoginInAppBrowserActivity, a aVar) {
            this();
        }
    }

    private class d extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        private String f29697a = "";

        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            super.onFormResubmission(webView, message, message2);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (OAuthLoginInAppBrowserActivity.this.f29683f != null) {
                OAuthLoginInAppBrowserActivity.this.f29683f.setVisibility(8);
            }
            webView.clearCache(true);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (!C6.a.isRealVersion()) {
                C6.a.d("OAuthLoginInAppBrowserActivity", "[star] pre url : " + this.f29697a);
                C6.a.d("OAuthLoginInAppBrowserActivity", "[star]     url : " + str);
            }
            if (OAuthWebviewUrlUtil.isFinalUrl(false, this.f29697a, str)) {
                OAuthLoginInAppBrowserActivity.this.f29682e.stopLoading();
                OAuthLoginInAppBrowserActivity.this.finish();
            } else {
                if (OAuthWebviewUrlUtil.returnWhenAuthorizationDone(OAuthLoginInAppBrowserActivity.this.f29679b, this.f29697a, str, OAuthLoginInAppBrowserActivity.this.f29687j)) {
                    OAuthLoginInAppBrowserActivity.this.f29682e.stopLoading();
                    return;
                }
                super.onPageStarted(webView, str, bitmap);
                if (OAuthLoginInAppBrowserActivity.this.f29683f != null) {
                    OAuthLoginInAppBrowserActivity.this.f29683f.setVisibility(0);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i8, String str, String str2) {
            if (OAuthLoginInAppBrowserActivity.this.f29683f != null) {
                OAuthLoginInAppBrowserActivity.this.f29683f.setVisibility(8);
            }
            if (!C6.a.isRealVersion()) {
                C6.a.d("OAuthLoginInAppBrowserActivity", "webview receive error " + i8 + ", " + str + ", " + str2);
            }
            webView.loadUrl(OAuthLoginInAppBrowserActivity.this.mInOAuthUrl);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!C6.a.isRealVersion()) {
                C6.a.d("OAuthLoginInAppBrowserActivity", "[over] pre url : " + this.f29697a);
                C6.a.d("OAuthLoginInAppBrowserActivity", "[over]     url : " + str);
            }
            if (OAuthWebviewUrlUtil.isFinalUrl(true, this.f29697a, str)) {
                OAuthLoginInAppBrowserActivity.this.f29682e.stopLoading();
                OAuthLoginInAppBrowserActivity.this.finish();
                return true;
            }
            if (OAuthWebviewUrlUtil.returnWhenAuthorizationDone(OAuthLoginInAppBrowserActivity.this.f29679b, this.f29697a, str, OAuthLoginInAppBrowserActivity.this.f29687j)) {
                return true;
            }
            if (!OAuthLoginInAppBrowserActivity.this.m(str)) {
                webView.loadUrl(str);
                this.f29697a = str;
                return true;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            OAuthLoginInAppBrowserActivity.this.startActivity(intent);
            return true;
        }
    }

    private void j() {
        this.f29679b = this;
        if (D6.b.isAppExist(this, OAuthLoginDefine.NAVER_PACKAGE_NAME)) {
            this.f29691n = false;
        }
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_KEY_CLIENT_ID);
            String stringExtra2 = getIntent().getStringExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_KEY_CALLBACK_URL);
            String stringExtra3 = getIntent().getStringExtra("state");
            String localeString = D6.b.getBaseInstance().getLocaleString(this.f29679b);
            String networkState = com.nhn.android.idp.common.connection.b.getNetworkState(this.f29679b);
            this.f29687j = new OAuthLoginData(stringExtra, null, stringExtra2, stringExtra3);
            if (getIntent().hasExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_OAUTH_URL)) {
                String stringExtra4 = getIntent().getStringExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_OAUTH_URL);
                if (stringExtra4.startsWith(D6.a.COOKIE_DOMAIN_NID)) {
                    this.mInOAuthUrl = stringExtra4;
                }
            } else {
                this.mInOAuthUrl = new OAuthQueryGenerator().generateRequestWebViewAuthorizationUrl(stringExtra, this.f29687j.getInitState(), stringExtra2, localeString, networkState, OAuthLoginDefine.VERSION);
            }
            String stringExtra5 = getIntent().getStringExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_KEY_OAUTH_SDK_VERSION);
            this.f29689l = stringExtra5;
            this.f29690m = OAuthLoginUiUtil.isFixActivityPortrait(stringExtra5);
        }
    }

    private void k(Bundle bundle) {
        if (bundle != null) {
            this.f29688k = bundle.getBoolean("IsLoginActivityStarted");
            WebView webView = this.f29682e;
            if (webView != null) {
                webView.restoreState(bundle);
            }
            this.f29689l = bundle.getString("SdkVersionCalledFrom");
            this.f29690m = bundle.getBoolean("IsFixActivityPortrait");
            this.f29691n = bundle.getBoolean("isVisibleBanner");
            this.mInOAuthUrl = bundle.getString("oauthUrl");
        }
    }

    private void l(Bundle bundle) {
        OAuthLoginLayoutNaverAppDownloadBanner oAuthLoginLayoutNaverAppDownloadBanner;
        requestWindowFeature(1);
        setContentView(E6.c.nlogin_browser_view);
        this.f29684g = (LinearLayout) findViewById(E6.b.wholeView);
        this.f29683f = (ProgressBar) findViewById(E6.b.progressBar);
        WebView webView = (WebView) findViewById(E6.b.webView);
        this.f29682e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f29682e.setVerticalScrollbarOverlay(true);
        this.f29682e.setHorizontalScrollbarOverlay(true);
        this.f29682e.setWebViewClient(new d());
        this.f29682e.setWebChromeClient(new c(this, null));
        this.f29682e.setDownloadListener(this.f29692o);
        this.f29682e.getSettings().setUserAgentString(this.f29682e.getSettings().getUserAgentString() + X.SPACE + D6.b.getUserAgent(this));
        this.f29682e.getSettings().setAppCacheEnabled(false);
        this.f29682e.getSettings().setCacheMode(2);
        ImageView imageView = (ImageView) findViewById(E6.b.webviewEndKey);
        this.f29681d = imageView;
        imageView.setClickable(true);
        this.f29681d.setOnClickListener(this);
        if (OAuthLoginDefine.MARKET_LINK_WORKING && this.f29691n) {
            this.f29680c = (OAuthLoginLayoutNaverAppDownloadBanner) findViewById(E6.b.app_download_banner);
        }
        if (OAuthLoginDefine.MARKET_LINK_WORKING && (oAuthLoginLayoutNaverAppDownloadBanner = this.f29680c) != null && this.f29691n) {
            oAuthLoginLayoutNaverAppDownloadBanner.setVisibility(0);
        }
        this.f29685h = (LinearLayout) findViewById(E6.b.webviewNaviBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(String str) {
        if (str.length() > 0 && !str.contentEquals("about:blank")) {
            return str.startsWith(D6.a.COOKIE_DOMAIN_NID) ? str.startsWith("https://nid.naver.com/mobile/user/help/idInquiry.nhn") || str.startsWith("https://nid.naver.com/mobile/user/help/pwInquiry.nhn") || str.startsWith("https://nid.naver.com/user/mobile_join.nhn") : (str.startsWith("https://nid.naver.com/nidlogin.logout") || str.startsWith("http://nid.naver.com/nidlogin.logout") || str.contains("/sso/logout.nhn") || str.contains("/sso/cross-domain.nhn") || str.contains("/sso/finalize.nhn") || str.startsWith("http://cc.naver.com") || str.startsWith("http://cr.naver.com") || str.startsWith("https://cert.vno.co.kr") || str.startsWith("https://ipin.ok-name.co.kr") || str.startsWith("https://ipin.siren24.com")) ? false : true;
        }
        return false;
    }

    private void n() {
        this.f29684g.getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    private void o() {
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_KEY_AGREE_FORM_URL);
            if (!TextUtils.isEmpty(stringExtra)) {
                this.mInOAuthUrl = stringExtra;
            }
            this.f29686i = getIntent().getStringExtra(OAuthLoginBrowserIntentParam.INTENT_PARAM_KEY_AGREE_FORM_CONTENT);
        }
        if (TextUtils.isEmpty(this.f29686i)) {
            if (!C6.a.isRealVersion()) {
                C6.a.d("OAuthLoginInAppBrowserActivity", "webview url -> " + this.mInOAuthUrl);
            }
            this.f29682e.loadUrl(this.mInOAuthUrl);
            return;
        }
        if (!C6.a.isRealVersion()) {
            C6.a.d("OAuthLoginInAppBrowserActivity", "webview url -> " + this.mInOAuthUrl);
            C6.a.d("OAuthLoginInAppBrowserActivity", "webview content -> " + this.f29686i);
        }
        this.f29682e.loadDataWithBaseURL(this.mInOAuthUrl, this.f29686i, "text/html", null, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f29681d) {
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!C6.a.isRealVersion()) {
            StringBuilder sb = new StringBuilder();
            sb.append("screen orientation = ");
            sb.append(configuration.orientation == 2 ? "landscape" : "portrait");
            C6.a.d("OAuthLoginInAppBrowserActivity", sb.toString());
        }
        this.f29678a = 0;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j();
        k(bundle);
        l(bundle);
        if (!C6.a.isRealVersion()) {
            C6.a.d("OAuthLoginInAppBrowserActivity", "webview onCreate() fix:" + this.f29690m);
        }
        if (this.f29690m) {
            setRequestedOrientation(1);
        }
        n();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!C6.a.isRealVersion()) {
            C6.a.d("OAuthLoginInAppBrowserActivity", "webview onDestroy()");
        }
        WebView webView = this.f29682e;
        if (webView != null) {
            webView.stopLoading();
            LinearLayout linearLayout = this.f29684g;
            if (linearLayout != null) {
                linearLayout.removeView(this.f29682e);
            }
            this.f29682e.removeAllViews();
            this.f29682e.destroy();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        WebView webView = this.f29682e;
        if (webView != null) {
            webView.onPause();
        }
        if (C6.a.isRealVersion()) {
            return;
        }
        C6.a.d("OAuthLoginInAppBrowserActivity", "webview onPause()");
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        k(bundle);
        if (C6.a.isRealVersion()) {
            return;
        }
        C6.a.d("OAuthLoginInAppBrowserActivity", "webview onRestoreInstanceState() first:" + this.f29688k + ", sdk:" + this.f29689l + ", fix:" + this.f29690m);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        WebView webView = this.f29682e;
        if (webView != null) {
            webView.resumeTimers();
            this.f29682e.onResume();
        }
        if (!this.f29688k) {
            if (!C6.a.isRealVersion()) {
                C6.a.d("OAuthLoginInAppBrowserActivity", "webview onResume() first");
            }
            this.f29688k = true;
            o();
        }
        if (C6.a.isRealVersion()) {
            return;
        }
        C6.a.d("OAuthLoginInAppBrowserActivity", "webview onResume()");
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        OAuthLoginLayoutNaverAppDownloadBanner oAuthLoginLayoutNaverAppDownloadBanner;
        super.onSaveInstanceState(bundle);
        if (!C6.a.isRealVersion()) {
            C6.a.d("OAuthLoginInAppBrowserActivity", "webview onSaveInstanceState()");
        }
        bundle.putBoolean("IsLoginActivityStarted", this.f29688k);
        WebView webView = this.f29682e;
        if (webView != null) {
            webView.saveState(bundle);
        }
        bundle.putString("SdkVersionCalledFrom", this.f29689l);
        bundle.putBoolean("IsFixActivityPortrait", this.f29690m);
        bundle.putString("oauthUrl", this.mInOAuthUrl);
        if (this.f29691n && (oAuthLoginLayoutNaverAppDownloadBanner = this.f29680c) != null && oAuthLoginLayoutNaverAppDownloadBanner.getVisibility() == 0) {
            bundle.putBoolean("isVisibleBanner", true);
        } else {
            bundle.putBoolean("isVisibleBanner", false);
        }
    }
}
