package io.grpc.internal;

import io.grpc.AbstractC5786j;
import io.grpc.C5713a;
import io.grpc.C5728h0;
import io.grpc.C5804v;
import io.grpc.C5806x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class B extends AbstractC5786j {

    /* renamed from: j, reason: collision with root package name */
    private static final Logger f32176j = Logger.getLogger(B.class.getName());

    /* renamed from: k, reason: collision with root package name */
    private static final AbstractC5786j f32177k = new j();

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledFuture f32178a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f32179b;

    /* renamed from: c, reason: collision with root package name */
    private final C5804v f32180c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f32181d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC5786j.a f32182e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC5786j f32183f;

    /* renamed from: g, reason: collision with root package name */
    private io.grpc.J0 f32184g;

    /* renamed from: h, reason: collision with root package name */
    private List f32185h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private l f32186i;

    class a extends AbstractRunnableC5785z {
        a(C5804v c5804v) {
            super(c5804v);
        }

        @Override // io.grpc.internal.AbstractRunnableC5785z
        public void runInContext() {
            B.this.h();
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ StringBuilder f32188a;

        b(StringBuilder sb) {
            this.f32188a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.f(io.grpc.J0.DEADLINE_EXCEEDED.withDescription(this.f32188a.toString()), true);
        }
    }

    class c extends AbstractRunnableC5785z {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f32190b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l lVar) {
            super(B.this.f32180c);
            this.f32190b = lVar;
        }

        @Override // io.grpc.internal.AbstractRunnableC5785z
        public void runInContext() {
            this.f32190b.c();
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5786j.a f32192a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5728h0 f32193b;

        d(AbstractC5786j.a aVar, C5728h0 c5728h0) {
            this.f32192a = aVar;
            this.f32193b = c5728h0;
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.f32183f.start(this.f32192a, this.f32193b);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.J0 f32195a;

        e(io.grpc.J0 j02) {
            this.f32195a = j02;
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.f32183f.cancel(this.f32195a.getDescription(), this.f32195a.getCause());
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f32197a;

        f(Object obj) {
            this.f32197a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.f32183f.sendMessage(this.f32197a);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32199a;

        g(boolean z8) {
            this.f32199a = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.f32183f.setMessageCompression(this.f32199a);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32201a;

        h(int i8) {
            this.f32201a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.f32183f.request(this.f32201a);
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.f32183f.halfClose();
        }
    }

    class j extends AbstractC5786j {
        j() {
        }

        @Override // io.grpc.AbstractC5786j
        public void cancel(String str, Throwable th) {
        }

        @Override // io.grpc.AbstractC5786j
        public void halfClose() {
        }

        @Override // io.grpc.AbstractC5786j
        public boolean isReady() {
            return false;
        }

        @Override // io.grpc.AbstractC5786j
        public void request(int i8) {
        }

        @Override // io.grpc.AbstractC5786j
        public void sendMessage(Object obj) {
        }

        @Override // io.grpc.AbstractC5786j
        public void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
        }
    }

    private final class k extends AbstractRunnableC5785z {

        /* renamed from: b, reason: collision with root package name */
        final AbstractC5786j.a f32204b;

        /* renamed from: c, reason: collision with root package name */
        final io.grpc.J0 f32205c;

        k(AbstractC5786j.a aVar, io.grpc.J0 j02) {
            super(B.this.f32180c);
            this.f32204b = aVar;
            this.f32205c = j02;
        }

        @Override // io.grpc.internal.AbstractRunnableC5785z
        public void runInContext() {
            this.f32204b.onClose(this.f32205c, new C5728h0());
        }
    }

    private static final class l extends AbstractC5786j.a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5786j.a f32207a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f32208b;

        /* renamed from: c, reason: collision with root package name */
        private List f32209c = new ArrayList();

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5728h0 f32210a;

            a(C5728h0 c5728h0) {
                this.f32210a = c5728h0;
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.f32207a.onHeaders(this.f32210a);
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f32212a;

            b(Object obj) {
                this.f32212a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.f32207a.onMessage(this.f32212a);
            }
        }

        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.J0 f32214a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5728h0 f32215b;

            c(io.grpc.J0 j02, C5728h0 c5728h0) {
                this.f32214a = j02;
                this.f32215b = c5728h0;
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.f32207a.onClose(this.f32214a, this.f32215b);
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.f32207a.onReady();
            }
        }

        public l(AbstractC5786j.a aVar) {
            this.f32207a = aVar;
        }

        private void b(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f32208b) {
                        runnable.run();
                    } else {
                        this.f32209c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void c() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f32209c.isEmpty()) {
                            this.f32209c = null;
                            this.f32208b = true;
                            return;
                        } else {
                            list = this.f32209c;
                            this.f32209c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }

        @Override // io.grpc.AbstractC5786j.a
        public void onClose(io.grpc.J0 j02, C5728h0 c5728h0) {
            b(new c(j02, c5728h0));
        }

        @Override // io.grpc.AbstractC5786j.a
        public void onHeaders(C5728h0 c5728h0) {
            if (this.f32208b) {
                this.f32207a.onHeaders(c5728h0);
            } else {
                b(new a(c5728h0));
            }
        }

        @Override // io.grpc.AbstractC5786j.a
        public void onMessage(Object obj) {
            if (this.f32208b) {
                this.f32207a.onMessage(obj);
            } else {
                b(new b(obj));
            }
        }

        @Override // io.grpc.AbstractC5786j.a
        public void onReady() {
            if (this.f32208b) {
                this.f32207a.onReady();
            } else {
                b(new d());
            }
        }
    }

    protected B(Executor executor, ScheduledExecutorService scheduledExecutorService, C5806x c5806x) {
        this.f32179b = (Executor) e3.w.checkNotNull(executor, "callExecutor");
        e3.w.checkNotNull(scheduledExecutorService, "scheduler");
        this.f32180c = C5804v.current();
        this.f32178a = j(scheduledExecutorService, c5806x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(io.grpc.J0 j02, boolean z8) {
        boolean z9;
        AbstractC5786j.a aVar;
        synchronized (this) {
            try {
                if (this.f32183f == null) {
                    k(f32177k);
                    aVar = this.f32182e;
                    this.f32184g = j02;
                    z9 = false;
                } else {
                    if (z8) {
                        return;
                    }
                    z9 = true;
                    aVar = null;
                }
                if (z9) {
                    g(new e(j02));
                } else {
                    if (aVar != null) {
                        this.f32179b.execute(new k(aVar, j02));
                    }
                    h();
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void g(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f32181d) {
                    runnable.run();
                } else {
                    this.f32185h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f32185h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f32185h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f32181d = r0     // Catch: java.lang.Throwable -> L24
            io.grpc.internal.B$l r0 = r3.f32186i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f32179b
            io.grpc.internal.B$c r2 = new io.grpc.internal.B$c
            r2.<init>(r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f32185h     // Catch: java.lang.Throwable -> L24
            r3.f32185h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.B.h():void");
    }

    private boolean i(C5806x c5806x, C5806x c5806x2) {
        if (c5806x2 == null) {
            return true;
        }
        if (c5806x == null) {
            return false;
        }
        return c5806x.isBefore(c5806x2);
    }

    private ScheduledFuture j(ScheduledExecutorService scheduledExecutorService, C5806x c5806x) {
        C5806x deadline = this.f32180c.getDeadline();
        if (c5806x == null && deadline == null) {
            return null;
        }
        long jTimeRemaining = c5806x != null ? c5806x.timeRemaining(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
        if (deadline != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (deadline.timeRemaining(timeUnit) < jTimeRemaining) {
                jTimeRemaining = deadline.timeRemaining(timeUnit);
                Logger logger = f32176j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jTimeRemaining)));
                    if (c5806x == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c5806x.timeRemaining(timeUnit))));
                    }
                    logger.fine(sb.toString());
                }
            }
        }
        long jAbs = Math.abs(jTimeRemaining);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit2.toNanos(1L);
        long jAbs2 = Math.abs(jTimeRemaining) % timeUnit2.toNanos(1L);
        StringBuilder sb2 = new StringBuilder();
        String str = i(deadline, c5806x) ? "Context" : "CallOptions";
        if (jTimeRemaining < 0) {
            sb2.append("ClientCall started after ");
            sb2.append(str);
            sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb2.append("Deadline ");
            sb2.append(str);
            sb2.append(" will be exceeded in ");
        }
        sb2.append(nanos);
        sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new b(sb2), jTimeRemaining, TimeUnit.NANOSECONDS);
    }

    private void k(AbstractC5786j abstractC5786j) {
        AbstractC5786j abstractC5786j2 = this.f32183f;
        e3.w.checkState(abstractC5786j2 == null, "realCall already set to %s", abstractC5786j2);
        ScheduledFuture scheduledFuture = this.f32178a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f32183f = abstractC5786j;
    }

    @Override // io.grpc.AbstractC5786j
    public final void cancel(String str, Throwable th) {
        io.grpc.J0 j02 = io.grpc.J0.CANCELLED;
        io.grpc.J0 j0WithDescription = str != null ? j02.withDescription(str) : j02.withDescription("Call cancelled without message");
        if (th != null) {
            j0WithDescription = j0WithDescription.withCause(th);
        }
        f(j0WithDescription, false);
    }

    protected void e() {
    }

    @Override // io.grpc.AbstractC5786j
    public final C5713a getAttributes() {
        AbstractC5786j abstractC5786j;
        synchronized (this) {
            abstractC5786j = this.f32183f;
        }
        return abstractC5786j != null ? abstractC5786j.getAttributes() : C5713a.EMPTY;
    }

    @Override // io.grpc.AbstractC5786j
    public final void halfClose() {
        g(new i());
    }

    @Override // io.grpc.AbstractC5786j
    public final boolean isReady() {
        if (this.f32181d) {
            return this.f32183f.isReady();
        }
        return false;
    }

    @Override // io.grpc.AbstractC5786j
    public final void request(int i8) {
        if (this.f32181d) {
            this.f32183f.request(i8);
        } else {
            g(new h(i8));
        }
    }

    @Override // io.grpc.AbstractC5786j
    public final void sendMessage(Object obj) {
        if (this.f32181d) {
            this.f32183f.sendMessage(obj);
        } else {
            g(new f(obj));
        }
    }

    public final Runnable setCall(AbstractC5786j abstractC5786j) {
        synchronized (this) {
            try {
                if (this.f32183f != null) {
                    return null;
                }
                k((AbstractC5786j) e3.w.checkNotNull(abstractC5786j, androidx.core.app.r.CATEGORY_CALL));
                return new a(this.f32180c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.AbstractC5786j
    public final void setMessageCompression(boolean z8) {
        if (this.f32181d) {
            this.f32183f.setMessageCompression(z8);
        } else {
            g(new g(z8));
        }
    }

    @Override // io.grpc.AbstractC5786j
    public final void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
        io.grpc.J0 j02;
        boolean z8;
        e3.w.checkState(this.f32182e == null, "already started");
        synchronized (this) {
            try {
                this.f32182e = (AbstractC5786j.a) e3.w.checkNotNull(aVar, "listener");
                j02 = this.f32184g;
                z8 = this.f32181d;
                if (!z8) {
                    l lVar = new l(aVar);
                    this.f32186i = lVar;
                    aVar = lVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j02 != null) {
            this.f32179b.execute(new k(aVar, j02));
        } else if (z8) {
            this.f32183f.start(aVar, c5728h0);
        } else {
            g(new d(aVar, c5728h0));
        }
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("realCall", this.f32183f).toString();
    }
}
