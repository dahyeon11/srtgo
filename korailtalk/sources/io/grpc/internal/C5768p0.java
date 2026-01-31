package io.grpc.internal;

import io.grpc.InterfaceC5796o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: io.grpc.internal.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5768p0 implements S {

    /* renamed from: a, reason: collision with root package name */
    private final d f33066a;

    /* renamed from: c, reason: collision with root package name */
    private W0 f33068c;

    /* renamed from: h, reason: collision with root package name */
    private final X0 f33073h;

    /* renamed from: i, reason: collision with root package name */
    private final O0 f33074i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f33075j;

    /* renamed from: k, reason: collision with root package name */
    private int f33076k;

    /* renamed from: m, reason: collision with root package name */
    private long f33078m;

    /* renamed from: b, reason: collision with root package name */
    private int f33067b = -1;

    /* renamed from: d, reason: collision with root package name */
    private io.grpc.r f33069d = InterfaceC5796o.b.NONE;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33070e = true;

    /* renamed from: f, reason: collision with root package name */
    private final c f33071f = new c();

    /* renamed from: g, reason: collision with root package name */
    private final ByteBuffer f33072g = ByteBuffer.allocate(5);

    /* renamed from: l, reason: collision with root package name */
    private int f33077l = -1;

    /* renamed from: io.grpc.internal.p0$d */
    public interface d {
        void deliverFrame(W0 w02, boolean z8, boolean z9, int i8);
    }

    public C5768p0(d dVar, X0 x02, O0 o02) {
        this.f33066a = (d) e3.w.checkNotNull(dVar, "sink");
        this.f33073h = (X0) e3.w.checkNotNull(x02, "bufferAllocator");
        this.f33074i = (O0) e3.w.checkNotNull(o02, "statsTraceCtx");
    }

    private void c(boolean z8, boolean z9) {
        W0 w02 = this.f33068c;
        this.f33068c = null;
        this.f33066a.deliverFrame(w02, z8, z9, this.f33076k);
        this.f33076k = 0;
    }

    private int d(InputStream inputStream) {
        if ((inputStream instanceof io.grpc.Z) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    private void e() {
        W0 w02 = this.f33068c;
        if (w02 != null) {
            w02.release();
            this.f33068c = null;
        }
    }

    private void f() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    private void g(b bVar, boolean z8) {
        int i8 = bVar.readableBytes();
        this.f33072g.put(z8 ? (byte) 1 : (byte) 0).putInt(i8);
        W0 w0Allocate = this.f33073h.allocate(5);
        w0Allocate.write(this.f33072g.array(), 0, this.f33072g.position());
        if (i8 == 0) {
            this.f33068c = w0Allocate;
            return;
        }
        this.f33066a.deliverFrame(w0Allocate, false, false, this.f33076k - 1);
        this.f33076k = 1;
        List list = bVar.f33079a;
        for (int i9 = 0; i9 < list.size() - 1; i9++) {
            this.f33066a.deliverFrame((W0) list.get(i9), false, false, 0);
        }
        this.f33068c = (W0) list.get(list.size() - 1);
        this.f33078m = i8;
    }

    private int h(InputStream inputStream, int i8) throws IOException {
        b bVar = new b();
        OutputStream outputStreamCompress = this.f33069d.compress(bVar);
        try {
            int iK = k(inputStream, outputStreamCompress);
            outputStreamCompress.close();
            int i9 = this.f33067b;
            if (i9 >= 0 && iK > i9) {
                throw io.grpc.J0.RESOURCE_EXHAUSTED.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iK), Integer.valueOf(this.f33067b))).asRuntimeException();
            }
            g(bVar, true);
            return iK;
        } catch (Throwable th) {
            outputStreamCompress.close();
            throw th;
        }
    }

    private int i(InputStream inputStream, int i8) {
        int i9 = this.f33067b;
        if (i9 >= 0 && i8 > i9) {
            throw io.grpc.J0.RESOURCE_EXHAUSTED.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i8), Integer.valueOf(this.f33067b))).asRuntimeException();
        }
        this.f33072g.put((byte) 0).putInt(i8);
        if (this.f33068c == null) {
            this.f33068c = this.f33073h.allocate(this.f33072g.position() + i8);
        }
        j(this.f33072g.array(), 0, this.f33072g.position());
        return k(inputStream, this.f33071f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(byte[] bArr, int i8, int i9) {
        while (i9 > 0) {
            W0 w02 = this.f33068c;
            if (w02 != null && w02.writableBytes() == 0) {
                c(false, false);
            }
            if (this.f33068c == null) {
                this.f33068c = this.f33073h.allocate(i9);
            }
            int iMin = Math.min(i9, this.f33068c.writableBytes());
            this.f33068c.write(bArr, i8, iMin);
            i8 += iMin;
            i9 -= iMin;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int k(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof io.grpc.B) {
            return ((io.grpc.B) inputStream).drainTo(outputStream);
        }
        long jCopy = h3.h.copy(inputStream, outputStream);
        e3.w.checkArgument(jCopy <= 2147483647L, "Message size overflow: %s", jCopy);
        return (int) jCopy;
    }

    private int l(InputStream inputStream, int i8) throws IOException {
        if (i8 != -1) {
            this.f33078m = i8;
            return i(inputStream, i8);
        }
        b bVar = new b();
        int iK = k(inputStream, bVar);
        int i9 = this.f33067b;
        if (i9 >= 0 && iK > i9) {
            throw io.grpc.J0.RESOURCE_EXHAUSTED.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iK), Integer.valueOf(this.f33067b))).asRuntimeException();
        }
        g(bVar, false);
        return iK;
    }

    @Override // io.grpc.internal.S
    public void close() {
        if (isClosed()) {
            return;
        }
        this.f33075j = true;
        W0 w02 = this.f33068c;
        if (w02 != null && w02.readableBytes() == 0) {
            e();
        }
        c(true, true);
    }

    @Override // io.grpc.internal.S
    public void dispose() {
        this.f33075j = true;
        e();
    }

    @Override // io.grpc.internal.S
    public void flush() {
        W0 w02 = this.f33068c;
        if (w02 == null || w02.readableBytes() <= 0) {
            return;
        }
        c(false, true);
    }

    @Override // io.grpc.internal.S
    public boolean isClosed() {
        return this.f33075j;
    }

    @Override // io.grpc.internal.S
    public void setMaxOutboundMessageSize(int i8) {
        e3.w.checkState(this.f33067b == -1, "max size already set");
        this.f33067b = i8;
    }

    @Override // io.grpc.internal.S
    public void writePayload(InputStream inputStream) {
        f();
        this.f33076k++;
        int i8 = this.f33077l + 1;
        this.f33077l = i8;
        this.f33078m = 0L;
        this.f33074i.outboundMessage(i8);
        boolean z8 = this.f33070e && this.f33069d != InterfaceC5796o.b.NONE;
        try {
            int iD = d(inputStream);
            int iL = (iD == 0 || !z8) ? l(inputStream, iD) : h(inputStream, iD);
            if (iD != -1 && iL != iD) {
                throw io.grpc.J0.INTERNAL.withDescription(String.format("Message length inaccurate %s != %s", Integer.valueOf(iL), Integer.valueOf(iD))).asRuntimeException();
            }
            long j8 = iL;
            this.f33074i.outboundUncompressedSize(j8);
            this.f33074i.outboundWireSize(this.f33078m);
            this.f33074i.outboundMessageSent(this.f33077l, this.f33078m, j8);
        } catch (IOException e8) {
            throw io.grpc.J0.INTERNAL.withDescription("Failed to frame message").withCause(e8).asRuntimeException();
        } catch (RuntimeException e9) {
            throw io.grpc.J0.INTERNAL.withDescription("Failed to frame message").withCause(e9).asRuntimeException();
        }
    }

    /* renamed from: io.grpc.internal.p0$c */
    private class c extends OutputStream {
        private c() {
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            write(new byte[]{(byte) i8}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) {
            C5768p0.this.j(bArr, i8, i9);
        }
    }

    @Override // io.grpc.internal.S
    public C5768p0 setCompressor(io.grpc.r rVar) {
        this.f33069d = (io.grpc.r) e3.w.checkNotNull(rVar, "Can't pass an empty compressor");
        return this;
    }

    @Override // io.grpc.internal.S
    public C5768p0 setMessageCompression(boolean z8) {
        this.f33070e = z8;
        return this;
    }

    /* renamed from: io.grpc.internal.p0$b */
    private final class b extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final List f33079a;

        /* renamed from: b, reason: collision with root package name */
        private W0 f33080b;

        private b() {
            this.f33079a = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int readableBytes() {
            Iterator it = this.f33079a.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                i8 += ((W0) it.next()).readableBytes();
            }
            return i8;
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            W0 w02 = this.f33080b;
            if (w02 == null || w02.writableBytes() <= 0) {
                write(new byte[]{(byte) i8}, 0, 1);
            } else {
                this.f33080b.write((byte) i8);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) {
            if (this.f33080b == null) {
                W0 w0Allocate = C5768p0.this.f33073h.allocate(i9);
                this.f33080b = w0Allocate;
                this.f33079a.add(w0Allocate);
            }
            while (i9 > 0) {
                int iMin = Math.min(i9, this.f33080b.writableBytes());
                if (iMin == 0) {
                    W0 w0Allocate2 = C5768p0.this.f33073h.allocate(Math.max(i9, this.f33080b.readableBytes() * 2));
                    this.f33080b = w0Allocate2;
                    this.f33079a.add(w0Allocate2);
                } else {
                    this.f33080b.write(bArr, i8, iMin);
                    i8 += iMin;
                    i9 -= iMin;
                }
            }
        }
    }
}
