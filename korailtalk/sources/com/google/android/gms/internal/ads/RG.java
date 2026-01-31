package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public abstract class RG {
    public static final RG zza = new C3481lE();

    /* renamed from: a, reason: collision with root package name */
    private static final String f16071a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f16072b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f16073c = Integer.toString(2, 36);

    @Deprecated
    public static final RG0 zzb = new RG0() { // from class: com.google.android.gms.internal.ads.KD
    };

    protected RG() {
    }

    public final boolean equals(Object obj) {
        int iZzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RG)) {
            return false;
        }
        RG rg = (RG) obj;
        if (rg.zzc() == zzc() && rg.zzb() == zzb()) {
            C4055qG c4055qG = new C4055qG();
            C3711nF c3711nF = new C3711nF();
            C4055qG c4055qG2 = new C4055qG();
            C3711nF c3711nF2 = new C3711nF();
            for (int i8 = 0; i8 < zzc(); i8++) {
                if (!zze(i8, c4055qG, 0L).equals(rg.zze(i8, c4055qG2, 0L))) {
                    return false;
                }
            }
            for (int i9 = 0; i9 < zzb(); i9++) {
                if (!zzd(i9, c3711nF, true).equals(rg.zzd(i9, c3711nF2, true))) {
                    return false;
                }
            }
            int iZzg = zzg(true);
            if (iZzg == rg.zzg(true) && (iZzh = zzh(true)) == rg.zzh(true)) {
                while (iZzg != iZzh) {
                    int iZzj = zzj(iZzg, 0, true);
                    if (iZzj != rg.zzj(iZzg, 0, true)) {
                        return false;
                    }
                    iZzg = iZzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8;
        C4055qG c4055qG = new C4055qG();
        C3711nF c3711nF = new C3711nF();
        int iZzc = zzc() + 217;
        int i9 = 0;
        while (true) {
            i8 = iZzc * 31;
            if (i9 >= zzc()) {
                break;
            }
            iZzc = i8 + zze(i9, c4055qG, 0L).hashCode();
            i9++;
        }
        int iZzb = i8 + zzb();
        for (int i10 = 0; i10 < zzb(); i10++) {
            iZzb = (iZzb * 31) + zzd(i10, c3711nF, true).hashCode();
        }
        int iZzg = zzg(true);
        while (iZzg != -1) {
            iZzb = (iZzb * 31) + iZzg;
            iZzg = zzj(iZzg, 0, true);
        }
        return iZzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract C3711nF zzd(int i8, C3711nF c3711nF, boolean z8);

    public abstract C4055qG zze(int i8, C4055qG c4055qG, long j8);

    public abstract Object zzf(int i8);

    public int zzg(boolean z8) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z8) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i8, C3711nF c3711nF, C4055qG c4055qG, int i9, boolean z8) {
        int i10 = zzd(i8, c3711nF, false).zzd;
        if (zze(i10, c4055qG, 0L).zzq != i8) {
            return i8 + 1;
        }
        int iZzj = zzj(i10, i9, z8);
        if (iZzj == -1) {
            return -1;
        }
        return zze(iZzj, c4055qG, 0L).zzp;
    }

    public int zzj(int i8, int i9, boolean z8) {
        if (i9 == 0) {
            if (i8 == zzh(z8)) {
                return -1;
            }
            return i8 + 1;
        }
        if (i9 == 1) {
            return i8;
        }
        if (i9 == 2) {
            return i8 == zzh(z8) ? zzg(z8) : i8 + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i8, int i9, boolean z8) {
        if (i8 == zzg(false)) {
            return -1;
        }
        return i8 - 1;
    }

    public final Pair zzl(C4055qG c4055qG, C3711nF c3711nF, int i8, long j8) {
        Pair pairZzm = zzm(c4055qG, c3711nF, i8, j8, 0L);
        pairZzm.getClass();
        return pairZzm;
    }

    public final Pair zzm(C4055qG c4055qG, C3711nF c3711nF, int i8, long j8, long j9) {
        F10.zza(i8, 0, zzc());
        zze(i8, c4055qG, j9);
        if (j8 == -9223372036854775807L) {
            long j10 = c4055qG.zzn;
            j8 = 0;
        }
        int i9 = c4055qG.zzp;
        zzd(i9, c3711nF, false);
        while (i9 < c4055qG.zzq) {
            long j11 = c3711nF.zzf;
            if (j8 == 0) {
                break;
            }
            int i10 = i9 + 1;
            long j12 = zzd(i10, c3711nF, false).zzf;
            if (j8 < 0) {
                break;
            }
            i9 = i10;
        }
        zzd(i9, c3711nF, true);
        long j13 = c3711nF.zzf;
        long j14 = c3711nF.zze;
        if (j14 != -9223372036854775807L) {
            j8 = Math.min(j8, j14 - 1);
        }
        long jMax = Math.max(0L, j8);
        Object obj = c3711nF.zzc;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public C3711nF zzn(Object obj, C3711nF c3711nF) {
        return zzd(zza(obj), c3711nF, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
