package h0;

import android.view.animation.Interpolator;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractInterpolatorC5576d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f31380a;

    /* renamed from: b, reason: collision with root package name */
    private final float f31381b;

    protected AbstractInterpolatorC5576d(float[] fArr) {
        this.f31380a = fArr;
        this.f31381b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f31380a;
        int iMin = Math.min((int) ((fArr.length - 1) * f8), fArr.length - 2);
        float f9 = this.f31381b;
        float f10 = (f8 - (iMin * f9)) / f9;
        float[] fArr2 = this.f31380a;
        float f11 = fArr2[iMin];
        return f11 + (f10 * (fArr2[iMin + 1] - f11));
    }
}
