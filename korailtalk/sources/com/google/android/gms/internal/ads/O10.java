package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class O10 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f14980a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f14981b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f14982c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f14983d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f14984e;

    public O10(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05) {
        this.f14980a = xd0;
        this.f14981b = xd02;
        this.f14982c = xd03;
        this.f14983d = xd04;
        this.f14984e = xd05;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final L10 zzb() {
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = (InterfaceExecutorServiceC1974Un0) this.f14980a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un02 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un02);
        return new L10(interfaceExecutorServiceC1974Un0, interfaceExecutorServiceC1974Un02, ((C2990gx) this.f14982c).zza(), ((C4053qF) this.f14983d).zza(), ((KB) this.f14984e).zza());
    }
}
