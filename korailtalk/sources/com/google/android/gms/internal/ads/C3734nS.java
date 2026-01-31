package com.google.android.gms.internal.ads;

import H1.C0591z;
import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.nS */
/* loaded from: classes2.dex */
public final class C3734nS implements PS, XR {

    /* renamed from: a */
    private final C4987yS f21266a;

    /* renamed from: b */
    private final QS f21267b;

    /* renamed from: c */
    private final YR f21268c;

    /* renamed from: d */
    private final C3051hS f21269d;

    /* renamed from: e */
    private final WR f21270e;

    /* renamed from: f */
    private final KS f21271f;

    /* renamed from: g */
    private final SharedPreferencesOnSharedPreferenceChangeListenerC4531uS f21272g;

    /* renamed from: h */
    private final SharedPreferencesOnSharedPreferenceChangeListenerC4531uS f21273h;

    /* renamed from: i */
    private final String f21274i;

    /* renamed from: j */
    private final Context f21275j;

    /* renamed from: k */
    private final String f21276k;

    /* renamed from: p */
    private JSONObject f21281p;

    /* renamed from: s */
    private boolean f21284s;

    /* renamed from: t */
    private int f21285t;

    /* renamed from: u */
    private boolean f21286u;

    /* renamed from: l */
    private final Map f21277l = new HashMap();

    /* renamed from: m */
    private final Map f21278m = new HashMap();

    /* renamed from: n */
    private final Map f21279n = new HashMap();

    /* renamed from: o */
    private String f21280o = "{}";

    /* renamed from: q */
    private long f21282q = Long.MAX_VALUE;

    /* renamed from: r */
    private EnumC3166iS f21283r = EnumC3166iS.NONE;

    /* renamed from: v */
    private EnumC3506lS f21287v = EnumC3506lS.UNKNOWN;

    /* renamed from: w */
    private long f21288w = 0;

    /* renamed from: x */
    private String f21289x = "";

    C3734nS(C4987yS c4987yS, QS qs, YR yr, Context context, L1.a aVar, C3051hS c3051hS, KS ks, SharedPreferencesOnSharedPreferenceChangeListenerC4531uS sharedPreferencesOnSharedPreferenceChangeListenerC4531uS, SharedPreferencesOnSharedPreferenceChangeListenerC4531uS sharedPreferencesOnSharedPreferenceChangeListenerC4531uS2, String str) {
        this.f21266a = c4987yS;
        this.f21267b = qs;
        this.f21268c = yr;
        this.f21270e = new WR(context);
        this.f21274i = aVar.afmaVersion;
        this.f21276k = str;
        this.f21269d = c3051hS;
        this.f21271f = ks;
        this.f21272g = sharedPreferencesOnSharedPreferenceChangeListenerC4531uS;
        this.f21273h = sharedPreferencesOnSharedPreferenceChangeListenerC4531uS2;
        this.f21275j = context;
        G1.u.zzs().zzg(this);
    }

