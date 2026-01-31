package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.e70, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2667e70 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f18736a;

    C2667e70(Context context) {
        this.f18736a = C2142Yq.zzc(context, L1.a.forPackage());
    }

    final /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", this.f18736a);
        } catch (JSONException unused) {
            AbstractC0667v0.zza("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlT)).booleanValue() ? AbstractC1483In0.zzh(new M50() { // from class: com.google.android.gms.internal.ads.c70
            @Override // com.google.android.gms.internal.ads.M50
            public final void zzj(Object obj) {
            }
        }) : AbstractC1483In0.zzh(new M50() { // from class: com.google.android.gms.internal.ads.d70
            @Override // com.google.android.gms.internal.ads.M50
            public final void zzj(Object obj) throws JSONException {
                this.zza.a((JSONObject) obj);
            }
        });
    }
}
