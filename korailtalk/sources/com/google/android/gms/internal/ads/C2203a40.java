package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.a40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2203a40 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f17892a;

    public C2203a40(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f17892a = interfaceExecutorServiceC1974Un0;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f17892a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.Z30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C2318b40(G1.u.zzs().zzb(), G1.u.zzs().zzm());
            }
        });
    }
}
