package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.sY, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4309sY implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22657a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22658b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f22659c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f22660d;

    public C4309sY(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f22657a = xd0;
        this.f22658b = xd02;
        this.f22659c = xd03;
        this.f22660d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.f22657a.zzb();
        L1.a aVarZza = ((C4357sx) this.f22658b).zza();
        EK ek = (EK) this.f22659c.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4195rY(context, aVarZza, ek, interfaceExecutorServiceC1974Un0);
    }
}
