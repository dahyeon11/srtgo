package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC3099hu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f19864a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3212iu f19865b;

    RunnableC3099hu(C3212iu c3212iu, boolean z8) {
        this.f19864a = z8;
        this.f19865b = c3212iu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19865b.b("windowVisibilityChanged", "isVisible", String.valueOf(this.f19864a));
    }
}
