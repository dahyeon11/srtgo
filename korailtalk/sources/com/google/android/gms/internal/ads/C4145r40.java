package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.r40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4145r40 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f22374a;

    /* renamed from: b, reason: collision with root package name */
    private final C3734nS f22375b;

    C4145r40(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C3734nS c3734nS) {
        this.f22374a = interfaceExecutorServiceC1974Un0;
        this.f22375b = c3734nS;
    }

    final /* synthetic */ C4259s40 a() {
        C3734nS c3734nS = this.f22375b;
        String strZzc = c3734nS.zzc();
        boolean zZzr = c3734nS.zzr();
        boolean zZzl = G1.u.zzs().zzl();
        C3734nS c3734nS2 = this.f22375b;
        return new C4259s40(strZzc, zZzr, zZzl, c3734nS2.zzp(), c3734nS2.zzs());
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f22374a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.q40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
