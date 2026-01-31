package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2198a2 {

    /* renamed from: a, reason: collision with root package name */
    protected final K1 f17879a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17880b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17881c;

    /* renamed from: d, reason: collision with root package name */
    private final long f17882d;

    /* renamed from: e, reason: collision with root package name */
    private final int f17883e;

    /* renamed from: f, reason: collision with root package name */
    private int f17884f;

    /* renamed from: g, reason: collision with root package name */
    private int f17885g;

    /* renamed from: h, reason: collision with root package name */
    private int f17886h;

    /* renamed from: i, reason: collision with root package name */
    private int f17887i;

    /* renamed from: j, reason: collision with root package name */
    private int f17888j;

    /* renamed from: k, reason: collision with root package name */
    private long[] f17889k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f17890l;

    public C2198a2(int i8, int i9, long j8, int i10, K1 k12) {
        i9 = i9 != 1 ? 2 : i9;
        this.f17882d = j8;
        this.f17883e = i10;
        this.f17879a = k12;
        this.f17880b = a(i8, i9 == 2 ? 1667497984 : 1651965952);
        this.f17881c = i9 == 2 ? a(i8, 1650720768) : -1;
        this.f17889k = new long[512];
        this.f17890l = new int[512];
    }

    private static int a(int i8, int i9) {
        return (((i8 % 10) + 48) << 8) | ((i8 / 10) + 48) | i9;
    }

    private final long b(int i8) {
        return (this.f17882d * i8) / this.f17883e;
    }

    private final D1 c(int i8) {
        return new D1(this.f17890l[i8] * b(1), this.f17889k[i8]);
    }

    public final A1 zza(long j8) {
        int iB = (int) (j8 / b(1));
        int iZzb = AbstractC2281am0.zzb(this.f17890l, iB, true, true);
        if (this.f17890l[iZzb] == iB) {
            D1 d1C = c(iZzb);
            return new A1(d1C, d1C);
        }
        D1 d1C2 = c(iZzb);
        int i8 = iZzb + 1;
        return i8 < this.f17889k.length ? new A1(d1C2, c(i8)) : new A1(d1C2, d1C2);
    }

    public final void zzb(long j8) {
        if (this.f17888j == this.f17890l.length) {
            long[] jArr = this.f17889k;
            this.f17889k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f17890l;
            this.f17890l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f17889k;
        int i8 = this.f17888j;
        jArr2[i8] = j8;
        this.f17890l[i8] = this.f17887i;
        this.f17888j = i8 + 1;
    }

    public final void zzc() {
        this.f17889k = Arrays.copyOf(this.f17889k, this.f17888j);
        this.f17890l = Arrays.copyOf(this.f17890l, this.f17888j);
    }

    public final void zzd() {
        this.f17887i++;
    }

    public final void zze(int i8) {
        this.f17884f = i8;
        this.f17885g = i8;
    }

    public final void zzf(long j8) {
        if (this.f17888j == 0) {
            this.f17886h = 0;
        } else {
            this.f17886h = this.f17890l[AbstractC2281am0.zzc(this.f17889k, j8, true, true)];
        }
    }

    public final boolean zzg(int i8) {
        return this.f17880b == i8 || this.f17881c == i8;
    }

    public final boolean zzh(InterfaceC2540d1 interfaceC2540d1) {
        int i8 = this.f17885g;
        int iZzf = i8 - this.f17879a.zzf(interfaceC2540d1, i8, false);
        this.f17885g = iZzf;
        boolean z8 = iZzf == 0;
        if (z8) {
            if (this.f17884f > 0) {
                this.f17879a.zzs(b(this.f17886h), Arrays.binarySearch(this.f17890l, this.f17886h) >= 0 ? 1 : 0, this.f17884f, 0, null);
            }
            this.f17886h++;
        }
        return z8;
    }
}
