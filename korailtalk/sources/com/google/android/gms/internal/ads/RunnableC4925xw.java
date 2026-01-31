package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC4925xw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5039yw f23814a;

    RunnableC4925xw(ViewTreeObserverOnGlobalLayoutListenerC5039yw viewTreeObserverOnGlobalLayoutListenerC5039yw) {
        this.f23814a = viewTreeObserverOnGlobalLayoutListenerC5039yw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
