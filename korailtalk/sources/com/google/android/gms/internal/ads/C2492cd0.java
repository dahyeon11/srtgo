package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.cd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2492cd0 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f18334a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f18335b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f18336c;

    public C2492cd0(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f18334a = xd0;
        this.f18335b = xd02;
        this.f18336c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C2263ad0(interfaceExecutorServiceC1974Un0, (ScheduledExecutorService) this.f18335b.zzb(), ((C2607dd0) this.f18336c).zzb());
    }
}
