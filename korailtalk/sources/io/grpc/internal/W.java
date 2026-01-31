package io.grpc.internal;

import f3.AbstractC5483q0;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
final class W {

    /* renamed from: a, reason: collision with root package name */
    final int f32576a;

    /* renamed from: b, reason: collision with root package name */
    final long f32577b;

    /* renamed from: c, reason: collision with root package name */
    final Set f32578c;

    W(int i8, long j8, Set set) {
        this.f32576a = i8;
        this.f32577b = j8;
        this.f32578c = AbstractC5483q0.copyOf((Collection) set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w8 = (W) obj;
        return this.f32576a == w8.f32576a && this.f32577b == w8.f32577b && e3.r.equal(this.f32578c, w8.f32578c);
    }

    public int hashCode() {
        return e3.r.hashCode(Integer.valueOf(this.f32576a), Long.valueOf(this.f32577b), this.f32578c);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("maxAttempts", this.f32576a).add("hedgingDelayNanos", this.f32577b).add("nonFatalStatusCodes", this.f32578c).toString();
    }
}
