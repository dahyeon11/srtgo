package J1;

import H1.InterfaceC0517a;
import K1.K0;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC1854Rp;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C2368bX;
import com.google.android.gms.internal.ads.C2597dX;
import com.google.android.gms.internal.ads.C4797wp;
import com.google.android.gms.internal.ads.DJ;
import com.google.android.gms.internal.ads.HW;
import com.google.android.gms.internal.ads.HandlerC1634Mh0;
import com.google.android.gms.internal.ads.IW;
import com.google.android.gms.internal.ads.InterfaceC1568Kp;
import com.google.android.gms.internal.ads.InterfaceC2065Wv;
import com.google.android.gms.internal.ads.MF;
import java.util.Collections;
import org.json.JSONException;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public class u extends AbstractBinderC1854Rp implements InterfaceC0623f {

    /* renamed from: w */
    static final int f2548w = Color.argb(0, 0, 0, 0);

    /* renamed from: a */
    protected final Activity f2549a;

    /* renamed from: b */
    AdOverlayInfoParcel f2550b;

    /* renamed from: c */
    InterfaceC2065Wv f2551c;

    /* renamed from: d */
    p f2552d;

    /* renamed from: e */
    z f2553e;

    /* renamed from: g */
    FrameLayout f2555g;

    /* renamed from: h */
    WebChromeClient.CustomViewCallback f2556h;

    /* renamed from: k */
    o f2559k;

    /* renamed from: o */
    private Runnable f2563o;

    /* renamed from: p */
    private boolean f2564p;

    /* renamed from: q */
    private boolean f2565q;

    /* renamed from: u */
    private Toolbar f2569u;

    /* renamed from: f */
    boolean f2554f = false;

    /* renamed from: i */
    boolean f2557i = false;

    /* renamed from: j */
    boolean f2558j = false;

    /* renamed from: l */
    boolean f2560l = false;

    /* renamed from: v */
    int f2570v = 1;

    /* renamed from: m */
    private final Object f2561m = new Object();

    /* renamed from: n */
    private final View.OnClickListener f2562n = new m(this);

    /* renamed from: r */
    private boolean f2566r = false;

    /* renamed from: s */
    private boolean f2567s = false;

    /* renamed from: t */
    private boolean f2568t = true;

    public u(Activity activity) {
        this.f2549a = activity;
    }

    private final void c(View view) {
        C2597dX c2597dXZzQ;
        C2368bX c2368bXZzP;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfc)).booleanValue() && (c2368bXZzP = this.f2551c.zzP()) != null) {
            c2368bXZzP.zza(view);
        } else if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfb)).booleanValue() && (c2597dXZzQ = this.f2551c.zzQ()) != null && c2597dXZzQ.zzb()) {
            G1.u.zzA().zzg(c2597dXZzQ.zza(), view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f2550b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            G1.k r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r5.f2549a
            K1.c r4 = G1.u.zzq()
            boolean r6 = r4.zzd(r3, r6)
            boolean r3 = r5.f2558j
            if (r3 == 0) goto L36
            if (r0 != 0) goto L36
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzaG
            com.google.android.gms.internal.ads.rh r3 = H1.C.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L36
        L34:
            r1 = r2
            goto L57
        L36:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.kh r6 = com.google.android.gms.internal.ads.AbstractC4439th.zzaF
            com.google.android.gms.internal.ads.rh r0 = H1.C.zzc()
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L34
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f2550b
            if (r6 == 0) goto L57
            G1.k r6 = r6.zzo
            if (r6 == 0) goto L57
            boolean r6 = r6.zzg
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.app.Activity r6 = r5.f2549a
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzbf
            com.google.android.gms.internal.ads.rh r3 = H1.C.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7d
            if (r2 == 0) goto L7a
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7f
        L7a:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7f
        L7d:
            r0 = 256(0x100, float:3.59E-43)
        L7f:
            r6.setSystemUiVisibility(r0)
            return
        L83:
            r0 = 2048(0x800, float:2.87E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L9b
            r6.addFlags(r3)
            r6.clearFlags(r0)
            if (r2 == 0) goto L9a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L9a:
            return
        L9b:
            r6.addFlags(r0)
            r6.clearFlags(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.u.d(android.content.res.Configuration):void");
    }

    private static final void e(C2597dX c2597dX, View view) {
        if (c2597dX == null || view == null) {
            return;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfb)).booleanValue() && c2597dX.zzb()) {
            return;
        }
        G1.u.zzA().zzj(c2597dX.zza(), view);
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void b(boolean r27) throws org.json.JSONException, J1.n {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.u.b(boolean):void");
    }

    public final void zzA(int i8) {
        if (this.f2549a.getApplicationInfo().targetSdkVersion >= ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgh)).intValue()) {
            if (this.f2549a.getApplicationInfo().targetSdkVersion <= ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgi)).intValue()) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgj)).intValue()) {
                    if (i9 <= ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgk)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f2549a.setRequestedOrientation(i8);
        } catch (Throwable th) {
            G1.u.zzo().zzv(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z8) {
        if (z8) {
            this.f2559k.setBackgroundColor(0);
        } else {
            this.f2559k.setBackgroundColor(-16777216);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f2549a);
        this.f2555g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f2555g.addView(view, -1, -1);
        this.f2549a.setContentView(this.f2555g);
        this.f2565q = true;
        this.f2556h = customViewCallback;
        this.f2554f = true;
    }

    public final void zzE() {
        synchronized (this.f2561m) {
            try {
                this.f2564p = true;
                Runnable runnable = this.f2563o;
                if (runnable != null) {
                    HandlerC1634Mh0 handlerC1634Mh0 = K0.zza;
                    handlerC1634Mh0.removeCallbacks(runnable);
                    handlerC1634Mh0.post(this.f2563o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        w wVar;
        if (!this.f2549a.isFinishing() || this.f2566r) {
            return;
        }
        this.f2566r = true;
        InterfaceC2065Wv interfaceC2065Wv = this.f2551c;
        if (interfaceC2065Wv != null) {
            interfaceC2065Wv.zzZ(this.f2570v - 1);
            synchronized (this.f2561m) {
                try {
                    if (!this.f2564p && this.f2551c.zzaC()) {
                        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeN)).booleanValue() && !this.f2567s && (adOverlayInfoParcel = this.f2550b) != null && (wVar = adOverlayInfoParcel.zzc) != null) {
                            wVar.zzdq();
                        }
                        Runnable runnable = new Runnable() { // from class: J1.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzc();
                            }
                        };
                        this.f2563o = runnable;
                        K0.zza.postDelayed(runnable, ((Long) H1.C.zzc().zza(AbstractC4439th.zzaY)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    public final void zzG(String str) {
        Toolbar toolbar = this.f2569u;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final boolean zzH() {
        this.f2570v = 1;
        if (this.f2551c == null) {
            return true;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziU)).booleanValue() && this.f2551c.canGoBack()) {
            this.f2551c.goBack();
            return false;
        }
        boolean zZzaH = this.f2551c.zzaH();
        if (!zZzaH) {
            this.f2551c.zzd("onbackblocked", Collections.emptyMap());
        }
        return zZzaH;
    }

    public final void zzb() {
        this.f2570v = 3;
        this.f2549a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2550b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.f2549a.overridePendingTransition(0, 0);
    }

    final void zzc() {
        InterfaceC2065Wv interfaceC2065Wv;
        w wVar;
        if (this.f2567s) {
            return;
        }
        this.f2567s = true;
        InterfaceC2065Wv interfaceC2065Wv2 = this.f2551c;
        if (interfaceC2065Wv2 != null) {
            this.f2559k.removeView(interfaceC2065Wv2.zzF());
            p pVar = this.f2552d;
            if (pVar != null) {
                this.f2551c.zzan(pVar.zzd);
                this.f2551c.zzaq(false);
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzmE)).booleanValue() && this.f2551c.getParent() != null) {
                    ((ViewGroup) this.f2551c.getParent()).removeView(this.f2551c.zzF());
                }
                ViewGroup viewGroup = this.f2552d.zzc;
                View viewZzF = this.f2551c.zzF();
                p pVar2 = this.f2552d;
                viewGroup.addView(viewZzF, pVar2.zza, pVar2.zzb);
                this.f2552d = null;
            } else if (this.f2549a.getApplicationContext() != null) {
                this.f2551c.zzan(this.f2549a.getApplicationContext());
            }
            this.f2551c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2550b;
        if (adOverlayInfoParcel != null && (wVar = adOverlayInfoParcel.zzc) != null) {
            wVar.zzdu(this.f2570v);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2550b;
        if (adOverlayInfoParcel2 == null || (interfaceC2065Wv = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        e(interfaceC2065Wv.zzQ(), this.f2550b.zzd.zzF());
    }

    public final void zzd() {
        this.f2559k.f2546b = true;
    }

    protected final void zze() {
        this.f2551c.zzaa();
    }

    public final void zzf(IW iw) throws n {
        InterfaceC1568Kp interfaceC1568Kp;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2550b;
        if (adOverlayInfoParcel == null || (interfaceC1568Kp = adOverlayInfoParcel.zzv) == null) {
            throw new n("noioou");
        }
        interfaceC1568Kp.zzg(r2.b.wrap(iw));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2550b;
        if (adOverlayInfoParcel != null && this.f2554f) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.f2555g != null) {
            this.f2549a.setContentView(this.f2559k);
            this.f2565q = true;
            this.f2555g.removeAllViews();
            this.f2555g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f2556h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f2556h = null;
        }
        this.f2554f = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzi() {
        this.f2570v = 1;
    }

    @Override // J1.InterfaceC0623f
    public final void zzj() {
        this.f2570v = 2;
        this.f2549a.finish();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzk(InterfaceC6172a interfaceC6172a) {
        d((Configuration) r2.b.unwrap(interfaceC6172a));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public void zzl(Bundle bundle) throws JSONException, n {
        if (!this.f2565q) {
            this.f2549a.requestWindowFeature(1);
        }
        this.f2557i = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(this.f2549a.getIntent());
            this.f2550b = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new n("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f2549a.setShowWhenLocked(true);
                } else {
                    this.f2549a.getWindow().addFlags(524288);
                }
            }
            if (this.f2550b.zzm.clientJarVersion > 7500000) {
                this.f2570v = 4;
            }
            if (this.f2549a.getIntent() != null) {
                this.f2568t = this.f2549a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f2550b;
            G1.k kVar = adOverlayInfoParcel.zzo;
            if (kVar != null) {
                boolean z8 = kVar.zza;
                this.f2558j = z8;
                if (z8) {
                    if (adOverlayInfoParcel.zzk != 5 && kVar.zzf != -1) {
                        new s(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.f2558j = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new s(this, null).zzb();
                }
            } else {
                this.f2558j = false;
            }
            if (bundle == null) {
                if (this.f2568t) {
                    MF mf = this.f2550b.zzt;
                    if (mf != null) {
                        mf.zze();
                    }
                    w wVar = this.f2550b.zzc;
                    if (wVar != null) {
                        wVar.zzdr();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2550b;
                if (adOverlayInfoParcel2.zzk != 1) {
                    InterfaceC0517a interfaceC0517a = adOverlayInfoParcel2.zzb;
                    if (interfaceC0517a != null) {
                        interfaceC0517a.onAdClicked();
                    }
                    DJ dj = this.f2550b.zzu;
                    if (dj != null) {
                        dj.zzdG();
                    }
                }
            }
            Activity activity = this.f2549a;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f2550b;
            o oVar = new o(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.afmaVersion, adOverlayInfoParcel3.zzs);
            this.f2559k = oVar;
            oVar.setId(1000);
            G1.u.zzq().zzk(this.f2549a);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f2550b;
            int i8 = adOverlayInfoParcel4.zzk;
            if (i8 == 1) {
                b(false);
                return;
            }
            if (i8 == 2) {
                this.f2552d = new p(adOverlayInfoParcel4.zzd);
                b(false);
            } else if (i8 == 3) {
                b(true);
            } else {
                if (i8 != 5) {
                    throw new n("Could not determine ad overlay type.");
                }
                b(false);
            }
        } catch (n e8) {
            L1.n.zzj(e8.getMessage());
            this.f2570v = 4;
            this.f2549a.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzm() {
        InterfaceC2065Wv interfaceC2065Wv = this.f2551c;
        if (interfaceC2065Wv != null) {
            try {
                this.f2559k.removeView(interfaceC2065Wv.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.f2560l) {
            this.f2560l = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzo() {
        w wVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2550b;
        if (adOverlayInfoParcel != null && (wVar = adOverlayInfoParcel.zzc) != null) {
            wVar.zzdk();
        }
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeP)).booleanValue() && this.f2551c != null && (!this.f2549a.isFinishing() || this.f2552d == null)) {
            this.f2551c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzp(int i8, String[] strArr, int[] iArr) {
        if (i8 == 12345) {
            Activity activity = this.f2549a;
            HW hwZze = IW.zze();
            hwZze.zza(activity);
            hwZze.zzb(this.f2550b.zzk == 5 ? this : null);
            try {
                this.f2550b.zzv.zzf(strArr, iArr, r2.b.wrap(hwZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzr() {
        w wVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2550b;
        if (adOverlayInfoParcel != null && (wVar = adOverlayInfoParcel.zzc) != null) {
            wVar.zzdH();
        }
        d(this.f2549a.getResources().getConfiguration());
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeP)).booleanValue()) {
            return;
        }
        InterfaceC2065Wv interfaceC2065Wv = this.f2551c;
        if (interfaceC2065Wv == null || interfaceC2065Wv.zzaE()) {
            L1.n.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.f2551c.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f2557i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzt() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeP)).booleanValue()) {
            InterfaceC2065Wv interfaceC2065Wv = this.f2551c;
            if (interfaceC2065Wv == null || interfaceC2065Wv.zzaE()) {
                L1.n.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.f2551c.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzu() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeP)).booleanValue() && this.f2551c != null && (!this.f2549a.isFinishing() || this.f2552d == null)) {
            this.f2551c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzv() {
        w wVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2550b;
        if (adOverlayInfoParcel == null || (wVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        wVar.zzdt();
    }

    public final void zzw(boolean z8) throws JSONException {
        if (this.f2550b.zzw) {
            return;
        }
        int iIntValue = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzeS)).intValue();
        boolean z9 = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbb)).booleanValue() || z8;
        y yVar = new y();
        yVar.zzd = 50;
        yVar.zza = true != z9 ? 0 : iIntValue;
        yVar.zzb = true != z9 ? iIntValue : 0;
        yVar.zzc = iIntValue;
        this.f2553e = new z(this.f2549a, yVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z9 ? 9 : 11);
        zzy(z8, this.f2550b.zzg);
        this.f2559k.addView(this.f2553e, layoutParams);
        c(this.f2553e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzx() {
        this.f2565q = true;
    }

    public final void zzy(boolean z8, boolean z9) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        G1.k kVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        G1.k kVar2;
        boolean z10 = true;
        boolean z11 = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaZ)).booleanValue() && (adOverlayInfoParcel2 = this.f2550b) != null && (kVar2 = adOverlayInfoParcel2.zzo) != null && kVar2.zzh;
        boolean z12 = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzba)).booleanValue() && (adOverlayInfoParcel = this.f2550b) != null && (kVar = adOverlayInfoParcel.zzo) != null && kVar.zzi;
        if (z8 && z9 && z11 && !z12) {
            new C4797wp(this.f2551c, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        z zVar = this.f2553e;
        if (zVar != null) {
            if (!z12 && (!z9 || z11)) {
                z10 = false;
            }
            zVar.zzb(z10);
        }
    }

    public final void zzz() throws JSONException {
        this.f2559k.removeView(this.f2553e);
        zzw(true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzh(int i8, int i9, Intent intent) {
    }
}
