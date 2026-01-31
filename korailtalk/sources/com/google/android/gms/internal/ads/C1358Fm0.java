package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1358Fm0 extends AbstractRunnableC1440Hm0 {
    C1358Fm0(com.google.common.util.concurrent.C c9, Class cls, InterfaceC3997pn0 interfaceC3997pn0) {
        super(c9, cls, interfaceC3997pn0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1440Hm0
    final /* bridge */ /* synthetic */ Object y(Object obj, Throwable th) {
        InterfaceC3997pn0 interfaceC3997pn0 = (InterfaceC3997pn0) obj;
        com.google.common.util.concurrent.C cZza = interfaceC3997pn0.zza(th);
        AbstractC1188Bj0.zzd(cZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC3997pn0);
        return cZza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1440Hm0
    final /* synthetic */ void z(Object obj) {
        q((com.google.common.util.concurrent.C) obj);
    }
}
