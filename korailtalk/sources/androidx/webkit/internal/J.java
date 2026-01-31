package androidx.webkit.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class J {
    @Deprecated
    public static int getForceDark(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    public static WebViewRenderProcess getWebViewRenderProcess(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    public static WebViewRenderProcessClient getWebViewRenderProcessClient(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    public static void setForceDark(WebSettings webSettings, int i8) {
        webSettings.setForceDark(i8);
    }

    public static void setWebViewRenderProcessClient(WebView webView, Executor executor, G0.l lVar) {
        webView.setWebViewRenderProcessClient(executor, lVar != null ? new k0(lVar) : null);
    }

    public static boolean terminate(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }

    public static void setWebViewRenderProcessClient(WebView webView, G0.l lVar) {
        webView.setWebViewRenderProcessClient(lVar != null ? new k0(lVar) : null);
    }
}
