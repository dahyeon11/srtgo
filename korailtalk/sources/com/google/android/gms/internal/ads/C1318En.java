package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.En */
/* loaded from: classes2.dex */
final class C1318En implements InterfaceC4106ql {

    /* renamed from: a */
    private final C1203Bt f12853a;

    /* renamed from: b */
    final /* synthetic */ C1359Fn f12854b;

    public C1318En(C1359Fn c1359Fn, C1203Bt c1203Bt) {
        this.f12854b = c1359Fn;
        this.f12853a = c1203Bt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4106ql
    public final void zza(String str) {
        try {
            if (str == null) {
                this.f12853a.zzd(new C3085hn());
            } else {
                this.f12853a.zzd(new C3085hn(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4106ql
    public final void zzb(JSONObject jSONObject) {
        try {
            this.f12853a.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e8) {
            this.f12853a.zzd(e8);
        }
    }
}
