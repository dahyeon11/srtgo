package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3134iB implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f19894a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f19895b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f19896c;

    public C3134iB(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f19894a = xd0;
        this.f19895b = xd02;
        this.f19896c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C1828Rc c1828Rc = (C1828Rc) this.f19894a.zzb();
        C1236Cn c1236Cn = (C1236Cn) this.f19895b.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0Zza = AbstractC3633mc0.zza();
        OD0.zzb(interfaceExecutorServiceC1974Un0Zza);
        return new C2216aB(c1828Rc.zzc(), c1236Cn, interfaceExecutorServiceC1974Un0Zza);
    }
}
