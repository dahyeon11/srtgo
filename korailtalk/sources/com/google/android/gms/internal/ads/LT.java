package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class LT implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f14288a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f14289b;

    public LT(XD0 xd0, XD0 xd02) {
        this.f14288a = xd0;
        this.f14289b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final KT zzb() {
        Context contextZza = ((C2990gx) this.f14288a).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new KT(contextZza, interfaceExecutorServiceC1974Un0);
    }
}
