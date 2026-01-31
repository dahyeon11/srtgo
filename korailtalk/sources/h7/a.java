package H7;

import C7.A;
import C7.E;
import C7.H;
import C7.J;
import C7.z;
import G7.k;
import P7.i;
import P7.v;
import P7.w;
import P7.x;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a implements G7.c {

    /* renamed from: a */
    private final E f1873a;

    /* renamed from: b */
    private final F7.e f1874b;

    /* renamed from: c */
    private final P7.e f1875c;

    /* renamed from: d */
    private final P7.d f1876d;

    /* renamed from: e */
    private int f1877e = 0;

    /* renamed from: f */
    private long f1878f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* renamed from: g */
    private z f1879g;

    private final class c implements v {

        /* renamed from: a */
        private final i f1883a;

        /* renamed from: b */
        private boolean f1884b;

        c() {
            this.f1883a = new i(a.this.f1876d.timeout());
        }

        @Override // P7.v, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f1884b) {
                return;
            }
            this.f1884b = true;
            a.this.f1876d.writeUtf8("0\r\n\r\n");
            a.this.k(this.f1883a);
            a.this.f1877e = 3;
        }

        @Override // P7.v, java.io.Flushable
        public synchronized void flush() {
            if (this.f1884b) {
                return;
            }
            a.this.f1876d.flush();
        }

        @Override // P7.v
        public x timeout() {
            return this.f1883a;
        }

        @Override // P7.v
        public void write(P7.c cVar, long j8) {
            if (this.f1884b) {
                throw new IllegalStateException("closed");
            }
            if (j8 == 0) {
                return;
            }
            a.this.f1876d.writeHexadecimalUnsignedLong(j8);
            a.this.f1876d.writeUtf8("\r\n");
            a.this.f1876d.write(cVar, j8);
            a.this.f1876d.writeUtf8("\r\n");
        }
    }

    private class d extends b {

        /* renamed from: d */
        private final A f1886d;

        /* renamed from: e */
        private long f1887e;

        /* renamed from: f */
        private boolean f1888f;

        d(A a9) {
            super();
            this.f1887e = -1L;
            this.f1888f = true;
            this.f1886d = a9;
        }

        private void b() throws ProtocolException {
            if (this.f1887e != -1) {
                a.this.f1875c.readUtf8LineStrict();
            }
            try {
                this.f1887e = a.this.f1875c.readHexadecimalUnsignedLong();
                String strTrim = a.this.f1875c.readUtf8LineStrict().trim();
                if (this.f1887e < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f1887e + strTrim + "\"");
                }
                if (this.f1887e == 0) {
                    this.f1888f = false;
                    a aVar = a.this;
                    aVar.f1879g = aVar.r();
                    G7.e.receiveHeaders(a.this.f1873a.cookieJar(), this.f1886d, a.this.f1879g);
                    a();
                }
            } catch (NumberFormatException e8) {
                throw new ProtocolException(e8.getMessage());
            }
        }

        @Override // H7.a.b, P7.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f1881b) {
                return;
            }
            if (this.f1888f && !D7.e.discard(this, 100, TimeUnit.MILLISECONDS)) {
                a.this.f1874b.noNewExchanges();
                a();
            }
            this.f1881b = true;
        }

        @Override // H7.a.b, P7.w
        public long read(P7.c cVar, long j8) throws IOException {
            if (j8 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j8);
            }
            if (this.f1881b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f1888f) {
                return -1L;
            }
            long j9 = this.f1887e;
            if (j9 == 0 || j9 == -1) {
                b();
                if (!this.f1888f) {
                    return -1L;
                }
            }
            long j10 = super.read(cVar, Math.min(j8, this.f1887e));
            if (j10 != -1) {
                this.f1887e -= j10;
                return j10;
            }
            a.this.f1874b.noNewExchanges();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
    }

    private class e extends b {

        /* renamed from: d */
        private long f1890d;

        e(long j8) {
            super();
            this.f1890d = j8;
            if (j8 == 0) {
                a();
            }
        }

        @Override // H7.a.b, P7.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f1881b) {
                return;
            }
            if (this.f1890d != 0 && !D7.e.discard(this, 100, TimeUnit.MILLISECONDS)) {
                a.this.f1874b.noNewExchanges();
                a();
            }
            this.f1881b = true;
        }

        @Override // H7.a.b, P7.w
        public long read(P7.c cVar, long j8) throws IOException {
            if (j8 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j8);
            }
            if (this.f1881b) {
                throw new IllegalStateException("closed");
            }
            long j9 = this.f1890d;
            if (j9 == 0) {
                return -1L;
            }
            long j10 = super.read(cVar, Math.min(j9, j8));
            if (j10 == -1) {
                a.this.f1874b.noNewExchanges();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            long j11 = this.f1890d - j10;
            this.f1890d = j11;
            if (j11 == 0) {
                a();
            }
            return j10;
        }
    }

    private class g extends b {

        /* renamed from: d */
        private boolean f1895d;

        private g() {
            super();
        }

        @Override // H7.a.b, P7.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f1881b) {
                return;
            }
            if (!this.f1895d) {
                a();
            }
            this.f1881b = true;
        }

        @Override // H7.a.b, P7.w
        public long read(P7.c cVar, long j8) throws IOException {
            if (j8 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j8);
            }
            if (this.f1881b) {
                throw new IllegalStateException("closed");
            }
            if (this.f1895d) {
                return -1L;
            }
            long j9 = super.read(cVar, j8);
            if (j9 != -1) {
                return j9;
            }
            this.f1895d = true;
            a();
            return -1L;
        }

        /* synthetic */ g(a aVar, C0037a c0037a) {
            this();
        }
    }

    public a(E e8, F7.e eVar, P7.e eVar2, P7.d dVar) {
        this.f1873a = e8;
        this.f1874b = eVar;
        this.f1875c = eVar2;
        this.f1876d = dVar;
    }

    public void k(i iVar) {
        x xVarDelegate = iVar.delegate();
        iVar.setDelegate(x.NONE);
        xVarDelegate.clearDeadline();
        xVarDelegate.clearTimeout();
    }

    private v l() {
        if (this.f1877e == 1) {
            this.f1877e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f1877e);
    }

    private w m(A a9) {
        if (this.f1877e == 4) {
            this.f1877e = 5;
            return new d(a9);
        }
        throw new IllegalStateException("state: " + this.f1877e);
    }

    private w n(long j8) {
        if (this.f1877e == 4) {
            this.f1877e = 5;
            return new e(j8);
        }
        throw new IllegalStateException("state: " + this.f1877e);
    }

    private v o() {
        if (this.f1877e == 1) {
            this.f1877e = 2;
            return new f();
        }
        throw new IllegalStateException("state: " + this.f1877e);
    }

    private w p() {
        if (this.f1877e == 4) {
            this.f1877e = 5;
            this.f1874b.noNewExchanges();
            return new g();
        }
        throw new IllegalStateException("state: " + this.f1877e);
    }

    private String q() {
        String utf8LineStrict = this.f1875c.readUtf8LineStrict(this.f1878f);
        this.f1878f -= utf8LineStrict.length();
        return utf8LineStrict;
    }

    public z r() {
        z.a aVar = new z.a();
        while (true) {
            String strQ = q();
            if (strQ.length() == 0) {
                return aVar.build();
            }
            D7.a.instance.addLenient(aVar, strQ);
        }
    }

    @Override // G7.c
    public void cancel() {
        F7.e eVar = this.f1874b;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // G7.c
    public F7.e connection() {
        return this.f1874b;
    }

    @Override // G7.c
    public v createRequestBody(H h8, long j8) throws ProtocolException {
        if (h8.body() != null && h8.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(h8.header("Transfer-Encoding"))) {
            return l();
        }
        if (j8 != -1) {
            return o();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // G7.c
    public void finishRequest() {
        this.f1876d.flush();
    }

    @Override // G7.c
    public void flushRequest() {
        this.f1876d.flush();
    }

    public boolean isClosed() {
        return this.f1877e == 6;
    }

    @Override // G7.c
    public w openResponseBodySource(J j8) {
        if (!G7.e.hasBody(j8)) {
            return n(0L);
        }
        if ("chunked".equalsIgnoreCase(j8.header("Transfer-Encoding"))) {
            return m(j8.request().url());
        }
        long jContentLength = G7.e.contentLength(j8);
        return jContentLength != -1 ? n(jContentLength) : p();
    }

    @Override // G7.c
    public J.a readResponseHeaders(boolean z8) throws NumberFormatException, IOException {
        int i8 = this.f1877e;
        if (i8 != 1 && i8 != 3) {
            throw new IllegalStateException("state: " + this.f1877e);
        }
        try {
            k kVar = k.parse(q());
            J.a aVarHeaders = new J.a().protocol(kVar.protocol).code(kVar.code).message(kVar.message).headers(r());
            if (z8 && kVar.code == 100) {
                return null;
            }
            if (kVar.code == 100) {
                this.f1877e = 3;
                return aVarHeaders;
            }
            this.f1877e = 4;
            return aVarHeaders;
        } catch (EOFException e8) {
            F7.e eVar = this.f1874b;
            throw new IOException("unexpected end of stream on " + (eVar != null ? eVar.route().address().url().redact() : "unknown"), e8);
        }
    }

    @Override // G7.c
    public long reportedContentLength(J j8) {
        if (!G7.e.hasBody(j8)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(j8.header("Transfer-Encoding"))) {
            return -1L;
        }
        return G7.e.contentLength(j8);
    }

    public void skipConnectBody(J j8) {
        long jContentLength = G7.e.contentLength(j8);
        if (jContentLength == -1) {
            return;
        }
        w wVarN = n(jContentLength);
        D7.e.skipAll(wVarN, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        wVarN.close();
    }

    @Override // G7.c
    public z trailers() {
        if (this.f1877e != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        z zVar = this.f1879g;
        return zVar != null ? zVar : D7.e.EMPTY_HEADERS;
    }

    public void writeRequest(z zVar, String str) {
        if (this.f1877e != 0) {
            throw new IllegalStateException("state: " + this.f1877e);
        }
        this.f1876d.writeUtf8(str).writeUtf8("\r\n");
        int size = zVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f1876d.writeUtf8(zVar.name(i8)).writeUtf8(": ").writeUtf8(zVar.value(i8)).writeUtf8("\r\n");
        }
        this.f1876d.writeUtf8("\r\n");
        this.f1877e = 1;
    }

    @Override // G7.c
    public void writeRequestHeaders(H h8) {
        writeRequest(h8.headers(), G7.i.get(h8, this.f1874b.route().proxy().type()));
    }

    private abstract class b implements w {

        /* renamed from: a */
        protected final i f1880a;

        /* renamed from: b */
        protected boolean f1881b;

        private b() {
            this.f1880a = new i(a.this.f1875c.timeout());
        }

        final void a() {
            if (a.this.f1877e == 6) {
                return;
            }
            if (a.this.f1877e == 5) {
                a.this.k(this.f1880a);
                a.this.f1877e = 6;
            } else {
                throw new IllegalStateException("state: " + a.this.f1877e);
            }
        }

        @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        @Override // P7.w
        public long read(P7.c cVar, long j8) throws IOException {
            try {
                return a.this.f1875c.read(cVar, j8);
            } catch (IOException e8) {
                a.this.f1874b.noNewExchanges();
                a();
                throw e8;
            }
        }

        @Override // P7.w
        public x timeout() {
            return this.f1880a;
        }

        /* synthetic */ b(a aVar, C0037a c0037a) {
            this();
        }
    }

    private final class f implements v {

        /* renamed from: a */
        private final i f1892a;

        /* renamed from: b */
        private boolean f1893b;

        private f() {
            this.f1892a = new i(a.this.f1876d.timeout());
        }

        @Override // P7.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f1893b) {
                return;
            }
            this.f1893b = true;
            a.this.k(this.f1892a);
            a.this.f1877e = 3;
        }

        @Override // P7.v, java.io.Flushable
        public void flush() {
            if (this.f1893b) {
                return;
            }
            a.this.f1876d.flush();
        }

        @Override // P7.v
        public x timeout() {
            return this.f1892a;
        }

        @Override // P7.v
        public void write(P7.c cVar, long j8) {
            if (this.f1893b) {
                throw new IllegalStateException("closed");
            }
            D7.e.checkOffsetAndCount(cVar.size(), 0L, j8);
            a.this.f1876d.write(cVar, j8);
        }

        /* synthetic */ f(a aVar, C0037a c0037a) {
            this();
        }
    }
}
