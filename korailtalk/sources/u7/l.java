package u7;

import j7.s;
import java.util.concurrent.TimeUnit;
import s7.L;
import s7.N;

/* loaded from: classes3.dex */
public abstract class l {
    public static final int TASK_NON_BLOCKING = 0;
    public static final int TASK_PROBABLY_BLOCKING = 1;
    public static final String DEFAULT_SCHEDULER_NAME = L.systemProp("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long WORK_STEALING_TIME_RESOLUTION_NS = N.systemProp$default("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, (Object) null);
    public static final int CORE_POOL_SIZE = N.systemProp$default("kotlinx.coroutines.scheduler.core.pool.size", s.coerceAtLeast(L.getAVAILABLE_PROCESSORS(), 2), 1, 0, 8, (Object) null);
    public static final int MAX_POOL_SIZE = N.systemProp$default("kotlinx.coroutines.scheduler.max.pool.size", ExecutorC6421a.MAX_SUPPORTED_POOL_SIZE, 0, ExecutorC6421a.MAX_SUPPORTED_POOL_SIZE, 4, (Object) null);
    public static final long IDLE_WORKER_KEEP_ALIVE_NS = TimeUnit.SECONDS.toNanos(N.systemProp$default("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, (Object) null));
    public static g schedulerTimeSource = e.INSTANCE;
    public static final i NonBlockingContext = new j(0);
    public static final i BlockingContext = new j(1);

    public static final boolean isBlocking(h hVar) {
        return hVar.taskContext.getTaskMode() == 1;
    }
}
