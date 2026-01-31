package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2410bt0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f18191a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f18192b;

    /* synthetic */ C2410bt0(Class cls, Class cls2, AbstractC2295at0 abstractC2295at0) {
        this.f18191a = cls;
        this.f18192b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2410bt0)) {
            return false;
        }
        C2410bt0 c2410bt0 = (C2410bt0) obj;
        return c2410bt0.f18191a.equals(this.f18191a) && c2410bt0.f18192b.equals(this.f18192b);
    }

    public final int hashCode() {
        return Objects.hash(this.f18191a, this.f18192b);
    }

    public final String toString() {
        Class cls = this.f18192b;
        return this.f18191a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
