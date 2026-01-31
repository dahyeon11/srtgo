package D1;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f905a;

    /* renamed from: b, reason: collision with root package name */
    private final long f906b;

    /* renamed from: c, reason: collision with root package name */
    final CountDownLatch f907c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    boolean f908d = false;

    public c(a aVar, long j8) {
        this.f905a = new WeakReference(aVar);
        this.f906b = j8;
        start();
    }

    private final void a() {
        a aVar = (a) this.f905a.get();
        if (aVar != null) {
            aVar.zza();
            this.f908d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f907c.await(this.f906b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
