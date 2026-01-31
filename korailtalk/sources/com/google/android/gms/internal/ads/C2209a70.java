package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.a70, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2209a70 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f17896a;

    public C2209a70(JSONObject jSONObject) {
        this.f17896a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("cache_state", this.f17896a);
        } catch (JSONException unused) {
            AbstractC0667v0.zza("Unable to get cache_state");
        }
    }
}
