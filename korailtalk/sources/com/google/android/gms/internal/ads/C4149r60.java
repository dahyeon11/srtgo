package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.r60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4149r60 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22380a;

    public C4149r60(String str) {
        this.f22380a = str;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("ms", this.f22380a);
        } catch (JSONException e8) {
            AbstractC0667v0.zzb("Failed putting Ad ID.", e8);
        }
    }
}
