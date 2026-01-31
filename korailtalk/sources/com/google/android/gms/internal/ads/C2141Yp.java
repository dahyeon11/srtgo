package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Yp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2141Yp {
    public final boolean zza;
    public final String zzb;

    public C2141Yp(boolean z8, String str) {
        this.zza = z8;
        this.zzb = str;
    }

    public static C2141Yp zza(JSONObject jSONObject) {
        return new C2141Yp(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
