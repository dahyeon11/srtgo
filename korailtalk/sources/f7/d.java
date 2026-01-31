package F7;

import C7.B;
import C7.C0467a;
import C7.E;
import C7.InterfaceC0472f;
import C7.L;
import C7.u;
import F7.j;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* loaded from: classes3.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final k f1288a;

    /* renamed from: b, reason: collision with root package name */
    private final C0467a f1289b;

    /* renamed from: c, reason: collision with root package name */
    private final g f1290c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0472f f1291d;

    /* renamed from: e, reason: collision with root package name */
    private final u f1292e;

    /* renamed from: f, reason: collision with root package name */
    private j.a f1293f;

    /* renamed from: g, reason: collision with root package name */
    private final j f1294g;

    /* renamed from: h, reason: collision with root package name */
    private e f1295h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1296i;

    /* renamed from: j, reason: collision with root package name */
    private L f1297j;

    d(k kVar, g gVar, C0467a c0467a, InterfaceC0472f interfaceC0472f, u uVar) {
        this.f1288a = kVar;
        this.f1290c = gVar;
        this.f1289b = c0467a;
        this.f1291d = interfaceC0472f;
        this.f1292e = uVar;
        this.f1294g = new j(c0467a, gVar.f1321e, interfaceC0472f, uVar);
    }

    private e b(int i8, int i9, int i10, int i11, boolean z8) throws Throwable {
        e eVar;
        Socket socket;
        Socket socketF;
        e eVar2;
        boolean z9;
        L next;
        boolean z10;
        List<L> all;
        j.a aVar;
        synchronized (this.f1290c) {
            try {
                if (this.f1288a.isCanceled()) {
                    throw new IOException("Canceled");
                }
                this.f1296i = false;
                k kVar = this.f1288a;
                eVar = kVar.connection;
                socket = null;
                socketF = (eVar == null || !eVar.f1306i) ? null : kVar.f();
                k kVar2 = this.f1288a;
                eVar2 = kVar2.connection;
                if (eVar2 != null) {
                    eVar = null;
                } else {
                    eVar2 = null;
                }
                if (eVar2 != null) {
                    z9 = false;
                    next = null;
                } else if (this.f1290c.g(this.f1289b, kVar2, null, false)) {
                    eVar2 = this.f1288a.connection;
                    next = null;
                    z9 = true;
                } else {
                    next = this.f1297j;
                    if (next != null) {
                        this.f1297j = null;
                    } else {
                        if (f()) {
                            next = this.f1288a.connection.route();
                        }
                        z9 = false;
                        next = null;
                    }
                    z9 = false;
                }
            } finally {
            }
        }
        D7.e.closeQuietly(socketF);
        if (eVar != null) {
            this.f1292e.connectionReleased(this.f1291d, eVar);
        }
        if (z9) {
            this.f1292e.connectionAcquired(this.f1291d, eVar2);
        }
        if (eVar2 != null) {
            return eVar2;
        }
        if (next != null || ((aVar = this.f1293f) != null && aVar.hasNext())) {
            z10 = false;
        } else {
            this.f1293f = this.f1294g.next();
            z10 = true;
        }
        synchronized (this.f1290c) {
            try {
                if (this.f1288a.isCanceled()) {
                    throw new IOException("Canceled");
                }
                if (z10) {
                    all = this.f1293f.getAll();
                    if (this.f1290c.g(this.f1289b, this.f1288a, all, false)) {
                        eVar2 = this.f1288a.connection;
                        z9 = true;
                    }
                } else {
                    all = null;
                }
                if (!z9) {
                    if (next == null) {
                        next = this.f1293f.next();
                    }
                    eVar2 = new e(this.f1290c, next);
                    this.f1295h = eVar2;
                }
            } finally {
            }
        }
        if (z9) {
            this.f1292e.connectionAcquired(this.f1291d, eVar2);
            return eVar2;
        }
        eVar2.connect(i8, i9, i10, i11, z8, this.f1291d, this.f1292e);
        this.f1290c.f1321e.connected(eVar2.route());
        synchronized (this.f1290c) {
            try {
                this.f1295h = null;
                if (this.f1290c.g(this.f1289b, this.f1288a, all, true)) {
                    eVar2.f1306i = true;
                    socket = eVar2.socket();
                    eVar2 = this.f1288a.connection;
                    this.f1297j = next;
                } else {
                    this.f1290c.f(eVar2);
                    this.f1288a.a(eVar2);
                }
            } finally {
            }
        }
        D7.e.closeQuietly(socket);
        this.f1292e.connectionAcquired(this.f1291d, eVar2);
        return eVar2;
    }

    private e c(int i8, int i9, int i10, int i11, boolean z8, boolean z9) throws Throwable {
        while (true) {
            e eVarB = b(i8, i9, i10, i11, z8);
            synchronized (this.f1290c) {
                try {
                    if (eVarB.f1308k == 0 && !eVarB.isMultiplexed()) {
                        return eVarB;
                    }
                    if (eVarB.isHealthy(z9)) {
                        return eVarB;
                    }
                    eVarB.noNewExchanges();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private boolean f() {
        e eVar = this.f1288a.connection;
        return eVar != null && eVar.f1307j == 0 && D7.e.sameConnection(eVar.route().address().url(), this.f1289b.url());
    }

    e a() {
        return this.f1295h;
    }

    boolean d() {
        synchronized (this.f1290c) {
            try {
                boolean z8 = true;
                if (this.f1297j != null) {
                    return true;
                }
                if (f()) {
                    this.f1297j = this.f1288a.connection.route();
                    return true;
                }
                j.a aVar = this.f1293f;
                if ((aVar == null || !aVar.hasNext()) && !this.f1294g.hasNext()) {
                    z8 = false;
                }
                return z8;
            } finally {
            }
        }
    }

    boolean e() {
        boolean z8;
        synchronized (this.f1290c) {
            z8 = this.f1296i;
        }
        return z8;
    }

    public G7.c find(E e8, B.a aVar, boolean z8) {
        try {
            return c(aVar.connectTimeoutMillis(), aVar.readTimeoutMillis(), aVar.writeTimeoutMillis(), e8.pingIntervalMillis(), e8.retryOnConnectionFailure(), z8).h(e8, aVar);
        } catch (i e9) {
            g();
            throw e9;
        } catch (IOException e10) {
            g();
            throw new i(e10);
        }
    }

    void g() {
        synchronized (this.f1290c) {
            this.f1296i = true;
        }
    }
}
