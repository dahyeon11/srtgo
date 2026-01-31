package androidx.camera.core.impl.utils;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class m {
    public static void checkBackgroundThread() {
        Z.h.checkState(isBackgroundThread(), "In application's main thread");
    }

    public static void checkMainThread() {
        Z.h.checkState(isMainThread(), "Not in application's main thread");
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
