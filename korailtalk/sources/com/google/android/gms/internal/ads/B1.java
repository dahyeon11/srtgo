package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class B1 implements C1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f12230a;

    /* renamed from: b, reason: collision with root package name */
    private final A1 f12231b;

    public B1(long j8, long j9) {
        this.f12230a = j8;
        D1 d12 = j9 == 0 ? D1.zza : new D1(0L, j9);
        this.f12231b = new A1(d12, d12);
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f12230a;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        return this.f12231b;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return false;
    }
}
