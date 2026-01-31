package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.w50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4717w50 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23393a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23394b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f23395c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f23396d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f23397e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f23398f;

    public C4717w50(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06) {
        this.f23393a = xd0;
        this.f23394b = xd02;
        this.f23395c = xd03;
        this.f23396d = xd04;
        this.f23397e = xd05;
        this.f23398f = xd06;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4489u50(interfaceExecutorServiceC1974Un0, (ScheduledExecutorService) this.f23394b.zzb(), (String) this.f23395c.zzb(), (Context) this.f23396d.zzb(), ((C4053qF) this.f23397e).zza(), (AbstractC2302ax) this.f23398f.zzb());
    }
}
