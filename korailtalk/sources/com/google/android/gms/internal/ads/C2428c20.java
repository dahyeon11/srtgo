package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.c20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2428c20 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f18229a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f18230b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f18231c;

    public C2428c20(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f18229a = xd0;
        this.f18230b = xd02;
        this.f18231c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        com.google.common.util.concurrent.C c9 = (com.google.common.util.concurrent.C) this.f18229a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C2314b20(c9, interfaceExecutorServiceC1974Un0, (ScheduledExecutorService) this.f18231c.zzb());
    }
}
