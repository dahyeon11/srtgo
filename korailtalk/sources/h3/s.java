package h3;

import e3.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class s extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f31537a;

    /* renamed from: b, reason: collision with root package name */
    private InputStream f31538b;

    public s(Iterator<? extends g> it) {
        this.f31537a = (Iterator) w.checkNotNull(it);
        a();
    }

    private void a() {
        close();
        if (this.f31537a.hasNext()) {
            this.f31538b = ((g) this.f31537a.next()).openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() {
        InputStream inputStream = this.f31538b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.f31538b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f31538b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f31538b;
            if (inputStream == null) {
                return -1;
            }
            int i8 = inputStream.read();
            if (i8 != -1) {
                return i8;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j8) throws IOException {
        InputStream inputStream = this.f31538b;
        if (inputStream == null || j8 <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j8);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f31538b.skip(j8 - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) throws IOException {
        w.checkNotNull(bArr);
        while (true) {
            InputStream inputStream = this.f31538b;
            if (inputStream == null) {
                return -1;
            }
            int i10 = inputStream.read(bArr, i8, i9);
            if (i10 != -1) {
                return i10;
            }
            a();
        }
    }
}
