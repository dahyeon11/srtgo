package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.An0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1155An0 extends AbstractC5136zn0 {

    /* renamed from: h, reason: collision with root package name */
    private final com.google.common.util.concurrent.C f12211h;

    C1155An0(com.google.common.util.concurrent.C c9) {
        c9.getClass();
        this.f12211h = c9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0, com.google.common.util.concurrent.C
    public final void addListener(Runnable runnable, Executor executor) {
        this.f12211h.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0, java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        return this.f12211h.cancel(z8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0, java.util.concurrent.Future
    public final Object get() {
        return this.f12211h.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12211h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12211h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    public final String toString() {
        return this.f12211h.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0, java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f12211h.get(j8, timeUnit);
    }
}
