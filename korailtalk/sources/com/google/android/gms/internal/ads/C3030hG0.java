package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3030hG0 {
    public final NM0 zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    C3030hG0(NM0 nm0, long j8, long j9, long j10, long j11, boolean z8, boolean z9, boolean z10, boolean z11) {
        boolean z12 = true;
        F10.zzd(!z11 || z9);
        if (z10 && !z9) {
            z12 = false;
        }
        F10.zzd(z12);
        this.zza = nm0;
        this.zzb = j8;
        this.zzc = j9;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = false;
        this.zzg = z9;
        this.zzh = z10;
        this.zzi = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3030hG0.class == obj.getClass()) {
            C3030hG0 c3030hG0 = (C3030hG0) obj;
            if (this.zzb == c3030hG0.zzb && this.zzc == c3030hG0.zzc && this.zzd == c3030hG0.zzd && this.zze == c3030hG0.zze && this.zzg == c3030hG0.zzg && this.zzh == c3030hG0.zzh && this.zzi == c3030hG0.zzi && AbstractC2281am0.zzG(this.zza, c3030hG0.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        long j8 = this.zze;
        long j9 = this.zzd;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j9)) * 31) + ((int) j8)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final C3030hG0 zza(long j8) {
        return j8 == this.zzc ? this : new C3030hG0(this.zza, this.zzb, j8, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final C3030hG0 zzb(long j8) {
        return j8 == this.zzb ? this : new C3030hG0(this.zza, j8, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
