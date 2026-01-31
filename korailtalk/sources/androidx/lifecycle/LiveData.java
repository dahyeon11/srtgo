package androidx.lifecycle;

import androidx.lifecycle.AbstractC1019h;
import java.util.Iterator;
import java.util.Map;
import n.C5921c;
import o.C6021b;

/* loaded from: classes.dex */
public abstract class LiveData {

    /* renamed from: k, reason: collision with root package name */
    static final Object f9991k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f9992a;

    /* renamed from: b, reason: collision with root package name */
    private C6021b f9993b;

    /* renamed from: c, reason: collision with root package name */
    int f9994c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9995d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f9996e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f9997f;

    /* renamed from: g, reason: collision with root package name */
    private int f9998g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9999h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10000i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f10001j;

    class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements InterfaceC1023l {

        /* renamed from: e, reason: collision with root package name */
        final InterfaceC1025n f10002e;

        LifecycleBoundObserver(InterfaceC1025n interfaceC1025n, u uVar) {
            super(uVar);
            this.f10002e = interfaceC1025n;
        }

        void b() {
            this.f10002e.getLifecycle().removeObserver(this);
        }

        boolean c(InterfaceC1025n interfaceC1025n) {
            return this.f10002e == interfaceC1025n;
        }

        boolean d() {
            return this.f10002e.getLifecycle().getCurrentState().isAtLeast(AbstractC1019h.b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC1023l
        public void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
            AbstractC1019h.b currentState = this.f10002e.getLifecycle().getCurrentState();
            if (currentState == AbstractC1019h.b.DESTROYED) {
                LiveData.this.removeObserver(this.f10006a);
                return;
            }
            AbstractC1019h.b bVar = null;
            while (bVar != currentState) {
                a(d());
                bVar = currentState;
                currentState = this.f10002e.getLifecycle().getCurrentState();
            }
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f9992a) {
                obj = LiveData.this.f9997f;
                LiveData.this.f9997f = LiveData.f9991k;
            }
            LiveData.this.setValue(obj);
        }
    }

    private class b extends c {
        b(u uVar) {
            super(uVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean d() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final u f10006a;

        /* renamed from: b, reason: collision with root package name */
        boolean f10007b;

        /* renamed from: c, reason: collision with root package name */
        int f10008c = -1;

        c(u uVar) {
            this.f10006a = uVar;
        }

        void a(boolean z8) {
            if (z8 == this.f10007b) {
                return;
            }
            this.f10007b = z8;
            LiveData.this.b(z8 ? 1 : -1);
            if (this.f10007b) {
                LiveData.this.d(this);
            }
        }

        void b() {
        }

        boolean c(InterfaceC1025n interfaceC1025n) {
            return false;
        }

        abstract boolean d();
    }

    public LiveData(Object obj) {
        this.f9992a = new Object();
        this.f9993b = new C6021b();
        this.f9994c = 0;
        this.f9997f = f9991k;
        this.f10001j = new a();
        this.f9996e = obj;
        this.f9998g = 0;
    }

    static void a(String str) {
        if (C5921c.getInstance().isMainThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(c cVar) {
        if (cVar.f10007b) {
            if (!cVar.d()) {
                cVar.a(false);
                return;
            }
            int i8 = cVar.f10008c;
            int i9 = this.f9998g;
            if (i8 >= i9) {
                return;
            }
            cVar.f10008c = i9;
            cVar.f10006a.onChanged(this.f9996e);
        }
    }

    void b(int i8) {
        int i9 = this.f9994c;
        this.f9994c = i8 + i9;
        if (this.f9995d) {
            return;
        }
        this.f9995d = true;
        while (true) {
            try {
                int i10 = this.f9994c;
                if (i9 == i10) {
                    this.f9995d = false;
                    return;
                }
                boolean z8 = i9 == 0 && i10 > 0;
                boolean z9 = i9 > 0 && i10 == 0;
                if (z8) {
                    f();
                } else if (z9) {
                    g();
                }
                i9 = i10;
            } catch (Throwable th) {
                this.f9995d = false;
                throw th;
            }
        }
    }

    void d(c cVar) {
        if (this.f9999h) {
            this.f10000i = true;
            return;
        }
        this.f9999h = true;
        do {
            this.f10000i = false;
            if (cVar != null) {
                c(cVar);
                cVar = null;
            } else {
                C6021b.d dVarIteratorWithAdditions = this.f9993b.iteratorWithAdditions();
                while (dVarIteratorWithAdditions.hasNext()) {
                    c((c) ((Map.Entry) dVarIteratorWithAdditions.next()).getValue());
                    if (this.f10000i) {
                        break;
                    }
                }
            }
        } while (this.f10000i);
        this.f9999h = false;
    }

    int e() {
        return this.f9998g;
    }

    protected void f() {
    }

    protected void g() {
    }

    public Object getValue() {
        Object obj = this.f9996e;
        if (obj != f9991k) {
            return obj;
        }
        return null;
    }

    public boolean hasActiveObservers() {
        return this.f9994c > 0;
    }

    public boolean hasObservers() {
        return this.f9993b.size() > 0;
    }

    public boolean isInitialized() {
        return this.f9996e != f9991k;
    }

    public void observe(InterfaceC1025n interfaceC1025n, u uVar) {
        a("observe");
        if (interfaceC1025n.getLifecycle().getCurrentState() == AbstractC1019h.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC1025n, uVar);
        c cVar = (c) this.f9993b.putIfAbsent(uVar, lifecycleBoundObserver);
        if (cVar != null && !cVar.c(interfaceC1025n)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        interfaceC1025n.getLifecycle().addObserver(lifecycleBoundObserver);
    }

    public void observeForever(u uVar) {
        a("observeForever");
        b bVar = new b(uVar);
        c cVar = (c) this.f9993b.putIfAbsent(uVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void postValue(Object obj) {
        boolean z8;
        synchronized (this.f9992a) {
            z8 = this.f9997f == f9991k;
            this.f9997f = obj;
        }
        if (z8) {
            C5921c.getInstance().postToMainThread(this.f10001j);
        }
    }

    public void removeObserver(u uVar) {
        a("removeObserver");
        c cVar = (c) this.f9993b.remove(uVar);
        if (cVar == null) {
            return;
        }
        cVar.b();
        cVar.a(false);
    }

    public void removeObservers(InterfaceC1025n interfaceC1025n) {
        a("removeObservers");
        Iterator<Map.Entry<Object, Object>> it = this.f9993b.iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> next = it.next();
            if (((c) next.getValue()).c(interfaceC1025n)) {
                removeObserver((u) next.getKey());
            }
        }
    }

    protected void setValue(Object obj) {
        a("setValue");
        this.f9998g++;
        this.f9996e = obj;
        d(null);
    }

    public LiveData() {
        this.f9992a = new Object();
        this.f9993b = new C6021b();
        this.f9994c = 0;
        Object obj = f9991k;
        this.f9997f = obj;
        this.f10001j = new a();
        this.f9996e = obj;
        this.f9998g = -1;
    }
}
