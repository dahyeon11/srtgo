package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.tT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4418tT implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22868a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22869b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f22870c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f22871d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f22872e;

    public C4418tT(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05) {
        this.f22868a = xd0;
        this.f22869b = xd02;
        this.f22870c = xd03;
        this.f22871d = xd04;
        this.f22872e = xd05;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final C4304sT zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f22868a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un02 = AbstractC4805wt.zzb;
        OD0.zzb(interfaceExecutorServiceC1974Un02);
        return new C4304sT(scheduledExecutorService, interfaceExecutorServiceC1974Un0, interfaceExecutorServiceC1974Un02, ((LT) this.f22871d).zzb(), FD0.zza(SD0.zza(this.f22872e)));
    }
}
