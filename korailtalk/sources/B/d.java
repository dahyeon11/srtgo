package B;

import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.C;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p.InterfaceC6046a;

/* loaded from: classes.dex */
public class d implements C {

    /* renamed from: a, reason: collision with root package name */
    private final C f165a;

    /* renamed from: b, reason: collision with root package name */
    c.a f166b;

    class a implements c.InterfaceC0123c {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0123c
        public Object attachCompleter(c.a aVar) {
            Z.h.checkState(d.this.f166b == null, "The result can only set once!");
            d.this.f166b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    d(C c9) {
        this.f165a = (C) Z.h.checkNotNull(c9);
    }

    public static <V> d from(C c9) {
        return c9 instanceof d ? (d) c9 : new d(c9);
    }

    boolean a(Object obj) {
        c.a aVar = this.f166b;
        if (aVar != null) {
            return aVar.set(obj);
        }
        return false;
    }

    public final void addCallback(c cVar, Executor executor) {
        f.addCallback(this, cVar, executor);
    }

    @Override // com.google.common.util.concurrent.C
    public void addListener(Runnable runnable, Executor executor) {
        this.f165a.addListener(runnable, executor);
    }

    boolean b(Throwable th) {
        c.a aVar = this.f166b;
        if (aVar != null) {
            return aVar.setException(th);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return this.f165a.cancel(z8);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f165a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f165a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f165a.isDone();
    }

    public final <T> d transform(InterfaceC6046a interfaceC6046a, Executor executor) {
        return (d) f.transform(this, interfaceC6046a, executor);
    }

    public final <T> d transformAsync(B.a aVar, Executor executor) {
        return (d) f.transformAsync(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) {
        return this.f165a.get(j8, timeUnit);
    }

    d() {
        this.f165a = androidx.concurrent.futures.c.getFuture(new a());
    }
}
