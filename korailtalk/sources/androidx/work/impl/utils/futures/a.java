package androidx.work.impl.utils.futures;

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
    static final boolean f11235d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", C0709m.FALSE));

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f11236e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final b f11237f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f11238g;

    /* renamed from: a, reason: collision with root package name */
    volatile Object f11239a;

    /* renamed from: b, reason: collision with root package name */
    volatile e f11240b;

    /* renamed from: c, reason: collision with root package name */
    volatile i f11241c;

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
        static final c f11242c;

        /* renamed from: d, reason: collision with root package name */
        static final c f11243d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f11244a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f11245b;

        static {
            if (a.f11235d) {
                f11243d = null;
                f11242c = null;
            } else {
                f11243d = new c(false, null);
                f11242c = new c(true, null);
            }
        }

        c(boolean z8, Throwable th) {
            this.f11244a = z8;
            this.f11245b = th;
        }
    }

    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f11246b = new d(new C0182a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f11247a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0182a extends Throwable {
            C0182a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f11247a = (Throwable) a.d(th);
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f11248d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f11249a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f11250b;

        /* renamed from: c, reason: collision with root package name */
        e f11251c;

        e(Runnable runnable, Executor executor) {
            this.f11249a = runnable;
            this.f11250b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11252a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11253b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11254c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11255d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11256e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f11252a = atomicReferenceFieldUpdater;
            this.f11253b = atomicReferenceFieldUpdater2;
            this.f11254c = atomicReferenceFieldUpdater3;
            this.f11255d = atomicReferenceFieldUpdater4;
            this.f11256e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f11255d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f11256e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f11254c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f11253b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f11252a.lazySet(iVar, thread);
        }
    }

    private static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final a f11257a;

        /* renamed from: b, reason: collision with root package name */
        final C f11258b;

        g(a aVar, C c9) {
            this.f11257a = aVar;
            this.f11258b = c9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11257a.f11239a != this) {
                return;
            }
            if (a.f11237f.b(this.f11257a, this, a.i(this.f11258b))) {
                a.f(this.f11257a);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11240b != eVar) {
                        return false;
                    }
                    aVar.f11240b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11239a != obj) {
                        return false;
                    }
                    aVar.f11239a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11241c != iVar) {
                        return false;
                    }
                    aVar.f11241c = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f11261b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f11260a = thread;
        }
    }

    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f11259c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f11260a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f11261b;

        i(boolean z8) {
        }

        void a(i iVar) {
            a.f11237f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f11260a;
            if (thread != null) {
                this.f11260a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f11237f.e(this, Thread.currentThread());
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
        f11237f = hVar;
        if (th != null) {
            f11236e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f11238g = new Object();
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
            eVar2 = this.f11240b;
        } while (!f11237f.a(this, eVar2, e.f11248d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f11251c;
            eVar4.f11251c = eVar3;
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
                eVar = eVarE.f11251c;
                Runnable runnable = eVarE.f11249a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f11257a;
                    if (aVar.f11239a == gVar) {
                        if (f11237f.b(aVar, gVar, i(gVar.f11258b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, eVarE.f11250b);
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
            f11236e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    private Object h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f11245b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f11247a);
        }
        if (obj == f11238g) {
            return null;
        }
        return obj;
    }

    static Object i(C c9) {
        if (c9 instanceof a) {
            Object obj = ((a) c9).f11239a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f11244a ? cVar.f11245b != null ? new c(false, cVar.f11245b) : c.f11243d : obj;
        }
        boolean zIsCancelled = c9.isCancelled();
        if ((!f11235d) && zIsCancelled) {
            return c.f11243d;
        }
        try {
            Object objJ = j(c9);
            return objJ == null ? f11238g : objJ;
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

    private static Object j(Future future) {
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
            iVar = this.f11241c;
        } while (!f11237f.c(this, iVar, i.f11259c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f11261b;
        }
    }

    private void n(i iVar) {
        iVar.f11260a = null;
        while (true) {
            i iVar2 = this.f11241c;
            if (iVar2 == i.f11259c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f11261b;
                if (iVar2.f11260a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f11261b = iVar4;
                    if (iVar3.f11260a == null) {
                        break;
                    }
                } else if (!f11237f.c(this, iVar2, iVar4)) {
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
        e eVar = this.f11240b;
        if (eVar != e.f11248d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f11251c = eVar;
                if (f11237f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f11240b;
                }
            } while (eVar != e.f11248d);
        }
        g(runnable, executor);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        Object obj = this.f11239a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f11235d ? new c(z8, new CancellationException("Future.cancel() was called.")) : z8 ? c.f11242c : c.f11243d;
        a aVar = this;
        boolean z9 = false;
        while (true) {
            if (f11237f.b(aVar, obj, cVar)) {
                if (z8) {
                    aVar.k();
                }
                f(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                C c9 = ((g) obj).f11258b;
                if (!(c9 instanceof a)) {
                    c9.cancel(z8);
                    return true;
                }
                aVar = (a) c9;
                obj = aVar.f11239a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z9 = true;
            } else {
                obj = aVar.f11239a;
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
        Object obj = this.f11239a;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f11241c;
            if (iVar != i.f11259c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f11237f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f11239a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(iVar2);
                    } else {
                        iVar = this.f11241c;
                    }
                } while (iVar != i.f11259c);
            }
            return h(this.f11239a);
        }
        while (nanos > 0) {
            Object obj3 = this.f11239a;
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
        return this.f11239a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f11239a != null);
    }

    protected void k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String l() {
        Object obj = this.f11239a;
        if (obj instanceof g) {
            return "setFuture=[" + o(((g) obj).f11258b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean set(Object obj) {
        if (obj == null) {
            obj = f11238g;
        }
        if (!f11237f.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean setException(Throwable th) {
        if (!f11237f.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean setFuture(C c9) {
        d dVar;
        d(c9);
        Object obj = this.f11239a;
        if (obj == null) {
            if (c9.isDone()) {
                if (!f11237f.b(this, null, i(c9))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, c9);
            if (f11237f.b(this, null, gVar)) {
                try {
                    c9.addListener(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f11246b;
                    }
                    f11237f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f11239a;
        }
        if (obj instanceof c) {
            c9.cancel(((c) obj).f11244a);
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
            Object obj2 = this.f11239a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f11241c;
            if (iVar != i.f11259c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f11237f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11239a;
                            } else {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f11241c;
                } while (iVar != i.f11259c);
            }
            return h(this.f11239a);
        }
        throw new InterruptedException();
    }
}
