package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class W3 implements V3 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f16919a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f16920b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16921c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16922d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16923e;

    private W3(long[] jArr, long[] jArr2, long j8, long j9, int i8) {
        this.f16919a = jArr;
        this.f16920b = jArr2;
        this.f16921c = j8;
        this.f16922d = j9;
        this.f16923e = i8;
    }

    public static W3 zzb(long j8, long j9, C4708w1 c4708w1, C4099qh0 c4099qh0) {
        int iZzm;
        c4099qh0.zzL(10);
        int iZzg = c4099qh0.zzg();
        if (iZzg <= 0) {
            return null;
        }
        int i8 = c4708w1.zzd;
        long jZzt = AbstractC2281am0.zzt(iZzg, (i8 >= 32000 ? 1152 : 576) * 1000000, i8, RoundingMode.FLOOR);
        int iZzq = c4099qh0.zzq();
        int iZzq2 = c4099qh0.zzq();
        int iZzq3 = c4099qh0.zzq();
        c4099qh0.zzL(2);
        long j10 = j9 + c4708w1.zzc;
        long[] jArr = new long[iZzq];
        long[] jArr2 = new long[iZzq];
        int i9 = 0;
        long j11 = j9;
        while (i9 < iZzq) {
            long j12 = jZzt;
            jArr[i9] = (i9 * jZzt) / iZzq;
            jArr2[i9] = Math.max(j11, j10);
            if (iZzq3 == 1) {
                iZzm = c4099qh0.zzm();
            } else if (iZzq3 == 2) {
                iZzm = c4099qh0.zzq();
            } else if (iZzq3 == 3) {
                iZzm = c4099qh0.zzo();
            } else {
                if (iZzq3 != 4) {
                    return null;
                }
                iZzm = c4099qh0.zzp();
            }
            j11 += iZzm * iZzq2;
            i9++;
            jZzt = j12;
        }
        long j13 = jZzt;
        if (j8 != -1 && j8 != j11) {
            AbstractC2834fc0.zzf("VbriSeeker", "VBRI data size mismatch: " + j8 + ", " + j11);
        }
        return new W3(jArr, jArr2, j13, j11, c4708w1.zzf);
    }

    @Override // com.google.android.gms.internal.ads.V3, com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f16921c;
    }

    @Override // com.google.android.gms.internal.ads.V3
    public final int zzc() {
        return this.f16923e;
    }

    @Override // com.google.android.gms.internal.ads.V3
    public final long zzd() {
        return this.f16922d;
    }

    @Override // com.google.android.gms.internal.ads.V3
    public final long zze(long j8) {
        return this.f16919a[AbstractC2281am0.zzc(this.f16920b, j8, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.V3, com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        long[] jArr = this.f16919a;
        int iZzc = AbstractC2281am0.zzc(jArr, j8, true, true);
        D1 d12 = new D1(jArr[iZzc], this.f16920b[iZzc]);
        if (d12.zzb < j8) {
            long[] jArr2 = this.f16919a;
            if (iZzc != jArr2.length - 1) {
                int i8 = iZzc + 1;
                return new A1(d12, new D1(jArr2[i8], this.f16920b[i8]));
            }
        }
        return new A1(d12, d12);
    }

    @Override // com.google.android.gms.internal.ads.V3, com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return true;
    }
}
