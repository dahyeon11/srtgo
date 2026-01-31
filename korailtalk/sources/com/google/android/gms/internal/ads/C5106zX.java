package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.zX, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5106zX implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f24179a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f24180b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f24181c;

    public C5106zX(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f24179a = xd0;
        this.f24180b = xd02;
        this.f24181c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.f24179a.zzb();
        AbstractC5070zB abstractC5070zB = (AbstractC5070zB) this.f24180b.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4992yX(context, abstractC5070zB, interfaceExecutorServiceC1974Un0);
    }
}
