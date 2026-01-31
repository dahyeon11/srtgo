package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class IY implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f13474a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f13475b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f13476c;

    public IY(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f13474a = xd0;
        this.f13475b = xd02;
        this.f13476c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new HY((Context) this.f13474a.zzb(), (AbstractC2351bL) this.f13475b.zzb(), (Executor) this.f13476c.zzb());
    }
}
