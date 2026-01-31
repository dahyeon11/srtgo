package androidx.room;

import androidx.lifecycle.LiveData;
import androidx.room.e;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import n.C5921c;

/* loaded from: classes.dex */
class j extends LiveData {

    /* renamed from: l, reason: collision with root package name */
    final h f10732l;

    /* renamed from: m, reason: collision with root package name */
    final boolean f10733m;

    /* renamed from: n, reason: collision with root package name */
    final Callable f10734n;

    /* renamed from: o, reason: collision with root package name */
    private final d f10735o;

    /* renamed from: p, reason: collision with root package name */
    final e.c f10736p;

    /* renamed from: q, reason: collision with root package name */
    final AtomicBoolean f10737q = new AtomicBoolean(true);

    /* renamed from: r, reason: collision with root package name */
    final AtomicBoolean f10738r = new AtomicBoolean(false);

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f10739s = new AtomicBoolean(false);

    /* renamed from: t, reason: collision with root package name */
    final Runnable f10740t = new a();

    /* renamed from: u, reason: collision with root package name */
    final Runnable f10741u = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z8;
            if (j.this.f10739s.compareAndSet(false, true)) {
                j.this.f10732l.getInvalidationTracker().addWeakObserver(j.this.f10736p);
            }
            do {
                if (j.this.f10738r.compareAndSet(false, true)) {
                    Object objCall = null;
                    z8 = false;
                    while (j.this.f10737q.compareAndSet(true, false)) {
                        try {
                            try {
                                objCall = j.this.f10734n.call();
                                z8 = true;
                            } catch (Exception e8) {
                                throw new RuntimeException("Exception while computing database live data.", e8);
                            }
                        } finally {
                            j.this.f10738r.set(false);
                        }
                    }
                    if (z8) {
                        j.this.postValue(objCall);
                    }
                } else {
                    z8 = false;
                }
                if (!z8) {
                    return;
                }
            } while (j.this.f10737q.get());
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zHasActiveObservers = j.this.hasActiveObservers();
            if (j.this.f10737q.compareAndSet(false, true) && zHasActiveObservers) {
                j.this.i().execute(j.this.f10740t);
            }
        }
    }

    class c extends e.c {
        c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.e.c
        public void onInvalidated(Set<String> set) {
            C5921c.getInstance().executeOnMainThread(j.this.f10741u);
        }
    }

    j(h hVar, d dVar, boolean z8, Callable callable, String[] strArr) {
        this.f10732l = hVar;
        this.f10733m = z8;
        this.f10734n = callable;
        this.f10735o = dVar;
        this.f10736p = new c(strArr);
    }

    @Override // androidx.lifecycle.LiveData
    protected void f() {
        super.f();
        this.f10735o.b(this);
        i().execute(this.f10740t);
    }

    @Override // androidx.lifecycle.LiveData
    protected void g() {
        super.g();
        this.f10735o.c(this);
    }

    Executor i() {
        return this.f10733m ? this.f10732l.getTransactionExecutor() : this.f10732l.getQueryExecutor();
    }
}
