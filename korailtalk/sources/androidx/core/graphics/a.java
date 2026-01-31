package androidx.core.graphics;

import android.graphics.Color;
import androidx.core.view.AbstractC0985p0;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f8980a = new ThreadLocal();

    /* renamed from: androidx.core.graphics.a$a, reason: collision with other inner class name */
    static class C0135a {
        static Color a(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float fAlpha = color.alpha();
            float fAlpha2 = color2.alpha() * (1.0f - fAlpha);
            int componentCount = color2.getComponentCount() - 1;
            float f8 = fAlpha + fAlpha2;
            components2[componentCount] = f8;
            if (f8 > 0.0f) {
                fAlpha /= f8;
                fAlpha2 /= f8;
            }
            for (int i8 = 0; i8 < componentCount; i8++) {
                components2[i8] = (components[i8] * fAlpha) + (components2[i8] * fAlpha2);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    public static int HSLToColor(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = fArr[2];
        float fAbs = (1.0f - Math.abs((f10 * 2.0f) - 1.0f)) * f9;
        float f11 = f10 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f8 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f8) / 60) {
            case 0:
                iRound = Math.round((fAbs + f11) * 255.0f);
                iRound2 = Math.round((fAbs2 + f11) * 255.0f);
                iRound3 = Math.round(f11 * 255.0f);
                break;
            case 1:
                iRound = Math.round((fAbs2 + f11) * 255.0f);
                iRound2 = Math.round((fAbs + f11) * 255.0f);
                iRound3 = Math.round(f11 * 255.0f);
                break;
            case 2:
                iRound = Math.round(f11 * 255.0f);
                iRound2 = Math.round((fAbs + f11) * 255.0f);
                iRound3 = Math.round((fAbs2 + f11) * 255.0f);
                break;
            case 3:
                iRound = Math.round(f11 * 255.0f);
                iRound2 = Math.round((fAbs2 + f11) * 255.0f);
                iRound3 = Math.round((fAbs + f11) * 255.0f);
                break;
            case 4:
                iRound = Math.round((fAbs2 + f11) * 255.0f);
                iRound2 = Math.round(f11 * 255.0f);
                iRound3 = Math.round((fAbs + f11) * 255.0f);
                break;
            case 5:
            case 6:
                iRound = Math.round((fAbs + f11) * 255.0f);
                iRound2 = Math.round(f11 * 255.0f);
                iRound3 = Math.round((fAbs2 + f11) * 255.0f);
                break;
            default:
                iRound3 = 0;
                iRound = 0;
                iRound2 = 0;
                break;
        }
        return Color.rgb(e(iRound, 0, 255), e(iRound2, 0, 255), e(iRound3, 0, 255));
    }

    public static int LABToColor(double d9, double d10, double d11) {
        double[] dArrF = f();
        LABToXYZ(d9, d10, d11, dArrF);
        return XYZToColor(dArrF[0], dArrF[1], dArrF[2]);
    }

    public static void LABToXYZ(double d9, double d10, double d11, double[] dArr) {
        double d12 = (d9 + 16.0d) / 116.0d;
        double d13 = (d10 / 500.0d) + d12;
        double d14 = d12 - (d11 / 200.0d);
        double dPow = Math.pow(d13, 3.0d);
        if (dPow <= 0.008856d) {
            dPow = ((d13 * 116.0d) - 16.0d) / 903.3d;
        }
        double dPow2 = d9 > 7.9996247999999985d ? Math.pow(d12, 3.0d) : d9 / 903.3d;
        double dPow3 = Math.pow(d14, 3.0d);
        if (dPow3 <= 0.008856d) {
            dPow3 = ((d14 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = dPow * 95.047d;
        dArr[1] = dPow2 * 100.0d;
        dArr[2] = dPow3 * 108.883d;
    }

    public static int M3HCTToColor(float f8, float f9, float f10) {
        return androidx.core.content.res.a.toColor(f8, f9, f10);
    }

    public static void RGBToHSL(int i8, int i9, int i10, float[] fArr) {
        float f8;
        float fAbs;
        float f9 = i8 / 255.0f;
        float f10 = i9 / 255.0f;
        float f11 = i10 / 255.0f;
        float fMax = Math.max(f9, Math.max(f10, f11));
        float fMin = Math.min(f9, Math.min(f10, f11));
        float f12 = fMax - fMin;
        float f13 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f8 = 0.0f;
            fAbs = 0.0f;
        } else {
            f8 = fMax == f9 ? ((f10 - f11) / f12) % 6.0f : fMax == f10 ? ((f11 - f9) / f12) + 2.0f : 4.0f + ((f9 - f10) / f12);
            fAbs = f12 / (1.0f - Math.abs((2.0f * f13) - 1.0f));
        }
        float f14 = (f8 * 60.0f) % 360.0f;
        if (f14 < 0.0f) {
            f14 += 360.0f;
        }
        fArr[0] = d(f14, 0.0f, 360.0f);
        fArr[1] = d(fAbs, 0.0f, 1.0f);
        fArr[2] = d(f13, 0.0f, 1.0f);
    }

    public static void RGBToLAB(int i8, int i9, int i10, double[] dArr) {
        RGBToXYZ(i8, i9, i10, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void RGBToXYZ(int i8, int i9, int i10, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d9 = i8 / 255.0d;
        double dPow = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        double d10 = i9 / 255.0d;
        double dPow2 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = i10 / 255.0d;
        double dPow3 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static int XYZToColor(double d9, double d10, double d11) {
        double d12 = (((3.2406d * d9) + ((-1.5372d) * d10)) + ((-0.4986d) * d11)) / 100.0d;
        double d13 = ((((-0.9689d) * d9) + (1.8758d * d10)) + (0.0415d * d11)) / 100.0d;
        double d14 = (((0.0557d * d9) + ((-0.204d) * d10)) + (1.057d * d11)) / 100.0d;
        return Color.rgb(e((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d), 0, 255), e((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, 255), e((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d), 0, 255));
    }

    public static void XYZToLAB(double d9, double d10, double d11, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dG = g(d9 / 95.047d);
        double dG2 = g(d10 / 100.0d);
        double dG3 = g(d11 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * dG2) - 16.0d);
        dArr[1] = (dG - dG2) * 500.0d;
        dArr[2] = (dG2 - dG3) * 200.0d;
    }

    static float a(float f8, float f9, float f10) {
        if (Math.abs(f9 - f8) > 180.0f) {
            if (f9 > f8) {
                f8 += 360.0f;
            } else {
                f9 += 360.0f;
            }
        }
        return (f8 + ((f9 - f8) * f10)) % 360.0f;
    }

    private static int b(int i8, int i9) {
        return 255 - (((255 - i9) * (255 - i8)) / 255);
    }

    public static int blendARGB(int i8, int i9, float f8) {
        float f9 = 1.0f - f8;
        return Color.argb((int) ((Color.alpha(i8) * f9) + (Color.alpha(i9) * f8)), (int) ((Color.red(i8) * f9) + (Color.red(i9) * f8)), (int) ((Color.green(i8) * f9) + (Color.green(i9) * f8)), (int) ((Color.blue(i8) * f9) + (Color.blue(i9) * f8)));
    }

    public static void blendHSL(float[] fArr, float[] fArr2, float f8, float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f9 = 1.0f - f8;
        fArr3[0] = a(fArr[0], fArr2[0], f8);
        fArr3[1] = (fArr[1] * f9) + (fArr2[1] * f8);
        fArr3[2] = (fArr[2] * f9) + (fArr2[2] * f8);
    }

    public static void blendLAB(double[] dArr, double[] dArr2, double d9, double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d10 = 1.0d - d9;
        dArr3[0] = (dArr[0] * d10) + (dArr2[0] * d9);
        dArr3[1] = (dArr[1] * d10) + (dArr2[1] * d9);
        dArr3[2] = (dArr[2] * d10) + (dArr2[2] * d9);
    }

    private static int c(int i8, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        return (((i8 * 255) * i9) + ((i10 * i11) * (255 - i9))) / (i12 * 255);
    }

    public static double calculateContrast(int i8, int i9) {
        if (Color.alpha(i9) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i9));
        }
        if (Color.alpha(i8) < 255) {
            i8 = compositeColors(i8, i9);
        }
        double dCalculateLuminance = calculateLuminance(i8) + 0.05d;
        double dCalculateLuminance2 = calculateLuminance(i9) + 0.05d;
        return Math.max(dCalculateLuminance, dCalculateLuminance2) / Math.min(dCalculateLuminance, dCalculateLuminance2);
    }

    public static double calculateLuminance(int i8) {
        double[] dArrF = f();
        colorToXYZ(i8, dArrF);
        return dArrF[1] / 100.0d;
    }

    public static int calculateMinimumAlpha(int i8, int i9, float f8) {
        int i10 = 255;
        if (Color.alpha(i9) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i9));
        }
        double d9 = f8;
        if (calculateContrast(setAlphaComponent(i8, 255), i9) < d9) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 <= 10 && i10 - i11 > 1; i12++) {
            int i13 = (i11 + i10) / 2;
            if (calculateContrast(setAlphaComponent(i8, i13), i9) < d9) {
                i11 = i13;
            } else {
                i10 = i13;
            }
        }
        return i10;
    }

    public static void colorToHSL(int i8, float[] fArr) {
        RGBToHSL(Color.red(i8), Color.green(i8), Color.blue(i8), fArr);
    }

    public static void colorToLAB(int i8, double[] dArr) {
        RGBToLAB(Color.red(i8), Color.green(i8), Color.blue(i8), dArr);
    }

    public static void colorToM3HCT(int i8, float[] fArr) {
        androidx.core.content.res.a.getM3HCTfromColor(i8, fArr);
    }

    public static void colorToXYZ(int i8, double[] dArr) {
        RGBToXYZ(Color.red(i8), Color.green(i8), Color.blue(i8), dArr);
    }

    public static int compositeColors(int i8, int i9) {
        int iAlpha = Color.alpha(i9);
        int iAlpha2 = Color.alpha(i8);
        int iB = b(iAlpha2, iAlpha);
        return Color.argb(iB, c(Color.red(i8), iAlpha2, Color.red(i9), iAlpha, iB), c(Color.green(i8), iAlpha2, Color.green(i9), iAlpha, iB), c(Color.blue(i8), iAlpha2, Color.blue(i9), iAlpha, iB));
    }

    private static float d(float f8, float f9, float f10) {
        return f8 < f9 ? f9 : Math.min(f8, f10);
    }

    public static double distanceEuclidean(double[] dArr, double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    private static int e(int i8, int i9, int i10) {
        return i8 < i9 ? i9 : Math.min(i8, i10);
    }

    private static double[] f() {
        ThreadLocal threadLocal = f8980a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    private static double g(double d9) {
        return d9 > 0.008856d ? Math.pow(d9, 0.3333333333333333d) : ((d9 * 903.3d) + 16.0d) / 116.0d;
    }

    public static int setAlphaComponent(int i8, int i9) {
        if (i9 < 0 || i9 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i8 & AbstractC0985p0.MEASURED_SIZE_MASK) | (i9 << 24);
    }

    public static Color compositeColors(Color color, Color color2) {
        return C0135a.a(color, color2);
    }
}
