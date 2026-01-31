package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.lc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ThreadFactoryC3519lc0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f20687a = new AtomicInteger(1);

    ThreadFactoryC3519lc0() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(NG) #" + this.f20687a.getAndIncrement());
    }
}
