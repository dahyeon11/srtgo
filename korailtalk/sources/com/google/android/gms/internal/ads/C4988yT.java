package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.yT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4988yT implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23949a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23950b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f23951c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f23952d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f23953e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f23954f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f23955g;

    public C4988yT(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07) {
        this.f23949a = xd0;
        this.f23950b = xd02;
        this.f23951c = xd03;
        this.f23952d = xd04;
        this.f23953e = xd05;
        this.f23954f = xd06;
        this.f23955g = xd07;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f23949a).zza();
        C1825Ra0 c1825Ra0Zza = ((C4053qF) this.f23950b).zza();
        WS wsZzb = ((XS) this.f23951c).zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4874xT(contextZza, c1825Ra0Zza, wsZzb, interfaceExecutorServiceC1974Un0, (ScheduledExecutorService) this.f23953e.zzb(), (PV) this.f23954f.zzb(), (RunnableC4660vd0) this.f23955g.zzb());
    }
}
