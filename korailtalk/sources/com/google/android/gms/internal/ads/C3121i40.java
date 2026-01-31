package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.i40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3121i40 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f19884a;

    /* renamed from: b, reason: collision with root package name */
    private final C1825Ra0 f19885b;

    C3121i40(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C1825Ra0 c1825Ra0) {
        this.f19884a = interfaceExecutorServiceC1974Un0;
        this.f19885b = c1825Ra0;
    }

    final /* synthetic */ C3234j40 a() {
        return new C3234j40("requester_type_2".equals(R1.W.zzc(this.f19885b.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f19884a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.h40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
