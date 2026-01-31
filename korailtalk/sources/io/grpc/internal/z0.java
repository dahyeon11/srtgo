package io.grpc.internal;

import e3.AbstractC5364f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final y0 f33220a = new c(new byte[0]);

    class a extends Q {
        a(y0 y0Var) {
            super(y0Var);
        }

        @Override // io.grpc.internal.Q, io.grpc.internal.y0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    private static class c extends AbstractC5740c {

        /* renamed from: a, reason: collision with root package name */
        int f33222a;

        /* renamed from: b, reason: collision with root package name */
        final int f33223b;

        /* renamed from: c, reason: collision with root package name */
        final byte[] f33224c;

        /* renamed from: d, reason: collision with root package name */
        int f33225d;

        c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public byte[] array() {
            return this.f33224c;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public int arrayOffset() {
            return this.f33222a;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public boolean hasArray() {
            return true;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void mark() {
            this.f33225d = this.f33222a;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public int readUnsignedByte() {
            a(1);
            byte[] bArr = this.f33224c;
            int i8 = this.f33222a;
            this.f33222a = i8 + 1;
            return bArr[i8] & 255;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public int readableBytes() {
            return this.f33223b - this.f33222a;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void reset() {
            int i8 = this.f33225d;
            if (i8 == -1) {
                throw new InvalidMarkException();
            }
            this.f33222a = i8;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void skipBytes(int i8) {
            a(i8);
            this.f33222a += i8;
        }

        c(byte[] bArr, int i8, int i9) {
            this.f33225d = -1;
            e3.w.checkArgument(i8 >= 0, "offset must be >= 0");
            e3.w.checkArgument(i9 >= 0, "length must be >= 0");
            int i10 = i9 + i8;
            e3.w.checkArgument(i10 <= bArr.length, "offset + length exceeds array boundary");
            this.f33224c = (byte[]) e3.w.checkNotNull(bArr, "bytes");
            this.f33222a = i8;
            this.f33223b = i10;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void readBytes(byte[] bArr, int i8, int i9) {
            System.arraycopy(this.f33224c, this.f33222a, bArr, i8, i9);
            this.f33222a += i9;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void readBytes(ByteBuffer byteBuffer) {
            e3.w.checkNotNull(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            a(iRemaining);
            byteBuffer.put(this.f33224c, this.f33222a, iRemaining);
            this.f33222a += iRemaining;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void readBytes(OutputStream outputStream, int i8) throws IOException {
            a(i8);
            outputStream.write(this.f33224c, this.f33222a, i8);
            this.f33222a += i8;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public c readBytes(int i8) {
            a(i8);
            int i9 = this.f33222a;
            this.f33222a = i9 + i8;
            return new c(this.f33224c, i9, i8);
        }
    }

    private static class d extends AbstractC5740c {

        /* renamed from: a, reason: collision with root package name */
        final ByteBuffer f33226a;

        d(ByteBuffer byteBuffer) {
            this.f33226a = (ByteBuffer) e3.w.checkNotNull(byteBuffer, "bytes");
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public byte[] array() {
            return this.f33226a.array();
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public int arrayOffset() {
            return this.f33226a.arrayOffset() + this.f33226a.position();
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public boolean byteBufferSupported() {
            return true;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public ByteBuffer getByteBuffer() {
            return this.f33226a.slice();
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public boolean hasArray() {
            return this.f33226a.hasArray();
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void mark() {
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public int readUnsignedByte() {
            a(1);
            return this.f33226a.get() & 255;
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public int readableBytes() {
            return this.f33226a.remaining();
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void reset() {
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void skipBytes(int i8) {
            a(i8);
            ByteBuffer byteBuffer = this.f33226a;
            byteBuffer.position(byteBuffer.position() + i8);
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void readBytes(byte[] bArr, int i8, int i9) {
            a(i9);
            this.f33226a.get(bArr, i8, i9);
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void readBytes(ByteBuffer byteBuffer) {
            e3.w.checkNotNull(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            a(iRemaining);
            int iLimit = this.f33226a.limit();
            ByteBuffer byteBuffer2 = this.f33226a;
            byteBuffer2.limit(byteBuffer2.position() + iRemaining);
            byteBuffer.put(this.f33226a);
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public void readBytes(OutputStream outputStream, int i8) throws IOException {
            a(i8);
            if (hasArray()) {
                outputStream.write(array(), arrayOffset(), i8);
                ByteBuffer byteBuffer = this.f33226a;
                byteBuffer.position(byteBuffer.position() + i8);
            } else {
                byte[] bArr = new byte[i8];
                this.f33226a.get(bArr);
                outputStream.write(bArr);
            }
        }

        @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
        public d readBytes(int i8) {
            a(i8);
            ByteBuffer byteBufferDuplicate = this.f33226a.duplicate();
            byteBufferDuplicate.limit(this.f33226a.position() + i8);
            ByteBuffer byteBuffer = this.f33226a;
            byteBuffer.position(byteBuffer.position() + i8);
            return new d(byteBufferDuplicate);
        }
    }

    public static y0 empty() {
        return f33220a;
    }

    public static y0 ignoreClose(y0 y0Var) {
        return new a(y0Var);
    }

    public static InputStream openStream(y0 y0Var, boolean z8) {
        if (!z8) {
            y0Var = ignoreClose(y0Var);
        }
        return new b(y0Var);
    }

    public static byte[] readArray(y0 y0Var) {
        e3.w.checkNotNull(y0Var, "buffer");
        int i8 = y0Var.readableBytes();
        byte[] bArr = new byte[i8];
        y0Var.readBytes(bArr, 0, i8);
        return bArr;
    }

    public static String readAsString(y0 y0Var, Charset charset) {
        e3.w.checkNotNull(charset, "charset");
        return new String(readArray(y0Var), charset);
    }

    public static String readAsStringUtf8(y0 y0Var) {
        return readAsString(y0Var, AbstractC5364f.UTF_8);
    }

    public static y0 wrap(byte[] bArr) {
        return new c(bArr, 0, bArr.length);
    }

    private static final class b extends InputStream implements io.grpc.Z, io.grpc.L, io.grpc.A {

        /* renamed from: a, reason: collision with root package name */
        private y0 f33221a;

        public b(y0 y0Var) {
            this.f33221a = (y0) e3.w.checkNotNull(y0Var, "buffer");
        }

        @Override // java.io.InputStream, io.grpc.Z
        public int available() {
            return this.f33221a.readableBytes();
        }

        @Override // io.grpc.L
        public boolean byteBufferSupported() {
            return this.f33221a.byteBufferSupported();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f33221a.close();
        }

        @Override // io.grpc.A
        public InputStream detach() {
            y0 y0Var = this.f33221a;
            this.f33221a = y0Var.readBytes(0);
            return new b(y0Var);
        }

        @Override // io.grpc.L
        public ByteBuffer getByteBuffer() {
            return this.f33221a.getByteBuffer();
        }

        @Override // java.io.InputStream
        public void mark(int i8) {
            this.f33221a.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f33221a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f33221a.readableBytes() == 0) {
                return -1;
            }
            return this.f33221a.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f33221a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j8) {
            int iMin = (int) Math.min(this.f33221a.readableBytes(), j8);
            this.f33221a.skipBytes(iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            if (this.f33221a.readableBytes() == 0) {
                return -1;
            }
            int iMin = Math.min(this.f33221a.readableBytes(), i9);
            this.f33221a.readBytes(bArr, i8, iMin);
            return iMin;
        }
    }

    public static y0 wrap(byte[] bArr, int i8, int i9) {
        return new c(bArr, i8, i9);
    }

    public static y0 wrap(ByteBuffer byteBuffer) {
        return new d(byteBuffer);
    }
}
