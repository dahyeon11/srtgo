package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.r30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4143r30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22338a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22339b;

    public C4143r30(XD0 xd0, XD0 xd02) {
        this.f22338a = xd0;
        this.f22339b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((C2887g20) this.f22338a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmp)).intValue(), (ScheduledExecutorService) this.f22339b.zzb());
    }
}
