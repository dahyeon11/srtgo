package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class F80 implements GD0 {

    /* renamed from: a */
    private final XD0 f12941a;

    /* renamed from: b */
    private final XD0 f12942b;

    /* renamed from: c */
    private final XD0 f12943c;

    /* renamed from: d */
    private final XD0 f12944d;

    /* renamed from: e */
    private final XD0 f12945e;

    /* renamed from: f */
    private final XD0 f12946f;

    /* renamed from: g */
    private final XD0 f12947g;

    /* renamed from: h */
    private final XD0 f12948h;

    public F80(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07, XD0 xd08) {
        this.f12941a = xd0;
        this.f12942b = xd02;
        this.f12943c = xd03;
        this.f12944d = xd04;
        this.f12945e = xd05;
        this.f12946f = xd06;
        this.f12947g = xd07;
        this.f12948h = xd08;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new E80((Context) this.f12941a.zzb(), (Executor) this.f12942b.zzb(), (H1.d2) this.f12943c.zzb(), (AbstractC2302ax) this.f12944d.zzb(), (C3000h10) this.f12945e.zzb(), (C3456l10) this.f12946f.zzb(), new C1743Pa0(), (C2345bI) this.f12948h.zzb());
    }
}
