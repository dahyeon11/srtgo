package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Wn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2056Wn0 extends AbstractC2283an0 {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f17067a;

    C2056Wn0(ExecutorService executorService) {
        executorService.getClass();
        this.f17067a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f17067a.awaitTermination(j8, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f17067a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f17067a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f17067a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f17067a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f17067a.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f17067a;
        return super.toString() + "[" + String.valueOf(executorService) + "]";
    }
}
