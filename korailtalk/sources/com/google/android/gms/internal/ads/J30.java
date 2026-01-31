package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class J30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f13575a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f13576b;

    public J30(XD0 xd0, XD0 xd02) {
        this.f13575a = xd0;
        this.f13576b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((C2549d50) this.f13575a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmd)).intValue(), (ScheduledExecutorService) this.f13576b.zzb());
    }
}
