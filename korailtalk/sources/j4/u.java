package j4;

import android.os.Looper;

/* loaded from: classes2.dex */
public class u {
    public static void validateMainThread() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
