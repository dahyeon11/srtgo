package i2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f31775a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f31776b;

    /* renamed from: c, reason: collision with root package name */
    private static String f31777c;

    /* renamed from: d, reason: collision with root package name */
    private static int f31778d;

    private static void a(Context context) {
        Bundle bundle;
        synchronized (f31775a) {
            try {
                if (f31776b) {
                    return;
                }
                f31776b = true;
                try {
                    bundle = q2.e.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e8);
                }
                if (bundle == null) {
                    return;
                }
                f31777c = bundle.getString("com.google.app.id");
                f31778d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int zza(Context context) {
        a(context);
        return f31778d;
    }

    public static String zzb(Context context) {
        a(context);
        return f31777c;
    }
}
