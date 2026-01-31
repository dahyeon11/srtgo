package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class VA implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16789a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16790b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f16791c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f16792d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f16793e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f16794f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f16795g;

    /* renamed from: h, reason: collision with root package name */
    private final XD0 f16796h;

    /* renamed from: i, reason: collision with root package name */
    private final XD0 f16797i;

    /* renamed from: j, reason: collision with root package name */
    private final XD0 f16798j;

    /* renamed from: k, reason: collision with root package name */
    private final XD0 f16799k;

    /* renamed from: l, reason: collision with root package name */
    private final XD0 f16800l;

    /* renamed from: m, reason: collision with root package name */
    private final XD0 f16801m;

    /* renamed from: n, reason: collision with root package name */
    private final XD0 f16802n;

    /* renamed from: o, reason: collision with root package name */
    private final XD0 f16803o;

    public VA(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07, XD0 xd08, XD0 xd09, XD0 xd010, XD0 xd011, XD0 xd012, XD0 xd013, XD0 xd014, XD0 xd015) {
        this.f16789a = xd0;
        this.f16790b = xd02;
        this.f16791c = xd03;
        this.f16792d = xd04;
        this.f16793e = xd05;
        this.f16794f = xd06;
        this.f16795g = xd07;
        this.f16796h = xd08;
        this.f16797i = xd09;
        this.f16798j = xd010;
        this.f16799k = xd011;
        this.f16800l = xd012;
        this.f16801m = xd013;
        this.f16802n = xd014;
        this.f16803o = xd015;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f16789a).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new UA(contextZza, interfaceExecutorServiceC1974Un0, (Executor) this.f16791c.zzb(), (ScheduledExecutorService) this.f16792d.zzb(), ((C4390tD) this.f16793e).zza(), ((C4049qD) this.f16794f).zza(), (C3409ke0) this.f16795g.zzb(), (C2717eb0) this.f16796h.zzb(), (View) this.f16797i.zzb(), (InterfaceC2065Wv) this.f16798j.zzb(), (C2487cb) this.f16799k.zzb(), (C2084Xh) this.f16800l.zzb(), new C2166Zh(), (RunnableC4660vd0) this.f16802n.zzb(), ((C3597mF) this.f16803o).zza());
    }
}
