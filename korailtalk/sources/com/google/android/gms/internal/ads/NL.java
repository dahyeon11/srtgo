package com.google.android.gms.internal.ads;

import H1.InterfaceC0583w0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import r2.InterfaceC6172a;

/* loaded from: classes2.dex */
public final class NL extends YC {
    public static final AbstractC2394bl0 zzc = AbstractC2394bl0.zzr("3010", "3008", "1005", "1009", "2011", "2007");

    /* renamed from: A */
    private final L1.a f14882A;

    /* renamed from: B */
    private final Context f14883B;

    /* renamed from: C */
    private final PL f14884C;

    /* renamed from: D */
    private final C3342k10 f14885D;

    /* renamed from: E */
    private final Map f14886E;

    /* renamed from: F */
    private final List f14887F;

    /* renamed from: G */
    private final C2074Xc f14888G;

    /* renamed from: j */
    private final Executor f14889j;

    /* renamed from: k */
    private final SL f14890k;

    /* renamed from: l */
    private final InterfaceC2353bM f14891l;

    /* renamed from: m */
    private final C4408tM f14892m;

    /* renamed from: n */
    private final XL f14893n;

    /* renamed from: o */
    private final C2696eM f14894o;

    /* renamed from: p */
    private final AD0 f14895p;

    /* renamed from: q */
    private final AD0 f14896q;

    /* renamed from: r */
    private final AD0 f14897r;

    /* renamed from: s */
    private final AD0 f14898s;

    /* renamed from: t */
    private final AD0 f14899t;

    /* renamed from: u */
    private QM f14900u;

    /* renamed from: v */
    private boolean f14901v;

    /* renamed from: w */
    private boolean f14902w;

    /* renamed from: x */
    private boolean f14903x;

    /* renamed from: y */
    private final C1243Cs f14904y;

    /* renamed from: z */
    private final C2487cb f14905z;

    public NL(XC xc, Executor executor, SL sl, InterfaceC2353bM interfaceC2353bM, C4408tM c4408tM, XL xl, C2696eM c2696eM, AD0 ad0, AD0 ad02, AD0 ad03, AD0 ad04, AD0 ad05, C1243Cs c1243Cs, C2487cb c2487cb, L1.a aVar, Context context, PL pl, C3342k10 c3342k10, C2074Xc c2074Xc) {
        super(xc);
        this.f14889j = executor;
        this.f14890k = sl;
        this.f14891l = interfaceC2353bM;
        this.f14892m = c4408tM;
        this.f14893n = xl;
        this.f14894o = c2696eM;
        this.f14895p = ad0;
        this.f14896q = ad02;
        this.f14897r = ad03;
        this.f14898s = ad04;
        this.f14899t = ad05;
        this.f14904y = c1243Cs;
        this.f14905z = c2487cb;
        this.f14882A = aVar;
        this.f14883B = context;
        this.f14884C = pl;
        this.f14885D = c3342k10;
        this.f14886E = new HashMap();
        this.f14887F = new ArrayList();
        this.f14888G = c2074Xc;
    }

