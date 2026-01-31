package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.p50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3920p50 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f21633a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f21634b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f21635c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f21636d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f21637e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f21638f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f21639g;

    /* renamed from: h, reason: collision with root package name */
    private final XD0 f21640h;

    /* renamed from: i, reason: collision with root package name */
    private final XD0 f21641i;

    public C3920p50(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07, XD0 xd08, XD0 xd09) {
        this.f21633a = xd0;
        this.f21634b = xd02;
        this.f21635c = xd03;
        this.f21636d = xd04;
        this.f21637e = xd05;
        this.f21638f = xd06;
        this.f21639g = xd07;
        this.f21640h = xd08;
        this.f21641i = xd09;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C3692n50(interfaceExecutorServiceC1974Un0, (ScheduledExecutorService) this.f21634b.zzb(), (String) this.f21635c.zzb(), (B00) this.f21636d.zzb(), (Context) this.f21637e.zzb(), ((C4053qF) this.f21638f).zza(), (C4821x00) this.f21639g.zzb(), (C5098zP) this.f21640h.zzb(), (TR) this.f21641i.zzb());
    }
}
