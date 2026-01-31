package com.google.android.gms.internal.ads;

import H1.C0527d0;
import K1.AbstractC0667v0;
import Q7.C0709m;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class CT {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2302ax f12528a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12529b;

    /* renamed from: c, reason: collision with root package name */
    private final L1.a f12530c;

    /* renamed from: d, reason: collision with root package name */
    private final C1825Ra0 f12531d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f12532e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12533f;

    /* renamed from: g, reason: collision with root package name */
    private final RunnableC4660vd0 f12534g;

    /* renamed from: h, reason: collision with root package name */
    private final C3062hb0 f12535h;

    /* renamed from: i, reason: collision with root package name */
    private final FQ f12536i;

    public CT(AbstractC2302ax abstractC2302ax, Context context, L1.a aVar, C1825Ra0 c1825Ra0, Executor executor, String str, RunnableC4660vd0 runnableC4660vd0, FQ fq) {
        this.f12528a = abstractC2302ax;
        this.f12529b = context;
        this.f12530c = aVar;
        this.f12531d = c1825Ra0;
        this.f12532e = executor;
        this.f12533f = str;
        this.f12534g = runnableC4660vd0;
        this.f12535h = abstractC2302ax.zzx();
        this.f12536i = fq;
    }

    private final com.google.common.util.concurrent.C b(final String str, final String str2) {
        InterfaceC3407kd0 interfaceC3407kd0Zza = AbstractC3293jd0.zza(this.f12529b, EnumC1217Cd0.CUI_NAME_ADREQUEST_PARSERESPONSE);
        interfaceC3407kd0Zza.zzj();
        C4451tn c4451tnZza = G1.u.zzf().zza(this.f12529b, this.f12530c, this.f12528a.zzz());
        InterfaceC3768nn interfaceC3768nn = AbstractC4110qn.zza;
        final InterfaceC3199in interfaceC3199inZza = c4451tnZza.zza("google.afma.response.normalize", interfaceC3768nn, interfaceC3768nn);
        com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(AbstractC1483In0.zzn(AbstractC1483In0.zzn(AbstractC1483In0.zzh(""), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.zT
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return AbstractC1483In0.zzh(jSONObject);
                } catch (JSONException e8) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e8.getCause())));
                }
            }
        }, this.f12532e), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.AT
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return interfaceC3199inZza.zzb((JSONObject) obj);
            }
        }, this.f12532e), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.BT
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a((JSONObject) obj);
            }
        }, this.f12532e);
        AbstractC4546ud0.zzb(cZzn, this.f12534g, interfaceC3407kd0Zza);
        return cZzn;
    }

    private final String c(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f12533f));
            }
            return jSONObject.toString();
        } catch (JSONException e8) {
            L1.n.zzj("Failed to update the ad types for rendering. ".concat(e8.toString()));
            return str;
        }
    }

    private static final String d(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(JSONObject jSONObject) {
        return AbstractC1483In0.zzh(new C1457Ia0(new C1334Fa0(this.f12531d), C1416Ha0.zza(new StringReader(jSONObject.toString()), null)));
    }

    public final com.google.common.util.concurrent.C zza() throws JSONException, UnsupportedEncodingException {
        String strZzb = this.f12531d.zzd.zzx;
        if (!TextUtils.isEmpty(strZzb)) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhg)).booleanValue()) {
                String strD = d(strZzb);
                AbstractC3414kh abstractC3414kh = AbstractC4439th.zzhr;
                if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue() && strD.isEmpty()) {
                    int iLastIndexOf = strZzb.lastIndexOf("&request_id=");
                    strD = iLastIndexOf != -1 ? strZzb.substring(iLastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(strD)) {
                    return AbstractC1483In0.zzg(new C3399kZ(15, "Invalid ad string."));
                }
                String strZzb2 = this.f12528a.zzo().zzb(strD, this.f12536i);
                if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue()) {
                    FQ fq = this.f12536i;
                    if (!TextUtils.isEmpty(strZzb2)) {
                        Boolean bool = new JSONObject(strZzb2).optString("is_gbid").equals(C0709m.TRUE) ? Boolean.TRUE : Boolean.FALSE;
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strZzb.lastIndexOf("&");
                            String string = null;
                            String strSubstring = iLastIndexOf2 != -1 ? strZzb.substring(0, iLastIndexOf2) : null;
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                    byte[] bytes = strD.getBytes("UTF-8");
                                    try {
                                        string = new JSONObject(strZzb2).getString("arek");
                                    } catch (JSONException e8) {
                                        AbstractC0667v0.zza("Failed to get key from QueryJSONMap".concat(e8.toString()));
                                        G1.u.zzo().zzw(e8, "CryptoUtils.getKeyFromQueryJsonMap");
                                    }
                                    strZzb = C3062hb0.zzb(bArrDecode, bytes, string, fq);
                                } catch (UnsupportedEncodingException e9) {
                                    AbstractC0667v0.zza("Failed to decode the adResponse. ".concat(e9.toString()));
                                    G1.u.zzo().zzw(e9, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strZzb2)) {
                    return b(strZzb, c(strZzb2));
                }
            }
        }
        C0527d0 c0527d0 = this.f12531d.zzd.zzs;
        if (c0527d0 != null) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhe)).booleanValue()) {
                String str = c0527d0.zza;
                String str2 = c0527d0.zzb;
                String strD2 = d(str);
                String strD3 = d(str2);
                if (TextUtils.isEmpty(strD3) || !strD2.equals(strD3)) {
                    this.f12536i.zzb().put("ridmm", C0709m.TRUE);
                } else {
                    this.f12528a.zzo().zzf(strD2);
                    this.f12536i.zzb().put("request_id", strD2);
                }
            }
            return b(c0527d0.zza, c(c0527d0.zzb));
        }
        return AbstractC1483In0.zzg(new C3399kZ(14, "Mismatch request IDs."));
    }
}
