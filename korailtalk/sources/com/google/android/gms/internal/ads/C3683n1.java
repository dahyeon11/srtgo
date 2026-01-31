package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3683n1 implements C1 {

    /* renamed from: a, reason: collision with root package name */
    private final C3911p1 f21180a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21181b;

    public C3683n1(C3911p1 c3911p1, long j8) {
        this.f21180a = c3911p1;
        this.f21181b = j8;
    }

    private final D1 a(long j8, long j9) {
        return new D1((j8 * 1000000) / this.f21180a.zze, this.f21181b + j9);
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f21180a.zza();
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        F10.zzb(this.f21180a.zzk);
        C3911p1 c3911p1 = this.f21180a;
        C3797o1 c3797o1 = c3911p1.zzk;
        long[] jArr = c3797o1.zza;
        long[] jArr2 = c3797o1.zzb;
        int iZzc = AbstractC2281am0.zzc(jArr, c3911p1.zzb(j8), true, false);
        D1 d1A = a(iZzc == -1 ? 0L : jArr[iZzc], iZzc != -1 ? jArr2[iZzc] : 0L);
        if (d1A.zzb == j8 || iZzc == jArr.length - 1) {
            return new A1(d1A, d1A);
        }
        int i8 = iZzc + 1;
        return new A1(d1A, a(jArr[i8], jArr2[i8]));
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return true;
    }
}
