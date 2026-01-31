package io.grpc.internal;

import io.grpc.InterfaceC5796o;
import io.grpc.InterfaceC5807y;
import io.grpc.internal.Q0;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;

/* renamed from: io.grpc.internal.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5766o0 implements Closeable, A {

    /* renamed from: a, reason: collision with root package name */
    private b f33036a;

    /* renamed from: b, reason: collision with root package name */
    private int f33037b;

    /* renamed from: c, reason: collision with root package name */
    private final O0 f33038c;

    /* renamed from: d, reason: collision with root package name */
    private final V0 f33039d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC5807y f33040e;

    /* renamed from: f, reason: collision with root package name */
    private V f33041f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f33042g;

    /* renamed from: h, reason: collision with root package name */
    private int f33043h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33046k;

    /* renamed from: l, reason: collision with root package name */
    private C5780w f33047l;

    /* renamed from: n, reason: collision with root package name */
    private long f33049n;

    /* renamed from: q, reason: collision with root package name */
    private int f33052q;

    /* renamed from: i, reason: collision with root package name */
    private e f33044i = e.HEADER;

    /* renamed from: j, reason: collision with root package name */
    private int f33045j = 5;

    /* renamed from: m, reason: collision with root package name */
    private C5780w f33048m = new C5780w();

    /* renamed from: o, reason: collision with root package name */
    private boolean f33050o = false;

    /* renamed from: p, reason: collision with root package name */
    private int f33051p = -1;

    /* renamed from: r, reason: collision with root package name */
    private boolean f33053r = false;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f33054s = false;

    /* renamed from: io.grpc.internal.o0$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33055a;

        static {
            int[] iArr = new int[e.values().length];
            f33055a = iArr;
            try {
                iArr[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33055a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: io.grpc.internal.o0$b */
    public interface b {
        void bytesRead(int i8);

        void deframeFailed(Throwable th);

        void deframerClosed(boolean z8);

        void messagesAvailable(Q0.a aVar);
    }

    /* renamed from: io.grpc.internal.o0$c */
    private static class c implements Q0.a {

        /* renamed from: a, reason: collision with root package name */
        private InputStream f33056a;

        /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        @Override // io.grpc.internal.Q0.a
        public InputStream next() {
            InputStream inputStream = this.f33056a;
            this.f33056a = null;
            return inputStream;
        }

        private c(InputStream inputStream) {
            this.f33056a = inputStream;
        }
    }

    /* renamed from: io.grpc.internal.o0$e */
    private enum e {
        HEADER,
        BODY
    }

    public C5766o0(b bVar, InterfaceC5807y interfaceC5807y, int i8, O0 o02, V0 v02) {
        this.f33036a = (b) e3.w.checkNotNull(bVar, "sink");
        this.f33040e = (InterfaceC5807y) e3.w.checkNotNull(interfaceC5807y, "decompressor");
        this.f33037b = i8;
        this.f33038c = (O0) e3.w.checkNotNull(o02, "statsTraceCtx");
        this.f33039d = (V0) e3.w.checkNotNull(v02, "transportTracer");
    }

    private void a() {
        if (this.f33050o) {
            return;
        }
        this.f33050o = true;
        while (!this.f33054s && this.f33049n > 0 && h()) {
            try {
                int i8 = a.f33055a[this.f33044i.ordinal()];
                if (i8 == 1) {
                    g();
                } else {
                    if (i8 != 2) {
                        throw new AssertionError("Invalid state: " + this.f33044i);
                    }
                    f();
                    this.f33049n--;
                }
            } catch (Throwable th) {
                this.f33050o = false;
                throw th;
            }
        }
        if (this.f33054s) {
            close();
            this.f33050o = false;
        } else {
            if (this.f33053r && e()) {
                close();
            }
            this.f33050o = false;
        }
    }

    private InputStream b() {
        InterfaceC5807y interfaceC5807y = this.f33040e;
        if (interfaceC5807y == InterfaceC5796o.b.NONE) {
            throw io.grpc.J0.INTERNAL.withDescription("Can't decode compressed gRPC message as compression not configured").asRuntimeException();
        }
        try {
            return new d(interfaceC5807y.decompress(z0.openStream(this.f33047l, true)), this.f33037b, this.f33038c);
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    private InputStream c() {
        this.f33038c.inboundUncompressedSize(this.f33047l.readableBytes());
        return z0.openStream(this.f33047l, true);
    }

    private boolean d() {
        return isClosed() || this.f33053r;
    }

    private boolean e() {
        V v8 = this.f33041f;
        return v8 != null ? v8.p() : this.f33048m.readableBytes() == 0;
    }

    private void f() {
        this.f33038c.inboundMessageRead(this.f33051p, this.f33052q, -1L);
        this.f33052q = 0;
        InputStream inputStreamB = this.f33046k ? b() : c();
        this.f33047l = null;
        this.f33036a.messagesAvailable(new c(inputStreamB, null));
        this.f33044i = e.HEADER;
        this.f33045j = 5;
    }

    private void g() {
        int unsignedByte = this.f33047l.readUnsignedByte();
        if ((unsignedByte & 254) != 0) {
            throw io.grpc.J0.INTERNAL.withDescription("gRPC frame header malformed: reserved bits not zero").asRuntimeException();
        }
        this.f33046k = (unsignedByte & 1) != 0;
        int i8 = this.f33047l.readInt();
        this.f33045j = i8;
        if (i8 < 0 || i8 > this.f33037b) {
            throw io.grpc.J0.RESOURCE_EXHAUSTED.withDescription(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f33037b), Integer.valueOf(this.f33045j))).asRuntimeException();
        }
        int i9 = this.f33051p + 1;
        this.f33051p = i9;
        this.f33038c.inboundMessage(i9);
        this.f33039d.reportMessageReceived();
        this.f33044i = e.BODY;
    }

    private boolean h() throws Throwable {
        int iK;
        int i8 = 0;
        try {
            if (this.f33047l == null) {
                this.f33047l = new C5780w();
            }
            int iJ = 0;
            iK = 0;
            while (true) {
                try {
                    int i9 = this.f33045j - this.f33047l.readableBytes();
                    if (i9 <= 0) {
                        if (iJ <= 0) {
                            return true;
                        }
                        this.f33036a.bytesRead(iJ);
                        if (this.f33044i != e.BODY) {
                            return true;
                        }
                        if (this.f33041f != null) {
                            this.f33038c.inboundWireSize(iK);
                            this.f33052q += iK;
                            return true;
                        }
                        this.f33038c.inboundWireSize(iJ);
                        this.f33052q += iJ;
                        return true;
                    }
                    if (this.f33041f != null) {
                        try {
                            byte[] bArr = this.f33042g;
                            if (bArr == null || this.f33043h == bArr.length) {
                                this.f33042g = new byte[Math.min(i9, 2097152)];
                                this.f33043h = 0;
                            }
                            int iN = this.f33041f.n(this.f33042g, this.f33043h, Math.min(i9, this.f33042g.length - this.f33043h));
                            iJ += this.f33041f.j();
                            iK += this.f33041f.k();
                            if (iN == 0) {
                                if (iJ > 0) {
                                    this.f33036a.bytesRead(iJ);
                                    if (this.f33044i == e.BODY) {
                                        if (this.f33041f != null) {
                                            this.f33038c.inboundWireSize(iK);
                                            this.f33052q += iK;
                                        } else {
                                            this.f33038c.inboundWireSize(iJ);
                                            this.f33052q += iJ;
                                        }
                                    }
                                }
                                return false;
                            }
                            this.f33047l.addBuffer(z0.wrap(this.f33042g, this.f33043h, iN));
                            this.f33043h += iN;
                        } catch (IOException e8) {
                            throw new RuntimeException(e8);
                        } catch (DataFormatException e9) {
                            throw new RuntimeException(e9);
                        }
                    } else {
                        if (this.f33048m.readableBytes() == 0) {
                            if (iJ > 0) {
                                this.f33036a.bytesRead(iJ);
                                if (this.f33044i == e.BODY) {
                                    if (this.f33041f != null) {
                                        this.f33038c.inboundWireSize(iK);
                                        this.f33052q += iK;
                                    } else {
                                        this.f33038c.inboundWireSize(iJ);
                                        this.f33052q += iJ;
                                    }
                                }
                            }
                            return false;
                        }
                        int iMin = Math.min(i9, this.f33048m.readableBytes());
                        iJ += iMin;
                        this.f33047l.addBuffer(this.f33048m.readBytes(iMin));
                    }
                } catch (Throwable th) {
                    int i10 = iJ;
                    th = th;
                    i8 = i10;
                    if (i8 > 0) {
                        this.f33036a.bytesRead(i8);
                        if (this.f33044i == e.BODY) {
                            if (this.f33041f != null) {
                                this.f33038c.inboundWireSize(iK);
                                this.f33052q += iK;
                            } else {
                                this.f33038c.inboundWireSize(i8);
                                this.f33052q += i8;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            iK = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.A
    public void close() {
        if (isClosed()) {
            return;
        }
        C5780w c5780w = this.f33047l;
        boolean z8 = c5780w != null && c5780w.readableBytes() > 0;
        try {
            V v8 = this.f33041f;
            if (v8 != null) {
                boolean z9 = z8 || v8.l();
                this.f33041f.close();
                z8 = z9;
            }
            C5780w c5780w2 = this.f33048m;
            if (c5780w2 != null) {
                c5780w2.close();
            }
            C5780w c5780w3 = this.f33047l;
            if (c5780w3 != null) {
                c5780w3.close();
            }
            this.f33041f = null;
            this.f33048m = null;
            this.f33047l = null;
            this.f33036a.deframerClosed(z8);
        } catch (Throwable th) {
            this.f33041f = null;
            this.f33048m = null;
            this.f33047l = null;
            throw th;
        }
    }

    @Override // io.grpc.internal.A
    public void closeWhenComplete() {
        if (isClosed()) {
            return;
        }
        if (e()) {
            close();
        } else {
            this.f33053r = true;
        }
    }

    @Override // io.grpc.internal.A
    public void deframe(y0 y0Var) throws Throwable {
        e3.w.checkNotNull(y0Var, "data");
        boolean z8 = true;
        try {
            if (d()) {
                y0Var.close();
                return;
            }
            V v8 = this.f33041f;
            if (v8 != null) {
                v8.h(y0Var);
            } else {
                this.f33048m.addBuffer(y0Var);
            }
            try {
                a();
            } catch (Throwable th) {
                th = th;
                z8 = false;
                if (z8) {
                    y0Var.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    void i(b bVar) {
        this.f33036a = bVar;
    }

    public boolean isClosed() {
        return this.f33048m == null && this.f33041f == null;
    }

    void j() {
        this.f33054s = true;
    }

    @Override // io.grpc.internal.A
    public void request(int i8) {
        e3.w.checkArgument(i8 > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f33049n += i8;
        a();
    }

    @Override // io.grpc.internal.A
    public void setDecompressor(InterfaceC5807y interfaceC5807y) {
        e3.w.checkState(this.f33041f == null, "Already set full stream decompressor");
        this.f33040e = (InterfaceC5807y) e3.w.checkNotNull(interfaceC5807y, "Can't pass an empty decompressor");
    }

    @Override // io.grpc.internal.A
    public void setFullStreamDecompressor(V v8) {
        e3.w.checkState(this.f33040e == InterfaceC5796o.b.NONE, "per-message decompressor already set");
        e3.w.checkState(this.f33041f == null, "full stream decompressor already set");
        this.f33041f = (V) e3.w.checkNotNull(v8, "Can't pass a null full stream decompressor");
        this.f33048m = null;
    }

    @Override // io.grpc.internal.A
    public void setMaxInboundMessageSize(int i8) {
        this.f33037b = i8;
    }

    /* renamed from: io.grpc.internal.o0$d */
    static final class d extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final int f33057a;

        /* renamed from: b, reason: collision with root package name */
        private final O0 f33058b;

        /* renamed from: c, reason: collision with root package name */
        private long f33059c;

        /* renamed from: d, reason: collision with root package name */
        private long f33060d;

        /* renamed from: e, reason: collision with root package name */
        private long f33061e;

        d(InputStream inputStream, int i8, O0 o02) {
            super(inputStream);
            this.f33061e = -1L;
            this.f33057a = i8;
            this.f33058b = o02;
        }

        private void a() {
            long j8 = this.f33060d;
            long j9 = this.f33059c;
            if (j8 > j9) {
                this.f33058b.inboundUncompressedSize(j8 - j9);
                this.f33059c = this.f33060d;
            }
        }

        private void b() {
            if (this.f33060d <= this.f33057a) {
                return;
            }
            throw io.grpc.J0.RESOURCE_EXHAUSTED.withDescription("Decompressed gRPC message exceeds maximum size " + this.f33057a).asRuntimeException();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i8) {
            ((FilterInputStream) this).in.mark(i8);
            this.f33061e = this.f33060d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i8 = ((FilterInputStream) this).in.read();
            if (i8 != -1) {
                this.f33060d++;
            }
            b();
            a();
            return i8;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f33061e == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f33060d = this.f33061e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j8) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j8);
            this.f33060d += jSkip;
            b();
            a();
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) throws IOException {
            int i10 = ((FilterInputStream) this).in.read(bArr, i8, i9);
            if (i10 != -1) {
                this.f33060d += i10;
            }
            b();
            a();
            return i10;
        }
    }
}
