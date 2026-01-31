package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class LV {

    /* renamed from: a, reason: collision with root package name */
    private final HV f14290a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f14291b;

    public LV(HV hv, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f14290a = hv;
        this.f14291b = interfaceExecutorServiceC1974Un0;
    }

    public final void zza(InterfaceC1215Cc0 interfaceC1215Cc0) {
        final HV hv = this.f14290a;
        Objects.requireNonNull(hv);
        AbstractC1483In0.zzr(this.f14291b.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.JV
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return hv.getWritableDatabase();
            }
        }), new KV(this, interfaceC1215Cc0), this.f14291b);
    }
}
