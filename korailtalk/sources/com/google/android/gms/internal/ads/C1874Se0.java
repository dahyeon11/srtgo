package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Se0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1874Se0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1344Ff0 f16312a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16313b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC1137Ae0 f16314c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16315d = "Ad overlay";

    public C1874Se0(View view, EnumC1137Ae0 enumC1137Ae0, String str) {
        this.f16312a = new C1344Ff0(view);
        this.f16313b = view.getClass().getCanonicalName();
        this.f16314c = enumC1137Ae0;
    }

    public final EnumC1137Ae0 zza() {
        return this.f16314c;
    }

    public final C1344Ff0 zzb() {
        return this.f16312a;
    }

    public final String zzc() {
        return this.f16315d;
    }

    public final String zzd() {
        return this.f16313b;
    }
}
