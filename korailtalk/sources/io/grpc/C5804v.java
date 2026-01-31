package io.grpc;

import io.grpc.q0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5804v {

    /* renamed from: a, reason: collision with root package name */
    final e f33356a;

    /* renamed from: b, reason: collision with root package name */
    final q0.d f33357b;

    /* renamed from: c, reason: collision with root package name */
    final int f33358c;

    /* renamed from: d, reason: collision with root package name */
    static final Logger f33355d = Logger.getLogger(C5804v.class.getName());
    public static final C5804v ROOT = new C5804v();

    /* renamed from: io.grpc.v$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f33359a;

        a(Runnable runnable) {
            this.f33359a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5804v c5804vAttach = C5804v.this.attach();
            try {
                this.f33359a.run();
            } finally {
                C5804v.this.detach(c5804vAttach);
            }
        }
    }

    /* renamed from: io.grpc.v$b */
    final class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f33361a;

        b(Executor executor) {
            this.f33361a = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f33361a.execute(C5804v.current().wrap(runnable));
        }
    }

    /* renamed from: io.grpc.v$c */
    final class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f33362a;

        c(Executor executor) {
            this.f33362a = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f33362a.execute(C5804v.this.wrap(runnable));
        }
    }

    /* renamed from: io.grpc.v$d */
    class d implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f33364a;

        d(Callable callable) {
            this.f33364a = callable;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [C, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public C call() {
            C5804v c5804vAttach = C5804v.this.attach();
            try {
                return this.f33364a.call();
            } finally {
                C5804v.this.detach(c5804vAttach);
            }
        }
    }

    /* renamed from: io.grpc.v$e */
    public static final class e extends C5804v implements Closeable {

        /* renamed from: e, reason: collision with root package name */
        private final C5806x f33366e;

        /* renamed from: f, reason: collision with root package name */
        private final C5804v f33367f;

        /* renamed from: g, reason: collision with root package name */
        private ArrayList f33368g;

        /* renamed from: h, reason: collision with root package name */
        private f f33369h;

        /* renamed from: i, reason: collision with root package name */
        private Throwable f33370i;

        /* renamed from: j, reason: collision with root package name */
        private ScheduledFuture f33371j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f33372k;

        /* renamed from: io.grpc.v$e$a */
        class a implements f {
            a() {
            }

            @Override // io.grpc.C5804v.f
            public void cancelled(C5804v c5804v) {
                e.this.cancel(c5804v.cancellationCause());
            }
        }

        /* renamed from: io.grpc.v$e$b */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    e.this.cancel(new TimeoutException("context timed out"));
                } catch (Throwable th) {
                    C5804v.f33355d.log(Level.SEVERE, "Cancel threw an exception, which should not happen", th);
                }
            }
        }

        /* synthetic */ e(C5804v c5804v, a aVar) {
            this(c5804v);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(h hVar) {
            synchronized (this) {
                try {
                    if (isCancelled()) {
                        hVar.b();
                    } else {
                        ArrayList arrayList = this.f33368g;
                        if (arrayList == null) {
                            ArrayList arrayList2 = new ArrayList();
                            this.f33368g = arrayList2;
                            arrayList2.add(hVar);
                            if (this.f33356a != null) {
                                a aVar = new a();
                                this.f33369h = aVar;
                                this.f33356a.h(new h(g.INSTANCE, aVar, this));
                            }
                        } else {
                            arrayList.add(hVar);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void i() {
            synchronized (this) {
                try {
                    ArrayList arrayList = this.f33368g;
                    if (arrayList == null) {
                        return;
                    }
                    f fVar = this.f33369h;
                    this.f33369h = null;
                    this.f33368g = null;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        h hVar = (h) it.next();
                        if (hVar.f33378c == this) {
                            hVar.b();
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        h hVar2 = (h) it2.next();
                        if (hVar2.f33378c != this) {
                            hVar2.b();
                        }
                    }
                    e eVar = this.f33356a;
                    if (eVar != null) {
                        eVar.removeListener(fVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(f fVar, C5804v c5804v) {
            synchronized (this) {
                try {
                    ArrayList arrayList = this.f33368g;
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            h hVar = (h) this.f33368g.get(size);
                            if (hVar.f33377b == fVar && hVar.f33378c == c5804v) {
                                this.f33368g.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (this.f33368g.isEmpty()) {
                            e eVar = this.f33356a;
                            if (eVar != null) {
                                eVar.removeListener(this.f33369h);
                            }
                            this.f33369h = null;
                            this.f33368g = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(C5806x c5806x, ScheduledExecutorService scheduledExecutorService) {
            if (c5806x.isExpired()) {
                cancel(new TimeoutException("context timed out"));
            } else {
                synchronized (this) {
                    this.f33371j = c5806x.runOnExpiration(new b(), scheduledExecutorService);
                }
            }
        }

        @Override // io.grpc.C5804v
        public void addListener(f fVar, Executor executor) {
            C5804v.b(fVar, "cancellationListener");
            C5804v.b(executor, "executor");
            h(new h(executor, fVar, this));
        }

        @Override // io.grpc.C5804v
        public C5804v attach() {
            return this.f33367f.attach();
        }

        public boolean cancel(Throwable th) {
            ScheduledFuture scheduledFuture;
            boolean z8;
            synchronized (this) {
                try {
                    scheduledFuture = null;
                    if (this.f33372k) {
                        z8 = false;
                    } else {
                        z8 = true;
                        this.f33372k = true;
                        ScheduledFuture scheduledFuture2 = this.f33371j;
                        if (scheduledFuture2 != null) {
                            this.f33371j = null;
                            scheduledFuture = scheduledFuture2;
                        }
                        this.f33370i = th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (z8) {
                i();
            }
            return z8;
        }

        @Override // io.grpc.C5804v
        public Throwable cancellationCause() {
            if (isCancelled()) {
                return this.f33370i;
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            cancel(null);
        }

        @Override // io.grpc.C5804v
        public void detach(C5804v c5804v) {
            this.f33367f.detach(c5804v);
        }

        public void detachAndCancel(C5804v c5804v, Throwable th) {
            try {
                detach(c5804v);
            } finally {
                cancel(th);
            }
        }

        @Override // io.grpc.C5804v
        public C5806x getDeadline() {
            return this.f33366e;
        }

        @Override // io.grpc.C5804v
        public boolean isCancelled() {
            synchronized (this) {
                try {
                    if (this.f33372k) {
                        return true;
                    }
                    if (!super.isCancelled()) {
                        return false;
                    }
                    cancel(super.cancellationCause());
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.C5804v
        @Deprecated
        public boolean isCurrent() {
            return this.f33367f.isCurrent();
        }

        @Override // io.grpc.C5804v
        public void removeListener(f fVar) {
            j(fVar, this);
        }

        /* synthetic */ e(C5804v c5804v, C5806x c5806x, a aVar) {
            this(c5804v, c5806x);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private e(C5804v c5804v) {
            a aVar = null;
            super(c5804v, c5804v.f33357b, aVar);
            this.f33366e = c5804v.getDeadline();
            this.f33367f = new C5804v(this, this.f33357b, aVar);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private e(C5804v c5804v, C5806x c5806x) {
            a aVar = null;
            super(c5804v, c5804v.f33357b, aVar);
            this.f33366e = c5806x;
            this.f33367f = new C5804v(this, this.f33357b, aVar);
        }
    }

    /* renamed from: io.grpc.v$f */
    public interface f {
        void cancelled(C5804v c5804v);
    }

    /* renamed from: io.grpc.v$g */
    private enum g implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Context.DirectExecutor";
        }
    }

    /* renamed from: io.grpc.v$h */
    private static final class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f33376a;

        /* renamed from: b, reason: collision with root package name */
        final f f33377b;

        /* renamed from: c, reason: collision with root package name */
        private final C5804v f33378c;

        h(Executor executor, f fVar, C5804v c5804v) {
            this.f33376a = executor;
            this.f33377b = fVar;
            this.f33378c = c5804v;
        }

        void b() {
            try {
                this.f33376a.execute(this);
            } catch (Throwable th) {
                C5804v.f33355d.log(Level.INFO, "Exception notifying context listener", th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33377b.cancelled(this.f33378c);
        }
    }

    /* renamed from: io.grpc.v$i */
    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        private final String f33379a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f33380b;

        i(String str) {
            this(str, null);
        }

        public Object get() {
            return get(C5804v.current());
        }

        public String toString() {
            return this.f33379a;
        }

        i(String str, Object obj) {
            this.f33379a = (String) C5804v.b(str, "name");
            this.f33380b = obj;
        }

        public Object get(C5804v c5804v) {
            Object objA = q0.a(c5804v.f33357b, this);
            return objA == null ? this.f33380b : objA;
        }
    }

    /* renamed from: io.grpc.v$j */
    private static final class j {

        /* renamed from: a, reason: collision with root package name */
        static final k f33381a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f33381a = a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                C5804v.f33355d.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        private static k a(AtomicReference atomicReference) {
            try {
                return (k) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(k.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e8) {
                atomicReference.set(e8);
                return new O0();
            } catch (Exception e9) {
                throw new RuntimeException("Storage override failed to initialize", e9);
            }
        }
    }

    /* renamed from: io.grpc.v$k */
    public static abstract class k {
        @Deprecated
        public void attach(C5804v c5804v) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        public abstract C5804v current();

        public abstract void detach(C5804v c5804v, C5804v c5804v2);

        public C5804v doAttach(C5804v c5804v) {
            C5804v c5804vCurrent = current();
            attach(c5804v);
            return c5804vCurrent;
        }
    }

    /* synthetic */ C5804v(C5804v c5804v, q0.d dVar, a aVar) {
        this(c5804v, dVar);
    }

    static e a(C5804v c5804v) {
        return c5804v instanceof e ? (e) c5804v : c5804v.f33356a;
    }

    static Object b(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    static k c() {
        return j.f33381a;
    }

    public static C5804v current() {
        C5804v c5804vCurrent = c().current();
        return c5804vCurrent == null ? ROOT : c5804vCurrent;
    }

    public static Executor currentContextExecutor(Executor executor) {
        return new b(executor);
    }

    private static void d(int i8) {
        if (i8 == 1000) {
            f33355d.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static <T> i key(String str) {
        return new i(str);
    }

    public static <T> i keyWithDefault(String str, T t8) {
        return new i(str, t8);
    }

    public void addListener(f fVar, Executor executor) {
        b(fVar, "cancellationListener");
        b(executor, "executor");
        e eVar = this.f33356a;
        if (eVar == null) {
            return;
        }
        eVar.h(new h(executor, fVar, this));
    }

    public C5804v attach() {
        C5804v c5804vDoAttach = c().doAttach(this);
        return c5804vDoAttach == null ? ROOT : c5804vDoAttach;
    }

    public <V> V call(Callable<V> callable) {
        C5804v c5804vAttach = attach();
        try {
            return callable.call();
        } finally {
            detach(c5804vAttach);
        }
    }

    public Throwable cancellationCause() {
        e eVar = this.f33356a;
        if (eVar == null) {
            return null;
        }
        return eVar.cancellationCause();
    }

    public void detach(C5804v c5804v) {
        b(c5804v, "toAttach");
        c().detach(this, c5804v);
    }

    public Executor fixedContextExecutor(Executor executor) {
        return new c(executor);
    }

    public C5804v fork() {
        return new C5804v(this.f33357b, this.f33358c + 1);
    }

    public C5806x getDeadline() {
        e eVar = this.f33356a;
        if (eVar == null) {
            return null;
        }
        return eVar.getDeadline();
    }

    public boolean isCancelled() {
        e eVar = this.f33356a;
        if (eVar == null) {
            return false;
        }
        return eVar.isCancelled();
    }

    boolean isCurrent() {
        return current() == this;
    }

    public void removeListener(f fVar) {
        e eVar = this.f33356a;
        if (eVar == null) {
            return;
        }
        eVar.j(fVar, this);
    }

    public void run(Runnable runnable) {
        C5804v c5804vAttach = attach();
        try {
            runnable.run();
        } finally {
            detach(c5804vAttach);
        }
    }

    public e withCancellation() {
        return new e(this, (a) null);
    }

    public e withDeadline(C5806x c5806x, ScheduledExecutorService scheduledExecutorService) {
        boolean z8;
        b(c5806x, "deadline");
        b(scheduledExecutorService, "scheduler");
        C5806x deadline = getDeadline();
        if (deadline == null || deadline.compareTo(c5806x) > 0) {
            z8 = true;
        } else {
            z8 = false;
            c5806x = deadline;
        }
        e eVar = new e(this, c5806x, null);
        if (z8) {
            eVar.k(c5806x, scheduledExecutorService);
        }
        return eVar;
    }

    public e withDeadlineAfter(long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return withDeadline(C5806x.after(j8, timeUnit), scheduledExecutorService);
    }

    public <V> C5804v withValue(i iVar, V v8) {
        return new C5804v(this, q0.b(this.f33357b, iVar, v8));
    }

    public <V1, V2> C5804v withValues(i iVar, V1 v12, i iVar2, V2 v22) {
        return new C5804v(this, q0.b(q0.b(this.f33357b, iVar, v12), iVar2, v22));
    }

    public Runnable wrap(Runnable runnable) {
        return new a(runnable);
    }

    private C5804v(q0.d dVar, int i8) {
        this.f33356a = null;
        this.f33357b = dVar;
        this.f33358c = i8;
        d(i8);
    }

    public <C> Callable<C> wrap(Callable<C> callable) {
        return new d(callable);
    }

    public <V1, V2, V3> C5804v withValues(i iVar, V1 v12, i iVar2, V2 v22, i iVar3, V3 v32) {
        return new C5804v(this, q0.b(q0.b(q0.b(this.f33357b, iVar, v12), iVar2, v22), iVar3, v32));
    }

    private C5804v(C5804v c5804v, q0.d dVar) {
        this.f33356a = a(c5804v);
        this.f33357b = dVar;
        int i8 = c5804v.f33358c + 1;
        this.f33358c = i8;
        d(i8);
    }

    public <V1, V2, V3, V4> C5804v withValues(i iVar, V1 v12, i iVar2, V2 v22, i iVar3, V3 v32, i iVar4, V4 v42) {
        return new C5804v(this, q0.b(q0.b(q0.b(q0.b(this.f33357b, iVar, v12), iVar2, v22), iVar3, v32), iVar4, v42));
    }

    private C5804v() {
        this.f33356a = null;
        this.f33357b = null;
        this.f33358c = 0;
        d(0);
    }
}
