package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* renamed from: com.google.android.gms.internal.ads.kV, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3395kV implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f20424a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f20425b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f20426c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f20427d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f20428e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f20429f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f20430g;

    /* renamed from: h, reason: collision with root package name */
    private final XD0 f20431h;

    public C3395kV(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07, XD0 xd08) {
        this.f20424a = xd0;
        this.f20425b = xd02;
        this.f20426c = xd03;
        this.f20427d = xd04;
        this.f20428e = xd05;
        this.f20429f = xd06;
        this.f20430g = xd07;
        this.f20431h = xd08;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f20424a).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new BinderC3281jV(contextZza, interfaceExecutorServiceC1974Un0, new C3662mr(), ((C4016px) this.f20427d).zzb(), ((DV) this.f20428e).zzb(), (ArrayDeque) this.f20429f.zzb(), new C5104zV(), (RunnableC5002yd0) this.f20431h.zzb());
    }
}
