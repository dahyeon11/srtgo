package com.google.android.gms.internal.ads;

import H1.BinderC0569r1;
import K1.AbstractC0667v0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y1.C6528i;

/* renamed from: com.google.android.gms.internal.ads.yN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4980yN {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23902a;

    /* renamed from: b, reason: collision with root package name */
    private final C3043hN f23903b;

    /* renamed from: c, reason: collision with root package name */
    private final C2487cb f23904c;

    /* renamed from: d, reason: collision with root package name */
    private final L1.a f23905d;

    /* renamed from: e, reason: collision with root package name */
    private final G1.a f23906e;

    /* renamed from: f, reason: collision with root package name */
    private final C4775we f23907f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f23908g;

    /* renamed from: h, reason: collision with root package name */
    private final C1840Ri f23909h;

    /* renamed from: i, reason: collision with root package name */
    private final RN f23910i;

    /* renamed from: j, reason: collision with root package name */
    private final C3275jP f23911j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f23912k;

    /* renamed from: l, reason: collision with root package name */
    private final CO f23913l;

    /* renamed from: m, reason: collision with root package name */
    private final LQ f23914m;

    /* renamed from: n, reason: collision with root package name */
    private final C3865oe0 f23915n;

    /* renamed from: o, reason: collision with root package name */
    private final C4535uW f23916o;

    /* renamed from: p, reason: collision with root package name */
    private final GW f23917p;

    /* renamed from: q, reason: collision with root package name */
    private final C1989Va0 f23918q;

    public C4980yN(Context context, C3043hN c3043hN, C2487cb c2487cb, L1.a aVar, G1.a aVar2, C4775we c4775we, Executor executor, C1825Ra0 c1825Ra0, RN rn, C3275jP c3275jP, ScheduledExecutorService scheduledExecutorService, LQ lq, C3865oe0 c3865oe0, C4535uW c4535uW, CO co, GW gw, C1989Va0 c1989Va0) {
        this.f23902a = context;
        this.f23903b = c3043hN;
        this.f23904c = c2487cb;
        this.f23905d = aVar;
        this.f23906e = aVar2;
        this.f23907f = c4775we;
        this.f23908g = executor;
        this.f23909h = c1825Ra0.zzi;
        this.f23910i = rn;
        this.f23911j = c3275jP;
        this.f23912k = scheduledExecutorService;
        this.f23914m = lq;
        this.f23915n = c3865oe0;
        this.f23916o = c4535uW;
        this.f23913l = co;
        this.f23917p = gw;
        this.f23918q = c1989Va0;
    }

    private final H1.d2 d(int i8, int i9) {
        if (i8 == 0) {
            if (i9 == 0) {
                return H1.d2.zzc();
            }
            i8 = 0;
        }
        return new H1.d2(this.f23902a, new C6528i(i8, i9));
    }

    private static com.google.common.util.concurrent.C e(com.google.common.util.concurrent.C c9, Object obj) {
        final Object obj2 = null;
        return AbstractC1483In0.zzf(c9, Exception.class, new InterfaceC3997pn0(obj2) { // from class: com.google.android.gms.internal.ads.wN
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj3) {
                AbstractC0667v0.zzb("Error during loading assets.", (Exception) obj3);
                return AbstractC1483In0.zzh(null);
            }
        }, AbstractC4805wt.zzf);
    }

    private static com.google.common.util.concurrent.C f(boolean z8, final com.google.common.util.concurrent.C c9, Object obj) {
        return z8 ? AbstractC1483In0.zzn(c9, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.xN
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj2) {
                return obj2 != null ? c9 : AbstractC1483In0.zzg(new C3399kZ(1, "Retrieve required value in native ad response failed."));
            }
        }, AbstractC4805wt.zzf) : e(c9, null);
    }

    private final com.google.common.util.concurrent.C g(JSONObject jSONObject, boolean z8) {
        if (jSONObject == null) {
            return AbstractC1483In0.zzh(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return AbstractC1483In0.zzh(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z8) {
            return AbstractC1483In0.zzh(new BinderC1758Pi(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return f(jSONObject.optBoolean("require"), AbstractC1483In0.zzm(this.f23903b.zzb(strOptString, dOptDouble, zOptBoolean), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.oN
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return new BinderC1758Pi(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.f23908g), null);
    }

    private final com.google.common.util.concurrent.C h(JSONArray jSONArray, boolean z8, boolean z9) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return AbstractC1483In0.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z9 ? jSONArray.length() : 1;
        for (int i8 = 0; i8 < length; i8++) {
            arrayList.add(g(jSONArray.optJSONObject(i8), z8));
        }
        return AbstractC1483In0.zzm(AbstractC1483In0.zzd(arrayList), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.tN
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (BinderC1758Pi binderC1758Pi : (List) obj) {
                    if (binderC1758Pi != null) {
                        arrayList2.add(binderC1758Pi);
                    }
                }
                return arrayList2;
            }
        }, this.f23908g);
    }

    private final com.google.common.util.concurrent.C i(JSONObject jSONObject, C4654va0 c4654va0, C4996ya0 c4996ya0) {
        final com.google.common.util.concurrent.C cZzb = this.f23910i.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), c4654va0, c4996ya0, d(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return AbstractC1483In0.zzn(cZzb, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.pN
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) throws C3399kZ {
                InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
                if (interfaceC2065Wv == null || interfaceC2065Wv.zzq() == null) {
                    throw new C3399kZ(1, "Retrieve video view in html5 ad response failed.");
                }
                return cZzb;
            }
        }, AbstractC4805wt.zzf);
    }

    private static Integer j(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B)));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final BinderC0569r1 k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new BinderC0569r1(strOptString, strOptString2);
    }

    public static final BinderC0569r1 zzi(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return k(jSONObjectOptJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return AbstractC2394bl0.zzm();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return AbstractC2394bl0.zzm();
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
            BinderC0569r1 binderC0569r1K = k(jSONArrayOptJSONArray.optJSONObject(i8));
            if (binderC0569r1K != null) {
                arrayList.add(binderC0569r1K);
            }
        }
        return AbstractC2394bl0.zzk(arrayList);
    }

    final /* synthetic */ BinderC1635Mi a(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numJ = j(jSONObject, "bg_color");
        Integer numJ2 = j(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new BinderC1635Mi(strOptString, list, numJ, numJ2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.f23909h.zze, zOptBoolean);
    }

    final /* synthetic */ com.google.common.util.concurrent.C b(H1.d2 d2Var, C4654va0 c4654va0, C4996ya0 c4996ya0, String str, String str2, Object obj) {
        InterfaceC2065Wv interfaceC2065WvZza = this.f23911j.zza(d2Var, c4654va0, c4996ya0);
        final C1162At c1162AtZza = C1162At.zza(interfaceC2065WvZza);
        C5096zO c5096zOZzb = this.f23913l.zzb();
        interfaceC2065WvZza.zzN().zzR(c5096zOZzb, c5096zOZzb, c5096zOZzb, c5096zOZzb, c5096zOZzb, false, null, new G1.b(this.f23902a, null, null), null, null, this.f23916o, this.f23915n, this.f23914m, null, c5096zOZzb, null, null, null, null);
        interfaceC2065WvZza.zzag("/getNativeAdViewSignals", AbstractC2172Zk.zzs);
        interfaceC2065WvZza.zzag("/getNativeClickMeta", AbstractC2172Zk.zzt);
        interfaceC2065WvZza.zzN().zzB(new InterfaceC1779Pw() { // from class: com.google.android.gms.internal.ads.sN
            @Override // com.google.android.gms.internal.ads.InterfaceC1779Pw
            public final void zza(boolean z8, int i8, String str3, String str4) {
                C1162At c1162At = c1162AtZza;
                if (z8) {
                    c1162At.zzb();
                    return;
                }
                c1162At.zzd(new C3399kZ(1, "Image Web View failed to load. Error code: " + i8 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        interfaceC2065WvZza.zzae(str, str2, null);
        return c1162AtZza;
    }

    final /* synthetic */ com.google.common.util.concurrent.C c(String str, Object obj) throws C3444kw {
        G1.u.zzz();
        InterfaceC2065Wv interfaceC2065WvZza = C3558lw.zza(this.f23902a, C1943Tw.zza(), "native-omid", false, false, this.f23904c, null, this.f23905d, null, null, this.f23906e, this.f23907f, null, null, this.f23917p, this.f23918q);
        final C1162At c1162AtZza = C1162At.zza(interfaceC2065WvZza);
        interfaceC2065WvZza.zzN().zzB(new InterfaceC1779Pw() { // from class: com.google.android.gms.internal.ads.uN
            @Override // com.google.android.gms.internal.ads.InterfaceC1779Pw
            public final void zza(boolean z8, int i8, String str2, String str3) {
                c1162AtZza.zzb();
            }
        });
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzff)).booleanValue()) {
            interfaceC2065WvZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            interfaceC2065WvZza.loadData(str, "text/html", "UTF-8");
        }
        return c1162AtZza;
    }

    public final com.google.common.util.concurrent.C zzd(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return AbstractC1483In0.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return f(jSONObjectOptJSONObject.optBoolean("require"), AbstractC1483In0.zzm(h(jSONArrayOptJSONArray, false, true), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.vN
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return this.zza.a(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.f23908g), null);
    }

    public final com.google.common.util.concurrent.C zze(JSONObject jSONObject, String str) {
        return g(jSONObject.optJSONObject(str), this.f23909h.zzb);
    }

    public final com.google.common.util.concurrent.C zzf(JSONObject jSONObject, String str) {
        C1840Ri c1840Ri = this.f23909h;
        return h(jSONObject.optJSONArray("images"), c1840Ri.zzb, c1840Ri.zzd);
    }

    public final com.google.common.util.concurrent.C zzg(JSONObject jSONObject, String str, final C4654va0 c4654va0, final C4996ya0 c4996ya0) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjZ)).booleanValue()) {
            return AbstractC1483In0.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return AbstractC1483In0.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return AbstractC1483In0.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final H1.d2 d2VarD = d(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return AbstractC1483In0.zzh(null);
        }
        final com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(AbstractC1483In0.zzh(null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.qN
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.b(d2VarD, c4654va0, c4996ya0, strOptString, strOptString2, obj);
            }
        }, AbstractC4805wt.zze);
        return AbstractC1483In0.zzn(cZzn, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.rN
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) throws C3399kZ {
                if (((InterfaceC2065Wv) obj) != null) {
                    return cZzn;
                }
                throw new C3399kZ(1, "Retrieve Web View from image ad response failed.");
            }
        }, AbstractC4805wt.zzf);
    }

    public final com.google.common.util.concurrent.C zzh(JSONObject jSONObject, C4654va0 c4654va0, C4996ya0 c4996ya0) {
        com.google.common.util.concurrent.C cZza;
        JSONObject jSONObjectZzh = K1.Z.zzh(jSONObject, "html_containers", "instream");
        if (jSONObjectZzh != null) {
            return i(jSONObjectZzh, c4654va0, c4996ya0);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return AbstractC1483In0.zzh(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z8 = false;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjY)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z8 = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z8) {
                cZza = this.f23910i.zza(jSONObjectOptJSONObject);
            }
            return e(AbstractC1483In0.zzo(cZza, ((Integer) H1.C.zzc().zza(AbstractC4439th.zzdN)).intValue(), TimeUnit.SECONDS, this.f23912k), null);
        }
        if (!z8) {
            L1.n.zzj("Required field 'vast_xml' or 'html' is missing");
            return AbstractC1483In0.zzh(null);
        }
        cZza = i(jSONObjectOptJSONObject, c4654va0, c4996ya0);
        return e(AbstractC1483In0.zzo(cZza, ((Integer) H1.C.zzc().zza(AbstractC4439th.zzdN)).intValue(), TimeUnit.SECONDS, this.f23912k), null);
    }
}
