package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Handler f7718a;

    public static Handler getInstance() {
        if (f7718a != null) {
            return f7718a;
        }
        synchronized (l.class) {
            try {
                if (f7718a == null) {
                    f7718a = androidx.core.os.i.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f7718a;
    }
}
