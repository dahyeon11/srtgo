package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class O60 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f15043a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f15044b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f15045c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f15046d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f15047e;

    public O60(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05) {
        this.f15043a = xd0;
        this.f15044b = xd02;
        this.f15045c = xd03;
        this.f15046d = xd04;
        this.f15047e = xd05;
    }

    public static M60 zza(String str, C2117Yd c2117Yd, C3666mt c3666mt, ScheduledExecutorService scheduledExecutorService, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        return new M60(str, c2117Yd, c3666mt, scheduledExecutorService, interfaceExecutorServiceC1974Un0);
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strZza = ((C4607v70) this.f15043a).zza();
        C2117Yd c2117Yd = new C2117Yd();
        C3666mt c3666mt = (C3666mt) this.f15045c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15046d.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new M60(strZza, c2117Yd, c3666mt, scheduledExecutorService, interfaceExecutorServiceC1974Un0);
    }
}
