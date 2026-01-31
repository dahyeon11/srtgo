package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Bn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractFutureC1196Bn0 extends AbstractC1845Rk0 implements Future {
    protected AbstractFutureC1196Bn0() {
    }

    protected abstract Future b();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return b().cancel(z8);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return b().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return b().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return b().get(j8, timeUnit);
    }
}
