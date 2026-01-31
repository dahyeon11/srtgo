package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class X60 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f17124a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f17125b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f17126c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f17127d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f17128e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f17129f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f17130g;

    public X60(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07) {
        this.f17124a = xd0;
        this.f17125b = xd02;
        this.f17126c = xd03;
        this.f17127d = xd04;
        this.f17128e = xd05;
        this.f17129f = xd06;
        this.f17130g = xd07;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C2523ct c2523ct = new C2523ct();
        int iIntValue = ((C4835x70) this.f17125b).zzb().intValue();
        Context contextZza = ((C2990gx) this.f17126c).zza();
        C3666mt c3666mt = (C3666mt) this.f17127d.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f17128e.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new S60(c2523ct, iIntValue, contextZza, c3666mt, scheduledExecutorService, interfaceExecutorServiceC1974Un0, ((C4607v70) this.f17130g).zza());
    }
}
