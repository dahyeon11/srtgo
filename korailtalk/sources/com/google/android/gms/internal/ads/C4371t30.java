package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.t30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4371t30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22773a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22774b;

    public C4371t30(XD0 xd0, XD0 xd02) {
        this.f22773a = xd0;
        this.f22774b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((C5053z20) this.f22773a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzme)).intValue(), (ScheduledExecutorService) this.f22774b.zzb());
    }
}
