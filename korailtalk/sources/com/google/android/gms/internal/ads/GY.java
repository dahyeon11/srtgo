package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class GY implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f13168a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f13169b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f13170c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f13171d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f13172e;

    public GY(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05) {
        this.f13168a = xd0;
        this.f13169b = xd02;
        this.f13170c = xd03;
        this.f13171d = xd04;
        this.f13172e = xd05;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        AbstractC2351bL abstractC2351bL = (AbstractC2351bL) this.f13168a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new FY(abstractC2351bL, interfaceExecutorServiceC1974Un0, ((C3613mN) this.f13170c).zzb(), (C4200rb0) this.f13171d.zzb(), (CO) this.f13172e.zzb());
    }
}
