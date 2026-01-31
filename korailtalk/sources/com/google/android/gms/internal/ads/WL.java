package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class WL extends XL {

    /* renamed from: b */
    private final JSONObject f16966b;

    /* renamed from: c */
    private final boolean f16967c;

    /* renamed from: d */
    private final boolean f16968d;

    /* renamed from: e */
    private final boolean f16969e;

    /* renamed from: f */
    private final boolean f16970f;

    /* renamed from: g */
    private final String f16971g;

    /* renamed from: h */
    private final JSONObject f16972h;

    public WL(C4654va0 c4654va0, JSONObject jSONObject) {
        super(c4654va0);
        this.f16966b = K1.Z.zzh(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f16967c = K1.Z.zzl(false, jSONObject, "allow_pub_owned_ad_view");
        this.f16968d = K1.Z.zzl(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f16969e = K1.Z.zzl(false, jSONObject, "enable_omid");
        this.f16971g = K1.Z.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.f16970f = jSONObject.optJSONObject("overlay") != null;
        this.f16972h = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfg)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.XL
    public final C1948Ua0 zza() {
        JSONObject jSONObject = this.f16972h;
        return jSONObject != null ? new C1948Ua0(jSONObject) : this.f17237a.zzW;
    }

    @Override // com.google.android.gms.internal.ads.XL
    public final String zzb() {
        return this.f16971g;
    }

    @Override // com.google.android.gms.internal.ads.XL
    public final JSONObject zzc() {
        JSONObject jSONObject = this.f16966b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f17237a.zzA);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.XL
    public final boolean zzd() {
        return this.f16969e;
    }

    @Override // com.google.android.gms.internal.ads.XL
    public final boolean zze() {
        return this.f16967c;
    }

    @Override // com.google.android.gms.internal.ads.XL
    public final boolean zzf() {
        return this.f16968d;
    }

    @Override // com.google.android.gms.internal.ads.XL
    public final boolean zzg() {
        return this.f16970f;
    }
}
