package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class DT implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f12679a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f12680b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f12681c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f12682d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f12683e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f12684f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f12685g;

    /* renamed from: h, reason: collision with root package name */
    private final XD0 f12686h;

    public DT(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07, XD0 xd08) {
        this.f12679a = xd0;
        this.f12680b = xd02;
        this.f12681c = xd03;
        this.f12682d = xd04;
        this.f12683e = xd05;
        this.f12684f = xd06;
        this.f12685g = xd07;
        this.f12686h = xd08;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final CT zzb() {
        AbstractC2302ax abstractC2302ax = (AbstractC2302ax) this.f12679a.zzb();
        Context contextZza = ((C2990gx) this.f12680b).zza();
        L1.a aVarZza = ((C4357sx) this.f12681c).zza();
        C1825Ra0 c1825Ra0Zza = ((C4053qF) this.f12682d).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new CT(abstractC2302ax, contextZza, aVarZza, c1825Ra0Zza, interfaceExecutorServiceC1974Un0, (String) this.f12684f.zzb(), (RunnableC4660vd0) this.f12685g.zzb(), (FQ) this.f12686h.zzb());
    }
}
