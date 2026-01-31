package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.k30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3346k30 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f20346a;

    /* renamed from: b, reason: collision with root package name */
    private final EP f20347b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20348c;

    /* renamed from: d, reason: collision with root package name */
    private final C1825Ra0 f20349d;

    public C3346k30(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, EP ep, C1825Ra0 c1825Ra0, String str) {
        this.f20346a = interfaceExecutorServiceC1974Un0;
        this.f20347b = ep;
        this.f20349d = c1825Ra0;
        this.f20348c = str;
    }

    final /* synthetic */ C3460l30 a() {
        C1825Ra0 c1825Ra0 = this.f20349d;
        EP ep = this.f20347b;
        return new C3460l30(ep.zzb(c1825Ra0.zzf, this.f20348c), ep.zza());
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f20346a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.i30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
