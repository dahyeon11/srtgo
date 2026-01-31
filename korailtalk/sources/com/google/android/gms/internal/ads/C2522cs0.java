package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2522cs0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f18357a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final Map f18358b = new HashMap();

    /* synthetic */ C2522cs0(AbstractC2408bs0 abstractC2408bs0) {
    }

    public final C2522cs0 zza(Enum r22, Object obj) {
        this.f18357a.put(r22, obj);
        this.f18358b.put(obj, r22);
        return this;
    }

    public final C2751es0 zzb() {
        return new C2751es0(Collections.unmodifiableMap(this.f18357a), Collections.unmodifiableMap(this.f18358b), null);
    }
}
