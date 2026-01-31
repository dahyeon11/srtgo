package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class WT implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f17004a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f17005b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f17006c;

    public WT(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f17004a = xd0;
        this.f17005b = xd02;
        this.f17006c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final VT zzb() {
        Map mapZzd = ((ND0) this.f17004a).zzd();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new VT(mapZzd, interfaceExecutorServiceC1974Un0, ((XG) this.f17006c).zzb());
    }
}
