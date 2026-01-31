package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class LB implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f14252a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f14253b;

    public LB(XD0 xd0, XD0 xd02) {
        this.f14252a = xd0;
        this.f14253b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final SG zzb() {
        return new SG((ScheduledExecutorService) this.f14252a.zzb(), (o2.f) this.f14253b.zzb());
    }
}
