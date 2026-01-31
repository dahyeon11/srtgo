package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class FE implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f12970a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f12971b;

    public FE(XD0 xd0, XD0 xd02) {
        this.f12970a = xd0;
        this.f12971b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4630vJ((LH) this.f12970a.zzb(), (Executor) this.f12971b.zzb());
    }
}
