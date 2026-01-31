package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2222aE implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f17926a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f17927b;

    public C2222aE(XD0 xd0, XD0 xd02) {
        this.f17926a = xd0;
        this.f17927b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        UA ua = (UA) this.f17926a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4630vJ(ua, interfaceExecutorServiceC1974Un0);
    }
}
