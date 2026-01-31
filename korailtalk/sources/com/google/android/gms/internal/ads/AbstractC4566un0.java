package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.gms.internal.ads.un0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4566un0 extends AbstractRunnableC1892Sn0 {

    /* renamed from: c, reason: collision with root package name */
    private final Executor f23107c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4680vn0 f23108d;

    AbstractC4566un0(C4680vn0 c4680vn0, Executor executor) {
        this.f23108d = c4680vn0;
        executor.getClass();
        this.f23107c = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final void d(Throwable th) {
        this.f23108d.f23310p = null;
        if (th instanceof ExecutionException) {
            this.f23108d.zzd(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f23108d.cancel(false);
        } else {
            this.f23108d.zzd(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final void e(Object obj) {
        this.f23108d.f23310p = null;
        h(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final boolean f() {
        return this.f23108d.isDone();
    }

    abstract void h(Object obj);

    final void i() {
        try {
            this.f23107c.execute(this);
        } catch (RejectedExecutionException e8) {
            this.f23108d.zzd(e8);
        }
    }
}
