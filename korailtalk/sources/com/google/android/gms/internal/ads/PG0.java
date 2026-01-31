package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class PG0 {
    public final long zza;
    public final RG zzb;
    public final int zzc;
    public final NM0 zzd;
    public final long zze;
    public final RG zzf;
    public final int zzg;
    public final NM0 zzh;
    public final long zzi;
    public final long zzj;

    public PG0(long j8, RG rg, int i8, NM0 nm0, long j9, RG rg2, int i9, NM0 nm02, long j10, long j11) {
        this.zza = j8;
        this.zzb = rg;
        this.zzc = i8;
        this.zzd = nm0;
        this.zze = j9;
        this.zzf = rg2;
        this.zzg = i9;
        this.zzh = nm02;
        this.zzi = j10;
        this.zzj = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PG0.class == obj.getClass()) {
            PG0 pg0 = (PG0) obj;
            if (this.zza == pg0.zza && this.zzc == pg0.zzc && this.zze == pg0.zze && this.zzg == pg0.zzg && this.zzi == pg0.zzi && this.zzj == pg0.zzj && AbstractC4672vj0.zza(this.zzb, pg0.zzb) && AbstractC4672vj0.zza(this.zzd, pg0.zzd) && AbstractC4672vj0.zza(this.zzf, pg0.zzf) && AbstractC4672vj0.zza(this.zzh, pg0.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
