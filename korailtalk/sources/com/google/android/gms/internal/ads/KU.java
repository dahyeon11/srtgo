package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class KU implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f13813a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f13814b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f13815c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f13816d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f13817e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f13818f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f13819g;

    /* renamed from: h, reason: collision with root package name */
    private final XD0 f13820h;

    /* renamed from: i, reason: collision with root package name */
    private final XD0 f13821i;

    public KU(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07, XD0 xd08, XD0 xd09) {
        this.f13813a = xd0;
        this.f13814b = xd02;
        this.f13815c = xd03;
        this.f13816d = xd04;
        this.f13817e = xd05;
        this.f13818f = xd06;
        this.f13819g = xd07;
        this.f13820h = xd08;
        this.f13821i = xd09;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JU zzb() {
        WG wgZzb = ((XG) this.f13813a).zzb();
        C4078qU c4078qUZzb = ((C4305sU) this.f13814b).zzb();
        C2263ad0 c2263ad0 = (C2263ad0) this.f13815c.zzb();
        C1825Ra0 c1825Ra0Zza = ((C4053qF) this.f13816d).zza();
        L1.a aVarZza = ((C4357sx) this.f13817e).zza();
        RunnableC5002yd0 runnableC5002yd0 = (RunnableC5002yd0) this.f13818f.zzb();
        RunnableC4660vd0 runnableC4660vd0 = (RunnableC4660vd0) this.f13819g.zzb();
        Context contextZza = ((C2990gx) this.f13820h).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new JU(wgZzb, c4078qUZzb, c2263ad0, c1825Ra0Zza, aVarZza, runnableC5002yd0, runnableC4660vd0, contextZza, interfaceExecutorServiceC1974Un0);
    }
}
