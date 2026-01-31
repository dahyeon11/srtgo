package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class C0 {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    static class a {
        static void a(Window window, boolean z8) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z8 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    static class b {
        static <T> T a(Window window, int i8) {
            return (T) window.requireViewById(i8);
        }
    }

    static class c {
        static void a(Window window, boolean z8) {
            window.setDecorFitsSystemWindows(z8);
        }
    }

    public static H1 getInsetsController(Window window, View view) {
        return new H1(window, view);
    }

    public static <T extends View> T requireViewById(Window window, int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) b.a(window, i8);
        }
        T t8 = (T) window.findViewById(i8);
        if (t8 != null) {
            return t8;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(Window window, boolean z8) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(window, z8);
        } else {
            a.a(window, z8);
        }
    }
}
