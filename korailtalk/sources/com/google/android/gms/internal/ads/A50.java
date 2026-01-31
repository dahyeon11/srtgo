package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class A50 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f12141a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f12142b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f12143c;

    public A50(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f12141a = xd0;
        this.f12142b = xd02;
        this.f12143c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final C4945y50 zzb() {
        C1407Gs c1407Gs = (C1407Gs) this.f12141a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4945y50(c1407Gs, interfaceExecutorServiceC1974Un0, ((C2990gx) this.f12143c).zza());
    }
}
