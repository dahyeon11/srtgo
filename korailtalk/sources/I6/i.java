package I6;

import I6.b;
import I6.f;
import I6.h;
import I6.j;
import I6.q;
import K6.b;
import L6.a;
import L6.b;
import P7.w;
import P7.x;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.util.concurrent.C;
import com.kakao.sdk.common.Constants;
import e3.C5353C;
import e3.InterfaceC5355E;
import io.grpc.AbstractC5794n;
import io.grpc.C5713a;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.J;
import io.grpc.J0;
import io.grpc.K0;
import io.grpc.M;
import io.grpc.O;
import io.grpc.U;
import io.grpc.internal.C5747f0;
import io.grpc.internal.InterfaceC5764n0;
import io.grpc.internal.InterfaceC5774t;
import io.grpc.internal.InterfaceC5776u;
import io.grpc.internal.InterfaceC5782x;
import io.grpc.internal.J0;
import io.grpc.internal.O0;
import io.grpc.internal.T;
import io.grpc.internal.U;
import io.grpc.internal.V0;
import io.grpc.internal.Y;
import io.grpc.internal.Z;
import io.grpc.t0;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
class i implements InterfaceC5782x, b.a, q.d {

    /* renamed from: W */
    private static final Map f2259W = I();

    /* renamed from: X */
    private static final Logger f2260X = Logger.getLogger(i.class.getName());

    /* renamed from: A */
    private final SocketFactory f2261A;

    /* renamed from: B */
    private SSLSocketFactory f2262B;

    /* renamed from: C */
    private HostnameVerifier f2263C;

    /* renamed from: D */
    private Socket f2264D;

    /* renamed from: E */
    private int f2265E;

    /* renamed from: F */
    private final Deque f2266F;

    /* renamed from: G */
    private final J6.b f2267G;

    /* renamed from: H */
    private C5747f0 f2268H;

    /* renamed from: I */
    private boolean f2269I;

    /* renamed from: J */
    private long f2270J;

    /* renamed from: K */
    private long f2271K;

    /* renamed from: L */
    private boolean f2272L;

    /* renamed from: M */
    private final Runnable f2273M;

    /* renamed from: N */
    private final int f2274N;

    /* renamed from: O */
    private final boolean f2275O;

    /* renamed from: P */
    private final V0 f2276P;

    /* renamed from: Q */
    private final Z f2277Q;

    /* renamed from: R */
    private O.f f2278R;

    /* renamed from: S */
    final M f2279S;

    /* renamed from: T */
    int f2280T;

    /* renamed from: U */
    Runnable f2281U;

    /* renamed from: V */
    com.google.common.util.concurrent.M f2282V;

    /* renamed from: a */
    private final InetSocketAddress f2283a;

    /* renamed from: b */
    private final String f2284b;

    /* renamed from: c */
    private final String f2285c;

    /* renamed from: d */
    private final Random f2286d;

    /* renamed from: e */
    private final InterfaceC5355E f2287e;

    /* renamed from: f */
    private final int f2288f;

    /* renamed from: g */
    private final K6.j f2289g;

    /* renamed from: h */
    private InterfaceC5764n0.a f2290h;

    /* renamed from: i */
    private I6.b f2291i;

    /* renamed from: j */
    private q f2292j;

    /* renamed from: k */
    private final Object f2293k;

    /* renamed from: l */
    private final U f2294l;

    /* renamed from: m */
    private int f2295m;

    /* renamed from: n */
    private final Map f2296n;

    /* renamed from: o */
    private final Executor f2297o;

    /* renamed from: p */
    private final J0 f2298p;

    /* renamed from: q */
    private final ScheduledExecutorService f2299q;

    /* renamed from: r */
    private final int f2300r;

    /* renamed from: s */
    private int f2301s;

    /* renamed from: t */
    private e f2302t;

    /* renamed from: u */
    private C5713a f2303u;

    /* renamed from: v */
    private io.grpc.J0 f2304v;

    /* renamed from: w */
    private boolean f2305w;

    /* renamed from: x */
    private Y f2306x;

    /* renamed from: y */
    private boolean f2307y;

    /* renamed from: z */
    private boolean f2308z;

    class a extends Z {
        a() {
        }

        @Override // io.grpc.internal.Z
        protected void a() {
            i.this.f2290h.transportInUse(true);
        }

        @Override // io.grpc.internal.Z
        protected void b() {
            i.this.f2290h.transportInUse(false);
        }
    }

    class b implements V0.c {
        b() {
        }

        @Override // io.grpc.internal.V0.c
        public V0.d read() {
            V0.d dVar;
            synchronized (i.this.f2293k) {
                dVar = new V0.d(i.this.f2292j == null ? -1L : i.this.f2292j.windowUpdate(null, 0), (long) (i.this.f2288f * 0.5f));
            }
            return dVar;
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = i.this.f2281U;
            if (runnable != null) {
                runnable.run();
            }
            i.this.f2297o.execute(i.this.f2302t);
            synchronized (i.this.f2293k) {
                i.this.f2265E = Integer.MAX_VALUE;
                i.this.b0();
            }
            com.google.common.util.concurrent.M m8 = i.this.f2282V;
            if (m8 != null) {
                m8.set(null);
            }
        }
    }

