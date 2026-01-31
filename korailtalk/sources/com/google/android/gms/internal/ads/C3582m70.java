package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.m70, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3582m70 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final List f20848a;

    public C3582m70(List list) {
        this.f20848a = list;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f20848a));
        } catch (JSONException unused) {
            AbstractC0667v0.zza("Failed putting experiment ids.");
        }
    }
}
