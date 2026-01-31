package N7;

import C7.E;
import C7.F;
import C7.H;
import C7.InterfaceC0472f;
import C7.InterfaceC0473g;
import C7.J;
import C7.N;
import C7.O;
import C7.u;
import N7.d;
import P7.n;
import Q7.X;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class b implements N, d.a {

    /* renamed from: x */
    private static final List f3279x = Collections.singletonList(F.HTTP_1_1);

    /* renamed from: a */
    private final H f3280a;

    /* renamed from: b */
    final O f3281b;

    /* renamed from: c */
    private final Random f3282c;

    /* renamed from: d */
    private final long f3283d;

    /* renamed from: e */
    private final String f3284e;

    /* renamed from: f */
    private InterfaceC0472f f3285f;

    /* renamed from: g */
    private final Runnable f3286g;

    /* renamed from: h */
    private N7.d f3287h;

    /* renamed from: i */
    private N7.e f3288i;

    /* renamed from: j */
    private ScheduledExecutorService f3289j;

    /* renamed from: k */
    private f f3290k;

    /* renamed from: n */
    private long f3293n;

    /* renamed from: o */
    private boolean f3294o;

    /* renamed from: p */
    private ScheduledFuture f3295p;

    /* renamed from: r */
    private String f3297r;

    /* renamed from: s */
    private boolean f3298s;

    /* renamed from: t */
    private int f3299t;

    /* renamed from: u */
    private int f3300u;

    /* renamed from: v */
    private int f3301v;

    /* renamed from: w */
    private boolean f3302w;

    /* renamed from: l */
    private final ArrayDeque f3291l = new ArrayDeque();

    /* renamed from: m */
    private final ArrayDeque f3292m = new ArrayDeque();

    /* renamed from: q */
    private int f3296q = -1;

    class a implements InterfaceC0473g {

        /* renamed from: a */
        final /* synthetic */ H f3303a;

        a(H h8) {
            this.f3303a = h8;
        }

        @Override // C7.InterfaceC0473g
        public void onFailure(InterfaceC0472f interfaceC0472f, IOException iOException) throws IOException {
            b.this.failWebSocket(iOException, null);
        }

        @Override // C7.InterfaceC0473g
        public void onResponse(InterfaceC0472f interfaceC0472f, J j8) throws IOException {
            F7.c cVarExchange = D7.a.instance.exchange(j8);
            try {
                b.this.b(j8, cVarExchange);
                try {
                    b.this.initReaderAndWriter("OkHttp WebSocket " + this.f3303a.url().redact(), cVarExchange.newWebSocketStreams());
                    b bVar = b.this;
                    bVar.f3281b.onOpen(bVar, j8);
                    b.this.loopReader();
                } catch (Exception e8) {
                    b.this.failWebSocket(e8, null);
                }
            } catch (IOException e9) {
                if (cVarExchange != null) {
                    cVarExchange.webSocketUpgradeFailed();
                }
                b.this.failWebSocket(e9, j8);
                D7.e.closeQuietly(j8);
            }
        }
    }

    /* renamed from: N7.b$b */
    final class RunnableC0056b implements Runnable {
        RunnableC0056b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.cancel();
        }
    }

    static final class c {

        /* renamed from: a */
        final int f3306a;

        /* renamed from: b */
        final P7.f f3307b;

        /* renamed from: c */
        final long f3308c;

        c(int i8, P7.f fVar, long j8) {
            this.f3306a = i8;
            this.f3307b = fVar;
            this.f3308c = j8;
        }
    }

    static final class d {

        /* renamed from: a */
        final int f3309a;

        /* renamed from: b */
        final P7.f f3310b;

        d(int i8, P7.f fVar) {
            this.f3309a = i8;
            this.f3310b = fVar;
        }
    }

    private final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            b.this.h();
        }
    }

    public static abstract class f implements Closeable {
        public final boolean client;
        public final P7.d sink;
        public final P7.e source;

        public f(boolean z8, P7.e eVar, P7.d dVar) {
            this.client = z8;
            this.source = eVar;
            this.sink = dVar;
        }
    }

    public b(H h8, O o8, Random random, long j8) {
        if (!"GET".equals(h8.method())) {
            throw new IllegalArgumentException("Request must be GET: " + h8.method());
        }
        this.f3280a = h8;
        this.f3281b = o8;
        this.f3282c = random;
        this.f3283d = j8;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f3284e = P7.f.of(bArr).base64();
        this.f3286g = new Runnable() { // from class: N7.a
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                this.f3278a.d();
            }
        };
    }

    public /* synthetic */ void d() throws IOException {
        do {
            try {
            } catch (IOException e8) {
                failWebSocket(e8, null);
                return;
            }
        } while (g());
    }

    private void e() {
        ScheduledExecutorService scheduledExecutorService = this.f3289j;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f3286g);
        }
    }

    private synchronized boolean f(P7.f fVar, int i8) {
        if (!this.f3298s && !this.f3294o) {
            if (this.f3293n + fVar.size() > 16777216) {
                close(1001, null);
                return false;
            }
            this.f3293n += fVar.size();
            this.f3292m.add(new d(i8, fVar));
            e();
            return true;
        }
        return false;
    }

    void b(J j8, F7.c cVar) throws ProtocolException {
        if (j8.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + j8.code() + X.SPACE + j8.message() + "'");
        }
        String strHeader = j8.header("Connection");
        if (!"Upgrade".equalsIgnoreCase(strHeader)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strHeader + "'");
        }
        String strHeader2 = j8.header("Upgrade");
        if (!"websocket".equalsIgnoreCase(strHeader2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strHeader2 + "'");
        }
        String strHeader3 = j8.header("Sec-WebSocket-Accept");
        String strBase64 = P7.f.encodeUtf8(this.f3284e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if (strBase64.equals(strHeader3)) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + "' but was '" + strHeader3 + "'");
    }

    synchronized boolean c(int i8, String str, long j8) {
        P7.f fVarEncodeUtf8;
        try {
            N7.c.c(i8);
            if (str != null) {
                fVarEncodeUtf8 = P7.f.encodeUtf8(str);
                if (fVarEncodeUtf8.size() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: " + str);
                }
            } else {
                fVarEncodeUtf8 = null;
            }
            if (!this.f3298s && !this.f3294o) {
                this.f3294o = true;
                this.f3292m.add(new c(i8, fVarEncodeUtf8, j8));
                e();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // C7.N
    public void cancel() {
        this.f3285f.cancel();
    }

    @Override // C7.N
    public boolean close(int i8, String str) {
        return c(i8, str, 60000L);
    }

    public void connect(E e8) {
        E eBuild = e8.newBuilder().eventListener(u.NONE).protocols(f3279x).build();
        H hBuild = this.f3280a.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.f3284e).header("Sec-WebSocket-Version", "13").build();
        InterfaceC0472f interfaceC0472fNewWebSocketCall = D7.a.instance.newWebSocketCall(eBuild, hBuild);
        this.f3285f = interfaceC0472fNewWebSocketCall;
        interfaceC0472fNewWebSocketCall.enqueue(new a(hBuild));
    }

    public void failWebSocket(Exception exc, J j8) throws IOException {
        synchronized (this) {
            try {
                if (this.f3298s) {
                    return;
                }
                this.f3298s = true;
                f fVar = this.f3290k;
                this.f3290k = null;
                ScheduledFuture scheduledFuture = this.f3295p;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f3289j;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    this.f3281b.onFailure(this, exc, j8);
                } finally {
                    D7.e.closeQuietly(fVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6 */
    boolean g() throws IOException {
        String str;
        int i8;
        f fVar;
        synchronized (this) {
            try {
                if (this.f3298s) {
                    return false;
                }
                N7.e eVar = this.f3288i;
                P7.f fVar2 = (P7.f) this.f3291l.poll();
                d dVar = 0;
                if (fVar2 == null) {
                    Object objPoll = this.f3292m.poll();
                    if (objPoll instanceof c) {
                        i8 = this.f3296q;
                        str = this.f3297r;
                        if (i8 != -1) {
                            fVar = this.f3290k;
                            this.f3290k = null;
                            this.f3289j.shutdown();
                        } else {
                            this.f3295p = this.f3289j.schedule(new RunnableC0056b(), ((c) objPoll).f3308c, TimeUnit.MILLISECONDS);
                            fVar = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        i8 = -1;
                        fVar = null;
                    }
                    dVar = objPoll;
                } else {
                    str = null;
                    i8 = -1;
                    fVar = null;
                }
                try {
                    if (fVar2 != null) {
                        eVar.f(fVar2);
                    } else if (dVar instanceof d) {
                        P7.f fVar3 = dVar.f3310b;
                        P7.d dVarBuffer = n.buffer(eVar.a(dVar.f3309a, fVar3.size()));
                        dVarBuffer.write(fVar3);
                        dVarBuffer.close();
                        synchronized (this) {
                            this.f3293n -= fVar3.size();
                        }
                    } else {
                        if (!(dVar instanceof c)) {
                            throw new AssertionError();
                        }
                        c cVar = (c) dVar;
                        eVar.b(cVar.f3306a, cVar.f3307b);
                        if (fVar != null) {
                            this.f3281b.onClosed(this, i8, str);
                        }
                    }
                    D7.e.closeQuietly(fVar);
                    return true;
                } catch (Throwable th) {
                    D7.e.closeQuietly(fVar);
                    throw th;
                }
            } finally {
            }
        }
    }

    void h() throws IOException {
        synchronized (this) {
            try {
                if (this.f3298s) {
                    return;
                }
                N7.e eVar = this.f3288i;
                int i8 = this.f3302w ? this.f3299t : -1;
                this.f3299t++;
                this.f3302w = true;
                if (i8 == -1) {
                    try {
                        eVar.e(P7.f.EMPTY);
                        return;
                    } catch (IOException e8) {
                        failWebSocket(e8, null);
                        return;
                    }
                }
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f3283d + "ms (after " + (i8 - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void initReaderAndWriter(String str, f fVar) {
        synchronized (this) {
            try {
                this.f3290k = fVar;
                this.f3288i = new N7.e(fVar.client, fVar.sink, this.f3282c);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, D7.e.threadFactory(str, false));
                this.f3289j = scheduledThreadPoolExecutor;
                if (this.f3283d != 0) {
                    e eVar = new e();
                    long j8 = this.f3283d;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(eVar, j8, j8, TimeUnit.MILLISECONDS);
                }
                if (!this.f3292m.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3287h = new N7.d(fVar.client, fVar.source, this);
    }

    public void loopReader() throws IOException {
        while (this.f3296q == -1) {
            this.f3287h.a();
        }
    }

    @Override // N7.d.a
    public void onReadClose(int i8, String str) throws IOException {
        f fVar;
        if (i8 == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            try {
                if (this.f3296q != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f3296q = i8;
                this.f3297r = str;
                fVar = null;
                if (this.f3294o && this.f3292m.isEmpty()) {
                    f fVar2 = this.f3290k;
                    this.f3290k = null;
                    ScheduledFuture scheduledFuture = this.f3295p;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f3289j.shutdown();
                    fVar = fVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f3281b.onClosing(this, i8, str);
            if (fVar != null) {
                this.f3281b.onClosed(this, i8, str);
            }
        } finally {
            D7.e.closeQuietly(fVar);
        }
    }

    @Override // N7.d.a
    public void onReadMessage(String str) {
        this.f3281b.onMessage(this, str);
    }

    @Override // N7.d.a
    public synchronized void onReadPing(P7.f fVar) {
        try {
            if (!this.f3298s && (!this.f3294o || !this.f3292m.isEmpty())) {
                this.f3291l.add(fVar);
                e();
                this.f3300u++;
            }
        } finally {
        }
    }

    @Override // N7.d.a
    public synchronized void onReadPong(P7.f fVar) {
        this.f3301v++;
        this.f3302w = false;
    }

    @Override // C7.N
    public synchronized long queueSize() {
        return this.f3293n;
    }

    @Override // C7.N
    public H request() {
        return this.f3280a;
    }

    @Override // C7.N
    public boolean send(String str) {
        if (str != null) {
            return f(P7.f.encodeUtf8(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    @Override // N7.d.a
    public void onReadMessage(P7.f fVar) {
        this.f3281b.onMessage(this, fVar);
    }

    @Override // C7.N
    public boolean send(P7.f fVar) {
        if (fVar != null) {
            return f(fVar, 2);
        }
        throw new NullPointerException("bytes == null");
    }
}
