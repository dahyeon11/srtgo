package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.t70, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4379t70 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22786a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22787b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f22788c;

    public C4379t70(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f22786a = xd0;
        this.f22787b = xd02;
        this.f22788c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4151r70(new C2059Wp(), (ScheduledExecutorService) this.f22787b.zzb(), ((C2990gx) this.f22788c).zza());
    }
}
