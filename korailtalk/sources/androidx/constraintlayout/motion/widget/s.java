package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
class s implements Comparable {
    public static final boolean DEBUG = false;
    public static final boolean OLD_WAY = false;
    public static final String TAG = "MotionPaths";

    /* renamed from: p, reason: collision with root package name */
    static String[] f8393p = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: a, reason: collision with root package name */
    P.c f8394a;

    /* renamed from: b, reason: collision with root package name */
    int f8395b;

    /* renamed from: c, reason: collision with root package name */
    float f8396c;

    /* renamed from: d, reason: collision with root package name */
    float f8397d;

    /* renamed from: e, reason: collision with root package name */
    float f8398e;

    /* renamed from: f, reason: collision with root package name */
    float f8399f;

    /* renamed from: g, reason: collision with root package name */
    float f8400g;

    /* renamed from: h, reason: collision with root package name */
    float f8401h;

    /* renamed from: i, reason: collision with root package name */
    float f8402i;

    /* renamed from: j, reason: collision with root package name */
    float f8403j;

    /* renamed from: k, reason: collision with root package name */
    int f8404k;

    /* renamed from: l, reason: collision with root package name */
    LinkedHashMap f8405l;

    /* renamed from: m, reason: collision with root package name */
    int f8406m;

    /* renamed from: n, reason: collision with root package name */
    double[] f8407n;

    /* renamed from: o, reason: collision with root package name */
    double[] f8408o;

    public s() {
        this.f8395b = 0;
        this.f8402i = Float.NaN;
        this.f8403j = Float.NaN;
        this.f8404k = d.UNSET;
        this.f8405l = new LinkedHashMap();
        this.f8406m = 0;
        this.f8407n = new double[18];
        this.f8408o = new double[18];
    }

    private boolean a(float f8, float f9) {
        return (Float.isNaN(f8) || Float.isNaN(f9)) ? Float.isNaN(f8) != Float.isNaN(f9) : Math.abs(f8 - f9) > 1.0E-6f;
    }

    public void applyParameters(d.a aVar) {
        this.f8394a = P.c.getInterpolator(aVar.motion.mTransitionEasing);
        d.c cVar = aVar.motion;
        this.f8404k = cVar.mPathMotionArc;
        this.f8402i = cVar.mPathRotate;
        this.f8395b = cVar.mDrawPath;
        this.f8403j = aVar.propertySet.mProgress;
        for (String str : aVar.mCustomConstraints.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.mCustomConstraints.get(str);
            if (aVar2.getType() != a.b.STRING_TYPE) {
                this.f8405l.put(str, aVar2);
            }
        }
    }

    void b(s sVar, boolean[] zArr, String[] strArr, boolean z8) {
        zArr[0] = zArr[0] | a(this.f8397d, sVar.f8397d);
        zArr[1] = zArr[1] | a(this.f8398e, sVar.f8398e) | z8;
        zArr[2] = z8 | a(this.f8399f, sVar.f8399f) | zArr[2];
        zArr[3] = zArr[3] | a(this.f8400g, sVar.f8400g);
        zArr[4] = a(this.f8401h, sVar.f8401h) | zArr[4];
    }

    void c(double[] dArr, int[] iArr) {
        float[] fArr = {this.f8397d, this.f8398e, this.f8399f, this.f8400g, this.f8401h, this.f8402i};
        int i8 = 0;
        for (int i9 : iArr) {
            if (i9 < 6) {
                dArr[i8] = fArr[r2];
                i8++;
            }
        }
    }

