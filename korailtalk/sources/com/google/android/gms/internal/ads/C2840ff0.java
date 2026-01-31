package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.android.gms.internal.ads.ff0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2840ff0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3070hf0 f19224a;

    C2840ff0(C3070hf0 c3070hf0) {
        this.f19224a = c3070hf0;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + String.valueOf(webView));
        if (this.f19224a.zza() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            this.f19224a.b(null);
        }
        webView.destroy();
        return true;
    }
}
