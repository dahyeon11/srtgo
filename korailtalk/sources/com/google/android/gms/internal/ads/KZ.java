package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class KZ implements InterfaceC3171iX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13831a;

    /* renamed from: b, reason: collision with root package name */
    private final C3275jP f13832b;

    /* renamed from: c, reason: collision with root package name */
    private final RO f13833c;

    /* renamed from: d, reason: collision with root package name */
    private final C1825Ra0 f13834d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f13835e;

    /* renamed from: f, reason: collision with root package name */
    private final L1.a f13836f;

    /* renamed from: g, reason: collision with root package name */
    private final C2622dl f13837g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f13838h = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zziT)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final GW f13839i;

    public KZ(Context context, L1.a aVar, C1825Ra0 c1825Ra0, Executor executor, RO ro, C3275jP c3275jP, C2622dl c2622dl, GW gw) {
        this.f13831a = context;
        this.f13834d = c1825Ra0;
        this.f13833c = ro;
        this.f13835e = executor;
        this.f13836f = aVar;
        this.f13832b = c3275jP;
        this.f13837g = c2622dl;
        this.f13839i = gw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.common.util.concurrent.C a(final C4654va0 c4654va0, C1457Ia0 c1457Ia0, C3731nP c3731nP, Object obj) {
        final InterfaceC2065Wv interfaceC2065WvZza = this.f13832b.zza(this.f13834d.zze, c4654va0, c1457Ia0.zzb.zzb);
        interfaceC2065WvZza.zzac(c4654va0.zzX);
        c3731nP.zza(this.f13831a, (View) interfaceC2065WvZza);
        C1203Bt c1203Bt = new C1203Bt();
        final NO noZze = this.f13833c.zze(new C3935pD(c1457Ia0, c4654va0, null), new OO(new JZ(this.f13831a, this.f13832b, this.f13834d, this.f13836f, c4654va0, c1203Bt, interfaceC2065WvZza, this.f13837g, this.f13838h, this.f13839i), interfaceC2065WvZza));
        c1203Bt.zzc(noZze);
        C4447tl.zzb(interfaceC2065WvZza, noZze.zzg());
        noZze.zzc().zzo(new VF() { // from class: com.google.android.gms.internal.ads.FZ
            @Override // com.google.android.gms.internal.ads.VF
            public final void zzr() {
                InterfaceC2065Wv interfaceC2065Wv = interfaceC2065WvZza;
                if (interfaceC2065Wv.zzN() != null) {
                    interfaceC2065Wv.zzN().zzr();
                }
            }
        }, AbstractC4805wt.zzf);
        noZze.zzl().zzi(interfaceC2065WvZza, true, this.f13838h ? this.f13837g : null);
        String strZzb = c4654va0.zzt.zza;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfc)).booleanValue() && noZze.zzm().zze(true)) {
            strZzb = AbstractC1575Kw.zzb(strZzb, AbstractC1575Kw.zza(c4654va0));
        }
        noZze.zzl();
        return AbstractC1483In0.zzm(C3162iP.zzj(interfaceC2065WvZza, c4654va0.zzt.zzb, strZzb), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.GZ
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj2) {
                InterfaceC2065Wv interfaceC2065Wv = interfaceC2065WvZza;
                if (c4654va0.zzN) {
                    interfaceC2065Wv.zzah();
                }
                NO no = noZze;
                interfaceC2065Wv.zzab();
                interfaceC2065Wv.onPause();
                return no.zzi();
            }
        }, this.f13835e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(final C1457Ia0 c1457Ia0, final C4654va0 c4654va0) {
        final C3731nP c3731nP = new C3731nP();
        com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(AbstractC1483In0.zzh(null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.DZ
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a(c4654va0, c1457Ia0, c3731nP, obj);
            }
        }, this.f13835e);
        cZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.EZ
            @Override // java.lang.Runnable
            public final void run() {
                c3731nP.zzb();
            }
        }, this.f13835e);
        return cZzn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        C1129Aa0 c1129Aa0 = c4654va0.zzt;
        return (c1129Aa0 == null || c1129Aa0.zza == null) ? false : true;
    }
}
