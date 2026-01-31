package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class NN0 implements GN0 {

    /* renamed from: a, reason: collision with root package name */
    private final GN0 f14906a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14907b;

    public NN0(GN0 gn0, long j8) {
        this.f14906a = gn0;
        this.f14907b = j8;
    }

    @Override // com.google.android.gms.internal.ads.GN0
    public final int zza(ZF0 zf0, BE0 be0, int i8) {
        int iZza = this.f14906a.zza(zf0, be0, i8);
        if (iZza != -4) {
            return iZza;
        }
        be0.zze += this.f14907b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.GN0
    public final int zzb(long j8) {
        return this.f14906a.zzb(j8 - this.f14907b);
    }

    public final GN0 zzc() {
        return this.f14906a;
    }

    @Override // com.google.android.gms.internal.ads.GN0
    public final void zzd() {
        this.f14906a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.GN0
    public final boolean zze() {
        return this.f14906a.zze();
    }
}
