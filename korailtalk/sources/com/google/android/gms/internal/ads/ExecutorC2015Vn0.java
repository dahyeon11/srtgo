package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.gms.internal.ads.Vn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ExecutorC2015Vn0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Executor f16895a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1972Um0 f16896b;

    ExecutorC2015Vn0(Executor executor, AbstractC1972Um0 abstractC1972Um0) {
        this.f16895a = executor;
        this.f16896b = abstractC1972Um0;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f16895a.execute(runnable);
        } catch (RejectedExecutionException e8) {
            this.f16896b.zzd(e8);
        }
    }
}
