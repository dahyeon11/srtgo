package N7;

import P7.c;
import P7.f;
import P7.v;
import P7.x;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes3.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    final boolean f3324a;

    /* renamed from: b, reason: collision with root package name */
    final Random f3325b;

    /* renamed from: c, reason: collision with root package name */
    final P7.d f3326c;

    /* renamed from: d, reason: collision with root package name */
    final P7.c f3327d;

    /* renamed from: e, reason: collision with root package name */
    boolean f3328e;

    /* renamed from: f, reason: collision with root package name */
    final P7.c f3329f = new P7.c();

    /* renamed from: g, reason: collision with root package name */
    final a f3330g = new a();

    /* renamed from: h, reason: collision with root package name */
    boolean f3331h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f3332i;

    /* renamed from: j, reason: collision with root package name */
    private final c.C0065c f3333j;

    final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        int f3334a;

        /* renamed from: b, reason: collision with root package name */
        long f3335b;

        /* renamed from: c, reason: collision with root package name */
        boolean f3336c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3337d;

        a() {
        }

        @Override // P7.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f3337d) {
                throw new IOException("closed");
            }
            e eVar = e.this;
            eVar.d(this.f3334a, eVar.f3329f.size(), this.f3336c, true);
            this.f3337d = true;
            e.this.f3331h = false;
        }

        @Override // P7.v, java.io.Flushable
        public void flush() throws IOException {
            if (this.f3337d) {
                throw new IOException("closed");
            }
            e eVar = e.this;
            eVar.d(this.f3334a, eVar.f3329f.size(), this.f3336c, false);
            this.f3336c = false;
        }

        @Override // P7.v
        public x timeout() {
            return e.this.f3326c.timeout();
        }

        @Override // P7.v
        public void write(P7.c cVar, long j8) throws IOException {
            if (this.f3337d) {
                throw new IOException("closed");
            }
            e.this.f3329f.write(cVar, j8);
            boolean z8 = this.f3336c && this.f3335b != -1 && e.this.f3329f.size() > this.f3335b - PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            long jCompleteSegmentByteCount = e.this.f3329f.completeSegmentByteCount();
            if (jCompleteSegmentByteCount <= 0 || z8) {
                return;
            }
            e.this.d(this.f3334a, jCompleteSegmentByteCount, this.f3336c, false);
            this.f3336c = false;
        }
    }

    e(boolean z8, P7.d dVar, Random random) {
        if (dVar == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.f3324a = z8;
        this.f3326c = dVar;
        this.f3327d = dVar.buffer();
        this.f3325b = random;
        this.f3332i = z8 ? new byte[4] : null;
        this.f3333j = z8 ? new c.C0065c() : null;
    }

    private void c(int i8, f fVar) throws IOException {
        if (this.f3328e) {
            throw new IOException("closed");
        }
        int size = fVar.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f3327d.writeByte(i8 | 128);
        if (this.f3324a) {
            this.f3327d.writeByte(size | 128);
            this.f3325b.nextBytes(this.f3332i);
            this.f3327d.write(this.f3332i);
            if (size > 0) {
                long size2 = this.f3327d.size();
                this.f3327d.write(fVar);
                this.f3327d.readAndWriteUnsafe(this.f3333j);
                this.f3333j.seek(size2);
                c.b(this.f3333j, this.f3332i);
                this.f3333j.close();
            }
        } else {
            this.f3327d.writeByte(size);
            this.f3327d.write(fVar);
        }
        this.f3326c.flush();
    }

    v a(int i8, long j8) {
        if (this.f3331h) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.f3331h = true;
        a aVar = this.f3330g;
        aVar.f3334a = i8;
        aVar.f3335b = j8;
        aVar.f3336c = true;
        aVar.f3337d = false;
        return aVar;
    }

    void b(int i8, f fVar) {
        f byteString = f.EMPTY;
        if (i8 != 0 || fVar != null) {
            if (i8 != 0) {
                c.c(i8);
            }
            P7.c cVar = new P7.c();
            cVar.writeShort(i8);
            if (fVar != null) {
                cVar.write(fVar);
            }
            byteString = cVar.readByteString();
        }
        try {
            c(8, byteString);
        } finally {
            this.f3328e = true;
        }
    }

    void d(int i8, long j8, boolean z8, boolean z9) throws IOException {
        if (this.f3328e) {
            throw new IOException("closed");
        }
        if (!z8) {
            i8 = 0;
        }
        if (z9) {
            i8 |= 128;
        }
        this.f3327d.writeByte(i8);
        int i9 = this.f3324a ? 128 : 0;
        if (j8 <= 125) {
            this.f3327d.writeByte(((int) j8) | i9);
        } else if (j8 <= 65535) {
            this.f3327d.writeByte(i9 | 126);
            this.f3327d.writeShort((int) j8);
        } else {
            this.f3327d.writeByte(i9 | 127);
            this.f3327d.writeLong(j8);
        }
        if (this.f3324a) {
            this.f3325b.nextBytes(this.f3332i);
            this.f3327d.write(this.f3332i);
            if (j8 > 0) {
                long size = this.f3327d.size();
                this.f3327d.write(this.f3329f, j8);
                this.f3327d.readAndWriteUnsafe(this.f3333j);
                this.f3333j.seek(size);
                c.b(this.f3333j, this.f3332i);
                this.f3333j.close();
            }
        } else {
            this.f3327d.write(this.f3329f, j8);
        }
        this.f3326c.emit();
    }

    void e(f fVar) throws IOException {
        c(9, fVar);
    }

    void f(f fVar) throws IOException {
        c(10, fVar);
    }
}
