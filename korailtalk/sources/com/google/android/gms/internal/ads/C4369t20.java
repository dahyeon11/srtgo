package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.t20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4369t20 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f22769a;

    /* renamed from: b, reason: collision with root package name */
    private final C1825Ra0 f22770b;

    /* renamed from: c, reason: collision with root package name */
    private final L1.a f22771c;

    /* renamed from: d, reason: collision with root package name */
    private final C4122qt f22772d;

    public C4369t20(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C1825Ra0 c1825Ra0, L1.a aVar, C4122qt c4122qt) {
        this.f22769a = interfaceExecutorServiceC1974Un0;
        this.f22770b = c1825Ra0;
        this.f22771c = aVar;
        this.f22772d = c4122qt;
    }

    final /* synthetic */ C4483u20 a() {
        return new C4483u20(this.f22770b.zzj, this.f22771c, this.f22772d.zzm());
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f22769a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.s20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
