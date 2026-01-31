package I6;

import J6.b;
import com.squareup.okhttp.ConnectionSpec;
import e3.w;
import io.grpc.AbstractC5719d;
import io.grpc.AbstractC5722e0;
import io.grpc.AbstractC5725g;
import io.grpc.AbstractC5727h;
import io.grpc.C5729i;
import io.grpc.C5798p;
import io.grpc.C5800q;
import io.grpc.N;
import io.grpc.P0;
import io.grpc.internal.AbstractC5738b;
import io.grpc.internal.C5747f0;
import io.grpc.internal.C5750h;
import io.grpc.internal.C5758k0;
import io.grpc.internal.InterfaceC5773s0;
import io.grpc.internal.InterfaceC5778v;
import io.grpc.internal.InterfaceC5782x;
import io.grpc.internal.J;
import io.grpc.internal.L0;
import io.grpc.internal.M0;
import io.grpc.internal.U;
import io.grpc.internal.V0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* loaded from: classes.dex */
public final class f extends AbstractC5738b {
    public static final int DEFAULT_FLOW_CONTROL_WINDOW = 65535;

    /* renamed from: r, reason: collision with root package name */
    private static final Logger f2184r = Logger.getLogger(f.class.getName());

    /* renamed from: s, reason: collision with root package name */
    static final J6.b f2185s = new b.C0047b(J6.b.MODERN_TLS).cipherSuites(J6.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, J6.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, J6.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, J6.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, J6.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, J6.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).tlsVersions(J6.k.TLS_1_2).supportsTlsExtensions(true).build();

    /* renamed from: t, reason: collision with root package name */
    private static final long f2186t = TimeUnit.DAYS.toNanos(1000);

    /* renamed from: u, reason: collision with root package name */
    private static final L0.d f2187u;

    /* renamed from: v, reason: collision with root package name */
    static final InterfaceC5773s0 f2188v;

    /* renamed from: w, reason: collision with root package name */
    private static final EnumSet f2189w;

    /* renamed from: b, reason: collision with root package name */
    private final C5758k0 f2190b;

    /* renamed from: c, reason: collision with root package name */
    private V0.b f2191c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC5773s0 f2192d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC5773s0 f2193e;

    /* renamed from: f, reason: collision with root package name */
    private SocketFactory f2194f;

    /* renamed from: g, reason: collision with root package name */
    private SSLSocketFactory f2195g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f2196h;

    /* renamed from: i, reason: collision with root package name */
    private HostnameVerifier f2197i;

    /* renamed from: j, reason: collision with root package name */
    private J6.b f2198j;

    /* renamed from: k, reason: collision with root package name */
    private c f2199k;

    /* renamed from: l, reason: collision with root package name */
    private long f2200l;

    /* renamed from: m, reason: collision with root package name */
    private long f2201m;

    /* renamed from: n, reason: collision with root package name */
    private int f2202n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f2203o;

    /* renamed from: p, reason: collision with root package name */
    private int f2204p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f2205q;

    class a implements L0.d {
        a() {
        }

