package R0;

import Q0.n;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b implements R0.a {

    /* renamed from: a, reason: collision with root package name */
    private final n f4298a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f4299b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Executor f4300c = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.postToMainThread(runnable);
        }
    }

    public b(Executor executor) {
        this.f4298a = new n(executor);
    }

    @Override // R0.a
    public void executeOnBackgroundThread(Runnable runnable) {
        this.f4298a.execute(runnable);
    }

    @Override // R0.a
    public n getBackgroundExecutor() {
        return this.f4298a;
    }

    @Override // R0.a
    public Executor getMainThreadExecutor() {
        return this.f4300c;
    }

    @Override // R0.a
    public void postToMainThread(Runnable runnable) {
        this.f4299b.post(runnable);
    }
}
