package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ln, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1605Ln {
    public final List zza;
    public final List zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final List zzf;
    public final String zzg;
    public final String zzh;

    public C1605Ln(JSONObject jSONObject) throws JSONException {
        if (L1.n.zzm(2)) {
            AbstractC0667v0.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i8 = -1;
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            try {
                C1564Kn c1564Kn = new C1564Kn(jSONArray.getJSONObject(i9));
                "banner".equalsIgnoreCase(c1564Kn.zzv);
                arrayList.add(c1564Kn);
                if (i8 < 0) {
                    Iterator it = c1564Kn.zzc.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i8 = i9;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        this.zzg = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject == null) {
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzh = null;
            return;
        }
        jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        G1.u.zzg();
        this.zzb = C1645Mn.zza(jSONObjectOptJSONObject, "click_urls");
        G1.u.zzg();
        this.zzc = C1645Mn.zza(jSONObjectOptJSONObject, "imp_urls");
        G1.u.zzg();
        this.zzd = C1645Mn.zza(jSONObjectOptJSONObject, "downloaded_imp_urls");
        G1.u.zzg();
        this.zze = C1645Mn.zza(jSONObjectOptJSONObject, "nofill_urls");
        G1.u.zzg();
        this.zzf = C1645Mn.zza(jSONObjectOptJSONObject, "remote_ping_urls");
        jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
        jSONObjectOptJSONObject.optLong("refresh", -1L);
        C1242Cr c1242CrZza = C1242Cr.zza(jSONObjectOptJSONObject.optJSONArray("rewards"));
        if (c1242CrZza == null) {
            this.zzh = null;
        } else {
            this.zzh = c1242CrZza.zza;
        }
        jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
