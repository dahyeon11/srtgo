package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.Iw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1493Iw extends C1452Hw {
    public C1493Iw(InterfaceC2065Wv interfaceC2065Wv, C4775we c4775we, boolean z8, GW gw) {
        super(interfaceC2065Wv, c4775we, z8, gw);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return n(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
