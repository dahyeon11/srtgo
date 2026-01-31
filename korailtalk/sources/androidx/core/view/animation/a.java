package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.core.view.animation.a$a, reason: collision with other inner class name */
    static class C0143a {
        static Interpolator a(float f8, float f9) {
            return new PathInterpolator(f8, f9);
        }

        static Interpolator b(float f8, float f9, float f10, float f11) {
            return new PathInterpolator(f8, f9, f10, f11);
        }

        static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator create(Path path) {
        return C0143a.c(path);
    }

    public static Interpolator create(float f8, float f9) {
        return C0143a.a(f8, f9);
    }

    public static Interpolator create(float f8, float f9, float f10, float f11) {
        return C0143a.b(f8, f9, f10, f11);
    }
}
