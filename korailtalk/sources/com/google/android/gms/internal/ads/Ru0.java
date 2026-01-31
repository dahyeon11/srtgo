package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class Ru0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1198Bo0 f16158a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16159b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16160c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16161d;

    /* synthetic */ Ru0(C1198Bo0 c1198Bo0, int i8, String str, String str2, Qu0 qu0) {
        this.f16158a = c1198Bo0;
        this.f16159b = i8;
        this.f16160c = str;
        this.f16161d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ru0)) {
            return false;
        }
        Ru0 ru0 = (Ru0) obj;
        return this.f16158a == ru0.f16158a && this.f16159b == ru0.f16159b && this.f16160c.equals(ru0.f16160c) && this.f16161d.equals(ru0.f16161d);
    }

    public final int hashCode() {
        return Objects.hash(this.f16158a, Integer.valueOf(this.f16159b), this.f16160c, this.f16161d);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f16158a, Integer.valueOf(this.f16159b), this.f16160c, this.f16161d);
    }

    public final int zza() {
        return this.f16159b;
    }
}
