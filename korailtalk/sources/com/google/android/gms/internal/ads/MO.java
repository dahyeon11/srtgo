package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class MO extends YC {

    /* renamed from: j */
    private final Context f14633j;

    /* renamed from: k */
    private final WeakReference f14634k;

    /* renamed from: l */
    private final MK f14635l;

    /* renamed from: m */
    private final C2920gJ f14636m;

    /* renamed from: n */
    private final MF f14637n;

    /* renamed from: o */
    private final C4738wG f14638o;

    /* renamed from: p */
    private final C4504uD f14639p;

    /* renamed from: q */
    private final InterfaceC1406Gr f14640q;

    /* renamed from: r */
    private final C2613dg0 f14641r;

    /* renamed from: s */
    private final C1539Ka0 f14642s;

    /* renamed from: t */
    private boolean f14643t;

    MO(XC xc, Context context, InterfaceC2065Wv interfaceC2065Wv, MK mk, C2920gJ c2920gJ, MF mf, C4738wG c4738wG, C4504uD c4504uD, C4654va0 c4654va0, C2613dg0 c2613dg0, C1539Ka0 c1539Ka0) {
        super(xc);
        this.f14643t = false;
        this.f14633j = context;
        this.f14635l = mk;
        this.f14634k = new WeakReference(interfaceC2065Wv);
        this.f14636m = c2920gJ;
        this.f14637n = mf;
        this.f14638o = c4738wG;
        this.f14639p = c4504uD;
        this.f14641r = c2613dg0;
        C1242Cr c1242Cr = c4654va0.zzm;
        this.f14640q = new BinderC2407bs(c1242Cr != null ? c1242Cr.zza : "", c1242Cr != null ? c1242Cr.zzb : 1);
        this.f14642s = c1539Ka0;
    }

    public final void finalize() throws Throwable {
        try {
            final InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) this.f14634k.get();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgU)).booleanValue()) {
                if (!this.f14643t && interfaceC2065Wv != null) {
                    AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.LO
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC2065Wv.destroy();
                        }
                    });
                }
            } else if (interfaceC2065Wv != null) {
                interfaceC2065Wv.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final Bundle zza() {
        return this.f14638o.zzb();
    }

    public final InterfaceC1406Gr zzc() {
        return this.f14640q;
    }

    public final C1539Ka0 zzd() {
        return this.f14642s;
    }

    public final boolean zze() {
        return this.f14639p.zzg();
    }

    public final boolean zzf() {
        return this.f14643t;
    }

    public final boolean zzg() {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) this.f14634k.get();
        return (interfaceC2065Wv == null || interfaceC2065Wv.zzaG()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzh(boolean z8, Activity activity) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaC)).booleanValue()) {
            G1.u.zzp();
            if (K1.K0.zzG(this.f14633j)) {
                L1.n.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f14637n.zzb();
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaD)).booleanValue()) {
                    this.f14641r.zza(this.f17344a.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.f14643t) {
            L1.n.zzj("The rewarded ad have been showed.");
            this.f14637n.zza(AbstractC4542ub0.zzd(10, null, null));
            return false;
        }
        this.f14643t = true;
        this.f14636m.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f14633j;
        }
        try {
            this.f14635l.zza(z8, activity2, this.f14637n);
            this.f14636m.zza();
            return true;
        } catch (LK e8) {
            this.f14637n.zzc(e8);
            return false;
        }
    }
}
