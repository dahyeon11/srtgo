package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class JA implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f13598a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f13599b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f13600c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f13601d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f13602e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f13603f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f13604g;

    public JA(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07) {
        this.f13598a = xd0;
        this.f13599b = xd02;
        this.f13600c = xd03;
        this.f13601d = xd04;
        this.f13602e = xd05;
        this.f13603f = xd06;
        this.f13604g = xd07;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f13598a).zza();
        InterfaceC0671x0 interfaceC0671x0Zzb = ((C2760ex) this.f13599b).zzb();
        C2711eX c2711eX = (C2711eX) this.f13600c.zzb();
        C3845oP c3845oP = (C3845oP) this.f13601d.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new IA(contextZza, interfaceC0671x0Zzb, c2711eX, c3845oP, interfaceExecutorServiceC1974Un0, (InterfaceExecutorServiceC1974Un0) this.f13603f.zzb(), (ScheduledExecutorService) this.f13604g.zzb());
    }
}
