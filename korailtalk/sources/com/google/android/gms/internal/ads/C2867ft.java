package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ft */
/* loaded from: classes2.dex */
public final class C2867ft {

    /* renamed from: d */
    private String f19260d;

    /* renamed from: e */
    private String f19261e;

    /* renamed from: f */
    private long f19262f;

    /* renamed from: g */
    private JSONObject f19263g;

    /* renamed from: h */
    private boolean f19264h;

    /* renamed from: j */
    private boolean f19266j;

    /* renamed from: a */
    private final List f19257a = new ArrayList();

    /* renamed from: b */
    private final List f19258b = new ArrayList();

    /* renamed from: c */
    private final Map f19259c = new HashMap();

    /* renamed from: i */
    private final List f19265i = new ArrayList();

    public C2867ft(String str, long j8) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f19260d = "";
        this.f19264h = false;
        this.f19266j = false;
        this.f19261e = str;
        this.f19262f = j8;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f19263g = new JSONObject(str);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlI)).booleanValue() && zzj()) {
                return;
            }
            if (this.f19263g.optInt(androidx.core.app.r.CATEGORY_STATUS, -1) != 1) {
                this.f19264h = false;
                L1.n.zzj("App settings could not be fetched successfully.");
                return;
            }
            this.f19264h = true;
            this.f19260d = this.f19263g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.f19263g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i8);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f19258b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f19259c.put(strOptString2, new C1605Ln(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f19263g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i9 = 0; i9 < jSONArrayOptJSONArray3.length(); i9++) {
                    this.f19257a.add(jSONArrayOptJSONArray3.optString(i9));
                }
            }
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhd)).booleanValue() && (jSONObjectOptJSONObject2 = this.f19263g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f19265i.add(jSONArrayOptJSONArray.get(i10).toString());
                }
            }
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgy)).booleanValue() || (jSONObjectOptJSONObject = this.f19263g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f19266j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e8) {
            L1.n.zzk("Exception occurred while processing app setting json", e8);
            G1.u.zzo().zzw(e8, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long zza() {
        return this.f19262f;
    }

    public final String zzb() {
        return this.f19260d;
    }

    public final String zzc() {
        return this.f19261e;
    }

    public final List zzd() {
        return this.f19265i;
    }

    public final Map zze() {
        return this.f19259c;
    }

    public final JSONObject zzf() {
        return this.f19263g;
    }

    public final void zzg(long j8) {
        this.f19262f = j8;
    }

    public final boolean zzh() {
        return this.f19266j;
    }

    public final boolean zzi() {
        return this.f19264h;
    }

    public final boolean zzj() {
        if (!TextUtils.isEmpty(this.f19261e) && this.f19263g != null) {
            AbstractC3414kh abstractC3414kh = AbstractC4439th.zzlL;
            long jLongValue = ((Long) H1.C.zzc().zza(abstractC3414kh)).longValue();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlK)).booleanValue() && !TextUtils.isEmpty(this.f19261e)) {
                jLongValue = this.f19263g.optLong("cache_ttl_sec", ((Long) H1.C.zzc().zza(abstractC3414kh)).longValue());
            }
            long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
            if (jLongValue >= 0) {
                long j8 = this.f19262f;
                if (j8 > jCurrentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j8) > jLongValue) {
                    this.f19257a.clear();
                    this.f19258b.clear();
                    this.f19259c.clear();
                    this.f19260d = "";
                    this.f19261e = "";
                    this.f19263g = null;
                    this.f19264h = false;
                    this.f19265i.clear();
                    this.f19266j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
