package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.ef0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2725ef0 extends C2611df0 {
    public C2725ef0(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        b(webView);
    }
}
