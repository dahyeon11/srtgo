package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class WD implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16939a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16940b;

    public WD(XD0 xd0, XD0 xd02) {
        this.f16939a = xd0;
        this.f16940b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        HJ hj = (HJ) this.f16939a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4630vJ(hj, interfaceExecutorServiceC1974Un0);
    }
}
