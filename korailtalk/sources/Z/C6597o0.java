package z;

import android.os.SystemClock;
import androidx.concurrent.futures.c;
import androidx.lifecycle.LiveData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import z.t0;

/* renamed from: z.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6597o0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    final androidx.lifecycle.t f37832a = new androidx.lifecycle.t();

    /* renamed from: b, reason: collision with root package name */
    private final Map f37833b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z.o0$a */
    static final class a implements androidx.lifecycle.u {

        /* renamed from: a, reason: collision with root package name */
        final AtomicBoolean f37834a = new AtomicBoolean(true);

        /* renamed from: b, reason: collision with root package name */
        final t0.a f37835b;

        /* renamed from: c, reason: collision with root package name */
        final Executor f37836c;

        a(Executor executor, t0.a aVar) {
            this.f37836c = executor;
            this.f37835b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(b bVar) {
            if (this.f37834a.get()) {
                if (bVar.completedSuccessfully()) {
                    this.f37835b.onNewData(bVar.getValue());
                } else {
                    Z.h.checkNotNull(bVar.getError());
                    this.f37835b.onError(bVar.getError());
                }
            }
        }

        void b() {
            this.f37834a.set(false);
        }

        @Override // androidx.lifecycle.u
        public void onChanged(final b bVar) {
            this.f37836c.execute(new Runnable() { // from class: z.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37829a.c(bVar);
                }
            });
        }
    }

    /* renamed from: z.o0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Object f37837a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f37838b;

        private b(Object obj, Throwable th) {
            this.f37837a = obj;
            this.f37838b = th;
        }

        static b a(Throwable th) {
            return new b(null, (Throwable) Z.h.checkNotNull(th));
        }

        static b b(Object obj) {
            return new b(obj, null);
        }

        public boolean completedSuccessfully() {
            return this.f37838b == null;
        }

        public Throwable getError() {
            return this.f37838b;
        }

        public Object getValue() {
            if (completedSuccessfully()) {
                return this.f37837a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (completedSuccessfully()) {
                str = "Value: " + this.f37837a;
            } else {
                str = "Error: " + this.f37838b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(a aVar, a aVar2) {
        if (aVar != null) {
            this.f37832a.removeObserver(aVar);
        }
        this.f37832a.observeForever(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(c.a aVar) {
        b bVar = (b) this.f37832a.getValue();
        if (bVar == null) {
            aVar.setException(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (bVar.completedSuccessfully()) {
            aVar.set(bVar.getValue());
        } else {
            Z.h.checkNotNull(bVar.getError());
            aVar.setException(bVar.getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object g(final c.a aVar) {
        A.a.mainThreadExecutor().execute(new Runnable() { // from class: z.m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f37826a.f(aVar);
            }
        });
        return this + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(a aVar) {
        this.f37832a.removeObserver(aVar);
    }

    @Override // z.t0
    public void addObserver(Executor executor, t0.a aVar) {
        synchronized (this.f37833b) {
            try {
                final a aVar2 = (a) this.f37833b.get(aVar);
                if (aVar2 != null) {
                    aVar2.b();
                }
                final a aVar3 = new a(executor, aVar);
                this.f37833b.put(aVar, aVar3);
                A.a.mainThreadExecutor().execute(new Runnable() { // from class: z.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37820a.e(aVar2, aVar3);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.t0
    public com.google.common.util.concurrent.C fetchData() {
        return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: z.l0
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f37824a.g(aVar);
            }
        });
    }

    public LiveData getLiveData() {
        return this.f37832a;
    }

    public void postError(Throwable th) {
        this.f37832a.postValue(b.a(th));
    }

    public void postValue(Object obj) {
        this.f37832a.postValue(b.b(obj));
    }

    @Override // z.t0
    public void removeObserver(t0.a aVar) {
        synchronized (this.f37833b) {
            try {
                final a aVar2 = (a) this.f37833b.remove(aVar);
                if (aVar2 != null) {
                    aVar2.b();
                    A.a.mainThreadExecutor().execute(new Runnable() { // from class: z.j0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37816a.h(aVar2);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
