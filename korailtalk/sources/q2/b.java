package q2;

import android.content.Context;
import o2.n;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f34915a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f34916b;

    public static synchronized boolean isInstantApp(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f34915a;
        if (context2 != null && (bool = f34916b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f34916b = null;
        if (n.isAtLeastO()) {
            f34916b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f34916b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f34916b = Boolean.FALSE;
            }
        }
        f34915a = applicationContext;
        return f34916b.booleanValue();
    }
}
