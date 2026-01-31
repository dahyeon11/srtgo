package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jX, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3283jX implements InterfaceC3171iX {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3875oj0 f20271a;
    public final InterfaceC3171iX zza;

    public C3283jX(InterfaceC3171iX interfaceC3171iX, InterfaceC3875oj0 interfaceC3875oj0) {
        this.zza = interfaceC3171iX;
        this.f20271a = interfaceC3875oj0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        return AbstractC1483In0.zzm(this.zza.zza(c1457Ia0, c4654va0), this.f20271a, AbstractC4805wt.zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        return this.zza.zzb(c1457Ia0, c4654va0);
    }
}
