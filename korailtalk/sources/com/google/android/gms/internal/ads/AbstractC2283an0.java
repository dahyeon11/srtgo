package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.an0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2283an0 extends AbstractExecutorService implements InterfaceExecutorServiceC1974Un0 {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return RunnableFutureC3315jo0.y(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (com.google.common.util.concurrent.C) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceExecutorServiceC1974Un0
    public final com.google.common.util.concurrent.C zza(Runnable runnable) {
        return (com.google.common.util.concurrent.C) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceExecutorServiceC1974Un0
    public final com.google.common.util.concurrent.C zzb(Callable callable) {
        return (com.google.common.util.concurrent.C) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC3315jo0(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (com.google.common.util.concurrent.C) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (com.google.common.util.concurrent.C) super.submit(callable);
    }
}
