package E7;

import P7.g;
import P7.v;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
abstract class e extends g {

    /* renamed from: b, reason: collision with root package name */
    private boolean f1118b;

    e(v vVar) {
        super(vVar);
    }

    protected abstract void a(IOException iOException);

    @Override // P7.g, P7.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f1118b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e8) {
            this.f1118b = true;
            a(e8);
        }
    }

    @Override // P7.g, P7.v, java.io.Flushable
    public void flush() {
        if (this.f1118b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e8) {
            this.f1118b = true;
            a(e8);
        }
    }

    @Override // P7.g, P7.v
    public void write(P7.c cVar, long j8) throws EOFException {
        if (this.f1118b) {
            cVar.skip(j8);
            return;
        }
        try {
            super.write(cVar, j8);
        } catch (IOException e8) {
            this.f1118b = true;
            a(e8);
        }
    }
}
