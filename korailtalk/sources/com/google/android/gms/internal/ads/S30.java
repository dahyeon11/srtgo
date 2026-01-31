package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class S30 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16189a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16190b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f16191c;

    /* synthetic */ S30(String str, String str2, Bundle bundle, R30 r30) {
        this.f16189a = str;
        this.f16190b = str2;
        this.f16191c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f16189a);
        bundle.putString("fc_consent", this.f16190b);
        bundle.putBundle("iab_consent_info", this.f16191c);
    }
}
