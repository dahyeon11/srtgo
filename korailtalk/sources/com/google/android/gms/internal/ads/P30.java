package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class P30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f15193a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f15194b;

    public P30(XD0 xd0, XD0 xd02) {
        this.f15193a = xd0;
        this.f15194b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((C2207a60) this.f15193a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzlY)).intValue(), (ScheduledExecutorService) this.f15194b.zzb());
    }
}
