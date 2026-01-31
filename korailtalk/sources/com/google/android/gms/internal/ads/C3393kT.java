package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.kT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3393kT implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f20422a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f20423b;

    public C3393kT(XD0 xd0, XD0 xd02) {
        this.f20422a = xd0;
        this.f20423b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final FT zzb() {
        Context context = (Context) this.f20422a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new FT(context, interfaceExecutorServiceC1974Un0);
    }
}
