package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: k, reason: collision with root package name */
    private static float f8461k = 6.2831855f;

    /* renamed from: a, reason: collision with root package name */
    protected P.b f8462a;

    /* renamed from: e, reason: collision with root package name */
    private int f8466e;

    /* renamed from: f, reason: collision with root package name */
    private String f8467f;

    /* renamed from: i, reason: collision with root package name */
    long f8470i;

    /* renamed from: b, reason: collision with root package name */
    protected int f8463b = 0;

    /* renamed from: c, reason: collision with root package name */
    protected int[] f8464c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    protected float[][] f8465d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g, reason: collision with root package name */
    private float[] f8468g = new float[3];

    /* renamed from: h, reason: collision with root package name */
    protected boolean f8469h = false;

    /* renamed from: j, reason: collision with root package name */
    float f8471j = Float.NaN;

    static class a extends w {
        a() {
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            view.setAlpha(get(f8, j8, view, fVar));
            return this.f8469h;
        }
    }

    static class b extends w {

        /* renamed from: l, reason: collision with root package name */
        String f8472l;

        /* renamed from: m, reason: collision with root package name */
        SparseArray f8473m;

        /* renamed from: n, reason: collision with root package name */
        SparseArray f8474n = new SparseArray();

        /* renamed from: o, reason: collision with root package name */
        float[] f8475o;

        /* renamed from: p, reason: collision with root package name */
        float[] f8476p;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f8472l = str.split(",")[1];
            this.f8473m = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public void setPoint(int i8, float f8, float f9, int i9, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            this.f8462a.getPos(f8, this.f8475o);
            float[] fArr = this.f8475o;
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            long j9 = j8 - this.f8470i;
            if (Float.isNaN(this.f8471j)) {
                float fA = fVar.a(view, this.f8472l, 0);
                this.f8471j = fA;
                if (Float.isNaN(fA)) {
                    this.f8471j = 0.0f;
                }
            }
            float f11 = (float) ((this.f8471j + ((j9 * 1.0E-9d) * f9)) % 1.0d);
            this.f8471j = f11;
            this.f8470i = j8;
            float fA2 = a(f11);
            this.f8469h = false;
            int i8 = 0;
            while (true) {
                float[] fArr2 = this.f8476p;
                if (i8 >= fArr2.length) {
                    break;
                }
                boolean z8 = this.f8469h;
                float f12 = this.f8475o[i8];
                this.f8469h = z8 | (((double) f12) != 0.0d);
                fArr2[i8] = (f12 * fA2) + f10;
                i8++;
            }
            ((androidx.constraintlayout.widget.a) this.f8473m.valueAt(0)).setInterpolatedValue(view, this.f8476p);
            if (f9 != 0.0f) {
                this.f8469h = true;
            }
            return this.f8469h;
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public void setup(int i8) {
            int size = this.f8473m.size();
            int iNoOfInterpValues = ((androidx.constraintlayout.widget.a) this.f8473m.valueAt(0)).noOfInterpValues();
            double[] dArr = new double[size];
            int i9 = iNoOfInterpValues + 2;
            this.f8475o = new float[i9];
            this.f8476p = new float[iNoOfInterpValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i9);
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = this.f8473m.keyAt(i10);
                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f8473m.valueAt(i10);
                float[] fArr = (float[]) this.f8474n.valueAt(i10);
                dArr[i10] = iKeyAt * 0.01d;
                aVar.getValuesToInterpolate(this.f8475o);
                int i11 = 0;
                while (true) {
                    if (i11 < this.f8475o.length) {
                        dArr2[i10][i11] = r8[i11];
                        i11++;
                    }
                }
                double[] dArr3 = dArr2[i10];
                dArr3[iNoOfInterpValues] = fArr[0];
                dArr3[iNoOfInterpValues + 1] = fArr[1];
            }
            this.f8462a = P.b.get(i8, dArr, dArr2);
        }

        public void setPoint(int i8, androidx.constraintlayout.widget.a aVar, float f8, int i9, float f9) {
            this.f8473m.append(i8, aVar);
            this.f8474n.append(i8, new float[]{f8, f9});
            this.f8463b = Math.max(this.f8463b, i9);
        }
    }

    static class c extends w {
        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            view.setElevation(get(f8, j8, view, fVar));
            return this.f8469h;
        }
    }

    static class d extends w {
        d() {
        }

        public boolean setPathRotate(View view, androidx.constraintlayout.motion.widget.f fVar, float f8, long j8, double d9, double d10) {
            view.setRotation(get(f8, j8, view, fVar) + ((float) Math.toDegrees(Math.atan2(d10, d9))));
            return this.f8469h;
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            return this.f8469h;
        }
    }

    static class e extends w {

        /* renamed from: l, reason: collision with root package name */
        boolean f8477l = false;

        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof r) {
                ((r) view).setProgress(get(f8, j8, view, fVar));
            } else {
                if (this.f8477l) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f8477l = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(get(f8, j8, view, fVar)));
                    } catch (IllegalAccessException e8) {
                        Log.e("SplineSet", "unable to setProgress", e8);
                    } catch (InvocationTargetException e9) {
                        Log.e("SplineSet", "unable to setProgress", e9);
                    }
                }
            }
            return this.f8469h;
        }
    }

    static class f extends w {
        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            view.setRotation(get(f8, j8, view, fVar));
            return this.f8469h;
        }
    }

    static class g extends w {
        g() {
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            view.setRotationX(get(f8, j8, view, fVar));
            return this.f8469h;
        }
    }

    static class h extends w {
        h() {
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            view.setRotationY(get(f8, j8, view, fVar));
            return this.f8469h;
        }
    }

    static class i extends w {
        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            view.setScaleX(get(f8, j8, view, fVar));
            return this.f8469h;
        }
    }

    static class j extends w {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            view.setScaleY(get(f8, j8, view, fVar));
            return this.f8469h;
        }
    }

    private static class k {
        static void a(int[] iArr, float[][] fArr, int i8, int i9) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i9;
            iArr2[1] = i8;
            int i10 = 2;
            while (i10 > 0) {
                int i11 = iArr2[i10 - 1];
                int i12 = i10 - 2;
                int i13 = iArr2[i12];
                if (i11 < i13) {
                    int iB = b(iArr, fArr, i11, i13);
                    iArr2[i12] = iB - 1;
                    iArr2[i10 - 1] = i11;
                    int i14 = i10 + 1;
                    iArr2[i10] = i13;
                    i10 += 2;
                    iArr2[i14] = iB + 1;
                } else {
                    i10 = i12;
                }
            }
        }

        private static int b(int[] iArr, float[][] fArr, int i8, int i9) {
            int i10 = iArr[i9];
            int i11 = i8;
            while (i8 < i9) {
                if (iArr[i8] <= i10) {
                    c(iArr, fArr, i11, i8);
                    i11++;
                }
                i8++;
            }
            c(iArr, fArr, i11, i9);
            return i11;
        }

        private static void c(int[] iArr, float[][] fArr, int i8, int i9) {
            int i10 = iArr[i8];
            iArr[i8] = iArr[i9];
            iArr[i9] = i10;
            float[] fArr2 = fArr[i8];
            fArr[i8] = fArr[i9];
            fArr[i9] = fArr2;
        }
    }

    static class l extends w {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            view.setTranslationX(get(f8, j8, view, fVar));
            return this.f8469h;
        }
    }

    static class m extends w {
        m() {
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            view.setTranslationY(get(f8, j8, view, fVar));
            return this.f8469h;
        }
    }

    static class n extends w {
        n() {
        }

        @Override // androidx.constraintlayout.motion.widget.w
        public boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar) {
            view.setTranslationZ(get(f8, j8, view, fVar));
            return this.f8469h;
        }
    }

    static w b(String str, SparseArray sparseArray) {
        return new b(str, sparseArray);
    }

    static w c(String str, long j8) {
        w gVar;
        str.hashCode();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new l();
                break;
            case "translationY":
                gVar = new m();
                break;
            case "translationZ":
                gVar = new n();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.d(j8);
        return gVar;
    }

    protected float a(float f8) {
        float fAbs;
        switch (this.f8463b) {
            case 1:
                return Math.signum(f8 * f8461k);
            case 2:
                fAbs = Math.abs(f8);
                break;
            case 3:
                return (((f8 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f8 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f8 * f8461k);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f8 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f8 * f8461k);
        }
        return 1.0f - fAbs;
    }

    protected void d(long j8) {
        this.f8470i = j8;
    }

    public float get(float f8, long j8, View view, androidx.constraintlayout.motion.widget.f fVar) {
        this.f8462a.getPos(f8, this.f8468g);
        float[] fArr = this.f8468g;
        float f9 = fArr[1];
        if (f9 == 0.0f) {
            this.f8469h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f8471j)) {
            float fA = fVar.a(view, this.f8467f, 0);
            this.f8471j = fA;
            if (Float.isNaN(fA)) {
                this.f8471j = 0.0f;
            }
        }
        float f10 = (float) ((this.f8471j + (((j8 - this.f8470i) * 1.0E-9d) * f9)) % 1.0d);
        this.f8471j = f10;
        fVar.b(view, this.f8467f, 0, f10);
        this.f8470i = j8;
        float f11 = this.f8468g[0];
        float fA2 = (a(this.f8471j) * f11) + this.f8468g[2];
        this.f8469h = (f11 == 0.0f && f9 == 0.0f) ? false : true;
        return fA2;
    }

    public P.b getCurveFit() {
        return this.f8462a;
    }

    public void setPoint(int i8, float f8, float f9, int i9, float f10) {
        int[] iArr = this.f8464c;
        int i10 = this.f8466e;
        iArr[i10] = i8;
        float[] fArr = this.f8465d[i10];
        fArr[0] = f8;
        fArr[1] = f9;
        fArr[2] = f10;
        this.f8463b = Math.max(this.f8463b, i9);
        this.f8466e++;
    }

    public abstract boolean setProperty(View view, float f8, long j8, androidx.constraintlayout.motion.widget.f fVar);

    public void setType(String str) {
        this.f8467f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setup(int r12) {
        /*
            r11 = this;
            int r0 = r11.f8466e
            if (r0 != 0) goto L1d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Error no points added to "
            r12.append(r0)
            java.lang.String r0 = r11.f8467f
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "SplineSet"
            android.util.Log.e(r0, r12)
            return
        L1d:
            int[] r1 = r11.f8464c
            float[][] r2 = r11.f8465d
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.motion.widget.w.k.a(r1, r2, r4, r0)
            r0 = r3
            r1 = r4
        L29:
            int[] r2 = r11.f8464c
            int r5 = r2.length
            if (r0 >= r5) goto L3b
            r5 = r2[r0]
            int r6 = r0 + (-1)
            r2 = r2[r6]
            if (r5 == r2) goto L38
            int r1 = r1 + 1
        L38:
            int r0 = r0 + 1
            goto L29
        L3b:
            if (r1 != 0) goto L3e
            r1 = r3
        L3e:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r5 = new int[r2]
            r6 = 3
            r5[r3] = r6
            r5[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            r5 = r4
            r6 = r5
        L52:
            int r7 = r11.f8466e
            if (r5 >= r7) goto L8a
            if (r5 <= 0) goto L63
            int[] r7 = r11.f8464c
            r8 = r7[r5]
            int r9 = r5 + (-1)
            r7 = r7[r9]
            if (r8 != r7) goto L63
            goto L87
        L63:
            int[] r7 = r11.f8464c
            r7 = r7[r5]
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r0[r6] = r7
            r7 = r1[r6]
            float[][] r8 = r11.f8465d
            r8 = r8[r5]
            r9 = r8[r4]
            double r9 = (double) r9
            r7[r4] = r9
            r9 = r8[r3]
            double r9 = (double) r9
            r7[r3] = r9
            r8 = r8[r2]
            double r8 = (double) r8
            r7[r2] = r8
            int r6 = r6 + 1
        L87:
            int r5 = r5 + 1
            goto L52
        L8a:
            P.b r12 = P.b.get(r12, r0, r1)
            r11.f8462a = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.w.setup(int):void");
    }

    public String toString() {
        String str = this.f8467f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i8 = 0; i8 < this.f8466e; i8++) {
            str = str + "[" + this.f8464c[i8] + " , " + decimalFormat.format(this.f8465d[i8]) + "] ";
        }
        return str;
    }
}
