package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.aR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2247aR implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final ZQ f17949a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f17950b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f17951c;

    public C2247aR(ZQ zq, XD0 xd0, XD0 xd02) {
        this.f17949a = zq;
        this.f17950b = xd0;
        this.f17951c = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C3391kR c3391kR = (C3391kR) this.f17950b.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        Set setZza = ZQ.zza(c3391kR, interfaceExecutorServiceC1974Un0);
        OD0.zzb(setZza);
        return setZza;
    }
}
