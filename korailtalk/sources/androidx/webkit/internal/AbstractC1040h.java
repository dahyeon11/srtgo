package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: androidx.webkit.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1040h {
    public static PackageInfo getCurrentWebViewPackage() {
        return WebView.getCurrentWebViewPackage();
    }

    public static boolean getSafeBrowsingEnabled(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    public static WebChromeClient getWebChromeClient(WebView webView) {
        return webView.getWebChromeClient();
    }

    public static WebViewClient getWebViewClient(WebView webView) {
        return webView.getWebViewClient();
    }

    public static void setSafeBrowsingEnabled(WebSettings webSettings, boolean z8) {
        webSettings.setSafeBrowsingEnabled(z8);
    }
}
