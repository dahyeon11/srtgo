package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class L20 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f14147a;

    /* renamed from: b, reason: collision with root package name */
    private final L1.a f14148b;

    L20(L1.a aVar, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f14148b = aVar;
        this.f14147a = interfaceExecutorServiceC1974Un0;
    }

    final /* synthetic */ M20 a() {
        return M20.a(this.f14148b);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f14147a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.K20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
