package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.iA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3132iA implements InterfaceC2110Xz {

    /* renamed from: a, reason: collision with root package name */
    private final C3734nS f19893a;

    C3132iA(C3734nS c3734nS) {
        this.f19893a = c3734nS;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2110Xz
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjk)).booleanValue()) {
                this.f19893a.zzn(jSONObject);
            }
        }
    }
}
