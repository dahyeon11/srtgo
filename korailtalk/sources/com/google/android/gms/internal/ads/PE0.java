package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class PE0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f15248a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15249b;

    /* renamed from: c, reason: collision with root package name */
    private long f15250c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    private long f15251d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    private long f15253f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f15254g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f15257j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    private float f15256i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    private float f15258k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private long f15259l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private long f15252e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f15255h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private long f15260m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private long f15261n = -9223372036854775807L;

    /* synthetic */ PE0(float f8, float f9, long j8, float f10, long j9, long j10, float f11, NE0 ne0) {
        this.f15248a = j9;
        this.f15249b = j10;
    }

    private static long a(long j8, long j9, float f8) {
        return (long) ((j8 * 0.999f) + (j9 * 9.999871E-4f));
    }

    private final void b() {
        long j8;
        long j9 = this.f15250c;
        if (j9 != -9223372036854775807L) {
            j8 = this.f15251d;
            if (j8 == -9223372036854775807L) {
                long j10 = this.f15253f;
                if (j10 != -9223372036854775807L && j9 < j10) {
                    j9 = j10;
                }
                j8 = this.f15254g;
                if (j8 == -9223372036854775807L || j9 <= j8) {
                    j8 = j9;
                }
            }
        } else {
            j8 = -9223372036854775807L;
        }
        if (this.f15252e == j8) {
            return;
        }
        this.f15252e = j8;
        this.f15255h = j8;
        this.f15260m = -9223372036854775807L;
        this.f15261n = -9223372036854775807L;
        this.f15259l = -9223372036854775807L;
    }

    public final float zza(long j8, long j9) {
        long j10;
        if (this.f15250c == -9223372036854775807L) {
            return 1.0f;
        }
        long j11 = j8 - j9;
        long j12 = this.f15260m;
        if (j12 == -9223372036854775807L) {
            this.f15260m = j11;
            this.f15261n = 0L;
        } else {
            long jMax = Math.max(j11, a(j12, j11, 0.999f));
            this.f15260m = jMax;
            this.f15261n = a(this.f15261n, Math.abs(j11 - jMax), 0.999f);
        }
        if (this.f15259l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f15259l < 1000) {
            return this.f15258k;
        }
        this.f15259l = SystemClock.elapsedRealtime();
        long j13 = this.f15260m + (this.f15261n * 3);
        if (this.f15255h > j13) {
            float fZzr = AbstractC2281am0.zzr(1000L);
            long[] jArr = {j13, this.f15252e, this.f15255h - (((long) ((this.f15258k - 1.0f) * fZzr)) + ((long) ((this.f15256i - 1.0f) * fZzr)))};
            j10 = jArr[0];
            for (int i8 = 1; i8 < 3; i8++) {
                long j14 = jArr[i8];
                if (j14 > j10) {
                    j10 = j14;
                }
            }
            this.f15255h = j10;
        } else {
            long jMax2 = Math.max(this.f15255h, Math.min(j8 - ((long) (Math.max(0.0f, this.f15258k - 1.0f) / 1.0E-7f)), j13));
            this.f15255h = jMax2;
            long j15 = this.f15254g;
            if (j15 == -9223372036854775807L || jMax2 <= j15) {
                j10 = jMax2;
            } else {
                this.f15255h = j15;
                j10 = j15;
            }
        }
        long j16 = j8 - j10;
        if (Math.abs(j16) < this.f15248a) {
            this.f15258k = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.f15257j, Math.min((j16 * 1.0E-7f) + 1.0f, this.f15256i));
        this.f15258k = fMax;
        return fMax;
    }

    public final long zzb() {
        return this.f15255h;
    }

    public final void zzc() {
        long j8 = this.f15255h;
        if (j8 == -9223372036854775807L) {
            return;
        }
        long j9 = j8 + this.f15249b;
        this.f15255h = j9;
        long j10 = this.f15254g;
        if (j10 != -9223372036854775807L && j9 > j10) {
            this.f15255h = j10;
        }
        this.f15259l = -9223372036854775807L;
    }

    public final void zzd(C3306jk c3306jk) {
        long j8 = c3306jk.zzc;
        this.f15250c = AbstractC2281am0.zzr(-9223372036854775807L);
        this.f15253f = AbstractC2281am0.zzr(-9223372036854775807L);
        this.f15254g = AbstractC2281am0.zzr(-9223372036854775807L);
        this.f15257j = 0.97f;
        this.f15256i = 1.03f;
        b();
    }

    public final void zze(long j8) {
        this.f15251d = j8;
        b();
    }
}
