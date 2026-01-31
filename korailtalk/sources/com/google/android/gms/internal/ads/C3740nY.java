package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nY, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3740nY implements InterfaceC3171iX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21296a;

    /* renamed from: b, reason: collision with root package name */
    private final C3275jP f21297b;

    /* renamed from: c, reason: collision with root package name */
    private final EK f21298c;

    /* renamed from: d, reason: collision with root package name */
    private final C1825Ra0 f21299d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f21300e;

    /* renamed from: f, reason: collision with root package name */
    private final L1.a f21301f;

    /* renamed from: g, reason: collision with root package name */
    private final C2622dl f21302g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f21303h = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zziT)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final GW f21304i;

    public C3740nY(Context context, L1.a aVar, C1825Ra0 c1825Ra0, Executor executor, EK ek, C3275jP c3275jP, C2622dl c2622dl, GW gw) {
        this.f21296a = context;
        this.f21299d = c1825Ra0;
        this.f21298c = ek;
        this.f21300e = executor;
        this.f21301f = aVar;
        this.f21297b = c3275jP;
        this.f21302g = c2622dl;
        this.f21304i = gw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.common.util.concurrent.C a(final C4654va0 c4654va0, C1457Ia0 c1457Ia0, C3731nP c3731nP, Object obj) {
        final InterfaceC2065Wv interfaceC2065WvZza = this.f21297b.zza(this.f21299d.zze, c4654va0, c1457Ia0.zzb.zzb);
        interfaceC2065WvZza.zzac(c4654va0.zzX);
        c3731nP.zza(this.f21296a, (View) interfaceC2065WvZza);
        C1203Bt c1203Bt = new C1203Bt();
        final AbstractC2578dK abstractC2578dKZze = this.f21298c.zze(new C3935pD(c1457Ia0, c4654va0, null), new C2922gK(new C3626mY(this.f21296a, this.f21301f, c1203Bt, c4654va0, interfaceC2065WvZza, this.f21299d, this.f21303h, this.f21302g, this.f21304i), interfaceC2065WvZza));
        c1203Bt.zzc(abstractC2578dKZze);
        abstractC2578dKZze.zzc().zzo(new VF() { // from class: com.google.android.gms.internal.ads.iY
            @Override // com.google.android.gms.internal.ads.VF
            public final void zzr() {
                InterfaceC2065Wv interfaceC2065Wv = interfaceC2065WvZza;
                if (interfaceC2065Wv.zzN() != null) {
                    interfaceC2065Wv.zzN().zzr();
                }
            }
        }, AbstractC4805wt.zzf);
        String strZzb = c4654va0.zzt.zza;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfc)).booleanValue() && abstractC2578dKZze.zzl().zze(true)) {
            strZzb = AbstractC1575Kw.zzb(strZzb, AbstractC1575Kw.zza(c4654va0));
        }
        abstractC2578dKZze.zzi().zzi(interfaceC2065WvZza, true, this.f21303h ? this.f21302g : null);
        abstractC2578dKZze.zzi();
        return AbstractC1483In0.zzm(C3162iP.zzj(interfaceC2065WvZza, c4654va0.zzt.zzb, strZzb), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.jY
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj2) {
                InterfaceC2065Wv interfaceC2065Wv = interfaceC2065WvZza;
                if (c4654va0.zzN) {
                    interfaceC2065Wv.zzah();
                }
                AbstractC2578dK abstractC2578dK = abstractC2578dKZze;
                interfaceC2065Wv.zzab();
                interfaceC2065Wv.onPause();
                return abstractC2578dK.zzg();
            }
        }, this.f21300e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(final C1457Ia0 c1457Ia0, final C4654va0 c4654va0) {
        final C3731nP c3731nP = new C3731nP();
        com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(AbstractC1483In0.zzh(null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.kY
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a(c4654va0, c1457Ia0, c3731nP, obj);
            }
        }, this.f21300e);
        cZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.lY
            @Override // java.lang.Runnable
            public final void run() {
                c3731nP.zzb();
            }
        }, this.f21300e);
        return cZzn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        C1129Aa0 c1129Aa0 = c4654va0.zzt;
        return (c1129Aa0 == null || c1129Aa0.zza == null) ? false : true;
    }
}
