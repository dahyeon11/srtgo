package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class NU implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f14920a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f14921b;

    public NU(XD0 xd0, XD0 xd02) {
        this.f14920a = xd0;
        this.f14921b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final MU zzb() {
        return new MU(((C2990gx) this.f14920a).zza(), (ScheduledExecutorService) this.f14921b.zzb());
    }
}
