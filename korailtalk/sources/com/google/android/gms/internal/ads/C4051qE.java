package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4051qE implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f21888a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f21889b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f21890c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f21891d;

    public C4051qE(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f21888a = xd0;
        this.f21889b = xd02;
        this.f21890c = xd03;
        this.f21891d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f21888a).zza();
        RunnableC5002yd0 runnableC5002yd0 = (RunnableC5002yd0) this.f21889b.zzb();
        L1.a aVarZza = ((C4357sx) this.f21890c).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C3937pE(contextZza, runnableC5002yd0, aVarZza, interfaceExecutorServiceC1974Un0);
    }
}
