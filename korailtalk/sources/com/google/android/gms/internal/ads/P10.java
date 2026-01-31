package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class P10 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final o2.f f15188a;

    /* renamed from: b, reason: collision with root package name */
    private final C1825Ra0 f15189b;

    P10(o2.f fVar, C1825Ra0 c1825Ra0) {
        this.f15188a = fVar;
        this.f15189b = c1825Ra0;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return AbstractC1483In0.zzh(new Q10(this.f15189b, this.f15188a.currentTimeMillis()));
    }
}
