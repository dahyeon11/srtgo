package com.korail.talk.ui.web;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Button;
import com.korail.talk.ui.web.BaseWebViewActivity;
import java.io.File;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import r4.C6174a;
import z4.C6630d;
import z4.C6633g;
import z4.C6639m;

/* loaded from: classes.dex */
public class ExtraProductWebViewActivity extends BaseWebViewActivity implements View.OnClickListener {

    /* renamed from: t, reason: collision with root package name */
    private boolean f29270t;

    /* renamed from: u, reason: collision with root package name */
    private Button f29271u;

    private class b extends BaseWebViewActivity.e {
        private b() {
            super();
        }

        @Override // com.korail.talk.ui.web.BaseWebViewActivity.e, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i8, String str, String str2) {
            super.onReceivedError(webView, i8, str, str2);
        }

        @Override // com.korail.talk.ui.web.BaseWebViewActivity.e, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceError.getErrorCode() == -2 && !C6630d.isNull(ExtraProductWebViewActivity.this.f29271u)) {
                ExtraProductWebViewActivity.this.f29271u.setVisibility(8);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    private void S0() {
        boolean booleanExtra = getIntent().getBooleanExtra("IS_SCREEN_CAPTURE", false);
        this.f29270t = booleanExtra;
        if (booleanExtra) {
            WebView.enableSlowWholeDocumentDraw();
        }
    }

    private void T0() {
        if (this.f29271u.getVisibility() == 0) {
            this.f29271u.setOnClickListener(this);
        }
    }

    private void U0() {
        n0(false);
        Button button = (Button) findViewById(AbstractC5955f.btn_send_email);
        this.f29271u = button;
        button.setVisibility(this.f29270t ? 0 : 8);
    }

    private void V0() {
        P0(new BaseWebViewActivity.c(), false);
        Q0(new b());
        O0(new BaseWebViewActivity.d());
        M0();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        if (AbstractC5955f.btn_send_email != view.getId()) {
            super.onClick(view);
            return;
        }
        File file = C6639m.getFile(getApplicationContext(), C6174a.VOLATILITY_FOLDER, C6174a.RECEIPT_IMAGE_NM);
        if (C6630d.isNotNull(file)) {
            C6633g.productReceiptSaveToBitmapFile(this.f29256o, file);
            C6630d.sendReceiptMail(K(), file, "코레일톡 제휴상품 영수증", "코레일톡에서 구매한 제휴상품 영수증입니다.");
        }
    }

    @Override // com.korail.talk.ui.web.BaseWebViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            S0();
            setContentView(AbstractC5957h.activity_extra_product_webview);
            U0();
            T0();
            V0();
        }
    }
}
