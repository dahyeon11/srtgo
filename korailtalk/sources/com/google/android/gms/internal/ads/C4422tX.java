package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tX, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4422tX implements InterfaceC3171iX {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5070zB f22874a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f22875b;

    /* renamed from: c, reason: collision with root package name */
    private final C3275jP f22876c;

    /* renamed from: d, reason: collision with root package name */
    private final C1825Ra0 f22877d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f22878e;

    /* renamed from: f, reason: collision with root package name */
    private final L1.a f22879f;

    /* renamed from: g, reason: collision with root package name */
    private final C2622dl f22880g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f22881h = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zziT)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final GW f22882i;

    public C4422tX(AbstractC5070zB abstractC5070zB, Context context, Executor executor, C3275jP c3275jP, C1825Ra0 c1825Ra0, L1.a aVar, C2622dl c2622dl, GW gw) {
        this.f22875b = context;
        this.f22874a = abstractC5070zB;
        this.f22878e = executor;
        this.f22876c = c3275jP;
        this.f22877d = c1825Ra0;
        this.f22879f = aVar;
        this.f22880g = c2622dl;
        this.f22882i = gw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.common.util.concurrent.C a(final C4654va0 c4654va0, C1457Ia0 c1457Ia0, C3731nP c3731nP, Object obj) {
        final InterfaceC2065Wv interfaceC2065WvZza = this.f22876c.zza(this.f22877d.zze, c4654va0, c1457Ia0.zzb.zzb);
        interfaceC2065WvZza.zzac(c4654va0.zzX);
        c3731nP.zza(this.f22875b, (View) interfaceC2065WvZza);
        C1203Bt c1203Bt = new C1203Bt();
        final AbstractC4728wB abstractC4728wBZza = this.f22874a.zza(new C3935pD(c1457Ia0, c4654va0, null), new C2922gK(new C4650vX(this.f22879f, c1203Bt, c4654va0, interfaceC2065WvZza, this.f22877d, this.f22881h, this.f22880g, this.f22882i), interfaceC2065WvZza), new C4842xB(c4654va0.zzab));
        abstractC4728wBZza.zzh().zzi(interfaceC2065WvZza, false, this.f22881h ? this.f22880g : null);
        c1203Bt.zzc(abstractC4728wBZza);
        abstractC4728wBZza.zzc().zzo(new VF() { // from class: com.google.android.gms.internal.ads.rX
            @Override // com.google.android.gms.internal.ads.VF
            public final void zzr() {
                InterfaceC2065Wv interfaceC2065Wv = interfaceC2065WvZza;
                if (interfaceC2065Wv.zzN() != null) {
                    interfaceC2065Wv.zzN().zzr();
                }
            }
        }, AbstractC4805wt.zzf);
        String strZzb = c4654va0.zzt.zza;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfc)).booleanValue() && abstractC4728wBZza.zzi().zze(true)) {
            strZzb = AbstractC1575Kw.zzb(strZzb, AbstractC1575Kw.zza(c4654va0));
        }
        abstractC4728wBZza.zzh();
        return AbstractC1483In0.zzm(C3162iP.zzj(interfaceC2065WvZza, c4654va0.zzt.zzb, strZzb), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.sX
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj2) {
                InterfaceC2065Wv interfaceC2065Wv = interfaceC2065WvZza;
                if (c4654va0.zzN) {
                    interfaceC2065Wv.zzah();
                }
                AbstractC4728wB abstractC4728wB = abstractC4728wBZza;
                interfaceC2065Wv.zzab();
                interfaceC2065Wv.onPause();
                return abstractC4728wB.zza();
            }
        }, this.f22878e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(final C1457Ia0 c1457Ia0, final C4654va0 c4654va0) {
        final C3731nP c3731nP = new C3731nP();
        com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(AbstractC1483In0.zzh(null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.pX
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a(c4654va0, c1457Ia0, c3731nP, obj);
            }
        }, this.f22878e);
        cZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.qX
            @Override // java.lang.Runnable
            public final void run() {
                c3731nP.zzb();
            }
        }, this.f22878e);
        return cZzn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        C1129Aa0 c1129Aa0 = c4654va0.zzt;
        return (c1129Aa0 == null || c1129Aa0.zza == null) ? false : true;
    }
}
