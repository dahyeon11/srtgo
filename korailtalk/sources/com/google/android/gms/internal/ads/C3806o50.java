package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.o50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3806o50 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21404a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f21405b;

    public C3806o50(String str, Bundle bundle) {
        this.f21404a = str;
        this.f21405b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.f21404a);
        if (this.f21405b.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.f21405b);
    }
}
