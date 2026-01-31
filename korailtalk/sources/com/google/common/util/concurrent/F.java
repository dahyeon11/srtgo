package com.google.common.util.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public interface F extends ScheduledExecutorService, E {
    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.E
    /* synthetic */ List invokeAll(Collection collection);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.E
    /* synthetic */ List invokeAll(Collection collection, long j8, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    D schedule(Runnable runnable, long j8, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> D schedule(Callable<V> callable, long j8, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    D scheduleAtFixedRate(Runnable runnable, long j8, long j9, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    D scheduleWithFixedDelay(Runnable runnable, long j8, long j9, TimeUnit timeUnit);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.E
    /* synthetic */ C submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.E
    /* synthetic */ C submit(Runnable runnable, Object obj);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.E
    /* synthetic */ C submit(Callable callable);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.E
    /* bridge */ /* synthetic */ default Future submit(Runnable runnable) {
        return super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.E
    /* bridge */ /* synthetic */ default Future submit(Runnable runnable, Object obj) {
        return super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.E
    /* bridge */ /* synthetic */ default Future submit(Callable callable) {
        return super.submit(callable);
    }
}
