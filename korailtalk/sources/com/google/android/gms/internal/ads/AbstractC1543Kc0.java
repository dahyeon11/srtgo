package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Kc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1543Kc0 {
    public static final C1829Rc0 zza(Callable callable, Object obj, AbstractC1870Sc0 abstractC1870Sc0) {
        return zzb(callable, abstractC1870Sc0.f16309a, obj, abstractC1870Sc0);
    }

    public static final C1829Rc0 zzb(Callable callable, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, Object obj, AbstractC1870Sc0 abstractC1870Sc0) {
        return new C1829Rc0(abstractC1870Sc0, obj, AbstractC1870Sc0.f16308d, Collections.emptyList(), interfaceExecutorServiceC1974Un0.zzb(callable));
    }

    public static final C1829Rc0 zzc(com.google.common.util.concurrent.C c9, Object obj, AbstractC1870Sc0 abstractC1870Sc0) {
        return new C1829Rc0(abstractC1870Sc0, obj, AbstractC1870Sc0.f16308d, Collections.emptyList(), c9);
    }

    public static final C1829Rc0 zzd(final InterfaceC1256Dc0 interfaceC1256Dc0, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, Object obj, AbstractC1870Sc0 abstractC1870Sc0) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.Jc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                interfaceC1256Dc0.zza();
                return null;
            }
        }, interfaceExecutorServiceC1974Un0, obj, abstractC1870Sc0);
    }
}
