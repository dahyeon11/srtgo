package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;

/* loaded from: classes.dex */
public abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    private Rational f7421a;

    public G0() {
        this(null);
    }

    public static float getDefaultPointSize() {
        return 0.15f;
    }

    protected abstract PointF a(float f8, float f9);

    public final F0 createPoint(float f8, float f9) {
        return createPoint(f8, f9, getDefaultPointSize());
    }

    public G0(Rational rational) {
        this.f7421a = rational;
    }

    public final F0 createPoint(float f8, float f9, float f10) {
        PointF pointFA = a(f8, f9);
        return new F0(pointFA.x, pointFA.y, f10, this.f7421a);
    }
}
