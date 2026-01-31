package io.grpc;

/* loaded from: classes.dex */
public abstract class F0 extends M0 {

    public static abstract class a {
        public abstract F0 newServerStreamTracer(String str, C5728h0 c5728h0);
    }

    private static final class b extends G {

        /* renamed from: a, reason: collision with root package name */
        private final c f31960a;

        private b(c cVar) {
            this.f31960a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(c cVar) {
            return new b(cVar);
        }

        @Override // io.grpc.G, io.grpc.AbstractC5797o0
        protected w0 a() {
            throw new UnsupportedOperationException();
        }

        @Override // io.grpc.G, io.grpc.AbstractC5797o0, io.grpc.w0
        public C5713a getAttributes() {
            return this.f31960a.getAttributes();
        }

        @Override // io.grpc.G, io.grpc.AbstractC5797o0, io.grpc.w0
        public String getAuthority() {
            return this.f31960a.getAuthority();
        }

        @Override // io.grpc.G, io.grpc.w0
        public C5730i0 getMethodDescriptor() {
            return this.f31960a.getMethodDescriptor();
        }

        @Override // io.grpc.G, io.grpc.AbstractC5797o0, io.grpc.w0
        public boolean isCancelled() {
            return false;
        }

        @Override // io.grpc.G, io.grpc.AbstractC5797o0, io.grpc.w0
        public boolean isReady() {
            return false;
        }
    }

    public static abstract class c {
        public abstract C5713a getAttributes();

        public abstract String getAuthority();

        public abstract C5730i0 getMethodDescriptor();
    }

    public C5804v filterContext(C5804v c5804v) {
        return c5804v;
    }

    @Deprecated
    public void serverCallStarted(w0 w0Var) {
    }

    public void serverCallStarted(c cVar) {
        serverCallStarted(b.c(cVar));
    }
}
