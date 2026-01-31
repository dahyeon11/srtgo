package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: io.grpc.internal.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5780w extends AbstractC5740c {

    /* renamed from: e, reason: collision with root package name */
    private static final f f33197e = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final f f33198f = new b();

    /* renamed from: g, reason: collision with root package name */
    private static final f f33199g = new c();

    /* renamed from: h, reason: collision with root package name */
    private static final f f33200h = new d();

    /* renamed from: i, reason: collision with root package name */
    private static final g f33201i = new e();

    /* renamed from: a, reason: collision with root package name */
    private final Deque f33202a;

    /* renamed from: b, reason: collision with root package name */
    private Deque f33203b;

    /* renamed from: c, reason: collision with root package name */
    private int f33204c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f33205d;

    /* renamed from: io.grpc.internal.w$a */
    class a implements f {
        a() {
        }

        @Override // io.grpc.internal.C5780w.f, io.grpc.internal.C5780w.g
        public int read(y0 y0Var, int i8, Void r32, int i9) {
            return y0Var.readUnsignedByte();
        }
    }

    /* renamed from: io.grpc.internal.w$b */
    class b implements f {
        b() {
        }

        @Override // io.grpc.internal.C5780w.f, io.grpc.internal.C5780w.g
        public int read(y0 y0Var, int i8, Void r32, int i9) {
            y0Var.skipBytes(i8);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.w$c */
    class c implements f {
        c() {
        }

        @Override // io.grpc.internal.C5780w.f, io.grpc.internal.C5780w.g
        public int read(y0 y0Var, int i8, byte[] bArr, int i9) {
            y0Var.readBytes(bArr, i9, i8);
            return i9 + i8;
        }
    }

    /* renamed from: io.grpc.internal.w$d */
    class d implements f {
        d() {
        }

        @Override // io.grpc.internal.C5780w.f, io.grpc.internal.C5780w.g
        public int read(y0 y0Var, int i8, ByteBuffer byteBuffer, int i9) {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i8);
            y0Var.readBytes(byteBuffer);
            byteBuffer.limit(iLimit);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.w$e */
    class e implements g {
        e() {
        }

        @Override // io.grpc.internal.C5780w.g
        public int read(y0 y0Var, int i8, OutputStream outputStream, int i9) {
            y0Var.readBytes(outputStream, i8);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.w$f */
    private interface f extends g {
        @Override // io.grpc.internal.C5780w.g
        int read(y0 y0Var, int i8, Object obj, int i9);
    }

    /* renamed from: io.grpc.internal.w$g */
    private interface g {
        int read(y0 y0Var, int i8, Object obj, int i9);
    }

    public C5780w(int i8) {
        this.f33202a = new ArrayDeque(i8);
    }

    private void b() {
        if (!this.f33205d) {
            ((y0) this.f33202a.remove()).close();
            return;
        }
        this.f33203b.add((y0) this.f33202a.remove());
        y0 y0Var = (y0) this.f33202a.peek();
        if (y0Var != null) {
            y0Var.mark();
        }
    }

    private void c() {
        if (((y0) this.f33202a.peek()).readableBytes() == 0) {
            b();
        }
    }

    private void d(y0 y0Var) {
        if (!(y0Var instanceof C5780w)) {
            this.f33202a.add(y0Var);
            this.f33204c += y0Var.readableBytes();
            return;
        }
        C5780w c5780w = (C5780w) y0Var;
        while (!c5780w.f33202a.isEmpty()) {
            this.f33202a.add((y0) c5780w.f33202a.remove());
        }
        this.f33204c += c5780w.f33204c;
        c5780w.f33204c = 0;
        c5780w.close();
    }

    private int e(g gVar, int i8, Object obj, int i9) {
        a(i8);
        if (!this.f33202a.isEmpty()) {
            c();
        }
        while (i8 > 0 && !this.f33202a.isEmpty()) {
            y0 y0Var = (y0) this.f33202a.peek();
            int iMin = Math.min(i8, y0Var.readableBytes());
            i9 = gVar.read(y0Var, iMin, obj, i9);
            i8 -= iMin;
            this.f33204c -= iMin;
            c();
        }
        if (i8 <= 0) {
            return i9;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private int f(f fVar, int i8, Object obj, int i9) {
        try {
            return e(fVar, i8, obj, i9);
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public void addBuffer(y0 y0Var) {
        boolean z8 = this.f33205d && this.f33202a.isEmpty();
        d(y0Var);
        if (z8) {
            ((y0) this.f33202a.peek()).mark();
        }
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public boolean byteBufferSupported() {
        Iterator it = this.f33202a.iterator();
        while (it.hasNext()) {
            if (!((y0) it.next()).byteBufferSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f33202a.isEmpty()) {
            ((y0) this.f33202a.remove()).close();
        }
        if (this.f33203b != null) {
            while (!this.f33203b.isEmpty()) {
                ((y0) this.f33203b.remove()).close();
            }
        }
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public ByteBuffer getByteBuffer() {
        if (this.f33202a.isEmpty()) {
            return null;
        }
        return ((y0) this.f33202a.peek()).getByteBuffer();
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public void mark() {
        if (this.f33203b == null) {
            this.f33203b = new ArrayDeque(Math.min(this.f33202a.size(), 16));
        }
        while (!this.f33203b.isEmpty()) {
            ((y0) this.f33203b.remove()).close();
        }
        this.f33205d = true;
        y0 y0Var = (y0) this.f33202a.peek();
        if (y0Var != null) {
            y0Var.mark();
        }
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public boolean markSupported() {
        Iterator it = this.f33202a.iterator();
        while (it.hasNext()) {
            if (!((y0) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public void readBytes(byte[] bArr, int i8, int i9) {
        f(f33199g, i9, bArr, i8);
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public int readUnsignedByte() {
        return f(f33197e, 1, null, 0);
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public int readableBytes() {
        return this.f33204c;
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public void reset() {
        if (!this.f33205d) {
            throw new InvalidMarkException();
        }
        y0 y0Var = (y0) this.f33202a.peek();
        if (y0Var != null) {
            int i8 = y0Var.readableBytes();
            y0Var.reset();
            this.f33204c += y0Var.readableBytes() - i8;
        }
        while (true) {
            y0 y0Var2 = (y0) this.f33203b.pollLast();
            if (y0Var2 == null) {
                return;
            }
            y0Var2.reset();
            this.f33202a.addFirst(y0Var2);
            this.f33204c += y0Var2.readableBytes();
        }
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public void skipBytes(int i8) {
        f(f33198f, i8, null, 0);
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public void readBytes(ByteBuffer byteBuffer) {
        f(f33200h, byteBuffer.remaining(), byteBuffer, 0);
    }

    public C5780w() {
        this.f33202a = new ArrayDeque();
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public void readBytes(OutputStream outputStream, int i8) {
        e(f33201i, i8, outputStream, 0);
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public y0 readBytes(int i8) {
        y0 bytes;
        int i9;
        y0 bytes2;
        if (i8 <= 0) {
            return z0.empty();
        }
        a(i8);
        this.f33204c -= i8;
        y0 y0Var = null;
        C5780w c5780w = null;
        while (true) {
            y0 y0Var2 = (y0) this.f33202a.peek();
            int i10 = y0Var2.readableBytes();
            if (i10 > i8) {
                bytes2 = y0Var2.readBytes(i8);
                i9 = 0;
            } else {
                if (this.f33205d) {
                    bytes = y0Var2.readBytes(i10);
                    b();
                } else {
                    bytes = (y0) this.f33202a.poll();
                }
                y0 y0Var3 = bytes;
                i9 = i8 - i10;
                bytes2 = y0Var3;
            }
            if (y0Var == null) {
                y0Var = bytes2;
            } else {
                if (c5780w == null) {
                    c5780w = new C5780w(i9 != 0 ? Math.min(this.f33202a.size() + 2, 16) : 2);
                    c5780w.addBuffer(y0Var);
                    y0Var = c5780w;
                }
                c5780w.addBuffer(bytes2);
            }
            if (i9 <= 0) {
                return y0Var;
            }
            i8 = i9;
        }
    }
}
