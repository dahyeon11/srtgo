package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class X3 {
    public final C4708w1 zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private X3(C4708w1 c4708w1, long j8, long j9, long[] jArr, int i8, int i9) {
        this.zza = c4708w1;
        this.zzb = j8;
        this.zzc = j9;
        this.zzf = jArr;
        this.zzd = i8;
        this.zze = i9;
    }

    public static X3 zza(C4708w1 c4708w1, C4099qh0 c4099qh0) {
        long[] jArr;
        int i8;
        int i9;
        int iZzg = c4099qh0.zzg();
        int iZzp = (iZzg & 1) != 0 ? c4099qh0.zzp() : -1;
        long jZzu = (iZzg & 2) != 0 ? c4099qh0.zzu() : -1L;
        if ((iZzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i10 = 0; i10 < 100; i10++) {
                jArr2[i10] = c4099qh0.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzg & 8) != 0) {
            c4099qh0.zzL(4);
        }
        if (c4099qh0.zzb() >= 24) {
            c4099qh0.zzL(21);
            int iZzo = c4099qh0.zzo();
            i9 = iZzo & 4095;
            i8 = iZzo >> 12;
        } else {
            i8 = -1;
            i9 = -1;
        }
        return new X3(c4708w1, iZzp, jZzu, jArr, i8, i9);
    }
}
