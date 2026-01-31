package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.x30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4827x30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23602a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23603b;

    public C4827x30(XD0 xd0, XD0 xd02) {
        this.f23602a = xd0;
        this.f23603b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((C2316b30) this.f23602a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzml)).intValue(), (ScheduledExecutorService) this.f23603b.zzb());
    }
}
