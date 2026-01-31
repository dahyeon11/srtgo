package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.hR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3050hR implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final ZQ f19811a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f19812b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f19813c;

    public C3050hR(ZQ zq, XD0 xd0, XD0 xd02) {
        this.f19811a = zq;
        this.f19812b = xd0;
        this.f19813c = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C3391kR c3391kR = (C3391kR) this.f19812b.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        Set setZzh = ZQ.zzh(c3391kR, interfaceExecutorServiceC1974Un0);
        OD0.zzb(setZzh);
        return setZzh;
    }
}
