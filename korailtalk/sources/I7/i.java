package I7;

import C7.z;
import P7.v;
import P7.w;
import P7.x;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a */
    long f2475a = 0;

    /* renamed from: b */
    long f2476b;

    /* renamed from: c */
    final int f2477c;

    /* renamed from: d */
    final f f2478d;

    /* renamed from: e */
    private final Deque f2479e;

    /* renamed from: f */
    private boolean f2480f;

    /* renamed from: g */
    private final b f2481g;

    /* renamed from: h */
    final a f2482h;

    /* renamed from: i */
    final c f2483i;

    /* renamed from: j */
    final c f2484j;

    /* renamed from: k */
    I7.b f2485k;

    /* renamed from: l */
    IOException f2486l;

    final class a implements v {

        /* renamed from: a */
        private final P7.c f2487a = new P7.c();

        /* renamed from: b */
        private z f2488b;

        /* renamed from: c */
        boolean f2489c;

        /* renamed from: d */
        boolean f2490d;

        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:75:0x005c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                I7.i r0 = I7.i.this
                monitor-enter(r0)
                I7.i r1 = I7.i.this     // Catch: java.lang.Throwable -> L79
                I7.i$c r1 = r1.f2484j     // Catch: java.lang.Throwable -> L79
                r1.enter()     // Catch: java.lang.Throwable -> L79
            La:
                I7.i r1 = I7.i.this     // Catch: java.lang.Throwable -> L24
                long r2 = r1.f2476b     // Catch: java.lang.Throwable -> L24
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 > 0) goto L26
                boolean r2 = r11.f2490d     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L26
                boolean r2 = r11.f2489c     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L26
                I7.b r2 = r1.f2485k     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L26
                r1.h()     // Catch: java.lang.Throwable -> L24
                goto La
            L24:
                r12 = move-exception
                goto L7b
            L26:
                I7.i$c r1 = r1.f2484j     // Catch: java.lang.Throwable -> L79
                r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L79
                I7.i r1 = I7.i.this     // Catch: java.lang.Throwable -> L79
                r1.c()     // Catch: java.lang.Throwable -> L79
                I7.i r1 = I7.i.this     // Catch: java.lang.Throwable -> L79
                long r1 = r1.f2476b     // Catch: java.lang.Throwable -> L79
                P7.c r3 = r11.f2487a     // Catch: java.lang.Throwable -> L79
                long r3 = r3.size()     // Catch: java.lang.Throwable -> L79
                long r9 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> L79
                I7.i r1 = I7.i.this     // Catch: java.lang.Throwable -> L79
                long r2 = r1.f2476b     // Catch: java.lang.Throwable -> L79
                long r2 = r2 - r9
                r1.f2476b = r2     // Catch: java.lang.Throwable -> L79
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
                I7.i$c r0 = r1.f2484j
                r0.enter()
                if (r12 == 0) goto L5c
                P7.c r12 = r11.f2487a     // Catch: java.lang.Throwable -> L5a
                long r0 = r12.size()     // Catch: java.lang.Throwable -> L5a
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L5c
                r12 = 1
            L58:
                r7 = r12
                goto L5e
            L5a:
                r12 = move-exception
                goto L71
            L5c:
                r12 = 0
                goto L58
            L5e:
                I7.i r12 = I7.i.this     // Catch: java.lang.Throwable -> L5a
                I7.f r5 = r12.f2478d     // Catch: java.lang.Throwable -> L5a
                int r6 = r12.f2477c     // Catch: java.lang.Throwable -> L5a
                P7.c r8 = r11.f2487a     // Catch: java.lang.Throwable -> L5a
                r5.writeData(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5a
                I7.i r12 = I7.i.this
                I7.i$c r12 = r12.f2484j
                r12.exitAndThrowIfTimedOut()
                return
            L71:
                I7.i r0 = I7.i.this
                I7.i$c r0 = r0.f2484j
                r0.exitAndThrowIfTimedOut()
                throw r12
            L79:
                r12 = move-exception
                goto L83
            L7b:
                I7.i r1 = I7.i.this     // Catch: java.lang.Throwable -> L79
                I7.i$c r1 = r1.f2484j     // Catch: java.lang.Throwable -> L79
                r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L79
                throw r12     // Catch: java.lang.Throwable -> L79
            L83:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: I7.i.a.b(boolean):void");
        }

        @Override // P7.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (i.this) {
                try {
                    if (this.f2489c) {
                        return;
                    }
                    if (!i.this.f2482h.f2490d) {
                        boolean z8 = this.f2487a.size() > 0;
                        if (this.f2488b != null) {
                            while (this.f2487a.size() > 0) {
                                b(false);
                            }
                            i iVar = i.this;
                            iVar.f2478d.z(iVar.f2477c, true, D7.e.toHeaderBlock(this.f2488b));
                        } else if (z8) {
                            while (this.f2487a.size() > 0) {
                                b(true);
                            }
                        } else {
                            i iVar2 = i.this;
                            iVar2.f2478d.writeData(iVar2.f2477c, true, null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        this.f2489c = true;
                    }
                    i.this.f2478d.flush();
                    i.this.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // P7.v, java.io.Flushable
        public void flush() throws IOException {
            synchronized (i.this) {
                i.this.c();
            }
            while (this.f2487a.size() > 0) {
                b(false);
                i.this.f2478d.flush();
            }
        }

        @Override // P7.v
        public x timeout() {
            return i.this.f2484j;
        }

        @Override // P7.v
        public void write(P7.c cVar, long j8) throws IOException {
            this.f2487a.write(cVar, j8);
            while (this.f2487a.size() >= PlaybackStateCompat.ACTION_PREPARE) {
                b(false);
            }
        }
    }

    private final class b implements w {

        /* renamed from: a */
        private final P7.c f2492a = new P7.c();

        /* renamed from: b */
        private final P7.c f2493b = new P7.c();

        /* renamed from: c */
        private final long f2494c;

        /* renamed from: d */
        private z f2495d;

        /* renamed from: e */
        boolean f2496e;

        /* renamed from: f */
        boolean f2497f;

        b(long j8) {
            this.f2494c = j8;
        }

        private void f(long j8) {
            i.this.f2478d.y(j8);
        }

        @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            synchronized (i.this) {
                this.f2496e = true;
                size = this.f2493b.size();
                this.f2493b.clear();
                i.this.notifyAll();
            }
            if (size > 0) {
                f(size);
            }
            i.this.b();
        }

        void e(P7.e eVar, long j8) throws EOFException {
            boolean z8;
            boolean z9;
            long size;
            while (j8 > 0) {
                synchronized (i.this) {
                    z8 = this.f2497f;
                    z9 = this.f2493b.size() + j8 > this.f2494c;
                }
                if (z9) {
                    eVar.skip(j8);
                    i.this.closeLater(I7.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z8) {
                    eVar.skip(j8);
                    return;
                }
                long j9 = eVar.read(this.f2492a, j8);
                if (j9 == -1) {
                    throw new EOFException();
                }
                j8 -= j9;
                synchronized (i.this) {
                    try {
                        if (this.f2496e) {
                            size = this.f2492a.size();
                            this.f2492a.clear();
                        } else {
                            boolean z10 = this.f2493b.size() == 0;
                            this.f2493b.writeAll(this.f2492a);
                            if (z10) {
                                i.this.notifyAll();
                            }
                            size = 0;
                        }
                    } finally {
                    }
                }
                if (size > 0) {
                    f(size);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:97:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0096  */
        @Override // P7.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(P7.c r12, long r13) throws java.lang.Throwable {
            /*
                r11 = this;
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto Lac
            L6:
                I7.i r2 = I7.i.this
                monitor-enter(r2)
                I7.i r3 = I7.i.this     // Catch: java.lang.Throwable -> L83
                I7.i$c r3 = r3.f2483i     // Catch: java.lang.Throwable -> L83
                r3.enter()     // Catch: java.lang.Throwable -> L83
                I7.i r3 = I7.i.this     // Catch: java.lang.Throwable -> L25
                I7.b r4 = r3.f2485k     // Catch: java.lang.Throwable -> L25
                if (r4 == 0) goto L28
                java.io.IOException r3 = r3.f2486l     // Catch: java.lang.Throwable -> L25
                if (r3 == 0) goto L1b
                goto L29
            L1b:
                I7.n r3 = new I7.n     // Catch: java.lang.Throwable -> L25
                I7.i r4 = I7.i.this     // Catch: java.lang.Throwable -> L25
                I7.b r4 = r4.f2485k     // Catch: java.lang.Throwable -> L25
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
                goto L29
            L25:
                r12 = move-exception
                goto La2
            L28:
                r3 = 0
            L29:
                boolean r4 = r11.f2496e     // Catch: java.lang.Throwable -> L25
                if (r4 != 0) goto L9a
                P7.c r4 = r11.f2493b     // Catch: java.lang.Throwable -> L25
                long r4 = r4.size()     // Catch: java.lang.Throwable -> L25
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                r5 = -1
                if (r4 <= 0) goto L6f
                P7.c r4 = r11.f2493b     // Catch: java.lang.Throwable -> L25
                long r7 = r4.size()     // Catch: java.lang.Throwable -> L25
                long r13 = java.lang.Math.min(r13, r7)     // Catch: java.lang.Throwable -> L25
                long r12 = r4.read(r12, r13)     // Catch: java.lang.Throwable -> L25
                I7.i r14 = I7.i.this     // Catch: java.lang.Throwable -> L25
                long r7 = r14.f2475a     // Catch: java.lang.Throwable -> L25
                long r7 = r7 + r12
                r14.f2475a = r7     // Catch: java.lang.Throwable -> L25
                if (r3 != 0) goto L86
                I7.f r14 = r14.f2478d     // Catch: java.lang.Throwable -> L25
                I7.m r14 = r14.f2407t     // Catch: java.lang.Throwable -> L25
                int r14 = r14.d()     // Catch: java.lang.Throwable -> L25
                int r14 = r14 / 2
                long r9 = (long) r14     // Catch: java.lang.Throwable -> L25
                int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r14 < 0) goto L86
                I7.i r14 = I7.i.this     // Catch: java.lang.Throwable -> L25
                I7.f r4 = r14.f2478d     // Catch: java.lang.Throwable -> L25
                int r7 = r14.f2477c     // Catch: java.lang.Throwable -> L25
                long r8 = r14.f2475a     // Catch: java.lang.Throwable -> L25
                r4.D(r7, r8)     // Catch: java.lang.Throwable -> L25
                I7.i r14 = I7.i.this     // Catch: java.lang.Throwable -> L25
                r14.f2475a = r0     // Catch: java.lang.Throwable -> L25
                goto L86
            L6f:
                boolean r4 = r11.f2497f     // Catch: java.lang.Throwable -> L25
                if (r4 != 0) goto L85
                if (r3 != 0) goto L85
                I7.i r3 = I7.i.this     // Catch: java.lang.Throwable -> L25
                r3.h()     // Catch: java.lang.Throwable -> L25
                I7.i r3 = I7.i.this     // Catch: java.lang.Throwable -> L83
                I7.i$c r3 = r3.f2483i     // Catch: java.lang.Throwable -> L83
                r3.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L83
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                goto L6
            L83:
                r12 = move-exception
                goto Laa
            L85:
                r12 = r5
            L86:
                I7.i r14 = I7.i.this     // Catch: java.lang.Throwable -> L83
                I7.i$c r14 = r14.f2483i     // Catch: java.lang.Throwable -> L83
                r14.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L83
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r14 == 0) goto L96
                r11.f(r12)
                return r12
            L96:
                if (r3 != 0) goto L99
                return r5
            L99:
                throw r3
            L9a:
                java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L25
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch: java.lang.Throwable -> L25
                throw r12     // Catch: java.lang.Throwable -> L25
            La2:
                I7.i r13 = I7.i.this     // Catch: java.lang.Throwable -> L83
                I7.i$c r13 = r13.f2483i     // Catch: java.lang.Throwable -> L83
                r13.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L83
                throw r12     // Catch: java.lang.Throwable -> L83
            Laa:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                throw r12
            Lac:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: I7.i.b.read(P7.c, long):long");
        }

        @Override // P7.w
        public x timeout() {
            return i.this.f2483i;
        }
    }

    class c extends P7.a {
        c() {
        }

        @Override // P7.a
        protected IOException e(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw e(null);
            }
        }

        @Override // P7.a
        protected void h() {
            i.this.closeLater(I7.b.CANCEL);
            i.this.f2478d.w();
        }
    }

    i(int i8, f fVar, boolean z8, boolean z9, z zVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f2479e = arrayDeque;
        this.f2483i = new c();
        this.f2484j = new c();
        if (fVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f2477c = i8;
        this.f2478d = fVar;
        this.f2476b = fVar.f2408u.d();
        b bVar = new b(fVar.f2407t.d());
        this.f2481g = bVar;
        a aVar = new a();
        this.f2482h = aVar;
        bVar.f2497f = z9;
        aVar.f2490d = z8;
        if (zVar != null) {
            arrayDeque.add(zVar);
        }
        if (isLocallyInitiated() && zVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!isLocallyInitiated() && zVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean d(I7.b bVar, IOException iOException) {
        synchronized (this) {
            try {
                if (this.f2485k != null) {
                    return false;
                }
                if (this.f2481g.f2497f && this.f2482h.f2490d) {
                    return false;
                }
                this.f2485k = bVar;
                this.f2486l = iOException;
                notifyAll();
                this.f2478d.v(this.f2477c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a(long j8) {
        this.f2476b += j8;
        if (j8 > 0) {
            notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void b() {
        /*
            r2 = this;
            monitor-enter(r2)
            I7.i$b r0 = r2.f2481g     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f2497f     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L1a
            boolean r0 = r0.f2496e     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            I7.i$a r0 = r2.f2482h     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f2490d     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            boolean r0 = r0.f2489c     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            goto L18
        L16:
            r0 = move-exception
            goto L33
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            boolean r1 = r2.isOpen()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L29
            I7.b r0 = I7.b.CANCEL
            r1 = 0
            r2.close(r0, r1)
            goto L32
        L29:
            if (r1 != 0) goto L32
            I7.f r0 = r2.f2478d
            int r1 = r2.f2477c
            r0.v(r1)
        L32:
            return
        L33:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I7.i.b():void");
    }

    void c() throws IOException {
        a aVar = this.f2482h;
        if (aVar.f2489c) {
            throw new IOException("stream closed");
        }
        if (aVar.f2490d) {
            throw new IOException("stream finished");
        }
        if (this.f2485k != null) {
            IOException iOException = this.f2486l;
            if (iOException == null) {
                throw new n(this.f2485k);
            }
        }
    }

    public void close(I7.b bVar, IOException iOException) {
        if (d(bVar, iOException)) {
            this.f2478d.B(this.f2477c, bVar);
        }
    }

    public void closeLater(I7.b bVar) {
        if (d(bVar, null)) {
            this.f2478d.C(this.f2477c, bVar);
        }
    }

    void e(P7.e eVar, int i8) {
        this.f2481g.e(eVar, i8);
    }

    public void enqueueTrailers(z zVar) {
        synchronized (this) {
            try {
                if (this.f2482h.f2490d) {
                    throw new IllegalStateException("already finished");
                }
                if (zVar.size() == 0) {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
                this.f2482h.f2488b = zVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void f(z zVar, boolean z8) {
        boolean zIsOpen;
        synchronized (this) {
            try {
                if (this.f2480f && z8) {
                    this.f2481g.f2495d = zVar;
                } else {
                    this.f2480f = true;
                    this.f2479e.add(zVar);
                }
                if (z8) {
                    this.f2481g.f2497f = true;
                }
                zIsOpen = isOpen();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsOpen) {
            return;
        }
        this.f2478d.v(this.f2477c);
    }

    synchronized void g(I7.b bVar) {
        if (this.f2485k == null) {
            this.f2485k = bVar;
            notifyAll();
        }
    }

    public f getConnection() {
        return this.f2478d;
    }

    public synchronized I7.b getErrorCode() {
        return this.f2485k;
    }

    public int getId() {
        return this.f2477c;
    }

    public v getSink() {
        synchronized (this) {
            try {
                if (!this.f2480f && !isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f2482h;
    }

    public w getSource() {
        return this.f2481g;
    }

    void h() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public boolean isLocallyInitiated() {
        return this.f2478d.f2388a == ((this.f2477c & 1) == 1);
    }

    public synchronized boolean isOpen() {
        try {
            if (this.f2485k != null) {
                return false;
            }
            b bVar = this.f2481g;
            if (bVar.f2497f || bVar.f2496e) {
                a aVar = this.f2482h;
                if (aVar.f2490d || aVar.f2489c) {
                    if (this.f2480f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public x readTimeout() {
        return this.f2483i;
    }

    public synchronized z takeHeaders() throws IOException {
        this.f2483i.enter();
        while (this.f2479e.isEmpty() && this.f2485k == null) {
            try {
                h();
            } catch (Throwable th) {
                this.f2483i.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.f2483i.exitAndThrowIfTimedOut();
        if (this.f2479e.isEmpty()) {
            IOException iOException = this.f2486l;
            if (iOException != null) {
                throw iOException;
            }
            throw new n(this.f2485k);
        }
        return (z) this.f2479e.removeFirst();
    }

    public synchronized z trailers() throws IOException {
        try {
            if (this.f2485k != null) {
                IOException iOException = this.f2486l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new n(this.f2485k);
            }
            b bVar = this.f2481g;
            if (!bVar.f2497f || !bVar.f2492a.exhausted() || !this.f2481g.f2493b.exhausted()) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
        } finally {
        }
        return this.f2481g.f2495d != null ? this.f2481g.f2495d : D7.e.EMPTY_HEADERS;
    }

    public void writeHeaders(List<I7.c> list, boolean z8, boolean z9) {
        if (list == null) {
            throw new NullPointerException("headers == null");
        }
        synchronized (this) {
            try {
                this.f2480f = true;
                if (z8) {
                    this.f2482h.f2490d = true;
                }
            } finally {
            }
        }
        if (!z9) {
            synchronized (this.f2478d) {
                z9 = this.f2478d.f2406s == 0;
            }
        }
        this.f2478d.z(this.f2477c, z8, list);
        if (z9) {
            this.f2478d.flush();
        }
    }

    public x writeTimeout() {
        return this.f2484j;
    }
}
