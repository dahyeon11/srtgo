package com.google.android.gms.internal.ads;

import H1.C0591z;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hV, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3054hV implements InterfaceC3654mn {
    C3054hV() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3654mn
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        C3169iV c3169iV = (C3169iV) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjn)).booleanValue()) {
            jSONObject2.put("ad_request_url", c3169iV.zzd.zzg());
            jSONObject2.put("ad_request_post_body", c3169iV.zzd.zzf());
        }
        jSONObject2.put("base_url", c3169iV.zzd.zzd());
        jSONObject2.put("signals", c3169iV.zzc);
        jSONObject3.put("body", c3169iV.zzb.zzc);
        jSONObject3.put("headers", C0591z.zzb().zzj(c3169iV.zzb.zzb));
        jSONObject3.put("response_code", c3169iV.zzb.zza);
        jSONObject3.put("latency", c3169iV.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", c3169iV.zzd.zzi());
        return jSONObject;
    }
}
