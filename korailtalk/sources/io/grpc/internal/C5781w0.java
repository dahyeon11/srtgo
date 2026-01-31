package io.grpc.internal;

import io.grpc.AbstractC5714a0;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;

/* renamed from: io.grpc.internal.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5781w0 extends AbstractC5714a0.f {

    /* renamed from: a, reason: collision with root package name */
    private final C5721e f33206a;

    /* renamed from: b, reason: collision with root package name */
    private final C5728h0 f33207b;

    /* renamed from: c, reason: collision with root package name */
    private final C5730i0 f33208c;

    public C5781w0(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e) {
        this.f33208c = (C5730i0) e3.w.checkNotNull(c5730i0, "method");
        this.f33207b = (C5728h0) e3.w.checkNotNull(c5728h0, "headers");
        this.f33206a = (C5721e) e3.w.checkNotNull(c5721e, "callOptions");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5781w0.class != obj.getClass()) {
            return false;
        }
        C5781w0 c5781w0 = (C5781w0) obj;
        return e3.r.equal(this.f33206a, c5781w0.f33206a) && e3.r.equal(this.f33207b, c5781w0.f33207b) && e3.r.equal(this.f33208c, c5781w0.f33208c);
    }

    @Override // io.grpc.AbstractC5714a0.f
    public C5721e getCallOptions() {
        return this.f33206a;
    }

    @Override // io.grpc.AbstractC5714a0.f
    public C5728h0 getHeaders() {
        return this.f33207b;
    }

    @Override // io.grpc.AbstractC5714a0.f
    public C5730i0 getMethodDescriptor() {
        return this.f33208c;
    }

    public int hashCode() {
        return e3.r.hashCode(this.f33206a, this.f33207b, this.f33208c);
    }

    public final String toString() {
        return "[method=" + this.f33208c + " headers=" + this.f33207b + " callOptions=" + this.f33206a + "]";
    }
}
