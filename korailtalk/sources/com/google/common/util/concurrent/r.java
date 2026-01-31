package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class r extends AbstractFutureC5177q implements C {

    public static abstract class a extends r {

        /* renamed from: a, reason: collision with root package name */
        private final C f25584a;

        protected a(C c9) {
            this.f25584a = (C) e3.w.checkNotNull(c9);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f3.X
        /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final C delegate() {
            return this.f25584a;
        }
    }

    protected r() {
    }

    @Override // com.google.common.util.concurrent.C
    public void addListener(Runnable runnable, Executor executor) {
        a().addListener(runnable, executor);
    }

    /* renamed from: b */
    protected abstract C a();
}
