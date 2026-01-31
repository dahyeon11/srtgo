package com.google.android.gms.internal.ads;

import com.kakao.sdk.user.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Kn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1564Kn {
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final String zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final List zzl;
    public final List zzm;
    public final List zzn;
    public final String zzo;
    public final String zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final List zzt;
    public final String zzu;
    public final String zzv;

    public C1564Kn(JSONObject jSONObject) throws JSONException {
        List listZza;
        this.zzb = jSONObject.optString(Constants.ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            arrayList.add(jSONArray.getString(i8));
        }
        this.zzc = Collections.unmodifiableList(arrayList);
        this.zzd = jSONObject.optString("allocation_id", null);
        G1.u.zzg();
        this.zzf = C1645Mn.zza(jSONObject, "clickurl");
        G1.u.zzg();
        this.zzg = C1645Mn.zza(jSONObject, "imp_urls");
        G1.u.zzg();
        this.zzh = C1645Mn.zza(jSONObject, "downloaded_imp_urls");
        G1.u.zzg();
        this.zzj = C1645Mn.zza(jSONObject, "fill_urls");
        G1.u.zzg();
        this.zzl = C1645Mn.zza(jSONObject, "video_start_urls");
        G1.u.zzg();
        this.zzn = C1645Mn.zza(jSONObject, "video_complete_urls");
        G1.u.zzg();
        this.zzm = C1645Mn.zza(jSONObject, "video_reward_urls");
        this.zzo = jSONObject.optString("transaction_id");
        this.zzp = jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            G1.u.zzg();
            listZza = C1645Mn.zza(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listZza = null;
        }
        this.zzi = listZza;
        this.zza = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.zzk = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        this.zze = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("class_name") : null;
        this.zzq = jSONObject.optString("html_template", null);
        this.zzr = jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        this.zzs = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.toString() : null;
        G1.u.zzg();
        this.zzt = C1645Mn.zza(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.zzu = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.toString() : null;
        this.zzv = jSONObject.optString(com.kakao.sdk.auth.Constants.RESPONSE_TYPE, null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
