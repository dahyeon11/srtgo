package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.mC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3591mC implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f20859a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f20860b;

    public C3591mC(XD0 xd0, XD0 xd02) {
        this.f20859a = xd0;
        this.f20860b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((C3918p40) this.f20859a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmu)).intValue(), (ScheduledExecutorService) this.f20860b.zzb());
    }
}
