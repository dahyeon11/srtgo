package K2;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import h0.C5573a;
import h0.C5574b;
import h0.C5575c;

/* loaded from: classes2.dex */
public class a {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new C5574b();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new C5573a();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new C5575c();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f8, float f9, float f10) {
        return f8 + (f10 * (f9 - f8));
    }

    public static int lerp(int i8, int i9, float f8) {
        return i8 + Math.round(f8 * (i9 - i8));
    }

    public static float lerp(float f8, float f9, float f10, float f11, float f12) {
        return f12 < f10 ? f8 : f12 > f11 ? f9 : lerp(f8, f9, (f12 - f10) / (f11 - f10));
    }
}
