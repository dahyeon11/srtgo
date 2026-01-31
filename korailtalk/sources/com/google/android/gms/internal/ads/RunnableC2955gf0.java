package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.gf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2955gf0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final WebView f19389a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3070hf0 f19390b;

    RunnableC2955gf0(C3070hf0 c3070hf0) {
        this.f19390b = c3070hf0;
        this.f19389a = c3070hf0.f19832e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19389a.destroy();
    }
}
