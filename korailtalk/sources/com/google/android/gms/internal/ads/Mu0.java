package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class Mu0 {
    public static final Mu0 zza = new Ku0().zza();

    /* renamed from: a, reason: collision with root package name */
    private final Map f14726a;

    public final boolean equals(Object obj) {
        if (obj instanceof Mu0) {
            return this.f14726a.equals(((Mu0) obj).f14726a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14726a.hashCode();
    }

    public final String toString() {
        return this.f14726a.toString();
    }

    public final Map zza() {
        return this.f14726a;
    }
}
