package C7;

import C7.A;
import com.kakao.sdk.common.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: C7.a */
/* loaded from: classes3.dex */
public final class C0467a {

    /* renamed from: a */
    final A f590a;

    /* renamed from: b */
    final s f591b;

    /* renamed from: c */
    final SocketFactory f592c;

    /* renamed from: d */
    final InterfaceC0469c f593d;

    /* renamed from: e */
    final List f594e;

    /* renamed from: f */
    final List f595f;

    /* renamed from: g */
    final ProxySelector f596g;

    /* renamed from: h */
    final Proxy f597h;

    /* renamed from: i */
    final SSLSocketFactory f598i;

    /* renamed from: j */
    final HostnameVerifier f599j;

    /* renamed from: k */
    final C0474h f600k;

    public C0467a(String str, int i8, s sVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0474h c0474h, InterfaceC0469c interfaceC0469c, Proxy proxy, List<F> list, List<C0480n> list2, ProxySelector proxySelector) {
        this.f590a = new A.a().scheme(sSLSocketFactory != null ? Constants.SCHEME : "http").host(str).port(i8).build();
        if (sVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f591b = sVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f592c = socketFactory;
        if (interfaceC0469c == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f593d = interfaceC0469c;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f594e = D7.e.immutableList(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f595f = D7.e.immutableList(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f596g = proxySelector;
        this.f597h = proxy;
        this.f598i = sSLSocketFactory;
        this.f599j = hostnameVerifier;
        this.f600k = c0474h;
    }

    boolean a(C0467a c0467a) {
        return this.f591b.equals(c0467a.f591b) && this.f593d.equals(c0467a.f593d) && this.f594e.equals(c0467a.f594e) && this.f595f.equals(c0467a.f595f) && this.f596g.equals(c0467a.f596g) && Objects.equals(this.f597h, c0467a.f597h) && Objects.equals(this.f598i, c0467a.f598i) && Objects.equals(this.f599j, c0467a.f599j) && Objects.equals(this.f600k, c0467a.f600k) && url().port() == c0467a.url().port();
    }

    public C0474h certificatePinner() {
        return this.f600k;
    }

    public List<C0480n> connectionSpecs() {
        return this.f595f;
    }

    public s dns() {
        return this.f591b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0467a) {
            C0467a c0467a = (C0467a) obj;
            if (this.f590a.equals(c0467a.f590a) && a(c0467a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f590a.hashCode()) * 31) + this.f591b.hashCode()) * 31) + this.f593d.hashCode()) * 31) + this.f594e.hashCode()) * 31) + this.f595f.hashCode()) * 31) + this.f596g.hashCode()) * 31) + Objects.hashCode(this.f597h)) * 31) + Objects.hashCode(this.f598i)) * 31) + Objects.hashCode(this.f599j)) * 31) + Objects.hashCode(this.f600k);
    }

    public HostnameVerifier hostnameVerifier() {
        return this.f599j;
    }

    public List<F> protocols() {
        return this.f594e;
    }

    public Proxy proxy() {
        return this.f597h;
    }

    public InterfaceC0469c proxyAuthenticator() {
        return this.f593d;
    }

    public ProxySelector proxySelector() {
        return this.f596g;
    }

    public SocketFactory socketFactory() {
        return this.f592c;
    }

    public SSLSocketFactory sslSocketFactory() {
        return this.f598i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f590a.host());
        sb.append(":");
        sb.append(this.f590a.port());
        if (this.f597h != null) {
            sb.append(", proxy=");
            sb.append(this.f597h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f596g);
        }
        sb.append("}");
        return sb.toString();
    }

    public A url() {
        return this.f590a;
    }
}
