package B2;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
final class Q implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f250a = Executors.defaultThreadFactory();

    Q(n0 n0Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f250a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
