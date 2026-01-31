package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ho0 */
/* loaded from: classes2.dex */
final class C3088ho0 extends AbstractRunnableC1892Sn0 {

    /* renamed from: c */
    private final InterfaceC3769nn0 f19844c;

    /* renamed from: d */
    final /* synthetic */ RunnableFutureC3315jo0 f19845d;

    C3088ho0(RunnableFutureC3315jo0 runnableFutureC3315jo0, InterfaceC3769nn0 interfaceC3769nn0) {
        this.f19845d = runnableFutureC3315jo0;
        this.f19844c = interfaceC3769nn0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final /* bridge */ /* synthetic */ Object a() {
        InterfaceC3769nn0 interfaceC3769nn0 = this.f19844c;
        com.google.common.util.concurrent.C cZza = interfaceC3769nn0.zza();
        AbstractC1188Bj0.zzd(cZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC3769nn0);
        return cZza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final String b() {
        return this.f19844c.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final void d(Throwable th) {
        this.f19845d.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final /* synthetic */ void e(Object obj) {
        this.f19845d.q((com.google.common.util.concurrent.C) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final boolean f() {
        return this.f19845d.isDone();
    }
}
