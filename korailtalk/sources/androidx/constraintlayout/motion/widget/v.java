package androidx.constraintlayout.motion.widget;

import Q7.C0712p;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    protected P.b f8452a;

    /* renamed from: b, reason: collision with root package name */
    protected int[] f8453b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    protected float[] f8454c = new float[10];

    /* renamed from: d, reason: collision with root package name */
    private int f8455d;

    /* renamed from: e, reason: collision with root package name */
    private String f8456e;

    static class a extends v {
        a() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setAlpha(get(f8));
        }
    }

    static class b extends v {

        /* renamed from: f, reason: collision with root package name */
        String f8457f;

        /* renamed from: g, reason: collision with root package name */
        SparseArray f8458g;

        /* renamed from: h, reason: collision with root package name */
        float[] f8459h;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f8457f = str.split(",")[1];
            this.f8458g = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setPoint(int i8, float f8) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            this.f8452a.getPos(f8, this.f8459h);
            ((androidx.constraintlayout.widget.a) this.f8458g.valueAt(0)).setInterpolatedValue(view, this.f8459h);
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setup(int i8) {
            int size = this.f8458g.size();
            int iNoOfInterpValues = ((androidx.constraintlayout.widget.a) this.f8458g.valueAt(0)).noOfInterpValues();
            double[] dArr = new double[size];
            this.f8459h = new float[iNoOfInterpValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNoOfInterpValues);
            for (int i9 = 0; i9 < size; i9++) {
                int iKeyAt = this.f8458g.keyAt(i9);
                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f8458g.valueAt(i9);
                dArr[i9] = iKeyAt * 0.01d;
                aVar.getValuesToInterpolate(this.f8459h);
                int i10 = 0;
                while (true) {
                    if (i10 < this.f8459h.length) {
                        dArr2[i9][i10] = r6[i10];
                        i10++;
                    }
                }
            }
            this.f8452a = P.b.get(i8, dArr, dArr2);
        }

        public void setPoint(int i8, androidx.constraintlayout.widget.a aVar) {
            this.f8458g.append(i8, aVar);
        }
    }

    static class c extends v {
        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setElevation(get(f8));
        }
    }

    static class d extends v {
        d() {
        }

        public void setPathRotate(View view, float f8, double d9, double d10) {
            view.setRotation(get(f8) + ((float) Math.toDegrees(Math.atan2(d10, d9))));
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
        }
    }

    static class e extends v {
        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setPivotX(get(f8));
        }
    }

    static class f extends v {
        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setPivotY(get(f8));
        }
    }

    static class g extends v {

        /* renamed from: f, reason: collision with root package name */
        boolean f8460f = false;

        g() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof r) {
                ((r) view).setProgress(get(f8));
                return;
            }
            if (this.f8460f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f8460f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(f8)));
                } catch (IllegalAccessException e8) {
                    Log.e("SplineSet", "unable to setProgress", e8);
                } catch (InvocationTargetException e9) {
                    Log.e("SplineSet", "unable to setProgress", e9);
                }
            }
        }
    }

    static class h extends v {
        h() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setRotation(get(f8));
        }
    }

    static class i extends v {
        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setRotationX(get(f8));
        }
    }

    static class j extends v {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setRotationY(get(f8));
        }
    }

    static class k extends v {
        k() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setScaleX(get(f8));
        }
    }

    static class l extends v {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setScaleY(get(f8));
        }
    }

    private static class m {
        static void a(int[] iArr, float[] fArr, int i8, int i9) {
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

        private static int b(int[] iArr, float[] fArr, int i8, int i9) {
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

        private static void c(int[] iArr, float[] fArr, int i8, int i9) {
            int i10 = iArr[i8];
            iArr[i8] = iArr[i9];
            iArr[i9] = i10;
            float f8 = fArr[i8];
            fArr[i8] = fArr[i9];
            fArr[i9] = f8;
        }
    }

    static class n extends v {
        n() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setTranslationX(get(f8));
        }
    }

    static class o extends v {
        o() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setTranslationY(get(f8));
        }
    }

    static class p extends v {
        p() {
        }

        @Override // androidx.constraintlayout.motion.widget.v
        public void setProperty(View view, float f8) {
            view.setTranslationZ(get(f8));
        }
    }

    static v a(String str, SparseArray sparseArray) {
        return new b(str, sparseArray);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static v b(String str) {
        str.hashCode();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c9 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c9 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c9 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals(androidx.core.app.r.CATEGORY_PROGRESS)) {
                    c9 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c9 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c9 = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c9 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c9 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c9 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c9 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c9 = C0712p.CR;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c9 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c9 = 15;
                    break;
                }
                break;
        }
        switch (c9) {
        }
        return new a();
    }

    public float get(float f8) {
        return (float) this.f8452a.getPos(f8, 0);
    }

    public P.b getCurveFit() {
        return this.f8452a;
    }

    public float getSlope(float f8) {
        return (float) this.f8452a.getSlope(f8, 0);
    }

    public void setPoint(int i8, float f8) {
        int[] iArr = this.f8453b;
        if (iArr.length < this.f8455d + 1) {
            this.f8453b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f8454c;
            this.f8454c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f8453b;
        int i9 = this.f8455d;
        iArr2[i9] = i8;
        this.f8454c[i9] = f8;
        this.f8455d = i9 + 1;
    }

    public abstract void setProperty(View view, float f8);

    public void setType(String str) {
        this.f8456e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setup(int r10) {
        /*
            r9 = this;
            int r0 = r9.f8455d
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r9.f8453b
            float[] r2 = r9.f8454c
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.motion.widget.v.m.a(r1, r2, r4, r0)
            r0 = r3
            r1 = r0
        L11:
            int r2 = r9.f8455d
            if (r0 >= r2) goto L24
            int[] r2 = r9.f8453b
            int r5 = r0 + (-1)
            r5 = r2[r5]
            r2 = r2[r0]
            if (r5 == r2) goto L21
            int r1 = r1 + 1
        L21:
            int r0 = r0 + 1
            goto L11
        L24:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r2 = new int[r2]
            r2[r3] = r3
            r2[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            double[][] r1 = (double[][]) r1
            r2 = r4
            r3 = r2
        L37:
            int r5 = r9.f8455d
            if (r2 >= r5) goto L63
            if (r2 <= 0) goto L48
            int[] r5 = r9.f8453b
            r6 = r5[r2]
            int r7 = r2 + (-1)
            r5 = r5[r7]
            if (r6 != r5) goto L48
            goto L60
        L48:
            int[] r5 = r9.f8453b
            r5 = r5[r2]
            double r5 = (double) r5
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r5 = r5 * r7
            r0[r3] = r5
            r5 = r1[r3]
            float[] r6 = r9.f8454c
            r6 = r6[r2]
            double r6 = (double) r6
            r5[r4] = r6
            int r3 = r3 + 1
        L60:
            int r2 = r2 + 1
            goto L37
        L63:
            P.b r10 = P.b.get(r10, r0, r1)
            r9.f8452a = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.v.setup(int):void");
    }

    public String toString() {
        String str = this.f8456e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i8 = 0; i8 < this.f8455d; i8++) {
            str = str + "[" + this.f8453b[i8] + " , " + decimalFormat.format(this.f8454c[i8]) + "] ";
        }
        return str;
    }
}
