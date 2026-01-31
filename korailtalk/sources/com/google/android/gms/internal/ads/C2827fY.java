package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.fY, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2827fY implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f19192a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f19193b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f19194c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f19195d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f19196e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f19197f;

    public C2827fY(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06) {
        this.f19192a = xd0;
        this.f19193b = xd02;
        this.f19194c = xd03;
        this.f19195d = xd04;
        this.f19196e = xd05;
        this.f19197f = xd06;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final C2712eY zzb() {
        AbstractC3819oC abstractC3819oC = (AbstractC3819oC) this.f19192a.zzb();
        KX kxZzb = ((LX) this.f19193b).zzb();
        BF bf = (BF) this.f19194c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f19195d.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C2712eY(abstractC3819oC, kxZzb, bf, scheduledExecutorService, interfaceExecutorServiceC1974Un0, (FQ) this.f19197f.zzb());
    }
}
