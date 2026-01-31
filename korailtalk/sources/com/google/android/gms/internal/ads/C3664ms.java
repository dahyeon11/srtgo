package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import f2.C5398h;
import i2.AbstractC5683p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ms, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3664ms implements InterfaceC4233rs {

    /* renamed from: m, reason: collision with root package name */
    private static final List f21003m = Collections.synchronizedList(new ArrayList());
    public static final /* synthetic */ int zzb = 0;

    /* renamed from: a, reason: collision with root package name */
    private final AB0 f21004a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f21005b;

    /* renamed from: e, reason: collision with root package name */
    private final Context f21008e;

    /* renamed from: f, reason: collision with root package name */
    boolean f21009f;

    /* renamed from: g, reason: collision with root package name */
    private final C3892os f21010g;

    /* renamed from: l, reason: collision with root package name */
    private final C3778ns f21015l;

    /* renamed from: c, reason: collision with root package name */
    private final List f21006c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f21007d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Object f21011h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private HashSet f21012i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private boolean f21013j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21014k = false;

    public C3664ms(Context context, L1.a aVar, C3892os c3892os, String str, C3778ns c3778ns) {
        AbstractC5683p.checkNotNull(c3892os, "SafeBrowsing config is not present.");
        this.f21008e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f21005b = new LinkedHashMap();
        this.f21015l = c3778ns;
        this.f21010g = c3892os;
        Iterator it = c3892os.zze.iterator();
        while (it.hasNext()) {
            this.f21012i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f21012i.remove("cookie".toLowerCase(Locale.ENGLISH));
        AB0 ab0Zzc = XC0.zzc();
        ab0Zzc.zzj(BC0.OCTAGON_AD);
        ab0Zzc.zzk(str);
        ab0Zzc.zzh(str);
        BB0 bb0Zzc = CB0.zzc();
        String str2 = this.f21010g.zza;
        if (str2 != null) {
            bb0Zzc.zza(str2);
        }
        ab0Zzc.zzg((CB0) bb0Zzc.zzbr());
        HC0 hc0Zzc = IC0.zzc();
        hc0Zzc.zzc(q2.e.packageManager(this.f21008e).isCallerInstantApp());
        String str3 = aVar.afmaVersion;
        if (str3 != null) {
            hc0Zzc.zza(str3);
        }
        long apkVersion = C5398h.getInstance().getApkVersion(this.f21008e);
        if (apkVersion > 0) {
            hc0Zzc.zzb(apkVersion);
        }
        ab0Zzc.zzf((IC0) hc0Zzc.zzbr());
        this.f21004a = ab0Zzc;
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(Map map) {
        FC0 fc0;
        com.google.common.util.concurrent.C cZzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.f21011h) {
                            try {
                                int length = jSONArrayOptJSONArray.length();
                                synchronized (this.f21011h) {
                                    fc0 = (FC0) this.f21005b.get(str);
                                }
                                if (fc0 == null) {
                                    AbstractC4120qs.zza("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i8 = 0; i8 < length; i8++) {
                                        fc0.zza(jSONArrayOptJSONArray.getJSONObject(i8).getString("threat_type"));
                                    }
                                    this.f21009f = (length > 0) | this.f21009f;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } catch (JSONException e8) {
                if (((Boolean) AbstractC5011yi.zzb.zze()).booleanValue()) {
                    L1.n.zzf("Failed to get SafeBrowsing metadata", e8);
                }
                return AbstractC1483In0.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f21009f) {
            synchronized (this.f21011h) {
                this.f21004a.zzj(BC0.OCTAGON_AD_SB_MATCH);
            }
        }
        boolean z8 = this.f21009f;
        if (!(z8 && this.f21010g.zzg) && (!(this.f21014k && this.f21010g.zzf) && (z8 || !this.f21010g.zzd))) {
            return AbstractC1483In0.zzh(null);
        }
        synchronized (this.f21011h) {
            try {
                Iterator it = this.f21005b.values().iterator();
                while (it.hasNext()) {
                    this.f21004a.zzc((GC0) ((FC0) it.next()).zzbr());
                }
                this.f21004a.zza(this.f21006c);
                this.f21004a.zzb(this.f21007d);
                if (AbstractC4120qs.zzb()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.f21004a.zzm() + "\n  clickUrl: " + this.f21004a.zzl() + "\n  resources: \n");
                    for (GC0 gc0 : this.f21004a.zzn()) {
                        sb.append("    [");
                        sb.append(gc0.zzc());
                        sb.append("] ");
                        sb.append(gc0.zzg());
                    }
                    AbstractC4120qs.zza(sb.toString());
                }
                com.google.common.util.concurrent.C cZzb = new K1.T(this.f21008e).zzb(1, this.f21010g.zzb, null, ((XC0) this.f21004a.zzbr()).zzaV());
                if (AbstractC4120qs.zzb()) {
                    cZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.hs
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC4120qs.zza("Pinged SB successfully.");
                        }
                    }, AbstractC4805wt.zza);
                }
                cZzm = AbstractC1483In0.zzm(cZzb, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.is
                    @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
                    public final Object apply(Object obj) {
                        int i9 = C3664ms.zzb;
                        return null;
                    }
                }, AbstractC4805wt.zzf);
            } finally {
            }
        }
        return cZzm;
    }

    final /* synthetic */ void c(Bitmap bitmap) {
        C3108hy0 c3108hy0Zzt = AbstractC3677my0.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, c3108hy0Zzt);
        synchronized (this.f21011h) {
            AB0 ab0 = this.f21004a;
            C4503uC0 c4503uC0Zzc = C4959yC0.zzc();
            c4503uC0Zzc.zza(c3108hy0Zzt.zzb());
            c4503uC0Zzc.zzb("image/png");
            c4503uC0Zzc.zzc(EnumC4845xC0.TYPE_CREATIVE);
            ab0.zzi((C4959yC0) c4503uC0Zzc.zzbr());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4233rs
    public final C3892os zza() {
        return this.f21010g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4233rs
    public final void zzd(String str, Map map, int i8) {
        EC0 ec0;
        synchronized (this.f21011h) {
            if (i8 == 3) {
                try {
                    this.f21014k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f21005b.containsKey(str)) {
                if (i8 == 3 && (ec0 = EC0.AD_RESOURCE_AUTO_CLICK_DESTINATION) != null) {
                    ((FC0) this.f21005b.get(str)).zzb(ec0);
                }
                return;
            }
            FC0 fc0Zze = GC0.zze();
            EC0 ec0Zzb = EC0.zzb(i8);
            if (ec0Zzb != null) {
                fc0Zze.zzb(ec0Zzb);
            }
            fc0Zze.zzc(this.f21005b.size());
            fc0Zze.zze(str);
            SB0 sb0Zzc = VB0.zzc();
            if (!this.f21012i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f21012i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        QB0 qb0Zzc = RB0.zzc();
                        qb0Zzc.zza(AbstractC3677my0.zzw(str2));
                        qb0Zzc.zzb(AbstractC3677my0.zzw(str3));
                        sb0Zzc.zza((RB0) qb0Zzc.zzbr());
                    }
                }
            }
            fc0Zze.zzd((VB0) sb0Zzc.zzbr());
            this.f21005b.put(str, fc0Zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4233rs
    public final void zze() {
        synchronized (this.f21011h) {
            this.f21005b.keySet();
            com.google.common.util.concurrent.C cZzh = AbstractC1483In0.zzh(Collections.emptyMap());
            InterfaceC3997pn0 interfaceC3997pn0 = new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.fs
                @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                public final com.google.common.util.concurrent.C zza(Object obj) {
                    return this.zza.a((Map) obj);
                }
            };
            InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zzf;
            com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(cZzh, interfaceC3997pn0, interfaceExecutorServiceC1974Un0);
            com.google.common.util.concurrent.C cZzo = AbstractC1483In0.zzo(cZzn, 10L, TimeUnit.SECONDS, AbstractC4805wt.zzd);
            AbstractC1483In0.zzr(cZzn, new C3322js(this, cZzo), interfaceExecutorServiceC1974Un0);
            f21003m.add(cZzo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4233rs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.os r0 = r7.f21010g
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r7.f21013j
            if (r0 != 0) goto L95
            G1.u.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6f
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L26
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L26
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L26
            if (r3 == 0) goto L28
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L26
            goto L29
        L26:
            r2 = move-exception
            goto L2f
        L28:
            r3 = r1
        L29:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2d
            goto L35
        L2d:
            r2 = move-exception
            goto L30
        L2f:
            r3 = r1
        L30:
            java.lang.String r4 = "Fail to capture the web view"
            L1.n.zzh(r4, r2)
        L35:
            if (r3 != 0) goto L6e
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L60
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L60
            if (r2 == 0) goto L62
            if (r3 != 0) goto L44
            goto L62
        L44:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L60
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L60
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L60
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L60
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L60
            r1 = r4
            goto L6f
        L60:
            r8 = move-exception
            goto L68
        L62:
            java.lang.String r8 = "Width or height of view is zero"
            L1.n.zzj(r8)     // Catch: java.lang.RuntimeException -> L60
            goto L6f
        L68:
            java.lang.String r2 = "Fail to capture the webview"
            L1.n.zzh(r2, r8)
            goto L6f
        L6e:
            r1 = r3
        L6f:
            if (r1 != 0) goto L77
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.AbstractC4120qs.zza(r8)
            return
        L77:
            r7.f21013j = r0
            com.google.android.gms.internal.ads.gs r8 = new com.google.android.gms.internal.ads.gs
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L90
            r8.run()
            return
        L90:
            com.google.android.gms.internal.ads.Un0 r0 = com.google.android.gms.internal.ads.AbstractC4805wt.zza
            r0.execute(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3664ms.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4233rs
    public final void zzh(String str) {
        synchronized (this.f21011h) {
            try {
                if (str == null) {
                    this.f21004a.zzd();
                } else {
                    this.f21004a.zze(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4233rs
    public final boolean zzi() {
        return o2.n.isAtLeastKitKat() && this.f21010g.zzc && !this.f21013j;
    }
}
