package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.d30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2545d30 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f18504a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final o2.f f18505b;

    /* renamed from: c, reason: collision with root package name */
    private final N50 f18506c;

    /* renamed from: d, reason: collision with root package name */
    private final long f18507d;

    public C2545d30(N50 n50, long j8, o2.f fVar) {
        this.f18505b = fVar;
        this.f18506c = n50;
        this.f18507d = j8;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        C2430c30 c2430c30 = (C2430c30) this.f18504a.get();
        if (c2430c30 == null || c2430c30.zza()) {
            N50 n50 = this.f18506c;
            C2430c30 c2430c302 = new C2430c30(n50.zzb(), this.f18507d, this.f18505b);
            this.f18504a.set(c2430c302);
            c2430c30 = c2430c302;
        }
        return c2430c30.zza;
    }
}
