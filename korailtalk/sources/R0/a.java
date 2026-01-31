package R0;

import Q0.n;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface a {
    void executeOnBackgroundThread(Runnable runnable);

    n getBackgroundExecutor();

    Executor getMainThreadExecutor();

    void postToMainThread(Runnable runnable);
}
