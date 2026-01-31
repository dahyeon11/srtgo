package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class L4 implements S4 {

    /* renamed from: a, reason: collision with root package name */
    private final C3911p1 f14212a;

    /* renamed from: b, reason: collision with root package name */
    private final C3797o1 f14213b;

    /* renamed from: c, reason: collision with root package name */
    private long f14214c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f14215d = -1;

    public L4(C3911p1 c3911p1, C3797o1 c3797o1) {
        this.f14212a = c3911p1;
        this.f14213b = c3797o1;
    }

    public final void zza(long j8) {
        this.f14214c = j8;
    }

    @Override // com.google.android.gms.internal.ads.S4
    public final long zzd(InterfaceC2540d1 interfaceC2540d1) {
        long j8 = this.f14215d;
        if (j8 < 0) {
            return -1L;
        }
        this.f14215d = -1L;
        return -(j8 + 2);
    }

    @Override // com.google.android.gms.internal.ads.S4
    public final C1 zze() {
        F10.zzf(this.f14214c != -1);
        return new C3683n1(this.f14212a, this.f14214c);
    }

    @Override // com.google.android.gms.internal.ads.S4
    public final void zzg(long j8) {
        long[] jArr = this.f14213b.zza;
        this.f14215d = jArr[AbstractC2281am0.zzc(jArr, j8, true, true)];
    }
}
