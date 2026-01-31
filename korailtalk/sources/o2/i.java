package o2;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class i implements f {

    /* renamed from: a, reason: collision with root package name */
    private static final i f34445a = new i();

    private i() {
    }

    public static f getInstance() {
        return f34445a;
    }

    @Override // o2.f
    public final long currentThreadTimeMillis() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // o2.f
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // o2.f
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // o2.f
    public final long nanoTime() {
        return System.nanoTime();
    }
}
