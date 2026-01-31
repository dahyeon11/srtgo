package com.google.common.util.concurrent;

import Q7.C0709m;
import Q7.X;
import com.google.android.gms.internal.ads.AbstractC2095Xm0;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import e3.AbstractC5354D;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import k3.AbstractC5857a;
import k3.AbstractC5858b;
import sun.misc.Unsafe;

/* renamed from: com.google.common.util.concurrent.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5162b extends AbstractC5857a implements C {

    /* renamed from: d, reason: collision with root package name */
    static final boolean f25523d;

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f25524e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC0208b f25525f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f25526g;

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f25527a;

    /* renamed from: b, reason: collision with root package name */
    private volatile e f25528b;

    /* renamed from: c, reason: collision with root package name */
    private volatile l f25529c;

    /* renamed from: com.google.common.util.concurrent.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0208b {
        private AbstractC0208b() {
        }

        abstract boolean a(AbstractC5162b abstractC5162b, e eVar, e eVar2);

        abstract boolean b(AbstractC5162b abstractC5162b, Object obj, Object obj2);

        abstract boolean c(AbstractC5162b abstractC5162b, l lVar, l lVar2);

        abstract e d(AbstractC5162b abstractC5162b, e eVar);

        abstract l e(AbstractC5162b abstractC5162b, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);
    }

    /* renamed from: com.google.common.util.concurrent.b$c */
    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f25530c;

        /* renamed from: d, reason: collision with root package name */
        static final c f25531d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f25532a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f25533b;

        static {
            if (AbstractC5162b.f25523d) {
                f25531d = null;
                f25530c = null;
            } else {
                f25531d = new c(false, null);
                f25530c = new c(true, null);
            }
        }

        c(boolean z8, Throwable th) {
            this.f25532a = z8;
            this.f25533b = th;
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$d */
    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f25534b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f25535a;

        /* renamed from: com.google.common.util.concurrent.b$d$a */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f25535a = (Throwable) e3.w.checkNotNull(th);
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$f */
    private static final class f extends AbstractC0208b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f25540a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f25541b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f25542c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f25543d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f25544e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f25540a = atomicReferenceFieldUpdater;
            this.f25541b = atomicReferenceFieldUpdater2;
            this.f25542c = atomicReferenceFieldUpdater3;
            this.f25543d = atomicReferenceFieldUpdater4;
            this.f25544e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        boolean a(AbstractC5162b abstractC5162b, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f25543d, abstractC5162b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        boolean b(AbstractC5162b abstractC5162b, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f25544e, abstractC5162b, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        boolean c(AbstractC5162b abstractC5162b, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f25542c, abstractC5162b, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        e d(AbstractC5162b abstractC5162b, e eVar) {
            return (e) this.f25543d.getAndSet(abstractC5162b, eVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        l e(AbstractC5162b abstractC5162b, l lVar) {
            return (l) this.f25542c.getAndSet(abstractC5162b, lVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        void f(l lVar, l lVar2) {
            this.f25541b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        void g(l lVar, Thread thread) {
            this.f25540a.lazySet(lVar, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$g */
    private static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC5162b f25545a;

        /* renamed from: b, reason: collision with root package name */
        final C f25546b;

        g(AbstractC5162b abstractC5162b, C c9) {
            this.f25545a = abstractC5162b;
            this.f25546b = c9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f25545a.f25527a != this) {
                return;
            }
            if (AbstractC5162b.f25525f.b(this.f25545a, this, AbstractC5162b.u(this.f25546b))) {
                AbstractC5162b.r(this.f25545a, false);
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$h */
    private static final class h extends AbstractC0208b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        boolean a(AbstractC5162b abstractC5162b, e eVar, e eVar2) {
            synchronized (abstractC5162b) {
                try {
                    if (abstractC5162b.f25528b != eVar) {
                        return false;
                    }
                    abstractC5162b.f25528b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        boolean b(AbstractC5162b abstractC5162b, Object obj, Object obj2) {
            synchronized (abstractC5162b) {
                try {
                    if (abstractC5162b.f25527a != obj) {
                        return false;
                    }
                    abstractC5162b.f25527a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        boolean c(AbstractC5162b abstractC5162b, l lVar, l lVar2) {
            synchronized (abstractC5162b) {
                try {
                    if (abstractC5162b.f25529c != lVar) {
                        return false;
                    }
                    abstractC5162b.f25529c = lVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        e d(AbstractC5162b abstractC5162b, e eVar) {
            e eVar2;
            synchronized (abstractC5162b) {
                try {
                    eVar2 = abstractC5162b.f25528b;
                    if (eVar2 != eVar) {
                        abstractC5162b.f25528b = eVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        l e(AbstractC5162b abstractC5162b, l lVar) {
            l lVar2;
            synchronized (abstractC5162b) {
                try {
                    lVar2 = abstractC5162b.f25529c;
                    if (lVar2 != lVar) {
                        abstractC5162b.f25529c = lVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        void f(l lVar, l lVar2) {
            lVar.f25555b = lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        void g(l lVar, Thread thread) {
            lVar.f25554a = thread;
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$i */
    interface i extends C {
        @Override // com.google.common.util.concurrent.C
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    /* renamed from: com.google.common.util.concurrent.b$j */
    static abstract class j extends AbstractC5162b implements i {
        j() {
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, com.google.common.util.concurrent.C
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
        public final boolean cancel(boolean z8) {
            return super.cancel(z8);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
        public final Object get(long j8, TimeUnit timeUnit) {
            return super.get(j8, timeUnit);
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$k */
    private static final class k extends AbstractC0208b {

        /* renamed from: a, reason: collision with root package name */
        static final Unsafe f25547a;

        /* renamed from: b, reason: collision with root package name */
        static final long f25548b;

        /* renamed from: c, reason: collision with root package name */
        static final long f25549c;

        /* renamed from: d, reason: collision with root package name */
        static final long f25550d;

        /* renamed from: e, reason: collision with root package name */
        static final long f25551e;

        /* renamed from: f, reason: collision with root package name */
        static final long f25552f;

        /* renamed from: com.google.common.util.concurrent.b$k$a */
        class a implements PrivilegedExceptionAction {
            a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            public Unsafe run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new a());
                }
                try {
                    f25549c = unsafe.objectFieldOffset(AbstractC5162b.class.getDeclaredField(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C));
                    f25548b = unsafe.objectFieldOffset(AbstractC5162b.class.getDeclaredField(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B));
                    f25550d = unsafe.objectFieldOffset(AbstractC5162b.class.getDeclaredField(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A));
                    f25551e = unsafe.objectFieldOffset(l.class.getDeclaredField(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A));
                    f25552f = unsafe.objectFieldOffset(l.class.getDeclaredField(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B));
                    f25547a = unsafe;
                } catch (NoSuchFieldException e8) {
                    throw new RuntimeException(e8);
                } catch (RuntimeException e9) {
                    throw e9;
                }
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        }

        private k() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        boolean a(AbstractC5162b abstractC5162b, e eVar, e eVar2) {
            return AbstractC2095Xm0.a(f25547a, abstractC5162b, f25548b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        boolean b(AbstractC5162b abstractC5162b, Object obj, Object obj2) {
            return AbstractC2095Xm0.a(f25547a, abstractC5162b, f25550d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        boolean c(AbstractC5162b abstractC5162b, l lVar, l lVar2) {
            return AbstractC2095Xm0.a(f25547a, abstractC5162b, f25549c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        e d(AbstractC5162b abstractC5162b, e eVar) {
            e eVar2;
            do {
                eVar2 = abstractC5162b.f25528b;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(abstractC5162b, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        l e(AbstractC5162b abstractC5162b, l lVar) {
            l lVar2;
            do {
                lVar2 = abstractC5162b.f25529c;
                if (lVar == lVar2) {
                    return lVar2;
                }
            } while (!c(abstractC5162b, lVar2, lVar));
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        void f(l lVar, l lVar2) {
            f25547a.putObject(lVar, f25552f, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b.AbstractC0208b
        void g(l lVar, Thread thread) {
            f25547a.putObject(lVar, f25551e, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$l */
    private static final class l {

        /* renamed from: c, reason: collision with root package name */
        static final l f25553c = new l(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f25554a;

        /* renamed from: b, reason: collision with root package name */
        volatile l f25555b;

        l(boolean z8) {
        }

        void a(l lVar) {
            AbstractC5162b.f25525f.f(this, lVar);
        }

        void b() {
            Thread thread = this.f25554a;
            if (thread != null) {
                this.f25554a = null;
                LockSupport.unpark(thread);
            }
        }

        l() {
            AbstractC5162b.f25525f.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.common.util.concurrent.b$f] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.common.util.concurrent.b$a] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.common.util.concurrent.b$k] */
    static {
        boolean z8;
        h hVar;
        try {
            z8 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", C0709m.FALSE));
        } catch (SecurityException unused) {
            z8 = false;
        }
        f25523d = z8;
        f25524e = Logger.getLogger(AbstractC5162b.class.getName());
        ?? r42 = 0;
        r42 = 0;
        try {
            hVar = new k();
            e = null;
        } catch (Error | RuntimeException e8) {
            e = e8;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B), AtomicReferenceFieldUpdater.newUpdater(AbstractC5162b.class, l.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C), AtomicReferenceFieldUpdater.newUpdater(AbstractC5162b.class, e.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B), AtomicReferenceFieldUpdater.newUpdater(AbstractC5162b.class, Object.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A));
            } catch (Error | RuntimeException e9) {
                hVar = new h();
                r42 = e9;
            }
        }
        f25525f = hVar;
        if (r42 != 0) {
            ?? r02 = f25524e;
            Level level = Level.SEVERE;
            r02.log(level, "UnsafeAtomicHelper is broken!", e);
            r02.log(level, "SafeAtomicHelper is broken!", r42);
        }
        f25526g = new Object();
    }

    protected AbstractC5162b() {
    }

    private void A(l lVar) {
        lVar.f25554a = null;
        while (true) {
            l lVar2 = this.f25529c;
            if (lVar2 == l.f25553c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f25555b;
                if (lVar2.f25554a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f25555b = lVar4;
                    if (lVar3.f25554a == null) {
                        break;
                    }
                } else if (!f25525f.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    private void k(StringBuilder sb) {
        try {
            Object objV = v(this);
            sb.append("SUCCESS, result=[");
            n(sb, objV);
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

    private void l(StringBuilder sb) {
        String strEmptyToNull;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f25527a;
        if (obj instanceof g) {
            sb.append(", setFuture=[");
            o(sb, ((g) obj).f25546b);
            sb.append("]");
        } else {
            try {
                strEmptyToNull = AbstractC5354D.emptyToNull(y());
            } catch (RuntimeException | StackOverflowError e8) {
                strEmptyToNull = "Exception thrown from implementation: " + e8.getClass();
            }
            if (strEmptyToNull != null) {
                sb.append(", info=[");
                sb.append(strEmptyToNull);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            k(sb);
        }
    }

    private void n(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void o(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException e8) {
            e = e8;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e9) {
            e = e9;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static CancellationException p(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e q(e eVar) {
        e eVar2 = eVar;
        e eVarD = f25525f.d(this, e.f25536d);
        while (eVarD != null) {
            e eVar3 = eVarD.f25539c;
            eVarD.f25539c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(AbstractC5162b abstractC5162b, boolean z8) {
        e eVar = null;
        while (true) {
            abstractC5162b.z();
            if (z8) {
                abstractC5162b.w();
                z8 = false;
            }
            abstractC5162b.m();
            e eVarQ = abstractC5162b.q(eVar);
            while (eVarQ != null) {
                eVar = eVarQ.f25539c;
                Runnable runnable = eVarQ.f25537a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    abstractC5162b = gVar.f25545a;
                    if (abstractC5162b.f25527a == gVar) {
                        if (f25525f.b(abstractC5162b, gVar, u(gVar.f25546b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarQ.f25538b;
                    Objects.requireNonNull(executor);
                    s(runnable2, executor);
                }
                eVarQ = eVar;
            }
            return;
        }
    }

    private static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f25524e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    private Object t(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw p("Task was cancelled.", ((c) obj).f25533b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f25535a);
        }
        return obj == f25526g ? I.b() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object u(C c9) {
        Throwable thTryInternalFastPathGetFailure;
        if (c9 instanceof i) {
            Object cVar = ((AbstractC5162b) c9).f25527a;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f25532a) {
                    cVar = cVar2.f25533b != null ? new c(false, cVar2.f25533b) : c.f25531d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((c9 instanceof AbstractC5857a) && (thTryInternalFastPathGetFailure = AbstractC5858b.tryInternalFastPathGetFailure((AbstractC5857a) c9)) != null) {
            return new d(thTryInternalFastPathGetFailure);
        }
        boolean zIsCancelled = c9.isCancelled();
        if ((!f25523d) && zIsCancelled) {
            c cVar3 = c.f25531d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objV = v(c9);
            if (!zIsCancelled) {
                return objV == null ? f25526g : objV;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + c9));
        } catch (Error e8) {
            e = e8;
            return new d(e);
        } catch (CancellationException e9) {
            if (zIsCancelled) {
                return new c(false, e9);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + c9, e9));
        } catch (RuntimeException e10) {
            e = e10;
            return new d(e);
        } catch (ExecutionException e11) {
            if (!zIsCancelled) {
                return new d(e11.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + c9, e11));
        }
    }

    private static Object v(Future future) {
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

    private void z() {
        for (l lVarE = f25525f.e(this, l.f25553c); lVarE != null; lVarE = lVarE.f25555b) {
            lVarE.b();
        }
    }

    protected final boolean B() {
        Object obj = this.f25527a;
        return (obj instanceof c) && ((c) obj).f25532a;
    }

    @Override // k3.AbstractC5857a
    protected final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f25527a;
        if (obj instanceof d) {
            return ((d) obj).f25535a;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.C
    public void addListener(Runnable runnable, Executor executor) {
        e eVar;
        e3.w.checkNotNull(runnable, "Runnable was null.");
        e3.w.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f25528b) != e.f25536d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f25539c = eVar;
                if (f25525f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f25528b;
                }
            } while (eVar != e.f25536d);
        }
        s(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        c cVar;
        Object obj = this.f25527a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f25523d) {
            cVar = new c(z8, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z8 ? c.f25530c : c.f25531d;
            Objects.requireNonNull(cVar);
        }
        AbstractC5162b abstractC5162b = this;
        boolean z9 = false;
        while (true) {
            if (f25525f.b(abstractC5162b, obj, cVar)) {
                r(abstractC5162b, z8);
                if (!(obj instanceof g)) {
                    return true;
                }
                C c9 = ((g) obj).f25546b;
                if (!(c9 instanceof i)) {
                    c9.cancel(z8);
                    return true;
                }
                abstractC5162b = (AbstractC5162b) c9;
                obj = abstractC5162b.f25527a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z9 = true;
            } else {
                obj = abstractC5162b.f25527a;
                if (!(obj instanceof g)) {
                    return z9;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f25527a;
        if ((obj != null) && (!(obj instanceof g))) {
            return t(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f25529c;
            if (lVar != l.f25553c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f25525f.c(this, lVar, lVar2)) {
                        do {
                            J.a(this, nanos);
                            if (Thread.interrupted()) {
                                A(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f25527a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return t(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        A(lVar2);
                    } else {
                        lVar = this.f25529c;
                    }
                } while (lVar != l.f25553c);
            }
            Object obj3 = this.f25527a;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f25527a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return t(obj4);
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
    public boolean isCancelled() {
        return this.f25527a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f25527a != null);
    }

    protected void m() {
    }

    protected boolean set(Object obj) {
        if (obj == null) {
            obj = f25526g;
        }
        if (!f25525f.b(this, null, obj)) {
            return false;
        }
        r(this, false);
        return true;
    }

    protected boolean setException(Throwable th) {
        if (!f25525f.b(this, null, new d((Throwable) e3.w.checkNotNull(th)))) {
            return false;
        }
        r(this, false);
        return true;
    }

    protected boolean setFuture(C c9) {
        d dVar;
        e3.w.checkNotNull(c9);
        Object obj = this.f25527a;
        if (obj == null) {
            if (c9.isDone()) {
                if (!f25525f.b(this, null, u(c9))) {
                    return false;
                }
                r(this, false);
                return true;
            }
            g gVar = new g(this, c9);
            if (f25525f.b(this, null, gVar)) {
                try {
                    c9.addListener(gVar, EnumC5173m.INSTANCE);
                } catch (Error | RuntimeException e8) {
                    try {
                        dVar = new d(e8);
                    } catch (Error | RuntimeException unused) {
                        dVar = d.f25534b;
                    }
                    f25525f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f25527a;
        }
        if (obj instanceof c) {
            c9.cancel(((c) obj).f25532a);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            l(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    protected void w() {
    }

    final void x(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(B());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: com.google.common.util.concurrent.b$e */
    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f25536d = new e();

        /* renamed from: a, reason: collision with root package name */
        final Runnable f25537a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f25538b;

        /* renamed from: c, reason: collision with root package name */
        e f25539c;

        e(Runnable runnable, Executor executor) {
            this.f25537a = runnable;
            this.f25538b = executor;
        }

        e() {
            this.f25537a = null;
            this.f25538b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f25527a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return t(obj2);
            }
            l lVar = this.f25529c;
            if (lVar != l.f25553c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f25525f.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f25527a;
                            } else {
                                A(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return t(obj);
                    }
                    lVar = this.f25529c;
                } while (lVar != l.f25553c);
            }
            Object obj3 = this.f25527a;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        throw new InterruptedException();
    }
}
