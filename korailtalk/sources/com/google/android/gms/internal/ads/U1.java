package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class U1 implements C1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f16568a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ X1 f16569b;

    public U1(X1 x12, long j8) {
        this.f16569b = x12;
        this.f16568a = j8;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f16568a;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        A1 a1Zza = this.f16569b.f17097h[0].zza(j8);
        int i8 = 1;
        while (true) {
            X1 x12 = this.f16569b;
            if (i8 >= x12.f17097h.length) {
                return a1Zza;
            }
            A1 a1Zza2 = x12.f17097h[i8].zza(j8);
            if (a1Zza2.zza.zzc < a1Zza.zza.zzc) {
                a1Zza = a1Zza2;
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return true;
    }
}
