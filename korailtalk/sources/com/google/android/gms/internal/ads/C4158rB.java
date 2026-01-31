package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4158rB implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22390a;

    public C4158rB(XD0 xd0) {
        this.f22390a = xd0;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((C4049qD) this.f22390a).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
