package P;

import java.util.Arrays;

/* loaded from: classes.dex */
public class f {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;

    /* renamed from: c, reason: collision with root package name */
    double[] f3592c;

    /* renamed from: d, reason: collision with root package name */
    int f3593d;

    /* renamed from: a, reason: collision with root package name */
    float[] f3590a = new float[0];

    /* renamed from: b, reason: collision with root package name */
    double[] f3591b = new double[0];

    /* renamed from: e, reason: collision with root package name */
    double f3594e = 6.283185307179586d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3595f = false;

    double a(double d9) {
        if (d9 <= 0.0d) {
            d9 = 1.0E-5d;
        } else if (d9 >= 1.0d) {
            d9 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f3591b, d9);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return 0.0d;
        }
        int i8 = -iBinarySearch;
        int i9 = i8 - 1;
        float[] fArr = this.f3590a;
        float f8 = fArr[i9];
        int i10 = i8 - 2;
        float f9 = fArr[i10];
        double[] dArr = this.f3591b;
        double d10 = dArr[i9];
        double d11 = dArr[i10];
        double d12 = (f8 - f9) / (d10 - d11);
        return (d9 * d12) + (f9 - (d12 * d11));
    }

    public void addPoint(double d9, float f8) {
        int length = this.f3590a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f3591b, d9);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f3591b = Arrays.copyOf(this.f3591b, length);
        this.f3590a = Arrays.copyOf(this.f3590a, length);
        this.f3592c = new double[length];
        double[] dArr = this.f3591b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f3591b[iBinarySearch] = d9;
        this.f3590a[iBinarySearch] = f8;
        this.f3595f = false;
    }

    double b(double d9) {
        if (d9 < 0.0d) {
            d9 = 0.0d;
        } else if (d9 > 1.0d) {
            d9 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f3591b, d9);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i8 = -iBinarySearch;
        int i9 = i8 - 1;
        float[] fArr = this.f3590a;
        float f8 = fArr[i9];
        int i10 = i8 - 2;
        float f9 = fArr[i10];
        double[] dArr = this.f3591b;
        double d10 = dArr[i9];
        double d11 = dArr[i10];
        double d12 = (f8 - f9) / (d10 - d11);
        return this.f3592c[i10] + ((f9 - (d12 * d11)) * (d9 - d11)) + ((d12 * ((d9 * d9) - (d11 * d11))) / 2.0d);
    }

    public double getSlope(double d9) {
        double dA;
        double dSignum;
        double dA2;
        double dA3;
        double dSin;
        switch (this.f3593d) {
            case 1:
                return 0.0d;
            case 2:
                dA = a(d9) * 4.0d;
                dSignum = Math.signum((((b(d9) * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                return dA * dSignum;
            case 3:
                dA2 = a(d9);
                return dA2 * 2.0d;
            case 4:
                dA2 = -a(d9);
                return dA2 * 2.0d;
            case 5:
                dA3 = (-this.f3594e) * a(d9);
                dSin = Math.sin(this.f3594e * b(d9));
                return dA3 * dSin;
            case 6:
                dA = a(d9) * 4.0d;
                dSignum = (((b(d9) * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                return dA * dSignum;
            default:
                dA3 = this.f3594e * a(d9);
                dSin = Math.cos(this.f3594e * b(d9));
                return dA3 * dSin;
        }
    }

    public double getValue(double d9) {
        double dAbs;
        switch (this.f3593d) {
            case 1:
                return Math.signum(0.5d - (b(d9) % 1.0d));
            case 2:
                dAbs = Math.abs((((b(d9) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((b(d9) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((b(d9) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f3594e * b(d9));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((b(d9) * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            default:
                return Math.sin(this.f3594e * b(d9));
        }
        return 1.0d - dAbs;
    }

    public void normalize() {
        double d9 = 0.0d;
        int i8 = 0;
        while (true) {
            if (i8 >= this.f3590a.length) {
                break;
            }
            d9 += r7[i8];
            i8++;
        }
        double d10 = 0.0d;
        int i9 = 1;
        while (true) {
            float[] fArr = this.f3590a;
            if (i9 >= fArr.length) {
                break;
            }
            int i10 = i9 - 1;
            float f8 = (fArr[i10] + fArr[i9]) / 2.0f;
            double[] dArr = this.f3591b;
            d10 += (dArr[i9] - dArr[i10]) * f8;
            i9++;
        }
        int i11 = 0;
        while (true) {
            float[] fArr2 = this.f3590a;
            if (i11 >= fArr2.length) {
                break;
            }
            fArr2[i11] = (float) (fArr2[i11] * (d9 / d10));
            i11++;
        }
        this.f3592c[0] = 0.0d;
        int i12 = 1;
        while (true) {
            float[] fArr3 = this.f3590a;
            if (i12 >= fArr3.length) {
                this.f3595f = true;
                return;
            }
            int i13 = i12 - 1;
            float f9 = (fArr3[i13] + fArr3[i12]) / 2.0f;
            double[] dArr2 = this.f3591b;
            double d11 = dArr2[i12] - dArr2[i13];
            double[] dArr3 = this.f3592c;
            dArr3[i12] = dArr3[i13] + (d11 * f9);
            i12++;
        }
    }

    public void setType(int i8) {
        this.f3593d = i8;
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f3591b) + " period=" + Arrays.toString(this.f3590a);
    }
}
