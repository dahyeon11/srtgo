package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class RY implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16121a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16122b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f16123c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f16124d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f16125e;

    public RY(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05) {
        this.f16121a = xd0;
        this.f16122b = xd02;
        this.f16123c = xd03;
        this.f16124d = xd04;
        this.f16125e = xd05;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final PY zzb() {
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new PY(interfaceExecutorServiceC1974Un0, (ScheduledExecutorService) this.f16122b.zzb(), (InterfaceC2335bD) this.f16123c.zzb(), (C2943gZ) this.f16124d.zzb(), (C3409ke0) this.f16125e.zzb());
    }
}
