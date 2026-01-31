package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class EV implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f12811a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f12812b;

    public EV(XD0 xd0, XD0 xd02) {
        this.f12811a = xd0;
        this.f12812b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        NV nv = (NV) this.f12811a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4630vJ(nv, interfaceExecutorServiceC1974Un0);
    }
}
