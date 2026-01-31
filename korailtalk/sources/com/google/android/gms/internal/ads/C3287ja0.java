package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ja0 */
/* loaded from: classes2.dex */
public final class C3287ja0 implements GD0 {

    /* renamed from: a */
    private final XD0 f20278a;

    /* renamed from: b */
    private final XD0 f20279b;

    /* renamed from: c */
    private final XD0 f20280c;

    /* renamed from: d */
    private final XD0 f20281d;

    /* renamed from: e */
    private final XD0 f20282e;

    /* renamed from: f */
    private final XD0 f20283f;

    /* renamed from: g */
    private final XD0 f20284g;

    public C3287ja0(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07) {
        this.f20278a = xd0;
        this.f20279b = xd02;
        this.f20280c = xd03;
        this.f20281d = xd04;
        this.f20282e = xd05;
        this.f20283f = xd06;
        this.f20284g = xd07;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3175ia0((Context) this.f20278a.zzb(), (Executor) this.f20279b.zzb(), (AbstractC2302ax) this.f20280c.zzb(), ((C3700n90) this.f20281d).zzb(), (X90) this.f20282e.zzb(), new C1743Pa0(), (C1498Ja0) this.f20284g.zzb());
    }
}
