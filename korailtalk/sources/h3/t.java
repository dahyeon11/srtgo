package h3;

import e3.w;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/* loaded from: classes2.dex */
class t extends Reader {

    /* renamed from: a */
    private final Iterator f31539a;

    /* renamed from: b */
    private Reader f31540b;

    t(Iterator it) {
        this.f31539a = it;
        a();
    }

    private void a() {
        close();
        if (this.f31539a.hasNext()) {
            this.f31540b = ((k) this.f31539a.next()).openStream();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Reader reader = this.f31540b;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f31540b = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i8, int i9) throws IOException {
        w.checkNotNull(cArr);
        Reader reader = this.f31540b;
        if (reader == null) {
            return -1;
        }
        int i10 = reader.read(cArr, i8, i9);
        if (i10 != -1) {
            return i10;
        }
        a();
        return read(cArr, i8, i9);
    }

    @Override // java.io.Reader
    public boolean ready() {
        Reader reader = this.f31540b;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long j8) throws IOException {
        w.checkArgument(j8 >= 0, "n is negative");
        if (j8 > 0) {
            while (true) {
                Reader reader = this.f31540b;
                if (reader == null) {
                    break;
                }
                long jSkip = reader.skip(j8);
                if (jSkip > 0) {
                    return jSkip;
                }
                a();
            }
        }
        return 0L;
    }
}
