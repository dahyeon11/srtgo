package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5749g0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f32745b = Logger.getLogger(RunnableC5749g0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f32746a;

    public RunnableC5749g0(Runnable runnable) {
        this.f32746a = (Runnable) e3.w.checkNotNull(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f32746a.run();
        } catch (Throwable th) {
            f32745b.log(Level.SEVERE, "Exception while executing runnable " + this.f32746a, th);
            e3.F.throwIfUnchecked(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f32746a + ")";
    }
}
