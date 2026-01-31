package com.google.android.gms.internal.ads;

import H1.C0534f1;
import H1.C0591z;
import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.aS, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2248aS implements CF, YG, InterfaceC4510uG {

    /* renamed from: a, reason: collision with root package name */
    private final C3734nS f17952a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17953b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17954c;

    /* renamed from: f, reason: collision with root package name */
    private BinderC4280sF f17957f;

    /* renamed from: g, reason: collision with root package name */
    private C0534f1 f17958g;

    /* renamed from: k, reason: collision with root package name */
    private JSONObject f17962k;

    /* renamed from: l, reason: collision with root package name */
    private JSONObject f17963l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f17964m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f17965n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17966o;

    /* renamed from: h, reason: collision with root package name */
    private String f17959h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f17960i = "";

    /* renamed from: j, reason: collision with root package name */
    private String f17961j = "";

    /* renamed from: d, reason: collision with root package name */
    private int f17955d = 0;

    /* renamed from: e, reason: collision with root package name */
    private ZR f17956e = ZR.AD_REQUESTED;

    C2248aS(C3734nS c3734nS, C1825Ra0 c1825Ra0, String str) {
        this.f17952a = c3734nS;
        this.f17954c = str;
        this.f17953b = c1825Ra0.zzf;
    }

    private static JSONObject a(C0534f1 c0534f1) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", c0534f1.zzc);
        jSONObject.put("errorCode", c0534f1.zza);
        jSONObject.put("errorDescription", c0534f1.zzb);
        C0534f1 c0534f12 = c0534f1.zzd;
        jSONObject.put("underlyingError", c0534f12 == null ? null : a(c0534f12));
        return jSONObject;
    }

    private final JSONObject b(BinderC4280sF binderC4280sF) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", binderC4280sF.zzg());
        jSONObject.put("responseSecsSinceEpoch", binderC4280sF.zzc());
        jSONObject.put("responseId", binderC4280sF.zzi());
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjl)).booleanValue()) {
            String strZzd = binderC4280sF.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                L1.n.zze("Bidding data: ".concat(String.valueOf(strZzd)));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.f17959h)) {
            jSONObject.put("adRequestUrl", this.f17959h);
        }
        if (!TextUtils.isEmpty(this.f17960i)) {
            jSONObject.put("postBody", this.f17960i);
        }
        if (!TextUtils.isEmpty(this.f17961j)) {
            jSONObject.put("adResponseBody", this.f17961j);
        }
        Object obj = this.f17962k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f17963l;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjo)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f17966o);
        }
        JSONArray jSONArray = new JSONArray();
        for (H1.h2 h2Var : binderC4280sF.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", h2Var.zza);
            jSONObject2.put("latencyMillis", h2Var.zzb);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjm)).booleanValue()) {
                jSONObject2.put("credentials", C0591z.zzb().zzi(h2Var.zzd));
            }
            C0534f1 c0534f1 = h2Var.zzc;
            jSONObject2.put("error", c0534f1 == null ? null : a(c0534f1));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4510uG
    public final void zza(YC yc) {
        if (this.f17952a.zzq()) {
            this.f17957f = yc.zzl();
            this.f17956e = ZR.AD_LOADED;
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjs)).booleanValue()) {
                this.f17952a.zzf(this.f17953b, this);
            }
        }
    }

    public final String zzc() {
        return this.f17954c;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObjectB;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f17956e);
        jSONObject.put("format", C4654va0.zza(this.f17955d));
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjs)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f17964m);
            if (this.f17964m) {
                jSONObject.put("shown", this.f17965n);
            }
        }
        BinderC4280sF binderC4280sF = this.f17957f;
        if (binderC4280sF != null) {
            jSONObjectB = b(binderC4280sF);
        } else {
            C0534f1 c0534f1 = this.f17958g;
            JSONObject jSONObjectB2 = null;
            if (c0534f1 != null && (iBinder = c0534f1.zze) != null) {
                BinderC4280sF binderC4280sF2 = (BinderC4280sF) iBinder;
                jSONObjectB2 = b(binderC4280sF2);
                if (binderC4280sF2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(a(this.f17958g));
                    jSONObjectB2.put("errors", jSONArray);
                }
            }
            jSONObjectB = jSONObjectB2;
        }
        jSONObject.put("responseInfo", jSONObjectB);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.CF
    public final void zzdB(C0534f1 c0534f1) {
        if (this.f17952a.zzq()) {
            this.f17956e = ZR.AD_LOAD_FAILED;
            this.f17958g = c0534f1;
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjs)).booleanValue()) {
                this.f17952a.zzf(this.f17953b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdn(C2519cr c2519cr) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjs)).booleanValue() || !this.f17952a.zzq()) {
            return;
        }
        this.f17952a.zzf(this.f17953b, this);
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdo(C1457Ia0 c1457Ia0) {
        if (this.f17952a.zzq()) {
            if (!c1457Ia0.zzb.zza.isEmpty()) {
                this.f17955d = ((C4654va0) c1457Ia0.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(c1457Ia0.zzb.zzb.zzk)) {
                this.f17959h = c1457Ia0.zzb.zzb.zzk;
            }
            if (!TextUtils.isEmpty(c1457Ia0.zzb.zzb.zzl)) {
                this.f17960i = c1457Ia0.zzb.zzb.zzl;
            }
            if (c1457Ia0.zzb.zzb.zzo.length() > 0) {
                this.f17963l = c1457Ia0.zzb.zzb.zzo;
            }
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjo)).booleanValue()) {
                if (!this.f17952a.zzs()) {
                    this.f17966o = true;
                    return;
                }
                if (!TextUtils.isEmpty(c1457Ia0.zzb.zzb.zzm)) {
                    this.f17961j = c1457Ia0.zzb.zzb.zzm;
                }
                if (c1457Ia0.zzb.zzb.zzn.length() > 0) {
                    this.f17962k = c1457Ia0.zzb.zzb.zzn;
                }
                C3734nS c3734nS = this.f17952a;
                JSONObject jSONObject = this.f17962k;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f17961j)) {
                    length += this.f17961j.length();
                }
                c3734nS.zzk(length);
            }
        }
    }

    public final void zze() {
        this.f17964m = true;
    }

    public final void zzf() {
        this.f17965n = true;
    }

    public final boolean zzg() {
        return this.f17956e != ZR.AD_REQUESTED;
    }
}
