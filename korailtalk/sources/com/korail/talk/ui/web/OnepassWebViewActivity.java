package com.korail.talk.ui.web;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.kakao.sdk.common.Constants;
import com.korail.talk.ui.web.BaseWebViewActivity;
import java.net.URISyntaxException;
import n4.AbstractC5957h;
import n4.AbstractC5960k;
import z4.C6630d;
import z4.G;
import z4.t;
import z4.u;

/* loaded from: classes.dex */
public class OnepassWebViewActivity extends BaseWebViewActivity {

    private class b extends BaseWebViewActivity.d {
        private b() {
            super();
        }

        @Override // com.korail.talk.ui.web.BaseWebViewActivity.d, android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            webView.setVisibility(8);
            webView.destroy();
            super.onCloseWindow(webView);
        }

        @Override // com.korail.talk.ui.web.BaseWebViewActivity.d, android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z8, boolean z9, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new c());
            webView2.setWebChromeClient(OnepassWebViewActivity.this.new b());
            WebSettings settings = webView2.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            Dialog dialog = new Dialog(webView.getContext(), AbstractC5960k.FullScreenDialog);
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            dialog.setContentView(webView2);
            dialog.show();
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    private class c extends BaseWebViewActivity.e {
        private c() {
            super();
        }

        @Override // com.korail.talk.ui.web.BaseWebViewActivity.e, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) throws URISyntaxException {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            t.e("OnePassWeb scheme = " + scheme + ", url = " + str + " , isOnepassScheme = " + u.isOnepassScheme(OnepassWebViewActivity.this.getApplicationContext(), uri));
            if (u.isOnepassScheme(OnepassWebViewActivity.this.getApplicationContext(), uri)) {
                Intent intent = new Intent();
                intent.putExtra("userKey", uri.getQueryParameter("userKey"));
                OnepassWebViewActivity.this.setResult(-1, intent);
                OnepassWebViewActivity.this.finish();
                return true;
            }
            if (!str.contains("kr.go.gfido.m")) {
                if ("http".equals(scheme) || Constants.SCHEME.equals(scheme)) {
                    return false;
                }
                if (!"intent".equals(scheme)) {
                    return true;
                }
                G.playApp(OnepassWebViewActivity.this.K(), str);
                return true;
            }
            try {
                Intent uri2 = Intent.parseUri(str, 1);
                Intent launchIntentForPackage = webView.getContext().getPackageManager().getLaunchIntentForPackage(uri2.getPackage());
                uri2.addFlags(268435456);
                if (launchIntentForPackage != null) {
                    webView.getContext().startActivity(uri2);
                } else {
                    G.moveToGooglePlay(OnepassWebViewActivity.this.K(), uri2.getPackage());
                }
                return true;
            } catch (URISyntaxException e8) {
                t.e(e8.getMessage());
                return true;
            }
        }
    }

    private void T0() {
        l0();
    }

    private void U0() {
        P0(new BaseWebViewActivity.c(), false);
        Q0(new c());
        O0(new b());
        WebSettings settings = this.f29256o.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        Intent intent = new Intent();
        intent.addFlags(603979776);
        setResult(-1, intent);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(this.f29256o, true);
        this.f29256o.loadUrl(getIntent().getStringExtra("WEB_GET_URL"));
    }

    @Override // com.korail.talk.ui.web.BaseWebViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_easypay_webview);
        if (C6630d.isNull(bundle)) {
            T0();
            U0();
        }
    }
}
