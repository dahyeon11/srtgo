package io.grpc;

import java.util.concurrent.Executor;

/* renamed from: io.grpc.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5719d {

    /* renamed from: io.grpc.d$a */
    public static abstract class a {
        public abstract void apply(C5728h0 c5728h0);

        public abstract void fail(J0 j02);
    }

    /* renamed from: io.grpc.d$b */
    public static abstract class b {
        public abstract String getAuthority();

        public C5721e getCallOptions() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public abstract C5730i0 getMethodDescriptor();

        public abstract t0 getSecurityLevel();

        public abstract C5713a getTransportAttrs();
    }

    public abstract void applyRequestMetadata(b bVar, Executor executor, a aVar);

    @Deprecated
    public void thisUsesUnstableApi() {
    }
}
