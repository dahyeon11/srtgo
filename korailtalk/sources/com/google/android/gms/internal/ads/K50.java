package com.google.android.gms.internal.ads;

import K1.AbstractC0633e;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class K50 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f13741a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13742b;

    K50(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, Context context) {
        this.f13741a = interfaceExecutorServiceC1974Un0;
        this.f13742b = context;
    }

    final /* synthetic */ M50 a() {
        final Bundle bundleZzb = AbstractC0633e.zzb(this.f13742b, (String) H1.C.zzc().zza(AbstractC4439th.zzgo));
        if (bundleZzb.isEmpty()) {
            return null;
        }
        return new M50() { // from class: com.google.android.gms.internal.ads.J50
            @Override // com.google.android.gms.internal.ads.M50
            public final void zzj(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", bundleZzb);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f13741a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.I50
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
