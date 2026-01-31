package a5;

import Q7.X;
import a5.c;
import ai.maum.m2u.cdk.CdkNative;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.lifecycle.J;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import n4.AbstractC5959j;
import n4.C5950a;
import p4.C6054a;
import r4.g;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class c extends J {

    /* renamed from: d, reason: collision with root package name */
    private Bundle f5962d;

    /* renamed from: e, reason: collision with root package name */
    private CdkNative f5963e;

    /* renamed from: f, reason: collision with root package name */
    private WebView f5964f;

    /* renamed from: g, reason: collision with root package name */
    private u4.c f5965g;

    /* renamed from: h, reason: collision with root package name */
    private Activity f5966h;

    /* renamed from: i, reason: collision with root package name */
    protected final String f5967i = g.PUSH_APPTYPE;

    /* renamed from: j, reason: collision with root package name */
    private final t f5968j = new t();

    class a extends WebChromeClient {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(JsResult jsResult, DialogInterface dialogInterface, int i8) {
            if (100 == i8) {
                jsResult.cancel();
            } else if (102 == i8) {
                jsResult.confirm();
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            C6637k.getCDialog(c.this.f5966h, 1001, 0, c.this.f5966h.getString(AbstractC5959j.dialog_title)).setContent(str2).setButtonListener(new DialogInterface.OnClickListener() { // from class: a5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    jsResult.confirm();
                }
            }).showDialog();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
            C6637k.getCDialog(c.this.f5966h, 1002, 0, c.this.f5966h.getString(AbstractC5959j.dialog_title)).setContent(str2).setButtonListener(new DialogInterface.OnClickListener() { // from class: a5.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    c.a.d(jsResult, dialogInterface, i8);
                }
            }).showDialog();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            permissionRequest.grant(permissionRequest.getResources());
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (N.isNull(str)) {
                return;
            }
            c.this.f5968j.setValue(str);
        }
    }

    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i8, String str, String str2) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.indexOf("tel:") <= -1) {
                return false;
            }
            c.this.f5966h.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            c.this.k();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }
    }

    /* renamed from: a5.c$c, reason: collision with other inner class name */
    protected class C0096c {
        protected C0096c() {
        }

        @JavascriptInterface
        public void appBack() {
            if (c.this.f5964f != null) {
                if (c.this.f5964f.canGoBack()) {
                    c.this.f5964f.goBack();
                } else {
                    c.this.f5966h.finish();
                }
            }
        }

        @JavascriptInterface
        public void showToast(String str) {
            Toast.makeText(c.this.f5966h, str, 0).show();
        }

        @JavascriptInterface
        public void windowClose() {
            c.this.f5966h.finish();
        }
    }

    private void j() {
        WebView webView = this.f5964f;
        if (webView != null) {
            webView.clearHistory();
            this.f5964f.clearCache(true);
            this.f5964f.clearView();
            this.f5964f.loadUrl("about:blank");
            this.f5964f.removeAllViews();
            this.f5964f.destroy();
            this.f5964f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        u4.c cVar = this.f5965g;
        if (cVar == null || !cVar.isShowing()) {
            return;
        }
        this.f5965g.dismiss();
    }

    private void l() {
        WebView webView = this.f5964f;
        if (webView == null || this.f5966h == null) {
            return;
        }
        webView.setWebChromeClient(new a());
        this.f5964f.addJavascriptInterface(new C0096c(), g.PUSH_APPTYPE);
        if (C6054a.IS_DEBUG_LOG) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        this.f5964f.getSettings().setDomStorageEnabled(true);
        this.f5964f.getSettings().setJavaScriptEnabled(true);
        this.f5964f.getSettings().setTextZoom(100);
        this.f5964f.getSettings().setAllowFileAccess(true);
        this.f5964f.getSettings().setAllowContentAccess(true);
        this.f5964f.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f5964f.getSettings().setSupportMultipleWindows(false);
        this.f5964f.getSettings().setUserAgentString(this.f5964f.getSettings().getUserAgentString() + X.SPACE + g.PUSH_APPTYPE + " AppVersion/" + C5950a.VERSION_NAME);
        this.f5964f.getSettings().setSupportMultipleWindows(false);
        this.f5964f.setWebViewClient(new b());
    }

    @Override // androidx.lifecycle.J
    protected void d() {
        j();
        CdkNative cdkNative = this.f5963e;
        if (cdkNative != null) {
            cdkNative.close();
            this.f5963e = null;
        }
        super.d();
    }

    public CdkNative getCdkNative() {
        return this.f5963e;
    }

    public Bundle getState() {
        return this.f5962d;
    }

    public LiveData getTextData() {
        return this.f5968j;
    }

    public WebView getWebView() {
        return this.f5964f;
    }

    public void saveState(Bundle bundle) {
        this.f5962d = bundle;
    }

    public void setCdkNative(CdkNative cdkNative) {
        this.f5963e = cdkNative;
    }

    public void setWebView(WebView webView, Activity activity) {
        this.f5964f = webView;
        this.f5966h = activity;
        l();
    }
}
