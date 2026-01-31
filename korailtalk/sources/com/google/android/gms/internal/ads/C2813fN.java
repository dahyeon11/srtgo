package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2813fN implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XM f19166a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f19167b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f19168c;

    public C2813fN(XM xm, XD0 xd0, XD0 xd02) {
        this.f19166a = xm;
        this.f19167b = xd0;
        this.f19168c = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4630vJ(((IO) this.f19167b).zzb(), (Executor) this.f19168c.zzb());
    }
}
