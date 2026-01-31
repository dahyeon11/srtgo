package com.korail.talk.ui.web;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.ui.web.BaseWebViewActivity;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.D;
import z4.G;
import z4.t;

/* loaded from: classes.dex */
public class EasyPayWebViewActivity extends BaseWebViewActivity {

    private class b extends BaseWebViewActivity.e {
        private b() {
            super();
        }

        @Override // com.korail.talk.ui.web.BaseWebViewActivity.e, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            t.e("scheme = " + scheme + ", url = " + str);
            if (zShouldOverrideUrlLoading) {
                if (D.isApproveScheme(EasyPayWebViewActivity.this.getApplicationContext(), uri)) {
                    if (!"tossauto".equals(uri.getQueryParameter("type"))) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.addFlags(603979776);
                        intent.setData(Uri.parse(str));
                        EasyPayWebViewActivity.this.startActivity(intent);
                    } else if (BaseResponse.SUCCESS.equals(uri.getQueryParameter("strResult"))) {
                        EasyPayWebViewActivity.this.setResult(-1);
                        EasyPayWebViewActivity.this.finish();
                    } else if (BaseResponse.FAIL.equals(uri.getQueryParameter("strResult"))) {
                        EasyPayWebViewActivity.this.setResult(0);
                        EasyPayWebViewActivity.this.finish();
                    }
                } else if (EasyPayWebViewActivity.this.getString(AbstractC5959j.naver_scheme).equalsIgnoreCase(scheme)) {
                    G.playApp(EasyPayWebViewActivity.this.K(), str);
                }
            }
            return zShouldOverrideUrlLoading;
        }
    }

    private void S0() {
        l0();
    }

    private void T0() {
        P0(new BaseWebViewActivity.c(), false);
        Q0(new b());
        O0(new BaseWebViewActivity.d());
        this.f29256o.getSettings().setMixedContentMode(0);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(this.f29256o, true);
        t.d("url : " + getIntent().getStringExtra("WEB_GET_URL"));
        this.f29256o.loadUrl(getIntent().getStringExtra("WEB_GET_URL"));
    }

    @Override // com.korail.talk.ui.web.BaseWebViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_easypay_webview);
        if (C6630d.isNull(bundle)) {
            S0();
            T0();
        }
    }
}
