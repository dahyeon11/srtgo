package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes2.dex */
public final class FB extends YC {

    /* renamed from: j */
    private final InterfaceC2065Wv f12954j;

    /* renamed from: k */
    private final int f12955k;

    /* renamed from: l */
    private final Context f12956l;

    /* renamed from: m */
    private final C4386tB f12957m;

    /* renamed from: n */
    private final MK f12958n;

    /* renamed from: o */
    private final C2920gJ f12959o;

    /* renamed from: p */
    private final MF f12960p;

    /* renamed from: q */
    private final boolean f12961q;

    /* renamed from: r */
    private final C4122qt f12962r;

    /* renamed from: s */
    private boolean f12963s;

    FB(XC xc, Context context, InterfaceC2065Wv interfaceC2065Wv, int i8, C4386tB c4386tB, MK mk, C2920gJ c2920gJ, MF mf, C4122qt c4122qt) {
        super(xc);
        this.f12963s = false;
        this.f12954j = interfaceC2065Wv;
        this.f12956l = context;
        this.f12955k = i8;
        this.f12957m = c4386tB;
        this.f12958n = mk;
        this.f12959o = c2920gJ;
        this.f12960p = mf;
        this.f12961q = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfs)).booleanValue();
        this.f12962r = c4122qt;
    }

    public final int zza() {
        return this.f12955k;
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final void zzb() {
        super.zzb();
        InterfaceC2065Wv interfaceC2065Wv = this.f12954j;
        if (interfaceC2065Wv != null) {
            interfaceC2065Wv.destroy();
        }
    }

    public final void zzc(InterfaceC1503Jd interfaceC1503Jd) {
        InterfaceC2065Wv interfaceC2065Wv = this.f12954j;
        if (interfaceC2065Wv != null) {
            interfaceC2065Wv.zzak(interfaceC1503Jd);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    public final void zzd(Activity activity, InterfaceC2035Wd interfaceC2035Wd, boolean z8) {
        InterfaceC2065Wv interfaceC2065Wv;
        C4654va0 c4654va0ZzD;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f12956l;
        }
        if (this.f12961q) {
            this.f12959o.zzb();
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaC)).booleanValue()) {
            G1.u.zzp();
            if (K1.K0.zzG(activity2)) {
                L1.n.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f12960p.zzb();
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaD)).booleanValue()) {
                    new C2613dg0(activity2.getApplicationContext(), G1.u.zzt().zzb()).zza(this.f17344a.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlQ)).booleanValue() && (interfaceC2065Wv = this.f12954j) != null && (c4654va0ZzD = interfaceC2065Wv.zzD()) != null && c4654va0ZzD.zzas && c4654va0ZzD.zzat != this.f12962r.zzb()) {
            L1.n.zzj("The app open consent form has been shown.");
            this.f12960p.zza(AbstractC4542ub0.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.f12963s) {
            L1.n.zzj("App open interstitial ad is already visible.");
            this.f12960p.zza(AbstractC4542ub0.zzd(10, null, null));
        }
        if (this.f12963s) {
            return;
        }
        try {
            this.f12958n.zza(z8, activity2, this.f12960p);
            if (this.f12961q) {
                this.f12959o.zza();
            }
            this.f12963s = true;
        } catch (LK e8) {
            this.f12960p.zzc(e8);
        }
    }

    public final void zze(long j8, int i8) {
        this.f12957m.zza(j8, i8);
    }
}
