package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class U30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16574a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16575b;

    public U30(XD0 xd0, XD0 xd02) {
        this.f16574a = xd0;
        this.f16575b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final T30 zzb() {
        Context contextZza = ((C2990gx) this.f16574a).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new T30(contextZza, interfaceExecutorServiceC1974Un0);
    }
}