    private final synchronized ImageView.ScaleType b() {
        QM qm = this.f14900u;
        if (qm == null) {
            L1.n.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        InterfaceC6172a interfaceC6172aZzj = qm.zzj();
        if (interfaceC6172aZzj != null) {
            return (ImageView.ScaleType) r2.b.unwrap(interfaceC6172aZzj);
        }
        return C4408tM.f22819k;
    }

    private final void c(String str, boolean z8) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfi)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        com.google.common.util.concurrent.C cZzw = this.f14890k.zzw();
        if (cZzw == null) {
            return;
        }
        AbstractC1483In0.zzr(cZzw, new LL(this, "Google", true), this.f14889j);
    }

    private final synchronized void d(View view, Map map, Map map2) {
        this.f14892m.zzd(this.f14900u);
        this.f14891l.zzq(view, map, map2, b());
        this.f14902w = true;
    }

    public final void e(View view, C2597dX c2597dX) {
        InterfaceC2065Wv interfaceC2065WvZzr = this.f14890k.zzr();
        if (!this.f14893n.zzd() || c2597dX == null || interfaceC2065WvZzr == null || view == null) {
            return;
        }
        G1.u.zzA().zzj(c2597dX.zza(), view);
    }

    /* renamed from: f */
    public final synchronized void o(QM qm) {
        Iterator<String> itKeys;
        View view;
        InterfaceC2070Xa interfaceC2070XaZzc;
        try {
            if (!this.f14901v) {
                this.f14900u = qm;
                this.f14892m.zze(qm);
                this.f14891l.zzy(qm.zzf(), qm.zzm(), qm.zzn(), qm, qm);
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcD)).booleanValue() && (interfaceC2070XaZzc = this.f14905z.zzc()) != null) {
                    interfaceC2070XaZzc.zzo(qm.zzf());
                }
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbL)).booleanValue()) {
                    C4654va0 c4654va0 = this.f17345b;
                    if (c4654va0.zzal && (itKeys = c4654va0.zzak.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            WeakReference weakReference = (WeakReference) this.f14900u.zzl().get(next);
                            this.f14886E.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ViewOnAttachStateChangeListenerC2033Wc viewOnAttachStateChangeListenerC2033Wc = new ViewOnAttachStateChangeListenerC2033Wc(this.f14883B, view);
                                this.f14887F.add(viewOnAttachStateChangeListenerC2033Wc);
                                viewOnAttachStateChangeListenerC2033Wc.zzc(new KL(this, next));
                            }
                        }
                    }
                }
                if (qm.zzi() != null) {
                    qm.zzi().zzc(this.f14904y);
                }
            }
        } finally {
        }
    }

    /* renamed from: g */
    public final void a(QM qm) {
        this.f14891l.zzz(qm.zzf(), qm.zzl());
        if (qm.zzh() != null) {
            qm.zzh().setClickable(false);
            qm.zzh().removeAllViews();
        }
        if (qm.zzi() != null) {
            qm.zzi().zze(this.f14904y);
        }
        this.f14900u = null;
    }

    public static boolean zzX(View view) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkE)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        G1.u.zzp();
        long jZzw = K1.K0.zzw(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jZzw >= ((Integer) H1.C.zzc().zza(AbstractC4439th.zzkF)).intValue()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void zzs(NL nl) {
        try {
            SL sl = nl.f14890k;
            int iZzc = sl.zzc();
            if (iZzc == 1) {
                if (nl.f14894o.zzb() != null) {
                    nl.c("Google", true);
                    nl.f14894o.zzb().zze((InterfaceC4557uj) nl.f14895p.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 2) {
                if (nl.f14894o.zza() != null) {
                    nl.c("Google", true);
                    nl.f14894o.zza().zze((InterfaceC4329sj) nl.f14896q.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 3) {
                if (nl.f14894o.zzd(sl.zzA()) != null) {
                    if (nl.f14890k.zzs() != null) {
                        nl.zzf("Google", true);
                    }
                    nl.f14894o.zzd(nl.f14890k.zzA()).zze((InterfaceC4899xj) nl.f14899t.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 6) {
                if (nl.f14894o.zzf() != null) {
                    nl.c("Google", true);
                    nl.f14894o.zzf().zze((InterfaceC2391bk) nl.f14897r.zzb());
                    return;
                }
                return;
            }
            if (iZzc != 7) {
                L1.n.zzg("Wrong native template id!");
                return;
            }
            C2696eM c2696eM = nl.f14894o;
            if (c2696eM.zzg() != null) {
                c2696eM.zzg().zzg((InterfaceC3652mm) nl.f14898s.zzb());
            }
        } catch (RemoteException e8) {
            L1.n.zzh("RemoteException when notifyAdLoad is called", e8);
        }
    }

    final /* synthetic */ void l() {
        this.f14891l.zzi();
        this.f14890k.zzI();
    }

    final /* synthetic */ void m(View view, boolean z8, int i8) {
        this.f14891l.zzo(view, this.f14900u.zzf(), this.f14900u.zzl(), this.f14900u.zzm(), z8, b(), i8);
    }

    final /* synthetic */ void n(boolean z8) {
        this.f14891l.zzo(null, this.f14900u.zzf(), this.f14900u.zzl(), this.f14900u.zzm(), z8, b(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0048 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:52:0x0001, B:55:0x0007, B:57:0x0019, B:59:0x001f, B:60:0x0029, B:62:0x002f, B:68:0x0048, B:71:0x005c, B:72:0x0064, B:74:0x006a, B:76:0x007e, B:78:0x0084, B:83:0x008b), top: B:88:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008b A[Catch: all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:52:0x0001, B:55:0x0007, B:57:0x0019, B:59:0x001f, B:60:0x0029, B:62:0x002f, B:68:0x0048, B:71:0x005c, B:72:0x0064, B:74:0x006a, B:76:0x007e, B:78:0x0084, B:83:0x008b), top: B:88:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzB(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f14902w     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L7
            goto L89
        L7:
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzbL     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.va0 r0 = r3.f17345b     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.zzal     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            java.util.Map r0 = r3.f14886E     // Catch: java.lang.Throwable -> L44
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L44
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L44
            java.util.Map r2 = r3.f14886E     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L29
            goto L89
        L44:
            r4 = move-exception
            goto L90
        L46:
            if (r7 != 0) goto L8b
            com.google.android.gms.internal.ads.kh r7 = com.google.android.gms.internal.ads.AbstractC4439th.zzdS     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.rh r0 = H1.C.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r7 = r0.zza(r7)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L44
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L89
            if (r5 == 0) goto L89
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L44
        L64:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L89
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L44
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L44
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L44
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L64
            boolean r0 = zzX(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L64
            r3.d(r4, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return
        L89:
            monitor-exit(r3)
            return
        L8b:
            r3.d(r4, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return
        L90:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.NL.zzB(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzC(H1.A0 a02) {
        this.f14891l.zzj(a02);
    }

    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z8) {
        this.f14892m.zzc(this.f14900u);
        this.f14891l.zzk(view, view2, map, map2, z8, b());
        if (this.f14903x) {
            SL sl = this.f14890k;
            if (sl.zzs() != null) {
                sl.zzs().zzd("onSdkAdUserInteractionClick", new O.a());
            }
        }
    }

    public final synchronized void zzE(final View view, final int i8) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlA)).booleanValue()) {
            QM qm = this.f14900u;
            if (qm == null) {
                L1.n.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z8 = qm instanceof ViewTreeObserverOnGlobalLayoutListenerC3725nM;
                this.f14889j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.HL
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.m(view, z8, i8);
                    }
                });
            }
        }
    }

    public final synchronized void zzF(String str) {
        this.f14891l.zzl(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.f14891l.zzm(bundle);
    }

    public final synchronized void zzH() {
        QM qm = this.f14900u;
        if (qm == null) {
            L1.n.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z8 = qm instanceof ViewTreeObserverOnGlobalLayoutListenerC3725nM;
            this.f14889j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.JL
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.n(z8);
                }
            });
        }
    }

    public final synchronized void zzI() {
        if (this.f14902w) {
            return;
        }
        this.f14891l.zzr();
    }

    public final void zzJ(View view) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfi)).booleanValue()) {
            e(view, this.f14890k.zzu());
            return;
        }
        C1203Bt c1203BtZzp = this.f14890k.zzp();
        if (c1203BtZzp == null) {
            return;
        }
        AbstractC1483In0.zzr(c1203BtZzp, new ML(this, view), this.f14889j);
    }

    public final synchronized void zzK(View view, MotionEvent motionEvent, View view2) {
        this.f14891l.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzL(Bundle bundle) {
        this.f14891l.zzt(bundle);
    }

    public final synchronized void zzM(View view) {
        this.f14891l.zzu(view);
    }

    public final synchronized void zzN() {
        this.f14891l.zzv();
    }

    public final synchronized void zzO(InterfaceC0583w0 interfaceC0583w0) {
        this.f14891l.zzw(interfaceC0583w0);
    }

    public final synchronized void zzP(H1.L0 l02) {
        this.f14885D.zza(l02);
    }

    public final synchronized void zzQ(InterfaceC2129Yj interfaceC2129Yj) {
        this.f14891l.zzx(interfaceC2129Yj);
    }

    public final synchronized void zzR(final QM qm) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbJ)).booleanValue()) {
            K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.DL
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.o(qm);
                }
            });
        } else {
            o(qm);
        }
    }

    public final synchronized void zzS(final QM qm) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbJ)).booleanValue()) {
            K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.EL
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.a(qm);
                }
            });
        } else {
            a(qm);
        }
    }

    public final boolean zzT() {
        return this.f14893n.zze();
    }

    public final synchronized boolean zzU() {
        return this.f14891l.zzA();
    }

    public final synchronized boolean zzV() {
        return this.f14891l.zzB();
    }

    public final boolean zzW() {
        return this.f14893n.zzd();
    }

    public final synchronized boolean zzY(Bundle bundle) {
        if (this.f14902w) {
            return true;
        }
        boolean zZzC = this.f14891l.zzC(bundle);
        this.f14902w = zZzC;
        return zZzC;
    }

    public final synchronized int zza() {
        return this.f14891l.zza();
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final synchronized void zzb() {
        this.f14901v = true;
        this.f14889j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.IL
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.l();
            }
        });
        super.zzb();
    }

    public final PL zzc() {
        return this.f14884C;
    }

    public final C2597dX zzf(String str, boolean z8) {
        String str2;
        EnumC2253aX enumC2253aX;
        ZW zw;
        if (!this.f14893n.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        SL sl = this.f14890k;
        InterfaceC2065Wv interfaceC2065WvZzr = sl.zzr();
        InterfaceC2065Wv interfaceC2065WvZzs = sl.zzs();
        if (interfaceC2065WvZzr == null && interfaceC2065WvZzs == null) {
            L1.n.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z9 = false;
        boolean z10 = interfaceC2065WvZzr != null;
        boolean z11 = interfaceC2065WvZzs != null;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfg)).booleanValue()) {
            this.f14893n.zza();
            int iZzc = this.f14893n.zza().zzc();
            int i8 = iZzc - 1;
            if (i8 != 0) {
                if (i8 != 1) {
                    L1.n.zzj("Unknown omid media type: " + (iZzc != 1 ? iZzc != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return null;
                }
                if (interfaceC2065WvZzr == null) {
                    L1.n.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
                z11 = false;
                z9 = true;
            } else {
                if (interfaceC2065WvZzs == null) {
                    L1.n.zzj("Omid media type was video but there was no video webview.");
                    return null;
                }
                z11 = true;
            }
        } else {
            z9 = z10;
        }
        if (z9) {
            str2 = null;
        } else {
            str2 = "javascript";
            interfaceC2065WvZzr = interfaceC2065WvZzs;
        }
        interfaceC2065WvZzr.zzG();
        if (!G1.u.zzA().zzl(this.f14883B)) {
            L1.n.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        L1.a aVar = this.f14882A;
        String str3 = aVar.buddyApkVersion + "." + aVar.clientJarVersion;
        if (z11) {
            zw = ZW.VIDEO;
            enumC2253aX = EnumC2253aX.DEFINED_BY_JAVASCRIPT;
        } else {
            SL sl2 = this.f14890k;
            ZW zw2 = ZW.NATIVE_DISPLAY;
            enumC2253aX = sl2.zzc() == 3 ? EnumC2253aX.UNSPECIFIED : EnumC2253aX.ONE_PIXEL;
            zw = zw2;
        }
        C2597dX c2597dXZzb = G1.u.zzA().zzb(str3, interfaceC2065WvZzr.zzG(), "", "javascript", str2, str, enumC2253aX, zw, this.f17345b.zzam);
        if (c2597dXZzb == null) {
            L1.n.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.f14890k.zzW(c2597dXZzb);
        interfaceC2065WvZzr.zzat(c2597dXZzb);
        if (z11) {
            G1.u.zzA().zzj(c2597dXZzb.zza(), interfaceC2065WvZzs.zzF());
            this.f14903x = true;
        }
        if (z8) {
            G1.u.zzA().zzk(c2597dXZzb.zza());
            interfaceC2065WvZzr.zzd("onSdkLoaded", new O.a());
        }
        return c2597dXZzb;
    }

    public final String zzg() {
        return this.f14893n.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.f14891l.zze(view, map, map2, b());
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final void zzj() {
        this.f14889j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.FL
            @Override // java.lang.Runnable
            public final void run() {
                NL.zzs(this.zza);
            }
        });
        if (this.f14890k.zzc() != 7) {
            Executor executor = this.f14889j;
            final InterfaceC2353bM interfaceC2353bM = this.f14891l;
            Objects.requireNonNull(interfaceC2353bM);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.GL
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2353bM.zzp();
                }
            });
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.f14891l.zzf(view, map, map2, b());
    }

    public final void zzu(View view) {
        C2597dX c2597dXZzu = this.f14890k.zzu();
        if (!this.f14893n.zzd() || c2597dXZzu == null || view == null) {
            return;
        }
        G1.u.zzA().zzg(c2597dXZzu.zza(), view);
    }

    public final synchronized void zzv() {
        this.f14891l.zzh();
    }
}
