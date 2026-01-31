package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class S50 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16193a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16194b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f16195c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f16196d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f16197e;

    public S50(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05) {
        this.f16193a = xd0;
        this.f16194b = xd02;
        this.f16195c = xd03;
        this.f16196d = xd04;
        this.f16197e = xd05;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Q50 zzb() {
        Context contextZza = ((C2990gx) this.f16193a).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new Q50(contextZza, interfaceExecutorServiceC1974Un0, ((VD0) this.f16195c).zzb(), (RunnableC4660vd0) this.f16196d.zzb(), (LQ) this.f16197e.zzb());
    }
}
