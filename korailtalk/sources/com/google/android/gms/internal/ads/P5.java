package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class P5 implements InterfaceC2777f5 {

    /* renamed from: a, reason: collision with root package name */
    private final I5 f15201a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f15202b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f15203c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f15204d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f15205e;

    public P5(I5 i52, Map map, Map map2, Map map3) {
        this.f15201a = i52;
        this.f15204d = map2;
        this.f15205e = map3;
        this.f15203c = Collections.unmodifiableMap(map);
        this.f15202b = i52.zzh();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2777f5
    public final int zza() {
        return this.f15202b.length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2777f5
    public final long zzb(int i8) {
        return this.f15202b[i8];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2777f5
    public final List zzc(long j8) {
        return this.f15201a.zze(j8, this.f15203c, this.f15204d, this.f15205e);
    }
}
