package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class h {

    private static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f9030a;

        a(Handler handler) {
            this.f9030a = (Handler) Z.h.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f9030a.post((Runnable) Z.h.checkNotNull(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f9030a + " is shutting down");
        }
    }

    public static Executor create(Handler handler) {
        return new a(handler);
    }
}
