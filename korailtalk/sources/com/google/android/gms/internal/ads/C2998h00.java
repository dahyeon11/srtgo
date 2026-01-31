package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.h00, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2998h00 implements InterfaceC3171iX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19729a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3819oC f19730b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1756Ph f19731c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f19732d;

    /* renamed from: e, reason: collision with root package name */
    private final C2263ad0 f19733e;

    public C2998h00(Context context, AbstractC3819oC abstractC3819oC, C2263ad0 c2263ad0, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, InterfaceC1756Ph interfaceC1756Ph) {
        this.f19729a = context;
        this.f19730b = abstractC3819oC;
        this.f19733e = c2263ad0;
        this.f19732d = interfaceExecutorServiceC1974Un0;
        this.f19731c = interfaceC1756Ph;
    }

    final /* synthetic */ void a(BinderC1552Kh binderC1552Kh) {
        this.f19731c.zze(binderC1552Kh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        C2768f00 c2768f00 = new C2768f00(this, new View(this.f19729a), null, new WC() { // from class: com.google.android.gms.internal.ads.d00
            @Override // com.google.android.gms.internal.ads.WC
            public final H1.V0 zza() {
                return null;
            }
        }, (C4768wa0) c4654va0.zzv.get(0));
        NB nbZza = this.f19730b.zza(new C3935pD(c1457Ia0, c4654va0, null), c2768f00);
        C2883g00 c2883g00Zzl = nbZza.zzl();
        C1129Aa0 c1129Aa0 = c4654va0.zzt;
        final BinderC1552Kh binderC1552Kh = new BinderC1552Kh(c2883g00Zzl, c1129Aa0.zzb, c1129Aa0.zza);
        EnumC1952Uc0 enumC1952Uc0 = EnumC1952Uc0.CUSTOM_RENDER_SYN;
        return AbstractC1543Kc0.zzd(new InterfaceC1256Dc0() { // from class: com.google.android.gms.internal.ads.e00
            @Override // com.google.android.gms.internal.ads.InterfaceC1256Dc0
            public final void zza() {
                this.zza.a(binderC1552Kh);
            }
        }, this.f19732d, enumC1952Uc0, this.f19733e).zzb(EnumC1952Uc0.CUSTOM_RENDER_ACK).zzd(AbstractC1483In0.zzh(nbZza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        C1129Aa0 c1129Aa0;
        return (this.f19731c == null || (c1129Aa0 = c4654va0.zzt) == null || c1129Aa0.zza == null) ? false : true;
    }
}
