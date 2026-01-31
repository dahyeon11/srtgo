package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class HM0 extends RG {

    /* renamed from: d, reason: collision with root package name */
    private final C3658mp f13320d;

    public HM0(C3658mp c3658mp) {
        this.f13320d = c3658mp;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zza(Object obj) {
        return obj == GM0.zzd ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final C3711nF zzd(int i8, C3711nF c3711nF, boolean z8) {
        c3711nF.zzl(z8 ? 0 : null, z8 ? GM0.zzd : null, 0, -9223372036854775807L, 0L, OF.zza, true);
        return c3711nF;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final C4055qG zze(int i8, C4055qG c4055qG, long j8) {
        c4055qG.zza(C4055qG.zza, this.f13320d, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        c4055qG.zzm = true;
        return c4055qG;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final Object zzf(int i8) {
        return GM0.zzd;
    }
}
