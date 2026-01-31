package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
final class m extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f29813a;

    /* renamed from: b, reason: collision with root package name */
    private long f29814b;

    /* renamed from: c, reason: collision with root package name */
    private long f29815c;

    /* renamed from: d, reason: collision with root package name */
    private long f29816d;

    /* renamed from: e, reason: collision with root package name */
    private long f29817e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29818f;

    /* renamed from: g, reason: collision with root package name */
    private int f29819g;

    m(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void a(long j8) throws IOException {
        try {
            long j9 = this.f29815c;
            long j10 = this.f29814b;
            if (j9 >= j10 || j10 > this.f29816d) {
                this.f29815c = j10;
                this.f29813a.mark((int) (j8 - j10));
            } else {
                this.f29813a.reset();
                this.f29813a.mark((int) (j8 - this.f29815c));
                b(this.f29815c, this.f29814b);
            }
            this.f29816d = j8;
        } catch (IOException e8) {
            throw new IllegalStateException("Unable to mark: " + e8);
        }
    }

    private void b(long j8, long j9) throws IOException {
        while (j8 < j9) {
            long jSkip = this.f29813a.skip(j9 - j8);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j8 += jSkip;
        }
    }

    public void allowMarksToExpire(boolean z8) {
        this.f29818f = z8;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f29813a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f29813a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i8) {
        this.f29817e = savePosition(i8);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f29813a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.f29818f) {
            long j8 = this.f29814b + 1;
            long j9 = this.f29816d;
            if (j8 > j9) {
                a(j9 + this.f29819g);
            }
        }
        int i8 = this.f29813a.read();
        if (i8 != -1) {
            this.f29814b++;
        }
        return i8;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        reset(this.f29817e);
    }

    public long savePosition(int i8) throws IOException {
        long j8 = this.f29814b + i8;
        if (this.f29816d < j8) {
            a(j8);
        }
        return this.f29814b;
    }

    @Override // java.io.InputStream
    public long skip(long j8) throws IOException {
        if (!this.f29818f) {
            long j9 = this.f29814b;
            if (j9 + j8 > this.f29816d) {
                a(j9 + j8 + this.f29819g);
            }
        }
        long jSkip = this.f29813a.skip(j8);
        this.f29814b += jSkip;
        return jSkip;
    }

    m(InputStream inputStream, int i8) {
        this(inputStream, i8, 1024);
    }

    public void reset(long j8) throws IOException {
        if (this.f29814b > this.f29816d || j8 < this.f29815c) {
            throw new IOException("Cannot reset");
        }
        this.f29813a.reset();
        b(this.f29815c, j8);
        this.f29814b = j8;
    }

    private m(InputStream inputStream, int i8, int i9) {
        this.f29817e = -1L;
        this.f29818f = true;
        this.f29819g = -1;
        this.f29813a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i8);
        this.f29819g = i9;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.f29818f) {
            long j8 = this.f29814b;
            if (bArr.length + j8 > this.f29816d) {
                a(j8 + bArr.length + this.f29819g);
            }
        }
        int i8 = this.f29813a.read(bArr);
        if (i8 != -1) {
            this.f29814b += i8;
        }
        return i8;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) throws IOException {
        if (!this.f29818f) {
            long j8 = this.f29814b;
            long j9 = i9;
            if (j8 + j9 > this.f29816d) {
                a(j8 + j9 + this.f29819g);
            }
        }
        int i10 = this.f29813a.read(bArr, i8, i9);
        if (i10 != -1) {
            this.f29814b += i10;
        }
        return i10;
    }
}
