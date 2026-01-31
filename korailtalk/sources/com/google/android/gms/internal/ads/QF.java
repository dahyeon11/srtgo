package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class QF implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f15755a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f15756b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f15757c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f15758d;

    public QF(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f15755a = xd0;
        this.f15756b = xd02;
        this.f15757c = xd03;
        this.f15758d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        LF lfZzb = ((NF) this.f15755a).zzb();
        Set setZzb = ((VD0) this.f15756b).zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new MF(lfZzb, setZzb, interfaceExecutorServiceC1974Un0, (ScheduledExecutorService) this.f15758d.zzb());
    }
}
