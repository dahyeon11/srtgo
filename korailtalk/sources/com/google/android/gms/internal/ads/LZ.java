package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class LZ implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f14302a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f14303b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f14304c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f14305d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f14306e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f14307f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f14308g;

    /* renamed from: h, reason: collision with root package name */
    private final XD0 f14309h;

    public LZ(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07, XD0 xd08) {
        this.f14302a = xd0;
        this.f14303b = xd02;
        this.f14304c = xd03;
        this.f14305d = xd04;
        this.f14306e = xd05;
        this.f14307f = xd06;
        this.f14308g = xd07;
        this.f14309h = xd08;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new KZ((Context) this.f14302a.zzb(), ((C4357sx) this.f14303b).zza(), ((C4053qF) this.f14304c).zza(), (Executor) this.f14305d.zzb(), (RO) this.f14306e.zzb(), (C3275jP) this.f14307f.zzb(), new C2622dl(), (GW) this.f14309h.zzb());
    }
}
