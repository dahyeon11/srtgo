package com.google.android.gms.internal.ads;

import com.kakao.sdk.template.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gS */
/* loaded from: classes2.dex */
final class C2936gS {

    /* renamed from: a */
    private final String f19357a;

    /* renamed from: b */
    private final String f19358b;

    /* renamed from: c */
    private final String f19359c;

    /* renamed from: d */
    private final int f19360d;

    /* renamed from: e */
    private final String f19361e;

    /* renamed from: f */
    private final int f19362f;

    /* renamed from: g */
    private final boolean f19363g;

    public C2936gS(String str, String str2, String str3, int i8, String str4, int i9, boolean z8) {
        this.f19357a = str;
        this.f19358b = str2;
        this.f19359c = str3;
        this.f19360d = i8;
        this.f19361e = str4;
        this.f19362f = i9;
        this.f19363g = z8;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f19357a);
        jSONObject.put("version", this.f19359c);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjq)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f19358b);
        }
        jSONObject.put(androidx.core.app.r.CATEGORY_STATUS, this.f19360d);
        jSONObject.put(Constants.DESCRIPTION, this.f19361e);
        jSONObject.put("initializationLatencyMillis", this.f19362f);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjr)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f19363g);
        }
        return jSONObject;
    }
}
