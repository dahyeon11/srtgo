package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4708w1 {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        if (!AbstractC4822x1.k(i8) || (i9 = (i8 >>> 19) & 3) == 1 || (i10 = (i8 >>> 17) & 3) == 0 || (i11 = (i8 >>> 12) & 15) == 0 || i11 == 15 || (i12 = (i8 >>> 10) & 3) == 3) {
            return false;
        }
        int i13 = i11 - 1;
        this.zza = i9;
        this.zzb = AbstractC4822x1.f23595a[3 - i10];
        int i14 = AbstractC4822x1.f23596b[i12];
        this.zzd = i14;
        if (i9 == 2) {
            i14 /= 2;
            this.zzd = i14;
        } else if (i9 == 0) {
            i14 /= 4;
            this.zzd = i14;
        }
        int i15 = (i8 >>> 9) & 1;
        this.zzg = AbstractC4822x1.j(i9, i10);
        if (i10 == 3) {
            int i16 = i9 == 3 ? AbstractC4822x1.f23597c[i13] : AbstractC4822x1.f23598d[i13];
            this.zzf = i16;
            this.zzc = (((i16 * 12) / i14) + i15) * 4;
        } else {
            if (i9 == 3) {
                int i17 = i10 == 2 ? AbstractC4822x1.f23599e[i13] : AbstractC4822x1.f23600f[i13];
                this.zzf = i17;
                this.zzc = ((i17 * 144) / i14) + i15;
            } else {
                int i18 = AbstractC4822x1.f23601g[i13];
                this.zzf = i18;
                this.zzc = (((i10 == 1 ? 72 : 144) * i18) / i14) + i15;
            }
        }
        this.zze = ((i8 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
