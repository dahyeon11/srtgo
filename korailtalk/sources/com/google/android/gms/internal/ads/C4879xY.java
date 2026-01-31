package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xY, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4879xY implements InterfaceC3397kX {

    /* renamed from: a, reason: collision with root package name */
    private final C5098zP f23744a;

    public C4879xY(C5098zP c5098zP) {
        this.f23744a = c5098zP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3397kX
    public final C3511lX zza(String str, JSONObject jSONObject) {
        return new C3511lX(this.f23744a.zzc(str, jSONObject), new BinderC2942gY(), str);
    }
}
