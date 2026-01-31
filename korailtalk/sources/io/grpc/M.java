package io.grpc;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* loaded from: classes.dex */
public final class M extends r0 {

    /* renamed from: a, reason: collision with root package name */
    private final SocketAddress f31992a;

    /* renamed from: b, reason: collision with root package name */
    private final InetSocketAddress f31993b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31994c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31995d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private SocketAddress f31996a;

        /* renamed from: b, reason: collision with root package name */
        private InetSocketAddress f31997b;

        /* renamed from: c, reason: collision with root package name */
        private String f31998c;

        /* renamed from: d, reason: collision with root package name */
        private String f31999d;

        public M build() {
            return new M(this.f31996a, this.f31997b, this.f31998c, this.f31999d);
        }

        public b setPassword(String str) {
            this.f31999d = str;
            return this;
        }

        public b setProxyAddress(SocketAddress socketAddress) {
            this.f31996a = (SocketAddress) e3.w.checkNotNull(socketAddress, "proxyAddress");
            return this;
        }

        public b setTargetAddress(InetSocketAddress inetSocketAddress) {
            this.f31997b = (InetSocketAddress) e3.w.checkNotNull(inetSocketAddress, "targetAddress");
            return this;
        }

        public b setUsername(String str) {
            this.f31998c = str;
            return this;
        }

        private b() {
        }
    }

    public static b newBuilder() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        return e3.r.equal(this.f31992a, m8.f31992a) && e3.r.equal(this.f31993b, m8.f31993b) && e3.r.equal(this.f31994c, m8.f31994c) && e3.r.equal(this.f31995d, m8.f31995d);
    }

    public String getPassword() {
        return this.f31995d;
    }

    public SocketAddress getProxyAddress() {
        return this.f31992a;
    }

    public InetSocketAddress getTargetAddress() {
        return this.f31993b;
    }

    public String getUsername() {
        return this.f31994c;
    }

    public int hashCode() {
        return e3.r.hashCode(this.f31992a, this.f31993b, this.f31994c, this.f31995d);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("proxyAddr", this.f31992a).add("targetAddr", this.f31993b).add("username", this.f31994c).add("hasPassword", this.f31995d != null).toString();
    }

    private M(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        e3.w.checkNotNull(socketAddress, "proxyAddress");
        e3.w.checkNotNull(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            e3.w.checkState(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f31992a = socketAddress;
        this.f31993b = inetSocketAddress;
        this.f31994c = str;
        this.f31995d = str2;
    }
}
