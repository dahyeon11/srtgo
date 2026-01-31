package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class L70 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f14238a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f14239b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f14240c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f14241d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f14242e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f14243f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f14244g;

    public L70(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07) {
        this.f14238a = xd0;
        this.f14239b = xd02;
        this.f14240c = xd03;
        this.f14241d = xd04;
        this.f14242e = xd05;
        this.f14243f = xd06;
        this.f14244g = xd07;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C3666mt c3666mt = (C3666mt) this.f14238a.zzb();
        boolean zBooleanValue = ((C5063z70) this.f14239b).zzb().booleanValue();
        boolean zBooleanValue2 = ((A70) this.f14240c).zzb().booleanValue();
        C2294at c2294at = new C2294at();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new J70(c3666mt, zBooleanValue, zBooleanValue2, c2294at, interfaceExecutorServiceC1974Un0, ((C4607v70) this.f14243f).zza(), (ScheduledExecutorService) this.f14244g.zzb());
    }
}
