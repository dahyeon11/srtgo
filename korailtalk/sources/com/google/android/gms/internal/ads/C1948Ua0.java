package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ua0 */
/* loaded from: classes2.dex */
public final class C1948Ua0 {

    /* renamed from: a */
    private final JSONObject f16690a;

    public C1948Ua0(JSONObject jSONObject) {
        this.f16690a = jSONObject;
    }

    public final String zza() {
        if (zzc() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean zzb() {
        return this.f16690a.optBoolean((String) H1.C.zzc().zza(AbstractC4439th.zzfd), true);
    }

    public final int zzc() {
        int iOptInt = this.f16690a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
