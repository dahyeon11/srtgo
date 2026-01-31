package p2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import z2.t;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC6051a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f34590a;

    public ExecutorC6051a(Looper looper) {
        this.f34590a = new t(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34590a.post(runnable);
    }
}
