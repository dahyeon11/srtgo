package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class S20 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f16187a;

    /* renamed from: b, reason: collision with root package name */
    private final C1825Ra0 f16188b;

    S20(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C1825Ra0 c1825Ra0) {
        this.f16187a = interfaceExecutorServiceC1974Un0;
        this.f16188b = c1825Ra0;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 58;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return AbstractC1483In0.zzh(new T20(this.f16188b.zzp));
    }
}
