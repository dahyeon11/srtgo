package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2398bn0 extends AbstractRunnableC2627dn0 {
    C2398bn0(com.google.common.util.concurrent.C c9, InterfaceC3997pn0 interfaceC3997pn0) {
        super(c9, interfaceC3997pn0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2627dn0
    final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2) {
        InterfaceC3997pn0 interfaceC3997pn0 = (InterfaceC3997pn0) obj;
        com.google.common.util.concurrent.C cZza = interfaceC3997pn0.zza(obj2);
        AbstractC1188Bj0.zzd(cZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC3997pn0);
        return cZza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2627dn0
    final /* synthetic */ void z(Object obj) {
        q((com.google.common.util.concurrent.C) obj);
    }
}
