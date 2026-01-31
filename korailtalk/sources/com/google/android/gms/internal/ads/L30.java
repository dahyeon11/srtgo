package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class L30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f14210a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f14211b;

    public L30(XD0 xd0, XD0 xd02) {
        this.f14210a = xd0;
        this.f14211b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((A50) this.f14210a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmc)).intValue(), (ScheduledExecutorService) this.f14211b.zzb());
    }
}
