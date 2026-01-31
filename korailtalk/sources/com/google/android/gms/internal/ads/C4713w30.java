package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.w30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4713w30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23391a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23392b;

    public C4713w30(XD0 xd0, XD0 xd02) {
        this.f23391a = xd0;
        this.f23392b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40((C2545d30) this.f23391a.zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmm)).intValue(), (ScheduledExecutorService) this.f23392b.zzb());
    }
}
