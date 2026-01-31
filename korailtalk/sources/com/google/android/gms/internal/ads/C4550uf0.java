package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.uf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4550uf0 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f23097a;

    /* renamed from: b, reason: collision with root package name */
    private final C1180Bf0 f23098b;

    public C4550uf0(C1180Bf0 c1180Bf0) {
        this.f23098b = c1180Bf0;
    }

    public final JSONObject zza() {
        return this.f23097a;
    }

    public final void zzb() {
        this.f23098b.zzb(new AsyncTaskC1221Cf0(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f23098b.zzb(new AsyncTaskC1262Df0(this, hashSet, jSONObject, j8));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f23098b.zzb(new AsyncTaskC1303Ef0(this, hashSet, jSONObject, j8));
    }

    public final void zze(JSONObject jSONObject) {
        this.f23097a = jSONObject;
    }
}
