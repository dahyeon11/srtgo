package com.google.android.gms.internal.ads;

import H1.AbstractBinderC0568r0;
import K1.C0666v;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import i2.AbstractC5683p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.vz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4703vz extends AbstractBinderC0568r0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23371a;

    /* renamed from: b, reason: collision with root package name */
    private final L1.a f23372b;

    /* renamed from: c, reason: collision with root package name */
    private final C5098zP f23373c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3397kX f23374d;

    /* renamed from: e, reason: collision with root package name */
    private final B00 f23375e;

    /* renamed from: f, reason: collision with root package name */
    private final RR f23376f;

    /* renamed from: g, reason: collision with root package name */
    private final C1407Gs f23377g;

    /* renamed from: h, reason: collision with root package name */
    private final EP f23378h;

    /* renamed from: i, reason: collision with root package name */
    private final C3734nS f23379i;

    /* renamed from: j, reason: collision with root package name */
    private final C1554Ki f23380j;

    /* renamed from: k, reason: collision with root package name */
    private final RunnableC5002yd0 f23381k;

    /* renamed from: l, reason: collision with root package name */
    private final C3859ob0 f23382l;

    /* renamed from: m, reason: collision with root package name */
    private final C3937pE f23383m;

    /* renamed from: n, reason: collision with root package name */
    private final LQ f23384n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23385o = false;

    /* renamed from: p, reason: collision with root package name */
    private final Long f23386p = Long.valueOf(G1.u.zzB().elapsedRealtime());

    BinderC4703vz(Context context, L1.a aVar, C5098zP c5098zP, InterfaceC3397kX interfaceC3397kX, B00 b00, RR rr, C1407Gs c1407Gs, EP ep, C3734nS c3734nS, C1554Ki c1554Ki, RunnableC5002yd0 runnableC5002yd0, C3859ob0 c3859ob0, C3937pE c3937pE, LQ lq) {
        this.f23371a = context;
        this.f23372b = aVar;
        this.f23373c = c5098zP;
        this.f23374d = interfaceC3397kX;
        this.f23375e = b00;
        this.f23376f = rr;
        this.f23377g = c1407Gs;
        this.f23378h = ep;
        this.f23379i = c3734nS;
        this.f23380j = c1554Ki;
        this.f23381k = runnableC5002yd0;
        this.f23382l = c3859ob0;
        this.f23383m = c3937pE;
        this.f23384n = lq;
    }

    final void b(Runnable runnable) {
        AbstractC5683p.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZze = G1.u.zzo().zzi().zzh().zze();
        if (mapZze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                L1.n.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f23373c.zzd()) {
            HashMap map = new HashMap();
            Iterator it = mapZze.values().iterator();
            while (it.hasNext()) {
                for (C1564Kn c1564Kn : ((C1605Ln) it.next()).zza) {
                    String str = c1564Kn.zzk;
                    for (String str2 : c1564Kn.zzc) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    C3511lX c3511lXZza = this.f23374d.zza(str3, jSONObject);
                    if (c3511lXZza != null) {
                        C4087qb0 c4087qb0 = (C4087qb0) c3511lXZza.zzb;
                        if (!c4087qb0.zzC() && c4087qb0.zzB()) {
                            c4087qb0.zzj(this.f23371a, (BinderC3057hY) c3511lXZza.zzc, (List) entry.getValue());
                            L1.n.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (C2112Ya0 e8) {
                    L1.n.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e8);
                }
            }
        }
    }

    final void zzb() {
        if (G1.u.zzo().zzi().zzR()) {
            String strZzl = G1.u.zzo().zzi().zzl();
            if (G1.u.zzs().zzj(this.f23371a, strZzl, this.f23372b.afmaVersion)) {
                return;
            }
            G1.u.zzo().zzi().zzC(false);
            G1.u.zzo().zzi().zzB("");
        }
    }

    final /* synthetic */ void zzd() {
        AbstractC4884xb0.zzb(this.f23371a, true);
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final synchronized float zze() {
        return G1.u.zzr().zza();
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final String zzf() {
        return this.f23372b.afmaVersion;
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final List zzg() {
        return this.f23376f.zzg();
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzh(String str) {
        this.f23375e.zzg(str);
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzi() {
        this.f23376f.zzl();
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzj(boolean z8) throws RemoteException {
        try {
            C2167Zh0.zzi(this.f23371a).zzn(z8);
        } catch (IOException e8) {
            throw new RemoteException(e8.getMessage());
        }
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final synchronized void zzk() {
        if (this.f23385o) {
            L1.n.zzj("Mobile ads is initialized already.");
            return;
        }
        AbstractC4439th.zza(this.f23371a);
        G1.u.zzo().zzu(this.f23371a, this.f23372b);
        this.f23383m.zzd();
        G1.u.zzc().zzi(this.f23371a);
        this.f23385o = true;
        this.f23376f.zzr();
        this.f23375e.zze();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdY)).booleanValue()) {
            this.f23378h.zzc();
        }
        this.f23379i.zzg();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjj)).booleanValue()) {
            AbstractC4805wt.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkT)).booleanValue()) {
            AbstractC4805wt.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzw();
                }
            });
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcO)).booleanValue()) {
            AbstractC4805wt.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd();
                }
            });
        }
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzl(String str, InterfaceC6172a interfaceC6172a) throws JSONException {
        String strZzp;
        Runnable runnable;
        AbstractC4439th.zza(this.f23371a);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzec)).booleanValue()) {
            try {
                G1.u.zzp();
                strZzp = K1.K0.zzp(this.f23371a);
            } catch (RemoteException e8) {
                G1.u.zzo().zzw(e8, "NonagonMobileAdsSettingManager_AppId");
            }
        } else {
            strZzp = "";
        }
        boolean z8 = true;
        String str2 = true == TextUtils.isEmpty(strZzp) ? str : strZzp;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdW)).booleanValue();
        AbstractC3414kh abstractC3414kh = AbstractC4439th.zzaR;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue();
        if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue()) {
            final Runnable runnable2 = (Runnable) r2.b.unwrap(interfaceC6172a);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.tz
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zze;
                    final BinderC4703vz binderC4703vz = this.zza;
                    final Runnable runnable3 = runnable2;
                    interfaceExecutorServiceC1974Un0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uz
                        @Override // java.lang.Runnable
                        public final void run() {
                            binderC4703vz.b(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z8 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z8) {
            G1.u.zza().zza(this.f23371a, this.f23372b, str2, runnable3, this.f23381k, this.f23384n, this.f23386p);
        }
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzm(H1.F0 f02) {
        this.f23379i.zzh(f02, EnumC3506lS.API);
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzn(InterfaceC6172a interfaceC6172a, String str) {
        if (interfaceC6172a == null) {
            L1.n.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) r2.b.unwrap(interfaceC6172a);
        if (context == null) {
            L1.n.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        C0666v c0666v = new C0666v(context);
        c0666v.zzn(str);
        c0666v.zzo(this.f23372b.afmaVersion);
        c0666v.zzr();
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzo(InterfaceC1850Rn interfaceC1850Rn) {
        this.f23382l.zzf(interfaceC1850Rn);
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final synchronized void zzp(boolean z8) {
        G1.u.zzr().zzc(z8);
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final synchronized void zzq(float f8) {
        G1.u.zzr().zzd(f8);
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final synchronized void zzr(String str) {
        AbstractC4439th.zza(this.f23371a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdW)).booleanValue()) {
                G1.u.zza().zza(this.f23371a, this.f23372b, str, null, this.f23381k, null, null);
            }
        }
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzs(InterfaceC2624dm interfaceC2624dm) {
        this.f23376f.zzs(interfaceC2624dm);
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzt(String str) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzju)).booleanValue()) {
            G1.u.zzo().zzz(str);
        }
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzu(H1.M1 m12) {
        this.f23377g.zzn(this.f23371a, m12);
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final synchronized boolean zzv() {
        return G1.u.zzr().zze();
    }

    final /* synthetic */ void zzw() {
        this.f23380j.zza(new BinderC4685vq());
    }
}
