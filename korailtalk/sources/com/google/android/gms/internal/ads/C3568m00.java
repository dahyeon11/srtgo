package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m00, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3568m00 implements InterfaceC3171iX {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1756Ph f20797a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f20798b;

    /* renamed from: c, reason: collision with root package name */
    private final C2263ad0 f20799c;

    /* renamed from: d, reason: collision with root package name */
    private final C4593v00 f20800d;

    public C3568m00(C2263ad0 c2263ad0, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, InterfaceC1756Ph interfaceC1756Ph, C4593v00 c4593v00) {
        this.f20799c = c2263ad0;
        this.f20798b = interfaceExecutorServiceC1974Un0;
        this.f20797a = interfaceC1756Ph;
        this.f20800d = c4593v00;
    }

    final /* synthetic */ void a(BinderC1552Kh binderC1552Kh) {
        this.f20797a.zze(binderC1552Kh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        C1203Bt c1203Bt = new C1203Bt();
        C4137r00 c4137r00 = new C4137r00();
        c4137r00.zzd(new C3454l00(this, c1203Bt, c1457Ia0, c4654va0, c4137r00));
        C1129Aa0 c1129Aa0 = c4654va0.zzt;
        final BinderC1552Kh binderC1552Kh = new BinderC1552Kh(c4137r00, c1129Aa0.zzb, c1129Aa0.zza);
        EnumC1952Uc0 enumC1952Uc0 = EnumC1952Uc0.CUSTOM_RENDER_SYN;
        return AbstractC1543Kc0.zzd(new InterfaceC1256Dc0() { // from class: com.google.android.gms.internal.ads.k00
            @Override // com.google.android.gms.internal.ads.InterfaceC1256Dc0
            public final void zza() {
                this.zza.a(binderC1552Kh);
            }
        }, this.f20798b, enumC1952Uc0, this.f20799c).zzb(EnumC1952Uc0.CUSTOM_RENDER_ACK).zzd(c1203Bt).zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        C1129Aa0 c1129Aa0;
        return (this.f20797a == null || (c1129Aa0 = c4654va0.zzt) == null || c1129Aa0.zza == null) ? false : true;
    }
}
