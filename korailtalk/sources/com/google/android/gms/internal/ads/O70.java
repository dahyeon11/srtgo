package com.google.android.gms.internal.ads;

import H1.C0591z;
import K1.AbstractC0667v0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class O70 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f15051a;

    public O70(Map map) {
        this.f15051a = map;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("video_decoders", C0591z.zzb().zzj(this.f15051a));
        } catch (JSONException e8) {
            AbstractC0667v0.zza("Could not encode video decoder properties: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
