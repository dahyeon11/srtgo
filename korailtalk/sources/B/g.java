package B;

import androidx.camera.core.B0;
import com.google.common.util.concurrent.C;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
abstract class g implements C {

    static class a extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f176a;

        a(Throwable th) {
            this.f176a = th;
        }

        @Override // B.g, java.util.concurrent.Future
        public Object get() throws ExecutionException {
            throw new ExecutionException(this.f176a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f176a + "]]";
        }
    }

    static final class b extends a implements ScheduledFuture {
        b(Throwable th) {
            super(th);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.lang.Comparable
        public int compareTo(Delayed delayed) {
            return -1;
        }
    }

    static final class c extends g {

        /* renamed from: b, reason: collision with root package name */
        static final g f177b = new c(null);

        /* renamed from: a, reason: collision with root package name */
        private final Object f178a;

        c(Object obj) {
            this.f178a = obj;
        }

        @Override // B.g, java.util.concurrent.Future
        public Object get() {
            return this.f178a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f178a + "]]";
        }
    }

    g() {
    }

    public static <V> C nullFuture() {
        return c.f177b;
    }

    @Override // com.google.common.util.concurrent.C
    public void addListener(Runnable runnable, Executor executor) {
        Z.h.checkNotNull(runnable);
        Z.h.checkNotNull(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            B0.e("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e8);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract Object get();

    @Override // java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) {
        Z.h.checkNotNull(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
