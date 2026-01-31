package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.u7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4492u7 implements C1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4037q7 f22971a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22972b;

    /* renamed from: c, reason: collision with root package name */
    private final long f22973c;

    /* renamed from: d, reason: collision with root package name */
    private final long f22974d;

    /* renamed from: e, reason: collision with root package name */
    private final long f22975e;

    public C4492u7(C4037q7 c4037q7, int i8, long j8, long j9) {
        this.f22971a = c4037q7;
        this.f22972b = i8;
        this.f22973c = j8;
        long j10 = (j9 - j8) / c4037q7.zzd;
        this.f22974d = j10;
        this.f22975e = a(j10);
    }

    private final long a(long j8) {
        return AbstractC2281am0.zzt(j8 * this.f22972b, 1000000L, this.f22971a.zzc, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f22975e;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        long jMax = Math.max(0L, Math.min((this.f22971a.zzc * j8) / (this.f22972b * 1000000), this.f22974d - 1));
        long jA = a(jMax);
        D1 d12 = new D1(jA, this.f22973c + (this.f22971a.zzd * jMax));
        if (jA >= j8 || jMax == this.f22974d - 1) {
            return new A1(d12, d12);
        }
        long j9 = jMax + 1;
        return new A1(d12, new D1(a(j9), this.f22973c + (j9 * this.f22971a.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return true;
    }
}
