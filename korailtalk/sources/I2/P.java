package I2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class P implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f2012a = new C2.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2012a.post(runnable);
    }
}
