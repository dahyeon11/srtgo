package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Om0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1726Om0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC1972Um0 f15152a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.common.util.concurrent.C f15153b;

    RunnableC1726Om0(AbstractC1972Um0 abstractC1972Um0, com.google.common.util.concurrent.C c9) {
        this.f15152a = abstractC1972Um0;
        this.f15153b = c9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15152a.f16722a != this) {
            return;
        }
        com.google.common.util.concurrent.C c9 = this.f15153b;
        if (AbstractC1972Um0.f16720f.f(this.f15152a, this, AbstractC1972Um0.d(c9))) {
            AbstractC1972Um0.v(this.f15152a, false);
        }
    }
}
