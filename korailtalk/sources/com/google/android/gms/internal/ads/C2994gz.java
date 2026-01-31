package com.google.android.gms.internal.ads;

import R1.C0738q;

/* renamed from: com.google.android.gms.internal.ads.gz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2994gz implements R1.X {

    /* renamed from: a, reason: collision with root package name */
    private final C2190Zx f19726a;

    /* renamed from: b, reason: collision with root package name */
    private C3142iF f19727b;

    /* renamed from: c, reason: collision with root package name */
    private C0738q f19728c;

    /* synthetic */ C2994gz(C2190Zx c2190Zx, AbstractC2879fz abstractC2879fz) {
        this.f19726a = c2190Zx;
    }

    @Override // R1.X
    public final /* synthetic */ R1.X zza(C3142iF c3142iF) {
        this.f19727b = c3142iF;
        return this;
    }

    @Override // R1.X
    public final /* synthetic */ R1.X zzb(C0738q c0738q) {
        this.f19728c = c0738q;
        return this;
    }

    @Override // R1.X
    public final R1.Y zzc() {
        OD0.zzc(this.f19727b, C3142iF.class);
        OD0.zzc(this.f19728c, C0738q.class);
        return new C3222iz(this.f19726a, this.f19728c, new JD(), new KE(), new ZQ(), this.f19727b, null, null, null);
    }
}
