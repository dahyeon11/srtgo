package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.uZ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4538uZ implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23072a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23073b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f23074c;

    public C4538uZ(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f23072a = xd0;
        this.f23073b = xd02;
        this.f23074c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4424tZ((Context) this.f23072a.zzb(), (Executor) this.f23073b.zzb(), (RO) this.f23074c.zzb());
    }
}
