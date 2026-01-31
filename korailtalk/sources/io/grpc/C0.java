package io.grpc;

import io.grpc.AbstractC5724f0;

/* loaded from: classes.dex */
public abstract class C0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final v0 f31948a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31949b;

        private a(v0 v0Var, String str) {
            this.f31948a = v0Var;
            this.f31949b = str;
        }

        public static a error(String str) {
            return new a(null, (String) e3.w.checkNotNull(str));
        }

        public static a serverBuilder(v0 v0Var) {
            return new a((v0) e3.w.checkNotNull(v0Var), null);
        }

        public String getError() {
            return this.f31949b;
        }

        public v0 getServerBuilder() {
            return this.f31948a;
        }
    }

    public static C0 provider() {
        C0 c0C = D0.getDefaultRegistry().c();
        if (c0C != null) {
            return c0C;
        }
        throw new AbstractC5724f0.b("No functional server found. Try adding a dependency on the grpc-netty or grpc-netty-shaded artifact");
    }

    protected abstract v0 a(int i8);

    protected abstract boolean b();

    protected a c(int i8, z0 z0Var) {
        return a.error("ServerCredentials are unsupported");
    }

    protected abstract int d();
}
