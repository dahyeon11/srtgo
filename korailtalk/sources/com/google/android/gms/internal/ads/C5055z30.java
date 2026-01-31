package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.z30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5055z30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f24103a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f24104b;

    public C5055z30(XD0 xd0, XD0 xd02) {
        this.f24103a = xd0;
        this.f24104b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((C3574m30) this.f24103a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzms)).intValue(), (ScheduledExecutorService) this.f24104b.zzb());
    }
}
