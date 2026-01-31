package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.h70, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3012h70 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceExecutorServiceC1974Un0 f19765a;

    /* renamed from: b, reason: collision with root package name */
    final String f19766b;

    /* renamed from: c, reason: collision with root package name */
    final C2185Zs f19767c;

    public C3012h70(C2185Zs c2185Zs, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, String str) {
        this.f19767c = c2185Zs;
        this.f19765a = interfaceExecutorServiceC1974Un0;
        this.f19766b = str;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        final com.google.common.util.concurrent.C cZzh = AbstractC1483In0.zzh(null);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfX)).booleanValue()) {
            cZzh = AbstractC1483In0.zzh(null);
        }
        final com.google.common.util.concurrent.C cZzh2 = AbstractC1483In0.zzh(null);
        return AbstractC1483In0.zzc(cZzh, cZzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.g70
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C3127i70((String) cZzh.get(), (String) cZzh2.get());
            }
        }, AbstractC4805wt.zza);
    }
}
