package k4;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes2.dex */
class m {

    /* renamed from: e, reason: collision with root package name */
    private static m f33635e;

    /* renamed from: a, reason: collision with root package name */
    private Handler f33636a;

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f33637b;

    /* renamed from: c, reason: collision with root package name */
    private int f33638c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f33639d = new Object();

    private m() {
    }

    private void a() {
        synchronized (this.f33639d) {
            try {
                if (this.f33636a == null) {
                    if (this.f33638c <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f33637b = handlerThread;
                    handlerThread.start();
                    this.f33636a = new Handler(this.f33637b.getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void e() {
        synchronized (this.f33639d) {
            this.f33637b.quit();
            this.f33637b = null;
            this.f33636a = null;
        }
    }

    public static m getInstance() {
        if (f33635e == null) {
            f33635e = new m();
        }
        return f33635e;
    }

    protected void b() {
        synchronized (this.f33639d) {
            try {
                int i8 = this.f33638c - 1;
                this.f33638c = i8;
                if (i8 == 0) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void c(Runnable runnable) {
        synchronized (this.f33639d) {
            a();
            this.f33636a.post(runnable);
        }
    }

    protected void d(Runnable runnable) {
        synchronized (this.f33639d) {
            this.f33638c++;
            c(runnable);
        }
    }
}
