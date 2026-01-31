package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3158iN implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f19910a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f19911b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f19912c;

    public C3158iN(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f19910a = xd0;
        this.f19911b = xd02;
        this.f19912c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        K1.T t8 = (K1.T) this.f19910a.zzb();
        o2.f fVar = (o2.f) this.f19911b.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C3043hN(t8, fVar, interfaceExecutorServiceC1974Un0);
    }
}
