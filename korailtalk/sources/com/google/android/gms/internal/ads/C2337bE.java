package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2337bE implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f18104a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f18105b;

    public C2337bE(XD0 xd0, XD0 xd02) {
        this.f18104a = xd0;
        this.f18105b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        UA ua = (UA) this.f18104a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4630vJ(ua, interfaceExecutorServiceC1974Un0);
    }
}
