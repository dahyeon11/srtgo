package F7;

import C7.H;
import C7.InterfaceC0472f;
import C7.J;
import C7.K;
import C7.u;
import C7.z;
import N7.b;
import P7.n;
import P7.v;
import P7.w;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    final k f1272a;

    /* renamed from: b */
    final InterfaceC0472f f1273b;

    /* renamed from: c */
    final u f1274c;

    /* renamed from: d */
    final d f1275d;

    /* renamed from: e */
    final G7.c f1276e;

    /* renamed from: f */
    private boolean f1277f;

    private final class a extends P7.g {

        /* renamed from: b */
        private boolean f1278b;

        /* renamed from: c */
        private long f1279c;

        /* renamed from: d */
        private long f1280d;

        /* renamed from: e */
        private boolean f1281e;

        a(v vVar, long j8) {
            super(vVar);
            this.f1279c = j8;
        }

        private IOException a(IOException iOException) {
            if (this.f1278b) {
                return iOException;
            }
            this.f1278b = true;
            return c.this.a(this.f1280d, false, true, iOException);
        }

        @Override // P7.g, P7.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f1281e) {
                return;
            }
            this.f1281e = true;
            long j8 = this.f1279c;
            if (j8 != -1 && this.f1280d != j8) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e8) {
                throw a(e8);
            }
        }

        @Override // P7.g, P7.v, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e8) {
                throw a(e8);
            }
        }

        @Override // P7.g, P7.v
        public void write(P7.c cVar, long j8) throws IOException {
            if (this.f1281e) {
                throw new IllegalStateException("closed");
            }
            long j9 = this.f1279c;
            if (j9 == -1 || this.f1280d + j8 <= j9) {
                try {
                    super.write(cVar, j8);
                    this.f1280d += j8;
                    return;
                } catch (IOException e8) {
                    throw a(e8);
                }
            }
            throw new ProtocolException("expected " + this.f1279c + " bytes but received " + (this.f1280d + j8));
        }
    }

    final class b extends P7.h {

        /* renamed from: b */
        private final long f1283b;

        /* renamed from: c */
        private long f1284c;

        /* renamed from: d */
        private boolean f1285d;

        /* renamed from: e */
        private boolean f1286e;

        b(w wVar, long j8) {
            super(wVar);
            this.f1283b = j8;
            if (j8 == 0) {
                a(null);
            }
        }

        IOException a(IOException iOException) {
            if (this.f1285d) {
                return iOException;
            }
            this.f1285d = true;
            return c.this.a(this.f1284c, true, false, iOException);
        }

        @Override // P7.h, P7.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f1286e) {
                return;
            }
            this.f1286e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e8) {
                throw a(e8);
            }
        }

        @Override // P7.h, P7.w
        public long read(P7.c cVar, long j8) throws IOException {
            if (this.f1286e) {
                throw new IllegalStateException("closed");
            }
            try {
                long j9 = delegate().read(cVar, j8);
                if (j9 == -1) {
                    a(null);
                    return -1L;
                }
                long j10 = this.f1284c + j9;
                long j11 = this.f1283b;
                if (j11 != -1 && j10 > j11) {
                    throw new ProtocolException("expected " + this.f1283b + " bytes but received " + j10);
                }
                this.f1284c = j10;
                if (j10 == j11) {
                    a(null);
                }
                return j9;
            } catch (IOException e8) {
                throw a(e8);
            }
        }
    }

    public c(k kVar, InterfaceC0472f interfaceC0472f, u uVar, d dVar, G7.c cVar) {
        this.f1272a = kVar;
        this.f1273b = interfaceC0472f;
        this.f1274c = uVar;
        this.f1275d = dVar;
        this.f1276e = cVar;
    }

    IOException a(long j8, boolean z8, boolean z9, IOException iOException) {
        if (iOException != null) {
            b(iOException);
        }
        if (z9) {
            if (iOException != null) {
                this.f1274c.requestFailed(this.f1273b, iOException);
            } else {
                this.f1274c.requestBodyEnd(this.f1273b, j8);
            }
        }
        if (z8) {
            if (iOException != null) {
                this.f1274c.responseFailed(this.f1273b, iOException);
            } else {
                this.f1274c.responseBodyEnd(this.f1273b, j8);
            }
        }
        return this.f1272a.c(this, z9, z8, iOException);
    }

    void b(IOException iOException) {
        this.f1275d.g();
        this.f1276e.connection().l(iOException);
    }

    public void cancel() {
        this.f1276e.cancel();
    }

    public e connection() {
        return this.f1276e.connection();
    }

    public v createRequestBody(H h8, boolean z8) {
        this.f1277f = z8;
        long jContentLength = h8.body().contentLength();
        this.f1274c.requestBodyStart(this.f1273b);
        return new a(this.f1276e.createRequestBody(h8, jContentLength), jContentLength);
    }

    public void detachWithViolence() {
        this.f1276e.cancel();
        this.f1272a.c(this, true, true, null);
    }

    public void finishRequest() throws IOException {
        try {
            this.f1276e.finishRequest();
        } catch (IOException e8) {
            this.f1274c.requestFailed(this.f1273b, e8);
            b(e8);
            throw e8;
        }
    }

    public void flushRequest() throws IOException {
        try {
            this.f1276e.flushRequest();
        } catch (IOException e8) {
            this.f1274c.requestFailed(this.f1273b, e8);
            b(e8);
            throw e8;
        }
    }

    public boolean isDuplex() {
        return this.f1277f;
    }

    public b.f newWebSocketStreams() {
        this.f1272a.timeoutEarlyExit();
        return this.f1276e.connection().i(this);
    }

    public void noNewExchangesOnConnection() {
        this.f1276e.connection().noNewExchanges();
    }

    public void noRequestBody() {
        this.f1272a.c(this, true, false, null);
    }

    public K openResponseBody(J j8) throws IOException {
        try {
            this.f1274c.responseBodyStart(this.f1273b);
            String strHeader = j8.header("Content-Type");
            long jReportedContentLength = this.f1276e.reportedContentLength(j8);
            return new G7.h(strHeader, jReportedContentLength, n.buffer(new b(this.f1276e.openResponseBodySource(j8), jReportedContentLength)));
        } catch (IOException e8) {
            this.f1274c.responseFailed(this.f1273b, e8);
            b(e8);
            throw e8;
        }
    }

    public J.a readResponseHeaders(boolean z8) throws IOException {
        try {
            J.a responseHeaders = this.f1276e.readResponseHeaders(z8);
            if (responseHeaders != null) {
                D7.a.instance.initExchange(responseHeaders, this);
            }
            return responseHeaders;
        } catch (IOException e8) {
            this.f1274c.responseFailed(this.f1273b, e8);
            b(e8);
            throw e8;
        }
    }

    public void responseHeadersEnd(J j8) {
        this.f1274c.responseHeadersEnd(this.f1273b, j8);
    }

    public void responseHeadersStart() {
        this.f1274c.responseHeadersStart(this.f1273b);
    }

    public void timeoutEarlyExit() {
        this.f1272a.timeoutEarlyExit();
    }

    public z trailers() {
        return this.f1276e.trailers();
    }

    public void webSocketUpgradeFailed() {
        a(-1L, true, true, null);
    }

    public void writeRequestHeaders(H h8) throws IOException {
        try {
            this.f1274c.requestHeadersStart(this.f1273b);
            this.f1276e.writeRequestHeaders(h8);
            this.f1274c.requestHeadersEnd(this.f1273b, h8);
        } catch (IOException e8) {
            this.f1274c.requestFailed(this.f1273b, e8);
            b(e8);
            throw e8;
        }
    }
}
