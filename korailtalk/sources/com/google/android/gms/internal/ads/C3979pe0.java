package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.pe0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3979pe0 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f21790a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f21791b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f21792c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f21793d;

    public C3979pe0(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f21790a = xd0;
        this.f21791b = xd02;
        this.f21792c = xd03;
        this.f21793d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f21790a).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C3865oe0(contextZza, interfaceExecutorServiceC1974Un0, (L1.s) this.f21792c.zzb(), (RunnableC5002yd0) this.f21793d.zzb());
    }
}
