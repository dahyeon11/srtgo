package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.wW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4763wW implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23515a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23516b;

    public C4763wW(XD0 xd0, XD0 xd02) {
        this.f23515a = xd0;
        this.f23516b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f23515a).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4535uW(contextZza, interfaceExecutorServiceC1974Un0);
    }
}
