package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class UM implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16652a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16653b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f16654c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f16655d;

    public UM(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f16652a = xd0;
        this.f16653b = xd02;
        this.f16654c = xd03;
        this.f16655d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        SL slZza = ((C3611mM) this.f16652a).zza();
        XL xlZzb = ((C4406tL) this.f16653b).zzb();
        Executor executor = (Executor) this.f16654c.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new TM(slZza, xlZzb, executor, interfaceExecutorServiceC1974Un0);
    }
}
