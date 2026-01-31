package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes2.dex */
final class J4 implements C1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ K4 f13577a;

    /* synthetic */ J4(K4 k42, I4 i42) {
        this.f13577a = k42;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final long zza() {
        K4 k42 = this.f13577a;
        return k42.f13730d.e(k42.f13732f);
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        K4 k42 = this.f13577a;
        long jF = k42.f13730d.f(j8);
        long j9 = k42.f13728b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jF);
        K4 k43 = this.f13577a;
        long jLongValue = j9 + bigIntegerValueOf.multiply(BigInteger.valueOf(k43.f13729c - k43.f13728b)).divide(BigInteger.valueOf(this.f13577a.f13732f)).longValue();
        D1 d12 = new D1(j8, Math.max(this.f13577a.f13728b, Math.min(jLongValue - 30000, r0.f13729c - 1)));
        return new A1(d12, d12);
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return true;
    }
}
