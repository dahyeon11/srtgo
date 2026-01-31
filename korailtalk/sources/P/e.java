package P;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class e extends b {

    /* renamed from: a, reason: collision with root package name */
    private double[] f3587a;

    /* renamed from: b, reason: collision with root package name */
    private double[][] f3588b;

    /* renamed from: c, reason: collision with root package name */
    private double[][] f3589c;

    public e(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        int i8 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i8, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i9 = 0; i9 < length2; i9++) {
            int i10 = 0;
            while (i10 < i8) {
                int i11 = i10 + 1;
                double d9 = dArr[i11] - dArr[i10];
                double[] dArr5 = dArr3[i10];
                double d10 = (dArr2[i11][i9] - dArr2[i10][i9]) / d9;
                dArr5[i9] = d10;
                if (i10 == 0) {
                    dArr4[i10][i9] = d10;
                } else {
                    dArr4[i10][i9] = (dArr3[i10 - 1][i9] + d10) * 0.5d;
                }
                i10 = i11;
            }
            dArr4[i8][i9] = dArr3[length - 2][i9];
        }
        for (int i12 = 0; i12 < i8; i12++) {
            for (int i13 = 0; i13 < length2; i13++) {
                double d11 = dArr3[i12][i13];
                if (d11 == 0.0d) {
                    dArr4[i12][i13] = 0.0d;
                    dArr4[i12 + 1][i13] = 0.0d;
                } else {
                    double d12 = dArr4[i12][i13] / d11;
                    int i14 = i12 + 1;
                    double d13 = dArr4[i14][i13] / d11;
                    double dHypot = Math.hypot(d12, d13);
                    if (dHypot > 9.0d) {
                        double d14 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i12];
                        double[] dArr7 = dArr3[i12];
                        dArr6[i13] = d12 * d14 * dArr7[i13];
                        dArr4[i14][i13] = d14 * d13 * dArr7[i13];
                    }
                }
            }
        }
        this.f3587a = dArr;
        this.f3588b = dArr2;
        this.f3589c = dArr4;
    }

    private static double a(double d9, double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 * d10;
        double d16 = d10 * 6.0d;
        double d17 = 3.0d * d9;
        return ((((((((((-6.0d) * d15) * d12) + (d16 * d12)) + ((6.0d * d15) * d11)) - (d16 * d11)) + ((d17 * d14) * d15)) + ((d17 * d13) * d15)) - (((2.0d * d9) * d14) * d10)) - (((4.0d * d9) * d13) * d10)) + (d9 * d13);
    }

    private static double b(double d9, double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 * d10;
        double d16 = d15 * d10;
        double d17 = 3.0d * d15;
        double d18 = ((((((-2.0d) * d16) * d12) + (d17 * d12)) + ((d16 * 2.0d) * d11)) - (d17 * d11)) + d11;
        double d19 = d9 * d14;
        double d20 = d9 * d13;
        return ((((d18 + (d19 * d16)) + (d16 * d20)) - (d19 * d15)) - (((d9 * 2.0d) * d13) * d15)) + (d20 * d10);
    }

    @Override // P.b
    public void getPos(double d9, double[] dArr) {
        double[] dArr2 = this.f3587a;
        int length = dArr2.length;
        int i8 = 0;
        int length2 = this.f3588b[0].length;
        if (d9 <= dArr2[0]) {
            for (int i9 = 0; i9 < length2; i9++) {
                dArr[i9] = this.f3588b[0][i9];
            }
            return;
        }
        int i10 = length - 1;
        if (d9 >= dArr2[i10]) {
            while (i8 < length2) {
                dArr[i8] = this.f3588b[i10][i8];
                i8++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < i10) {
            if (d9 == this.f3587a[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f3588b[i11][i12];
                }
            }
            double[] dArr3 = this.f3587a;
            int i13 = i11 + 1;
            double d10 = dArr3[i13];
            if (d9 < d10) {
                double d11 = dArr3[i11];
                double d12 = d10 - d11;
                double d13 = (d9 - d11) / d12;
                while (i8 < length2) {
                    double[][] dArr4 = this.f3588b;
                    double d14 = dArr4[i11][i8];
                    double d15 = dArr4[i13][i8];
                    double[][] dArr5 = this.f3589c;
                    dArr[i8] = b(d12, d13, d14, d15, dArr5[i11][i8], dArr5[i13][i8]);
                    i8++;
                }
                return;
            }
            i11 = i13;
        }
    }

    @Override // P.b
    public void getSlope(double d9, double[] dArr) {
        double[] dArr2 = this.f3587a;
        int length = dArr2.length;
        int length2 = this.f3588b[0].length;
        double d10 = dArr2[0];
        if (d9 > d10) {
            d10 = dArr2[length - 1];
            if (d9 < d10) {
                d10 = d9;
            }
        }
        int i8 = 0;
        while (i8 < length - 1) {
            double[] dArr3 = this.f3587a;
            int i9 = i8 + 1;
            double d11 = dArr3[i9];
            if (d10 <= d11) {
                double d12 = dArr3[i8];
                double d13 = d11 - d12;
                double d14 = (d10 - d12) / d13;
                for (int i10 = 0; i10 < length2; i10++) {
                    double[][] dArr4 = this.f3588b;
                    double d15 = dArr4[i8][i10];
                    double d16 = dArr4[i9][i10];
                    double[][] dArr5 = this.f3589c;
                    dArr[i10] = a(d13, d14, d15, d16, dArr5[i8][i10], dArr5[i9][i10]) / d13;
                }
                return;
            }
            i8 = i9;
        }
    }

    @Override // P.b
    public double[] getTimePoints() {
        return this.f3587a;
    }

    @Override // P.b
    public double getSlope(double d9, int i8) {
        double[] dArr = this.f3587a;
        int length = dArr.length;
        int i9 = 0;
        double d10 = dArr[0];
        if (d9 >= d10) {
            d10 = dArr[length - 1];
            if (d9 < d10) {
                d10 = d9;
            }
        }
        while (i9 < length - 1) {
            double[] dArr2 = this.f3587a;
            int i10 = i9 + 1;
            double d11 = dArr2[i10];
            if (d10 <= d11) {
                double d12 = dArr2[i9];
                double d13 = d11 - d12;
                double[][] dArr3 = this.f3588b;
                double d14 = dArr3[i9][i8];
                double d15 = dArr3[i10][i8];
                double[][] dArr4 = this.f3589c;
                return a(d13, (d10 - d12) / d13, d14, d15, dArr4[i9][i8], dArr4[i10][i8]) / d13;
            }
            i9 = i10;
        }
        return 0.0d;
    }

    @Override // P.b
    public void getPos(double d9, float[] fArr) {
        double[] dArr = this.f3587a;
        int length = dArr.length;
        int i8 = 0;
        int length2 = this.f3588b[0].length;
        if (d9 <= dArr[0]) {
            for (int i9 = 0; i9 < length2; i9++) {
                fArr[i9] = (float) this.f3588b[0][i9];
            }
            return;
        }
        int i10 = length - 1;
        if (d9 >= dArr[i10]) {
            while (i8 < length2) {
                fArr[i8] = (float) this.f3588b[i10][i8];
                i8++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < i10) {
            if (d9 == this.f3587a[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) this.f3588b[i11][i12];
                }
            }
            double[] dArr2 = this.f3587a;
            int i13 = i11 + 1;
            double d10 = dArr2[i13];
            if (d9 < d10) {
                double d11 = dArr2[i11];
                double d12 = d10 - d11;
                double d13 = (d9 - d11) / d12;
                while (i8 < length2) {
                    double[][] dArr3 = this.f3588b;
                    double d14 = dArr3[i11][i8];
                    double d15 = dArr3[i13][i8];
                    double[][] dArr4 = this.f3589c;
                    fArr[i8] = (float) b(d12, d13, d14, d15, dArr4[i11][i8], dArr4[i13][i8]);
                    i8++;
                }
                return;
            }
            i11 = i13;
        }
    }

    @Override // P.b
    public double getPos(double d9, int i8) {
        double[] dArr = this.f3587a;
        int length = dArr.length;
        int i9 = 0;
        if (d9 <= dArr[0]) {
            return this.f3588b[0][i8];
        }
        int i10 = length - 1;
        if (d9 >= dArr[i10]) {
            return this.f3588b[i10][i8];
        }
        while (i9 < i10) {
            double[] dArr2 = this.f3587a;
            double d10 = dArr2[i9];
            if (d9 == d10) {
                return this.f3588b[i9][i8];
            }
            int i11 = i9 + 1;
            double d11 = dArr2[i11];
            if (d9 < d11) {
                double d12 = d11 - d10;
                double d13 = (d9 - d10) / d12;
                double[][] dArr3 = this.f3588b;
                double d14 = dArr3[i9][i8];
                double d15 = dArr3[i11][i8];
                double[][] dArr4 = this.f3589c;
                return b(d12, d13, d14, d15, dArr4[i9][i8], dArr4[i11][i8]);
            }
            i9 = i11;
        }
        return 0.0d;
    }
}
