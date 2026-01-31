package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class F20 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f12912a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f12913b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f12914c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f12915d;

    public F20(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f12912a = xd0;
        this.f12913b = xd02;
        this.f12914c = xd03;
        this.f12915d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f12912a).zza();
        C3666mt c3666mt = (C3666mt) this.f12913b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f12914c.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new D20(contextZza, c3666mt, scheduledExecutorService, interfaceExecutorServiceC1974Un0);
    }
}
