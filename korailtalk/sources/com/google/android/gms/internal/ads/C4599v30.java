package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.v30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4599v30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23166a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23167b;

    public C4599v30(XD0 xd0, XD0 xd02) {
        this.f23166a = xd0;
        this.f23167b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((R20) this.f23166a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmn)).intValue(), (ScheduledExecutorService) this.f23167b.zzb());
    }
}
