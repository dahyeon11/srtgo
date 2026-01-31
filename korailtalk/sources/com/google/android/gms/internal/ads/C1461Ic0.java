package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Ic0 */
/* loaded from: classes2.dex */
public final class C1461Ic0 {

    /* renamed from: a */
    private final Object f13480a;

    /* renamed from: b */
    private final List f13481b;

    /* renamed from: c */
    final /* synthetic */ AbstractC1870Sc0 f13482c;

    /* synthetic */ C1461Ic0(AbstractC1870Sc0 abstractC1870Sc0, Object obj, List list, AbstractC1420Hc0 abstractC1420Hc0) {
        this.f13482c = abstractC1870Sc0;
        this.f13480a = obj;
        this.f13481b = list;
    }

    public final C1829Rc0 zza(Callable callable) {
        C1442Hn0 c1442Hn0Zzb = AbstractC1483In0.zzb(this.f13481b);
        com.google.common.util.concurrent.C cZza = c1442Hn0Zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.Fc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, AbstractC4805wt.zzf);
        com.google.common.util.concurrent.C cZza2 = c1442Hn0Zzb.zza(callable, this.f13482c.f16309a);
        return new C1829Rc0(this.f13482c, this.f13480a, cZza, this.f13481b, cZza2);
    }
}
