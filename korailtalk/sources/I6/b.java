package I6;

import I6.j;
import e3.w;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class b implements K6.c {

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f2178d = Logger.getLogger(i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final a f2179a;

    /* renamed from: b, reason: collision with root package name */
    private final K6.c f2180b;

    /* renamed from: c, reason: collision with root package name */
    private final j f2181c = new j(Level.FINE, i.class);

    interface a {
        void onException(Throwable th);
    }

    b(a aVar, K6.c cVar) {
        this.f2179a = (a) w.checkNotNull(aVar, "transportExceptionHandler");
        this.f2180b = (K6.c) w.checkNotNull(cVar, "frameWriter");
    }

    static Level a(Throwable th) {
        return th.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // K6.c
    public void ackSettings(K6.i iVar) {
        this.f2181c.j(j.a.OUTBOUND);
        try {
            this.f2180b.ackSettings(iVar);
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f2180b.close();
        } catch (IOException e8) {
            f2178d.log(a(e8), "Failed closing connection", (Throwable) e8);
        }
    }

    @Override // K6.c
    public void connectionPreface() {
        try {
            this.f2180b.connectionPreface();
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // K6.c
    public void data(boolean z8, int i8, P7.c cVar, int i9) {
        this.f2181c.b(j.a.OUTBOUND, i8, cVar.buffer(), i9, z8);
        try {
            this.f2180b.data(z8, i8, cVar, i9);
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // K6.c
    public void flush() {
        try {
            this.f2180b.flush();
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // K6.c
    public void goAway(int i8, K6.a aVar, byte[] bArr) {
        this.f2181c.c(j.a.OUTBOUND, i8, aVar, P7.f.of(bArr));
        try {
            this.f2180b.goAway(i8, aVar, bArr);
            this.f2180b.flush();
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // K6.c
    public void headers(int i8, List<K6.d> list) {
        this.f2181c.d(j.a.OUTBOUND, i8, list, false);
        try {
            this.f2180b.headers(i8, list);
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // K6.c
    public int maxDataLength() {
        return this.f2180b.maxDataLength();
    }

    @Override // K6.c
    public void ping(boolean z8, int i8, int i9) {
        if (z8) {
            this.f2181c.f(j.a.OUTBOUND, (4294967295L & i9) | (i8 << 32));
        } else {
            this.f2181c.e(j.a.OUTBOUND, (4294967295L & i9) | (i8 << 32));
        }
        try {
            this.f2180b.ping(z8, i8, i9);
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // K6.c
    public void pushPromise(int i8, int i9, List<K6.d> list) {
        this.f2181c.g(j.a.OUTBOUND, i8, i9, list);
        try {
            this.f2180b.pushPromise(i8, i9, list);
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // K6.c
    public void rstStream(int i8, K6.a aVar) {
        this.f2181c.h(j.a.OUTBOUND, i8, aVar);
        try {
            this.f2180b.rstStream(i8, aVar);
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // K6.c
    public void settings(K6.i iVar) {
        this.f2181c.i(j.a.OUTBOUND, iVar);
        try {
            this.f2180b.settings(iVar);
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // K6.c
    public void synReply(boolean z8, int i8, List<K6.d> list) {
        try {
            this.f2180b.synReply(z8, i8, list);
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // K6.c
    public void synStream(boolean z8, boolean z9, int i8, int i9, List<K6.d> list) {
        try {
            this.f2180b.synStream(z8, z9, i8, i9, list);
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }

    @Override // K6.c
    public void windowUpdate(int i8, long j8) {
        this.f2181c.k(j.a.OUTBOUND, i8, j8);
        try {
            this.f2180b.windowUpdate(i8, j8);
        } catch (IOException e8) {
            this.f2179a.onException(e8);
        }
    }
}
