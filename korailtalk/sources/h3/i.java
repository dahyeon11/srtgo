package h3;

import e3.w;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

/* loaded from: classes2.dex */
final class i extends Reader {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f31509a;

    /* renamed from: b, reason: collision with root package name */
    private int f31510b;

    /* renamed from: c, reason: collision with root package name */
    private int f31511c;

    public i(CharSequence charSequence) {
        this.f31509a = (CharSequence) w.checkNotNull(charSequence);
    }

    private void a() throws IOException {
        if (this.f31509a == null) {
            throw new IOException("reader closed");
        }
    }

    private boolean b() {
        return c() > 0;
    }

    private int c() {
        Objects.requireNonNull(this.f31509a);
        return this.f31509a.length() - this.f31510b;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f31509a = null;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i8) {
        w.checkArgument(i8 >= 0, "readAheadLimit (%s) may not be negative", i8);
        a();
        this.f31511c = this.f31510b;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) {
        w.checkNotNull(charBuffer);
        a();
        Objects.requireNonNull(this.f31509a);
        if (!b()) {
            return -1;
        }
        int iMin = Math.min(charBuffer.remaining(), c());
        for (int i8 = 0; i8 < iMin; i8++) {
            CharSequence charSequence = this.f31509a;
            int i9 = this.f31510b;
            this.f31510b = i9 + 1;
            charBuffer.put(charSequence.charAt(i9));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() {
        a();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() {
        a();
        this.f31510b = this.f31511c;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j8) {
        int iMin;
        w.checkArgument(j8 >= 0, "n (%s) may not be negative", j8);
        a();
        iMin = (int) Math.min(c(), j8);
        this.f31510b += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read() {
        char cCharAt;
        a();
        Objects.requireNonNull(this.f31509a);
        if (b()) {
            CharSequence charSequence = this.f31509a;
            int i8 = this.f31510b;
            this.f31510b = i8 + 1;
            cCharAt = charSequence.charAt(i8);
        } else {
            cCharAt = 65535;
        }
        return cCharAt;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i8, int i9) {
        w.checkPositionIndexes(i8, i8 + i9, cArr.length);
        a();
        Objects.requireNonNull(this.f31509a);
        if (!b()) {
            return -1;
        }
        int iMin = Math.min(i9, c());
        for (int i10 = 0; i10 < iMin; i10++) {
            CharSequence charSequence = this.f31509a;
            int i11 = this.f31510b;
            this.f31510b = i11 + 1;
            cArr[i8 + i10] = charSequence.charAt(i11);
        }
        return iMin;
    }
}
