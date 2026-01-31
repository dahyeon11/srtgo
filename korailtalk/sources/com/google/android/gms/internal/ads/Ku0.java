package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Ku0 {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f13871a = new HashMap();

    public final Mu0 zza() {
        if (this.f13871a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Mu0 mu0 = new Mu0(Collections.unmodifiableMap(this.f13871a), null);
        this.f13871a = null;
        return mu0;
    }
}
