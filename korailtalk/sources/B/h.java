package B;

import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class h implements C {

    /* renamed from: a, reason: collision with root package name */
    List f179a;

    /* renamed from: b, reason: collision with root package name */
    List f180b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f181c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f182d;

    /* renamed from: e, reason: collision with root package name */
    private final C f183e = androidx.concurrent.futures.c.getFuture(new a());

    /* renamed from: f, reason: collision with root package name */
    c.a f184f;

    class a implements c.InterfaceC0123c {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0123c
        public Object attachCompleter(c.a aVar) {
            Z.h.checkState(h.this.f184f == null, "The result can only set once!");
            h.this.f184f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f180b = null;
            hVar.f179a = null;
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f187a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f188b;

        c(int i8, C c9) {
            this.f187a = i8;
            this.f188b = c9;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.c(this.f187a, this.f188b);
        }
    }

    h(List list, boolean z8, Executor executor) {
        this.f179a = (List) Z.h.checkNotNull(list);
        this.f180b = new ArrayList(list.size());
        this.f181c = z8;
        this.f182d = new AtomicInteger(list.size());
        b(executor);
    }

    private void a() throws InterruptedException {
        List<C> list = this.f179a;
        if (list == null || isDone()) {
            return;
        }
        for (C c9 : list) {
            while (!c9.isDone()) {
                try {
                    c9.get();
                } catch (Error e8) {
                    throw e8;
                } catch (InterruptedException e9) {
                    throw e9;
                } catch (Throwable unused) {
                    if (this.f181c) {
                        return;
                    }
                }
            }
        }
    }

    private void b(Executor executor) {
        addListener(new b(), A.a.directExecutor());
        if (this.f179a.isEmpty()) {
            this.f184f.set(new ArrayList(this.f180b));
            return;
        }
        for (int i8 = 0; i8 < this.f179a.size(); i8++) {
            this.f180b.add(null);
        }
        List list = this.f179a;
        for (int i9 = 0; i9 < list.size(); i9++) {
            C c9 = (C) list.get(i9);
            c9.addListener(new c(i9, c9), executor);
        }
    }

    @Override // com.google.common.util.concurrent.C
    public void addListener(Runnable runnable, Executor executor) {
        this.f183e.addListener(runnable, executor);
    }

    void c(int i8, Future future) {
        c.a aVar;
        ArrayList arrayList;
        int iDecrementAndGet;
        List list = this.f180b;
        if (isDone() || list == null) {
            Z.h.checkState(this.f181c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        Z.h.checkState(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i8, f.getUninterruptibly(future));
                        iDecrementAndGet = this.f182d.decrementAndGet();
                        Z.h.checkState(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                    } catch (Error e8) {
                        this.f184f.setException(e8);
                        int iDecrementAndGet2 = this.f182d.decrementAndGet();
                        Z.h.checkState(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet2 != 0) {
                            return;
                        }
                        List list2 = this.f180b;
                        if (list2 != null) {
                            aVar = this.f184f;
                            arrayList = new ArrayList(list2);
                        }
                    } catch (CancellationException unused) {
                        if (this.f181c) {
                            cancel(false);
                        }
                        int iDecrementAndGet3 = this.f182d.decrementAndGet();
                        Z.h.checkState(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 != 0) {
                            return;
                        }
                        List list3 = this.f180b;
                        if (list3 != null) {
                            aVar = this.f184f;
                            arrayList = new ArrayList(list3);
                        }
                    }
                } catch (ExecutionException e9) {
                    if (this.f181c) {
                        this.f184f.setException(e9.getCause());
                    }
                    int iDecrementAndGet4 = this.f182d.decrementAndGet();
                    Z.h.checkState(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 != 0) {
                        return;
                    }
                    List list4 = this.f180b;
                    if (list4 != null) {
                        aVar = this.f184f;
                        arrayList = new ArrayList(list4);
                    }
                }
            } catch (RuntimeException e10) {
                if (this.f181c) {
                    this.f184f.setException(e10);
                }
                int iDecrementAndGet5 = this.f182d.decrementAndGet();
                Z.h.checkState(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 != 0) {
                    return;
                }
                List list5 = this.f180b;
                if (list5 != null) {
                    aVar = this.f184f;
                    arrayList = new ArrayList(list5);
                }
            }
            if (iDecrementAndGet == 0) {
                List list6 = this.f180b;
                if (list6 != null) {
                    aVar = this.f184f;
                    arrayList = new ArrayList(list6);
                    aVar.set(arrayList);
                    return;
                }
                Z.h.checkState(isDone());
            }
        } catch (Throwable th) {
            int iDecrementAndGet6 = this.f182d.decrementAndGet();
            Z.h.checkState(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List list7 = this.f180b;
                if (list7 != null) {
                    this.f184f.set(new ArrayList(list7));
                } else {
                    Z.h.checkState(isDone());
                }
            }
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        List list = this.f179a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C) it.next()).cancel(z8);
            }
        }
        return this.f183e.cancel(z8);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f183e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f183e.isDone();
    }

    @Override // java.util.concurrent.Future
    public List<Object> get() throws InterruptedException {
        a();
        return (List) this.f183e.get();
    }

    @Override // java.util.concurrent.Future
    public List<Object> get(long j8, TimeUnit timeUnit) {
        return (List) this.f183e.get(j8, timeUnit);
    }
}