    void d(int[] iArr, double[] dArr, float[] fArr, int i8) {
        float f8 = this.f8398e;
        float f9 = this.f8399f;
        float f10 = this.f8400g;
        float f11 = this.f8401h;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f12 = (float) dArr[i9];
            int i10 = iArr[i9];
            if (i10 == 1) {
                f8 = f12;
            } else if (i10 == 2) {
                f9 = f12;
            } else if (i10 == 3) {
                f10 = f12;
            } else if (i10 == 4) {
                f11 = f12;
            }
        }
        fArr[i8] = f8 + (f10 / 2.0f) + 0.0f;
        fArr[i8 + 1] = f9 + (f11 / 2.0f) + 0.0f;
    }

    int e(String str, double[] dArr, int i8) {
        androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f8405l.get(str);
        if (aVar.noOfInterpValues() == 1) {
            dArr[i8] = aVar.getValueToInterpolate();
            return 1;
        }
        int iNoOfInterpValues = aVar.noOfInterpValues();
        aVar.getValuesToInterpolate(new float[iNoOfInterpValues]);
        int i9 = 0;
        while (i9 < iNoOfInterpValues) {
            dArr[i8] = r1[i9];
            i9++;
            i8++;
        }
        return iNoOfInterpValues;
    }

    int f(String str) {
        return ((androidx.constraintlayout.widget.a) this.f8405l.get(str)).noOfInterpValues();
    }

    void g(int[] iArr, double[] dArr, float[] fArr, int i8) {
        float f8 = this.f8398e;
        float f9 = this.f8399f;
        float f10 = this.f8400g;
        float f11 = this.f8401h;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f12 = (float) dArr[i9];
            int i10 = iArr[i9];
            if (i10 == 1) {
                f8 = f12;
            } else if (i10 == 2) {
                f9 = f12;
            } else if (i10 == 3) {
                f10 = f12;
            } else if (i10 == 4) {
                f11 = f12;
            }
        }
        float f13 = f10 + f8;
        float f14 = f11 + f9;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i8] = f8 + 0.0f;
        fArr[i8 + 1] = f9 + 0.0f;
        fArr[i8 + 2] = f13 + 0.0f;
        fArr[i8 + 3] = f9 + 0.0f;
        fArr[i8 + 4] = f13 + 0.0f;
        int i11 = i8 + 6;
        fArr[i8 + 5] = f14 + 0.0f;
        fArr[i11] = f8 + 0.0f;
        fArr[i8 + 7] = f14 + 0.0f;
    }

    boolean h(String str) {
        return this.f8405l.containsKey(str);
    }

    void i(j jVar, s sVar, s sVar2) {
        float f8 = jVar.f8098a / 100.0f;
        this.f8396c = f8;
        this.f8395b = jVar.f8170i;
        float f9 = Float.isNaN(jVar.f8171j) ? f8 : jVar.f8171j;
        float f10 = Float.isNaN(jVar.f8172k) ? f8 : jVar.f8172k;
        float f11 = sVar2.f8400g;
        float f12 = sVar.f8400g;
        float f13 = sVar2.f8401h;
        float f14 = sVar.f8401h;
        this.f8397d = this.f8396c;
        float f15 = sVar.f8398e;
        float f16 = sVar.f8399f;
        float f17 = (sVar2.f8398e + (f11 / 2.0f)) - ((f12 / 2.0f) + f15);
        float f18 = (sVar2.f8399f + (f13 / 2.0f)) - (f16 + (f14 / 2.0f));
        float f19 = ((f11 - f12) * f9) / 2.0f;
        this.f8398e = (int) ((f15 + (f17 * f8)) - f19);
        float f20 = ((f13 - f14) * f10) / 2.0f;
        this.f8399f = (int) ((f16 + (f18 * f8)) - f20);
        this.f8400g = (int) (f12 + r9);
        this.f8401h = (int) (f14 + r12);
        float f21 = Float.isNaN(jVar.f8173l) ? f8 : jVar.f8173l;
        float f22 = Float.isNaN(jVar.f8176o) ? 0.0f : jVar.f8176o;
        if (!Float.isNaN(jVar.f8174m)) {
            f8 = jVar.f8174m;
        }
        float f23 = Float.isNaN(jVar.f8175n) ? 0.0f : jVar.f8175n;
        this.f8406m = 2;
        this.f8398e = (int) (((sVar.f8398e + (f21 * f17)) + (f23 * f18)) - f19);
        this.f8399f = (int) (((sVar.f8399f + (f17 * f22)) + (f18 * f8)) - f20);
        this.f8394a = P.c.getInterpolator(jVar.f8168g);
        this.f8404k = jVar.f8169h;
    }

    void j(j jVar, s sVar, s sVar2) {
        float f8 = jVar.f8098a / 100.0f;
        this.f8396c = f8;
        this.f8395b = jVar.f8170i;
        float f9 = Float.isNaN(jVar.f8171j) ? f8 : jVar.f8171j;
        float f10 = Float.isNaN(jVar.f8172k) ? f8 : jVar.f8172k;
        float f11 = sVar2.f8400g - sVar.f8400g;
        float f12 = sVar2.f8401h - sVar.f8401h;
        this.f8397d = this.f8396c;
        if (!Float.isNaN(jVar.f8173l)) {
            f8 = jVar.f8173l;
        }
        float f13 = sVar.f8398e;
        float f14 = sVar.f8400g;
        float f15 = sVar.f8399f;
        float f16 = sVar.f8401h;
        float f17 = (sVar2.f8398e + (sVar2.f8400g / 2.0f)) - ((f14 / 2.0f) + f13);
        float f18 = (sVar2.f8399f + (sVar2.f8401h / 2.0f)) - ((f16 / 2.0f) + f15);
        float f19 = f17 * f8;
        float f20 = (f11 * f9) / 2.0f;
        this.f8398e = (int) ((f13 + f19) - f20);
        float f21 = f8 * f18;
        float f22 = (f12 * f10) / 2.0f;
        this.f8399f = (int) ((f15 + f21) - f22);
        this.f8400g = (int) (f14 + r7);
        this.f8401h = (int) (f16 + r8);
        float f23 = Float.isNaN(jVar.f8174m) ? 0.0f : jVar.f8174m;
        this.f8406m = 1;
        float f24 = (int) ((sVar.f8398e + f19) - f20);
        float f25 = (int) ((sVar.f8399f + f21) - f22);
        this.f8398e = f24 + ((-f18) * f23);
        this.f8399f = f25 + (f17 * f23);
        this.f8394a = P.c.getInterpolator(jVar.f8168g);
        this.f8404k = jVar.f8169h;
    }

    void k(int i8, int i9, j jVar, s sVar, s sVar2) {
        float f8 = jVar.f8098a / 100.0f;
        this.f8396c = f8;
        this.f8395b = jVar.f8170i;
        float f9 = Float.isNaN(jVar.f8171j) ? f8 : jVar.f8171j;
        float f10 = Float.isNaN(jVar.f8172k) ? f8 : jVar.f8172k;
        float f11 = sVar2.f8400g;
        float f12 = sVar.f8400g;
        float f13 = sVar2.f8401h;
        float f14 = sVar.f8401h;
        this.f8397d = this.f8396c;
        float f15 = sVar.f8398e;
        float f16 = sVar.f8399f;
        float f17 = sVar2.f8398e + (f11 / 2.0f);
        float f18 = sVar2.f8399f + (f13 / 2.0f);
        float f19 = (f11 - f12) * f9;
        this.f8398e = (int) ((f15 + ((f17 - ((f12 / 2.0f) + f15)) * f8)) - (f19 / 2.0f));
        float f20 = (f13 - f14) * f10;
        this.f8399f = (int) ((f16 + ((f18 - (f16 + (f14 / 2.0f))) * f8)) - (f20 / 2.0f));
        this.f8400g = (int) (f12 + f19);
        this.f8401h = (int) (f14 + f20);
        this.f8406m = 3;
        if (!Float.isNaN(jVar.f8173l)) {
            this.f8398e = (int) (jVar.f8173l * ((int) (i8 - this.f8400g)));
        }
        if (!Float.isNaN(jVar.f8174m)) {
            this.f8399f = (int) (jVar.f8174m * ((int) (i9 - this.f8401h)));
        }
        this.f8394a = P.c.getInterpolator(jVar.f8168g);
        this.f8404k = jVar.f8169h;
    }

    void l(float f8, float f9, float f10, float f11) {
        this.f8398e = f8;
        this.f8399f = f9;
        this.f8400g = f10;
        this.f8401h = f11;
    }

    void m(float f8, float f9, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f14 = (float) dArr[i8];
            double d9 = dArr2[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                f10 = f14;
            } else if (i9 == 2) {
                f12 = f14;
            } else if (i9 == 3) {
                f11 = f14;
            } else if (i9 == 4) {
                f13 = f14;
            }
        }
        float f15 = f10 - ((0.0f * f11) / 2.0f);
        float f16 = f12 - ((0.0f * f13) / 2.0f);
        fArr[0] = (f15 * (1.0f - f8)) + (((f11 * 1.0f) + f15) * f8) + 0.0f;
        fArr[1] = (f16 * (1.0f - f9)) + (((f13 * 1.0f) + f16) * f9) + 0.0f;
    }

    void n(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f8;
        boolean z8;
        float f9 = this.f8398e;
        float f10 = this.f8399f;
        float f11 = this.f8400g;
        float f12 = this.f8401h;
        boolean z9 = true;
        if (iArr.length != 0 && this.f8407n.length <= iArr[iArr.length - 1]) {
            int i8 = iArr[iArr.length - 1] + 1;
            this.f8407n = new double[i8];
            this.f8408o = new double[i8];
        }
        Arrays.fill(this.f8407n, Double.NaN);
        int i9 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            double[] dArr4 = this.f8407n;
            int i11 = iArr[i10];
            dArr4[i11] = dArr[i10];
            this.f8408o[i11] = dArr2[i10];
        }
        float f13 = Float.NaN;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (true) {
            double[] dArr5 = this.f8407n;
            if (i9 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i9]) && (dArr3 == null || dArr3[i9] == 0.0d)) {
                z8 = z9;
                f8 = f13;
            } else {
                double d9 = dArr3 != null ? dArr3[i9] : 0.0d;
                if (!Double.isNaN(this.f8407n[i9])) {
                    d9 = this.f8407n[i9] + d9;
                }
                f8 = f13;
                float f18 = (float) d9;
                float f19 = (float) this.f8408o[i9];
                z8 = true;
                if (i9 == 1) {
                    f13 = f8;
                    f9 = f18;
                    f14 = f19;
                } else if (i9 == 2) {
                    f13 = f8;
                    f10 = f18;
                    f16 = f19;
                } else if (i9 == 3) {
                    f13 = f8;
                    f11 = f18;
                    f15 = f19;
                } else if (i9 == 4) {
                    f13 = f8;
                    f12 = f18;
                    f17 = f19;
                } else if (i9 == 5) {
                    f13 = f18;
                }
                i9++;
                z9 = z8;
            }
            f13 = f8;
            i9++;
            z9 = z8;
        }
        float f20 = f13;
        if (!Float.isNaN(f20)) {
            view.setRotation((float) ((Float.isNaN(Float.NaN) ? 0.0f : Float.NaN) + f20 + Math.toDegrees(Math.atan2(f16 + (f17 / 2.0f), f14 + (f15 / 2.0f)))));
        } else if (!Float.isNaN(Float.NaN)) {
            view.setRotation(Float.NaN);
        }
        float f21 = f9 + 0.5f;
        int i12 = (int) f21;
        float f22 = f10 + 0.5f;
        int i13 = (int) f22;
        int i14 = (int) (f21 + f11);
        int i15 = (int) (f22 + f12);
        int i16 = i14 - i12;
        int i17 = i15 - i13;
        if (i16 != view.getMeasuredWidth() || i17 != view.getMeasuredHeight()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
        }
        view.layout(i12, i13, i14, i15);
    }

    @Override // java.lang.Comparable
    public int compareTo(s sVar) {
        return Float.compare(this.f8397d, sVar.f8397d);
    }

    public s(int i8, int i9, j jVar, s sVar, s sVar2) {
        this.f8395b = 0;
        this.f8402i = Float.NaN;
        this.f8403j = Float.NaN;
        this.f8404k = d.UNSET;
        this.f8405l = new LinkedHashMap();
        this.f8406m = 0;
        this.f8407n = new double[18];
        this.f8408o = new double[18];
        int i10 = jVar.f8177p;
        if (i10 == 1) {
            j(jVar, sVar, sVar2);
        } else if (i10 != 2) {
            i(jVar, sVar, sVar2);
        } else {
            k(i8, i9, jVar, sVar, sVar2);
        }
    }
}
