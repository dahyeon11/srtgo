package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class PX implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f15343a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f15344b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f15345c;

    public PX(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f15343a = xd0;
        this.f15344b = xd02;
        this.f15345c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new OX((Context) this.f15343a.zzb(), (AbstractC3819oC) this.f15344b.zzb(), (Executor) this.f15345c.zzb());
    }
}
