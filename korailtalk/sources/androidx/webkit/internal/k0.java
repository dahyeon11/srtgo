package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* loaded from: classes.dex */
public class k0 extends WebViewRenderProcessClient {

    /* renamed from: a, reason: collision with root package name */
    private G0.l f11084a;

    public k0(G0.l lVar) {
        this.f11084a = lVar;
    }

    public G0.l getFrameworkRenderProcessClient() {
        return this.f11084a;
    }

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f11084a.onRenderProcessResponsive(webView, m0.forFrameworkObject(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f11084a.onRenderProcessUnresponsive(webView, m0.forFrameworkObject(webViewRenderProcess));
    }
}
