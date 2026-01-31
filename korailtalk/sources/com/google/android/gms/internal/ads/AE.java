package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class AE implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f12154a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f12155b;

    public AE(XD0 xd0, XD0 xd02) {
        this.f12154a = xd0;
        this.f12155b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4630vJ((LH) this.f12154a.zzb(), (Executor) this.f12155b.zzb());
    }
}
