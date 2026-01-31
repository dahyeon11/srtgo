package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class Hy0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13377a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13378b;

    Hy0(Object obj, int i8) {
        this.f13377a = obj;
        this.f13378b = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Hy0)) {
            return false;
        }
        Hy0 hy0 = (Hy0) obj;
        return this.f13377a == hy0.f13377a && this.f13378b == hy0.f13378b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f13377a) * 65535) + this.f13378b;
    }
}
