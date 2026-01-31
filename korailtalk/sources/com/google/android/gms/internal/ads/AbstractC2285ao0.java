package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ao0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2285ao0 {
    static Executor a(Executor executor, AbstractC1972Um0 abstractC1972Um0) {
        executor.getClass();
        return executor == EnumC4794wn0.INSTANCE ? executor : new ExecutorC2015Vn0(executor, abstractC1972Um0);
    }

    public static InterfaceExecutorServiceC1974Un0 zza(ExecutorService executorService) {
        if (executorService instanceof InterfaceExecutorServiceC1974Un0) {
            return (InterfaceExecutorServiceC1974Un0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new ScheduledExecutorServiceC2179Zn0((ScheduledExecutorService) executorService) : new C2056Wn0(executorService);
    }

    public static Executor zzb() {
        return EnumC4794wn0.INSTANCE;
    }
}
