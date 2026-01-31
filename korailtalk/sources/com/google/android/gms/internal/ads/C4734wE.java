package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4734wE implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23442a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23443b;

    public C4734wE(XD0 xd0, XD0 xd02) {
        this.f23442a = xd0;
        this.f23443b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4630vJ((LH) this.f23442a.zzb(), (Executor) this.f23443b.zzb());
    }
}
