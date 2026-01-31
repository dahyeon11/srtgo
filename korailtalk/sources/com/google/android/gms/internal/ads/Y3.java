package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class Y3 implements V3 {

    /* renamed from: a, reason: collision with root package name */
    private final long f17326a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17327b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17328c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17329d;

    /* renamed from: e, reason: collision with root package name */
    private final long f17330e;

    /* renamed from: f, reason: collision with root package name */
    private final long f17331f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f17332g;

    private Y3(long j8, int i8, long j9, int i9, long j10, long[] jArr) {
        this.f17326a = j8;
        this.f17327b = i8;
        this.f17328c = j9;
        this.f17329d = i9;
        this.f17330e = j10;
        this.f17332g = jArr;
        this.f17331f = j10 != -1 ? j8 + j10 : -1L;
    }

    private final long a(int i8) {
        return (this.f17328c * i8) / 100;
    }

    public static Y3 zzb(long j8, X3 x32, long j9) {
        long j10 = x32.zzb;
        if (j10 == -1) {
            j10 = -1;
        }
        long jZzs = AbstractC2281am0.zzs((j10 * r7.zzg) - 1, x32.zza.zzd);
        long j11 = x32.zzc;
        if (j11 == -1 || x32.zzf == null) {
            C4708w1 c4708w1 = x32.zza;
            return new Y3(j9, c4708w1.zzc, jZzs, c4708w1.zzf, -1L, null);
        }
        if (j8 != -1) {
            long j12 = j9 + j11;
            if (j8 != j12) {
                AbstractC2834fc0.zzf("XingSeeker", "XING data size mismatch: " + j8 + ", " + j12);
            }
        }
        C4708w1 c4708w12 = x32.zza;
        return new Y3(j9, c4708w12.zzc, jZzs, c4708w12.zzf, x32.zzc, x32.zzf);
    }

    @Override // com.google.android.gms.internal.ads.V3, com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f17328c;
    }

    @Override // com.google.android.gms.internal.ads.V3
    public final int zzc() {
        return this.f17329d;
    }

    @Override // com.google.android.gms.internal.ads.V3
    public final long zzd() {
        return this.f17331f;
    }

    @Override // com.google.android.gms.internal.ads.V3
    public final long zze(long j8) {
        if (!zzh()) {
            return 0L;
        }
        long j9 = j8 - this.f17326a;
        if (j9 <= this.f17327b) {
            return 0L;
        }
        long[] jArr = this.f17332g;
        F10.zzb(jArr);
        double d9 = (j9 * 256.0d) / this.f17330e;
        int iZzc = AbstractC2281am0.zzc(jArr, (long) d9, true, true);
        long jA = a(iZzc);
        long j10 = jArr[iZzc];
        int i8 = iZzc + 1;
        long jA2 = a(i8);
        return jA + Math.round((j10 == (iZzc == 99 ? 256L : jArr[i8]) ? 0.0d : (d9 - j10) / (r0 - j10)) * (jA2 - jA));
    }

    @Override // com.google.android.gms.internal.ads.V3, com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        if (!zzh()) {
            D1 d12 = new D1(0L, this.f17326a + this.f17327b);
            return new A1(d12, d12);
        }
        long jMax = Math.max(0L, Math.min(j8, this.f17328c));
        double d9 = (jMax * 100.0d) / this.f17328c;
        double d10 = 0.0d;
        if (d9 > 0.0d) {
            if (d9 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i8 = (int) d9;
                long[] jArr = this.f17332g;
                F10.zzb(jArr);
                double d11 = jArr[i8];
                d10 = d11 + ((d9 - i8) * ((i8 == 99 ? 256.0d : jArr[i8 + 1]) - d11));
            }
        }
        long j9 = this.f17330e;
        D1 d13 = new D1(jMax, this.f17326a + Math.max(this.f17327b, Math.min(Math.round((d10 / 256.0d) * j9), j9 - 1)));
        return new A1(d13, d13);
    }

    @Override // com.google.android.gms.internal.ads.V3, com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return this.f17332g != null;
    }
}
