package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class G4 {
    public final D4 zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public G4(D4 d42, long[] jArr, int[] iArr, int i8, long[] jArr2, int[] iArr2, long j8) {
        int length = iArr.length;
        int length2 = jArr2.length;
        F10.zzd(length == length2);
        int length3 = jArr.length;
        F10.zzd(length3 == length2);
        int length4 = iArr2.length;
        F10.zzd(length4 == length2);
        this.zza = d42;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i8;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j8;
        this.zzb = length3;
        if (length4 > 0) {
            int i9 = length4 - 1;
            iArr2[i9] = iArr2[i9] | 536870912;
        }
    }

    public final int zza(long j8) {
        for (int iZzc = AbstractC2281am0.zzc(this.zzf, j8, true, false); iZzc >= 0; iZzc--) {
            if ((this.zzg[iZzc] & 1) != 0) {
                return iZzc;
            }
        }
        return -1;
    }

    public final int zzb(long j8) {
        for (int iZza = AbstractC2281am0.zza(this.zzf, j8, true, false); iZza < this.zzf.length; iZza++) {
            if ((this.zzg[iZza] & 1) != 0) {
                return iZza;
            }
        }
        return -1;
    }
}
