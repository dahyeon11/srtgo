package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class CV {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2060Wq f12540a;

    CV(AbstractC2060Wq abstractC2060Wq) {
        this.f12540a = abstractC2060Wq;
    }

    public static void zza(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
        if (jSONObjectOptJSONObject == null) {
            AbstractC0667v0.zza("DSID signal does not exist.");
            return;
        }
        if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
            map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
        }
        if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
            return;
        }
        map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
    }

    public final void zzb() {
        com.google.common.util.concurrent.C cZza = this.f12540a.zza();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhP)).booleanValue()) {
            AbstractC5147zt.zzb(cZza, "persistFlags");
        } else {
            AbstractC5147zt.zza(cZza, "persistFlags");
        }
    }
}
