package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.m60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3580m60 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f20827a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f20828b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f20829c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f20830d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f20831e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f20832f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f20833g;

    public C3580m60(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07) {
        this.f20827a = xd0;
        this.f20828b = xd02;
        this.f20829c = xd03;
        this.f20830d = xd04;
        this.f20831e = xd05;
        this.f20832f = xd06;
        this.f20833g = xd07;
    }

    public static C3352k60 zza(C2523ct c2523ct, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i8, boolean z8, boolean z9) {
        return new C3352k60(c2523ct, context, scheduledExecutorService, executor, i8, z8, z9);
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C2523ct c2523ct = new C2523ct();
        Context contextZza = ((C2990gx) this.f20828b).zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f20829c.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C3352k60(c2523ct, contextZza, scheduledExecutorService, interfaceExecutorServiceC1974Un0, ((C4835x70) this.f20831e).zzb().intValue(), ((C4949y70) this.f20832f).zzb().booleanValue(), ((A70) this.f20833g).zzb().booleanValue());
    }
}
