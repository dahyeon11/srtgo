package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.cR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2476cR implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final ZQ f18305a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f18306b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f18307c;

    public C2476cR(ZQ zq, XD0 xd0, XD0 xd02) {
        this.f18305a = zq;
        this.f18306b = xd0;
        this.f18307c = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C3391kR c3391kR = (C3391kR) this.f18306b.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        Set setZzc = ZQ.zzc(c3391kR, interfaceExecutorServiceC1974Un0);
        OD0.zzb(setZzc);
        return setZzc;
    }
}
