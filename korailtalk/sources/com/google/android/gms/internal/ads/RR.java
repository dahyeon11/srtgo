package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class RR {

    /* renamed from: f */
    private final Context f16105f;

    /* renamed from: g */
    private final WeakReference f16106g;

    /* renamed from: h */
    private final C5098zP f16107h;

    /* renamed from: i */
    private final Executor f16108i;

    /* renamed from: j */
    private final Executor f16109j;

    /* renamed from: k */
    private final ScheduledExecutorService f16110k;

    /* renamed from: l */
    private final VQ f16111l;

    /* renamed from: m */
    private final L1.a f16112m;

    /* renamed from: o */
    private final C2347bJ f16114o;

    /* renamed from: p */
    private final RunnableC5002yd0 f16115p;

    /* renamed from: a */
    private boolean f16100a = false;

    /* renamed from: b */
    private boolean f16101b = false;

    /* renamed from: c */
    private boolean f16102c = false;

    /* renamed from: e */
    private final C1203Bt f16104e = new C1203Bt();

    /* renamed from: n */
    private final Map f16113n = new ConcurrentHashMap();

    /* renamed from: q */
    private boolean f16116q = true;

    /* renamed from: d */
    private final long f16103d = G1.u.zzB().elapsedRealtime();

    public RR(Executor executor, Context context, WeakReference weakReference, Executor executor2, C5098zP c5098zP, ScheduledExecutorService scheduledExecutorService, VQ vq, L1.a aVar, C2347bJ c2347bJ, RunnableC5002yd0 runnableC5002yd0) {
        this.f16107h = c5098zP;
        this.f16105f = context;
        this.f16106g = weakReference;
        this.f16108i = executor2;
        this.f16110k = scheduledExecutorService;
        this.f16109j = executor;
        this.f16111l = vq;
        this.f16112m = aVar;
        this.f16114o = c2347bJ;
        this.f16115p = runnableC5002yd0;
        q("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void i(final RR rr, String str) throws JSONException {
        final InterfaceC3407kd0 interfaceC3407kd0Zza = AbstractC3293jd0.zza(rr.f16105f, EnumC1217Cd0.CUI_NAME_SDKINIT_ADAPTERINIT);
        interfaceC3407kd0Zza.zzj();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final InterfaceC3407kd0 interfaceC3407kd0Zza2 = AbstractC3293jd0.zza(rr.f16105f, EnumC1217Cd0.CUI_NAME_SDKINIT_ADAPTERINIT);
                interfaceC3407kd0Zza2.zzj();
                interfaceC3407kd0Zza2.zze(next);
                final Object obj = new Object();
                final C1203Bt c1203Bt = new C1203Bt();
                com.google.common.util.concurrent.C cZzo = AbstractC1483In0.zzo(c1203Bt, ((Long) H1.C.zzc().zza(AbstractC4439th.zzbP)).longValue(), TimeUnit.SECONDS, rr.f16110k);
                rr.f16111l.zzc(next);
                rr.f16114o.zzc(next);
                final long jElapsedRealtime = G1.u.zzB().elapsedRealtime();
                Iterator<String> it = itKeys;
                cZzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.GR
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.o(obj, c1203Bt, next, jElapsedRealtime, interfaceC3407kd0Zza2);
                    }
                }, rr.f16108i);
                arrayList.add(cZzo);
                final QR qr = new QR(rr, obj, next, jElapsedRealtime, interfaceC3407kd0Zza2, c1203Bt);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i8 = 0;
                        while (i8 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new C2968gm(strOptString, bundle));
                            i8++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                rr.q(next, false, "", 0);
                try {
                    try {
                        final C4087qb0 c4087qb0Zzc = rr.f16107h.zzc(next, new JSONObject());
                        rr.f16109j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.MR
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.l(next, qr, c4087qb0Zzc, arrayList2);
                            }
                        });
                    } catch (RemoteException e8) {
                        L1.n.zzh("", e8);
                    }
                } catch (C2112Ya0 unused2) {
                    qr.zze("Failed to create Adapter.");
                }
                itKeys = it;
            }
            AbstractC1483In0.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.HR
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.zza.f(interfaceC3407kd0Zza);
                    return null;
                }
            }, rr.f16108i);
        } catch (JSONException e9) {
            AbstractC0667v0.zzb("Malformed CLD response", e9);
            rr.f16114o.zza("MalformedJson");
            rr.f16111l.zza("MalformedJson");
            rr.f16104e.zzd(e9);
            G1.u.zzo().zzw(e9, "AdapterInitializer.updateAdapterStatus");
            RunnableC5002yd0 runnableC5002yd0 = rr.f16115p;
            interfaceC3407kd0Zza.zzi(e9);
            interfaceC3407kd0Zza.zzh(false);
            runnableC5002yd0.zzb(interfaceC3407kd0Zza.zzn());
        }
    }

    private final synchronized com.google.common.util.concurrent.C p() {
        String strZzc = G1.u.zzo().zzi().zzh().zzc();
        if (!TextUtils.isEmpty(strZzc)) {
            return AbstractC1483In0.zzh(strZzc);
        }
        final C1203Bt c1203Bt = new C1203Bt();
        G1.u.zzo().zzi().zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.IR
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.m(c1203Bt);
            }
        });
        return c1203Bt;
    }

    public final void q(String str, boolean z8, String str2, int i8) {
        this.f16113n.put(str, new C2051Wl(str, z8, i8, str2));
    }

    final /* synthetic */ Object f(InterfaceC3407kd0 interfaceC3407kd0) {
        this.f16104e.zzc(Boolean.TRUE);
        interfaceC3407kd0.zzh(true);
        this.f16115p.zzb(interfaceC3407kd0.zzn());
        return null;
    }

    final /* synthetic */ void k() {
        synchronized (this) {
            try {
                if (this.f16102c) {
                    return;
                }
                q("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (G1.u.zzB().elapsedRealtime() - this.f16103d));
                this.f16111l.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.f16114o.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.f16104e.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void l(String str, InterfaceC2280am interfaceC2280am, C4087qb0 c4087qb0, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    interfaceC2280am.zzf();
                    return;
                }
                Context context = (Context) this.f16106g.get();
                if (context == null) {
                    context = this.f16105f;
                }
                c4087qb0.zzi(context, interfaceC2280am, list);
            } catch (RemoteException e8) {
                throw new C2048Wj0(e8);
            } catch (C2112Ya0 unused) {
                interfaceC2280am.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e9) {
            L1.n.zzh("", e9);
        }
    }

    final /* synthetic */ void m(final C1203Bt c1203Bt) {
        this.f16108i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.FR
            @Override // java.lang.Runnable
            public final void run() {
                String strZzc = G1.u.zzo().zzi().zzh().zzc();
                boolean zIsEmpty = TextUtils.isEmpty(strZzc);
                C1203Bt c1203Bt2 = c1203Bt;
                if (zIsEmpty) {
                    c1203Bt2.zzd(new Exception());
                } else {
                    c1203Bt2.zzc(strZzc);
                }
            }
        });
    }

    final /* synthetic */ void n() {
        this.f16111l.zze();
        this.f16114o.zze();
        this.f16101b = true;
    }

    final /* synthetic */ void o(Object obj, C1203Bt c1203Bt, String str, long j8, InterfaceC3407kd0 interfaceC3407kd0) {
        synchronized (obj) {
            try {
                if (!c1203Bt.isDone()) {
                    q(str, false, "Timeout.", (int) (G1.u.zzB().elapsedRealtime() - j8));
                    this.f16111l.zzb(str, "timeout");
                    this.f16114o.zzb(str, "timeout");
                    RunnableC5002yd0 runnableC5002yd0 = this.f16115p;
                    interfaceC3407kd0.zzc("Timeout");
                    interfaceC3407kd0.zzh(false);
                    runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
                    c1203Bt.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f16113n.keySet()) {
            C2051Wl c2051Wl = (C2051Wl) this.f16113n.get(str);
            arrayList.add(new C2051Wl(str, c2051Wl.zzb, c2051Wl.zzc, c2051Wl.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.f16116q = false;
    }

    public final void zzr() {
        if (!((Boolean) AbstractC4783wi.zza.zze()).booleanValue()) {
            if (this.f16112m.clientJarVersion >= ((Integer) H1.C.zzc().zza(AbstractC4439th.zzbO)).intValue() && this.f16116q) {
                if (this.f16100a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f16100a) {
                            return;
                        }
                        this.f16111l.zzf();
                        this.f16114o.zzf();
                        this.f16104e.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.NR
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.n();
                            }
                        }, this.f16108i);
                        this.f16100a = true;
                        com.google.common.util.concurrent.C cP = p();
                        this.f16110k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.ER
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.k();
                            }
                        }, ((Long) H1.C.zzc().zza(AbstractC4439th.zzbQ)).longValue(), TimeUnit.SECONDS);
                        AbstractC1483In0.zzr(cP, new PR(this), this.f16108i);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f16100a) {
            return;
        }
        q("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f16104e.zzc(Boolean.FALSE);
        this.f16100a = true;
        this.f16101b = true;
    }

    public final void zzs(final InterfaceC2624dm interfaceC2624dm) {
        this.f16104e.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.JR
            @Override // java.lang.Runnable
            public final void run() {
                RR rr = this.zza;
                try {
                    interfaceC2624dm.zzb(rr.zzg());
                } catch (RemoteException e8) {
                    L1.n.zzh("", e8);
                }
            }
        }, this.f16109j);
    }

    public final boolean zzt() {
        return this.f16101b;
    }
}
