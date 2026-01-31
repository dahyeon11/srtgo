package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ux, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4585ux implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23125a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23126b;

    public C4585ux(XD0 xd0, XD0 xd02) {
        this.f23125a = xd0;
        this.f23126b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        CallableC4412tO callableC4412tO = (CallableC4412tO) this.f23125a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4200rb0(callableC4412tO, interfaceExecutorServiceC1974Un0);
    }
}
