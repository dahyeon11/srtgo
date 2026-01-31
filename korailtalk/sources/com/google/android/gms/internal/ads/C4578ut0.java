package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ut0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4578ut0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f23123a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f23124b;

    /* synthetic */ C4578ut0(Class cls, Class cls2, AbstractC4464tt0 abstractC4464tt0) {
        this.f23123a = cls;
        this.f23124b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4578ut0)) {
            return false;
        }
        C4578ut0 c4578ut0 = (C4578ut0) obj;
        return c4578ut0.f23123a.equals(this.f23123a) && c4578ut0.f23124b.equals(this.f23124b);
    }

    public final int hashCode() {
        return Objects.hash(this.f23123a, this.f23124b);
    }

    public final String toString() {
        Class cls = this.f23124b;
        return this.f23123a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
