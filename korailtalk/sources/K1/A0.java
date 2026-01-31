package K1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3075hi;
import com.google.android.gms.internal.ads.AbstractC3189ii;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.C2867ft;
import com.google.android.gms.internal.ads.C4659vd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class A0 implements InterfaceC0671x0 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f2737b;

    /* renamed from: d, reason: collision with root package name */
    private com.google.common.util.concurrent.C f2739d;

    /* renamed from: f, reason: collision with root package name */
    private SharedPreferences f2741f;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences.Editor f2742g;

    /* renamed from: i, reason: collision with root package name */
    private String f2744i;

    /* renamed from: j, reason: collision with root package name */
    private String f2745j;

    /* renamed from: a, reason: collision with root package name */
    private final Object f2736a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f2738c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private C4659vd f2740e = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2743h = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2746k = true;

    /* renamed from: l, reason: collision with root package name */
    private String f2747l = "-1";

    /* renamed from: m, reason: collision with root package name */
    private int f2748m = -1;

    /* renamed from: n, reason: collision with root package name */
    private C2867ft f2749n = new C2867ft("", 0);

    /* renamed from: o, reason: collision with root package name */
    private long f2750o = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f2751p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f2752q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f2753r = 0;

    /* renamed from: s, reason: collision with root package name */
    private Set f2754s = Collections.emptySet();

    /* renamed from: t, reason: collision with root package name */
    private JSONObject f2755t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    private boolean f2756u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f2757v = true;

    /* renamed from: w, reason: collision with root package name */
    private String f2758w = null;

    /* renamed from: x, reason: collision with root package name */
    private String f2759x = "";

    /* renamed from: y, reason: collision with root package name */
    private boolean f2760y = false;

    /* renamed from: z, reason: collision with root package name */
    private String f2761z = "";

    /* renamed from: A, reason: collision with root package name */
    private String f2732A = "{}";

    /* renamed from: B, reason: collision with root package name */
    private int f2733B = -1;

    /* renamed from: C, reason: collision with root package name */
    private int f2734C = -1;

    /* renamed from: D, reason: collision with root package name */
    private long f2735D = 0;

    private final void b() throws ExecutionException, InterruptedException, TimeoutException {
        com.google.common.util.concurrent.C c9 = this.f2739d;
        if (c9 == null || c9.isDone()) {
            return;
        }
        try {
            this.f2739d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            Thread.currentThread().interrupt();
            L1.n.zzk("Interrupted while waiting for preferences loaded.", e8);
        } catch (CancellationException e9) {
            e = e9;
            L1.n.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e10) {
            e = e10;
            L1.n.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e11) {
            e = e11;
            L1.n.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void c() {
        AbstractC4805wt.zza.execute(new Runnable() { // from class: K1.y0
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }

    final /* synthetic */ void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (this.f2736a) {
                try {
                    this.f2741f = sharedPreferences;
                    this.f2742g = editorEdit;
                    if (o2.n.isAtLeastM()) {
                        NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    }
                    this.f2743h = this.f2741f.getBoolean("use_https", this.f2743h);
                    this.f2756u = this.f2741f.getBoolean("content_url_opted_out", this.f2756u);
                    this.f2744i = this.f2741f.getString("content_url_hashes", this.f2744i);
                    this.f2746k = this.f2741f.getBoolean("gad_idless", this.f2746k);
                    this.f2757v = this.f2741f.getBoolean("content_vertical_opted_out", this.f2757v);
                    this.f2745j = this.f2741f.getString("content_vertical_hashes", this.f2745j);
                    this.f2753r = this.f2741f.getInt("version_code", this.f2753r);
                    if (((Boolean) AbstractC3189ii.zzg.zze()).booleanValue() && H1.C.zzc().zze()) {
                        this.f2749n = new C2867ft("", 0L);
                    } else {
                        this.f2749n = new C2867ft(this.f2741f.getString("app_settings_json", this.f2749n.zzc()), this.f2741f.getLong("app_settings_last_update_ms", this.f2749n.zza()));
                    }
                    this.f2750o = this.f2741f.getLong("app_last_background_time_ms", this.f2750o);
                    this.f2752q = this.f2741f.getInt("request_in_session_count", this.f2752q);
                    this.f2751p = this.f2741f.getLong("first_ad_req_time_ms", this.f2751p);
                    this.f2754s = this.f2741f.getStringSet("never_pool_slots", this.f2754s);
                    this.f2758w = this.f2741f.getString("display_cutout", this.f2758w);
                    this.f2733B = this.f2741f.getInt("app_measurement_npa", this.f2733B);
                    this.f2734C = this.f2741f.getInt("sd_app_measure_npa", this.f2734C);
                    this.f2735D = this.f2741f.getLong("sd_app_measure_npa_ts", this.f2735D);
                    this.f2759x = this.f2741f.getString("inspector_info", this.f2759x);
                    this.f2760y = this.f2741f.getBoolean("linked_device", this.f2760y);
                    this.f2761z = this.f2741f.getString("linked_ad_unit", this.f2761z);
                    this.f2732A = this.f2741f.getString("inspector_ui_storage", this.f2732A);
                    this.f2747l = this.f2741f.getString("IABTCF_TCString", this.f2747l);
                    this.f2748m = this.f2741f.getInt("gad_has_consent_for_cookies", this.f2748m);
                    try {
                        this.f2755t = new JSONObject(this.f2741f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e8) {
                        L1.n.zzk("Could not convert native advanced settings to json object", e8);
                    }
                    c();
                } finally {
                }
            }
        } catch (Throwable th) {
            G1.u.zzo().zzw(th, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            AbstractC0667v0.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzA(boolean z8) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (this.f2757v == z8) {
                    return;
                }
                this.f2757v = z8;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z8);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzB(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjj)).booleanValue()) {
            b();
            synchronized (this.f2736a) {
                try {
                    if (this.f2761z.equals(str)) {
                        return;
                    }
                    this.f2761z = str;
                    SharedPreferences.Editor editor = this.f2742g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f2742g.apply();
                    }
                    c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzC(boolean z8) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjj)).booleanValue()) {
            b();
            synchronized (this.f2736a) {
                try {
                    if (this.f2760y == z8) {
                        return;
                    }
                    this.f2760y = z8;
                    SharedPreferences.Editor editor = this.f2742g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z8);
                        this.f2742g.apply();
                    }
                    c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzD(String str) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (TextUtils.equals(this.f2758w, str)) {
                    return;
                }
                this.f2758w = str;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzE(long j8) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (this.f2751p == j8) {
                    return;
                }
                this.f2751p = j8;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j8);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzF(int i8) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                this.f2748m = i8;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    if (i8 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i8);
                    }
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzG(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziU)).booleanValue()) {
            b();
            synchronized (this.f2736a) {
                try {
                    if (this.f2759x.equals(str)) {
                        return;
                    }
                    this.f2759x = str;
                    SharedPreferences.Editor editor = this.f2742g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f2742g.apply();
                    }
                    c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzH(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjw)).booleanValue()) {
            b();
            synchronized (this.f2736a) {
                try {
                    if (this.f2732A.equals(str)) {
                        return;
                    }
                    this.f2732A = str;
                    SharedPreferences.Editor editor = this.f2742g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f2742g.apply();
                    }
                    c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzI(boolean z8) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (z8 == this.f2746k) {
                    return;
                }
                this.f2746k = z8;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z8);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzJ(boolean z8) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) H1.C.zzc().zza(AbstractC4439th.zzkw)).longValue();
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z8);
                    this.f2742g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put(com.kakao.sdk.link.Constants.TEMPLATE_ID, r9);
        r3.put("uses_media_view", r10);
        r3.put("timestamp_ms", G1.u.zzB().currentTimeMillis());
        r1.put(r2, r3);
        r7.f2755t.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        L1.n.zzk("Could not update native advanced settings", r8);
     */
    @Override // K1.InterfaceC0671x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzK(java.lang.String r8, java.lang.String r9, boolean r10) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r7 = this;
            r7.b()
            java.lang.Object r0 = r7.f2736a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.f2755t     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r8 = move-exception
            goto L8c
        L17:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r4 = r3
        L1d:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L14
            if (r4 >= r5) goto L48
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L14
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L45
            if (r10 == 0) goto L43
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L43:
            r2 = r4
            goto L48
        L45:
            int r4 = r4 + 1
            goto L1d
        L48:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r9 = "timestamp_ms"
            o2.f r10 = G1.u.zzB()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            long r4 = r10.currentTimeMillis()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            org.json.JSONObject r9 = r7.f2755t     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            goto L73
        L6d:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            L1.n.zzk(r9, r8)     // Catch: java.lang.Throwable -> L14
        L73:
            android.content.SharedPreferences$Editor r8 = r7.f2742g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L87
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.f2755t     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.f2742g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L87:
            r7.c()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.A0.zzK(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // K1.InterfaceC0671x0
    public final void zzL(int i8) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (this.f2752q == i8) {
                    return;
                }
                this.f2752q = i8;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i8);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzM(int i8) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (this.f2734C == i8) {
                    return;
                }
                this.f2734C = i8;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i8);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzN(long j8) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (this.f2735D == j8) {
                    return;
                }
                this.f2735D = j8;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j8);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzO(String str) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                this.f2747l = str;
                if (this.f2742g != null) {
                    if (str.equals("-1")) {
                        this.f2742g.remove("IABTCF_TCString");
                    } else {
                        this.f2742g.putString("IABTCF_TCString", str);
                    }
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final boolean zzP() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z8;
        b();
        synchronized (this.f2736a) {
            z8 = this.f2756u;
        }
        return z8;
    }

    @Override // K1.InterfaceC0671x0
    public final boolean zzQ() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z8;
        b();
        synchronized (this.f2736a) {
            z8 = this.f2757v;
        }
        return z8;
    }

    @Override // K1.InterfaceC0671x0
    public final boolean zzR() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z8;
        b();
        synchronized (this.f2736a) {
            z8 = this.f2760y;
        }
        return z8;
    }

    @Override // K1.InterfaceC0671x0
    public final boolean zzS() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z8;
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzav)).booleanValue()) {
            return false;
        }
        b();
        synchronized (this.f2736a) {
            z8 = this.f2746k;
        }
        return z8;
    }

    @Override // K1.InterfaceC0671x0
    public final boolean zzT() throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                SharedPreferences sharedPreferences = this.f2741f;
                boolean z8 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f2741f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f2746k) {
                    z8 = true;
                }
                return z8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final int zza() throws ExecutionException, InterruptedException, TimeoutException {
        int i8;
        b();
        synchronized (this.f2736a) {
            i8 = this.f2753r;
        }
        return i8;
    }

    @Override // K1.InterfaceC0671x0
    public final int zzb() throws ExecutionException, InterruptedException, TimeoutException {
        b();
        return this.f2748m;
    }

    @Override // K1.InterfaceC0671x0
    public final int zzc() throws ExecutionException, InterruptedException, TimeoutException {
        int i8;
        b();
        synchronized (this.f2736a) {
            i8 = this.f2752q;
        }
        return i8;
    }

    @Override // K1.InterfaceC0671x0
    public final long zzd() throws ExecutionException, InterruptedException, TimeoutException {
        long j8;
        b();
        synchronized (this.f2736a) {
            j8 = this.f2750o;
        }
        return j8;
    }

    @Override // K1.InterfaceC0671x0
    public final long zze() throws ExecutionException, InterruptedException, TimeoutException {
        long j8;
        b();
        synchronized (this.f2736a) {
            j8 = this.f2751p;
        }
        return j8;
    }

    @Override // K1.InterfaceC0671x0
    public final long zzf() throws ExecutionException, InterruptedException, TimeoutException {
        long j8;
        b();
        synchronized (this.f2736a) {
            j8 = this.f2735D;
        }
        return j8;
    }

    @Override // K1.InterfaceC0671x0
    public final C4659vd zzg() {
        if (!this.f2737b) {
            return null;
        }
        if ((zzP() && zzQ()) || !((Boolean) AbstractC3075hi.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.f2736a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f2740e == null) {
                    this.f2740e = new C4659vd();
                }
                this.f2740e.zze();
                L1.n.zzi("start fetching content...");
                return this.f2740e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final C2867ft zzh() throws ExecutionException, InterruptedException, TimeoutException {
        C2867ft c2867ft;
        b();
        synchronized (this.f2736a) {
            try {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlJ)).booleanValue() && this.f2749n.zzj()) {
                    Iterator it = this.f2738c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                c2867ft = this.f2749n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2867ft;
    }

    @Override // K1.InterfaceC0671x0
    public final C2867ft zzi() {
        C2867ft c2867ft;
        synchronized (this.f2736a) {
            c2867ft = this.f2749n;
        }
        return c2867ft;
    }

    @Override // K1.InterfaceC0671x0
    public final String zzj() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        b();
        synchronized (this.f2736a) {
            str = this.f2744i;
        }
        return str;
    }

    @Override // K1.InterfaceC0671x0
    public final String zzk() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        b();
        synchronized (this.f2736a) {
            str = this.f2745j;
        }
        return str;
    }

    @Override // K1.InterfaceC0671x0
    public final String zzl() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        b();
        synchronized (this.f2736a) {
            str = this.f2761z;
        }
        return str;
    }

    @Override // K1.InterfaceC0671x0
    public final String zzm() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        b();
        synchronized (this.f2736a) {
            str = this.f2758w;
        }
        return str;
    }

    @Override // K1.InterfaceC0671x0
    public final String zzn() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        b();
        synchronized (this.f2736a) {
            str = this.f2759x;
        }
        return str;
    }

    @Override // K1.InterfaceC0671x0
    public final String zzo() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        b();
        synchronized (this.f2736a) {
            str = this.f2732A;
        }
        return str;
    }

    @Override // K1.InterfaceC0671x0
    public final String zzp() throws ExecutionException, InterruptedException, TimeoutException {
        b();
        return this.f2747l;
    }

    @Override // K1.InterfaceC0671x0
    public final JSONObject zzq() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        b();
        synchronized (this.f2736a) {
            jSONObject = this.f2755t;
        }
        return jSONObject;
    }

    @Override // K1.InterfaceC0671x0
    public final void zzr(Runnable runnable) {
        this.f2738c.add(runnable);
    }

    @Override // K1.InterfaceC0671x0
    public final void zzs(final Context context) {
        synchronized (this.f2736a) {
            try {
                if (this.f2741f != null) {
                    return;
                }
                final String str = "admob";
                this.f2739d = AbstractC4805wt.zza.zza(new Runnable(context, str) { // from class: K1.z0
                    public final /* synthetic */ Context zzb;
                    public final /* synthetic */ String zzc = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.a(this.zzb, this.zzc);
                    }
                });
                this.f2737b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzt() throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                this.f2755t = new JSONObject();
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzu(long j8) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (this.f2750o == j8) {
                    return;
                }
                this.f2750o = j8;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j8);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzv(String str) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
                if (str != null && !str.equals(this.f2749n.zzc())) {
                    this.f2749n = new C2867ft(str, jCurrentTimeMillis);
                    SharedPreferences.Editor editor = this.f2742g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f2742g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                        this.f2742g.apply();
                    }
                    c();
                    Iterator it = this.f2738c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.f2749n.zzg(jCurrentTimeMillis);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzw(int i8) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (this.f2753r == i8) {
                    return;
                }
                this.f2753r = i8;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putInt("version_code", i8);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzx(String str) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (str.equals(this.f2744i)) {
                    return;
                }
                this.f2744i = str;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzy(boolean z8) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (this.f2756u == z8) {
                    return;
                }
                this.f2756u = z8;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z8);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.InterfaceC0671x0
    public final void zzz(String str) throws ExecutionException, InterruptedException, TimeoutException {
        b();
        synchronized (this.f2736a) {
            try {
                if (str.equals(this.f2745j)) {
                    return;
                }
                this.f2745j = str;
                SharedPreferences.Editor editor = this.f2742g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f2742g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
