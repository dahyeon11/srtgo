package x2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class h implements InterfaceC6489f {
    /* synthetic */ h(g gVar) {
    }

    @Override // x2.InterfaceC6489f
    public final ExecutorService zaa(ThreadFactory threadFactory, int i8) {
        return zac(1, threadFactory, 1);
    }

    @Override // x2.InterfaceC6489f
    public final ExecutorService zab(int i8, int i9) {
        return zac(4, Executors.defaultThreadFactory(), 2);
    }

    @Override // x2.InterfaceC6489f
    public final ExecutorService zac(int i8, ThreadFactory threadFactory, int i9) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i8, i8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
