package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.i70, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3127i70 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19889a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19890b;

    public C3127i70(String str, String str2) {
        this.f19889a = str;
        this.f19890b = str2;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectZzg = K1.Z.zzg((JSONObject) obj, "pii");
            jSONObjectZzg.put("doritos", this.f19889a);
            jSONObjectZzg.put("doritos_v2", this.f19890b);
        } catch (JSONException unused) {
            AbstractC0667v0.zza("Failed putting doritos string.");
        }
    }
}
