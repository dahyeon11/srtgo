package C7;

import C7.H;
import C7.J;
import C7.z;
import E7.d;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: C7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0470d implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    final E7.f f601a;

    /* renamed from: b, reason: collision with root package name */
    final E7.d f602b;

    /* renamed from: c, reason: collision with root package name */
    int f603c;

    /* renamed from: d, reason: collision with root package name */
    int f604d;

    /* renamed from: e, reason: collision with root package name */
    private int f605e;

    /* renamed from: f, reason: collision with root package name */
    private int f606f;

    /* renamed from: g, reason: collision with root package name */
    private int f607g;

    /* renamed from: C7.d$a */
    class a implements E7.f {
        a() {
        }

        @Override // E7.f
        public J get(H h8) {
            return C0470d.this.b(h8);
        }

        @Override // E7.f
        public E7.b put(J j8) {
            return C0470d.this.c(j8);
        }

        @Override // E7.f
        public void remove(H h8) {
            C0470d.this.e(h8);
        }

        @Override // E7.f
        public void trackConditionalCacheHit() {
            C0470d.this.f();
        }

        @Override // E7.f
        public void trackResponse(E7.c cVar) {
            C0470d.this.g(cVar);
        }

        @Override // E7.f
        public void update(J j8, J j9) {
            C0470d.this.h(j8, j9);
        }
    }

    /* renamed from: C7.d$b */
    class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final Iterator f609a;

        /* renamed from: b, reason: collision with root package name */
        String f610b;

        /* renamed from: c, reason: collision with root package name */
        boolean f611c;

        b() {
            this.f609a = C0470d.this.f602b.snapshots();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f610b != null) {
                return true;
            }
            this.f611c = false;
            while (this.f609a.hasNext()) {
                try {
                    d.f fVar = (d.f) this.f609a.next();
                    try {
                        continue;
                        this.f610b = P7.n.buffer(fVar.getSource(0)).readUtf8LineStrict();
                        fVar.close();
                        return true;
                    } finally {
                        try {
                            continue;
                        } finally {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f611c) {
                throw new IllegalStateException("remove() before next()");
            }
            this.f609a.remove();
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f610b;
            this.f610b = null;
            this.f611c = true;
            return str;
        }
    }

    /* renamed from: C7.d$c */
    private final class c implements E7.b {

        /* renamed from: a, reason: collision with root package name */
        private final d.C0027d f613a;

        /* renamed from: b, reason: collision with root package name */
        private P7.v f614b;

        /* renamed from: c, reason: collision with root package name */
        private P7.v f615c;

        /* renamed from: d, reason: collision with root package name */
        boolean f616d;

        /* renamed from: C7.d$c$a */
        class a extends P7.g {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0470d f618b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d.C0027d f619c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(P7.v vVar, C0470d c0470d, d.C0027d c0027d) {
                super(vVar);
                this.f618b = c0470d;
                this.f619c = c0027d;
            }

            @Override // P7.g, P7.v, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (C0470d.this) {
                    try {
                        c cVar = c.this;
                        if (cVar.f616d) {
                            return;
                        }
                        cVar.f616d = true;
                        C0470d.this.f603c++;
                        super.close();
                        this.f619c.commit();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        c(d.C0027d c0027d) {
            this.f613a = c0027d;
            P7.v vVarNewSink = c0027d.newSink(1);
            this.f614b = vVarNewSink;
            this.f615c = new a(vVarNewSink, C0470d.this, c0027d);
        }

        @Override // E7.b
        public void abort() throws IOException {
            synchronized (C0470d.this) {
                try {
                    if (this.f616d) {
                        return;
                    }
                    this.f616d = true;
                    C0470d.this.f604d++;
                    D7.e.closeQuietly(this.f614b);
                    try {
                        this.f613a.abort();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // E7.b
        public P7.v body() {
            return this.f615c;
        }
    }

    /* renamed from: C7.d$d, reason: collision with other inner class name */
    private static class C0013d extends K {

        /* renamed from: b, reason: collision with root package name */
        final d.f f621b;

        /* renamed from: c, reason: collision with root package name */
        private final P7.e f622c;

        /* renamed from: d, reason: collision with root package name */
        private final String f623d;

        /* renamed from: e, reason: collision with root package name */
        private final String f624e;

        /* renamed from: C7.d$d$a */
        class a extends P7.h {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.f f625b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(P7.w wVar, d.f fVar) {
                super(wVar);
                this.f625b = fVar;
            }

            @Override // P7.h, P7.w, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f625b.close();
                super.close();
            }
        }

        C0013d(d.f fVar, String str, String str2) {
            this.f621b = fVar;
            this.f623d = str;
            this.f624e = str2;
            this.f622c = P7.n.buffer(new a(fVar.getSource(1), fVar));
        }

        @Override // C7.K
        public long contentLength() {
            try {
                String str = this.f624e;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // C7.K
        public C contentType() {
            String str = this.f623d;
            if (str != null) {
                return C.parse(str);
            }
            return null;
        }

        @Override // C7.K
        public P7.e source() {
            return this.f622c;
        }
    }

    public C0470d(File file, long j8) {
        this(file, j8, J7.a.SYSTEM);
    }

    private void a(d.C0027d c0027d) {
        if (c0027d != null) {
            try {
                c0027d.abort();
            } catch (IOException unused) {
            }
        }
    }

    static int d(P7.e eVar) throws IOException {
        try {
            long decimalLong = eVar.readDecimalLong();
            String utf8LineStrict = eVar.readUtf8LineStrict();
            if (decimalLong >= 0 && decimalLong <= 2147483647L && utf8LineStrict.isEmpty()) {
                return (int) decimalLong;
            }
            throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + "\"");
        } catch (NumberFormatException e8) {
            throw new IOException(e8.getMessage());
        }
    }

    public static String key(A a9) {
        return P7.f.encodeUtf8(a9.toString()).md5().hex();
    }

    J b(H h8) throws IOException {
        try {
            d.f fVar = this.f602b.get(key(h8.url()));
            if (fVar == null) {
                return null;
            }
            try {
                e eVar = new e(fVar.getSource(0));
                J jResponse = eVar.response(fVar);
                if (eVar.matches(h8, jResponse)) {
                    return jResponse;
                }
                D7.e.closeQuietly(jResponse.body());
                return null;
            } catch (IOException unused) {
                D7.e.closeQuietly(fVar);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    E7.b c(J j8) {
        d.C0027d c0027dEdit;
        String strMethod = j8.request().method();
        if (G7.f.invalidatesCache(j8.request().method())) {
            try {
                e(j8.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!strMethod.equals("GET") || G7.e.hasVaryAll(j8)) {
            return null;
        }
        e eVar = new e(j8);
        try {
            c0027dEdit = this.f602b.edit(key(j8.request().url()));
            if (c0027dEdit == null) {
                return null;
            }
            try {
                eVar.writeTo(c0027dEdit);
                return new c(c0027dEdit);
            } catch (IOException unused2) {
                a(c0027dEdit);
                return null;
            }
        } catch (IOException unused3) {
            c0027dEdit = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f602b.close();
    }

    public void delete() {
        this.f602b.delete();
    }

    public File directory() {
        return this.f602b.getDirectory();
    }

    void e(H h8) {
        this.f602b.remove(key(h8.url()));
    }

    public void evictAll() {
        this.f602b.evictAll();
    }

    synchronized void f() {
        this.f606f++;
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f602b.flush();
    }

    synchronized void g(E7.c cVar) {
        try {
            this.f607g++;
            if (cVar.networkRequest != null) {
                this.f605e++;
            } else if (cVar.cacheResponse != null) {
                this.f606f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void h(J j8, J j9) {
        d.C0027d c0027dEdit;
        e eVar = new e(j9);
        try {
            c0027dEdit = ((C0013d) j8.body()).f621b.edit();
            if (c0027dEdit != null) {
                try {
                    eVar.writeTo(c0027dEdit);
                    c0027dEdit.commit();
                } catch (IOException unused) {
                    a(c0027dEdit);
                }
            }
        } catch (IOException unused2) {
            c0027dEdit = null;
        }
    }

    public synchronized int hitCount() {
        return this.f606f;
    }

    public void initialize() {
        this.f602b.initialize();
    }

    public boolean isClosed() {
        return this.f602b.isClosed();
    }

    public long maxSize() {
        return this.f602b.getMaxSize();
    }

    public synchronized int networkCount() {
        return this.f605e;
    }

    public synchronized int requestCount() {
        return this.f607g;
    }

    public long size() {
        return this.f602b.size();
    }

    public Iterator<String> urls() {
        return new b();
    }

    public synchronized int writeAbortCount() {
        return this.f604d;
    }

    public synchronized int writeSuccessCount() {
        return this.f603c;
    }

    C0470d(File file, long j8, J7.a aVar) {
        this.f601a = new a();
        this.f602b = E7.d.create(aVar, file, 201105, 2, j8);
    }

    /* renamed from: C7.d$e */
    private static final class e {

        /* renamed from: k, reason: collision with root package name */
        private static final String f627k = K7.j.get().getPrefix() + "-Sent-Millis";

        /* renamed from: l, reason: collision with root package name */
        private static final String f628l = K7.j.get().getPrefix() + "-Received-Millis";

        /* renamed from: a, reason: collision with root package name */
        private final String f629a;

        /* renamed from: b, reason: collision with root package name */
        private final z f630b;

        /* renamed from: c, reason: collision with root package name */
        private final String f631c;

        /* renamed from: d, reason: collision with root package name */
        private final F f632d;

        /* renamed from: e, reason: collision with root package name */
        private final int f633e;

        /* renamed from: f, reason: collision with root package name */
        private final String f634f;

        /* renamed from: g, reason: collision with root package name */
        private final z f635g;

        /* renamed from: h, reason: collision with root package name */
        private final w f636h;

        /* renamed from: i, reason: collision with root package name */
        private final long f637i;

        /* renamed from: j, reason: collision with root package name */
        private final long f638j;

        e(P7.w wVar) {
            try {
                P7.e eVarBuffer = P7.n.buffer(wVar);
                this.f629a = eVarBuffer.readUtf8LineStrict();
                this.f631c = eVarBuffer.readUtf8LineStrict();
                z.a aVar = new z.a();
                int iD = C0470d.d(eVarBuffer);
                for (int i8 = 0; i8 < iD; i8++) {
                    aVar.a(eVarBuffer.readUtf8LineStrict());
                }
                this.f630b = aVar.build();
                G7.k kVar = G7.k.parse(eVarBuffer.readUtf8LineStrict());
                this.f632d = kVar.protocol;
                this.f633e = kVar.code;
                this.f634f = kVar.message;
                z.a aVar2 = new z.a();
                int iD2 = C0470d.d(eVarBuffer);
                for (int i9 = 0; i9 < iD2; i9++) {
                    aVar2.a(eVarBuffer.readUtf8LineStrict());
                }
                String str = f627k;
                String str2 = aVar2.get(str);
                String str3 = f628l;
                String str4 = aVar2.get(str3);
                aVar2.removeAll(str);
                aVar2.removeAll(str3);
                this.f637i = str2 != null ? Long.parseLong(str2) : 0L;
                this.f638j = str4 != null ? Long.parseLong(str4) : 0L;
                this.f635g = aVar2.build();
                if (a()) {
                    String utf8LineStrict = eVarBuffer.readUtf8LineStrict();
                    if (utf8LineStrict.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict + "\"");
                    }
                    this.f636h = w.get(!eVarBuffer.exhausted() ? M.forJavaName(eVarBuffer.readUtf8LineStrict()) : M.SSL_3_0, C0477k.forJavaName(eVarBuffer.readUtf8LineStrict()), b(eVarBuffer), b(eVarBuffer));
                } else {
                    this.f636h = null;
                }
                wVar.close();
            } catch (Throwable th) {
                wVar.close();
                throw th;
            }
        }

        private boolean a() {
            return this.f629a.startsWith(r4.g.SECURE_PROTOCOL);
        }

        private List b(P7.e eVar) throws IOException, CertificateException {
            int iD = C0470d.d(eVar);
            if (iD == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iD);
                for (int i8 = 0; i8 < iD; i8++) {
                    String utf8LineStrict = eVar.readUtf8LineStrict();
                    P7.c cVar = new P7.c();
                    cVar.write(P7.f.decodeBase64(utf8LineStrict));
                    arrayList.add(certificateFactory.generateCertificate(cVar.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        private void c(P7.d dVar, List list) throws IOException {
            try {
                dVar.writeDecimalLong(list.size()).writeByte(10);
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    dVar.writeUtf8(P7.f.of(((Certificate) list.get(i8)).getEncoded()).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        public boolean matches(H h8, J j8) {
            return this.f629a.equals(h8.url().toString()) && this.f631c.equals(h8.method()) && G7.e.varyMatches(j8, this.f630b, h8);
        }

        public J response(d.f fVar) {
            String str = this.f635g.get("Content-Type");
            String str2 = this.f635g.get("Content-Length");
            return new J.a().request(new H.a().url(this.f629a).method(this.f631c, null).headers(this.f630b).build()).protocol(this.f632d).code(this.f633e).message(this.f634f).headers(this.f635g).body(new C0013d(fVar, str, str2)).handshake(this.f636h).sentRequestAtMillis(this.f637i).receivedResponseAtMillis(this.f638j).build();
        }

        public void writeTo(d.C0027d c0027d) throws IOException {
            P7.d dVarBuffer = P7.n.buffer(c0027d.newSink(0));
            dVarBuffer.writeUtf8(this.f629a).writeByte(10);
            dVarBuffer.writeUtf8(this.f631c).writeByte(10);
            dVarBuffer.writeDecimalLong(this.f630b.size()).writeByte(10);
            int size = this.f630b.size();
            for (int i8 = 0; i8 < size; i8++) {
                dVarBuffer.writeUtf8(this.f630b.name(i8)).writeUtf8(": ").writeUtf8(this.f630b.value(i8)).writeByte(10);
            }
            dVarBuffer.writeUtf8(new G7.k(this.f632d, this.f633e, this.f634f).toString()).writeByte(10);
            dVarBuffer.writeDecimalLong(this.f635g.size() + 2).writeByte(10);
            int size2 = this.f635g.size();
            for (int i9 = 0; i9 < size2; i9++) {
                dVarBuffer.writeUtf8(this.f635g.name(i9)).writeUtf8(": ").writeUtf8(this.f635g.value(i9)).writeByte(10);
            }
            dVarBuffer.writeUtf8(f627k).writeUtf8(": ").writeDecimalLong(this.f637i).writeByte(10);
            dVarBuffer.writeUtf8(f628l).writeUtf8(": ").writeDecimalLong(this.f638j).writeByte(10);
            if (a()) {
                dVarBuffer.writeByte(10);
                dVarBuffer.writeUtf8(this.f636h.cipherSuite().javaName()).writeByte(10);
                c(dVarBuffer, this.f636h.peerCertificates());
                c(dVarBuffer, this.f636h.localCertificates());
                dVarBuffer.writeUtf8(this.f636h.tlsVersion().javaName()).writeByte(10);
            }
            dVarBuffer.close();
        }

        e(J j8) {
            this.f629a = j8.request().url().toString();
            this.f630b = G7.e.varyHeaders(j8);
            this.f631c = j8.request().method();
            this.f632d = j8.protocol();
            this.f633e = j8.code();
            this.f634f = j8.message();
            this.f635g = j8.headers();
            this.f636h = j8.handshake();
            this.f637i = j8.sentRequestAtMillis();
            this.f638j = j8.receivedResponseAtMillis();
        }
    }
}
