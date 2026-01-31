package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class X40 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f17120a;

    X40(Bundle bundle) {
        this.f17120a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return AbstractC1483In0.zzh(new Y40(this.f17120a));
    }
}
