package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.lC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3477lC implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f20643a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f20644b;

    public C3477lC(XD0 xd0, XD0 xd02) {
        this.f20643a = xd0;
        this.f20644b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((U20) this.f20643a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmy)).intValue(), (ScheduledExecutorService) this.f20644b.zzb());
    }
}
