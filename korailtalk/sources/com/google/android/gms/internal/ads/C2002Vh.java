package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y1.C6527h;
import y1.EnumC6522c;

/* renamed from: com.google.android.gms.internal.ads.Vh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2002Vh {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f16877a;

    /* renamed from: b, reason: collision with root package name */
    private final R1.K f16878b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f16879c;

    /* renamed from: d, reason: collision with root package name */
    private C1879Sh f16880d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.browser.customtabs.f f16881e;

    /* renamed from: f, reason: collision with root package name */
    private String f16882f;

    /* renamed from: g, reason: collision with root package name */
    private long f16883g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f16884h;

    /* renamed from: i, reason: collision with root package name */
    private JSONArray f16885i;

    /* renamed from: j, reason: collision with root package name */
    private Context f16886j;

    public C2002Vh(ScheduledExecutorService scheduledExecutorService, R1.K k8) {
        this.f16877a = scheduledExecutorService;
        this.f16878b = k8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) H1.C.zzc().zza(com.google.android.gms.internal.ads.AbstractC4439th.zzjN)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.Sh r0 = r5.f16880d
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            L1.n.zzg(r0)
            return
        La:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r5.f16882f
            if (r0 == 0) goto L70
            androidx.browser.customtabs.f r0 = r5.f16881e
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r5.f16877a
            if (r0 == 0) goto L70
            long r0 = r5.f16883g
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L39
        L2a:
            o2.f r0 = G1.u.zzB()
            long r0 = r0.elapsedRealtime()
            long r2 = r5.f16883g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L4b
        L39:
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzjN
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
        L4b:
            androidx.browser.customtabs.f r0 = r5.f16881e
            java.lang.String r1 = r5.f16882f
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.requestPostMessageChannel(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r5.f16877a
            java.lang.Runnable r1 = r5.f16879c
            com.google.android.gms.internal.ads.kh r2 = com.google.android.gms.internal.ads.AbstractC4439th.zzjO
            com.google.android.gms.internal.ads.rh r3 = H1.C.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L70:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            K1.AbstractC0667v0.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2002Vh.f():void");
    }

    private final void g(JSONObject jSONObject) throws JSONException {
        try {
            if (this.f16885i == null) {
                this.f16885i = new JSONArray((String) H1.C.zzc().zza(AbstractC4439th.zzjQ));
            }
            jSONObject.put("eids", this.f16885i);
        } catch (JSONException e8) {
            L1.n.zzh("Error fetching the PACT active eids JSON: ", e8);
        }
    }

    final JSONObject b(String str, String str2) throws JSONException {
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        if (((Boolean) AbstractC4669vi.zza.zze()).booleanValue()) {
            jLongValue = ((Long) H1.C.zzc().zza(AbstractC4439th.zzjR)).longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject.put("sdk_ttl_ms", jLongValue);
        g(jSONObject);
        return jSONObject;
    }

    final JSONObject c(String str, String str2) throws JSONException {
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        if (((Boolean) AbstractC4669vi.zza.zze()).booleanValue()) {
            jLongValue = ((Long) H1.C.zzc().zza(AbstractC4439th.zzjR)).longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject.put("sdk_ttl_ms", jLongValue);
        g(jSONObject);
        return jSONObject;
    }

    final void d() {
        this.f16883g = G1.u.zzB().elapsedRealtime() + ((Integer) H1.C.zzc().zza(AbstractC4439th.zzjM)).intValue();
        if (this.f16879c == null) {
            this.f16879c = new Runnable() { // from class: com.google.android.gms.internal.ads.Th
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f();
                }
            };
        }
        f();
    }

    final void e(String str) {
        try {
            androidx.browser.customtabs.f fVar = this.f16881e;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f16884h).toString());
            g(jSONObject);
            fVar.postMessage(jSONObject.toString(), null);
            C1961Uh c1961Uh = new C1961Uh(this, str);
            if (((Boolean) AbstractC4669vi.zza.zze()).booleanValue()) {
                this.f16878b.zzg(this.f16881e, c1961Uh);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            T1.a.generate(this.f16886j, EnumC6522c.BANNER, ((C6527h.a) new C6527h.a().addNetworkExtrasBundle(AdMobAdapter.class, bundle)).build(), c1961Uh);
        } catch (JSONException e8) {
            L1.n.zzh("Error creating JSON: ", e8);
        }
    }

    public final androidx.browser.customtabs.f zzb() {
        return this.f16881e;
    }

    public final void zzg(Context context, androidx.browser.customtabs.c cVar, String str, androidx.browser.customtabs.b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.f16886j = context;
        this.f16882f = str;
        C1879Sh c1879Sh = new C1879Sh(this, bVar);
        this.f16880d = c1879Sh;
        androidx.browser.customtabs.f fVarNewSession = cVar.newSession(c1879Sh);
        this.f16881e = fVarNewSession;
        if (fVarNewSession == null) {
            L1.n.zzg("CustomTabsClient failed to create new session.");
        }
    }

    public final void zzi(long j8) {
        this.f16884h = j8;
    }
}
