package com.google.android.gms.internal.ads;

import H1.C0591z;
import K1.AbstractC0667v0;
import android.os.Bundle;
import com.kakao.sdk.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.s70, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4265s70 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f22574a;

    public C4265s70(Bundle bundle) {
        this.f22574a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f22574a != null) {
            try {
                K1.Z.zzg(K1.Z.zzg(jSONObject, Constants.DEVICE), "play_store").put("parental_controls", C0591z.zzb().zzi(this.f22574a));
            } catch (JSONException unused) {
                AbstractC0667v0.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
