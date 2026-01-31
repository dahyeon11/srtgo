package com.google.android.gms.internal.ads;

import D1.a;
import K1.AbstractC0667v0;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.l60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3466l60 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final a.C0017a f20635a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20636b;

    /* renamed from: c, reason: collision with root package name */
    private final C2003Vh0 f20637c;

    public C3466l60(a.C0017a c0017a, String str, C2003Vh0 c2003Vh0) {
        this.f20635a = c0017a;
        this.f20636b = str;
        this.f20637c = c2003Vh0;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectZzg = K1.Z.zzg((JSONObject) obj, "pii");
            a.C0017a c0017a = this.f20635a;
            if (c0017a == null || TextUtils.isEmpty(c0017a.getId())) {
                String str = this.f20636b;
                if (str != null) {
                    jSONObjectZzg.put("pdid", str);
                    jSONObjectZzg.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzg.put("rdid", this.f20635a.getId());
            jSONObjectZzg.put("is_lat", this.f20635a.isLimitAdTrackingEnabled());
            jSONObjectZzg.put("idtype", "adid");
            C2003Vh0 c2003Vh0 = this.f20637c;
            if (c2003Vh0.zzc()) {
                jSONObjectZzg.put("paidv1_id_android_3p", c2003Vh0.zzb());
                jSONObjectZzg.put("paidv1_creation_time_android_3p", this.f20637c.zza());
            }
        } catch (JSONException e8) {
            AbstractC0667v0.zzb("Failed putting Ad ID.", e8);
        }
    }
}
