package C7;

import C7.InterfaceC0472f;
import C7.J;
import C7.N;
import C7.u;
import C7.z;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public class E implements Cloneable, InterfaceC0472f.a, N.a {

    /* renamed from: C */
    static final List f463C = D7.e.immutableList(F.HTTP_2, F.HTTP_1_1);

    /* renamed from: D */
    static final List f464D = D7.e.immutableList(C0480n.MODERN_TLS, C0480n.CLEARTEXT);

    /* renamed from: A */
    final int f465A;

    /* renamed from: B */
    final int f466B;

    /* renamed from: a */
    final q f467a;

    /* renamed from: b */
    final Proxy f468b;

    /* renamed from: c */
    final List f469c;

    /* renamed from: d */
    final List f470d;

    /* renamed from: e */
    final List f471e;

    /* renamed from: f */
    final List f472f;

    /* renamed from: g */
    final u.b f473g;

    /* renamed from: h */
    final ProxySelector f474h;

    /* renamed from: i */
    final p f475i;

    /* renamed from: j */
    final C0470d f476j;

    /* renamed from: k */
    final E7.f f477k;

    /* renamed from: l */
    final SocketFactory f478l;

    /* renamed from: m */
    final SSLSocketFactory f479m;

    /* renamed from: n */
    final M7.c f480n;

    /* renamed from: o */
    final HostnameVerifier f481o;

    /* renamed from: p */
    final C0474h f482p;

    /* renamed from: q */
    final InterfaceC0469c f483q;

    /* renamed from: r */
    final InterfaceC0469c f484r;

    /* renamed from: s */
    final C0479m f485s;

    /* renamed from: t */
    final s f486t;

    /* renamed from: u */
    final boolean f487u;

    /* renamed from: v */
    final boolean f488v;

    /* renamed from: w */
    final boolean f489w;

    /* renamed from: x */
    final int f490x;

    /* renamed from: y */
    final int f491y;

    /* renamed from: z */
    final int f492z;

    class a extends D7.a {
        a() {
        }

        @Override // D7.a
        public void addLenient(z.a aVar, String str) {
            aVar.a(str);
        }

        @Override // D7.a
        public void apply(C0480n c0480n, SSLSocket sSLSocket, boolean z8) {
            c0480n.a(sSLSocket, z8);
        }

        @Override // D7.a
        public int code(J.a aVar) {
            return aVar.f566c;
        }

        @Override // D7.a
        public boolean equalsNonHost(C0467a c0467a, C0467a c0467a2) {
            return c0467a.a(c0467a2);
        }

        @Override // D7.a
        public F7.c exchange(J j8) {
            return j8.f562m;
        }

        @Override // D7.a
        public void initExchange(J.a aVar, F7.c cVar) {
            aVar.c(cVar);
        }

        @Override // D7.a
        public InterfaceC0472f newWebSocketCall(E e8, H h8) {
            return G.c(e8, h8, true);
        }

        @Override // D7.a
        public F7.g realConnectionPool(C0479m c0479m) {
            return c0479m.f672a;
        }

        @Override // D7.a
        public void addLenient(z.a aVar, String str, String str2) {
            aVar.b(str, str2);
        }
    }

    public static final class b {

        /* renamed from: A */
        int f493A;

        /* renamed from: B */
        int f494B;

        /* renamed from: a */
        q f495a;

        /* renamed from: b */
        Proxy f496b;

        /* renamed from: c */
        List f497c;

        /* renamed from: d */
        List f498d;

        /* renamed from: e */
        final List f499e;

        /* renamed from: f */
        final List f500f;

        /* renamed from: g */
        u.b f501g;

        /* renamed from: h */
        ProxySelector f502h;

        /* renamed from: i */
        p f503i;

        /* renamed from: j */
        C0470d f504j;

        /* renamed from: k */
        E7.f f505k;

        /* renamed from: l */
        SocketFactory f506l;

        /* renamed from: m */
        SSLSocketFactory f507m;

        /* renamed from: n */
        M7.c f508n;

        /* renamed from: o */
        HostnameVerifier f509o;

        /* renamed from: p */
        C0474h f510p;

        /* renamed from: q */
        InterfaceC0469c f511q;

        /* renamed from: r */
        InterfaceC0469c f512r;

        /* renamed from: s */
        C0479m f513s;

        /* renamed from: t */
        s f514t;

        /* renamed from: u */
        boolean f515u;

        /* renamed from: v */
        boolean f516v;

        /* renamed from: w */
        boolean f517w;

        /* renamed from: x */
        int f518x;

        /* renamed from: y */
        int f519y;

        /* renamed from: z */
        int f520z;

        public b() {
            this.f499e = new ArrayList();
            this.f500f = new ArrayList();
            this.f495a = new q();
            this.f497c = E.f463C;
            this.f498d = E.f464D;
            this.f501g = u.b(u.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f502h = proxySelector;
            if (proxySelector == null) {
                this.f502h = new L7.a();
            }
            this.f503i = p.NO_COOKIES;
            this.f506l = SocketFactory.getDefault();
            this.f509o = M7.d.INSTANCE;
            this.f510p = C0474h.DEFAULT;
            InterfaceC0469c interfaceC0469c = InterfaceC0469c.NONE;
            this.f511q = interfaceC0469c;
            this.f512r = interfaceC0469c;
            this.f513s = new C0479m();
            this.f514t = s.SYSTEM;
            this.f515u = true;
            this.f516v = true;
            this.f517w = true;
            this.f518x = 0;
            this.f519y = 10000;
            this.f520z = 10000;
            this.f493A = 10000;
            this.f494B = 0;
        }

        public b addInterceptor(B b9) {
            if (b9 == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f499e.add(b9);
            return this;
        }

        public b addNetworkInterceptor(B b9) {
            if (b9 == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f500f.add(b9);
            return this;
        }

        public b authenticator(InterfaceC0469c interfaceC0469c) {
            if (interfaceC0469c == null) {
                throw new NullPointerException("authenticator == null");
            }
            this.f512r = interfaceC0469c;
            return this;
        }

        public E build() {
            return new E(this);
        }

        public b cache(C0470d c0470d) {
            this.f504j = c0470d;
            this.f505k = null;
            return this;
        }

        public b callTimeout(long j8, TimeUnit timeUnit) {
            this.f518x = D7.e.checkDuration("timeout", j8, timeUnit);
            return this;
        }

        public b certificatePinner(C0474h c0474h) {
            if (c0474h == null) {
                throw new NullPointerException("certificatePinner == null");
            }
            this.f510p = c0474h;
            return this;
        }

        public b connectTimeout(long j8, TimeUnit timeUnit) {
            this.f519y = D7.e.checkDuration("timeout", j8, timeUnit);
            return this;
        }

        public b connectionPool(C0479m c0479m) {
            if (c0479m == null) {
                throw new NullPointerException("connectionPool == null");
            }
            this.f513s = c0479m;
            return this;
        }

        public b connectionSpecs(List<C0480n> list) {
            this.f498d = D7.e.immutableList(list);
            return this;
        }

        public b cookieJar(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("cookieJar == null");
            }
            this.f503i = pVar;
            return this;
        }

        public b dispatcher(q qVar) {
            if (qVar == null) {
                throw new IllegalArgumentException("dispatcher == null");
            }
            this.f495a = qVar;
            return this;
        }

        public b dns(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("dns == null");
            }
            this.f514t = sVar;
            return this;
        }

        public b eventListener(u uVar) {
            if (uVar == null) {
                throw new NullPointerException("eventListener == null");
            }
            this.f501g = u.b(uVar);
            return this;
        }

        public b eventListenerFactory(u.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("eventListenerFactory == null");
            }
            this.f501g = bVar;
            return this;
        }

        public b followRedirects(boolean z8) {
            this.f516v = z8;
            return this;
        }

        public b followSslRedirects(boolean z8) {
            this.f515u = z8;
            return this;
        }

        public b hostnameVerifier(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier == null) {
                throw new NullPointerException("hostnameVerifier == null");
            }
            this.f509o = hostnameVerifier;
            return this;
        }

        public List<B> interceptors() {
            return this.f499e;
        }

        public List<B> networkInterceptors() {
            return this.f500f;
        }

        public b pingInterval(long j8, TimeUnit timeUnit) {
            this.f494B = D7.e.checkDuration("interval", j8, timeUnit);
            return this;
        }

        public b protocols(List<F> list) {
            ArrayList arrayList = new ArrayList(list);
            F f8 = F.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(f8) && !arrayList.contains(F.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(f8) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (arrayList.contains(F.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
            }
            if (arrayList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayList.remove(F.SPDY_3);
            this.f497c = Collections.unmodifiableList(arrayList);
            return this;
        }

        public b proxy(Proxy proxy) {
            this.f496b = proxy;
            return this;
        }

        public b proxyAuthenticator(InterfaceC0469c interfaceC0469c) {
            if (interfaceC0469c == null) {
                throw new NullPointerException("proxyAuthenticator == null");
            }
            this.f511q = interfaceC0469c;
            return this;
        }

        public b proxySelector(ProxySelector proxySelector) {
            if (proxySelector == null) {
                throw new NullPointerException("proxySelector == null");
            }
            this.f502h = proxySelector;
            return this;
        }

        public b readTimeout(long j8, TimeUnit timeUnit) {
            this.f520z = D7.e.checkDuration("timeout", j8, timeUnit);
            return this;
        }

        public b retryOnConnectionFailure(boolean z8) {
            this.f517w = z8;
            return this;
        }

        public b socketFactory(SocketFactory socketFactory) {
            if (socketFactory == null) {
                throw new NullPointerException("socketFactory == null");
            }
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            this.f506l = socketFactory;
            return this;
        }

        public b sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            this.f507m = sSLSocketFactory;
            this.f508n = K7.j.get().buildCertificateChainCleaner(sSLSocketFactory);
            return this;
        }

        public b writeTimeout(long j8, TimeUnit timeUnit) {
            this.f493A = D7.e.checkDuration("timeout", j8, timeUnit);
            return this;
        }

        public b callTimeout(Duration duration) {
            this.f518x = D7.e.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public b connectTimeout(Duration duration) {
            this.f519y = D7.e.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public b pingInterval(Duration duration) {
            this.f494B = D7.e.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public b readTimeout(Duration duration) {
            this.f520z = D7.e.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public b writeTimeout(Duration duration) {
            this.f493A = D7.e.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public b sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            if (x509TrustManager != null) {
                this.f507m = sSLSocketFactory;
                this.f508n = M7.c.get(x509TrustManager);
                return this;
            }
            throw new NullPointerException("trustManager == null");
        }

        b(E e8) {
            ArrayList arrayList = new ArrayList();
            this.f499e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f500f = arrayList2;
            this.f495a = e8.f467a;
            this.f496b = e8.f468b;
            this.f497c = e8.f469c;
            this.f498d = e8.f470d;
            arrayList.addAll(e8.f471e);
            arrayList2.addAll(e8.f472f);
            this.f501g = e8.f473g;
            this.f502h = e8.f474h;
            this.f503i = e8.f475i;
            this.f505k = e8.f477k;
            this.f504j = e8.f476j;
            this.f506l = e8.f478l;
            this.f507m = e8.f479m;
            this.f508n = e8.f480n;
            this.f509o = e8.f481o;
            this.f510p = e8.f482p;
            this.f511q = e8.f483q;
            this.f512r = e8.f484r;
            this.f513s = e8.f485s;
            this.f514t = e8.f486t;
            this.f515u = e8.f487u;
            this.f516v = e8.f488v;
            this.f517w = e8.f489w;
            this.f518x = e8.f490x;
            this.f519y = e8.f491y;
            this.f520z = e8.f492z;
            this.f493A = e8.f465A;
            this.f494B = e8.f466B;
        }
    }

    static {
        D7.a.instance = new a();
    }

    public E() {
        this(new b());
    }

    private static SSLSocketFactory b(X509TrustManager x509TrustManager) throws KeyManagementException {
        try {
            SSLContext sSLContext = K7.j.get().getSSLContext();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e8) {
            throw new AssertionError("No System TLS", e8);
        }
    }

    E7.f a() {
        C0470d c0470d = this.f476j;
        return c0470d != null ? c0470d.f601a : this.f477k;
    }

    public InterfaceC0469c authenticator() {
        return this.f484r;
    }

    public C0470d cache() {
        return this.f476j;
    }

    public int callTimeoutMillis() {
        return this.f490x;
    }

    public C0474h certificatePinner() {
        return this.f482p;
    }

    public int connectTimeoutMillis() {
        return this.f491y;
    }

    public C0479m connectionPool() {
        return this.f485s;
    }

    public List<C0480n> connectionSpecs() {
        return this.f470d;
    }

    public p cookieJar() {
        return this.f475i;
    }

    public q dispatcher() {
        return this.f467a;
    }

    public s dns() {
        return this.f486t;
    }

    public u.b eventListenerFactory() {
        return this.f473g;
    }

    public boolean followRedirects() {
        return this.f488v;
    }

    public boolean followSslRedirects() {
        return this.f487u;
    }

    public HostnameVerifier hostnameVerifier() {
        return this.f481o;
    }

    public List<B> interceptors() {
        return this.f471e;
    }

    public List<B> networkInterceptors() {
        return this.f472f;
    }

    public b newBuilder() {
        return new b(this);
    }

    @Override // C7.InterfaceC0472f.a
    public InterfaceC0472f newCall(H h8) {
        return G.c(this, h8, false);
    }

    @Override // C7.N.a
    public N newWebSocket(H h8, O o8) {
        N7.b bVar = new N7.b(h8, o8, new Random(), this.f466B);
        bVar.connect(this);
        return bVar;
    }

    public int pingIntervalMillis() {
        return this.f466B;
    }

    public List<F> protocols() {
        return this.f469c;
    }

    public Proxy proxy() {
        return this.f468b;
    }

    public InterfaceC0469c proxyAuthenticator() {
        return this.f483q;
    }

    public ProxySelector proxySelector() {
        return this.f474h;
    }

    public int readTimeoutMillis() {
        return this.f492z;
    }

    public boolean retryOnConnectionFailure() {
        return this.f489w;
    }

    public SocketFactory socketFactory() {
        return this.f478l;
    }

    public SSLSocketFactory sslSocketFactory() {
        return this.f479m;
    }

    public int writeTimeoutMillis() {
        return this.f465A;
    }

    E(b bVar) throws NoSuchAlgorithmException, KeyStoreException {
        boolean z8;
        this.f467a = bVar.f495a;
        this.f468b = bVar.f496b;
        this.f469c = bVar.f497c;
        List list = bVar.f498d;
        this.f470d = list;
        this.f471e = D7.e.immutableList(bVar.f499e);
        this.f472f = D7.e.immutableList(bVar.f500f);
        this.f473g = bVar.f501g;
        this.f474h = bVar.f502h;
        this.f475i = bVar.f503i;
        this.f476j = bVar.f504j;
        this.f477k = bVar.f505k;
        this.f478l = bVar.f506l;
        Iterator it = list.iterator();
        loop0: while (true) {
            z8 = false;
            while (it.hasNext()) {
                z8 = (z8 || ((C0480n) it.next()).isTls()) ? true : z8;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f507m;
        if (sSLSocketFactory == null && z8) {
            X509TrustManager x509TrustManagerPlatformTrustManager = D7.e.platformTrustManager();
            this.f479m = b(x509TrustManagerPlatformTrustManager);
            this.f480n = M7.c.get(x509TrustManagerPlatformTrustManager);
        } else {
            this.f479m = sSLSocketFactory;
            this.f480n = bVar.f508n;
        }
        if (this.f479m != null) {
            K7.j.get().configureSslSocketFactory(this.f479m);
        }
        this.f481o = bVar.f509o;
        this.f482p = bVar.f510p.d(this.f480n);
        this.f483q = bVar.f511q;
        this.f484r = bVar.f512r;
        this.f485s = bVar.f513s;
        this.f486t = bVar.f514t;
        this.f487u = bVar.f515u;
        this.f488v = bVar.f516v;
        this.f489w = bVar.f517w;
        this.f490x = bVar.f518x;
        this.f491y = bVar.f519y;
        this.f492z = bVar.f520z;
        this.f465A = bVar.f493A;
        this.f466B = bVar.f494B;
        if (this.f471e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f471e);
        }
        if (this.f472f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f472f);
        }
    }
}
