package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class VT implements XT {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16857a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f16858b;

    /* renamed from: c, reason: collision with root package name */
    private final WG f16859c;

    public VT(Map map, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, WG wg) {
        this.f16857a = map;
        this.f16858b = interfaceExecutorServiceC1974Un0;
        this.f16859c = wg;
    }

    @Override // com.google.android.gms.internal.ads.XT
    public final com.google.common.util.concurrent.C zzb(final C2519cr c2519cr) {
        this.f16859c.zzdn(c2519cr);
        com.google.common.util.concurrent.C cZzg = AbstractC1483In0.zzg(new RS(3));
        for (String str : ((String) H1.C.zzc().zza(AbstractC4439th.zzin)).split(",")) {
            final XD0 xd0 = (XD0) this.f16857a.get(str.trim());
            if (xd0 != null) {
                cZzg = AbstractC1483In0.zzf(cZzg, RS.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.TT
                    @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                    public final com.google.common.util.concurrent.C zza(Object obj) {
                        return ((XT) xd0.zzb()).zzb(c2519cr);
                    }
                }, this.f16858b);
            }
        }
        AbstractC1483In0.zzr(cZzg, new UT(this), AbstractC4805wt.zzf);
        return cZzg;
    }
}
