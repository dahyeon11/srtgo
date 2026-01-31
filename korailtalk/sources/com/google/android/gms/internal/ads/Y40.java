package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Y40 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f17335a;

    public Y40(Bundle bundle) {
        this.f17335a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f17335a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
