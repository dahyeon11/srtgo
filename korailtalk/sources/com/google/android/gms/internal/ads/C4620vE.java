package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.vE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4620vE implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23190a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23191b;

    public C4620vE(XD0 xd0, XD0 xd02) {
        this.f23190a = xd0;
        this.f23191b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4630vJ((LH) this.f23190a.zzb(), (Executor) this.f23191b.zzb());
    }
}
