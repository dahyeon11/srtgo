package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.jn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3313jn0 extends AbstractC3200in0 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f20308a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicIntegerFieldUpdater f20309b;

    C3313jn0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f20308a = atomicReferenceFieldUpdater;
        this.f20309b = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3200in0
    final int a(AbstractC3655mn0 abstractC3655mn0) {
        return this.f20309b.decrementAndGet(abstractC3655mn0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3200in0
    final void b(AbstractC3655mn0 abstractC3655mn0, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f20308a;
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC3655mn0, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3655mn0) == null);
    }
}
