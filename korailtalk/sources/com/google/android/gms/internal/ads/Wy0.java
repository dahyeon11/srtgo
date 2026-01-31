package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class Wy0 implements Ny0 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC2765ez0 f17083a;

    /* renamed from: b, reason: collision with root package name */
    final int f17084b;

    /* renamed from: c, reason: collision with root package name */
    final SA0 f17085c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f17086d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f17087e;

    Wy0(InterfaceC2765ez0 interfaceC2765ez0, int i8, SA0 sa0, boolean z8, boolean z9) {
        this.f17083a = interfaceC2765ez0;
        this.f17084b = i8;
        this.f17085c = sa0;
        this.f17086d = z8;
        this.f17087e = z9;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f17084b - ((Wy0) obj).f17084b;
    }

    @Override // com.google.android.gms.internal.ads.Ny0
    public final int zza() {
        return this.f17084b;
    }

    @Override // com.google.android.gms.internal.ads.Ny0
    public final Oz0 zzb(Oz0 oz0, Pz0 pz0) {
        ((Ty0) oz0).zzbj((Zy0) pz0);
        return oz0;
    }

    @Override // com.google.android.gms.internal.ads.Ny0
    public final Uz0 zzc(Uz0 uz0, Uz0 uz02) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.Ny0
    public final SA0 zzd() {
        return this.f17085c;
    }

    @Override // com.google.android.gms.internal.ads.Ny0
    public final TA0 zze() {
        return this.f17085c.zza();
    }

    @Override // com.google.android.gms.internal.ads.Ny0
    public final boolean zzf() {
        return this.f17087e;
    }

    @Override // com.google.android.gms.internal.ads.Ny0
    public final boolean zzg() {
        return this.f17086d;
    }
}
