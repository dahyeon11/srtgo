package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class CD0 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12500a;

    CD0(Map map) {
        this.f12500a = Collections.unmodifiableMap(map);
    }

    final Map a() {
        return this.f12500a;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public abstract /* synthetic */ Object zzb();
}
