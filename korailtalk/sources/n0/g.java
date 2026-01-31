package N0;

import android.content.Context;

/* loaded from: classes.dex */
public class g {

    /* renamed from: e, reason: collision with root package name */
    private static g f3171e;

    /* renamed from: a, reason: collision with root package name */
    private a f3172a;

    /* renamed from: b, reason: collision with root package name */
    private b f3173b;

    /* renamed from: c, reason: collision with root package name */
    private e f3174c;

    /* renamed from: d, reason: collision with root package name */
    private f f3175d;

    private g(Context context, R0.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3172a = new a(applicationContext, aVar);
        this.f3173b = new b(applicationContext, aVar);
        this.f3174c = new e(applicationContext, aVar);
        this.f3175d = new f(applicationContext, aVar);
    }

    public static synchronized g getInstance(Context context, R0.a aVar) {
        try {
            if (f3171e == null) {
                f3171e = new g(context, aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3171e;
    }

    public static synchronized void setInstance(g gVar) {
        f3171e = gVar;
    }

    public a getBatteryChargingTracker() {
        return this.f3172a;
    }

    public b getBatteryNotLowTracker() {
        return this.f3173b;
    }

    public e getNetworkStateTracker() {
        return this.f3174c;
    }

    public f getStorageNotLowTracker() {
        return this.f3175d;
    }
}
