package A;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ScheduledExecutorService f24a;

    static ScheduledExecutorService a() {
        if (f24a != null) {
            return f24a;
        }
        synchronized (f.class) {
            try {
                if (f24a == null) {
                    f24a = new c(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24a;
    }
}
