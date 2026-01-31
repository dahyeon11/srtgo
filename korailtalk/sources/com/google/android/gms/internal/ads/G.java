package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class G {

    /* renamed from: a, reason: collision with root package name */
    private long f13098a;

    /* renamed from: b, reason: collision with root package name */
    private long f13099b;

    /* renamed from: c, reason: collision with root package name */
    private long f13100c;

    /* renamed from: d, reason: collision with root package name */
    private long f13101d;

    /* renamed from: e, reason: collision with root package name */
    private long f13102e;

    /* renamed from: f, reason: collision with root package name */
    private long f13103f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f13104g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    private int f13105h;

    public final long zza() {
        long j8 = this.f13102e;
        if (j8 == 0) {
            return 0L;
        }
        return this.f13103f / j8;
    }

    public final long zzb() {
        return this.f13103f;
    }

    public final void zzc(long j8) {
        long j9 = this.f13101d;
        if (j9 == 0) {
            this.f13098a = j8;
        } else if (j9 == 1) {
            long j10 = j8 - this.f13098a;
            this.f13099b = j10;
            this.f13103f = j10;
            this.f13102e = 1L;
        } else {
            long j11 = j8 - this.f13100c;
            int i8 = (int) (j9 % 15);
            if (Math.abs(j11 - this.f13099b) <= 1000000) {
                this.f13102e++;
                this.f13103f += j11;
                boolean[] zArr = this.f13104g;
                if (zArr[i8]) {
                    zArr[i8] = false;
                    this.f13105h--;
                }
            } else {
                boolean[] zArr2 = this.f13104g;
                if (!zArr2[i8]) {
                    zArr2[i8] = true;
                    this.f13105h++;
                }
            }
        }
        this.f13101d++;
        this.f13100c = j8;
    }

    public final void zzd() {
        this.f13101d = 0L;
        this.f13102e = 0L;
        this.f13103f = 0L;
        this.f13105h = 0;
        Arrays.fill(this.f13104g, false);
    }

    public final boolean zze() {
        long j8 = this.f13101d;
        if (j8 == 0) {
            return false;
        }
        return this.f13104g[(int) ((j8 - 1) % 15)];
    }

    public final boolean zzf() {
        return this.f13101d > 15 && this.f13105h == 0;
    }
}
