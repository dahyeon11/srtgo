package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC5175o;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes2.dex */
class P extends AbstractC5175o.a implements RunnableFuture {

    /* renamed from: h, reason: collision with root package name */
    private volatile B f25516h;

    private final class a extends B {
        a(InterfaceC5169i interfaceC5169i) {
            android.support.v4.media.session.f.a(e3.w.checkNotNull(interfaceC5169i));
        }

        @Override // com.google.common.util.concurrent.B
        void a(Throwable th) {
            P.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.B
        final boolean d() {
            return P.this.isDone();
        }

        @Override // com.google.common.util.concurrent.B
        String f() {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.B
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void b(C c9) {
            P.this.setFuture(c9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.B
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public C e() {
            throw null;
        }
    }

    private final class b extends B {

        /* renamed from: c, reason: collision with root package name */
        private final Callable f25518c;

        b(Callable callable) {
            this.f25518c = (Callable) e3.w.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.B
        void a(Throwable th) {
            P.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.B
        void b(Object obj) {
            P.this.set(obj);
        }

        @Override // com.google.common.util.concurrent.B
        final boolean d() {
            return P.this.isDone();
        }

        @Override // com.google.common.util.concurrent.B
        Object e() {
            return this.f25518c.call();
        }

        @Override // com.google.common.util.concurrent.B
        String f() {
            return this.f25518c.toString();
        }
    }

    P(Callable callable) {
        this.f25516h = new b(callable);
    }

    static P C(InterfaceC5169i interfaceC5169i) {
        return new P(interfaceC5169i);
    }

    static P D(Runnable runnable, Object obj) {
        return new P(Executors.callable(runnable, obj));
    }

    static P E(Callable callable) {
        return new P(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b
    protected void m() {
        B b9;
        super.m();
        if (B() && (b9 = this.f25516h) != null) {
            b9.c();
        }
        this.f25516h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        B b9 = this.f25516h;
        if (b9 != null) {
            b9.run();
        }
        this.f25516h = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b
    protected String y() {
        B b9 = this.f25516h;
        if (b9 == null) {
            return super.y();
        }
        return "task=[" + b9 + "]";
    }

    P(InterfaceC5169i interfaceC5169i) {
        this.f25516h = new a(interfaceC5169i);
    }
}
