package n;

/* loaded from: classes.dex */
public abstract class e {
    public abstract void executeOnDiskIO(Runnable runnable);

    public void executeOnMainThread(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            postToMainThread(runnable);
        }
    }

    public abstract boolean isMainThread();

    public abstract void postToMainThread(Runnable runnable);
}
