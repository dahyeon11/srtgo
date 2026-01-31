package x3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import l3.C5889a;
import r3.C6173a;
import r3.c;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6490a {
    public static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";

    /* renamed from: a, reason: collision with root package name */
    private final Context f37509a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f37510b;

    /* renamed from: c, reason: collision with root package name */
    private final c f37511c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f37512d = new AtomicBoolean(b());

    public C6490a(Context context, String str, c cVar) {
        this.f37509a = a(context);
        this.f37510b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f37511c = cVar;
    }

    private static Context a(Context context) {
        return androidx.core.content.a.isDeviceProtectedStorage(context) ? context : androidx.core.content.a.createDeviceProtectedStorageContext(context);
    }

    private boolean b() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (this.f37510b.contains(DATA_COLLECTION_DEFAULT_ENABLED)) {
            return this.f37510b.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED, true);
        }
        try {
            PackageManager packageManager = this.f37509a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f37509a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(DATA_COLLECTION_DEFAULT_ENABLED)) {
                return applicationInfo.metaData.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    public boolean isEnabled() {
        return this.f37512d.get();
    }

    public void setEnabled(boolean z8) {
        if (this.f37512d.compareAndSet(!z8, z8)) {
            this.f37510b.edit().putBoolean(DATA_COLLECTION_DEFAULT_ENABLED, z8).apply();
            this.f37511c.publish(new C6173a(C5889a.class, new C5889a(z8)));
        }
    }
}
