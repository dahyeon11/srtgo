package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.kC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3363kC implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f20371a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f20372b;

    public C3363kC(XD0 xd0, XD0 xd02) {
        this.f20371a = xd0;
        this.f20372b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((O10) this.f20371a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmt)).intValue(), (ScheduledExecutorService) this.f20372b.zzb());
    }
}
