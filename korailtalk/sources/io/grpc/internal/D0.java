package io.grpc.internal;

import f3.AbstractC5483q0;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
final class D0 {

    /* renamed from: a, reason: collision with root package name */
    final int f32412a;

    /* renamed from: b, reason: collision with root package name */
    final long f32413b;

    /* renamed from: c, reason: collision with root package name */
    final long f32414c;

    /* renamed from: d, reason: collision with root package name */
    final double f32415d;

    /* renamed from: e, reason: collision with root package name */
    final Long f32416e;

    /* renamed from: f, reason: collision with root package name */
    final Set f32417f;

    D0(int i8, long j8, long j9, double d9, Long l8, Set set) {
        this.f32412a = i8;
        this.f32413b = j8;
        this.f32414c = j9;
        this.f32415d = d9;
        this.f32416e = l8;
        this.f32417f = AbstractC5483q0.copyOf((Collection) set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        return this.f32412a == d02.f32412a && this.f32413b == d02.f32413b && this.f32414c == d02.f32414c && Double.compare(this.f32415d, d02.f32415d) == 0 && e3.r.equal(this.f32416e, d02.f32416e) && e3.r.equal(this.f32417f, d02.f32417f);
    }

    public int hashCode() {
        return e3.r.hashCode(Integer.valueOf(this.f32412a), Long.valueOf(this.f32413b), Long.valueOf(this.f32414c), Double.valueOf(this.f32415d), this.f32416e, this.f32417f);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("maxAttempts", this.f32412a).add("initialBackoffNanos", this.f32413b).add("maxBackoffNanos", this.f32414c).add("backoffMultiplier", this.f32415d).add("perAttemptRecvTimeoutNanos", this.f32416e).add("retryableStatusCodes", this.f32417f).toString();
    }
}
