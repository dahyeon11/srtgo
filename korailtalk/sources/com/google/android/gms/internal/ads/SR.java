package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class SR implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16283a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16284b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f16285c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f16286d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f16287e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f16288f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f16289g;

    /* renamed from: h, reason: collision with root package name */
    private final XD0 f16290h;

    /* renamed from: i, reason: collision with root package name */
    private final XD0 f16291i;

    /* renamed from: j, reason: collision with root package name */
    private final XD0 f16292j;

    public SR(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07, XD0 xd08, XD0 xd09, XD0 xd010) {
        this.f16283a = xd0;
        this.f16284b = xd02;
        this.f16285c = xd03;
        this.f16286d = xd04;
        this.f16287e = xd05;
        this.f16288f = xd06;
        this.f16289g = xd07;
        this.f16290h = xd08;
        this.f16291i = xd09;
        this.f16292j = xd010;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.f16283a.zzb();
        Context contextZza = ((C2990gx) this.f16284b).zza();
        WeakReference weakReferenceZza = ((C3105hx) this.f16285c).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new RR(executor, contextZza, weakReferenceZza, interfaceExecutorServiceC1974Un0, (C5098zP) this.f16287e.zzb(), (ScheduledExecutorService) this.f16288f.zzb(), (VQ) this.f16289g.zzb(), ((C4357sx) this.f16290h).zza(), ((C2461cJ) this.f16291i).zzb(), (RunnableC5002yd0) this.f16292j.zzb());
    }
}
