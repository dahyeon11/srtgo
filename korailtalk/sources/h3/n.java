package h3;

import e3.F;
import e3.w;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class n implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    private static final c f31522d;

    /* renamed from: a, reason: collision with root package name */
    final c f31523a;

    /* renamed from: b, reason: collision with root package name */
    private final Deque f31524b = new ArrayDeque(4);

    /* renamed from: c, reason: collision with root package name */
    private Throwable f31525c;

    static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        static final a f31526a = new a();

        a() {
        }

        @Override // h3.n.c
        public void suppress(Closeable closeable, Throwable th, Throwable th2) {
            m.f31521a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th2);
        }
    }

    static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Method f31527a;

        private b(Method method) {
            this.f31527a = method;
        }

        static b a() {
            try {
                return new b(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // h3.n.c
        public void suppress(Closeable closeable, Throwable th, Throwable th2) {
            if (th == th2) {
                return;
            }
            try {
                this.f31527a.invoke(th, th2);
            } catch (Throwable unused) {
                a.f31526a.suppress(closeable, th, th2);
            }
        }
    }

    interface c {
        void suppress(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        c cVarA = b.a();
        if (cVarA == null) {
            cVarA = a.f31526a;
        }
        f31522d = cVarA;
    }

    n(c cVar) {
        this.f31523a = (c) w.checkNotNull(cVar);
    }

    public static n create() {
        return new n(f31522d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws X {
        Throwable th = this.f31525c;
        while (!this.f31524b.isEmpty()) {
            Closeable closeable = (Closeable) this.f31524b.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f31523a.suppress(closeable, th, th2);
                }
            }
        }
        if (this.f31525c != null || th == null) {
            return;
        }
        F.propagateIfPossible(th, IOException.class);
        throw new AssertionError(th);
    }

    public <C extends Closeable> C register(C c9) {
        if (c9 != null) {
            this.f31524b.addFirst(c9);
        }
        return c9;
    }

    public RuntimeException rethrow(Throwable th) throws X {
        w.checkNotNull(th);
        this.f31525c = th;
        F.propagateIfPossible(th, IOException.class);
        throw new RuntimeException(th);
    }

    public <X extends Exception> RuntimeException rethrow(Throwable th, Class<X> cls) throws X {
        w.checkNotNull(th);
        this.f31525c = th;
        F.propagateIfPossible(th, IOException.class);
        F.propagateIfPossible(th, cls);
        throw new RuntimeException(th);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable th, Class<X1> cls, Class<X2> cls2) throws X {
        w.checkNotNull(th);
        this.f31525c = th;
        F.propagateIfPossible(th, IOException.class);
        F.propagateIfPossible(th, cls, cls2);
        throw new RuntimeException(th);
    }
}
