package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.st, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ThreadFactoryC4349st implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f22699a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f22700b;

    ThreadFactoryC4349st(String str) {
        this.f22700b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f22700b + ") #" + this.f22699a.getAndIncrement());
    }
}
