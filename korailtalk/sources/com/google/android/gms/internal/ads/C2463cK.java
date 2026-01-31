package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.cK */
/* loaded from: classes2.dex */
public final class C2463cK extends YC {

    /* renamed from: j */
    private final Context f18281j;

    /* renamed from: k */
    private final WeakReference f18282k;

    /* renamed from: l */
    private final C2920gJ f18283l;

    /* renamed from: m */
    private final MK f18284m;

    /* renamed from: n */
    private final C4504uD f18285n;

    /* renamed from: o */
    private final C2613dg0 f18286o;

    /* renamed from: p */
    private final MF f18287p;

    /* renamed from: q */
    private final C4122qt f18288q;

    /* renamed from: r */
    private boolean f18289r;

    C2463cK(XC xc, Context context, InterfaceC2065Wv interfaceC2065Wv, C2920gJ c2920gJ, MK mk, C4504uD c4504uD, C2613dg0 c2613dg0, MF mf, C4122qt c4122qt) {
        super(xc);
        this.f18289r = false;
        this.f18281j = context;
        this.f18282k = new WeakReference(interfaceC2065Wv);
        this.f18283l = c2920gJ;
        this.f18284m = mk;
        this.f18285n = c4504uD;
        this.f18286o = c2613dg0;
        this.f18287p = mf;
        this.f18288q = c4122qt;
    }

    public final void finalize() throws Throwable {
        try {
            final InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) this.f18282k.get();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgU)).booleanValue()) {
                if (!this.f18289r && interfaceC2065Wv != null) {
                    AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bK
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

    public final boolean zza() {
        return this.f18285n.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(boolean r5, android.app.Activity r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.gJ r0 = r4.f18283l
            r0.zzb()
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzaC
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L4e
            G1.u.zzp()
            android.content.Context r0 = r4.f18281j
            boolean r0 = K1.K0.zzG(r0)
            if (r0 == 0) goto L4e
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            L1.n.zzj(r5)
            com.google.android.gms.internal.ads.MF r5 = r4.f18287p
            r5.zzb()
            com.google.android.gms.internal.ads.kh r5 = com.google.android.gms.internal.ads.AbstractC4439th.zzaD
            com.google.android.gms.internal.ads.rh r6 = H1.C.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lc4
            com.google.android.gms.internal.ads.dg0 r5 = r4.f18286o
            com.google.android.gms.internal.ads.Ia0 r6 = r4.f17344a
            com.google.android.gms.internal.ads.Ha0 r6 = r6.zzb
            com.google.android.gms.internal.ads.ya0 r6 = r6.zzb
            java.lang.String r6 = r6.zzb
            r5.zza(r6)
            goto Lc4
        L4e:
            java.lang.ref.WeakReference r0 = r4.f18282k
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.Wv r0 = (com.google.android.gms.internal.ads.InterfaceC2065Wv) r0
            com.google.android.gms.internal.ads.kh r2 = com.google.android.gms.internal.ads.AbstractC4439th.zzlQ
            com.google.android.gms.internal.ads.rh r3 = H1.C.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L92
            if (r0 == 0) goto L92
            com.google.android.gms.internal.ads.va0 r0 = r0.zzD()
            if (r0 == 0) goto L92
            boolean r2 = r0.zzas
            if (r2 == 0) goto L92
            int r0 = r0.zzat
            com.google.android.gms.internal.ads.qt r2 = r4.f18288q
            int r2 = r2.zzb()
            if (r0 == r2) goto L92
            java.lang.String r5 = "The interstitial consent form has been shown."
            L1.n.zzj(r5)
            com.google.android.gms.internal.ads.MF r5 = r4.f18287p
            r6 = 12
            java.lang.String r0 = "The consent form has already been shown."
            H1.f1 r6 = com.google.android.gms.internal.ads.AbstractC4542ub0.zzd(r6, r0, r3)
            r5.zza(r6)
            goto Lc4
        L92:
            boolean r0 = r4.f18289r
            if (r0 == 0) goto La6
            java.lang.String r0 = "The interstitial ad has been shown."
            L1.n.zzj(r0)
            com.google.android.gms.internal.ads.MF r0 = r4.f18287p
            r2 = 10
            H1.f1 r2 = com.google.android.gms.internal.ads.AbstractC4542ub0.zzd(r2, r3, r3)
            r0.zza(r2)
        La6:
            boolean r0 = r4.f18289r
            if (r0 != 0) goto Lc4
            if (r6 != 0) goto Lae
            android.content.Context r6 = r4.f18281j
        Lae:
            com.google.android.gms.internal.ads.MK r0 = r4.f18284m     // Catch: com.google.android.gms.internal.ads.LK -> Lbe
            com.google.android.gms.internal.ads.MF r2 = r4.f18287p     // Catch: com.google.android.gms.internal.ads.LK -> Lbe
            r0.zza(r5, r6, r2)     // Catch: com.google.android.gms.internal.ads.LK -> Lbe
            com.google.android.gms.internal.ads.gJ r5 = r4.f18283l     // Catch: com.google.android.gms.internal.ads.LK -> Lbe
            r5.zza()     // Catch: com.google.android.gms.internal.ads.LK -> Lbe
            r5 = 1
            r4.f18289r = r5
            return r5
        Lbe:
            r5 = move-exception
            com.google.android.gms.internal.ads.MF r6 = r4.f18287p
            r6.zzc(r5)
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2463cK.zzc(boolean, android.app.Activity):boolean");
    }
}
