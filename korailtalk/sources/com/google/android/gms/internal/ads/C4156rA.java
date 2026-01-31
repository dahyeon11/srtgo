package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4156rA implements InterfaceC2110Xz {

    /* renamed from: a, reason: collision with root package name */
    private final C4803ws f22387a;

    C4156rA(C4803ws c4803ws) {
        this.f22387a = c4803ws;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.ws] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.InterfaceC2110Xz
    public final void zza(JSONObject jSONObject) {
        this.f22387a.zzb(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
