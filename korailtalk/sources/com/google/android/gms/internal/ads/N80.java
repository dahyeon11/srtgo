package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class N80 implements InterfaceC2376bc0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3358k90 f14803a;

    public N80(InterfaceC3358k90 interfaceC3358k90) {
        this.f14803a = interfaceC3358k90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2376bc0
    public final com.google.common.util.concurrent.C zza(InterfaceC2490cc0 interfaceC2490cc0) {
        O80 o80 = (O80) interfaceC2490cc0;
        return ((K80) this.f14803a).zzb(o80.zzb, o80.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2376bc0
    public final void zzb(C1786Qb0 c1786Qb0) {
        c1786Qb0.zza = ((K80) this.f14803a).zza();
    }
}
