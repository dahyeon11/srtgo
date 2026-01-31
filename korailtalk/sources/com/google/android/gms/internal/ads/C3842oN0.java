package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3842oN0 implements GN0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f21479a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4183rN0 f21480b;

    public C3842oN0(C4183rN0 c4183rN0, int i8) {
        this.f21480b = c4183rN0;
        this.f21479a = i8;
    }

    @Override // com.google.android.gms.internal.ads.GN0
    public final int zza(ZF0 zf0, BE0 be0, int i8) {
        return this.f21480b.s(this.f21479a, zf0, be0, i8);
    }

    @Override // com.google.android.gms.internal.ads.GN0
    public final int zzb(long j8) {
        return this.f21480b.t(this.f21479a, j8);
    }

    @Override // com.google.android.gms.internal.ads.GN0
    public final void zzd() {
        this.f21480b.g(this.f21479a);
    }

    @Override // com.google.android.gms.internal.ads.GN0
    public final boolean zze() {
        return this.f21480b.h(this.f21479a);
    }
}
