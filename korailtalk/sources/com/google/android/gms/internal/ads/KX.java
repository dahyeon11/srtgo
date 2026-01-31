package com.google.android.gms.internal.ads;

import K1.C0666v;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class KX implements InterfaceC3171iX {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3819oC f13823a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13824b;

    /* renamed from: c, reason: collision with root package name */
    private final C3275jP f13825c;

    /* renamed from: d, reason: collision with root package name */
    private final C1825Ra0 f13826d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f13827e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3875oj0 f13828f;

    public KX(AbstractC3819oC abstractC3819oC, Context context, Executor executor, C3275jP c3275jP, C1825Ra0 c1825Ra0, InterfaceC3875oj0 interfaceC3875oj0) {
        this.f13824b = context;
        this.f13823a = abstractC3819oC;
        this.f13827e = executor;
        this.f13825c = c3275jP;
        this.f13826d = c1825Ra0;
        this.f13828f = interfaceC3875oj0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.common.util.concurrent.C a(C1457Ia0 c1457Ia0, C4654va0 c4654va0, Object obj) {
        View c3617mP;
        H1.d2 d2VarZza = AbstractC2071Xa0.zza(this.f13824b, c4654va0.zzv);
        final InterfaceC2065Wv interfaceC2065WvZza = this.f13825c.zza(d2VarZza, c4654va0, c1457Ia0.zzb.zzb);
        interfaceC2065WvZza.zzac(c4654va0.zzX);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhU)).booleanValue() && c4654va0.zzah) {
            c3617mP = KC.zza(this.f13824b, (View) interfaceC2065WvZza, c4654va0);
        } else {
            c3617mP = new C3617mP(this.f13824b, (View) interfaceC2065WvZza, (C0666v) this.f13828f.apply(c4654va0));
        }
        final NB nbZza = this.f13823a.zza(new C3935pD(c1457Ia0, c4654va0, null), new TB(c3617mP, interfaceC2065WvZza, new WC() { // from class: com.google.android.gms.internal.ads.EX
            @Override // com.google.android.gms.internal.ads.WC
            public final H1.V0 zza() {
                return interfaceC2065WvZza.zzq();
            }
        }, AbstractC2071Xa0.zzb(d2VarZza)));
        nbZza.zzh().zzi(interfaceC2065WvZza, false, null);
        TF tfZzc = nbZza.zzc();
        VF vf = new VF() { // from class: com.google.android.gms.internal.ads.FX
            @Override // com.google.android.gms.internal.ads.VF
            public final void zzr() {
                InterfaceC2065Wv interfaceC2065Wv = interfaceC2065WvZza;
                if (interfaceC2065Wv.zzN() != null) {
                    interfaceC2065Wv.zzN().zzr();
                }
            }
        };
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zzf;
        tfZzc.zzo(vf, interfaceExecutorServiceC1974Un0);
        String strZzb = c4654va0.zzt.zza;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfc)).booleanValue() && nbZza.zzi().zze(true)) {
            strZzb = AbstractC1575Kw.zzb(strZzb, AbstractC1575Kw.zza(c4654va0));
        }
        nbZza.zzh();
        com.google.common.util.concurrent.C cZzj = C3162iP.zzj(interfaceC2065WvZza, c4654va0.zzt.zzb, strZzb);
        if (c4654va0.zzN) {
            cZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.GX
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2065WvZza.zzah();
                }
            }, this.f13827e);
        }
        cZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.HX
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b(interfaceC2065WvZza);
            }
        }, this.f13827e);
        return AbstractC1483In0.zzm(cZzj, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.IX
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj2) {
                return nbZza.zza();
            }
        }, interfaceExecutorServiceC1974Un0);
    }

    final /* synthetic */ void b(InterfaceC2065Wv interfaceC2065Wv) {
        interfaceC2065Wv.zzab();
        BinderC1206Bw binderC1206BwZzq = interfaceC2065Wv.zzq();
        H1.R1 r12 = this.f13826d.zza;
        if (r12 != null && binderC1206BwZzq != null) {
            binderC1206BwZzq.zzs(r12);
        }
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbj)).booleanValue() || interfaceC2065Wv.isAttachedToWindow()) {
            return;
        }
        interfaceC2065Wv.onPause();
        interfaceC2065Wv.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(final C1457Ia0 c1457Ia0, final C4654va0 c4654va0) {
        return AbstractC1483In0.zzn(AbstractC1483In0.zzh(null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.JX
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a(c1457Ia0, c4654va0, obj);
            }
        }, this.f13827e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        C1129Aa0 c1129Aa0 = c4654va0.zzt;
        return (c1129Aa0 == null || c1129Aa0.zza == null) ? false : true;
    }
}
