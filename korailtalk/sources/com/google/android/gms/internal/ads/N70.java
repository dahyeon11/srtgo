package com.google.android.gms.internal.ads;

import K1.AbstractC0661s0;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class N70 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f14802a;

    public N70(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f14802a = interfaceExecutorServiceC1974Un0;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f14802a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.M70
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                String str = (String) H1.C.zzc().zza(AbstractC4439th.zzJ);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) H1.C.zzc().zza(AbstractC4439th.zzK)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, AbstractC0661s0.zza(str2));
                        }
                    }
                }
                return new O70(map);
            }
        });
    }
}
