package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import K1.C0638g0;
import android.content.Context;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.en */
/* loaded from: classes2.dex */
public final class C2740en {

    /* renamed from: b */
    private final Context f18818b;

    /* renamed from: c */
    private final String f18819c;

    /* renamed from: d */
    private final L1.a f18820d;

    /* renamed from: e */
    private final RunnableC5002yd0 f18821e;

    /* renamed from: f */
    private final K1.F f18822f;

    /* renamed from: g */
    private final K1.F f18823g;

    /* renamed from: h */
    private C2626dn f18824h;

    /* renamed from: a */
    private final Object f18817a = new Object();

    /* renamed from: i */
    private int f18825i = 1;

    public C2740en(Context context, L1.a aVar, String str, K1.F f8, K1.F f9, RunnableC5002yd0 runnableC5002yd0) {
        this.f18819c = str;
        this.f18818b = context.getApplicationContext();
        this.f18820d = aVar;
        this.f18821e = runnableC5002yd0;
        this.f18822f = f8;
        this.f18823g = f9;
    }

    protected final C2626dn c(C2487cb c2487cb) {
        InterfaceC3407kd0 interfaceC3407kd0Zza = AbstractC3293jd0.zza(this.f18818b, EnumC1217Cd0.CUI_NAME_SDKINIT_SDKCORE);
        interfaceC3407kd0Zza.zzj();
        final C2626dn c2626dn = new C2626dn(this.f18823g);
        AbstractC0667v0.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final C2487cb c2487cb2 = null;
        AbstractC4805wt.zze.execute(new Runnable(c2487cb2, c2626dn) { // from class: com.google.android.gms.internal.ads.Om
            public final /* synthetic */ C2626dn zzb;

            {
                this.zzb = c2626dn;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.i(null, this.zzb);
            }
        });
        AbstractC0667v0.zza("loadNewJavascriptEngine: Promise created");
        c2626dn.zzj(new C1930Tm(this, c2626dn, interfaceC3407kd0Zza), new C1971Um(this, c2626dn, interfaceC3407kd0Zza));
        return c2626dn;
    }

    final /* synthetic */ void h(C2626dn c2626dn, final InterfaceC5019ym interfaceC5019ym, ArrayList arrayList, long j8) {
        AbstractC0667v0.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.f18817a) {
            try {
                AbstractC0667v0.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (c2626dn.zze() != -1 && c2626dn.zze() != 1) {
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhO)).booleanValue()) {
                        c2626dn.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        c2626dn.zzg();
                    }
                    InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zze;
                    Objects.requireNonNull(interfaceC5019ym);
                    interfaceExecutorServiceC1974Un0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Mm
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC5019ym.zzc();
                        }
                    });
                    AbstractC0667v0.zza("Could not receive /jsLoaded in " + String.valueOf(H1.C.zzc().zza(AbstractC4439th.zzc)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + c2626dn.zze() + ". Update status(onEngLoadedTimeout) is " + this.f18825i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (G1.u.zzB().currentTimeMillis() - j8) + " ms. Rejecting.");
                    AbstractC0667v0.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                AbstractC0667v0.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void i(C2487cb c2487cb, C2626dn c2626dn) {
        long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC0667v0.zza("loadJavascriptEngine > Before createJavascriptEngine");
            C1398Gm c1398Gm = new C1398Gm(this.f18818b, this.f18820d, null, null);
            AbstractC0667v0.zza("loadJavascriptEngine > After createJavascriptEngine");
            AbstractC0667v0.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            c1398Gm.zzk(new C1684Nm(this, arrayList, jCurrentTimeMillis, c2626dn, c1398Gm));
            AbstractC0667v0.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            c1398Gm.zzq("/jsLoaded", new C1766Pm(this, jCurrentTimeMillis, c2626dn, c1398Gm));
            C0638g0 c0638g0 = new C0638g0();
            C1807Qm c1807Qm = new C1807Qm(this, null, c1398Gm, c0638g0);
            c0638g0.zzb(c1807Qm);
            AbstractC0667v0.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            c1398Gm.zzq("/requestReload", c1807Qm);
            AbstractC0667v0.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.f18819c)));
            if (this.f18819c.endsWith(".js")) {
                AbstractC0667v0.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                c1398Gm.zzh(this.f18819c);
                AbstractC0667v0.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.f18819c.startsWith("<html>")) {
                AbstractC0667v0.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                c1398Gm.zzf(this.f18819c);
                AbstractC0667v0.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                AbstractC0667v0.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                c1398Gm.zzg(this.f18819c);
                AbstractC0667v0.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            AbstractC0667v0.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            K1.K0.zza.postDelayed(new RunnableC1889Sm(this, c2626dn, c1398Gm, arrayList, jCurrentTimeMillis), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzd)).intValue());
        } catch (Throwable th) {
            L1.n.zzh("Error creating webview.", th);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhO)).booleanValue()) {
                c2626dn.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
            } else {
                G1.u.zzo().zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
                c2626dn.zzg();
            }
        }
    }

    final /* synthetic */ void j(InterfaceC5019ym interfaceC5019ym) {
        if (interfaceC5019ym.zzi()) {
            this.f18825i = 1;
        }
    }

    public final C2135Ym zzb(C2487cb c2487cb) {
        AbstractC0667v0.zza("getEngine: Trying to acquire lock");
        synchronized (this.f18817a) {
            try {
                AbstractC0667v0.zza("getEngine: Lock acquired");
                AbstractC0667v0.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f18817a) {
                    try {
                        AbstractC0667v0.zza("refreshIfDestroyed: Lock acquired");
                        C2626dn c2626dn = this.f18824h;
                        if (c2626dn != null && this.f18825i == 0) {
                            c2626dn.zzj(new InterfaceC1367Ft() { // from class: com.google.android.gms.internal.ads.Jm
                                @Override // com.google.android.gms.internal.ads.InterfaceC1367Ft
                                public final void zza(Object obj) {
                                    this.zza.j((InterfaceC5019ym) obj);
                                }
                            }, new InterfaceC1285Dt() { // from class: com.google.android.gms.internal.ads.Lm
                                @Override // com.google.android.gms.internal.ads.InterfaceC1285Dt
                                public final void zza() {
                                }
                            });
                        }
                    } finally {
                    }
                }
                AbstractC0667v0.zza("refreshIfDestroyed: Lock released");
                C2626dn c2626dn2 = this.f18824h;
                if (c2626dn2 != null && c2626dn2.zze() != -1) {
                    int i8 = this.f18825i;
                    if (i8 == 0) {
                        AbstractC0667v0.zza("getEngine (NO_UPDATE): Lock released");
                        return this.f18824h.zza();
                    }
                    if (i8 != 1) {
                        AbstractC0667v0.zza("getEngine (UPDATING): Lock released");
                        return this.f18824h.zza();
                    }
                    this.f18825i = 2;
                    c(null);
                    AbstractC0667v0.zza("getEngine (PENDING_UPDATE): Lock released");
                    return this.f18824h.zza();
                }
                this.f18825i = 2;
                this.f18824h = c(null);
                AbstractC0667v0.zza("getEngine (NULL or REJECTED): Lock released");
                return this.f18824h.zza();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
