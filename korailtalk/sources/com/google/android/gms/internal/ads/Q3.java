package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
final class Q3 implements V3 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f15685a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f15686b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15687c;

    private Q3(long[] jArr, long[] jArr2, long j8) {
        this.f15685a = jArr;
        this.f15686b = jArr2;
        this.f15687c = j8 == -9223372036854775807L ? AbstractC2281am0.zzr(jArr2[jArr2.length - 1]) : j8;
    }

    private static Pair a(long j8, long[] jArr, long[] jArr2) {
        int iZzc = AbstractC2281am0.zzc(jArr, j8, true, true);
        long j9 = jArr[iZzc];
        long j10 = jArr2[iZzc];
        int i8 = iZzc + 1;
        if (i8 == jArr.length) {
            return Pair.create(Long.valueOf(j9), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j8), Long.valueOf(((long) ((jArr[i8] == j9 ? 0.0d : (j8 - j9) / (r6 - j9)) * (jArr2[i8] - j10))) + j10));
    }

    public static Q3 zzb(long j8, C3003h3 c3003h3, long j9) {
        int length = c3003h3.zzd.length;
        int i8 = length + 1;
        long[] jArr = new long[i8];
        long[] jArr2 = new long[i8];
        jArr[0] = j8;
        long j10 = 0;
        jArr2[0] = 0;
        for (int i9 = 1; i9 <= length; i9++) {
            int i10 = i9 - 1;
            j8 += c3003h3.zzb + c3003h3.zzd[i10];
            j10 += c3003h3.zzc + c3003h3.zze[i10];
            jArr[i9] = j8;
            jArr2[i9] = j10;
        }
        return new Q3(jArr, jArr2, j9);
    }

    @Override // com.google.android.gms.internal.ads.V3, com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f15687c;
    }

    @Override // com.google.android.gms.internal.ads.V3
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.V3
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.V3
    public final long zze(long j8) {
        return AbstractC2281am0.zzr(((Long) a(j8, this.f15685a, this.f15686b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.V3, com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        Pair pairA = a(AbstractC2281am0.zzu(Math.max(0L, Math.min(j8, this.f15687c))), this.f15686b, this.f15685a);
        D1 d12 = new D1(AbstractC2281am0.zzr(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new A1(d12, d12);
    }

    @Override // com.google.android.gms.internal.ads.V3, com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return true;
    }
}
