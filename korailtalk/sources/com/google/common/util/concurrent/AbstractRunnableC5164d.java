package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC5175o;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractRunnableC5164d extends AbstractC5175o.a implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    C f25556h;

    /* renamed from: i, reason: collision with root package name */
    Object f25557i;

    /* renamed from: com.google.common.util.concurrent.d$a */
    private static final class a extends AbstractRunnableC5164d {
        a(C c9, InterfaceC5170j interfaceC5170j) {
            super(c9, interfaceC5170j);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC5164d
        /* bridge */ /* synthetic */ Object E(Object obj, Object obj2) {
            android.support.v4.media.session.f.a(obj);
            return G(null, obj2);
        }

        C G(InterfaceC5170j interfaceC5170j, Object obj) {
            C cApply = interfaceC5170j.apply(obj);
            e3.w.checkNotNull(cApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC5170j);
            return cApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractRunnableC5164d
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public void F(C c9) {
            setFuture(c9);
        }
    }

    /* renamed from: com.google.common.util.concurrent.d$b */
    private static final class b extends AbstractRunnableC5164d {
        b(C c9, e3.l lVar) {
            super(c9, lVar);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC5164d
        void F(Object obj) {
            set(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractRunnableC5164d
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public Object E(e3.l lVar, Object obj) {
            return lVar.apply(obj);
        }
    }

    AbstractRunnableC5164d(C c9, Object obj) {
        this.f25556h = (C) e3.w.checkNotNull(c9);
        this.f25557i = e3.w.checkNotNull(obj);
    }

    static C C(C c9, InterfaceC5170j interfaceC5170j, Executor executor) {
        e3.w.checkNotNull(executor);
        a aVar = new a(c9, interfaceC5170j);
        c9.addListener(aVar, H.d(executor, aVar));
        return aVar;
    }

    static C D(C c9, e3.l lVar, Executor executor) {
        e3.w.checkNotNull(lVar);
        b bVar = new b(c9, lVar);
        c9.addListener(bVar, H.d(executor, bVar));
        return bVar;
    }

    abstract Object E(Object obj, Object obj2);

    abstract void F(Object obj);

    @Override // com.google.common.util.concurrent.AbstractC5162b
    protected final void m() {
        x(this.f25556h);
        this.f25556h = null;
        this.f25557i = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C c9 = this.f25556h;
        Object obj = this.f25557i;
        if ((isCancelled() | (c9 == null)) || (obj == null)) {
            return;
        }
        this.f25556h = null;
        if (c9.isCancelled()) {
            setFuture(c9);
            return;
        }
        try {
            try {
                Object objE = E(obj, v.getDone(c9));
                this.f25557i = null;
                F(objE);
            } catch (Throwable th) {
                try {
                    K.b(th);
                    setException(th);
                } finally {
                    this.f25557i = null;
                }
            }
        } catch (Error e8) {
            setException(e8);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e9) {
            setException(e9);
        } catch (ExecutionException e10) {
            setException(e10.getCause());
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b
    protected String y() {
        String str;
        C c9 = this.f25556h;
        Object obj = this.f25557i;
        String strY = super.y();
        if (c9 != null) {
            str = "inputFuture=[" + c9 + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        }
        if (strY == null) {
            return null;
        }
        return str + strY;
    }
}
