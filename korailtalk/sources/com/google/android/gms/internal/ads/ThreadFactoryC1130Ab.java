package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Ab, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ThreadFactoryC1130Ab implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f12194a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f12195b = new AtomicInteger(1);

    ThreadFactoryC1130Ab() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f12195b;
        Thread threadNewThread = this.f12194a.newThread(runnable);
        threadNewThread.setName("gads-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
