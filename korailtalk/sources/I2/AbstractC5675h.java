package i2;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.Executor;

/* renamed from: i2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5675h {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f31805a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static v0 f31806b = null;

    /* renamed from: c, reason: collision with root package name */
    static HandlerThread f31807c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Executor f31808d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f31809e = false;

    public static int getDefaultBindFlags() {
        return 4225;
    }

    public static AbstractC5675h getInstance(Context context) {
        synchronized (f31805a) {
            try {
                if (f31806b == null) {
                    f31806b = new v0(context.getApplicationContext(), f31809e ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), f31808d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f31806b;
    }

    public static HandlerThread getOrStartHandlerThread() {
        synchronized (f31805a) {
            try {
                HandlerThread handlerThread = f31807c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f31807c = handlerThread2;
                handlerThread2.start();
                return f31807c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setDefaultBindExecutor(Executor executor) {
        synchronized (f31805a) {
            try {
                v0 v0Var = f31806b;
                if (v0Var != null) {
                    v0Var.h(executor);
                }
                f31808d = executor;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setUseHandlerThreadForCallbacks() {
        synchronized (f31805a) {
            try {
                v0 v0Var = f31806b;
                if (v0Var != null && !f31809e) {
                    v0Var.i(getOrStartHandlerThread().getLooper());
                }
                f31809e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void a(q0 q0Var, ServiceConnection serviceConnection, String str);

    protected abstract boolean b(q0 q0Var, ServiceConnection serviceConnection, String str, Executor executor);

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return b(new q0(componentName, 4225), serviceConnection, str, null);
    }

    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        a(new q0(componentName, 4225), serviceConnection, str);
    }

    public final void zzb(String str, String str2, int i8, ServiceConnection serviceConnection, String str3, boolean z8) {
        a(new q0(str, str2, 4225, z8), serviceConnection, str3);
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return b(new q0(componentName, 4225), serviceConnection, str, executor);
    }

    public void unbindService(String str, ServiceConnection serviceConnection, String str2) {
        a(new q0(str, 4225, false), serviceConnection, str2);
    }

    public static HandlerThread getOrStartHandlerThread(int i8) {
        synchronized (f31805a) {
            try {
                HandlerThread handlerThread = f31807c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i8);
                f31807c = handlerThread2;
                handlerThread2.start();
                return f31807c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean bindService(String str, ServiceConnection serviceConnection, String str2) {
        return b(new q0(str, 4225, false), serviceConnection, str2, null);
    }
}