        @Override // io.grpc.internal.L0.d
        public void close(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.L0.d
        public Executor create() {
            return Executors.newCachedThreadPool(U.getThreadFactory("grpc-okhttp-%d", true));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2206a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2207b;

        static {
            int[] iArr = new int[c.values().length];
            f2207b = iArr;
            try {
                iArr[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2207b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[I6.e.values().length];
            f2206a = iArr2;
            try {
                iArr2[I6.e.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2206a[I6.e.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum c {
        TLS,
        PLAINTEXT
    }

    private final class d implements C5758k0.b {
        private d() {
        }

        @Override // io.grpc.internal.C5758k0.b
        public int getDefaultPort() {
            return f.this.h();
        }

        /* synthetic */ d(f fVar, a aVar) {
            this();
        }
    }

    private final class e implements C5758k0.c {
        private e() {
        }

        @Override // io.grpc.internal.C5758k0.c
        public InterfaceC5778v buildClientTransportFactory() {
            return f.this.d();
        }

        /* synthetic */ e(f fVar, a aVar) {
            this();
        }
    }

    /* renamed from: I6.f$f, reason: collision with other inner class name */
    static final class C0040f implements InterfaceC5778v {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5773s0 f2211a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f2212b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC5773s0 f2213c;

        /* renamed from: d, reason: collision with root package name */
        final ScheduledExecutorService f2214d;

        /* renamed from: e, reason: collision with root package name */
        final V0.b f2215e;

        /* renamed from: f, reason: collision with root package name */
        final SocketFactory f2216f;

        /* renamed from: g, reason: collision with root package name */
        final SSLSocketFactory f2217g;

        /* renamed from: h, reason: collision with root package name */
        final HostnameVerifier f2218h;

        /* renamed from: i, reason: collision with root package name */
        final J6.b f2219i;

        /* renamed from: j, reason: collision with root package name */
        final int f2220j;

        /* renamed from: k, reason: collision with root package name */
        private final boolean f2221k;

        /* renamed from: l, reason: collision with root package name */
        private final long f2222l;

        /* renamed from: m, reason: collision with root package name */
        private final C5750h f2223m;

        /* renamed from: n, reason: collision with root package name */
        private final long f2224n;

        /* renamed from: o, reason: collision with root package name */
        final int f2225o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f2226p;

        /* renamed from: q, reason: collision with root package name */
        final int f2227q;

        /* renamed from: r, reason: collision with root package name */
        final boolean f2228r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f2229s;

        /* renamed from: I6.f$f$a */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5750h.b f2230a;

            a(C5750h.b bVar) {
                this.f2230a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2230a.backoff();
            }
        }

        /* synthetic */ C0040f(InterfaceC5773s0 interfaceC5773s0, InterfaceC5773s0 interfaceC5773s02, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, J6.b bVar, int i8, boolean z8, long j8, long j9, int i9, boolean z9, int i10, V0.b bVar2, boolean z10, a aVar) {
            this(interfaceC5773s0, interfaceC5773s02, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, i8, z8, j8, j9, i9, z9, i10, bVar2, z10);
        }

        @Override // io.grpc.internal.InterfaceC5778v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f2229s) {
                return;
            }
            this.f2229s = true;
            this.f2211a.returnObject(this.f2212b);
            this.f2213c.returnObject(this.f2214d);
        }

        @Override // io.grpc.internal.InterfaceC5778v
        public ScheduledExecutorService getScheduledExecutorService() {
            return this.f2214d;
        }

        @Override // io.grpc.internal.InterfaceC5778v
        public InterfaceC5782x newClientTransport(SocketAddress socketAddress, InterfaceC5778v.a aVar, AbstractC5727h abstractC5727h) {
            if (this.f2229s) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            C5750h.b state = this.f2223m.getState();
            i iVar = new i(this, (InetSocketAddress) socketAddress, aVar.getAuthority(), aVar.getUserAgent(), aVar.getEagAttributes(), aVar.getHttpConnectProxiedSocketAddress(), new a(state));
            if (this.f2221k) {
                iVar.L(true, state.get(), this.f2224n, this.f2226p);
            }
            return iVar;
        }

        @Override // io.grpc.internal.InterfaceC5778v
        public InterfaceC5778v.b swapChannelCredentials(AbstractC5725g abstractC5725g) {
            g gVarI = f.i(abstractC5725g);
            if (gVarI.error != null) {
                return null;
            }
            return new InterfaceC5778v.b(new C0040f(this.f2211a, this.f2213c, this.f2216f, gVarI.factory, this.f2218h, this.f2219i, this.f2220j, this.f2221k, this.f2222l, this.f2224n, this.f2225o, this.f2226p, this.f2227q, this.f2215e, this.f2228r), gVarI.callCredentials);
        }

        private C0040f(InterfaceC5773s0 interfaceC5773s0, InterfaceC5773s0 interfaceC5773s02, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, J6.b bVar, int i8, boolean z8, long j8, long j9, int i9, boolean z9, int i10, V0.b bVar2, boolean z10) {
            this.f2211a = interfaceC5773s0;
            this.f2212b = (Executor) interfaceC5773s0.getObject();
            this.f2213c = interfaceC5773s02;
            this.f2214d = (ScheduledExecutorService) interfaceC5773s02.getObject();
            this.f2216f = socketFactory;
            this.f2217g = sSLSocketFactory;
            this.f2218h = hostnameVerifier;
            this.f2219i = bVar;
            this.f2220j = i8;
            this.f2221k = z8;
            this.f2222l = j8;
            this.f2223m = new C5750h("keepalive time nanos", j8);
            this.f2224n = j9;
            this.f2225o = i9;
            this.f2226p = z9;
            this.f2227q = i10;
            this.f2228r = z10;
            this.f2215e = (V0.b) w.checkNotNull(bVar2, "transportTracerFactory");
        }
    }

    static final class g {
        public final AbstractC5719d callCredentials;
        public final String error;
        public final SSLSocketFactory factory;

        private g(SSLSocketFactory sSLSocketFactory, AbstractC5719d abstractC5719d, String str) {
            this.factory = sSLSocketFactory;
            this.callCredentials = abstractC5719d;
            this.error = str;
        }

        public static g error(String str) {
            return new g(null, null, (String) w.checkNotNull(str, "error"));
        }

        public static g factory(SSLSocketFactory sSLSocketFactory) {
            return new g((SSLSocketFactory) w.checkNotNull(sSLSocketFactory, "factory"), null, null);
        }

        public static g plaintext() {
            return new g(null, null, null);
        }

        public g withCallCredentials(AbstractC5719d abstractC5719d) {
            w.checkNotNull(abstractC5719d, "callCreds");
            if (this.error != null) {
                return this;
            }
            AbstractC5719d abstractC5719d2 = this.callCredentials;
            if (abstractC5719d2 != null) {
                abstractC5719d = new C5798p(abstractC5719d2, abstractC5719d);
            }
            return new g(this.factory, abstractC5719d, null);
        }
    }

    static {
        a aVar = new a();
        f2187u = aVar;
        f2188v = M0.forResource(aVar);
        f2189w = EnumSet.of(P0.c.MTLS, P0.c.CUSTOM_MANAGERS);
    }

    private f(String str, int i8) {
        this(U.authorityFromHostAndPort(str, i8));
    }

    static KeyManager[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            X509Certificate[] x509Certificates = O6.a.getX509Certificates(byteArrayInputStream);
            U.closeQuietly(byteArrayInputStream);
            byteArrayInputStream = new ByteArrayInputStream(bArr2);
            try {
                try {
                    PrivateKey privateKey = O6.a.getPrivateKey(byteArrayInputStream);
                    U.closeQuietly(byteArrayInputStream);
                    KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                    try {
                        keyStore.load(null, null);
                        keyStore.setKeyEntry("key", privateKey, new char[0], x509Certificates);
                        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                        keyManagerFactory.init(keyStore, new char[0]);
                        return keyManagerFactory.getKeyManagers();
                    } catch (IOException e8) {
                        throw new GeneralSecurityException(e8);
                    }
                } finally {
                }
            } catch (IOException e9) {
                throw new GeneralSecurityException("Unable to decode private key", e9);
            }
        } finally {
        }
    }

    public static f forAddress(String str, int i8) {
        return new f(str, i8);
    }

    public static f forTarget(String str) {
        return new f(str);
    }

    static TrustManager[] g(byte[] bArr) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        try {
            keyStore.load(null, null);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                X509Certificate[] x509Certificates = O6.a.getX509Certificates(byteArrayInputStream);
                U.closeQuietly(byteArrayInputStream);
                for (X509Certificate x509Certificate : x509Certificates) {
                    keyStore.setCertificateEntry(x509Certificate.getSubjectX500Principal().getName("RFC2253"), x509Certificate);
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                return trustManagerFactory.getTrustManagers();
            } catch (Throwable th) {
                U.closeQuietly(byteArrayInputStream);
                throw th;
            }
        } catch (IOException e8) {
            throw new GeneralSecurityException(e8);
        }
    }

    static g i(AbstractC5725g abstractC5725g) {
        KeyManager[] keyManagerArrE;
        TrustManager[] trustManagerArrG;
        if (!(abstractC5725g instanceof P0)) {
            if (abstractC5725g instanceof N) {
                return g.plaintext();
            }
            if (abstractC5725g instanceof C5800q) {
                C5800q c5800q = (C5800q) abstractC5725g;
                return i(c5800q.getChannelCredentials()).withCallCredentials(c5800q.getCallCredentials());
            }
            if (!(abstractC5725g instanceof C5729i)) {
                return g.error("Unsupported credential type: " + abstractC5725g.getClass().getName());
            }
            StringBuilder sb = new StringBuilder();
            Iterator<AbstractC5725g> it = ((C5729i) abstractC5725g).getCredentialsList().iterator();
            while (it.hasNext()) {
                g gVarI = i(it.next());
                if (gVarI.error == null) {
                    return gVarI;
                }
                sb.append(", ");
                sb.append(gVarI.error);
            }
            return g.error(sb.substring(2));
        }
        P0 p02 = (P0) abstractC5725g;
        Set<P0.c> setIncomprehensible = p02.incomprehensible(f2189w);
        if (!setIncomprehensible.isEmpty()) {
            return g.error("TLS features not understood: " + setIncomprehensible);
        }
        if (p02.getKeyManagers() != null) {
            keyManagerArrE = (KeyManager[]) p02.getKeyManagers().toArray(new KeyManager[0]);
        } else if (p02.getPrivateKey() == null) {
            keyManagerArrE = null;
        } else {
            if (p02.getPrivateKeyPassword() != null) {
                return g.error("byte[]-based private key with password unsupported. Use unencrypted file or KeyManager");
            }
            try {
                keyManagerArrE = e(p02.getCertificateChain(), p02.getPrivateKey());
            } catch (GeneralSecurityException e8) {
                f2184r.log(Level.FINE, "Exception loading private key from credential", (Throwable) e8);
                return g.error("Unable to load private key: " + e8.getMessage());
            }
        }
        if (p02.getTrustManagers() != null) {
            trustManagerArrG = (TrustManager[]) p02.getTrustManagers().toArray(new TrustManager[0]);
        } else if (p02.getRootCertificates() != null) {
            try {
                trustManagerArrG = g(p02.getRootCertificates());
            } catch (GeneralSecurityException e9) {
                f2184r.log(Level.FINE, "Exception loading root certificates from credential", (Throwable) e9);
                return g.error("Unable to load root certificates: " + e9.getMessage());
            }
        } else {
            trustManagerArrG = null;
        }
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS", J6.h.get().getProvider());
            sSLContext.init(keyManagerArrE, trustManagerArrG, null);
            return g.factory(sSLContext.getSocketFactory());
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException("TLS Provider failure", e10);
        }
    }

    @Override // io.grpc.internal.AbstractC5738b
    protected AbstractC5722e0 b() {
        return this.f2190b;
    }

    public f connectionSpec(ConnectionSpec connectionSpec) {
        w.checkState(!this.f2196h, "Cannot change security when using ChannelCredentials");
        w.checkArgument(connectionSpec.isTls(), "plaintext ConnectionSpec is not accepted");
        this.f2198j = r.b(connectionSpec);
        return this;
    }

    C0040f d() {
        return new C0040f(this.f2192d, this.f2193e, this.f2194f, f(), this.f2197i, this.f2198j, this.f32624a, this.f2200l != Long.MAX_VALUE, this.f2200l, this.f2201m, this.f2202n, this.f2203o, this.f2204p, this.f2191c, false, null);
    }

    SSLSocketFactory f() {
        int i8 = b.f2207b[this.f2199k.ordinal()];
        if (i8 == 1) {
            return null;
        }
        if (i8 != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.f2199k);
        }
        try {
            if (this.f2195g == null) {
                this.f2195g = SSLContext.getInstance(G0.b.DEFAULT_PROFILE_NAME, J6.h.get().getProvider()).getSocketFactory();
            }
            return this.f2195g;
        } catch (GeneralSecurityException e8) {
            throw new RuntimeException("TLS Provider failure", e8);
        }
    }

    public f flowControlWindow(int i8) {
        w.checkState(i8 > 0, "flowControlWindow must be positive");
        this.f2202n = i8;
        return this;
    }

    int h() {
        int i8 = b.f2207b[this.f2199k.ordinal()];
        if (i8 == 1) {
            return 80;
        }
        if (i8 == 2) {
            return U.DEFAULT_PORT_SSL;
        }
        throw new AssertionError(this.f2199k + " not handled");
    }

    public f hostnameVerifier(HostnameVerifier hostnameVerifier) {
        w.checkState(!this.f2196h, "Cannot change security when using ChannelCredentials");
        this.f2197i = hostnameVerifier;
        return this;
    }

    @Deprecated
    public f negotiationType(I6.e eVar) {
        w.checkState(!this.f2196h, "Cannot change security when using ChannelCredentials");
        w.checkNotNull(eVar, "type");
        int i8 = b.f2206a[eVar.ordinal()];
        if (i8 == 1) {
            this.f2199k = c.TLS;
        } else {
            if (i8 != 2) {
                throw new AssertionError("Unknown negotiation type: " + eVar);
            }
            this.f2199k = c.PLAINTEXT;
        }
        return this;
    }

    public f scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.f2193e = new J((ScheduledExecutorService) w.checkNotNull(scheduledExecutorService, "scheduledExecutorService"));
        return this;
    }

