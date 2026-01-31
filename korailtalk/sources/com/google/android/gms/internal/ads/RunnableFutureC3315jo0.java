package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.jo0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableFutureC3315jo0 extends AbstractC5022yn0 implements RunnableFuture {

    /* renamed from: h, reason: collision with root package name */
    private volatile AbstractRunnableC1892Sn0 f20311h;

    RunnableFutureC3315jo0(InterfaceC3769nn0 interfaceC3769nn0) {
        this.f20311h = new C3088ho0(this, interfaceC3769nn0);
    }

    static RunnableFutureC3315jo0 y(Runnable runnable, Object obj) {
        return new RunnableFutureC3315jo0(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final void c() {
        AbstractRunnableC1892Sn0 abstractRunnableC1892Sn0;
        if (r() && (abstractRunnableC1892Sn0 = this.f20311h) != null) {
            abstractRunnableC1892Sn0.g();
        }
        this.f20311h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC1892Sn0 abstractRunnableC1892Sn0 = this.f20311h;
        if (abstractRunnableC1892Sn0 != null) {
            abstractRunnableC1892Sn0.run();
        }
        this.f20311h = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final String zza() {
        AbstractRunnableC1892Sn0 abstractRunnableC1892Sn0 = this.f20311h;
        if (abstractRunnableC1892Sn0 == null) {
            return super.zza();
        }
        return "task=[" + abstractRunnableC1892Sn0.toString() + "]";
    }

    RunnableFutureC3315jo0(Callable callable) {
        this.f20311h = new C3202io0(this, callable);
    }
}
