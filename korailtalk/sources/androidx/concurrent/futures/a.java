package androidx.concurrent.futures;

import Q7.C0709m;
import Q7.X;
import com.google.common.util.concurrent.C;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a implements C {

    /* renamed from: d, reason: collision with root package name */
    static final boolean f8055d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", C0709m.FALSE));

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f8056e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final b f8057f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f8058g;

    /* renamed from: a, reason: collision with root package name */
    volatile Object f8059a;

    /* renamed from: b, reason: collision with root package name */
    volatile e f8060b;

    /* renamed from: c, reason: collision with root package name */
    volatile i f8061c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f8062c;

        /* renamed from: d, reason: collision with root package name */
        static final c f8063d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f8064a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f8065b;

        static {
            if (a.f8055d) {
                f8063d = null;
                f8062c = null;
            } else {
                f8063d = new c(false, null);
                f8062c = new c(true, null);
            }
        }

        c(boolean z8, Throwable th) {
            this.f8064a = z8;
            this.f8065b = th;
        }
    }

    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f8066b = new d(new C0122a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f8067a;

        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0122a extends Throwable {
            C0122a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f8067a = (Throwable) a.d(th);
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f8068d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f8069a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f8070b;

        /* renamed from: c, reason: collision with root package name */
        e f8071c;

        e(Runnable runnable, Executor executor) {
            this.f8069a = runnable;
            this.f8070b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8072a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8073b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8074c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8075d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8076e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f8072a = atomicReferenceFieldUpdater;
            this.f8073b = atomicReferenceFieldUpdater2;
            this.f8074c = atomicReferenceFieldUpdater3;
            this.f8075d = atomicReferenceFieldUpdater4;
            this.f8076e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f8075d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f8076e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f8074c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f8073b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f8072a.lazySet(iVar, thread);
        }
    }

    private static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final a f8077a;

        /* renamed from: b, reason: collision with root package name */
        final C f8078b;

        g(a aVar, C c9) {
            this.f8077a = aVar;
            this.f8078b = c9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8077a.f8059a != this) {
                return;
            }
            if (a.f8057f.b(this.f8077a, this, a.i(this.f8078b))) {
                a.f(this.f8077a);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f8060b != eVar) {
                        return false;
                    }
                    aVar.f8060b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f8059a != obj) {
                        return false;
                    }
                    aVar.f8059a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f8061c != iVar) {
                        return false;
                    }
                    aVar.f8061c = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f8081b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f8080a = thread;
        }
    }

    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f8079c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f8080a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f8081b;

        i(boolean z8) {
        }

        void a(i iVar) {
            a.f8057f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f8080a;
            if (thread != null) {
                this.f8080a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f8057f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f8057f = hVar;
        if (th != null) {
            f8056e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8058g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        try {
            Object objJ = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(o(objJ));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f8060b;
        } while (!f8057f.a(this, eVar2, e.f8068d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f8071c;
            eVar4.f8071c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void f(a aVar) {
        e eVar = null;
        while (true) {
            aVar.m();
            aVar.b();
            e eVarE = aVar.e(eVar);
            while (eVarE != null) {
                eVar = eVarE.f8071c;
                Runnable runnable = eVarE.f8069a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f8077a;
                    if (aVar.f8059a == gVar) {
                        if (f8057f.b(aVar, gVar, i(gVar.f8078b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, eVarE.f8070b);
                }
                eVarE = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f8056e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    private Object h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f8065b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f8067a);
        }
        if (obj == f8058g) {
            return null;
        }
        return obj;
    }

    static Object i(C c9) {
        if (c9 instanceof a) {
            Object obj = ((a) c9).f8059a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f8064a ? cVar.f8065b != null ? new c(false, cVar.f8065b) : c.f8063d : obj;
        }
        boolean zIsCancelled = c9.isCancelled();
        if ((!f8055d) && zIsCancelled) {
            return c.f8063d;
        }
        try {
            Object objJ = j(c9);
            return objJ == null ? f8058g : objJ;
        } catch (CancellationException e8) {
            if (zIsCancelled) {
                return new c(false, e8);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + c9, e8));
        } catch (ExecutionException e9) {
            return new d(e9.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    static Object j(Future future) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void m() {
        i iVar;
        do {
            iVar = this.f8061c;
        } while (!f8057f.c(this, iVar, i.f8079c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f8081b;
        }
    }

    private void n(i iVar) {
        iVar.f8080a = null;
        while (true) {
            i iVar2 = this.f8061c;
            if (iVar2 == i.f8079c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f8081b;
                if (iVar2.f8080a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f8081b = iVar4;
                    if (iVar3.f8080a == null) {
                        break;
                    }
                } else if (!f8057f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String o(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.C
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f8060b;
        if (eVar != e.f8068d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f8071c = eVar;
                if (f8057f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f8060b;
                }
            } while (eVar != e.f8068d);
        }
        g(runnable, executor);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        Object obj = this.f8059a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f8055d ? new c(z8, new CancellationException("Future.cancel() was called.")) : z8 ? c.f8062c : c.f8063d;
        a aVar = this;
        boolean z9 = false;
        while (true) {
            if (f8057f.b(aVar, obj, cVar)) {
                if (z8) {
                    aVar.k();
                }
                f(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                C c9 = ((g) obj).f8078b;
                if (!(c9 instanceof a)) {
                    c9.cancel(z8);
                    return true;
                }
                aVar = (a) c9;
                obj = aVar.f8059a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z9 = true;
            } else {
                obj = aVar.f8059a;
                if (!(obj instanceof g)) {
                    return z9;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8059a;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f8061c;
            if (iVar != i.f8079c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f8057f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8059a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(iVar2);
                    } else {
                        iVar = this.f8061c;
                    }
                } while (iVar != i.f8079c);
            }
            return h(this.f8059a);
        }
        while (nanos > 0) {
            Object obj3 = this.f8059a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j8 + X.SPACE + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j9 = -nanos;
            long jConvert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(jConvert);
            boolean z8 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + X.SPACE + lowerCase;
                if (z8) {
                    str3 = str3 + ",";
                }
                str2 = str3 + X.SPACE;
            }
            if (z8) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8059a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f8059a != null);
    }

    protected void k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String l() {
        Object obj = this.f8059a;
        if (obj instanceof g) {
            return "setFuture=[" + o(((g) obj).f8078b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean set(Object obj) {
        if (obj == null) {
            obj = f8058g;
        }
        if (!f8057f.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean setException(Throwable th) {
        if (!f8057f.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean setFuture(C c9) {
        d dVar;
        d(c9);
        Object obj = this.f8059a;
        if (obj == null) {
            if (c9.isDone()) {
                if (!f8057f.b(this, null, i(c9))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, c9);
            if (f8057f.b(this, null, gVar)) {
                try {
                    c9.addListener(gVar, androidx.concurrent.futures.d.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f8066b;
                    }
                    f8057f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f8059a;
        }
        if (obj instanceof c) {
            c9.cancel(((c) obj).f8064a);
        }
        return false;
    }

    public String toString() {
        String strL;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strL = l();
            } catch (RuntimeException e8) {
                strL = "Exception thrown from implementation: " + e8.getClass();
            }
            if (strL != null && !strL.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strL);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8059a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f8061c;
            if (iVar != i.f8079c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f8057f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8059a;
                            } else {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f8061c;
                } while (iVar != i.f8079c);
            }
            return h(this.f8059a);
        }
        throw new InterruptedException();
    }
}
