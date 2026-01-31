package F7;

import C7.A;
import C7.B;
import C7.C0467a;
import C7.C0474h;
import C7.C0480n;
import C7.E;
import C7.F;
import C7.H;
import C7.InterfaceC0472f;
import C7.InterfaceC0478l;
import C7.J;
import C7.L;
import C7.u;
import C7.w;
import I7.f;
import N7.b;
import P7.n;
import P7.x;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import maum.m2u.map.Map;

/* loaded from: classes3.dex */
public final class e extends f.j implements InterfaceC0478l {

    /* renamed from: a, reason: collision with root package name */
    private final L f1298a;

    /* renamed from: b, reason: collision with root package name */
    private Socket f1299b;

    /* renamed from: c, reason: collision with root package name */
    private Socket f1300c;
    public final g connectionPool;

    /* renamed from: d, reason: collision with root package name */
    private w f1301d;

    /* renamed from: e, reason: collision with root package name */
    private F f1302e;

    /* renamed from: f, reason: collision with root package name */
    private I7.f f1303f;

    /* renamed from: g, reason: collision with root package name */
    private P7.e f1304g;

    /* renamed from: h, reason: collision with root package name */
    private P7.d f1305h;

    /* renamed from: i, reason: collision with root package name */
    boolean f1306i;

    /* renamed from: j, reason: collision with root package name */
    int f1307j;

    /* renamed from: k, reason: collision with root package name */
    int f1308k;

    /* renamed from: l, reason: collision with root package name */
    private int f1309l;

    /* renamed from: m, reason: collision with root package name */
    private int f1310m = 1;

    /* renamed from: n, reason: collision with root package name */
    final List f1311n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    long f1312o = Long.MAX_VALUE;

