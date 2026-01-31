package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class q implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public abstract float getInterpolation(float f8);

    public abstract float getVelocity();
}
