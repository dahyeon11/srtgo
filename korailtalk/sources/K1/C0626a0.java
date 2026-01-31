package K1;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.HandlerC1634Mh0;
import i2.AbstractC5683p;

/* renamed from: K1.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626a0 {

    /* renamed from: a, reason: collision with root package name */
    private HandlerThread f2799a = null;

    /* renamed from: b, reason: collision with root package name */
    private Handler f2800b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f2801c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2802d = new Object();

    public final Handler zza() {
        return this.f2800b;
    }

    public final Looper zzb() {
        Looper looper;
        synchronized (this.f2802d) {
            try {
                if (this.f2801c != 0) {
                    AbstractC5683p.checkNotNull(this.f2799a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f2799a == null) {
                    AbstractC0667v0.zza("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f2799a = handlerThread;
                    handlerThread.start();
                    this.f2800b = new HandlerC1634Mh0(this.f2799a.getLooper());
                    AbstractC0667v0.zza("Looper thread started.");
                } else {
                    AbstractC0667v0.zza("Resuming the looper thread");
                    this.f2802d.notifyAll();
                }
                this.f2801c++;
                looper = this.f2799a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }
}
