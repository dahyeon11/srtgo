package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class I60 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f13416a;

    public I60(JSONObject jSONObject) {
        this.f13416a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectZzg = K1.Z.zzg((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f13416a;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectZzg.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            AbstractC0667v0.zza("Failed putting app indexing json.");
        }
    }
}
