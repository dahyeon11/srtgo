package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.Ve0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1997Ve0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebView f16873a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16874b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2038We0 f16875c;

    RunnableC1997Ve0(C2038We0 c2038We0, WebView webView, String str) {
        this.f16873a = webView;
        this.f16874b = str;
        this.f16875c = c2038We0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2038We0.zzj(this.f16873a, this.f16874b);
    }
}
