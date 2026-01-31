package I0;

import H0.t;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class a implements t {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f1898a;

    public a() {
        this.f1898a = androidx.core.os.i.createAsync(Looper.getMainLooper());
    }

    @Override // H0.t
    public void cancel(Runnable runnable) {
        this.f1898a.removeCallbacks(runnable);
    }

    public Handler getHandler() {
        return this.f1898a;
    }

    @Override // H0.t
    public void scheduleWithDelay(long j8, Runnable runnable) {
        this.f1898a.postDelayed(runnable, j8);
    }

    public a(Handler handler) {
        this.f1898a = handler;
    }
}
