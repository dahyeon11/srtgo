package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1399Gm0 extends AbstractRunnableC1440Hm0 {
    C1399Gm0(com.google.common.util.concurrent.C c9, Class cls, InterfaceC3875oj0 interfaceC3875oj0) {
        super(c9, cls, interfaceC3875oj0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1440Hm0
    final /* synthetic */ Object y(Object obj, Throwable th) {
        return ((InterfaceC3875oj0) obj).apply(th);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1440Hm0
    final void z(Object obj) {
        zzc(obj);
    }
}
