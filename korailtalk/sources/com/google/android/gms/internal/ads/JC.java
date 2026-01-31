package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class JC implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f13609a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f13610b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f13611c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f13612d;

    public JC(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f13609a = xd0;
        this.f13610b = xd02;
        this.f13611c = xd03;
        this.f13612d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DC(((C3367kE) this.f13609a).zzb(), ((HC) this.f13610b).zza(), ((GC) this.f13611c).zza(), (Executor) this.f13612d.zzb());
    }
}
