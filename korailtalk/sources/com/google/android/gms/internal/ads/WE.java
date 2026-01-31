package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class WE implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16944a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16945b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f16946c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f16947d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f16948e;

    public WE(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05) {
        this.f16944a = xd0;
        this.f16945b = xd02;
        this.f16946c = xd03;
        this.f16947d = xd04;
        this.f16948e = xd05;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        TF tf = (TF) this.f16944a.zzb();
        C4654va0 c4654va0Zza = ((C4049qD) this.f16945b).zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f16946c.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new VE(tf, c4654va0Zza, scheduledExecutorService, interfaceExecutorServiceC1974Un0, ((C4162rD) this.f16948e).zza());
    }
}
