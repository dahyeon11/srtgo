package A2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class j extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f60a;

    /* renamed from: b, reason: collision with root package name */
    private long f61b;

    j(InputStream inputStream, long j8) {
        super(inputStream);
        this.f61b = -1L;
        e.zza(inputStream);
        this.f60a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f60a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i8) {
        ((FilterInputStream) this).in.mark(i8);
        this.f61b = this.f60a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f60a == 0) {
            return -1;
        }
        int i8 = ((FilterInputStream) this).in.read();
        if (i8 != -1) {
            this.f60a--;
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f61b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f60a = this.f61b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j8, this.f60a));
        this.f60a -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) throws IOException {
        long j8 = this.f60a;
        if (j8 == 0) {
            return -1;
        }
        int i10 = ((FilterInputStream) this).in.read(bArr, i8, (int) Math.min(i9, j8));
        if (i10 != -1) {
            this.f60a -= i10;
        }
        return i10;
    }
}
