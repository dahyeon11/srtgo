package I2;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class O implements Executor {
    O() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
