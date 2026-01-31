package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qR */
/* loaded from: classes2.dex */
final class C4075qR {

    /* renamed from: a */
    private Long f21934a;

    /* renamed from: b */
    private final String f21935b;

    /* renamed from: c */
    private String f21936c;

    /* renamed from: d */
    private Integer f21937d;

    /* renamed from: e */
    private String f21938e;

    /* renamed from: f */
    private Integer f21939f;

    /* synthetic */ C4075qR(String str, AbstractC3961pR abstractC3961pR) {
        this.f21935b = str;
    }

    static /* bridge */ /* synthetic */ String a(C4075qR c4075qR) throws JSONException {
        String str = (String) H1.C.zzc().zza(AbstractC4439th.zzjX);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", c4075qR.f21934a);
            jSONObject.put("eventCategory", c4075qR.f21935b);
            jSONObject.putOpt(androidx.core.app.r.CATEGORY_EVENT, c4075qR.f21936c);
            jSONObject.putOpt("errorCode", c4075qR.f21937d);
            jSONObject.putOpt("rewardType", c4075qR.f21938e);
            jSONObject.putOpt("rewardAmount", c4075qR.f21939f);
        } catch (JSONException unused) {
            L1.n.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
