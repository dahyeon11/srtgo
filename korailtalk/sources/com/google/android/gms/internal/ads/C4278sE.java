package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.sE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4278sE implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22603a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22604b;

    public C4278sE(XD0 xd0, XD0 xd02) {
        this.f22603a = xd0;
        this.f22604b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4630vJ((LH) this.f22603a.zzb(), (Executor) this.f22604b.zzb());
    }
}
