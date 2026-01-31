package androidx.webkit.internal;

import G0.g;
import G0.h;
import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: androidx.webkit.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1034b {

    /* renamed from: androidx.webkit.internal.b$a */
    class a extends WebMessagePort.WebMessageCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.a f11062a;

        a(g.a aVar) {
            this.f11062a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f11062a.onMessage(new b0(webMessagePort), b0.frameworkMessageToCompat(webMessage));
        }
    }

    /* renamed from: androidx.webkit.internal.b$b, reason: collision with other inner class name */
    class C0176b extends WebMessagePort.WebMessageCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.a f11063a;

        C0176b(g.a aVar) {
            this.f11063a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f11063a.onMessage(new b0(webMessagePort), b0.frameworkMessageToCompat(webMessage));
        }
    }

    /* renamed from: androidx.webkit.internal.b$c */
    class c extends WebView.VisualStateCallback {
        c(h.a aVar) {
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j8) {
            throw null;
        }
    }

    public static void close(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage createWebMessage(G0.f fVar) {
        return new WebMessage(fVar.getData(), b0.compatToPorts(fVar.getPorts()));
    }

    public static WebMessagePort[] createWebMessageChannel(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static G0.f createWebMessageCompat(WebMessage webMessage) {
        return new G0.f(webMessage.getData(), b0.portsToCompat(webMessage.getPorts()));
    }

    public static CharSequence getDescription(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int getErrorCode(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean getOffscreenPreRaster(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void postMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void postVisualStateCallback(WebView webView, long j8, h.a aVar) {
        webView.postVisualStateCallback(j8, new c(aVar));
    }

    public static void postWebMessage(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void setOffscreenPreRaster(WebSettings webSettings, boolean z8) {
        webSettings.setOffscreenPreRaster(z8);
    }

    public static void setWebMessageCallback(WebMessagePort webMessagePort, g.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    public static void setWebMessageCallback(WebMessagePort webMessagePort, g.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new C0176b(aVar), handler);
    }
}
