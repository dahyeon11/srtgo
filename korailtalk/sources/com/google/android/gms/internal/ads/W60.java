package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class W60 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16934a;

    public W60(String str) {
        this.f16934a = str;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectZzg = K1.Z.zzg((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.f16934a)) {
                return;
            }
            jSONObjectZzg.put("attok", this.f16934a);
        } catch (JSONException e8) {
            AbstractC0667v0.zzb("Failed putting attestation token.", e8);
        }
    }
}
