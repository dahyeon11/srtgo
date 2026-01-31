package A;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class a {
    public static Executor directExecutor() {
        return b.a();
    }

    public static Executor highPriorityExecutor() {
        return d.a();
    }

    public static Executor ioExecutor() {
        return e.a();
    }

    public static boolean isSequentialExecutor(Executor executor) {
        return executor instanceof g;
    }

    public static ScheduledExecutorService mainThreadExecutor() {
        return f.a();
    }

    public static ScheduledExecutorService myLooperExecutor() {
        return c.b();
    }

    public static ScheduledExecutorService newHandlerExecutor(Handler handler) {
        return new c(handler);
    }

    public static Executor newSequentialExecutor(Executor executor) {
        return new g(executor);
    }
}
