package C7;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes3.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    final C0467a f585a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f586b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f587c;

    public L(C0467a c0467a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c0467a == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f585a = c0467a;
        this.f586b = proxy;
        this.f587c = inetSocketAddress;
    }

    public C0467a address() {
        return this.f585a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof L) {
            L l8 = (L) obj;
            if (l8.f585a.equals(this.f585a) && l8.f586b.equals(this.f586b) && l8.f587c.equals(this.f587c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f585a.hashCode()) * 31) + this.f586b.hashCode()) * 31) + this.f587c.hashCode();
    }

    public Proxy proxy() {
        return this.f586b;
    }

    public boolean requiresTunnel() {
        return this.f585a.f598i != null && this.f586b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress socketAddress() {
        return this.f587c;
    }

    public String toString() {
        return "Route{" + this.f587c + "}";
    }
}
