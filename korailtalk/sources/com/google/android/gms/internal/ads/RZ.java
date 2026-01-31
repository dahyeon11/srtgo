package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class RZ implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16126a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16127b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f16128c;

    public RZ(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f16126a = xd0;
        this.f16127b = xd02;
        this.f16128c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new QZ((Context) this.f16126a.zzb(), (Executor) this.f16127b.zzb(), (RO) this.f16128c.zzb());
    }
}
