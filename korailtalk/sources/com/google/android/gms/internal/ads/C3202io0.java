package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.io0 */
/* loaded from: classes2.dex */
final class C3202io0 extends AbstractRunnableC1892Sn0 {

    /* renamed from: c */
    private final Callable f19977c;

    /* renamed from: d */
    final /* synthetic */ RunnableFutureC3315jo0 f19978d;

    C3202io0(RunnableFutureC3315jo0 runnableFutureC3315jo0, Callable callable) {
        this.f19978d = runnableFutureC3315jo0;
        callable.getClass();
        this.f19977c = callable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final Object a() {
        return this.f19977c.call();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final String b() {
        return this.f19977c.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final void d(Throwable th) {
        this.f19978d.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final void e(Object obj) {
        this.f19978d.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final boolean f() {
        return this.f19978d.isDone();
    }
}
