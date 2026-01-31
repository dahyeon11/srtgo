package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.xK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4860xK implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2922gK f23685a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23686b;

    public C4860xK(C2922gK c2922gK, XD0 xd0) {
        this.f23685a = c2922gK;
        this.f23686b = xd0;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.f23685a.zzd((Executor) this.f23686b.zzb());
    }
}