    public f socketFactory(SocketFactory socketFactory) {
        this.f2194f = socketFactory;
        return this;
    }

    public f sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        w.checkState(!this.f2196h, "Cannot change security when using ChannelCredentials");
        this.f2195g = sSLSocketFactory;
        this.f2199k = c.TLS;
        return this;
    }

    public f tlsConnectionSpec(String[] strArr, String[] strArr2) {
        w.checkState(!this.f2196h, "Cannot change security when using ChannelCredentials");
        w.checkNotNull(strArr, "tls versions must not null");
        w.checkNotNull(strArr2, "ciphers must not null");
        this.f2198j = new b.C0047b(true).supportsTlsExtensions(true).tlsVersions(strArr).cipherSuites(strArr2).build();
        return this;
    }

    public f transportExecutor(Executor executor) {
        if (executor == null) {
            this.f2192d = f2188v;
        } else {
            this.f2192d = new J(executor);
        }
        return this;
    }

    private f(String str) {
        this.f2191c = V0.getDefaultFactory();
        this.f2192d = f2188v;
        this.f2193e = M0.forResource(U.TIMER_SERVICE);
        this.f2198j = f2185s;
        this.f2199k = c.TLS;
        this.f2200l = Long.MAX_VALUE;
        this.f2201m = U.DEFAULT_KEEPALIVE_TIMEOUT_NANOS;
        this.f2202n = 65535;
        this.f2204p = Integer.MAX_VALUE;
        this.f2205q = false;
        a aVar = null;
        this.f2190b = new C5758k0(str, new e(this, aVar), new d(this, aVar));
        this.f2196h = false;
    }

