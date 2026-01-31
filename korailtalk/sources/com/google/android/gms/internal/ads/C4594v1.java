package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4594v1 implements C1 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f23148a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f23149b;

    /* renamed from: c, reason: collision with root package name */
    private final long f23150c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23151d;

    public C4594v1(long[] jArr, long[] jArr2, long j8) {
        int length = jArr.length;
        int length2 = jArr2.length;
        F10.zzd(length == length2);
        boolean z8 = length2 > 0;
        this.f23151d = z8;
        if (!z8 || jArr2[0] <= 0) {
            this.f23148a = jArr;
            this.f23149b = jArr2;
        } else {
            int i8 = length2 + 1;
            long[] jArr3 = new long[i8];
            this.f23148a = jArr3;
            long[] jArr4 = new long[i8];
            this.f23149b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f23150c = j8;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f23150c;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        if (!this.f23151d) {
            D1 d12 = D1.zza;
            return new A1(d12, d12);
        }
        int iZzc = AbstractC2281am0.zzc(this.f23149b, j8, true, true);
        D1 d13 = new D1(this.f23149b[iZzc], this.f23148a[iZzc]);
        if (d13.zzb != j8) {
            long[] jArr = this.f23149b;
            if (iZzc != jArr.length - 1) {
                int i8 = iZzc + 1;
                return new A1(d13, new D1(jArr[i8], this.f23148a[i8]));
            }
        }
        return new A1(d13, d13);
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return this.f23151d;
    }
}
