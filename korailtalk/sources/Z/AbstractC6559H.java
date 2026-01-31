package z;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: z.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6559H {
    public static AbstractC6559H create(Executor executor, Handler handler) {
        return new C6570b(executor, handler);
    }

    public abstract Executor getCameraExecutor();

    public abstract Handler getSchedulerHandler();
}
