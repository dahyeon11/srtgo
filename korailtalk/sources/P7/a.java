package P7;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class a extends x {

    /* renamed from: g */
    private static final long f3761g;

    /* renamed from: h */
    private static final long f3762h;

    /* renamed from: i */
    static a f3763i;

    /* renamed from: d */
    private boolean f3764d;

    /* renamed from: e */
    private a f3765e;

    /* renamed from: f */
    private long f3766f;

    /* renamed from: P7.a$a */
    class C0064a implements v {

        /* renamed from: a */
        final /* synthetic */ v f3767a;

        C0064a(v vVar) {
            this.f3767a = vVar;
        }

        @Override // P7.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.enter();
            try {
                try {
                    this.f3767a.close();
                    a.this.d(true);
                } catch (IOException e8) {
                    throw a.this.c(e8);
                }
            } catch (Throwable th) {
                a.this.d(false);
                throw th;
            }
        }

        @Override // P7.v, java.io.Flushable
        public void flush() throws IOException {
            a.this.enter();
            try {
                try {
                    this.f3767a.flush();
                    a.this.d(true);
                } catch (IOException e8) {
                    throw a.this.c(e8);
                }
            } catch (Throwable th) {
                a.this.d(false);
                throw th;
            }
        }

        @Override // P7.v
        public x timeout() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f3767a + ")";
        }

        @Override // P7.v
        public void write(P7.c cVar, long j8) throws IOException {
            y.checkOffsetAndCount(cVar.f3775b, 0L, j8);
            while (true) {
                long j9 = 0;
                if (j8 <= 0) {
                    return;
                }
                s sVar = cVar.f3774a;
                while (true) {
                    if (j9 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j9 += sVar.f3815c - sVar.f3814b;
                    if (j9 >= j8) {
                        j9 = j8;
                        break;
                    }
                    sVar = sVar.f3818f;
                }
                a.this.enter();
                try {
                    try {
                        this.f3767a.write(cVar, j9);
                        j8 -= j9;
                        a.this.d(true);
                    } catch (IOException e8) {
                        throw a.this.c(e8);
                    }
                } catch (Throwable th) {
                    a.this.d(false);
                    throw th;
                }
            }
        }
    }

    class b implements w {

        /* renamed from: a */
        final /* synthetic */ w f3769a;

        b(w wVar) {
            this.f3769a = wVar;
        }

        @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.enter();
            try {
                try {
                    this.f3769a.close();
                    a.this.d(true);
                } catch (IOException e8) {
                    throw a.this.c(e8);
                }
            } catch (Throwable th) {
                a.this.d(false);
                throw th;
            }
        }

        @Override // P7.w
        public long read(P7.c cVar, long j8) throws IOException {
            a.this.enter();
            try {
                try {
                    long j9 = this.f3769a.read(cVar, j8);
                    a.this.d(true);
                    return j9;
                } catch (IOException e8) {
                    throw a.this.c(e8);
                }
            } catch (Throwable th) {
                a.this.d(false);
                throw th;
            }
        }

        @Override // P7.w
        public x timeout() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f3769a + ")";
        }
    }

    private static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x0017, code lost:
        
            r1.h();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<P7.a> r0 = P7.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                P7.a r1 = P7.a.a()     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r1 = move-exception
                goto L1b
            Ld:
                P7.a r2 = P7.a.f3763i     // Catch: java.lang.Throwable -> Lb
                if (r1 != r2) goto L16
                r1 = 0
                P7.a.f3763i = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                r1.h()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: P7.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f3761g = millis;
        f3762h = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    static a a() throws InterruptedException {
        a aVar = f3763i.f3765e;
        if (aVar == null) {
            long jNanoTime = System.nanoTime();
            a.class.wait(f3761g);
            if (f3763i.f3765e != null || System.nanoTime() - jNanoTime < f3762h) {
                return null;
            }
            return f3763i;
        }
        long jF = aVar.f(System.nanoTime());
        if (jF > 0) {
            long j8 = jF / 1000000;
            a.class.wait(j8, (int) (jF - (1000000 * j8)));
            return null;
        }
        f3763i.f3765e = aVar.f3765e;
        aVar.f3765e = null;
        return aVar;
    }

    private static synchronized boolean b(a aVar) {
        a aVar2 = f3763i;
        while (aVar2 != null) {
            a aVar3 = aVar2.f3765e;
            if (aVar3 == aVar) {
                aVar2.f3765e = aVar.f3765e;
                aVar.f3765e = null;
                return false;
            }
            aVar2 = aVar3;
        }
        return true;
    }

    private long f(long j8) {
        return this.f3766f - j8;
    }

    private static synchronized void g(a aVar, long j8, boolean z8) {
        try {
            if (f3763i == null) {
                f3763i = new a();
                new c().start();
            }
            long jNanoTime = System.nanoTime();
            if (j8 != 0 && z8) {
                aVar.f3766f = Math.min(j8, aVar.deadlineNanoTime() - jNanoTime) + jNanoTime;
            } else if (j8 != 0) {
                aVar.f3766f = j8 + jNanoTime;
            } else {
                if (!z8) {
                    throw new AssertionError();
                }
                aVar.f3766f = aVar.deadlineNanoTime();
            }
            long jF = aVar.f(jNanoTime);
            a aVar2 = f3763i;
            while (true) {
                a aVar3 = aVar2.f3765e;
                if (aVar3 == null || jF < aVar3.f(jNanoTime)) {
                    break;
                } else {
                    aVar2 = aVar2.f3765e;
                }
            }
            aVar.f3765e = aVar2.f3765e;
            aVar2.f3765e = aVar;
            if (aVar2 == f3763i) {
                a.class.notify();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final IOException c(IOException iOException) {
        return !exit() ? iOException : e(iOException);
    }

    final void d(boolean z8) throws IOException {
        if (exit() && z8) {
            throw e(null);
        }
    }

    protected IOException e(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void enter() {
        if (this.f3764d) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            this.f3764d = true;
            g(this, jTimeoutNanos, zHasDeadline);
        }
    }

    public final boolean exit() {
        if (!this.f3764d) {
            return false;
        }
        this.f3764d = false;
        return b(this);
    }

    public final v sink(v vVar) {
        return new C0064a(vVar);
    }

    public final w source(w wVar) {
        return new b(wVar);
    }

    protected void h() {
    }
}
