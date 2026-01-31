package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class F0 implements C1 {

    /* renamed from: a, reason: collision with root package name */
    private final J0 f12898a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12899b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12900c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12901d;

    /* renamed from: e, reason: collision with root package name */
    private final long f12902e;

    /* renamed from: f, reason: collision with root package name */
    private final long f12903f;

    public F0(J0 j02, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f12898a = j02;
        this.f12899b = j8;
        this.f12900c = j10;
        this.f12901d = j11;
        this.f12902e = j12;
        this.f12903f = j13;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f12899b;
    }

    public final long zzf(long j8) {
        return this.f12898a.zza(j8);
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        D1 d12 = new D1(j8, I0.f(this.f12898a.zza(j8), 0L, this.f12900c, this.f12901d, this.f12902e, this.f12903f));
        return new A1(d12, d12);
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return true;
    }
}
