package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.ads.Ua */
/* loaded from: classes2.dex */
public final class C1947Ua implements InterfaceC2070Xa {

    /* renamed from: r */
    private static C1947Ua f16672r;

    /* renamed from: a */
    private final Context f16673a;

    /* renamed from: b */
    private final C1632Mg0 f16674b;

    /* renamed from: c */
    private final C1960Ug0 f16675c;

    /* renamed from: d */
    private final C2042Wg0 f16676d;

    /* renamed from: e */
    private final C4883xb f16677e;

    /* renamed from: f */
    private final C1876Sf0 f16678f;

    /* renamed from: g */
    private final Executor f16679g;

    /* renamed from: h */
    private final EnumC1214Cc f16680h;

    /* renamed from: i */
    private final InterfaceC1919Tg0 f16681i;

    /* renamed from: k */
    private final C1703Ob f16683k;

    /* renamed from: l */
    private final C1335Fb f16684l;

    /* renamed from: m */
    private final C4655vb f16685m;

    /* renamed from: p */
    private volatile boolean f16688p;

    /* renamed from: q */
    private volatile boolean f16689q;

    /* renamed from: n */
    volatile long f16686n = 0;

    /* renamed from: o */
    private final Object f16687o = new Object();

    /* renamed from: j */
    private final CountDownLatch f16682j = new CountDownLatch(1);

