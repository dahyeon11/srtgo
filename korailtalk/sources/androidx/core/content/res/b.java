package androidx.core.content.res;

import android.graphics.Color;

/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final float[][] f8933a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    static final float[][] f8934b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    static final float[] f8935c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    static final float[][] f8936d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static int a(float f8) {
        if (f8 < 1.0f) {
            return -16777216;
        }
        if (f8 > 99.0f) {
            return -1;
        }
        float f9 = (f8 + 16.0f) / 116.0f;
        float f10 = f8 > 8.0f ? f9 * f9 * f9 : f8 / 903.2963f;
        float f11 = f9 * f9 * f9;
        boolean z8 = f11 > 0.008856452f;
        float f12 = z8 ? f11 : ((f9 * 116.0f) - 16.0f) / 903.2963f;
        if (!z8) {
            f11 = ((f9 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f8935c;
        return androidx.core.graphics.a.XYZToColor(f12 * fArr[0], f10 * fArr[1], f11 * fArr[2]);
    }

    static float b(int i8) {
        return c(g(i8));
    }

    static float c(float f8) {
        float f9 = f8 / 100.0f;
        return f9 <= 0.008856452f ? f9 * 903.2963f : (((float) Math.cbrt(f9)) * 116.0f) - 16.0f;
    }

    static float d(float f8, float f9, float f10) {
        return f8 + ((f9 - f8) * f10);
    }

    static float e(int i8) {
        float f8 = i8 / 255.0f;
        return (f8 <= 0.04045f ? f8 / 12.92f : (float) Math.pow((f8 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    static void f(int i8, float[] fArr) {
        float fE = e(Color.red(i8));
        float fE2 = e(Color.green(i8));
        float fE3 = e(Color.blue(i8));
        float[][] fArr2 = f8936d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fE) + (fArr3[1] * fE2) + (fArr3[2] * fE3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fE) + (fArr4[1] * fE2) + (fArr4[2] * fE3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fE * fArr5[0]) + (fE2 * fArr5[1]) + (fE3 * fArr5[2]);
    }

    static float g(int i8) {
        float fE = e(Color.red(i8));
        float fE2 = e(Color.green(i8));
        float fE3 = e(Color.blue(i8));
        float[] fArr = f8936d[1];
        return (fE * fArr[0]) + (fE2 * fArr[1]) + (fE3 * fArr[2]);
    }

    static float h(float f8) {
        return (f8 > 8.0f ? (float) Math.pow((f8 + 16.0d) / 116.0d, 3.0d) : f8 / 903.2963f) * 100.0f;
    }
}
