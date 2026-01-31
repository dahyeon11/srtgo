package io.grpc;

import java.util.Collection;

/* renamed from: io.grpc.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC5724f0 {

    /* renamed from: io.grpc.f0$a */
    public static final class a {

        /* renamed from: a */
        private final AbstractC5722e0 f32121a;

        /* renamed from: b */
        private final String f32122b;

        private a(AbstractC5722e0 abstractC5722e0, String str) {
            this.f32121a = abstractC5722e0;
            this.f32122b = str;
        }

        public static a channelBuilder(AbstractC5722e0 abstractC5722e0) {
            return new a((AbstractC5722e0) e3.w.checkNotNull(abstractC5722e0), null);
        }

        public static a error(String str) {
            return new a(null, (String) e3.w.checkNotNull(str));
        }

        public AbstractC5722e0 getChannelBuilder() {
            return this.f32121a;
        }

        public String getError() {
            return this.f32122b;
        }
    }

    /* renamed from: io.grpc.f0$b */
    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    public static AbstractC5724f0 provider() {
        AbstractC5724f0 abstractC5724f0E = C5726g0.getDefaultRegistry().e();
        if (abstractC5724f0E != null) {
            return abstractC5724f0E;
        }
        throw new b("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    protected abstract Collection a();

    protected abstract AbstractC5722e0 builderForAddress(String str, int i8);

    protected abstract AbstractC5722e0 builderForTarget(String str);

    protected abstract boolean isAvailable();

    protected a newChannelBuilder(String str, AbstractC5725g abstractC5725g) {
        return a.error("ChannelCredentials are unsupported");
    }

    protected abstract int priority();
}
