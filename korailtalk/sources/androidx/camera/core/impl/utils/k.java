package androidx.camera.core.impl.utils;

import H0.y;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final long f7716a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7717b;

    k(long j8, long j9) {
        this.f7716a = j8;
        this.f7717b = j9;
    }

    long a() {
        return this.f7717b;
    }

    long b() {
        return this.f7716a;
    }

    double c() {
        return this.f7716a / this.f7717b;
    }

    public String toString() {
        return this.f7716a + "/" + this.f7717b;
    }

    k(double d9) {
        this((long) (d9 * 10000.0d), y.MIN_BACKOFF_MILLIS);
    }
}
