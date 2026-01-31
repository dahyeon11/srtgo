package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class AL implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f12169a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f12170b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f12171c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f12172d;

    public AL(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f12169a = xd0;
        this.f12170b = xd02;
        this.f12171c = xd03;
        this.f12172d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C1828Rc c1828Rc = (C1828Rc) this.f12169a.zzb();
        Executor executor = (Executor) this.f12170b.zzb();
        Context context = (Context) this.f12171c.zzb();
        return new C4045qB(executor, new C2331bB(context, c1828Rc), (o2.f) this.f12172d.zzb());
    }
}
