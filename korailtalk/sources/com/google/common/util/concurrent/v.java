package com.google.common.util.concurrent;

import com.google.common.util.concurrent.A;
import com.google.common.util.concurrent.AbstractC5162b;
import com.google.common.util.concurrent.AbstractC5171k;
import com.google.common.util.concurrent.v;
import f3.AbstractC5465h0;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class v extends z {

    class a implements Future {

        /* renamed from: a */
        final /* synthetic */ Future f25589a;

        /* renamed from: b */
        final /* synthetic */ e3.l f25590b;

        a(Future future, e3.l lVar) {
            this.f25589a = future;
            this.f25590b = lVar;
        }

        private Object a(Object obj) throws ExecutionException {
            try {
                return this.f25590b.apply(obj);
            } catch (Error | RuntimeException e8) {
                throw new ExecutionException(e8);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z8) {
            return this.f25589a.cancel(z8);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [O, java.lang.Object] */
        @Override // java.util.concurrent.Future
        public O get() {
            return a(this.f25589a.get());
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f25589a.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f25589a.isDone();
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [O, java.lang.Object] */
        @Override // java.util.concurrent.Future
        public O get(long j8, TimeUnit timeUnit) {
            return a(this.f25589a.get(j8, timeUnit));
        }
    }

    private static final class b implements Runnable {

        /* renamed from: a */
        final Future f25591a;

        b(Future future, InterfaceC5178s interfaceC5178s) {
            this.f25591a = future;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
                java.util.concurrent.Future r0 = r3.f25591a
                boolean r1 = r0 instanceof k3.AbstractC5857a
                r2 = 0
                if (r1 == 0) goto L10
                k3.a r0 = (k3.AbstractC5857a) r0
                java.lang.Throwable r0 = k3.AbstractC5858b.tryInternalFastPathGetFailure(r0)
                if (r0 == 0) goto L10
                throw r2
            L10:
                java.util.concurrent.Future r0 = r3.f25591a     // Catch: java.util.concurrent.ExecutionException -> L16 java.lang.Throwable -> L18
                com.google.common.util.concurrent.v.getDone(r0)     // Catch: java.util.concurrent.ExecutionException -> L16 java.lang.Throwable -> L18
                throw r2
            L16:
                r0 = move-exception
                goto L19
            L18:
                throw r2
            L19:
                r0.getCause()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.v.b.run():void");
        }

        public String toString() {
            return e3.p.toStringHelper(this).addValue((Object) null).toString();
        }
    }

    public static final class c {

        /* renamed from: a */
        private final boolean f25592a;

        /* renamed from: b */
        private final AbstractC5465h0 f25593b;

        class a implements Callable {

            /* renamed from: a */
            final /* synthetic */ Runnable f25594a;

            a(c cVar, Runnable runnable) {
                this.f25594a = runnable;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                this.f25594a.run();
                return null;
            }
        }

        /* synthetic */ c(boolean z8, AbstractC5465h0 abstractC5465h0, a aVar) {
            this(z8, abstractC5465h0);
        }

        public <C> C call(Callable<C> callable, Executor executor) {
            return new C5172l(this.f25593b, this.f25592a, executor, callable);
        }

        public <C> C callAsync(InterfaceC5169i interfaceC5169i, Executor executor) {
            return new C5172l(this.f25593b, this.f25592a, executor, interfaceC5169i);
        }

        public C run(Runnable runnable, Executor executor) {
            return call(new a(this, runnable), executor);
        }

        private c(boolean z8, AbstractC5465h0 abstractC5465h0) {
            this.f25592a = z8;
            this.f25593b = abstractC5465h0;
        }
    }

    private static final class d extends AbstractC5162b {

        /* renamed from: h */
        private e f25595h;

        /* synthetic */ d(e eVar, a aVar) {
            this(eVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
        public boolean cancel(boolean z8) {
            e eVar = this.f25595h;
            if (!super.cancel(z8)) {
                return false;
            }
            Objects.requireNonNull(eVar);
            eVar.g(z8);
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b
        protected void m() {
            this.f25595h = null;
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b
        protected String y() {
            e eVar = this.f25595h;
            if (eVar == null) {
                return null;
            }
            return "inputCount=[" + eVar.f25599d.length + "], remaining=[" + eVar.f25598c.get() + "]";
        }

        private d(e eVar) {
            this.f25595h = eVar;
        }
    }

    static final class e {

        /* renamed from: a */
        private boolean f25596a;

        /* renamed from: b */
        private boolean f25597b;

        /* renamed from: c */
        private final AtomicInteger f25598c;

        /* renamed from: d */
        private final C[] f25599d;

        /* renamed from: e */
        private volatile int f25600e;

        /* synthetic */ e(C[] cArr, a aVar) {
            this(cArr);
        }

        public static /* synthetic */ void d(e eVar, AbstractC5465h0 abstractC5465h0, int i8) {
            eVar.f(abstractC5465h0, i8);
        }

        private void e() {
            if (this.f25598c.decrementAndGet() == 0 && this.f25596a) {
                for (C c9 : this.f25599d) {
                    if (c9 != null) {
                        c9.cancel(this.f25597b);
                    }
                }
            }
        }

        public void f(AbstractC5465h0 abstractC5465h0, int i8) {
            C c9 = this.f25599d[i8];
            Objects.requireNonNull(c9);
            C c10 = c9;
            this.f25599d[i8] = null;
            for (int i9 = this.f25600e; i9 < abstractC5465h0.size(); i9++) {
                if (((AbstractC5162b) abstractC5465h0.get(i9)).setFuture(c10)) {
                    e();
                    this.f25600e = i9 + 1;
                    return;
                }
            }
            this.f25600e = abstractC5465h0.size();
        }

        public void g(boolean z8) {
            this.f25596a = true;
            if (!z8) {
                this.f25597b = false;
            }
            e();
        }

        private e(C[] cArr) {
            this.f25596a = false;
            this.f25597b = true;
            this.f25600e = 0;
            this.f25599d = cArr;
            this.f25598c = new AtomicInteger(cArr.length);
        }
    }

    private static final class f extends AbstractC5162b.j implements Runnable {

        /* renamed from: h */
        private C f25601h;

        f(C c9) {
            this.f25601h = c9;
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b
        protected void m() {
            this.f25601h = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            C c9 = this.f25601h;
            if (c9 != null) {
                setFuture(c9);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b
        protected String y() {
            C c9 = this.f25601h;
            if (c9 == null) {
                return null;
            }
            return "delegate=[" + c9 + "]";
        }
    }

    public static <V> void addCallback(C c9, InterfaceC5178s interfaceC5178s, Executor executor) {
        e3.w.checkNotNull(interfaceC5178s);
        c9.addListener(new b(c9, interfaceC5178s), executor);
    }

    @SafeVarargs
    public static <V> C allAsList(C... cArr) {
        return new AbstractC5171k.a(AbstractC5465h0.copyOf(cArr), true);
    }

    private static C[] c(Iterable iterable) {
        return (C[]) (iterable instanceof Collection ? (Collection) iterable : AbstractC5465h0.copyOf(iterable)).toArray(new C[0]);
    }

    public static <V, X extends Throwable> C catching(C c9, Class<X> cls, e3.l lVar, Executor executor) {
        return AbstractRunnableC5161a.D(c9, cls, lVar, executor);
    }

    public static <V, X extends Throwable> C catchingAsync(C c9, Class<X> cls, InterfaceC5170j interfaceC5170j, Executor executor) {
        return AbstractRunnableC5161a.C(c9, cls, interfaceC5170j, executor);
    }

    private static void f(Throwable th) {
        if (!(th instanceof Error)) {
            throw new Q(th);
        }
        throw new C5174n((Error) th);
    }

    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) {
        return (V) x.e(future, cls);
    }

    public static <V> V getDone(Future<V> future) {
        e3.w.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) S.getUninterruptibly(future);
    }

    public static <V> V getUnchecked(Future<V> future) {
        e3.w.checkNotNull(future);
        try {
            return (V) S.getUninterruptibly(future);
        } catch (ExecutionException e8) {
            f(e8.getCause());
            throw new AssertionError();
        }
    }

    public static <V> C immediateCancelledFuture() {
        A.a aVar = A.a.f25476h;
        return aVar != null ? aVar : new A.a();
    }

    public static <V> C immediateFailedFuture(Throwable th) {
        e3.w.checkNotNull(th);
        return new A.b(th);
    }

    public static <V> C immediateFuture(V v8) {
        return v8 == null ? A.f25473b : new A(v8);
    }

    public static C immediateVoidFuture() {
        return A.f25473b;
    }

    public static <T> AbstractC5465h0 inCompletionOrder(Iterable<? extends C> iterable) {
        C[] cArrC = c(iterable);
        final e eVar = new e(cArrC, null);
        AbstractC5465h0.a aVarBuilderWithExpectedSize = AbstractC5465h0.builderWithExpectedSize(cArrC.length);
        for (int i8 = 0; i8 < cArrC.length; i8++) {
            aVarBuilderWithExpectedSize.add((Object) new d(eVar, null));
        }
        final AbstractC5465h0 abstractC5465h0Build = aVarBuilderWithExpectedSize.build();
        for (final int i9 = 0; i9 < cArrC.length; i9++) {
            cArrC[i9].addListener(new Runnable() { // from class: com.google.common.util.concurrent.t
                @Override // java.lang.Runnable
                public final void run() {
                    v.e.d(eVar, abstractC5465h0Build, i9);
                }
            }, H.directExecutor());
        }
        return abstractC5465h0Build;
    }

    public static <I, O> Future<O> lazyTransform(Future<I> future, e3.l lVar) {
        e3.w.checkNotNull(future);
        e3.w.checkNotNull(lVar);
        return new a(future, lVar);
    }

    public static <V> C nonCancellationPropagating(C c9) {
        if (c9.isDone()) {
            return c9;
        }
        f fVar = new f(c9);
        c9.addListener(fVar, H.directExecutor());
        return fVar;
    }

    public static <O> C scheduleAsync(InterfaceC5169i interfaceC5169i, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        P pC = P.C(interfaceC5169i);
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(pC, j8, timeUnit);
        pC.addListener(new Runnable() { // from class: com.google.common.util.concurrent.u
            @Override // java.lang.Runnable
            public final void run() {
                scheduledFutureSchedule.cancel(false);
            }
        }, H.directExecutor());
        return pC;
    }

    public static <O> C submit(Callable<O> callable, Executor executor) {
        P pE = P.E(callable);
        executor.execute(pE);
        return pE;
    }

    public static <O> C submitAsync(InterfaceC5169i interfaceC5169i, Executor executor) {
        P pC = P.C(interfaceC5169i);
        executor.execute(pC);
        return pC;
    }

    @SafeVarargs
    public static <V> C successfulAsList(C... cArr) {
        return new AbstractC5171k.a(AbstractC5465h0.copyOf(cArr), false);
    }

    public static <I, O> C transform(C c9, e3.l lVar, Executor executor) {
        return AbstractRunnableC5164d.D(c9, lVar, executor);
    }

    public static <I, O> C transformAsync(C c9, InterfaceC5170j interfaceC5170j, Executor executor) {
        return AbstractRunnableC5164d.C(c9, interfaceC5170j, executor);
    }

    @SafeVarargs
    public static <V> c whenAllComplete(C... cArr) {
        return new c(false, AbstractC5465h0.copyOf(cArr), null);
    }

    @SafeVarargs
    public static <V> c whenAllSucceed(C... cArr) {
        return new c(true, AbstractC5465h0.copyOf(cArr), null);
    }

    public static <V> C withTimeout(C c9, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return c9.isDone() ? c9 : O.F(c9, j8, timeUnit, scheduledExecutorService);
    }

    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j8, TimeUnit timeUnit) {
        return (V) x.f(future, cls, j8, timeUnit);
    }

    public static <V> C successfulAsList(Iterable<? extends C> iterable) {
        return new AbstractC5171k.a(AbstractC5465h0.copyOf(iterable), false);
    }

    public static <V> c whenAllComplete(Iterable<? extends C> iterable) {
        return new c(false, AbstractC5465h0.copyOf(iterable), null);
    }

    public static <V> c whenAllSucceed(Iterable<? extends C> iterable) {
        return new c(true, AbstractC5465h0.copyOf(iterable), null);
    }

    public static <V> C allAsList(Iterable<? extends C> iterable) {
        return new AbstractC5171k.a(AbstractC5465h0.copyOf(iterable), true);
    }

    public static C submit(Runnable runnable, Executor executor) {
        P pD = P.D(runnable, null);
        executor.execute(pD);
        return pD;
    }
}
