package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
class I0 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f32483c = Logger.getLogger(I0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private boolean f32484a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayDeque f32485b;

    I0() {
    }

    private void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f32485b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f32483c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    private void b(Runnable runnable) {
        if (this.f32485b == null) {
            this.f32485b = new ArrayDeque(4);
        }
        this.f32485b.add(runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        e3.w.checkNotNull(runnable, "'task' must not be null.");
        if (this.f32484a) {
            b(runnable);
            return;
        }
        this.f32484a = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                f32483c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                if (this.f32485b != null) {
                }
            } finally {
                if (this.f32485b != null) {
                    a();
                }
                this.f32484a = false;
            }
        }
    }
}
