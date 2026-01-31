package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.h60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3010h60 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f19753a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f19754b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f19755c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f19756d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f19757e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f19758f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f19759g;

    public C3010h60(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07) {
        this.f19753a = xd0;
        this.f19754b = xd02;
        this.f19755c = xd03;
        this.f19756d = xd04;
        this.f19757e = xd05;
        this.f19758f = xd06;
        this.f19759g = xd07;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceC0671x0 interfaceC0671x0Zzb = ((C2760ex) this.f19753a).zzb();
        Context contextZza = ((C2990gx) this.f19754b).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C2665e60(interfaceC0671x0Zzb, contextZza, interfaceExecutorServiceC1974Un0, (ScheduledExecutorService) this.f19756d.zzb(), ((C3056hX) this.f19757e).zzb(), ((C4053qF) this.f19758f).zza(), ((C4357sx) this.f19759g).zza());
    }
}
