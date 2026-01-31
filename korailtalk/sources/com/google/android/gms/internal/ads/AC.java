package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class AC implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f12151a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f12152b;

    public AC(XD0 xd0, XD0 xd02) {
        this.f12151a = xd0;
        this.f12152b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final C5072zC zzb() {
        return new C5072zC(((C3249jC) this.f12151a).zza(), (Executor) this.f12152b.zzb());
    }
}
