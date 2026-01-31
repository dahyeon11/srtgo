package io.grpc;

import io.grpc.C5721e;

/* renamed from: io.grpc.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5794n extends M0 {
    public static final C5721e.c NAME_RESOLUTION_DELAYED = C5721e.c.createWithDefault("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED", Boolean.FALSE);

    /* renamed from: io.grpc.n$a */
    public static abstract class a {
        public AbstractC5794n newClientStreamTracer(b bVar, C5728h0 c5728h0) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: io.grpc.n$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final C5721e f33263a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33264b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f33265c;

        /* renamed from: io.grpc.n$b$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private C5721e f33266a = C5721e.DEFAULT;

            /* renamed from: b, reason: collision with root package name */
            private int f33267b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f33268c;

            a() {
            }

            public b build() {
                return new b(this.f33266a, this.f33267b, this.f33268c);
            }

            public a setCallOptions(C5721e c5721e) {
                this.f33266a = (C5721e) e3.w.checkNotNull(c5721e, "callOptions cannot be null");
                return this;
            }

            public a setIsTransparentRetry(boolean z8) {
                this.f33268c = z8;
                return this;
            }

            public a setPreviousAttempts(int i8) {
                this.f33267b = i8;
                return this;
            }
        }

        b(C5721e c5721e, int i8, boolean z8) {
            this.f33263a = (C5721e) e3.w.checkNotNull(c5721e, "callOptions");
            this.f33264b = i8;
            this.f33265c = z8;
        }

        public static a newBuilder() {
            return new a();
        }

        public C5721e getCallOptions() {
            return this.f33263a;
        }

        public int getPreviousAttempts() {
            return this.f33264b;
        }

        public boolean isTransparentRetry() {
            return this.f33265c;
        }

        public a toBuilder() {
            return new a().setCallOptions(this.f33263a).setPreviousAttempts(this.f33264b).setIsTransparentRetry(this.f33265c);
        }

        public String toString() {
            return e3.p.toStringHelper(this).add("callOptions", this.f33263a).add("previousAttempts", this.f33264b).add("isTransparentRetry", this.f33265c).toString();
        }
    }

    public void createPendingStream() {
    }

    public void inboundHeaders() {
    }

    public void inboundTrailers(C5728h0 c5728h0) {
    }

    public void outboundHeaders() {
    }

    public void streamCreated(C5713a c5713a, C5728h0 c5728h0) {
    }
}