    public static f forAddress(String str, int i8, AbstractC5725g abstractC5725g) {
        return forTarget(U.authorityFromHostAndPort(str, i8), abstractC5725g);
    }

    public static f forTarget(String str, AbstractC5725g abstractC5725g) {
        g gVarI = i(abstractC5725g);
        if (gVarI.error == null) {
            return new f(str, abstractC5725g, gVarI.callCredentials, gVarI.factory);
        }
        throw new IllegalArgumentException(gVarI.error);
    }

    @Override // io.grpc.internal.AbstractC5738b, io.grpc.AbstractC5722e0
    public f keepAliveTime(long j8, TimeUnit timeUnit) {
        w.checkArgument(j8 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j8);
        this.f2200l = nanos;
        long jClampKeepAliveTimeInNanos = C5747f0.clampKeepAliveTimeInNanos(nanos);
        this.f2200l = jClampKeepAliveTimeInNanos;
        if (jClampKeepAliveTimeInNanos >= f2186t) {
            this.f2200l = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // io.grpc.internal.AbstractC5738b, io.grpc.AbstractC5722e0
    public f keepAliveTimeout(long j8, TimeUnit timeUnit) {
        w.checkArgument(j8 > 0, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j8);
        this.f2201m = nanos;
        this.f2201m = C5747f0.clampKeepAliveTimeoutInNanos(nanos);
        return this;
    }

    @Override // io.grpc.internal.AbstractC5738b, io.grpc.AbstractC5722e0
    public f keepAliveWithoutCalls(boolean z8) {
        this.f2203o = z8;
        return this;
    }

    @Override // io.grpc.internal.AbstractC5738b, io.grpc.AbstractC5722e0
    public f maxInboundMessageSize(int i8) {
        w.checkArgument(i8 >= 0, "negative max");
        this.f32624a = i8;
        return this;
    }

    @Override // io.grpc.internal.AbstractC5738b, io.grpc.AbstractC5722e0
    public f maxInboundMetadataSize(int i8) {
        w.checkArgument(i8 > 0, "maxInboundMetadataSize must be > 0");
        this.f2204p = i8;
        return this;
    }

    @Override // io.grpc.internal.AbstractC5738b, io.grpc.AbstractC5722e0
    public f usePlaintext() {
        w.checkState(!this.f2196h, "Cannot change security when using ChannelCredentials");
        this.f2199k = c.PLAINTEXT;
        return this;
    }

    @Override // io.grpc.internal.AbstractC5738b, io.grpc.AbstractC5722e0
    public f useTransportSecurity() {
        w.checkState(!this.f2196h, "Cannot change security when using ChannelCredentials");
        this.f2199k = c.TLS;
        return this;
    }

    f(String str, AbstractC5725g abstractC5725g, AbstractC5719d abstractC5719d, SSLSocketFactory sSLSocketFactory) {
        this.f2191c = V0.getDefaultFactory();
        this.f2192d = f2188v;
        this.f2193e = M0.forResource(U.TIMER_SERVICE);
        this.f2198j = f2185s;
        c cVar = c.TLS;
        this.f2199k = cVar;
        this.f2200l = Long.MAX_VALUE;
        this.f2201m = U.DEFAULT_KEEPALIVE_TIMEOUT_NANOS;
        this.f2202n = 65535;
        this.f2204p = Integer.MAX_VALUE;
        this.f2205q = false;
        a aVar = null;
        this.f2190b = new C5758k0(str, abstractC5725g, abstractC5719d, new e(this, aVar), new d(this, aVar));
        this.f2195g = sSLSocketFactory;
        this.f2199k = sSLSocketFactory == null ? c.PLAINTEXT : cVar;
        this.f2196h = true;
    }
}