    C1947Ua(Context context, C1876Sf0 c1876Sf0, C1632Mg0 c1632Mg0, C1960Ug0 c1960Ug0, C2042Wg0 c2042Wg0, C4883xb c4883xb, Executor executor, C1426Hf0 c1426Hf0, EnumC1214Cc enumC1214Cc, C1703Ob c1703Ob, C1335Fb c1335Fb, C4655vb c4655vb) {
        this.f16689q = false;
        this.f16673a = context;
        this.f16678f = c1876Sf0;
        this.f16674b = c1632Mg0;
        this.f16675c = c1960Ug0;
        this.f16676d = c2042Wg0;
        this.f16677e = c4883xb;
        this.f16679g = executor;
        this.f16680h = enumC1214Cc;
        this.f16683k = c1703Ob;
        this.f16684l = c1335Fb;
        this.f16685m = c4655vb;
        this.f16689q = false;
        this.f16681i = new C1865Sa(this, c1426Hf0);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00fc A[Catch: all -> 0x009d, pz0 -> 0x00a0, TryCatch #0 {pz0 -> 0x00a0, blocks: (B:67:0x0021, B:69:0x0032, B:73:0x0038, B:74:0x0044, B:76:0x0052, B:78:0x0060, B:81:0x006d, B:93:0x00a3, B:97:0x00bc, B:103:0x00d5, B:104:0x00e2, B:106:0x00e8, B:108:0x00f0, B:109:0x00f2, B:100:0x00c6, B:101:0x00cd, B:84:0x0074, B:86:0x008a, B:110:0x00fc, B:111:0x0109, B:112:0x0116), top: B:119:0x0021, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void d(com.google.android.gms.internal.ads.C1947Ua r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1947Ua.d(com.google.android.gms.internal.ads.Ua):void");
    }

    private final void g() {
        C1703Ob c1703Ob = this.f16683k;
        if (c1703Ob != null) {
            c1703Ob.zzh();
        }
    }

    private final C1592Lg0 h(int i8) {
        if (AbstractC5122zg0.zza(this.f16680h)) {
            return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcm)).booleanValue() ? this.f16675c.zzc(1) : this.f16674b.zzc(1);
        }
        return null;
    }

    public static synchronized C1947Ua zza(String str, Context context, boolean z8, boolean z9) {
        return zzb(str, context, Executors.newCachedThreadPool(), z8, z9);
    }

    @Deprecated
    public static synchronized C1947Ua zzb(String str, Context context, Executor executor, boolean z8, boolean z9) {
        try {
            if (f16672r == null) {
                AbstractC1917Tf0 abstractC1917Tf0Zza = AbstractC1958Uf0.zza();
                abstractC1917Tf0Zza.zza(str);
                abstractC1917Tf0Zza.zzc(z8);
                AbstractC1958Uf0 abstractC1958Uf0Zzd = abstractC1917Tf0Zza.zzd();
                C1876Sf0 c1876Sf0Zza = C1876Sf0.zza(context, executor, z9);
                C2946gb c2946gbZzc = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdq)).booleanValue() ? C2946gb.zzc(context) : null;
                C1703Ob c1703ObZzd = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdr)).booleanValue() ? C1703Ob.zzd(context, executor) : null;
                C1335Fb c1335Fb = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcF)).booleanValue() ? new C1335Fb() : null;
                C4655vb c4655vb = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcH)).booleanValue() ? new C4655vb() : null;
                C3527lg0 c3527lg0Zze = C3527lg0.zze(context, executor, c1876Sf0Zza, abstractC1958Uf0Zzd);
                C4769wb c4769wb = new C4769wb(context);
                C4883xb c4883xb = new C4883xb(abstractC1958Uf0Zzd, c3527lg0Zze, new ViewOnAttachStateChangeListenerC1581Lb(context, c4769wb), c4769wb, c2946gbZzc, c1703ObZzd, c1335Fb, c4655vb);
                EnumC1214Cc enumC1214CcZzb = AbstractC5122zg0.zzb(context, c1876Sf0Zza);
                C1426Hf0 c1426Hf0 = new C1426Hf0();
                C1947Ua c1947Ua = new C1947Ua(context, c1876Sf0Zza, new C1632Mg0(context, enumC1214CcZzb), new C1960Ug0(context, enumC1214CcZzb, new C1824Ra(c1876Sf0Zza), ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzco)).booleanValue()), new C2042Wg0(context, c4883xb, c1876Sf0Zza, c1426Hf0), c4883xb, executor, c1426Hf0, enumC1214CcZzb, c1703ObZzd, c1335Fb, c4655vb);
                f16672r = c1947Ua;
                c1947Ua.e();
                f16672r.zzp();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f16672r;
    }

    final synchronized void e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1592Lg0 c1592Lg0H = h(1);
        if (c1592Lg0H == null) {
            this.f16678f.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f16676d.zzc(c1592Lg0H)) {
            this.f16689q = true;
            this.f16682j.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zzf(Context context, String str, View view, Activity activity) {
        g();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcF)).booleanValue()) {
            this.f16684l.zzi();
        }
        zzp();
        InterfaceC1999Vf0 interfaceC1999Vf0Zza = this.f16676d.zza();
        if (interfaceC1999Vf0Zza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = interfaceC1999Vf0Zza.zza(context, null, str, view, activity);
        this.f16678f.zzf(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zzg(Context context) {
        g();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcF)).booleanValue()) {
            this.f16684l.zzj();
        }
        zzp();
        InterfaceC1999Vf0 interfaceC1999Vf0Zza = this.f16676d.zza();
        if (interfaceC1999Vf0Zza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = interfaceC1999Vf0Zza.zzc(context, null);
        this.f16678f.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zzh(Context context, View view, Activity activity) {
        g();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcF)).booleanValue()) {
            this.f16684l.zzk(context, view);
        }
        zzp();
        InterfaceC1999Vf0 interfaceC1999Vf0Zza = this.f16676d.zza();
        if (interfaceC1999Vf0Zza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = interfaceC1999Vf0Zza.zzb(context, null, view, activity);
        this.f16678f.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final void zzk(MotionEvent motionEvent) {
        InterfaceC1999Vf0 interfaceC1999Vf0Zza = this.f16676d.zza();
        if (interfaceC1999Vf0Zza != null) {
            try {
                interfaceC1999Vf0Zza.zzd(null, motionEvent);
            } catch (C2001Vg0 e8) {
                this.f16678f.zzc(e8.zza(), -1L, e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final void zzl(int i8, int i9, int i10) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlU)).booleanValue() || (displayMetrics = this.f16673a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f8 = i8;
        float f9 = displayMetrics.density;
        float f10 = i9;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f8 * f9, f10 * f9, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        float f11 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f8 * f11, f10 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        float f12 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i10, 1, f8 * f12, f10 * f12, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        C4655vb c4655vb = this.f16685m;
        if (c4655vb != null) {
            c4655vb.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final void zzo(View view) {
        this.f16677e.a(view);
    }

    public final void zzp() {
        if (this.f16688p) {
            return;
        }
        synchronized (this.f16687o) {
            try {
                if (!this.f16688p) {
                    if ((System.currentTimeMillis() / 1000) - this.f16686n < 3600) {
                        return;
                    }
                    C1592Lg0 c1592Lg0Zzb = this.f16676d.zzb();
                    if ((c1592Lg0Zzb == null || c1592Lg0Zzb.zzd(3600L)) && AbstractC5122zg0.zza(this.f16680h)) {
                        this.f16679g.execute(new RunnableC1906Ta(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.f16689q;
    }
}
