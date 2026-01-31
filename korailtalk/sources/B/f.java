package B;

import B.g;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p.InterfaceC6046a;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a */
    private static final InterfaceC6046a f169a = new b();

    class a implements B.a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6046a f170a;

        a(InterfaceC6046a interfaceC6046a) {
            this.f170a = interfaceC6046a;
        }

        @Override // B.a
        public C apply(I i8) {
            return f.immediateFuture(this.f170a.apply(i8));
        }
    }

    class c implements B.c {

        /* renamed from: a */
        final /* synthetic */ c.a f171a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC6046a f172b;

        c(c.a aVar, InterfaceC6046a interfaceC6046a) {
            this.f171a = aVar;
            this.f172b = interfaceC6046a;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            this.f171a.setException(th);
        }

        @Override // B.c
        public void onSuccess(Object obj) {
            try {
                this.f171a.set(this.f172b.apply(obj));
            } catch (Throwable th) {
                this.f171a.setException(th);
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C f173a;

        d(C c9) {
            this.f173a = c9;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f173a.cancel(true);
        }
    }

    private static final class e implements Runnable {

        /* renamed from: a */
        final Future f174a;

        /* renamed from: b */
        final B.c f175b;

        e(Future future, B.c cVar) {
            this.f174a = future;
            this.f175b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f175b.onSuccess(f.getDone(this.f174a));
            } catch (Error e8) {
                e = e8;
                this.f175b.onFailure(e);
            } catch (RuntimeException e9) {
                e = e9;
                this.f175b.onFailure(e);
            } catch (ExecutionException e10) {
                this.f175b.onFailure(e10.getCause());
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f175b;
        }
    }

    public static <V> void addCallback(C c9, B.c cVar, Executor executor) {
        Z.h.checkNotNull(cVar);
        c9.addListener(new e(c9, cVar), executor);
    }

    public static <V> C allAsList(Collection<? extends C> collection) {
        return new h(new ArrayList(collection), true, A.a.directExecutor());
    }

    public static /* synthetic */ Object b(C c9, c.a aVar) {
        c(false, c9, f169a, aVar, A.a.directExecutor());
        return "nonCancellationPropagating[" + c9 + "]";
    }

    private static void c(boolean z8, C c9, InterfaceC6046a interfaceC6046a, c.a aVar, Executor executor) {
        Z.h.checkNotNull(c9);
        Z.h.checkNotNull(interfaceC6046a);
        Z.h.checkNotNull(aVar);
        Z.h.checkNotNull(executor);
        addCallback(c9, new c(aVar, interfaceC6046a), executor);
        if (z8) {
            aVar.addCancellationListener(new d(c9), A.a.directExecutor());
        }
    }

    public static <V> V getDone(Future<V> future) {
        Z.h.checkState(future.isDone(), "Future was expected to be done, " + future);
        return (V) getUninterruptibly(future);
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v8;
        boolean z8 = false;
        while (true) {
            try {
                v8 = future.get();
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
        return v8;
    }

    public static <V> C immediateFailedFuture(Throwable th) {
        return new g.a(th);
    }

    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(Throwable th) {
        return new g.b(th);
    }

    public static <V> C immediateFuture(V v8) {
        return v8 == null ? g.nullFuture() : new g.c(v8);
    }

    public static <V> C nonCancellationPropagating(final C c9) {
        Z.h.checkNotNull(c9);
        return c9.isDone() ? c9 : androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: B.e
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return f.b(c9, aVar);
            }
        });
    }

    public static <V> void propagate(C c9, c.a aVar) {
        propagateTransform(c9, f169a, aVar, A.a.directExecutor());
    }

    public static <I, O> void propagateTransform(C c9, InterfaceC6046a interfaceC6046a, c.a aVar, Executor executor) {
        c(true, c9, interfaceC6046a, aVar, executor);
    }

    public static <V> C successfulAsList(Collection<? extends C> collection) {
        return new h(new ArrayList(collection), false, A.a.directExecutor());
    }

    public static <I, O> C transform(C c9, InterfaceC6046a interfaceC6046a, Executor executor) {
        Z.h.checkNotNull(interfaceC6046a);
        return transformAsync(c9, new a(interfaceC6046a), executor);
    }

    public static <I, O> C transformAsync(C c9, B.a aVar, Executor executor) {
        B.b bVar = new B.b(aVar, c9);
        c9.addListener(bVar, executor);
        return bVar;
    }

    class b implements InterfaceC6046a {
        b() {
        }

        @Override // p.InterfaceC6046a
        public Object apply(Object obj) {
            return obj;
        }
    }
}
