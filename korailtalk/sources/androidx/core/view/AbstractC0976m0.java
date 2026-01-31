package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.core.view.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0976m0 {

    /* renamed from: a, reason: collision with root package name */
    private static Map f9241a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: androidx.core.view.m0$a */
    private static class a {
        static float a(VelocityTracker velocityTracker, int i8) {
            return velocityTracker.getAxisVelocity(i8);
        }

        static float b(VelocityTracker velocityTracker, int i8, int i9) {
            return velocityTracker.getAxisVelocity(i8, i9);
        }

        static boolean c(VelocityTracker velocityTracker, int i8) {
            return velocityTracker.isAxisSupported(i8);
        }
    }

    private static C0979n0 a(VelocityTracker velocityTracker) {
        return (C0979n0) f9241a.get(velocityTracker);
    }

    public static void addMovement(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f9241a.containsKey(velocityTracker)) {
                f9241a.put(velocityTracker, new C0979n0());
            }
            ((C0979n0) f9241a.get(velocityTracker)).a(motionEvent);
        }
    }

    private static void b(VelocityTracker velocityTracker) {
        f9241a.remove(velocityTracker);
    }

    public static void clear(VelocityTracker velocityTracker) {
        velocityTracker.clear();
        b(velocityTracker);
    }

    public static void computeCurrentVelocity(VelocityTracker velocityTracker, int i8, float f8) {
        velocityTracker.computeCurrentVelocity(i8, f8);
        C0979n0 c0979n0A = a(velocityTracker);
        if (c0979n0A != null) {
            c0979n0A.c(i8, f8);
        }
    }

    public static float getAxisVelocity(VelocityTracker velocityTracker, int i8) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i8);
        }
        if (i8 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i8 == 1) {
            return velocityTracker.getYVelocity();
        }
        C0979n0 c0979n0A = a(velocityTracker);
        if (c0979n0A != null) {
            return c0979n0A.d(i8);
        }
        return 0.0f;
    }

    @Deprecated
    public static float getXVelocity(VelocityTracker velocityTracker, int i8) {
        return velocityTracker.getXVelocity(i8);
    }

    @Deprecated
    public static float getYVelocity(VelocityTracker velocityTracker, int i8) {
        return velocityTracker.getYVelocity(i8);
    }

    public static boolean isAxisSupported(VelocityTracker velocityTracker, int i8) {
        return Build.VERSION.SDK_INT >= 34 ? a.c(velocityTracker, i8) : i8 == 26 || i8 == 0 || i8 == 1;
    }

    public static void recycle(VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        b(velocityTracker);
    }

    public static void computeCurrentVelocity(VelocityTracker velocityTracker, int i8) {
        computeCurrentVelocity(velocityTracker, i8, Float.MAX_VALUE);
    }

    public static float getAxisVelocity(VelocityTracker velocityTracker, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.b(velocityTracker, i8, i9);
        }
        if (i8 == 0) {
            return velocityTracker.getXVelocity(i9);
        }
        if (i8 == 1) {
            return velocityTracker.getYVelocity(i9);
        }
        return 0.0f;
    }
}
