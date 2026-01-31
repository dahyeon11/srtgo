package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC5167g;
import f3.AbstractC5457d0;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.common.util.concurrent.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5172l extends AbstractC5167g {

    /* renamed from: p, reason: collision with root package name */
    private c f25576p;

    /* renamed from: com.google.common.util.concurrent.l$a */
    private final class a extends c {
        a(InterfaceC5169i interfaceC5169i, Executor executor) {
            super(executor);
            android.support.v4.media.session.f.a(e3.w.checkNotNull(interfaceC5169i));
        }

        @Override // com.google.common.util.concurrent.B
        String f() {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.B
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C e() {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.C5172l.c
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(C c9) {
            C5172l.this.setFuture(c9);
        }
    }

    /* renamed from: com.google.common.util.concurrent.l$b */
    private final class b extends c {

        /* renamed from: e, reason: collision with root package name */
        private final Callable f25578e;

        b(Callable callable, Executor executor) {
            super(executor);
            this.f25578e = (Callable) e3.w.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.B
        Object e() {
            return this.f25578e.call();
        }

        @Override // com.google.common.util.concurrent.B
        String f() {
            return this.f25578e.toString();
        }

        @Override // com.google.common.util.concurrent.C5172l.c
        void i(Object obj) {
            C5172l.this.set(obj);
        }
    }

    /* renamed from: com.google.common.util.concurrent.l$c */
    private abstract class c extends B {

        /* renamed from: c, reason: collision with root package name */
        private final Executor f25580c;

        c(Executor executor) {
            this.f25580c = (Executor) e3.w.checkNotNull(executor);
        }

        @Override // com.google.common.util.concurrent.B
        final void a(Throwable th) {
            C5172l.this.f25576p = null;
            if (th instanceof ExecutionException) {
                C5172l.this.setException(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                C5172l.this.cancel(false);
            } else {
                C5172l.this.setException(th);
            }
        }

        @Override // com.google.common.util.concurrent.B
        final void b(Object obj) {
            C5172l.this.f25576p = null;
            i(obj);
        }

        @Override // com.google.common.util.concurrent.B
        final boolean d() {
            return C5172l.this.isDone();
        }

        final void h() {
            try {
                this.f25580c.execute(this);
            } catch (RejectedExecutionException e8) {
                C5172l.this.setException(e8);
            }
        }

        abstract void i(Object obj);
    }

    C5172l(AbstractC5457d0 abstractC5457d0, boolean z8, Executor executor, InterfaceC5169i interfaceC5169i) {
        super(abstractC5457d0, z8, false);
        this.f25576p = new a(interfaceC5169i, executor);
        R();
    }

    @Override // com.google.common.util.concurrent.AbstractC5167g
    void M(int i8, Object obj) {
    }

    @Override // com.google.common.util.concurrent.AbstractC5167g
    void P() {
        c cVar = this.f25576p;
        if (cVar != null) {
            cVar.h();
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC5167g
    void W(AbstractC5167g.a aVar) {
        super.W(aVar);
        if (aVar == AbstractC5167g.a.OUTPUT_FUTURE_DONE) {
            this.f25576p = null;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b
    protected void w() {
        c cVar = this.f25576p;
        if (cVar != null) {
            cVar.c();
        }
    }

    C5172l(AbstractC5457d0 abstractC5457d0, boolean z8, Executor executor, Callable callable) {
        super(abstractC5457d0, z8, false);
        this.f25576p = new b(callable, executor);
        R();
    }
}
