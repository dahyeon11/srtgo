package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.e40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2661e40 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18724a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f18725b;

    C2661e40(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, Context context) {
        this.f18725b = interfaceExecutorServiceC1974Un0;
        this.f18724a = context;
    }

    final /* synthetic */ C2776f40 a() {
        G1.u.zzp();
        return new C2776f40(K1.K0.zzs(this.f18724a));
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f18725b.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.d40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