    private final synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            f(jSONObject.optBoolean("isTestMode", false), false);
            e((EnumC3166iS) Enum.valueOf(EnumC3166iS.class, jSONObject.optString("gesture", "NONE")), false);
            this.f21280o = jSONObject.optString("networkExtras", "{}");
            this.f21282q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject b() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f21277l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (C2248aS c2248aS : (List) entry.getValue()) {
                    if (c2248aS.zzg()) {
                        jSONArray.put(c2248aS.zzd());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void c() {
        this.f21286u = true;
        this.f21269d.zzc();
        this.f21266a.zzh(this);
        this.f21267b.zzd(this);
        this.f21268c.zzd(this);
        this.f21271f.zzf(this);
        AbstractC3414kh abstractC3414kh = AbstractC4439th.zzjx;
        if (!TextUtils.isEmpty((CharSequence) H1.C.zzc().zza(abstractC3414kh))) {
            this.f21272g.a(PreferenceManager.getDefaultSharedPreferences(this.f21275j), Arrays.asList(((String) H1.C.zzc().zza(abstractC3414kh)).split(",")));
        }
        AbstractC3414kh abstractC3414kh2 = AbstractC4439th.zzjy;
        if (!TextUtils.isEmpty((CharSequence) H1.C.zzc().zza(abstractC3414kh2))) {
            this.f21273h.a(this.f21275j.getSharedPreferences("admob", 0), Arrays.asList(((String) H1.C.zzc().zza(abstractC3414kh2)).split(",")));
        }
        a(G1.u.zzo().zzi().zzn());
        this.f21289x = G1.u.zzo().zzi().zzo();
    }

    private final void d() {
        G1.u.zzo().zzi().zzG(zzd());
    }

    private final synchronized void e(EnumC3166iS enumC3166iS, boolean z8) {
        try {
            if (this.f21283r != enumC3166iS) {
                if (zzq()) {
                    g();
                }
                this.f21283r = enumC3166iS;
                if (zzq()) {
                    h();
                }
                if (z8) {
                    d();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:32:0x0001, B:35:0x0006, B:37:0x000a, B:39:0x001c, B:44:0x0029, B:49:0x0038, B:45:0x002d, B:47:0x0033), top: B:56:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void f(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f21284s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f21284s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.kh r2 = com.google.android.gms.internal.ads.AbstractC4439th.zzjj     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.rh r0 = H1.C.zzc()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.zza(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            K1.z r2 = G1.u.zzs()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.h()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.zzq()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.g()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.d()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3734nS.f(boolean, boolean):void");
    }

    private final synchronized void g() {
        EnumC3166iS enumC3166iS = EnumC3166iS.NONE;
        int iOrdinal = this.f21283r.ordinal();
        if (iOrdinal == 1) {
            this.f21267b.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f21268c.zzb();
        }
    }

    private final synchronized void h() {
        EnumC3166iS enumC3166iS = EnumC3166iS.NONE;
        int iOrdinal = this.f21283r.ordinal();
        if (iOrdinal == 1) {
            this.f21267b.zzc();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f21268c.zzc();
        }
    }

    public final EnumC3166iS zza() {
        return this.f21283r;
    }

    public final synchronized com.google.common.util.concurrent.C zzb(String str) {
        C1203Bt c1203Bt;
        try {
            c1203Bt = new C1203Bt();
            if (this.f21278m.containsKey(str)) {
                c1203Bt.zzc((C2248aS) this.f21278m.get(str));
            } else {
                if (!this.f21279n.containsKey(str)) {
                    this.f21279n.put(str, new ArrayList());
                }
                ((List) this.f21279n.get(str)).add(c1203Bt);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1203Bt;
    }

    public final synchronized String zzc() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziU)).booleanValue() && zzq()) {
            if (this.f21282q < G1.u.zzB().currentTimeMillis() / 1000) {
                this.f21280o = "{}";
                this.f21282q = Long.MAX_VALUE;
                return "";
            }
            if (!this.f21280o.equals("{}")) {
                return this.f21280o;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f21284s);
            jSONObject.put("gesture", this.f21283r);
            if (this.f21282q > G1.u.zzB().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.f21280o);
                jSONObject.put("networkExtrasExpirationSecs", this.f21282q);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!TextUtils.isEmpty(this.f21276k)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.f21276k);
                }
                jSONObject.put("internalSdkVersion", this.f21274i);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.f21269d.zza());
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzju)).booleanValue()) {
                    String strZzn = G1.u.zzo().zzn();
                    if (!TextUtils.isEmpty(strZzn)) {
                        jSONObject.put("plugin", strZzn);
                    }
                }
                if (this.f21282q < G1.u.zzB().currentTimeMillis() / 1000) {
                    this.f21280o = "{}";
                }
                jSONObject.put("networkExtras", this.f21280o);
                jSONObject.put("adSlots", b());
                jSONObject.put("appInfo", this.f21270e.zza());
                String strZzc = G1.u.zzo().zzi().zzh().zzc();
                if (!TextUtils.isEmpty(strZzc)) {
                    jSONObject.put("cld", new JSONObject(strZzc));
                }
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjk)).booleanValue() && (jSONObject2 = this.f21281p) != null) {
                    L1.n.zze("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.f21281p);
                }
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjj)).booleanValue()) {
                    jSONObject.put("openAction", this.f21287v);
                    jSONObject.put("gesture", this.f21283r);
                }
                jSONObject.put("isGamRegisteredTestDevice", G1.u.zzs().zzl());
                G1.u.zzp();
                C0591z.zzb();
                jSONObject.put("isSimulator", L1.g.zzs());
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjw)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.f21289x));
                }
                if (!TextUtils.isEmpty((CharSequence) H1.C.zzc().zza(AbstractC4439th.zzjy))) {
                    jSONObject.put("gmaDisk", this.f21273h.zza());
                }
                if (!TextUtils.isEmpty((CharSequence) H1.C.zzc().zza(AbstractC4439th.zzjx))) {
                    jSONObject.put("userDisk", this.f21272g.zza());
                }
            } catch (JSONException e8) {
                G1.u.zzo().zzv(e8, "Inspector.toJson");
                L1.n.zzk("Ad inspector encountered an error", e8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, C2248aS c2248aS) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziU)).booleanValue() && zzq()) {
            if (this.f21285t >= ((Integer) H1.C.zzc().zza(AbstractC4439th.zziW)).intValue()) {
                L1.n.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f21277l.containsKey(str)) {
                this.f21277l.put(str, new ArrayList());
            }
            this.f21285t++;
            ((List) this.f21277l.get(str)).add(c2248aS);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjs)).booleanValue()) {
                String strZzc = c2248aS.zzc();
                this.f21278m.put(strZzc, c2248aS);
                if (this.f21279n.containsKey(strZzc)) {
                    List list = (List) this.f21279n.get(strZzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C1203Bt) it.next()).zzc(c2248aS);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziU)).booleanValue()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjj)).booleanValue() && G1.u.zzo().zzi().zzR()) {
                c();
                return;
            }
            String strZzn = G1.u.zzo().zzi().zzn();
            if (TextUtils.isEmpty(strZzn)) {
                return;
            }
            try {
                if (new JSONObject(strZzn).optBoolean("isTestMode", false)) {
                    c();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(H1.F0 f02, EnumC3506lS enumC3506lS) {
        if (!zzq()) {
            try {
                f02.zze(AbstractC4542ub0.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                L1.n.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziU)).booleanValue()) {
            this.f21287v = enumC3506lS;
            this.f21266a.zzj(f02, new C4675vl(this), new C3878ol(this.f21271f), new C2393bl(this));
            return;
        } else {
            try {
                f02.zze(AbstractC4542ub0.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                L1.n.zzj("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzi(String str, long j8) {
        this.f21280o = str;
        this.f21282q = j8;
        d();
    }

    public final synchronized void zzj(String str) {
        this.f21289x = str;
        G1.u.zzo().zzi().zzH(this.f21289x);
    }

    public final synchronized void zzk(long j8) {
        this.f21288w += j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzl(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f21286u
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.c()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.f21284s
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.h()
            return
        L15:
            boolean r2 = r1.zzq()
            if (r2 != 0) goto L1e
            r1.g()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3734nS.zzl(boolean):void");
    }

    public final void zzm(EnumC3166iS enumC3166iS) {
        e(enumC3166iS, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.f21281p = jSONObject;
    }

    public final void zzo(boolean z8) {
        if (!this.f21286u && z8) {
            c();
        }
        f(z8, true);
    }

    public final boolean zzp() {
        return this.f21281p != null;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjj)).booleanValue()) {
            return this.f21284s || G1.u.zzs().zzl();
        }
        return this.f21284s;
    }

    public final synchronized boolean zzr() {
        return this.f21284s;
    }

    public final boolean zzs() {
        return this.f21288w < ((Long) H1.C.zzc().zza(AbstractC4439th.zzjp)).longValue();
    }
}
