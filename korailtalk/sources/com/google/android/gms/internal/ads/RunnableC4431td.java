package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.td */
/* loaded from: classes2.dex */
final class RunnableC4431td implements Runnable {

    /* renamed from: a */
    final ValueCallback f22891a;

    /* renamed from: b */
    final /* synthetic */ C3520ld f22892b;

    /* renamed from: c */
    final /* synthetic */ WebView f22893c;

    /* renamed from: d */
    final /* synthetic */ boolean f22894d;

    /* renamed from: e */
    final /* synthetic */ C4659vd f22895e;

    RunnableC4431td(C4659vd c4659vd, final C3520ld c3520ld, final WebView webView, final boolean z8) {
        this.f22892b = c3520ld;
        this.f22893c = webView;
        this.f22894d = z8;
        this.f22895e = c4659vd;
        this.f22891a = new ValueCallback() { // from class: com.google.android.gms.internal.ads.sd
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.zza.f22895e.c(c3520ld, webView, (String) obj, z8);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f22893c.getSettings().getJavaScriptEnabled()) {
            try {
                this.f22893c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f22891a);
            } catch (Throwable unused) {
                this.f22891a.onReceiveValue("");
            }
        }
    }
}
