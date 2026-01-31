package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.l70, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3468l70 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceExecutorServiceC1974Un0 f20638a;

    /* renamed from: b, reason: collision with root package name */
    final List f20639b;

    /* renamed from: c, reason: collision with root package name */
    final C2385bh f20640c;

    public C3468l70(C2385bh c2385bh, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, List list) {
        this.f20640c = c2385bh;
        this.f20638a = interfaceExecutorServiceC1974Un0;
        this.f20639b = list;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f20638a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.k70
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C3582m70(this.zza.f20639b);
            }
        });
    }
}
