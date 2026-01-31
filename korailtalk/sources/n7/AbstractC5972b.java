package n7;

/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5972b {
    public abstract long currentTimeMillis();

    public abstract long nanoTime();

    public abstract void parkNanos(Object obj, long j8);

    public abstract void registerTimeLoopThread();

    public abstract void trackTask();

    public abstract void unTrackTask();

    public abstract void unpark(Thread thread);

    public abstract void unregisterTimeLoopThread();

    public abstract Runnable wrapTask(Runnable runnable);
}
