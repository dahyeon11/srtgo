package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.Nm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1685Nm0 extends AbstractC1522Jm0 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f14945a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f14946b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f14947c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f14948d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f14949e;

    C1685Nm0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f14945a = atomicReferenceFieldUpdater;
        this.f14946b = atomicReferenceFieldUpdater2;
        this.f14947c = atomicReferenceFieldUpdater3;
        this.f14948d = atomicReferenceFieldUpdater4;
        this.f14949e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final C1644Mm0 a(AbstractC1972Um0 abstractC1972Um0, C1644Mm0 c1644Mm0) {
        return (C1644Mm0) this.f14948d.getAndSet(abstractC1972Um0, c1644Mm0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final C1931Tm0 b(AbstractC1972Um0 abstractC1972Um0, C1931Tm0 c1931Tm0) {
        return (C1931Tm0) this.f14947c.getAndSet(abstractC1972Um0, c1931Tm0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final void c(C1931Tm0 c1931Tm0, C1931Tm0 c1931Tm02) {
        this.f14946b.lazySet(c1931Tm0, c1931Tm02);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final void d(C1931Tm0 c1931Tm0, Thread thread) {
        this.f14945a.lazySet(c1931Tm0, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final boolean e(AbstractC1972Um0 abstractC1972Um0, C1644Mm0 c1644Mm0, C1644Mm0 c1644Mm02) {
        return AbstractC2013Vm0.zza(this.f14948d, abstractC1972Um0, c1644Mm0, c1644Mm02);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final boolean f(AbstractC1972Um0 abstractC1972Um0, Object obj, Object obj2) {
        return AbstractC2013Vm0.zza(this.f14949e, abstractC1972Um0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final boolean g(AbstractC1972Um0 abstractC1972Um0, C1931Tm0 c1931Tm0, C1931Tm0 c1931Tm02) {
        return AbstractC2013Vm0.zza(this.f14947c, abstractC1972Um0, c1931Tm0, c1931Tm02);
    }
}
