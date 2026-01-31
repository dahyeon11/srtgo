package P7;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
final class r implements e {

    /* renamed from: a */
    boolean f3811a;
    public final c buffer = new c();
    public final w source;

    r(w wVar) {
        if (wVar == null) {
            throw new NullPointerException("source == null");
        }
        this.source = wVar;
    }

    @Override // P7.e, P7.d
    public c buffer() {
        return this.buffer;
    }

    @Override // P7.e, P7.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3811a) {
            return;
        }
        this.f3811a = true;
        this.source.close();
        this.buffer.clear();
    }

    @Override // P7.e
    public boolean exhausted() {
        if (this.f3811a) {
            throw new IllegalStateException("closed");
        }
        return this.buffer.exhausted() && this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // P7.e
    public c getBuffer() {
        return this.buffer;
    }

    @Override // P7.e
    public long indexOf(byte b9) {
        return indexOf(b9, 0L, Long.MAX_VALUE);
    }

    @Override // P7.e
    public long indexOfElement(f fVar) {
        return indexOfElement(fVar, 0L);
    }

    @Override // P7.e
    public InputStream inputStream() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f3811a;
    }

    @Override // P7.e
    public e peek() {
        return n.buffer(new p(this));
    }

    @Override // P7.e
    public boolean rangeEquals(long j8, f fVar) {
        return rangeEquals(j8, fVar, 0, fVar.size());
    }

    @Override // P7.e, P7.w
    public long read(c cVar, long j8) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j8 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
        if (this.f3811a) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.buffer;
        if (cVar2.f3775b == 0 && this.source.read(cVar2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.buffer.read(cVar, Math.min(j8, this.buffer.f3775b));
    }

    @Override // P7.e
    public long readAll(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j8 = 0;
        while (this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long jCompleteSegmentByteCount = this.buffer.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j8 += jCompleteSegmentByteCount;
                vVar.write(this.buffer, jCompleteSegmentByteCount);
            }
        }
        if (this.buffer.size() <= 0) {
            return j8;
        }
        long size = j8 + this.buffer.size();
        c cVar = this.buffer;
        vVar.write(cVar, cVar.size());
        return size;
    }

    @Override // P7.e
    public byte readByte() throws EOFException {
        require(1L);
        return this.buffer.readByte();
    }

    @Override // P7.e
    public byte[] readByteArray() {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteArray();
    }

    @Override // P7.e
    public f readByteString() {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0027, code lost:
    
        if (r0 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003d, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9] or '-' character but was %#x", java.lang.Byte.valueOf(r2)));
     */
    @Override // P7.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            r5 = this;
            r0 = 1
            r5.require(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L3e
            P7.c r2 = r5.buffer
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L25
        L1e:
            if (r0 != 0) goto L27
            r3 = 45
            if (r2 == r3) goto L25
            goto L27
        L25:
            r0 = r1
            goto L6
        L27:
            if (r0 == 0) goto L2a
            goto L3e
        L2a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L3e:
            P7.c r0 = r5.buffer
            long r0 = r0.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.r.readDecimalLong():long");
    }

    @Override // P7.e
    public void readFully(byte[] bArr) throws EOFException {
        try {
            require(bArr.length);
            this.buffer.readFully(bArr);
        } catch (EOFException e8) {
            int i8 = 0;
            while (true) {
                c cVar = this.buffer;
                long j8 = cVar.f3775b;
                if (j8 <= 0) {
                    throw e8;
                }
                int i9 = cVar.read(bArr, i8, (int) j8);
                if (i9 == -1) {
                    throw new AssertionError();
                }
                i8 += i9;
            }
        }
    }

    @Override // P7.e
    public long readHexadecimalUnsignedLong() throws EOFException {
        byte b9;
        require(1L);
        int i8 = 0;
        while (true) {
            int i9 = i8 + 1;
            if (!request(i9)) {
                break;
            }
            b9 = this.buffer.getByte(i8);
            if ((b9 < 48 || b9 > 57) && ((b9 < 97 || b9 > 102) && (b9 < 65 || b9 > 70))) {
                break;
            }
            i8 = i9;
        }
        if (i8 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(b9)));
        }
        return this.buffer.readHexadecimalUnsignedLong();
    }

    @Override // P7.e
    public int readInt() throws EOFException {
        require(4L);
        return this.buffer.readInt();
    }

    @Override // P7.e
    public int readIntLe() throws EOFException {
        require(4L);
        return this.buffer.readIntLe();
    }

    @Override // P7.e
    public long readLong() throws EOFException {
        require(8L);
        return this.buffer.readLong();
    }

    @Override // P7.e
    public long readLongLe() throws EOFException {
        require(8L);
        return this.buffer.readLongLe();
    }

    @Override // P7.e
    public short readShort() throws EOFException {
        require(2L);
        return this.buffer.readShort();
    }

    @Override // P7.e
    public short readShortLe() throws EOFException {
        require(2L);
        return this.buffer.readShortLe();
    }

    @Override // P7.e
    public String readString(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readString(charset);
    }

    @Override // P7.e
    public String readUtf8() {
        this.buffer.writeAll(this.source);
        return this.buffer.readUtf8();
    }

    @Override // P7.e
    public int readUtf8CodePoint() throws EOFException {
        require(1L);
        byte b9 = this.buffer.getByte(0L);
        if ((b9 & 224) == 192) {
            require(2L);
        } else if ((b9 & 240) == 224) {
            require(3L);
        } else if ((b9 & 248) == 240) {
            require(4L);
        }
        return this.buffer.readUtf8CodePoint();
    }

    @Override // P7.e
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return this.buffer.e(jIndexOf);
        }
        long j8 = this.buffer.f3775b;
        if (j8 != 0) {
            return readUtf8(j8);
        }
        return null;
    }

    @Override // P7.e
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // P7.e
    public boolean request(long j8) {
        c cVar;
        if (j8 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
        if (this.f3811a) {
            throw new IllegalStateException("closed");
        }
        do {
            cVar = this.buffer;
            if (cVar.f3775b >= j8) {
                return true;
            }
        } while (this.source.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // P7.e
    public void require(long j8) throws EOFException {
        if (!request(j8)) {
            throw new EOFException();
        }
    }

    @Override // P7.e
    public int select(o oVar) throws EOFException {
        if (this.f3811a) {
            throw new IllegalStateException("closed");
        }
        do {
            int iF = this.buffer.f(oVar, true);
            if (iF == -1) {
                return -1;
            }
            if (iF != -2) {
                this.buffer.skip(oVar.f3801a[iF].size());
                return iF;
            }
        } while (this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    @Override // P7.e
    public void skip(long j8) throws EOFException {
        if (this.f3811a) {
            throw new IllegalStateException("closed");
        }
        while (j8 > 0) {
            c cVar = this.buffer;
            if (cVar.f3775b == 0 && this.source.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j8, this.buffer.size());
            this.buffer.skip(jMin);
            j8 -= jMin;
        }
    }

    @Override // P7.e, P7.w
    public x timeout() {
        return this.source.timeout();
    }

    public String toString() {
        return "buffer(" + this.source + ")";
    }

    @Override // P7.e
    public long indexOf(byte b9, long j8) {
        return indexOf(b9, j8, Long.MAX_VALUE);
    }

    @Override // P7.e
    public long indexOfElement(f fVar, long j8) {
        if (this.f3811a) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = this.buffer.indexOfElement(fVar, j8);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            c cVar = this.buffer;
            long j9 = cVar.f3775b;
            if (this.source.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, j9);
        }
    }

    @Override // P7.e
    public boolean rangeEquals(long j8, f fVar, int i8, int i9) {
        if (this.f3811a) {
            throw new IllegalStateException("closed");
        }
        if (j8 < 0 || i8 < 0 || i9 < 0 || fVar.size() - i8 < i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            long j9 = i10 + j8;
            if (!request(1 + j9) || this.buffer.getByte(j9) != fVar.getByte(i8 + i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // P7.e
    public String readUtf8LineStrict(long j8) throws EOFException {
        if (j8 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j8);
        }
        long j9 = j8 == Long.MAX_VALUE ? Long.MAX_VALUE : j8 + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j9);
        if (jIndexOf != -1) {
            return this.buffer.e(jIndexOf);
        }
        if (j9 < Long.MAX_VALUE && request(j9) && this.buffer.getByte(j9 - 1) == 13 && request(1 + j9) && this.buffer.getByte(j9) == 10) {
            return this.buffer.e(j9);
        }
        c cVar = new c();
        c cVar2 = this.buffer;
        cVar2.copyTo(cVar, 0L, Math.min(32L, cVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.buffer.size(), j8) + " content=" + cVar.readByteString().hex() + (char) 8230);
    }

    @Override // P7.e
    public long indexOf(byte b9, long j8, long j9) {
        if (this.f3811a) {
            throw new IllegalStateException("closed");
        }
        if (j8 < 0 || j9 < j8) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j8), Long.valueOf(j9)));
        }
        while (j8 < j9) {
            long jIndexOf = this.buffer.indexOf(b9, j8, j9);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            c cVar = this.buffer;
            long j10 = cVar.f3775b;
            if (j10 >= j9 || this.source.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            j8 = Math.max(j8, j10);
        }
        return -1L;
    }

    @Override // P7.e
    public byte[] readByteArray(long j8) throws EOFException {
        require(j8);
        return this.buffer.readByteArray(j8);
    }

    @Override // P7.e
    public f readByteString(long j8) throws EOFException {
        require(j8);
        return this.buffer.readByteString(j8);
    }

    @Override // P7.e
    public String readUtf8(long j8) throws EOFException {
        require(j8);
        return this.buffer.readUtf8(j8);
    }

    @Override // P7.e
    public String readString(long j8, Charset charset) throws EOFException {
        require(j8);
        if (charset != null) {
            return this.buffer.readString(j8, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            r rVar = r.this;
            if (rVar.f3811a) {
                throw new IOException("closed");
            }
            return (int) Math.min(rVar.buffer.f3775b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            r.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            r rVar = r.this;
            if (rVar.f3811a) {
                throw new IOException("closed");
            }
            c cVar = rVar.buffer;
            if (cVar.f3775b == 0 && rVar.source.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return r.this.buffer.readByte() & 255;
        }

        public String toString() {
            return r.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) throws IOException {
            if (!r.this.f3811a) {
                y.checkOffsetAndCount(bArr.length, i8, i9);
                r rVar = r.this;
                c cVar = rVar.buffer;
                if (cVar.f3775b == 0 && rVar.source.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return r.this.buffer.read(bArr, i8, i9);
            }
            throw new IOException("closed");
        }
    }

    @Override // P7.e
    public void readFully(c cVar, long j8) throws EOFException {
        try {
            require(j8);
            this.buffer.readFully(cVar, j8);
        } catch (EOFException e8) {
            cVar.writeAll(this.buffer);
            throw e8;
        }
    }

    @Override // P7.e
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // P7.e
    public int read(byte[] bArr, int i8, int i9) {
        long j8 = i9;
        y.checkOffsetAndCount(bArr.length, i8, j8);
        c cVar = this.buffer;
        if (cVar.f3775b == 0 && this.source.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.buffer.read(bArr, i8, (int) Math.min(j8, this.buffer.f3775b));
    }

    @Override // P7.e
    public long indexOf(f fVar) {
        return indexOf(fVar, 0L);
    }

    @Override // P7.e
    public long indexOf(f fVar, long j8) {
        if (this.f3811a) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOf = this.buffer.indexOf(fVar, j8);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            c cVar = this.buffer;
            long j9 = cVar.f3775b;
            if (this.source.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, (j9 - fVar.size()) + 1);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        c cVar = this.buffer;
        if (cVar.f3775b == 0 && this.source.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.buffer.read(byteBuffer);
    }
}
