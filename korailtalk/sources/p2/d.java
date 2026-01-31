package p2;

import android.os.Process;

/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f34596a;

    public d(Runnable runnable, int i8) {
        this.f34596a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.f34596a.run();
    }
}
