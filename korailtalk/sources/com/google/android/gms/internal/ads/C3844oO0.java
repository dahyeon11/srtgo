package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oO0 */
/* loaded from: classes2.dex */
final class C3844oO0 implements Comparable {

    /* renamed from: a */
    private final boolean f21483a;

    /* renamed from: b */
    private final boolean f21484b;

    public C3844oO0(Q5 q52, int i8) {
        this.f21483a = 1 == (q52.zzf & 1);
        this.f21484b = NO0.i(i8, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(C3844oO0 c3844oO0) {
        return AbstractC1763Pk0.zzk().zze(this.f21484b, c3844oO0.f21484b).zze(this.f21483a, c3844oO0.f21483a).zza();
    }
}
