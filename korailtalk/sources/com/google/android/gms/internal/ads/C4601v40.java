package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.v40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4601v40 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f23168a;

    public C4601v40(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f23168a = interfaceExecutorServiceC1974Un0;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f23168a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.u40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", G1.u.zzo().zzb());
                return new C4715w40(bundle);
            }
        });
    }
}
