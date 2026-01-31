package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.s30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4257s30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22551a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22552b;

    public C4257s30(XD0 xd0, XD0 xd02) {
        this.f22551a = xd0;
        this.f22552b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((C4141r20) this.f22551a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmr)).intValue(), (ScheduledExecutorService) this.f22552b.zzb());
    }
}