    class a extends b.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f1313a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, P7.e eVar, P7.d dVar, c cVar) {
            super(z8, eVar, dVar);
            this.f1313a = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1313a.a(-1L, true, true, null);
        }
    }

    public e(g gVar, L l8) {
        this.connectionPool = gVar;
        this.f1298a = l8;
    }

    private void a(int i8, int i9, InterfaceC0472f interfaceC0472f, u uVar) throws IOException {
        Proxy proxy = this.f1298a.proxy();
        this.f1299b = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? this.f1298a.address().socketFactory().createSocket() : new Socket(proxy);
        uVar.connectStart(interfaceC0472f, this.f1298a.socketAddress(), proxy);
        this.f1299b.setSoTimeout(i9);
        try {
            K7.j.get().connectSocket(this.f1299b, this.f1298a.socketAddress(), i8);
            try {
                this.f1304g = n.buffer(n.source(this.f1299b));
                this.f1305h = n.buffer(n.sink(this.f1299b));
            } catch (NullPointerException e8) {
                if ("throw with null exception".equals(e8.getMessage())) {
                    throw new IOException(e8);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f1298a.socketAddress());
            connectException.initCause(e9);
            throw connectException;
        }
    }

    private void b(b bVar) throws Throwable {
        C0467a c0467aAddress = this.f1298a.address();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) c0467aAddress.sslSocketFactory().createSocket(this.f1299b, c0467aAddress.url().host(), c0467aAddress.url().port(), true);
                try {
                    C0480n c0480nA = bVar.a(sSLSocket2);
                    if (c0480nA.supportsTlsExtensions()) {
                        K7.j.get().configureTlsExtensions(sSLSocket2, c0467aAddress.url().host(), c0467aAddress.protocols());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    w wVar = w.get(session);
                    if (c0467aAddress.hostnameVerifier().verify(c0467aAddress.url().host(), session)) {
                        c0467aAddress.certificatePinner().check(c0467aAddress.url().host(), wVar.peerCertificates());
                        String selectedProtocol = c0480nA.supportsTlsExtensions() ? K7.j.get().getSelectedProtocol(sSLSocket2) : null;
                        this.f1300c = sSLSocket2;
                        this.f1304g = n.buffer(n.source(sSLSocket2));
                        this.f1305h = n.buffer(n.sink(this.f1300c));
                        this.f1301d = wVar;
                        this.f1302e = selectedProtocol != null ? F.get(selectedProtocol) : F.HTTP_1_1;
                        K7.j.get().afterHandshake(sSLSocket2);
                        return;
                    }
                    List<Certificate> listPeerCertificates = wVar.peerCertificates();
                    if (listPeerCertificates.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + c0467aAddress.url().host() + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) listPeerCertificates.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + c0467aAddress.url().host() + " not verified:\n    certificate: " + C0474h.pin(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + M7.d.allSubjectAltNames(x509Certificate));
                } catch (AssertionError e8) {
                    e = e8;
                    if (!D7.e.isAndroidGetsocknameError(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        K7.j.get().afterHandshake(sSLSocket);
                    }
                    D7.e.closeQuietly((Socket) sSLSocket);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (AssertionError e9) {
            e = e9;
        }
    }

    private void c(int i8, int i9, int i10, InterfaceC0472f interfaceC0472f, u uVar) throws IOException {
        H hE = e();
        A aUrl = hE.url();
        for (int i11 = 0; i11 < 21; i11++) {
            a(i8, i9, interfaceC0472f, uVar);
            hE = d(i9, i10, hE, aUrl);
            if (hE == null) {
                return;
            }
            D7.e.closeQuietly(this.f1299b);
            this.f1299b = null;
            this.f1305h = null;
            this.f1304g = null;
            uVar.connectEnd(interfaceC0472f, this.f1298a.socketAddress(), this.f1298a.proxy(), null);
        }
    }

    private H d(int i8, int i9, H h8, A a9) throws IOException {
        String str = "CONNECT " + D7.e.hostHeader(a9, true) + " HTTP/1.1";
        while (true) {
            H7.a aVar = new H7.a(null, null, this.f1304g, this.f1305h);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f1304g.timeout().timeout(i8, timeUnit);
            this.f1305h.timeout().timeout(i9, timeUnit);
            aVar.writeRequest(h8.headers(), str);
            aVar.finishRequest();
            J jBuild = aVar.readResponseHeaders(false).request(h8).build();
            aVar.skipConnectBody(jBuild);
            int iCode = jBuild.code();
            if (iCode == 200) {
                if (this.f1304g.getBuffer().exhausted() && this.f1305h.buffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iCode != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + jBuild.code());
            }
            H hAuthenticate = this.f1298a.address().proxyAuthenticator().authenticate(this.f1298a, jBuild);
            if (hAuthenticate == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(jBuild.header("Connection"))) {
                return hAuthenticate;
            }
            h8 = hAuthenticate;
        }
    }

    private H e() {
        H hBuild = new H.a().url(this.f1298a.address().url()).method("CONNECT", null).header("Host", D7.e.hostHeader(this.f1298a.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", D7.f.userAgent()).build();
        H hAuthenticate = this.f1298a.address().proxyAuthenticator().authenticate(this.f1298a, new J.a().request(hBuild).protocol(F.HTTP_1_1).code(Map.MapException.StatusCode.ROUTER_ITF_ERROR_VALUE).message("Preemptive Authenticate").body(D7.e.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return hAuthenticate != null ? hAuthenticate : hBuild;
    }

    private void f(b bVar, int i8, InterfaceC0472f interfaceC0472f, u uVar) throws Throwable {
        if (this.f1298a.address().sslSocketFactory() != null) {
            uVar.secureConnectStart(interfaceC0472f);
            b(bVar);
            uVar.secureConnectEnd(interfaceC0472f, this.f1301d);
            if (this.f1302e == F.HTTP_2) {
                k(i8);
                return;
            }
            return;
        }
        List<F> listProtocols = this.f1298a.address().protocols();
        F f8 = F.H2_PRIOR_KNOWLEDGE;
        if (!listProtocols.contains(f8)) {
            this.f1300c = this.f1299b;
            this.f1302e = F.HTTP_1_1;
        } else {
            this.f1300c = this.f1299b;
            this.f1302e = f8;
            k(i8);
        }
    }

    private boolean j(List list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            L l8 = (L) list.get(i8);
            Proxy.Type type = l8.proxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f1298a.proxy().type() == type2 && this.f1298a.socketAddress().equals(l8.socketAddress())) {
                return true;
            }
        }
        return false;
    }

    private void k(int i8) throws SocketException {
        this.f1300c.setSoTimeout(0);
        I7.f fVarBuild = new f.h(true).socket(this.f1300c, this.f1298a.address().url().host(), this.f1304g, this.f1305h).listener(this).pingIntervalMillis(i8).build();
        this.f1303f = fVarBuild;
        fVarBuild.start();
    }

    public void cancel() {
        D7.e.closeQuietly(this.f1299b);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void connect(int r17, int r18, int r19, int r20, boolean r21, C7.InterfaceC0472f r22, C7.u r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F7.e.connect(int, int, int, int, boolean, C7.f, C7.u):void");
    }

    boolean g(C0467a c0467a, List list) {
        if (this.f1311n.size() >= this.f1310m || this.f1306i || !D7.a.instance.equalsNonHost(this.f1298a.address(), c0467a)) {
            return false;
        }
        if (c0467a.url().host().equals(route().address().url().host())) {
            return true;
        }
        if (this.f1303f == null || list == null || !j(list) || c0467a.hostnameVerifier() != M7.d.INSTANCE || !supportsUrl(c0467a.url())) {
            return false;
        }
        try {
            c0467a.certificatePinner().check(c0467a.url().host(), handshake().peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    G7.c h(E e8, B.a aVar) throws SocketException {
        if (this.f1303f != null) {
            return new I7.g(e8, this, aVar, this.f1303f);
        }
        this.f1300c.setSoTimeout(aVar.readTimeoutMillis());
        x xVarTimeout = this.f1304g.timeout();
        long timeoutMillis = aVar.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVarTimeout.timeout(timeoutMillis, timeUnit);
        this.f1305h.timeout().timeout(aVar.writeTimeoutMillis(), timeUnit);
        return new H7.a(e8, this, this.f1304g, this.f1305h);
    }

    @Override // C7.InterfaceC0478l
    public w handshake() {
        return this.f1301d;
    }

    b.f i(c cVar) throws SocketException {
        this.f1300c.setSoTimeout(0);
        noNewExchanges();
        return new a(true, this.f1304g, this.f1305h, cVar);
    }

    public boolean isHealthy(boolean z8) throws SocketException {
        if (this.f1300c.isClosed() || this.f1300c.isInputShutdown() || this.f1300c.isOutputShutdown()) {
            return false;
        }
        I7.f fVar = this.f1303f;
        if (fVar != null) {
            return fVar.isHealthy(System.nanoTime());
        }
        if (z8) {
            try {
                int soTimeout = this.f1300c.getSoTimeout();
                try {
                    this.f1300c.setSoTimeout(1);
                    return !this.f1304g.exhausted();
                } finally {
                    this.f1300c.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean isMultiplexed() {
        return this.f1303f != null;
    }

    void l(IOException iOException) {
        synchronized (this.connectionPool) {
            try {
                if (iOException instanceof I7.n) {
                    I7.b bVar = ((I7.n) iOException).errorCode;
                    if (bVar == I7.b.REFUSED_STREAM) {
                        int i8 = this.f1309l + 1;
                        this.f1309l = i8;
                        if (i8 > 1) {
                            this.f1306i = true;
                            this.f1307j++;
                        }
                    } else if (bVar != I7.b.CANCEL) {
                        this.f1306i = true;
                        this.f1307j++;
                    }
                } else if (!isMultiplexed() || (iOException instanceof I7.a)) {
                    this.f1306i = true;
                    if (this.f1308k == 0) {
                        if (iOException != null) {
                            this.connectionPool.connectFailed(this.f1298a, iOException);
                        }
                        this.f1307j++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void noNewExchanges() {
        synchronized (this.connectionPool) {
            this.f1306i = true;
        }
    }

    @Override // I7.f.j
    public void onSettings(I7.f fVar) {
        synchronized (this.connectionPool) {
            this.f1310m = fVar.maxConcurrentStreams();
        }
    }

    @Override // I7.f.j
    public void onStream(I7.i iVar) {
        iVar.close(I7.b.REFUSED_STREAM, null);
    }

    @Override // C7.InterfaceC0478l
    public F protocol() {
        return this.f1302e;
    }

    @Override // C7.InterfaceC0478l
    public L route() {
        return this.f1298a;
    }

    @Override // C7.InterfaceC0478l
    public Socket socket() {
        return this.f1300c;
    }

    public boolean supportsUrl(A a9) {
        if (a9.port() != this.f1298a.address().url().port()) {
            return false;
        }
        if (a9.host().equals(this.f1298a.address().url().host())) {
            return true;
        }
        return this.f1301d != null && M7.d.INSTANCE.verify(a9.host(), (X509Certificate) this.f1301d.peerCertificates().get(0));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f1298a.address().url().host());
        sb.append(":");
        sb.append(this.f1298a.address().url().port());
        sb.append(", proxy=");
        sb.append(this.f1298a.proxy());
        sb.append(" hostAddress=");
        sb.append(this.f1298a.socketAddress());
        sb.append(" cipherSuite=");
        w wVar = this.f1301d;
        sb.append(wVar != null ? wVar.cipherSuite() : "none");
        sb.append(" protocol=");
        sb.append(this.f1302e);
        sb.append('}');
        return sb.toString();
    }
}
