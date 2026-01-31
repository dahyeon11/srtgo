package P7;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
final class q implements d {

    /* renamed from: a */
    boolean f3809a;
    public final c buffer = new c();
    public final v sink;

    q(v vVar) {
        if (vVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.sink = vVar;
    }

    @Override // P7.d
    public c buffer() {
        return this.buffer;
    }

    @Override // P7.d, P7.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f3809a) {
            return;
        }
        try {
            c cVar = this.buffer;
            long j8 = cVar.f3775b;
            if (j8 > 0) {
                this.sink.write(cVar, j8);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f3809a = true;
        if (th != null) {
            y.sneakyRethrow(th);
        }
    }

    @Override // P7.d
    public d emit() {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        long size = this.buffer.size();
        if (size > 0) {
            this.sink.write(this.buffer, size);
        }
        return this;
    }

    @Override // P7.d
    public d emitCompleteSegments() {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        long jCompleteSegmentByteCount = this.buffer.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            this.sink.write(this.buffer, jCompleteSegmentByteCount);
        }
        return this;
    }

    @Override // P7.d, P7.v, java.io.Flushable
    public void flush() {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.buffer;
        long j8 = cVar.f3775b;
        if (j8 > 0) {
            this.sink.write(cVar, j8);
        }
        this.sink.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f3809a;
    }

    @Override // P7.d
    public OutputStream outputStream() {
        return new a();
    }

    @Override // P7.d, P7.v
    public x timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "buffer(" + this.sink + ")";
    }

    @Override // P7.d, P7.v
    public void write(c cVar, long j8) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.write(cVar, j8);
        emitCompleteSegments();
    }

    @Override // P7.d
    public long writeAll(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j8 = 0;
        while (true) {
            long j9 = wVar.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j9 == -1) {
                return j8;
            }
            j8 += j9;
            emitCompleteSegments();
        }
    }

    @Override // P7.d
    public d writeByte(int i8) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeByte(i8);
        return emitCompleteSegments();
    }

    @Override // P7.d
    public d writeDecimalLong(long j8) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeDecimalLong(j8);
        return emitCompleteSegments();
    }

    @Override // P7.d
    public d writeHexadecimalUnsignedLong(long j8) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeHexadecimalUnsignedLong(j8);
        return emitCompleteSegments();
    }

    @Override // P7.d
    public d writeInt(int i8) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeInt(i8);
        return emitCompleteSegments();
    }

    @Override // P7.d
    public d writeIntLe(int i8) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeIntLe(i8);
        return emitCompleteSegments();
    }

    @Override // P7.d
    public d writeLong(long j8) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeLong(j8);
        return emitCompleteSegments();
    }

    @Override // P7.d
    public d writeLongLe(long j8) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeLongLe(j8);
        return emitCompleteSegments();
    }

    @Override // P7.d
    public d writeShort(int i8) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeShort(i8);
        return emitCompleteSegments();
    }

    @Override // P7.d
    public d writeShortLe(int i8) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeShortLe(i8);
        return emitCompleteSegments();
    }

    @Override // P7.d
    public d writeString(String str, Charset charset) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeString(str, charset);
        return emitCompleteSegments();
    }

    @Override // P7.d
    public d writeUtf8(String str) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeUtf8(str);
        return emitCompleteSegments();
    }

    @Override // P7.d
    public d writeUtf8CodePoint(int i8) {
        if (this.f3809a) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeUtf8CodePoint(i8);
        return emitCompleteSegments();
    }

    class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            q.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            q qVar = q.this;
            if (qVar.f3809a) {
                return;
            }
            qVar.flush();
        }

        public String toString() {
            return q.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i8) throws IOException {
            q qVar = q.this;
            if (qVar.f3809a) {
                throw new IOException("closed");
            }
            qVar.buffer.writeByte((int) ((byte) i8));
            q.this.emitCompleteSegments();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) throws IOException {
            q qVar = q.this;
            if (!qVar.f3809a) {
                qVar.buffer.write(bArr, i8, i9);
                q.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // P7.d
    public d write(f fVar) {
        if (!this.f3809a) {
            this.buffer.write(fVar);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // P7.d
    public d writeString(String str, int i8, int i9, Charset charset) {
        if (!this.f3809a) {
            this.buffer.writeString(str, i8, i9, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // P7.d
    public d writeUtf8(String str, int i8, int i9) {
        if (!this.f3809a) {
            this.buffer.writeUtf8(str, i8, i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // P7.d
    public d write(byte[] bArr) {
        if (!this.f3809a) {
            this.buffer.write(bArr);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // P7.d
    public d write(byte[] bArr, int i8, int i9) {
        if (!this.f3809a) {
            this.buffer.write(bArr, i8, i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (!this.f3809a) {
            int iWrite = this.buffer.write(byteBuffer);
            emitCompleteSegments();
            return iWrite;
        }
        throw new IllegalStateException("closed");
    }

    @Override // P7.d
    public d write(w wVar, long j8) throws EOFException {
        while (j8 > 0) {
            long j9 = wVar.read(this.buffer, j8);
            if (j9 != -1) {
                j8 -= j9;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
