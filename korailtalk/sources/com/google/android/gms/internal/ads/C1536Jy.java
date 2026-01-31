package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Jy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1536Jy implements InterfaceC4758wR {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13711a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5131zl f13712b;

    /* renamed from: c, reason: collision with root package name */
    private final C2190Zx f13713c;

    /* renamed from: d, reason: collision with root package name */
    private final C1536Jy f13714d = this;

    /* renamed from: e, reason: collision with root package name */
    private final PD0 f13715e;

    /* renamed from: f, reason: collision with root package name */
    private final PD0 f13716f;

    /* renamed from: g, reason: collision with root package name */
    private final PD0 f13717g;

    /* renamed from: h, reason: collision with root package name */
    private final PD0 f13718h;

    /* synthetic */ C1536Jy(C2190Zx c2190Zx, Context context, InterfaceC5131zl interfaceC5131zl, AbstractC1495Iy abstractC1495Iy) {
        this.f13713c = c2190Zx;
        this.f13711a = context;
        this.f13712b = interfaceC5131zl;
        GD0 gd0Zza = HD0.zza(this);
        this.f13715e = gd0Zza;
        GD0 gd0Zza2 = HD0.zza(interfaceC5131zl);
        this.f13716f = gd0Zza2;
        C4302sR c4302sR = new C4302sR(gd0Zza2);
        this.f13717g = c4302sR;
        this.f13718h = FD0.zzc(new C4530uR(gd0Zza, c4302sR));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4758wR
    public final InterfaceC3733nR zzb() {
        return new C1290Dy(this.f13713c, this.f13714d, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4758wR
    public final BinderC4416tR zzd() {
        return (BinderC4416tR) this.f13718h.zzb();
    }
}
