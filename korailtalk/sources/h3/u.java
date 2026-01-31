package h3;

import e3.w;
import j3.AbstractC5824f;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class u extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final Reader f31541a;

    /* renamed from: b, reason: collision with root package name */
    private final CharsetEncoder f31542b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f31543c;

    /* renamed from: d, reason: collision with root package name */
    private CharBuffer f31544d;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f31545e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31546f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31547g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f31548h;

    /* JADX WARN: Illegal instructions before constructor call */
    u(Reader reader, Charset charset, int i8) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this(reader, charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction), i8);
    }

    private static int a(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private int b(byte[] bArr, int i8, int i9) {
        int iMin = Math.min(i9, this.f31545e.remaining());
        this.f31545e.get(bArr, i8, iMin);
        return iMin;
    }

    private static CharBuffer c(CharBuffer charBuffer) {
        CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        o.d(charBufferWrap, charBuffer.position());
        o.c(charBufferWrap, charBuffer.limit());
        return charBufferWrap;
    }

    private void d() throws IOException {
        if (a(this.f31544d) == 0) {
            if (this.f31544d.position() > 0) {
                o.b(this.f31544d.compact());
            } else {
                this.f31544d = c(this.f31544d);
            }
        }
        int iLimit = this.f31544d.limit();
        int i8 = this.f31541a.read(this.f31544d.array(), iLimit, a(this.f31544d));
        if (i8 == -1) {
            this.f31546f = true;
        } else {
            o.c(this.f31544d, iLimit + i8);
        }
    }

    private void e(boolean z8) {
        o.b(this.f31545e);
        if (z8 && this.f31545e.remaining() == 0) {
            this.f31545e = ByteBuffer.allocate(this.f31545e.capacity() * 2);
        } else {
            this.f31547g = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31541a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f31543c) == 1) {
            return AbstractC5824f.toInt(this.f31543c[0]);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r2 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return r2;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r9 + r10
            int r1 = r8.length
            e3.w.checkPositionIndexes(r9, r0, r1)
            r0 = 0
            if (r10 != 0) goto La
            return r0
        La:
            boolean r1 = r7.f31546f
            r2 = r0
        Ld:
            boolean r3 = r7.f31547g
            if (r3 == 0) goto L2e
            int r3 = r9 + r2
            int r4 = r10 - r2
            int r3 = r7.b(r8, r3, r4)
            int r2 = r2 + r3
            if (r2 == r10) goto L29
            boolean r3 = r7.f31548h
            if (r3 == 0) goto L21
            goto L29
        L21:
            r7.f31547g = r0
            java.nio.ByteBuffer r3 = r7.f31545e
            h3.o.a(r3)
            goto L2e
        L29:
            if (r2 <= 0) goto L2c
            goto L2d
        L2c:
            r2 = -1
        L2d:
            return r2
        L2e:
            boolean r3 = r7.f31548h
            if (r3 == 0) goto L35
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L4c
        L35:
            if (r1 == 0) goto L40
            java.nio.charset.CharsetEncoder r3 = r7.f31542b
            java.nio.ByteBuffer r4 = r7.f31545e
            java.nio.charset.CoderResult r3 = r3.flush(r4)
            goto L4c
        L40:
            java.nio.charset.CharsetEncoder r3 = r7.f31542b
            java.nio.CharBuffer r4 = r7.f31544d
            java.nio.ByteBuffer r5 = r7.f31545e
            boolean r6 = r7.f31546f
            java.nio.charset.CoderResult r3 = r3.encode(r4, r5, r6)
        L4c:
            boolean r4 = r3.isOverflow()
            r5 = 1
            if (r4 == 0) goto L57
            r7.e(r5)
            goto Ld
        L57:
            boolean r4 = r3.isUnderflow()
            if (r4 == 0) goto L6f
            if (r1 == 0) goto L65
            r7.f31548h = r5
            r7.e(r0)
            goto Ld
        L65:
            boolean r3 = r7.f31546f
            if (r3 == 0) goto L6b
            r1 = r5
            goto L2e
        L6b:
            r7.d()
            goto L2e
        L6f:
            boolean r4 = r3.isError()
            if (r4 == 0) goto L2e
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.u.read(byte[], int, int):int");
    }

    u(Reader reader, CharsetEncoder charsetEncoder, int i8) {
        this.f31543c = new byte[1];
        this.f31541a = (Reader) w.checkNotNull(reader);
        this.f31542b = (CharsetEncoder) w.checkNotNull(charsetEncoder);
        w.checkArgument(i8 > 0, "bufferSize must be positive: %s", i8);
        charsetEncoder.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(i8);
        this.f31544d = charBufferAllocate;
        o.b(charBufferAllocate);
        this.f31545e = ByteBuffer.allocate(i8);
    }
}
