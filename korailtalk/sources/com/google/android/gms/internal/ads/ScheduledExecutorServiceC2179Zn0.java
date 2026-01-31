package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Zn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ScheduledExecutorServiceC2179Zn0 extends C2056Wn0 implements ScheduledExecutorService, InterfaceExecutorServiceC1974Un0 {

    /* renamed from: b, reason: collision with root package name */
    final ScheduledExecutorService f17631b;

    ScheduledExecutorServiceC2179Zn0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f17631b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j8, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f17631b;
        RunnableFutureC3315jo0 runnableFutureC3315jo0Y = RunnableFutureC3315jo0.y(runnable, null);
        return new ScheduledFutureC2097Xn0(runnableFutureC3315jo0Y, scheduledExecutorService.schedule(runnableFutureC3315jo0Y, j8, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        RunnableC2138Yn0 runnableC2138Yn0 = new RunnableC2138Yn0(runnable);
        return new ScheduledFutureC2097Xn0(runnableC2138Yn0, this.f17631b.scheduleAtFixedRate(runnableC2138Yn0, j8, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        RunnableC2138Yn0 runnableC2138Yn0 = new RunnableC2138Yn0(runnable);
        return new ScheduledFutureC2097Xn0(runnableC2138Yn0, this.f17631b.scheduleWithFixedDelay(runnableC2138Yn0, j8, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j8, TimeUnit timeUnit) {
        RunnableFutureC3315jo0 runnableFutureC3315jo0 = new RunnableFutureC3315jo0(callable);
        return new ScheduledFutureC2097Xn0(runnableFutureC3315jo0, this.f17631b.schedule(runnableFutureC3315jo0, j8, timeUnit));
    }
}
