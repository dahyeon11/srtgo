package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.l30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3460l30 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f20627a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f20628b;

    public C3460l30(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f20627a = jSONObject;
        this.f20628b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = this.f20627a;
        Bundle bundle = (Bundle) obj;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f20628b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
