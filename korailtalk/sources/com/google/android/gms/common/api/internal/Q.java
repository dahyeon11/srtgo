package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f11949a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ U f11950b;

    Q(U u8, int i8) {
        this.f11950b = u8;
        this.f11949a = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11950b.g(this.f11949a);
    }
}
