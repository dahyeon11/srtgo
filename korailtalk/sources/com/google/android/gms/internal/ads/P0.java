package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class P0 implements C1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f15182a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15183b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15184c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15185d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15186e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15187f;

    public P0(long j8, long j9, int i8, int i9, boolean z8) {
        long jA;
        this.f15182a = j8;
        this.f15183b = j9;
        this.f15184c = i9 == -1 ? 1 : i9;
        this.f15186e = i8;
        if (j8 == -1) {
            this.f15185d = -1L;
            jA = -9223372036854775807L;
        } else {
            this.f15185d = j8 - j9;
            jA = a(j8, j9, i8);
        }
        this.f15187f = jA;
    }

    private static long a(long j8, long j9, int i8) {
        return (Math.max(0L, j8 - j9) * 8000000) / i8;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f15187f;
    }

    public final long zzb(long j8) {
        return a(j8, this.f15183b, this.f15186e);
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        long j9 = this.f15185d;
        if (j9 == -1) {
            D1 d12 = new D1(0L, this.f15183b);
            return new A1(d12, d12);
        }
        long j10 = this.f15184c;
        long jMin = (((this.f15186e * j8) / 8000000) / j10) * j10;
        if (j9 != -1) {
            jMin = Math.min(jMin, j9 - j10);
        }
        long jMax = this.f15183b + Math.max(jMin, 0L);
        long jZzb = zzb(jMax);
        D1 d13 = new D1(jZzb, jMax);
        if (this.f15185d != -1 && jZzb < j8) {
            long j11 = jMax + this.f15184c;
            if (j11 < this.f15182a) {
                return new A1(d13, new D1(zzb(j11), j11));
            }
        }
        return new A1(d13, d13);
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return this.f15185d != -1;
    }
}
