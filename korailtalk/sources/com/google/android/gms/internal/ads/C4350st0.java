package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.st0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4350st0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f22701a;

    /* renamed from: b, reason: collision with root package name */
    private final Mx0 f22702b;

    /* synthetic */ C4350st0(Class cls, Mx0 mx0, AbstractC4236rt0 abstractC4236rt0) {
        this.f22701a = cls;
        this.f22702b = mx0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4350st0)) {
            return false;
        }
        C4350st0 c4350st0 = (C4350st0) obj;
        return c4350st0.f22701a.equals(this.f22701a) && c4350st0.f22702b.equals(this.f22702b);
    }

    public final int hashCode() {
        return Objects.hash(this.f22701a, this.f22702b);
    }

    public final String toString() {
        Mx0 mx0 = this.f22702b;
        return this.f22701a.getSimpleName() + ", object identifier: " + String.valueOf(mx0);
    }
}
