package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Kh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1553Kh0 implements InterfaceC1471Ih0 {
    /* synthetic */ C1553Kh0(AbstractC1512Jh0 abstractC1512Jh0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1471Ih0
    public final ExecutorService zza(int i8) {
        return zzc(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1471Ih0
    public final ExecutorService zzb(ThreadFactory threadFactory, int i8) {
        return zzc(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1471Ih0
    public final ExecutorService zzc(int i8, ThreadFactory threadFactory, int i9) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i8, i8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
