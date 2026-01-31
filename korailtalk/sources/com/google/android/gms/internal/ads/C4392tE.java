package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4392tE implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22797a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22798b;

    public C4392tE(XD0 xd0, XD0 xd02) {
        this.f22797a = xd0;
        this.f22798b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4630vJ((LH) this.f22797a.zzb(), (Executor) this.f22798b.zzb());
    }
}
