package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class N60 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    final String f14799a;

    /* renamed from: b, reason: collision with root package name */
    final int f14800b;

    public N60(String str, int i8) {
        this.f14799a = str;
        this.f14800b = i8;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.f14799a) || this.f14800b == -1) {
            return;
        }
        try {
            JSONObject jSONObjectZzg = K1.Z.zzg(jSONObject, "pii");
            jSONObjectZzg.put("pvid", this.f14799a);
            jSONObjectZzg.put("pvid_s", this.f14800b);
        } catch (JSONException e8) {
            AbstractC0667v0.zzb("Failed putting gms core app set ID info.", e8);
        }
    }
}
