package A;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f4a;

    b() {
    }

    static Executor a() {
        if (f4a != null) {
            return f4a;
        }
        synchronized (b.class) {
            try {
                if (f4a == null) {
                    f4a = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
