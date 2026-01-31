package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.dR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2591dR implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final ZQ f18622a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f18623b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f18624c;

    public C2591dR(ZQ zq, XD0 xd0, XD0 xd02) {
        this.f18622a = zq;
        this.f18623b = xd0;
        this.f18624c = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C3391kR c3391kR = (C3391kR) this.f18623b.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        Set setZzd = ZQ.zzd(c3391kR, interfaceExecutorServiceC1974Un0);
        OD0.zzb(setZzd);
        return setZzd;
    }
}
