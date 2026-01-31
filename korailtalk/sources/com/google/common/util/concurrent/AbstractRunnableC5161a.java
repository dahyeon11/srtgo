package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC5175o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import k3.AbstractC5857a;
import k3.AbstractC5858b;

/* renamed from: com.google.common.util.concurrent.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractRunnableC5161a extends AbstractC5175o.a implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    C f25520h;

    /* renamed from: i, reason: collision with root package name */
    Class f25521i;

    /* renamed from: j, reason: collision with root package name */
    Object f25522j;

    /* renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    private static final class C0207a extends AbstractRunnableC5161a {
        C0207a(C c9, Class cls, InterfaceC5170j interfaceC5170j) {
            super(c9, cls, interfaceC5170j);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC5161a
        /* bridge */ /* synthetic */ Object E(Object obj, Throwable th) {
            android.support.v4.media.session.f.a(obj);
            return G(null, th);
        }

        C G(InterfaceC5170j interfaceC5170j, Throwable th) {
            C cApply = interfaceC5170j.apply(th);
            e3.w.checkNotNull(cApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC5170j);
            return cApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractRunnableC5161a
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public void F(C c9) {
            setFuture(c9);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$b */
    private static final class b extends AbstractRunnableC5161a {
        b(C c9, Class cls, e3.l lVar) {
            super(c9, cls, lVar);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC5161a
        void F(Object obj) {
            set(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractRunnableC5161a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public Object E(e3.l lVar, Throwable th) {
            return lVar.apply(th);
        }
    }

    AbstractRunnableC5161a(C c9, Class cls, Object obj) {
        this.f25520h = (C) e3.w.checkNotNull(c9);
        this.f25521i = (Class) e3.w.checkNotNull(cls);
        this.f25522j = e3.w.checkNotNull(obj);
    }

    static C C(C c9, Class cls, InterfaceC5170j interfaceC5170j, Executor executor) {
        C0207a c0207a = new C0207a(c9, cls, interfaceC5170j);
        c9.addListener(c0207a, H.d(executor, c0207a));
        return c0207a;
    }

    static C D(C c9, Class cls, e3.l lVar, Executor executor) {
        b bVar = new b(c9, cls, lVar);
        c9.addListener(bVar, H.d(executor, bVar));
        return bVar;
    }

    abstract Object E(Object obj, Throwable th);

    abstract void F(Object obj);

    @Override // com.google.common.util.concurrent.AbstractC5162b
    protected final void m() {
        x(this.f25520h);
        this.f25520h = null;
        this.f25521i = null;
        this.f25522j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable e8;
        C c9 = this.f25520h;
        Class cls = this.f25521i;
        Object obj = this.f25522j;
        if (((obj == null) || ((c9 == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f25520h = null;
        try {
            e8 = c9 instanceof AbstractC5857a ? AbstractC5858b.tryInternalFastPathGetFailure((AbstractC5857a) c9) : null;
        } catch (Error e9) {
            e8 = e9;
        } catch (RuntimeException e10) {
            e8 = e10;
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + c9.getClass() + " threw " + e11.getClass() + " without a cause");
            }
            e8 = cause;
        }
        Object done = e8 == null ? v.getDone(c9) : null;
        if (e8 == null) {
            set(I.a(done));
            return;
        }
        if (!K.a(e8, cls)) {
            setFuture(c9);
            return;
        }
        try {
            Object objE = E(obj, e8);
            this.f25521i = null;
            this.f25522j = null;
            F(objE);
        } catch (Throwable th) {
            try {
                K.b(th);
                setException(th);
            } finally {
                this.f25521i = null;
                this.f25522j = null;
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b
    protected String y() {
        String str;
        C c9 = this.f25520h;
        Class cls = this.f25521i;
        Object obj = this.f25522j;
        String strY = super.y();
        if (c9 != null) {
            str = "inputFuture=[" + c9 + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strY == null) {
                return null;
            }
            return str + strY;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }
}
