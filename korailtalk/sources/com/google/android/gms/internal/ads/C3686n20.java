package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.n20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3686n20 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f21182a;

    C3686n20(Bundle bundle) {
        this.f21182a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f21182a.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.f21182a);
    }
}
