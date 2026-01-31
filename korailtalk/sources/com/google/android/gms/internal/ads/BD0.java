package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public abstract class BD0 {

    /* renamed from: a, reason: collision with root package name */
    final LinkedHashMap f12256a;

    BD0(int i8) {
        this.f12256a = DD0.zzb(i8);
    }

    final BD0 a(Object obj, PD0 pd0) {
        OD0.zza(obj, "key");
        OD0.zza(pd0, "provider");
        this.f12256a.put(obj, pd0);
        return this;
    }
}
