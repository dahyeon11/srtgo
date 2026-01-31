package F7;

import C7.A;
import C7.B;
import C7.C0467a;
import C7.C0474h;
import C7.E;
import C7.H;
import C7.InterfaceC0472f;
import C7.u;
import P7.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a */
    private final E f1336a;

    /* renamed from: b */
    private final g f1337b;

    /* renamed from: c */
    private final InterfaceC0472f f1338c;
    public e connection;

    /* renamed from: d */
    private final u f1339d;

    /* renamed from: e */
    private final P7.a f1340e;

    /* renamed from: f */
    private Object f1341f;

    /* renamed from: g */
    private H f1342g;

    /* renamed from: h */
    private d f1343h;

    /* renamed from: i */
    private c f1344i;

    /* renamed from: j */
    private boolean f1345j;

    /* renamed from: k */
    private boolean f1346k;

    /* renamed from: l */
    private boolean f1347l;

    /* renamed from: m */
    private boolean f1348m;

    /* renamed from: n */
    private boolean f1349n;

    class a extends P7.a {
        a() {
        }

        @Override // P7.a
        protected void h() {
            k.this.cancel();
        }
    }

    static final class b extends WeakReference {

        /* renamed from: a */
        final Object f1351a;

        b(k kVar, Object obj) {
            super(kVar);
            this.f1351a = obj;
        }
    }

    public k(E e8, InterfaceC0472f interfaceC0472f) {
        a aVar = new a();
        this.f1340e = aVar;
        this.f1336a = e8;
        this.f1337b = D7.a.instance.realConnectionPool(e8.connectionPool());
        this.f1338c = interfaceC0472f;
        this.f1339d = e8.eventListenerFactory().create(interfaceC0472f);
        aVar.timeout(e8.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    private C0467a b(A a9) {
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        C0474h c0474hCertificatePinner;
        if (a9.isHttps()) {
            sslSocketFactory = this.f1336a.sslSocketFactory();
            hostnameVerifier = this.f1336a.hostnameVerifier();
            c0474hCertificatePinner = this.f1336a.certificatePinner();
        } else {
            sslSocketFactory = null;
            hostnameVerifier = null;
            c0474hCertificatePinner = null;
        }
        return new C0467a(a9.host(), a9.port(), this.f1336a.dns(), this.f1336a.socketFactory(), sslSocketFactory, hostnameVerifier, c0474hCertificatePinner, this.f1336a.proxyAuthenticator(), this.f1336a.proxy(), this.f1336a.protocols(), this.f1336a.connectionSpecs(), this.f1336a.proxySelector());
    }

    private IOException d(IOException iOException, boolean z8) throws IOException {
        e eVar;
        Socket socketF;
        boolean z9;
        synchronized (this.f1337b) {
            if (z8) {
                try {
                    if (this.f1344i != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            eVar = this.connection;
            socketF = (eVar != null && this.f1344i == null && (z8 || this.f1349n)) ? f() : null;
            if (this.connection != null) {
                eVar = null;
            }
            z9 = this.f1349n && this.f1344i == null;
        }
        D7.e.closeQuietly(socketF);
        if (eVar != null) {
            this.f1339d.connectionReleased(this.f1338c, eVar);
        }
        if (z9) {
            boolean z10 = iOException != null;
            iOException = g(iOException);
            if (z10) {
                this.f1339d.callFailed(this.f1338c, iOException);
            } else {
                this.f1339d.callEnd(this.f1338c);
            }
        }
        return iOException;
    }

    private IOException g(IOException iOException) {
        if (this.f1348m || !this.f1340e.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    void a(e eVar) {
        if (this.connection != null) {
            throw new IllegalStateException();
        }
        this.connection = eVar;
        eVar.f1311n.add(new b(this, this.f1341f));
    }

    IOException c(c cVar, boolean z8, boolean z9, IOException iOException) {
        boolean z10;
        synchronized (this.f1337b) {
            try {
                c cVar2 = this.f1344i;
                if (cVar != cVar2) {
                    return iOException;
                }
                boolean z11 = true;
                if (z8) {
                    z10 = !this.f1345j;
                    this.f1345j = true;
                } else {
                    z10 = false;
                }
                if (z9) {
                    if (!this.f1346k) {
                        z10 = true;
                    }
                    this.f1346k = true;
                }
                if (this.f1345j && this.f1346k && z10) {
                    cVar2.connection().f1308k++;
                    this.f1344i = null;
                } else {
                    z11 = false;
                }
                return z11 ? d(iOException, false) : iOException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void callStart() {
        this.f1341f = K7.j.get().getStackTraceForCloseable("response.body().close()");
        this.f1339d.callStart(this.f1338c);
    }

    public boolean canRetry() {
        return this.f1343h.e() && this.f1343h.d();
    }

    public void cancel() {
        c cVar;
        e eVarA;
        synchronized (this.f1337b) {
            try {
                this.f1347l = true;
                cVar = this.f1344i;
                d dVar = this.f1343h;
                eVarA = (dVar == null || dVar.a() == null) ? this.connection : this.f1343h.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (eVarA != null) {
            eVarA.cancel();
        }
    }

    c e(B.a aVar, boolean z8) {
        synchronized (this.f1337b) {
            if (this.f1349n) {
                throw new IllegalStateException("released");
            }
            if (this.f1344i != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        c cVar = new c(this, this.f1338c, this.f1339d, this.f1343h, this.f1343h.find(this.f1336a, aVar, z8));
        synchronized (this.f1337b) {
            this.f1344i = cVar;
            this.f1345j = false;
            this.f1346k = false;
        }
        return cVar;
    }

    public void exchangeDoneDueToException() {
        synchronized (this.f1337b) {
            try {
                if (this.f1349n) {
                    throw new IllegalStateException();
                }
                this.f1344i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Socket f() {
        int size = this.connection.f1311n.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            }
            if (((Reference) this.connection.f1311n.get(i8)).get() == this) {
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.connection;
        eVar.f1311n.remove(i8);
        this.connection = null;
        if (eVar.f1311n.isEmpty()) {
            eVar.f1312o = System.nanoTime();
            if (this.f1337b.c(eVar)) {
                return eVar.socket();
            }
        }
        return null;
    }

    public boolean hasExchange() {
        boolean z8;
        synchronized (this.f1337b) {
            z8 = this.f1344i != null;
        }
        return z8;
    }

    public boolean isCanceled() {
        boolean z8;
        synchronized (this.f1337b) {
            z8 = this.f1347l;
        }
        return z8;
    }

    public IOException noMoreExchanges(IOException iOException) {
        synchronized (this.f1337b) {
            this.f1349n = true;
        }
        return d(iOException, false);
    }

    public void prepareToConnect(H h8) throws IOException {
        H h9 = this.f1342g;
        if (h9 != null) {
            if (D7.e.sameConnection(h9.url(), h8.url()) && this.f1343h.d()) {
                return;
            }
            if (this.f1344i != null) {
                throw new IllegalStateException();
            }
            if (this.f1343h != null) {
                d(null, true);
                this.f1343h = null;
            }
        }
        this.f1342g = h8;
        this.f1343h = new d(this, this.f1337b, b(h8.url()), this.f1338c, this.f1339d);
    }

    public x timeout() {
        return this.f1340e;
    }

    public void timeoutEarlyExit() {
        if (this.f1348m) {
            throw new IllegalStateException();
        }
        this.f1348m = true;
        this.f1340e.exit();
    }

    public void timeoutEnter() {
        this.f1340e.enter();
    }
}
