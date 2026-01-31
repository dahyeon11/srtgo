package androidx.constraintlayout.motion.widget;

import Q7.C0712p;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private P.b f8141a;

    /* renamed from: b, reason: collision with root package name */
    private d f8142b;

    /* renamed from: c, reason: collision with root package name */
    protected androidx.constraintlayout.widget.a f8143c;

    /* renamed from: d, reason: collision with root package name */
    private String f8144d;

    /* renamed from: e, reason: collision with root package name */
    private int f8145e = 0;
    public int mVariesBy = 0;

    /* renamed from: f, reason: collision with root package name */
    ArrayList f8146f = new ArrayList();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(p pVar, p pVar2) {
            return Integer.compare(pVar.f8162a, pVar2.f8162a);
        }
    }

    static class b extends h {
        b() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
            view.setAlpha(get(f8));
        }
    }

    static class c extends h {

        /* renamed from: g, reason: collision with root package name */
        float[] f8148g = new float[1];

        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
            this.f8148g[0] = get(f8);
            this.f8143c.setInterpolatedValue(view, this.f8148g);
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f8149a;

        /* renamed from: c, reason: collision with root package name */
        float[] f8151c;

        /* renamed from: d, reason: collision with root package name */
        double[] f8152d;

        /* renamed from: e, reason: collision with root package name */
        float[] f8153e;

        /* renamed from: f, reason: collision with root package name */
        float[] f8154f;

        /* renamed from: g, reason: collision with root package name */
        float[] f8155g;

        /* renamed from: h, reason: collision with root package name */
        int f8156h;

        /* renamed from: i, reason: collision with root package name */
        P.b f8157i;

        /* renamed from: j, reason: collision with root package name */
        double[] f8158j;

        /* renamed from: k, reason: collision with root package name */
        double[] f8159k;

        /* renamed from: l, reason: collision with root package name */
        float f8160l;

        /* renamed from: b, reason: collision with root package name */
        P.f f8150b = new P.f();
        public HashMap<String, androidx.constraintlayout.widget.a> mCustomConstraints = new HashMap<>();

        d(int i8, int i9, int i10) {
            this.f8156h = i8;
            this.f8149a = i9;
            this.f8150b.setType(i8);
            this.f8151c = new float[i10];
            this.f8152d = new double[i10];
            this.f8153e = new float[i10];
            this.f8154f = new float[i10];
            this.f8155g = new float[i10];
        }

        public double getSlope(float f8) {
            P.b bVar = this.f8157i;
            if (bVar != null) {
                double d9 = f8;
                bVar.getSlope(d9, this.f8159k);
                this.f8157i.getPos(d9, this.f8158j);
            } else {
                double[] dArr = this.f8159k;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d10 = f8;
            double value = this.f8150b.getValue(d10);
            double slope = this.f8150b.getSlope(d10);
            double[] dArr2 = this.f8159k;
            return dArr2[0] + (value * dArr2[1]) + (slope * this.f8158j[1]);
        }

        public double getValues(float f8) {
            P.b bVar = this.f8157i;
            if (bVar != null) {
                bVar.getPos(f8, this.f8158j);
            } else {
                double[] dArr = this.f8158j;
                dArr[0] = this.f8154f[0];
                dArr[1] = this.f8151c[0];
            }
            return this.f8158j[0] + (this.f8150b.getValue(f8) * this.f8158j[1]);
        }

        public void setPoint(int i8, int i9, float f8, float f9, float f10) {
            this.f8152d[i8] = i9 / 100.0d;
            this.f8153e[i8] = f8;
            this.f8154f[i8] = f9;
            this.f8151c[i8] = f10;
        }

        public void setup(float f8) {
            this.f8160l = f8;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f8152d.length, 2);
            float[] fArr = this.f8151c;
            this.f8158j = new double[fArr.length + 1];
            this.f8159k = new double[fArr.length + 1];
            if (this.f8152d[0] > 0.0d) {
                this.f8150b.addPoint(0.0d, this.f8153e[0]);
            }
            double[] dArr2 = this.f8152d;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f8150b.addPoint(1.0d, this.f8153e[length]);
            }
            for (int i8 = 0; i8 < dArr.length; i8++) {
                dArr[i8][0] = this.f8154f[i8];
                int i9 = 0;
                while (true) {
                    if (i9 < this.f8151c.length) {
                        dArr[i9][1] = r4[i9];
                        i9++;
                    }
                }
                this.f8150b.addPoint(this.f8152d[i8], this.f8153e[i8]);
            }
            this.f8150b.normalize();
            double[] dArr3 = this.f8152d;
            if (dArr3.length > 1) {
                this.f8157i = P.b.get(0, dArr3, dArr);
            } else {
                this.f8157i = null;
            }
        }
    }

    static class e extends h {
        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
            view.setElevation(get(f8));
        }
    }

    static class f extends h {
        f() {
        }

        public void setPathRotate(View view, float f8, double d9, double d10) {
            view.setRotation(get(f8) + ((float) Math.toDegrees(Math.atan2(d10, d9))));
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
        }
    }

    static class g extends h {

        /* renamed from: g, reason: collision with root package name */
        boolean f8161g = false;

        g() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof r) {
                ((r) view).setProgress(get(f8));
                return;
            }
            if (this.f8161g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f8161g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(f8)));
                } catch (IllegalAccessException e8) {
                    Log.e("KeyCycleOscillator", "unable to setProgress", e8);
                } catch (InvocationTargetException e9) {
                    Log.e("KeyCycleOscillator", "unable to setProgress", e9);
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$h, reason: collision with other inner class name */
    static class C0124h extends h {
        C0124h() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
            view.setRotation(get(f8));
        }
    }

    static class i extends h {
        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
            view.setRotationX(get(f8));
        }
    }

    static class j extends h {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
            view.setRotationY(get(f8));
        }
    }

    static class k extends h {
        k() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
            view.setScaleX(get(f8));
        }
    }

    static class l extends h {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
            view.setScaleY(get(f8));
        }
    }

    static class m extends h {
        m() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
            view.setTranslationX(get(f8));
        }
    }

    static class n extends h {
        n() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
            view.setTranslationY(get(f8));
        }
    }

    static class o extends h {
        o() {
        }

        @Override // androidx.constraintlayout.motion.widget.h
        public void setProperty(View view, float f8) {
            view.setTranslationZ(get(f8));
        }
    }

    static class p {

        /* renamed from: a, reason: collision with root package name */
        int f8162a;

        /* renamed from: b, reason: collision with root package name */
        float f8163b;

        /* renamed from: c, reason: collision with root package name */
        float f8164c;

        /* renamed from: d, reason: collision with root package name */
        float f8165d;

        public p(int i8, float f8, float f9, float f10) {
            this.f8162a = i8;
            this.f8163b = f10;
            this.f8164c = f9;
            this.f8165d = f8;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static h a(String str) {
        if (str.startsWith("CUSTOM")) {
            return new c();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    c9 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c9 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c9 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c9 = C0712p.CR;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case '\b':
                return new b();
            case '\t':
                return new C0124h();
            case '\n':
                return new e();
            case 11:
                return new f();
            case '\f':
                return new b();
            case '\r':
                return new b();
            default:
                return null;
        }
    }

    public float get(float f8) {
        return (float) this.f8142b.getValues(f8);
    }

    public P.b getCurveFit() {
        return this.f8141a;
    }

    public float getSlope(float f8) {
        return (float) this.f8142b.getSlope(f8);
    }

    public void setPoint(int i8, int i9, int i10, float f8, float f9, float f10, androidx.constraintlayout.widget.a aVar) {
        this.f8146f.add(new p(i8, f8, f9, f10));
        if (i10 != -1) {
            this.mVariesBy = i10;
        }
        this.f8145e = i9;
        this.f8143c = aVar;
    }

    public abstract void setProperty(View view, float f8);

    public void setType(String str) {
        this.f8144d = str;
    }

    public void setup(float f8) {
        int size = this.f8146f.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f8146f, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
        this.f8142b = new d(this.f8145e, this.mVariesBy, size);
        Iterator it = this.f8146f.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            p pVar = (p) it.next();
            float f9 = pVar.f8165d;
            dArr[i8] = f9 * 0.01d;
            double[] dArr3 = dArr2[i8];
            float f10 = pVar.f8163b;
            dArr3[0] = f10;
            float f11 = pVar.f8164c;
            dArr3[1] = f11;
            this.f8142b.setPoint(i8, pVar.f8162a, f9, f11, f10);
            i8++;
        }
        this.f8142b.setup(f8);
        this.f8141a = P.b.get(0, dArr, dArr2);
    }

    public String toString() {
        String str = this.f8144d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.f8146f.iterator();
        while (it.hasNext()) {
            str = str + "[" + ((p) it.next()).f8162a + " , " + decimalFormat.format(r3.f8163b) + "] ";
        }
        return str;
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }

    public void setPoint(int i8, int i9, int i10, float f8, float f9, float f10) {
        this.f8146f.add(new p(i8, f8, f9, f10));
        if (i10 != -1) {
            this.mVariesBy = i10;
        }
        this.f8145e = i9;
    }
}
