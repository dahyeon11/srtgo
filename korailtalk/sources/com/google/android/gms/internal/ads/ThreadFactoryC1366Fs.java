package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Fs */
/* loaded from: classes2.dex */
final class ThreadFactoryC1366Fs implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f13080a = new AtomicInteger(1);

    ThreadFactoryC1366Fs(C1407Gs c1407Gs) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.f13080a.getAndIncrement());
    }
}
