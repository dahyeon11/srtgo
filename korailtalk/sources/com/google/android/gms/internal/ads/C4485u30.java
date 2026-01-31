package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.u30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4485u30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22963a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22964b;

    public C4485u30(XD0 xd0, XD0 xd02) {
        this.f22963a = xd0;
        this.f22964b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((N20) this.f22963a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmo)).intValue(), (ScheduledExecutorService) this.f22964b.zzb());
    }
}
