package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Dx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1289Dx implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f12715a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f12716b;

    public C1289Dx(XD0 xd0, XD0 xd02) {
        this.f12715a = xd0;
        this.f12716b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final AbstractC2060Wq zzb() {
        Context contextZza = ((C2990gx) this.f12715a).zza();
        RunnableC5002yd0 runnableC5002yd0 = (RunnableC5002yd0) this.f12716b.zzb();
        C4451tn c4451tnZzb = G1.u.zzf().zzb(contextZza, L1.a.forPackage(), runnableC5002yd0);
        InterfaceC3768nn interfaceC3768nn = AbstractC4110qn.zza;
        c4451tnZzb.zza("google.afma.request.getAdDictionary", interfaceC3768nn, interfaceC3768nn);
        return new C2142Yq(contextZza, G1.u.zzf().zzb(contextZza, L1.a.forPackage(), runnableC5002yd0).zza("google.afma.sdkConstants.getSdkConstants", interfaceC3768nn, interfaceC3768nn), L1.a.forPackage());
    }
}
