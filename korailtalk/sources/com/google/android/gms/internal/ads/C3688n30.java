package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3688n30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f21183a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f21184b;

    public C3688n30(XD0 xd0, XD0 xd02) {
        this.f21183a = xd0;
        this.f21184b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2545d30(((Y20) this.f21183a).zzb(), H0.y.MIN_BACKOFF_MILLIS, (o2.f) this.f21184b.zzb());
    }
}
