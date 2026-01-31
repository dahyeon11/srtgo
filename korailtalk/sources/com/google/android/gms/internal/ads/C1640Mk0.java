package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.Mk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1640Mk0 extends AbstractC1763Pk0 {
    C1640Mk0() {
        super(null);
    }

    static final AbstractC1763Pk0 d(int i8) {
        return i8 < 0 ? AbstractC1763Pk0.f15403b : i8 > 0 ? AbstractC1763Pk0.f15404c : AbstractC1763Pk0.f15402a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1763Pk0
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1763Pk0
    public final AbstractC1763Pk0 zzb(int i8, int i9) {
        return d(i8 < i9 ? -1 : i8 > i9 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1763Pk0
    public final AbstractC1763Pk0 zzc(long j8, long j9) {
        return d(j8 < j9 ? -1 : j8 > j9 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1763Pk0
    public final AbstractC1763Pk0 zzd(Object obj, Object obj2, Comparator comparator) {
        return d(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1763Pk0
    public final AbstractC1763Pk0 zze(boolean z8, boolean z9) {
        return d(AbstractC4906xm0.zza(z8, z9));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1763Pk0
    public final AbstractC1763Pk0 zzf(boolean z8, boolean z9) {
        return d(AbstractC4906xm0.zza(z9, z8));
    }
}
