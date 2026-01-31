package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class K70 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f13753a;

    public K70(String str) {
        this.f13753a = str;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.f13753a)) {
                return;
            }
            K1.Z.zzg(jSONObject, "pii").put("adsid", this.f13753a);
        } catch (JSONException e8) {
            L1.n.zzk("Failed putting trustless token.", e8);
        }
    }
}
