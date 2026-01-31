package androidx.concurrent.futures;

import com.google.common.util.concurrent.C;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        Object f8082a;

        /* renamed from: b, reason: collision with root package name */
        d f8083b;

        /* renamed from: c, reason: collision with root package name */
        private e f8084c = e.create();

        /* renamed from: d, reason: collision with root package name */
        private boolean f8085d;

        a() {
        }

        private void b() {
            this.f8082a = null;
            this.f8083b = null;
            this.f8084c = null;
        }

        void a() {
            this.f8082a = null;
            this.f8083b = null;
            this.f8084c.set(null);
        }

        public void addCancellationListener(Runnable runnable, Executor executor) {
            e eVar = this.f8084c;
            if (eVar != null) {
                eVar.addListener(runnable, executor);
            }
        }

        protected void finalize() {
            e eVar;
            d dVar = this.f8083b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f8082a));
            }
            if (this.f8085d || (eVar = this.f8084c) == null) {
                return;
            }
            eVar.set(null);
        }

        public boolean set(Object obj) {
            this.f8085d = true;
            d dVar = this.f8083b;
            boolean z8 = dVar != null && dVar.b(obj);
            if (z8) {
                b();
            }
            return z8;
        }

        public boolean setCancelled() {
            this.f8085d = true;
            d dVar = this.f8083b;
            boolean z8 = dVar != null && dVar.a(true);
            if (z8) {
                b();
            }
            return z8;
        }

        public boolean setException(Throwable th) {
            this.f8085d = true;
            d dVar = this.f8083b;
            boolean z8 = dVar != null && dVar.c(th);
            if (z8) {
                b();
            }
            return z8;
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0123c {
        Object attachCompleter(a aVar);
    }

    private static final class d implements C {

        /* renamed from: a, reason: collision with root package name */
        final WeakReference f8086a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a f8087b = new a();

        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String l() {
                a aVar = (a) d.this.f8086a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f8082a + "]";
            }
        }

        d(a aVar) {
            this.f8086a = new WeakReference(aVar);
        }

        boolean a(boolean z8) {
            return this.f8087b.cancel(z8);
        }

        @Override // com.google.common.util.concurrent.C
        public void addListener(Runnable runnable, Executor executor) {
            this.f8087b.addListener(runnable, executor);
        }

        boolean b(Object obj) {
            return this.f8087b.set(obj);
        }

        boolean c(Throwable th) {
            return this.f8087b.setException(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z8) {
            a aVar = (a) this.f8086a.get();
            boolean zCancel = this.f8087b.cancel(z8);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f8087b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f8087b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f8087b.isDone();
        }

        public String toString() {
            return this.f8087b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j8, TimeUnit timeUnit) {
            return this.f8087b.get(j8, timeUnit);
        }
    }

    public static <T> C getFuture(InterfaceC0123c interfaceC0123c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f8083b = dVar;
        aVar.f8082a = interfaceC0123c.getClass();
        try {
            Object objAttachCompleter = interfaceC0123c.attachCompleter(aVar);
            if (objAttachCompleter != null) {
                aVar.f8082a = objAttachCompleter;
            }
        } catch (Exception e8) {
            dVar.c(e8);
        }
        return dVar;
    }
}
