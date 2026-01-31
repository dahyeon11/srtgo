package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.vV, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4648vV implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23227a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23228b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f23229c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f23230d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f23231e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f23232f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f23233g;

    public C4648vV(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07) {
        this.f23227a = xd0;
        this.f23228b = xd02;
        this.f23229c = xd03;
        this.f23230d = xd04;
        this.f23231e = xd05;
        this.f23232f = xd06;
        this.f23233g = xd07;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.E60, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.C60, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f23227a).zza();
        XD0 xd0 = this.f23229c;
        ?? Zzb = this.f23228b.zzb();
        ?? Zzb2 = xd0.zzb();
        C5104zV c5104zV = new C5104zV();
        CV cvZzb = ((DV) this.f23231e).zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new BinderC4534uV(contextZza, Zzb, Zzb2, c5104zV, cvZzb, interfaceExecutorServiceC1974Un0, new C3662mr());
    }
}
