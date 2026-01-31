package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class C70 implements N50 {
    @Override // com.google.android.gms.internal.ads.N50
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return AbstractC1483In0.zzh(new M50() { // from class: com.google.android.gms.internal.ads.D70
            @Override // com.google.android.gms.internal.ads.M50
            public final void zzj(Object obj) throws JSONException {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
