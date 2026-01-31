package n2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import i2.AbstractC5683p;
import i2.w0;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o2.n;
import q2.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f34203a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f34204b;
    public final ConcurrentHashMap zza = new ConcurrentHashMap();

    private b() {
    }

    private static void a(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean b(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i8, boolean z8, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((e.packageManager(context).getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!c(serviceConnection)) {
            return d(context, intent, serviceConnection, i8, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zD = d(context, intent, serviceConnection, i8, executor);
            if (zD) {
                return zD;
            }
            return false;
        } finally {
            this.zza.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean c(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof w0);
    }

    private static final boolean d(Context context, Intent intent, ServiceConnection serviceConnection, int i8, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!n.isAtLeastQ() || executor == null) ? context.bindService(intent, serviceConnection, i8) : context.bindService(intent, i8, executor, serviceConnection);
    }

    public static b getInstance() {
        if (f34204b == null) {
            synchronized (f34203a) {
                try {
                    if (f34204b == null) {
                        f34204b = new b();
                    }
                } finally {
                }
            }
        }
        b bVar = f34204b;
        AbstractC5683p.checkNotNull(bVar);
        return bVar;
    }

    @ResultIgnorabilityUnspecified
    public boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i8) {
        return b(context, context.getClass().getName(), intent, serviceConnection, i8, true, null);
    }

    public void unbindService(Context context, ServiceConnection serviceConnection) {
        if (!c(serviceConnection) || !this.zza.containsKey(serviceConnection)) {
            a(context, serviceConnection);
            return;
        }
        try {
            a(context, (ServiceConnection) this.zza.get(serviceConnection));
        } finally {
            this.zza.remove(serviceConnection);
        }
    }

    public void unbindServiceSafe(Context context, ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i8, Executor executor) {
        return b(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