    public i(f.C0040f c0040f, InetSocketAddress inetSocketAddress, String str, String str2, C5713a c5713a, M m8, Runnable runnable) {
        this(c0040f, inetSocketAddress, str, str2, c5713a, io.grpc.internal.U.STOPWATCH_SUPPLIER, new K6.g(), m8, runnable);
    }

    private static Map I() {
        EnumMap enumMap = new EnumMap(K6.a.class);
        K6.a aVar = K6.a.NO_ERROR;
        io.grpc.J0 j02 = io.grpc.J0.INTERNAL;
        enumMap.put((EnumMap) aVar, (K6.a) j02.withDescription("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) K6.a.PROTOCOL_ERROR, (K6.a) j02.withDescription("Protocol error"));
        enumMap.put((EnumMap) K6.a.INTERNAL_ERROR, (K6.a) j02.withDescription("Internal error"));
        enumMap.put((EnumMap) K6.a.FLOW_CONTROL_ERROR, (K6.a) j02.withDescription("Flow control error"));
        enumMap.put((EnumMap) K6.a.STREAM_CLOSED, (K6.a) j02.withDescription("Stream closed"));
        enumMap.put((EnumMap) K6.a.FRAME_TOO_LARGE, (K6.a) j02.withDescription("Frame too large"));
        enumMap.put((EnumMap) K6.a.REFUSED_STREAM, (K6.a) io.grpc.J0.UNAVAILABLE.withDescription("Refused stream"));
        enumMap.put((EnumMap) K6.a.CANCEL, (K6.a) io.grpc.J0.CANCELLED.withDescription("Cancelled"));
        enumMap.put((EnumMap) K6.a.COMPRESSION_ERROR, (K6.a) j02.withDescription("Compression error"));
        enumMap.put((EnumMap) K6.a.CONNECT_ERROR, (K6.a) j02.withDescription("Connect error"));
        enumMap.put((EnumMap) K6.a.ENHANCE_YOUR_CALM, (K6.a) io.grpc.J0.RESOURCE_EXHAUSTED.withDescription("Enhance your calm"));
        enumMap.put((EnumMap) K6.a.INADEQUATE_SECURITY, (K6.a) io.grpc.J0.PERMISSION_DENIED.withDescription("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    private L6.b J(InetSocketAddress inetSocketAddress, String str, String str2) {
        L6.a aVarBuild = new a.b().scheme(Constants.SCHEME).host(inetSocketAddress.getHostName()).port(inetSocketAddress.getPort()).build();
        b.C0054b c0054bHeader = new b.C0054b().url(aVarBuild).header("Host", aVarBuild.host() + ":" + aVarBuild.port()).header("User-Agent", this.f2285c);
        if (str != null && str2 != null) {
            c0054bHeader.header("Proxy-Authorization", J6.c.basic(str, str2));
        }
        return c0054bHeader.build();
    }

    public Socket K(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws IOException, K0 {
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? this.f2261A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.f2261A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socketCreateSocket.setTcpNoDelay(true);
            socketCreateSocket.setSoTimeout(this.f2280T);
            w wVarSource = P7.n.source(socketCreateSocket);
            P7.d dVarBuffer = P7.n.buffer(P7.n.sink(socketCreateSocket));
            L6.b bVarJ = J(inetSocketAddress, str, str2);
            L6.a aVarHttpUrl = bVarJ.httpUrl();
            dVarBuffer.writeUtf8(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", aVarHttpUrl.host(), Integer.valueOf(aVarHttpUrl.port()))).writeUtf8("\r\n");
            int size = bVarJ.headers().size();
            for (int i8 = 0; i8 < size; i8++) {
                dVarBuffer.writeUtf8(bVarJ.headers().name(i8)).writeUtf8(": ").writeUtf8(bVarJ.headers().value(i8)).writeUtf8("\r\n");
            }
            dVarBuffer.writeUtf8("\r\n");
            dVarBuffer.flush();
            J6.j jVar = J6.j.parse(W(wVarSource));
            while (!W(wVarSource).equals("")) {
            }
            int i9 = jVar.code;
            if (i9 >= 200 && i9 < 300) {
                socketCreateSocket.setSoTimeout(0);
                return socketCreateSocket;
            }
            P7.c cVar = new P7.c();
            try {
                socketCreateSocket.shutdownOutput();
                wVarSource.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            } catch (IOException e8) {
                cVar.writeUtf8("Unable to read body: " + e8.toString());
            }
            try {
                socketCreateSocket.close();
            } catch (IOException unused) {
            }
            throw io.grpc.J0.UNAVAILABLE.withDescription(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(jVar.code), jVar.message, cVar.readUtf8())).asException();
        } catch (IOException e9) {
            if (socketCreateSocket != null) {
                io.grpc.internal.U.closeQuietly(socketCreateSocket);
            }
            throw io.grpc.J0.UNAVAILABLE.withDescription("Failed trying to connect with proxy").withCause(e9).asException();
        }
    }

    private Throwable P() {
        synchronized (this.f2293k) {
            try {
                io.grpc.J0 j02 = this.f2304v;
                if (j02 != null) {
                    return j02.asException();
                }
                return io.grpc.J0.UNAVAILABLE.withDescription("Connection closed").asException();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void R() {
        synchronized (this.f2293k) {
            this.f2276P.setFlowControlWindowReader(new b());
        }
    }

    private void U(h hVar) {
        if (this.f2308z && this.f2266F.isEmpty() && this.f2296n.isEmpty()) {
            this.f2308z = false;
            C5747f0 c5747f0 = this.f2268H;
            if (c5747f0 != null) {
                c5747f0.onTransportIdle();
            }
        }
        if (hVar.shouldBeCountedForInUse()) {
            this.f2277Q.updateObjectInUse(hVar, false);
        }
    }

    public void V(K6.a aVar, String str) {
        a0(0, aVar, f0(aVar).augmentDescription(str));
    }

    private static String W(w wVar) throws EOFException {
        P7.c cVar = new P7.c();
        while (wVar.read(cVar, 1L) != -1) {
            if (cVar.getByte(cVar.size() - 1) == 10) {
                return cVar.readUtf8LineStrict();
            }
        }
        throw new EOFException("\\n not found: " + cVar.readByteString().hex());
    }

    private void Y() {
        synchronized (this.f2293k) {
            try {
                this.f2291i.connectionPreface();
                K6.i iVar = new K6.i();
                m.set(iVar, 7, this.f2288f);
                this.f2291i.settings(iVar);
                if (this.f2288f > 65535) {
                    this.f2291i.windowUpdate(0, r1 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void Z(h hVar) {
        if (!this.f2308z) {
            this.f2308z = true;
            C5747f0 c5747f0 = this.f2268H;
            if (c5747f0 != null) {
                c5747f0.onTransportActive();
            }
        }
        if (hVar.shouldBeCountedForInUse()) {
            this.f2277Q.updateObjectInUse(hVar, true);
        }
    }

    public void a0(int i8, K6.a aVar, io.grpc.J0 j02) {
        synchronized (this.f2293k) {
            try {
                if (this.f2304v == null) {
                    this.f2304v = j02;
                    this.f2290h.transportShutdown(j02);
                }
                if (aVar != null && !this.f2305w) {
                    this.f2305w = true;
                    this.f2291i.goAway(0, aVar, new byte[0]);
                }
                Iterator it = this.f2296n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i8) {
                        it.remove();
                        ((h) entry.getValue()).d().transportReportStatus(j02, InterfaceC5774t.a.REFUSED, false, new C5728h0());
                        U((h) entry.getValue());
                    }
                }
                for (h hVar : this.f2266F) {
                    hVar.d().transportReportStatus(j02, InterfaceC5774t.a.MISCARRIED, true, new C5728h0());
                    U(hVar);
                }
                this.f2266F.clear();
                d0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b0() {
        boolean z8 = false;
        while (!this.f2266F.isEmpty() && this.f2296n.size() < this.f2265E) {
            c0((h) this.f2266F.poll());
            z8 = true;
        }
        return z8;
    }

    private void c0(h hVar) {
        e3.w.checkState(hVar.d().T() == -1, "StreamId already assigned");
        this.f2296n.put(Integer.valueOf(this.f2295m), hVar);
        Z(hVar);
        hVar.d().start(this.f2295m);
        if ((hVar.getType() != C5730i0.d.UNARY && hVar.getType() != C5730i0.d.SERVER_STREAMING) || hVar.v()) {
            this.f2291i.flush();
        }
        int i8 = this.f2295m;
        if (i8 < 2147483645) {
            this.f2295m = i8 + 2;
        } else {
            this.f2295m = Integer.MAX_VALUE;
            a0(Integer.MAX_VALUE, K6.a.NO_ERROR, io.grpc.J0.UNAVAILABLE.withDescription("Stream ids exhausted"));
        }
    }

    private void d0() {
        if (this.f2304v == null || !this.f2296n.isEmpty() || !this.f2266F.isEmpty() || this.f2307y) {
            return;
        }
        this.f2307y = true;
        C5747f0 c5747f0 = this.f2268H;
        if (c5747f0 != null) {
            c5747f0.onTransportTermination();
        }
        Y y8 = this.f2306x;
        if (y8 != null) {
            y8.failed(P());
            this.f2306x = null;
        }
        if (!this.f2305w) {
            this.f2305w = true;
            this.f2291i.goAway(0, K6.a.NO_ERROR, new byte[0]);
        }
        this.f2291i.close();
    }

    static io.grpc.J0 f0(K6.a aVar) {
        io.grpc.J0 j02 = (io.grpc.J0) f2259W.get(aVar);
        if (j02 != null) {
            return j02;
        }
        return io.grpc.J0.UNKNOWN.withDescription("Unknown http2 error code: " + aVar.httpCode);
    }

    static /* synthetic */ int v(i iVar, int i8) {
        int i9 = iVar.f2301s + i8;
        iVar.f2301s = i9;
        return i9;
    }

    void L(boolean z8, long j8, long j9, boolean z9) {
        this.f2269I = z8;
        this.f2270J = j8;
        this.f2271K = j9;
        this.f2272L = z9;
    }

    void M(int i8, io.grpc.J0 j02, InterfaceC5774t.a aVar, boolean z8, K6.a aVar2, C5728h0 c5728h0) {
        synchronized (this.f2293k) {
            try {
                h hVar = (h) this.f2296n.remove(Integer.valueOf(i8));
                if (hVar != null) {
                    if (aVar2 != null) {
                        this.f2291i.rstStream(i8, K6.a.CANCEL);
                    }
                    if (j02 != null) {
                        h.b bVarD = hVar.d();
                        if (c5728h0 == null) {
                            c5728h0 = new C5728h0();
                        }
                        bVarD.transportReportStatus(j02, aVar, z8, c5728h0);
                    }
                    if (!b0()) {
                        d0();
                        U(hVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    String N() {
        URI uriAuthorityToUri = io.grpc.internal.U.authorityToUri(this.f2284b);
        return uriAuthorityToUri.getHost() != null ? uriAuthorityToUri.getHost() : this.f2284b;
    }

    int O() {
        URI uriAuthorityToUri = io.grpc.internal.U.authorityToUri(this.f2284b);
        return uriAuthorityToUri.getPort() != -1 ? uriAuthorityToUri.getPort() : this.f2283a.getPort();
    }

    h Q(int i8) {
        h hVar;
        synchronized (this.f2293k) {
            hVar = (h) this.f2296n.get(Integer.valueOf(i8));
        }
        return hVar;
    }

    boolean S() {
        return this.f2262B == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean T(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2293k
            monitor-enter(r0)
            int r1 = r2.f2295m     // Catch: java.lang.Throwable -> Lf
            if (r3 >= r1) goto Lc
            r1 = 1
            r3 = r3 & r1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.i.T(int):boolean");
    }

    void X(h hVar) {
        this.f2266F.remove(hVar);
        U(hVar);
    }

    void e0(h hVar) {
        if (this.f2304v != null) {
            hVar.d().transportReportStatus(this.f2304v, InterfaceC5774t.a.MISCARRIED, true, new C5728h0());
        } else if (this.f2296n.size() < this.f2265E) {
            c0(hVar);
        } else {
            this.f2266F.add(hVar);
            Z(hVar);
        }
    }

    @Override // I6.q.d
    public q.c[] getActiveStreams() {
        q.c[] cVarArr;
        synchronized (this.f2293k) {
            try {
                cVarArr = new q.c[this.f2296n.size()];
                Iterator it = this.f2296n.values().iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    cVarArr[i8] = ((h) it.next()).d().S();
                    i8++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarArr;
    }

    @Override // io.grpc.internal.InterfaceC5782x
    public C5713a getAttributes() {
        return this.f2303u;
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u, io.grpc.T, io.grpc.Y
    public U getLogId() {
        return this.f2294l;
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u, io.grpc.T
    public C getStats() {
        com.google.common.util.concurrent.M mCreate = com.google.common.util.concurrent.M.create();
        synchronized (this.f2293k) {
            try {
                if (this.f2264D == null) {
                    mCreate.set(new O.k(this.f2276P.getStats(), null, null, new O.j.a().build(), null));
                } else {
                    mCreate.set(new O.k(this.f2276P.getStats(), this.f2264D.getLocalSocketAddress(), this.f2264D.getRemoteSocketAddress(), r.c(this.f2264D), this.f2278R));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mCreate;
    }

    @Override // I6.b.a
    public void onException(Throwable th) {
        e3.w.checkNotNull(th, "failureCause");
        a0(0, K6.a.INTERNAL_ERROR, io.grpc.J0.UNAVAILABLE.withCause(th));
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u
    public void ping(InterfaceC5776u.a aVar, Executor executor) {
        long jNextLong;
        synchronized (this.f2293k) {
            try {
                boolean z8 = true;
                e3.w.checkState(this.f2291i != null);
                if (this.f2307y) {
                    Y.notifyFailed(aVar, executor, P());
                    return;
                }
                Y y8 = this.f2306x;
                if (y8 != null) {
                    jNextLong = 0;
                    z8 = false;
                } else {
                    jNextLong = this.f2286d.nextLong();
                    C5353C c5353c = (C5353C) this.f2287e.get();
                    c5353c.start();
                    Y y9 = new Y(jNextLong, c5353c);
                    this.f2306x = y9;
                    this.f2276P.reportKeepAliveSent();
                    y8 = y9;
                }
                if (z8) {
                    this.f2291i.ping(false, (int) (jNextLong >>> 32), (int) jNextLong);
                }
                y8.addCallback(aVar, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0
    public void shutdown(io.grpc.J0 j02) {
        synchronized (this.f2293k) {
            try {
                if (this.f2304v != null) {
                    return;
                }
                this.f2304v = j02;
                this.f2290h.transportShutdown(j02);
                d0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0
    public void shutdownNow(io.grpc.J0 j02) {
        shutdown(j02);
        synchronized (this.f2293k) {
            try {
                Iterator it = this.f2296n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((h) entry.getValue()).d().transportReportStatus(j02, false, new C5728h0());
                    U((h) entry.getValue());
                }
                for (h hVar : this.f2266F) {
                    hVar.d().transportReportStatus(j02, InterfaceC5774t.a.MISCARRIED, true, new C5728h0());
                    U(hVar);
                }
                this.f2266F.clear();
                d0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0
    public Runnable start(InterfaceC5764n0.a aVar) {
        this.f2290h = (InterfaceC5764n0.a) e3.w.checkNotNull(aVar, "listener");
        if (this.f2269I) {
            C5747f0 c5747f0 = new C5747f0(new C5747f0.c(this), this.f2299q, this.f2270J, this.f2271K, this.f2272L);
            this.f2268H = c5747f0;
            c5747f0.onTransportStarted();
        }
        I6.a aVarM = I6.a.m(this.f2298p, this, 10000);
        K6.c cVarL = aVarM.l(this.f2289g.newWriter(P7.n.buffer(aVarM), true));
        synchronized (this.f2293k) {
            I6.b bVar = new I6.b(this, cVarL);
            this.f2291i = bVar;
            this.f2292j = new q(this, bVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f2298p.execute(new c(countDownLatch, aVarM));
        try {
            Y();
            countDownLatch.countDown();
            this.f2298p.execute(new d());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("logId", this.f2294l.getId()).add(com.kakao.sdk.template.Constants.ADDRESS, this.f2283a).toString();
    }

    private i(f.C0040f c0040f, InetSocketAddress inetSocketAddress, String str, String str2, C5713a c5713a, InterfaceC5355E interfaceC5355E, K6.j jVar, M m8, Runnable runnable) {
        this.f2286d = new Random();
        this.f2293k = new Object();
        this.f2296n = new HashMap();
        this.f2265E = 0;
        this.f2266F = new LinkedList();
        this.f2277Q = new a();
        this.f2280T = 30000;
        this.f2283a = (InetSocketAddress) e3.w.checkNotNull(inetSocketAddress, com.kakao.sdk.template.Constants.ADDRESS);
        this.f2284b = str;
        this.f2300r = c0040f.f2220j;
        this.f2288f = c0040f.f2225o;
        this.f2297o = (Executor) e3.w.checkNotNull(c0040f.f2212b, "executor");
        this.f2298p = new J0(c0040f.f2212b);
        this.f2299q = (ScheduledExecutorService) e3.w.checkNotNull(c0040f.f2214d, "scheduledExecutorService");
        this.f2295m = 3;
        SocketFactory socketFactory = c0040f.f2216f;
        this.f2261A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.f2262B = c0040f.f2217g;
        this.f2263C = c0040f.f2218h;
        this.f2267G = (J6.b) e3.w.checkNotNull(c0040f.f2219i, "connectionSpec");
        this.f2287e = (InterfaceC5355E) e3.w.checkNotNull(interfaceC5355E, "stopwatchFactory");
        this.f2289g = (K6.j) e3.w.checkNotNull(jVar, "variant");
        this.f2285c = io.grpc.internal.U.getGrpcUserAgent("okhttp", str2);
        this.f2279S = m8;
        this.f2273M = (Runnable) e3.w.checkNotNull(runnable, "tooManyPingsRunnable");
        this.f2274N = c0040f.f2227q;
        this.f2276P = c0040f.f2215e.create();
        this.f2294l = U.allocate(getClass(), inetSocketAddress.toString());
        this.f2303u = C5713a.newBuilder().set(T.ATTR_CLIENT_EAG_ATTRS, c5713a).build();
        this.f2275O = c0040f.f2228r;
        R();
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u
    public h newStream(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, AbstractC5794n[] abstractC5794nArr) throws Throwable {
        e3.w.checkNotNull(c5730i0, "method");
        e3.w.checkNotNull(c5728h0, "headers");
        O0 o0NewClientContext = O0.newClientContext(abstractC5794nArr, getAttributes(), c5728h0);
        synchronized (this.f2293k) {
            try {
                try {
                    return new h(c5730i0, c5728h0, this.f2291i, this, this.f2292j, this.f2293k, this.f2300r, this.f2288f, this.f2284b, this.f2285c, o0NewClientContext, this.f2276P, c5721e, this.f2275O);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f2311a;

        /* renamed from: b */
        final /* synthetic */ I6.a f2312b;

        c(CountDownLatch countDownLatch, I6.a aVar) {
            this.f2311a = countDownLatch;
            this.f2312b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            i iVar;
            e eVar;
            Socket socketK;
            SSLSession session;
            Socket socket;
            try {
                this.f2311a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            P7.e eVarBuffer = P7.n.buffer(new a());
            try {
                try {
                    i iVar2 = i.this;
                    M m8 = iVar2.f2279S;
                    if (m8 == null) {
                        socketK = iVar2.f2261A.createSocket(i.this.f2283a.getAddress(), i.this.f2283a.getPort());
                    } else {
                        if (!(m8.getProxyAddress() instanceof InetSocketAddress)) {
                            throw io.grpc.J0.INTERNAL.withDescription("Unsupported SocketAddress implementation " + i.this.f2279S.getProxyAddress().getClass()).asException();
                        }
                        i iVar3 = i.this;
                        socketK = iVar3.K(iVar3.f2279S.getTargetAddress(), (InetSocketAddress) i.this.f2279S.getProxyAddress(), i.this.f2279S.getUsername(), i.this.f2279S.getPassword());
                    }
                    Socket socket2 = socketK;
                    if (i.this.f2262B != null) {
                        SSLSocket sSLSocketUpgrade = n.upgrade(i.this.f2262B, i.this.f2263C, socket2, i.this.N(), i.this.O(), i.this.f2267G);
                        session = sSLSocketUpgrade.getSession();
                        socket = sSLSocketUpgrade;
                    } else {
                        session = null;
                        socket = socket2;
                    }
                    socket.setTcpNoDelay(true);
                    P7.e eVarBuffer2 = P7.n.buffer(P7.n.source(socket));
                    this.f2312b.k(P7.n.sink(socket), socket);
                    i iVar4 = i.this;
                    iVar4.f2303u = iVar4.f2303u.toBuilder().set(J.TRANSPORT_ATTR_REMOTE_ADDR, socket.getRemoteSocketAddress()).set(J.TRANSPORT_ATTR_LOCAL_ADDR, socket.getLocalSocketAddress()).set(J.TRANSPORT_ATTR_SSL_SESSION, session).set(T.ATTR_SECURITY_LEVEL, session == null ? t0.NONE : t0.PRIVACY_AND_INTEGRITY).build();
                    i iVar5 = i.this;
                    iVar5.f2302t = iVar5.new e(iVar5.f2289g.newReader(eVarBuffer2, true));
                    synchronized (i.this.f2293k) {
                        try {
                            i.this.f2264D = (Socket) e3.w.checkNotNull(socket, "socket");
                            if (session != null) {
                                i.this.f2278R = new O.f(new O.m(session));
                            }
                        } finally {
                        }
                    }
                } catch (K0 e8) {
                    i.this.a0(0, K6.a.INTERNAL_ERROR, e8.getStatus());
                    iVar = i.this;
                    eVar = iVar.new e(iVar.f2289g.newReader(eVarBuffer, true));
                    iVar.f2302t = eVar;
                } catch (Exception e9) {
                    i.this.onException(e9);
                    iVar = i.this;
                    eVar = iVar.new e(iVar.f2289g.newReader(eVarBuffer, true));
                    iVar.f2302t = eVar;
                }
            } catch (Throwable th) {
                i iVar6 = i.this;
                iVar6.f2302t = iVar6.new e(iVar6.f2289g.newReader(eVarBuffer, true));
                throw th;
            }
        }

        class a implements w {
            a() {
            }

            @Override // P7.w
            public long read(P7.c cVar, long j8) {
                return -1L;
            }

            @Override // P7.w
            public x timeout() {
                return x.NONE;
            }

            @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }

    class e implements b.a, Runnable {

        /* renamed from: b */
        K6.b f2317b;

        /* renamed from: a */
        private final j f2316a = new j(Level.FINE, i.class);

        /* renamed from: c */
        boolean f2318c = true;

        e(K6.b bVar) {
            this.f2317b = bVar;
        }

        private int a(List list) {
            long size = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                K6.d dVar = (K6.d) list.get(i8);
                size += dVar.name.size() + 32 + dVar.value.size();
            }
            return (int) Math.min(size, 2147483647L);
        }

        @Override // K6.b.a
        public void data(boolean z8, int i8, P7.e eVar, int i9) {
            this.f2316a.b(j.a.INBOUND, i8, eVar.getBuffer(), i9, z8);
            h hVarQ = i.this.Q(i8);
            if (hVarQ != null) {
                long j8 = i9;
                eVar.require(j8);
                P7.c cVar = new P7.c();
                cVar.write(eVar.getBuffer(), j8);
                P6.c.event("OkHttpClientTransport$ClientFrameHandler.data", hVarQ.d().X());
                synchronized (i.this.f2293k) {
                    hVarQ.d().transportDataReceived(cVar, z8);
                }
            } else {
                if (!i.this.T(i8)) {
                    i.this.V(K6.a.PROTOCOL_ERROR, "Received data for unknown stream: " + i8);
                    return;
                }
                synchronized (i.this.f2293k) {
                    i.this.f2291i.rstStream(i8, K6.a.STREAM_CLOSED);
                }
                eVar.skip(i9);
            }
            i.v(i.this, i9);
            if (i.this.f2301s >= i.this.f2288f * 0.5f) {
                synchronized (i.this.f2293k) {
                    i.this.f2291i.windowUpdate(0, i.this.f2301s);
                }
                i.this.f2301s = 0;
            }
        }

        @Override // K6.b.a
        public void goAway(int i8, K6.a aVar, P7.f fVar) {
            this.f2316a.c(j.a.INBOUND, i8, aVar, fVar);
            if (aVar == K6.a.ENHANCE_YOUR_CALM) {
                String strUtf8 = fVar.utf8();
                i.f2260X.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strUtf8));
                if ("too_many_pings".equals(strUtf8)) {
                    i.this.f2273M.run();
                }
            }
            io.grpc.J0 j0AugmentDescription = U.i.statusForCode(aVar.httpCode).augmentDescription("Received Goaway");
            if (fVar.size() > 0) {
                j0AugmentDescription = j0AugmentDescription.augmentDescription(fVar.utf8());
            }
            i.this.a0(i8, null, j0AugmentDescription);
        }

        @Override // K6.b.a
        public void headers(boolean z8, boolean z9, int i8, int i9, List<K6.d> list, K6.e eVar) {
            io.grpc.J0 j0WithDescription;
            boolean z10;
            int iA;
            this.f2316a.d(j.a.INBOUND, i8, list, z9);
            if (i.this.f2274N == Integer.MAX_VALUE || (iA = a(list)) <= i.this.f2274N) {
                j0WithDescription = null;
            } else {
                j0WithDescription = io.grpc.J0.RESOURCE_EXHAUSTED.withDescription(String.format(Locale.US, "Response %s metadata larger than %d: %d", z9 ? "trailer" : "header", Integer.valueOf(i.this.f2274N), Integer.valueOf(iA)));
            }
            synchronized (i.this.f2293k) {
                try {
                    h hVar = (h) i.this.f2296n.get(Integer.valueOf(i8));
                    z10 = false;
                    if (hVar == null) {
                        if (i.this.T(i8)) {
                            i.this.f2291i.rstStream(i8, K6.a.STREAM_CLOSED);
                        } else {
                            z10 = true;
                        }
                    } else if (j0WithDescription == null) {
                        P6.c.event("OkHttpClientTransport$ClientFrameHandler.headers", hVar.d().X());
                        hVar.d().transportHeadersReceived(list, z9);
                    } else {
                        if (!z9) {
                            i.this.f2291i.rstStream(i8, K6.a.CANCEL);
                        }
                        hVar.d().transportReportStatus(j0WithDescription, false, new C5728h0());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                i.this.V(K6.a.PROTOCOL_ERROR, "Received header for unknown stream: " + i8);
            }
        }

        @Override // K6.b.a
        public void ping(boolean z8, int i8, int i9) {
            Y y8;
            long j8 = (i8 << 32) | (i9 & 4294967295L);
            this.f2316a.e(j.a.INBOUND, j8);
            if (!z8) {
                synchronized (i.this.f2293k) {
                    i.this.f2291i.ping(true, i8, i9);
                }
                return;
            }
            synchronized (i.this.f2293k) {
                try {
                    y8 = null;
                    if (i.this.f2306x == null) {
                        i.f2260X.warning("Received unexpected ping ack. No ping outstanding");
                    } else if (i.this.f2306x.payload() == j8) {
                        Y y9 = i.this.f2306x;
                        i.this.f2306x = null;
                        y8 = y9;
                    } else {
                        i.f2260X.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(i.this.f2306x.payload()), Long.valueOf(j8)));
                    }
                } finally {
                }
            }
            if (y8 != null) {
                y8.complete();
            }
        }

        @Override // K6.b.a
        public void pushPromise(int i8, int i9, List<K6.d> list) {
            this.f2316a.g(j.a.INBOUND, i8, i9, list);
            synchronized (i.this.f2293k) {
                i.this.f2291i.rstStream(i8, K6.a.PROTOCOL_ERROR);
            }
        }

        @Override // K6.b.a
        public void rstStream(int i8, K6.a aVar) {
            this.f2316a.h(j.a.INBOUND, i8, aVar);
            io.grpc.J0 j0AugmentDescription = i.f0(aVar).augmentDescription("Rst Stream");
            boolean z8 = j0AugmentDescription.getCode() == J0.b.CANCELLED || j0AugmentDescription.getCode() == J0.b.DEADLINE_EXCEEDED;
            synchronized (i.this.f2293k) {
                try {
                    h hVar = (h) i.this.f2296n.get(Integer.valueOf(i8));
                    if (hVar != null) {
                        P6.c.event("OkHttpClientTransport$ClientFrameHandler.rstStream", hVar.d().X());
                        i.this.M(i8, j0AugmentDescription, aVar == K6.a.REFUSED_STREAM ? InterfaceC5774t.a.REFUSED : InterfaceC5774t.a.PROCESSED, z8, null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            io.grpc.J0 j0WithDescription;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f2317b.nextFrame(this)) {
                try {
                    if (i.this.f2268H != null) {
                        i.this.f2268H.onDataReceived();
                    }
                } catch (Throwable th) {
                    try {
                        i.this.a0(0, K6.a.PROTOCOL_ERROR, io.grpc.J0.INTERNAL.withDescription("error in frame handler").withCause(th));
                        try {
                            this.f2317b.close();
                        } catch (IOException e8) {
                            e = e8;
                            i.f2260X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            i.this.f2290h.transportTerminated();
                            Thread.currentThread().setName(name);
                        }
                    } catch (Throwable th2) {
                        try {
                            this.f2317b.close();
                        } catch (IOException e9) {
                            i.f2260X.log(Level.INFO, "Exception closing frame reader", (Throwable) e9);
                        }
                        i.this.f2290h.transportTerminated();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (i.this.f2293k) {
                j0WithDescription = i.this.f2304v;
            }
            if (j0WithDescription == null) {
                j0WithDescription = io.grpc.J0.UNAVAILABLE.withDescription("End of stream or IOException");
            }
            i.this.a0(0, K6.a.INTERNAL_ERROR, j0WithDescription);
            try {
                this.f2317b.close();
            } catch (IOException e10) {
                e = e10;
                i.f2260X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                i.this.f2290h.transportTerminated();
                Thread.currentThread().setName(name);
            }
            i.this.f2290h.transportTerminated();
            Thread.currentThread().setName(name);
        }

        @Override // K6.b.a
        public void settings(boolean z8, K6.i iVar) {
            boolean zInitialOutboundWindowSize;
            this.f2316a.i(j.a.INBOUND, iVar);
            synchronized (i.this.f2293k) {
                try {
                    if (m.isSet(iVar, 4)) {
                        i.this.f2265E = m.get(iVar, 4);
                    }
                    if (m.isSet(iVar, 7)) {
                        zInitialOutboundWindowSize = i.this.f2292j.initialOutboundWindowSize(m.get(iVar, 7));
                    } else {
                        zInitialOutboundWindowSize = false;
                    }
                    if (this.f2318c) {
                        i.this.f2290h.transportReady();
                        this.f2318c = false;
                    }
                    i.this.f2291i.ackSettings(iVar);
                    if (zInitialOutboundWindowSize) {
                        i.this.f2292j.writeStreams();
                    }
                    i.this.b0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        @Override // K6.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void windowUpdate(int r8, long r9) {
            /*
                r7 = this;
                I6.j r0 = r7.f2316a
                I6.j$a r1 = I6.j.a.INBOUND
                r0.k(r1, r8, r9)
                r0 = 0
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 != 0) goto L2c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L19
                I6.i r8 = I6.i.this
                K6.a r10 = K6.a.PROTOCOL_ERROR
                I6.i.s(r8, r10, r9)
                goto L2b
            L19:
                I6.i r0 = I6.i.this
                io.grpc.J0 r10 = io.grpc.J0.INTERNAL
                io.grpc.J0 r2 = r10.withDescription(r9)
                io.grpc.internal.t$a r3 = io.grpc.internal.InterfaceC5774t.a.PROCESSED
                K6.a r5 = K6.a.PROTOCOL_ERROR
                r6 = 0
                r4 = 0
                r1 = r8
                r0.M(r1, r2, r3, r4, r5, r6)
            L2b:
                return
            L2c:
                I6.i r0 = I6.i.this
                java.lang.Object r0 = I6.i.b(r0)
                monitor-enter(r0)
                if (r8 != 0) goto L44
                I6.i r8 = I6.i.this     // Catch: java.lang.Throwable -> L42
                I6.q r8 = I6.i.o(r8)     // Catch: java.lang.Throwable -> L42
                r1 = 0
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L42
                r8.windowUpdate(r1, r9)     // Catch: java.lang.Throwable -> L42
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                return
            L42:
                r8 = move-exception
                goto L90
            L44:
                I6.i r1 = I6.i.this     // Catch: java.lang.Throwable -> L42
                java.util.Map r1 = I6.i.x(r1)     // Catch: java.lang.Throwable -> L42
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L42
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
                I6.h r1 = (I6.h) r1     // Catch: java.lang.Throwable -> L42
                if (r1 == 0) goto L69
                I6.i r2 = I6.i.this     // Catch: java.lang.Throwable -> L42
                I6.q r2 = I6.i.o(r2)     // Catch: java.lang.Throwable -> L42
                I6.h$b r1 = r1.d()     // Catch: java.lang.Throwable -> L42
                I6.q$c r1 = r1.S()     // Catch: java.lang.Throwable -> L42
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L42
                r2.windowUpdate(r1, r9)     // Catch: java.lang.Throwable -> L42
                goto L73
            L69:
                I6.i r9 = I6.i.this     // Catch: java.lang.Throwable -> L42
                boolean r9 = r9.T(r8)     // Catch: java.lang.Throwable -> L42
                if (r9 != 0) goto L73
                r9 = 1
                goto L74
            L73:
                r9 = 0
            L74:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                if (r9 == 0) goto L8f
                I6.i r9 = I6.i.this
                K6.a r10 = K6.a.PROTOCOL_ERROR
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received window_update for unknown stream: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                I6.i.s(r9, r10, r8)
            L8f:
                return
            L90:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: I6.i.e.windowUpdate(int, long):void");
        }

        @Override // K6.b.a
        public void ackSettings() {
        }

        @Override // K6.b.a
        public void priority(int i8, int i9, int i10, boolean z8) {
        }

        @Override // K6.b.a
        public void alternateService(int i8, String str, P7.f fVar, String str2, int i9, long j8) {
        }
    }
}
