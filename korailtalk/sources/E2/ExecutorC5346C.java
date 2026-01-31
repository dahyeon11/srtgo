package e2;

import java.util.concurrent.Executor;

/* renamed from: e2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC5346C implements Executor {

    /* renamed from: a, reason: collision with root package name */
    static final Executor f30245a = new ExecutorC5346C();

    private ExecutorC5346C() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
