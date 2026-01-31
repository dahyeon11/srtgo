package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.f30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2774f30 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f19126a;

    C2774f30(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f19126a = interfaceExecutorServiceC1974Un0;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f19126a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.e30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C2889g30(G1.u.zzB().currentTimeMillis() - G1.u.zzo().zzi().zzh().zza());
            }
        });
    }
}
