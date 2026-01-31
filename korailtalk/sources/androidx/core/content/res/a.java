package androidx.core.content.res;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f8924a;

    /* renamed from: b, reason: collision with root package name */
    private final float f8925b;

    /* renamed from: c, reason: collision with root package name */
    private final float f8926c;

    /* renamed from: d, reason: collision with root package name */
    private final float f8927d;

    /* renamed from: e, reason: collision with root package name */
    private final float f8928e;

    /* renamed from: f, reason: collision with root package name */
    private final float f8929f;

    /* renamed from: g, reason: collision with root package name */
    private final float f8930g;

    /* renamed from: h, reason: collision with root package name */
    private final float f8931h;

    /* renamed from: i, reason: collision with root package name */
    private final float f8932i;

    a(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f8924a = f8;
        this.f8925b = f9;
        this.f8926c = f10;
        this.f8927d = f11;
        this.f8928e = f12;
        this.f8929f = f13;
        this.f8930g = f14;
        this.f8931h = f15;
        this.f8932i = f16;
    }

    private static a b(float f8, float f9, float f10) {
        float f11 = 100.0f;
        float f12 = 1000.0f;
        float f13 = 0.0f;
        a aVar = null;
        float f14 = 1000.0f;
        while (Math.abs(f13 - f11) > 0.01f) {
            float f15 = ((f11 - f13) / 2.0f) + f13;
            int iO = e(f15, f9, f8).o();
            float fB = b.b(iO);
            float fAbs = Math.abs(f10 - fB);
            if (fAbs < 0.2f) {
                a aVarC = c(iO);
                float fA = aVarC.a(e(aVarC.k(), aVarC.i(), f8));
                if (fA <= 1.0f) {
                    aVar = aVarC;
                    f12 = fAbs;
                    f14 = fA;
                }
            }
            if (f12 == 0.0f && f14 == 0.0f) {
                break;
            }
            if (fB < f10) {
                f13 = f15;
            } else {
                f11 = f15;
            }
        }
        return aVar;
    }

    static a c(int i8) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i8, l.f8969k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i8, l lVar, float[] fArr, float[] fArr2) {
        b.f(i8, fArr2);
        float[][] fArr3 = b.f8933a;
        float f8 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f9 = fArr4[0] * f8;
        float f10 = fArr2[1];
        float f11 = f9 + (fArr4[1] * f10);
        float f12 = fArr2[2];
        float f13 = f11 + (fArr4[2] * f12);
        float[] fArr5 = fArr3[1];
        float f14 = (fArr5[0] * f8) + (fArr5[1] * f10) + (fArr5[2] * f12);
        float[] fArr6 = fArr3[2];
        float f15 = (f8 * fArr6[0]) + (f10 * fArr6[1]) + (f12 * fArr6[2]);
        float f16 = lVar.i()[0] * f13;
        float f17 = lVar.i()[1] * f14;
        float f18 = lVar.i()[2] * f15;
        float fPow = (float) Math.pow((lVar.c() * Math.abs(f16)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((lVar.c() * Math.abs(f17)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((lVar.c() * Math.abs(f18)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f16) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f17) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f18) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d9 = fSignum3;
        float f19 = ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d9)) / 11.0f;
        float f20 = ((float) ((fSignum + fSignum2) - (d9 * 2.0d))) / 9.0f;
        float f21 = fSignum2 * 20.0f;
        float f22 = (((fSignum * 20.0f) + f21) + (21.0f * fSignum3)) / 20.0f;
        float f23 = (((fSignum * 40.0f) + f21) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f24 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f23 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        float fB = (4.0f / lVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (lVar.a() + 4.0f) * lVar.d();
        float fSqrt = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((f19 * f19) + (f20 * f20)))) / (f22 + 0.305f), 0.9d));
        float fD = lVar.d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r7 * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f25 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD) + 1.0f)) * 43.85965f;
        double d10 = f24;
        float fCos = ((float) Math.cos(d10)) * fLog;
        float fSin = fLog * ((float) Math.sin(d10));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fB;
            fArr[2] = fD;
            fArr[3] = fSqrt2;
            fArr[4] = f25;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static a e(float f8, float f9, float f10) {
        return f(f8, f9, f10, l.f8969k);
    }

    private static a f(float f8, float f9, float f10, l lVar) {
        float fB = (4.0f / lVar.b()) * ((float) Math.sqrt(f8 / 100.0d)) * (lVar.a() + 4.0f) * lVar.d();
        float fD = f9 * lVar.d();
        float fSqrt = ((float) Math.sqrt(((f9 / ((float) Math.sqrt(r4))) * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f11 = (1.7f * f8) / ((0.007f * f8) + 1.0f);
        float fLog = ((float) Math.log((fD * 0.0228d) + 1.0d)) * 43.85965f;
        double d9 = (3.1415927f * f10) / 180.0f;
        return new a(f10, f9, f8, fB, fD, fSqrt, f11, fLog * ((float) Math.cos(d9)), fLog * ((float) Math.sin(d9)));
    }

    public static void getM3HCTfromColor(int i8, float[] fArr) {
        d(i8, l.f8969k, null, fArr);
        fArr[2] = b.b(i8);
    }

    static int m(float f8, float f9, float f10, l lVar) {
        if (f9 < 1.0d || Math.round(f10) <= 0.0d || Math.round(f10) >= 100.0d) {
            return b.a(f10);
        }
        float fMin = f8 < 0.0f ? 0.0f : Math.min(360.0f, f8);
        a aVar = null;
        boolean z8 = true;
        float f11 = 0.0f;
        float f12 = f9;
        while (Math.abs(f11 - f9) >= 0.4f) {
            a aVarB = b(fMin, f12, f10);
            if (!z8) {
                if (aVarB == null) {
                    f9 = f12;
                } else {
                    f11 = f12;
                    aVar = aVarB;
                }
                f12 = ((f9 - f11) / 2.0f) + f11;
            } else {
                if (aVarB != null) {
                    return aVarB.n(lVar);
                }
                f12 = ((f9 - f11) / 2.0f) + f11;
                z8 = false;
            }
        }
        return aVar == null ? b.a(f10) : aVar.n(lVar);
    }

    public static int toColor(float f8, float f9, float f10) {
        return m(f8, f9, f10, l.f8969k);
    }

    float a(a aVar) {
        float fL = l() - aVar.l();
        float fG = g() - aVar.g();
        float fH = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f8931h;
    }

    float h() {
        return this.f8932i;
    }

    float i() {
        return this.f8925b;
    }

    float j() {
        return this.f8924a;
    }

    float k() {
        return this.f8926c;
    }

    float l() {
        return this.f8930g;
    }

    int n(l lVar) {
        float fPow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = lVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / lVar.b()) / lVar.j()));
        float fG = fCos * 3846.1538f * lVar.g() * lVar.h();
        float f8 = fA / lVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f9 = (((0.305f + f8) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f10 = fCos2 * f9;
        float f11 = f9 * fSin;
        float f12 = f8 * 460.0f;
        float f13 = (((451.0f * f10) + f12) + (288.0f * f11)) / 1403.0f;
        float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
        float fSignum = Math.signum(f13) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
        float fSignum2 = Math.signum(f14) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f15 = fSignum / lVar.i()[0];
        float f16 = fSignum2 / lVar.i()[1];
        float f17 = fSignum3 / lVar.i()[2];
        float[][] fArr = b.f8934b;
        float[] fArr2 = fArr[0];
        float f18 = (fArr2[0] * f15) + (fArr2[1] * f16) + (fArr2[2] * f17);
        float[] fArr3 = fArr[1];
        float f19 = (fArr3[0] * f15) + (fArr3[1] * f16) + (fArr3[2] * f17);
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.XYZToColor(f18, f19, (f15 * fArr4[0]) + (f16 * fArr4[1]) + (f17 * fArr4[2]));
    }

    int o() {
        return n(l.f8969k);
    }
}
