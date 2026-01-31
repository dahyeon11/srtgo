package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class SN implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16271a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16272b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f16273c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f16274d;

    public SN(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f16271a = xd0;
        this.f16272b = xd02;
        this.f16273c = xd03;
        this.f16274d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new QN((Executor) this.f16271a.zzb(), (C4045qB) this.f16272b.zzb(), (C4858xJ) this.f16273c.zzb(), (IA) this.f16274d.zzb());
    }
}
