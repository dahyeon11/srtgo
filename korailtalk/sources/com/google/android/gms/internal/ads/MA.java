package com.google.android.gms.internal.ads;

import H1.C0534f1;
import java.util.List;

/* loaded from: classes2.dex */
public final class MA implements CF {

    /* renamed from: a, reason: collision with root package name */
    private final C4996ya0 f14539a;

    /* renamed from: b, reason: collision with root package name */
    private final C1457Ia0 f14540b;

    /* renamed from: c, reason: collision with root package name */
    private final C3409ke0 f14541c;

    /* renamed from: d, reason: collision with root package name */
    private final C3865oe0 f14542d;

    public MA(C1457Ia0 c1457Ia0, C3865oe0 c3865oe0, C3409ke0 c3409ke0) {
        this.f14540b = c1457Ia0;
        this.f14542d = c3865oe0;
        this.f14541c = c3409ke0;
        this.f14539a = c1457Ia0.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.CF
    public final void zzdB(C0534f1 c0534f1) {
        List list = this.f14539a.zza;
        this.f14542d.zzd(this.f14541c.zzc(this.f14540b, null, list));
    }
}
