package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Dd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1257Dd {

    /* renamed from: a, reason: collision with root package name */
    final long f12696a;

    /* renamed from: b, reason: collision with root package name */
    final String f12697b;

    /* renamed from: c, reason: collision with root package name */
    final int f12698c;

    C1257Dd(long j8, String str, int i8) {
        this.f12696a = j8;
        this.f12697b = str;
        this.f12698c = i8;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1257Dd)) {
            C1257Dd c1257Dd = (C1257Dd) obj;
            if (c1257Dd.f12696a == this.f12696a && c1257Dd.f12698c == this.f12698c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f12696a;
    }
}
