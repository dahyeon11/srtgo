package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.h;
import androidx.constraintlayout.motion.widget.v;
import androidx.constraintlayout.motion.widget.w;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;

    /* renamed from: A */
    private m[] f8249A;

    /* renamed from: a */
    View f8251a;

    /* renamed from: b */
    int f8252b;

    /* renamed from: c */
    String f8253c;

    /* renamed from: i */
    private P.b[] f8259i;

    /* renamed from: j */
    private P.b f8260j;

    /* renamed from: n */
    private int[] f8264n;

    /* renamed from: o */
    private double[] f8265o;

    /* renamed from: p */
    private double[] f8266p;

    /* renamed from: q */
    private String[] f8267q;

    /* renamed from: r */
    private int[] f8268r;

    /* renamed from: x */
    private HashMap f8274x;

    /* renamed from: y */
    private HashMap f8275y;

    /* renamed from: z */
    private HashMap f8276z;

    /* renamed from: d */
    private int f8254d = -1;

    /* renamed from: e */
    private s f8255e = new s();

    /* renamed from: f */
    private s f8256f = new s();

    /* renamed from: g */
    private n f8257g = new n();

    /* renamed from: h */
    private n f8258h = new n();

    /* renamed from: k */
    float f8261k = Float.NaN;

    /* renamed from: l */
    float f8262l = 0.0f;

    /* renamed from: m */
    float f8263m = 1.0f;

    /* renamed from: s */
    private int f8269s = 4;

    /* renamed from: t */
    private float[] f8270t = new float[4];

    /* renamed from: u */
    private ArrayList f8271u = new ArrayList();

    /* renamed from: v */
    private float[] f8272v = new float[1];

    /* renamed from: w */
    private ArrayList f8273w = new ArrayList();

    /* renamed from: B */
    private int f8250B = d.UNSET;

    o(View view) {
        setView(view);
    }

    private float g(float f8, float[] fArr) {
        float f9 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f10 = this.f8263m;
            if (f10 != 1.0d) {
                float f11 = this.f8262l;
                if (f8 < f11) {
                    f8 = 0.0f;
                }
                if (f8 > f11 && f8 < 1.0d) {
                    f8 = (f8 - f11) * f10;
                }
            }
        }
        P.c cVar = this.f8255e.f8394a;
        Iterator it = this.f8271u.iterator();
        float f12 = Float.NaN;
        while (it.hasNext()) {
            s sVar = (s) it.next();
            P.c cVar2 = sVar.f8394a;
            if (cVar2 != null) {
                float f13 = sVar.f8396c;
                if (f13 < f8) {
                    cVar = cVar2;
                    f9 = f13;
                } else if (Float.isNaN(f12)) {
                    f12 = sVar.f8396c;
                }
            }
        }
        if (cVar != null) {
            float f14 = (Float.isNaN(f12) ? 1.0f : f12) - f9;
            double d9 = (f8 - f9) / f14;
            f8 = (((float) cVar.get(d9)) * f14) + f9;
            if (fArr != null) {
                fArr[0] = (float) cVar.getDiff(d9);
            }
        }
        return f8;
    }

    private float p() {
        float[] fArr = new float[2];
        float f8 = 1.0f / 99;
        double d9 = 0.0d;
        double d10 = 0.0d;
        int i8 = 0;
        float fHypot = 0.0f;
        while (i8 < 100) {
            float f9 = i8 * f8;
            double d11 = f9;
            P.c cVar = this.f8255e.f8394a;
            Iterator it = this.f8271u.iterator();
            float f10 = Float.NaN;
            float f11 = 0.0f;
            while (it.hasNext()) {
                s sVar = (s) it.next();
                P.c cVar2 = sVar.f8394a;
                float f12 = f8;
                if (cVar2 != null) {
                    float f13 = sVar.f8396c;
                    if (f13 < f9) {
                        f11 = f13;
                        cVar = cVar2;
                    } else if (Float.isNaN(f10)) {
                        f10 = sVar.f8396c;
                    }
                }
                f8 = f12;
            }
            float f14 = f8;
            if (cVar != null) {
                if (Float.isNaN(f10)) {
                    f10 = 1.0f;
                }
                d11 = (((float) cVar.get((f9 - f11) / r16)) * (f10 - f11)) + f11;
            }
            this.f8259i[0].getPos(d11, this.f8265o);
            this.f8255e.d(this.f8264n, this.f8265o, fArr, 0);
            if (i8 > 0) {
                fHypot = (float) (fHypot + Math.hypot(d10 - fArr[1], d9 - fArr[0]));
            }
            d9 = fArr[0];
            d10 = fArr[1];
            i8++;
            f8 = f14;
        }
        return fHypot;
    }

    private void q(s sVar) {
        if (Collections.binarySearch(this.f8271u, sVar) == 0) {
            Log.e("MotionController", " KeyPath positon \"" + sVar.f8397d + "\" outside of range");
        }
        this.f8271u.add((-r0) - 1, sVar);
    }

    private void t(s sVar) {
        sVar.l((int) this.f8251a.getX(), (int) this.f8251a.getY(), this.f8251a.getWidth(), this.f8251a.getHeight());
    }

    void a(d dVar) {
        this.f8273w.add(dVar);
    }

    void b(ArrayList arrayList) {
        this.f8273w.addAll(arrayList);
    }

    int c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.f8259i[0].getTimePoints();
        if (iArr != null) {
            Iterator it = this.f8271u.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                iArr[i8] = ((s) it.next()).f8406m;
                i8++;
            }
        }
        int i9 = 0;
        for (double d9 : timePoints) {
            this.f8259i[0].getPos(d9, this.f8265o);
            this.f8255e.d(this.f8264n, this.f8265o, fArr, i9);
            i9 += 2;
        }
        return i9 / 2;
    }

    void d(float[] fArr, int i8) {
        int i9 = i8;
        float f8 = 1.0f;
        float f9 = 1.0f / (i9 - 1);
        HashMap map = this.f8275y;
        v vVar = map == null ? null : (v) map.get("translationX");
        HashMap map2 = this.f8275y;
        v vVar2 = map2 == null ? null : (v) map2.get("translationY");
        HashMap map3 = this.f8276z;
        h hVar = map3 == null ? null : (h) map3.get("translationX");
        HashMap map4 = this.f8276z;
        h hVar2 = map4 != null ? (h) map4.get("translationY") : null;
        int i10 = 0;
        while (i10 < i9) {
            float f10 = i10 * f9;
            float f11 = this.f8263m;
            if (f11 != f8) {
                float f12 = this.f8262l;
                if (f10 < f12) {
                    f10 = 0.0f;
                }
                if (f10 > f12 && f10 < 1.0d) {
                    f10 = (f10 - f12) * f11;
                }
            }
            double d9 = f10;
            P.c cVar = this.f8255e.f8394a;
            Iterator it = this.f8271u.iterator();
            float f13 = Float.NaN;
            float f14 = 0.0f;
            while (it.hasNext()) {
                s sVar = (s) it.next();
                P.c cVar2 = sVar.f8394a;
                if (cVar2 != null) {
                    float f15 = sVar.f8396c;
                    if (f15 < f10) {
                        f14 = f15;
                        cVar = cVar2;
                    } else if (Float.isNaN(f13)) {
                        f13 = sVar.f8396c;
                    }
                }
            }
            if (cVar != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                d9 = (((float) cVar.get((f10 - f14) / r17)) * (f13 - f14)) + f14;
            }
            this.f8259i[0].getPos(d9, this.f8265o);
            P.b bVar = this.f8260j;
            if (bVar != null) {
                double[] dArr = this.f8265o;
                if (dArr.length > 0) {
                    bVar.getPos(d9, dArr);
                }
            }
            int i11 = i10 * 2;
            this.f8255e.d(this.f8264n, this.f8265o, fArr, i11);
            if (hVar != null) {
                fArr[i11] = fArr[i11] + hVar.get(f10);
            } else if (vVar != null) {
                fArr[i11] = fArr[i11] + vVar.get(f10);
            }
            if (hVar2 != null) {
                int i12 = i11 + 1;
                fArr[i12] = fArr[i12] + hVar2.get(f10);
            } else if (vVar2 != null) {
                int i13 = i11 + 1;
                fArr[i13] = fArr[i13] + vVar2.get(f10);
            }
            i10++;
            i9 = i8;
            f8 = 1.0f;
        }
    }

    void e(float f8, float[] fArr, int i8) {
        this.f8259i[0].getPos(g(f8, null), this.f8265o);
        this.f8255e.g(this.f8264n, this.f8265o, fArr, i8);
    }

    void f(float[] fArr, int i8) {
        float f8 = 1.0f / (i8 - 1);
        for (int i9 = 0; i9 < i8; i9++) {
            this.f8259i[0].getPos(g(i9 * f8, null), this.f8265o);
            this.f8255e.g(this.f8264n, this.f8265o, fArr, i9 * 8);
        }
    }

    public int getDrawPath() {
        int iMax = this.f8255e.f8395b;
        Iterator it = this.f8271u.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((s) it.next()).f8395b);
        }
        return Math.max(iMax, this.f8256f.f8395b);
    }

    public int getKeyFrameInfo(int i8, int[] iArr) {
        float[] fArr = new float[2];
        Iterator it = this.f8273w.iterator();
        int i9 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i11 = dVar.f8101d;
            if (i11 == i8 || i8 != -1) {
                iArr[i10] = 0;
                iArr[i10 + 1] = i11;
                iArr[i10 + 2] = dVar.f8098a;
                this.f8259i[0].getPos(r7 / 100.0f, this.f8265o);
                this.f8255e.d(this.f8264n, this.f8265o, fArr, 0);
                iArr[i10 + 3] = Float.floatToIntBits(fArr[0]);
                int i12 = i10 + 4;
                iArr[i12] = Float.floatToIntBits(fArr[1]);
                if (dVar instanceof j) {
                    j jVar = (j) dVar;
                    iArr[i10 + 5] = jVar.f8177p;
                    iArr[i10 + 6] = Float.floatToIntBits(jVar.f8173l);
                    i12 = i10 + 7;
                    iArr[i12] = Float.floatToIntBits(jVar.f8174m);
                }
                int i13 = i12 + 1;
                iArr[i10] = i13 - i10;
                i9++;
                i10 = i13;
            }
        }
        return i9;
    }

    public int getkeyFramePositions(int[] iArr, float[] fArr) {
        Iterator it = this.f8273w.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            iArr[i8] = (dVar.f8101d * 1000) + dVar.f8098a;
            this.f8259i[0].getPos(r6 / 100.0f, this.f8265o);
            this.f8255e.d(this.f8264n, this.f8265o, fArr, i9);
            i9 += 2;
            i8++;
        }
        return i8;
    }

    int h(String str, float[] fArr, int i8) {
        v vVar = (v) this.f8275y.get(str);
        if (vVar == null) {
            return -1;
        }
        for (int i9 = 0; i9 < fArr.length; i9++) {
            fArr[i9] = vVar.get(i9 / (fArr.length - 1));
        }
        return fArr.length;
    }

    void i(float f8, float f9, float f10, float[] fArr) {
        double[] dArr;
        float fG = g(f8, this.f8272v);
        P.b[] bVarArr = this.f8259i;
        int i8 = 0;
        if (bVarArr == null) {
            s sVar = this.f8256f;
            float f11 = sVar.f8398e;
            s sVar2 = this.f8255e;
            float f12 = f11 - sVar2.f8398e;
            float f13 = sVar.f8399f - sVar2.f8399f;
            float f14 = (sVar.f8400g - sVar2.f8400g) + f12;
            float f15 = (sVar.f8401h - sVar2.f8401h) + f13;
            fArr[0] = (f12 * (1.0f - f9)) + (f14 * f9);
            fArr[1] = (f13 * (1.0f - f10)) + (f15 * f10);
            return;
        }
        double d9 = fG;
        bVarArr[0].getSlope(d9, this.f8266p);
        this.f8259i[0].getPos(d9, this.f8265o);
        float f16 = this.f8272v[0];
        while (true) {
            dArr = this.f8266p;
            if (i8 >= dArr.length) {
                break;
            }
            dArr[i8] = dArr[i8] * f16;
            i8++;
        }
        P.b bVar = this.f8260j;
        if (bVar == null) {
            this.f8255e.m(f9, f10, fArr, this.f8264n, dArr, this.f8265o);
            return;
        }
        double[] dArr2 = this.f8265o;
        if (dArr2.length > 0) {
            bVar.getPos(d9, dArr2);
            this.f8260j.getSlope(d9, this.f8266p);
            this.f8255e.m(f9, f10, fArr, this.f8264n, this.f8266p, this.f8265o);
        }
    }

    float j() {
        return this.f8256f.f8398e;
    }

    float k() {
        return this.f8256f.f8399f;
    }

    s l(int i8) {
        return (s) this.f8271u.get(i8);
    }

    float m(int i8, float f8, float f9) {
        s sVar = this.f8256f;
        float f10 = sVar.f8398e;
        s sVar2 = this.f8255e;
        float f11 = sVar2.f8398e;
        float f12 = f10 - f11;
        float f13 = sVar.f8399f;
        float f14 = sVar2.f8399f;
        float f15 = f13 - f14;
        float f16 = f11 + (sVar2.f8400g / 2.0f);
        float f17 = f14 + (sVar2.f8401h / 2.0f);
        float fHypot = (float) Math.hypot(f12, f15);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f18 = f8 - f16;
        float f19 = f9 - f17;
        if (((float) Math.hypot(f18, f19)) == 0.0f) {
            return 0.0f;
        }
        float f20 = (f18 * f12) + (f19 * f15);
        if (i8 == 0) {
            return f20 / fHypot;
        }
        if (i8 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f20 * f20));
        }
        if (i8 == 2) {
            return f18 / f12;
        }
        if (i8 == 3) {
            return f19 / f12;
        }
        if (i8 == 4) {
            return f18 / f15;
        }
        if (i8 != 5) {
            return 0.0f;
        }
        return f19 / f15;
    }

    k n(int i8, int i9, float f8, float f9) {
        RectF rectF = new RectF();
        s sVar = this.f8255e;
        float f10 = sVar.f8398e;
        rectF.left = f10;
        float f11 = sVar.f8399f;
        rectF.top = f11;
        rectF.right = f10 + sVar.f8400g;
        rectF.bottom = f11 + sVar.f8401h;
        RectF rectF2 = new RectF();
        s sVar2 = this.f8256f;
        float f12 = sVar2.f8398e;
        rectF2.left = f12;
        float f13 = sVar2.f8399f;
        rectF2.top = f13;
        rectF2.right = f12 + sVar2.f8400g;
        rectF2.bottom = f13 + sVar2.f8401h;
        Iterator it = this.f8273w.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar instanceof k) {
                k kVar = (k) dVar;
                if (kVar.intersects(i8, i9, rectF, rectF2, f8, f9)) {
                    return kVar;
                }
            }
        }
        return null;
    }

    void o(float f8, int i8, int i9, float f9, float f10, float[] fArr) {
        float fG = g(f8, this.f8272v);
        HashMap map = this.f8275y;
        v vVar = map == null ? null : (v) map.get("translationX");
        HashMap map2 = this.f8275y;
        v vVar2 = map2 == null ? null : (v) map2.get("translationY");
        HashMap map3 = this.f8275y;
        v vVar3 = map3 == null ? null : (v) map3.get("rotation");
        HashMap map4 = this.f8275y;
        v vVar4 = map4 == null ? null : (v) map4.get("scaleX");
        HashMap map5 = this.f8275y;
        v vVar5 = map5 == null ? null : (v) map5.get("scaleY");
        HashMap map6 = this.f8276z;
        h hVar = map6 == null ? null : (h) map6.get("translationX");
        HashMap map7 = this.f8276z;
        h hVar2 = map7 == null ? null : (h) map7.get("translationY");
        HashMap map8 = this.f8276z;
        h hVar3 = map8 == null ? null : (h) map8.get("rotation");
        HashMap map9 = this.f8276z;
        h hVar4 = map9 == null ? null : (h) map9.get("scaleX");
        HashMap map10 = this.f8276z;
        h hVar5 = map10 != null ? (h) map10.get("scaleY") : null;
        P.h hVar6 = new P.h();
        hVar6.clear();
        hVar6.setRotationVelocity(vVar3, fG);
        hVar6.setTranslationVelocity(vVar, vVar2, fG);
        hVar6.setScaleVelocity(vVar4, vVar5, fG);
        hVar6.setRotationVelocity(hVar3, fG);
        hVar6.setTranslationVelocity(hVar, hVar2, fG);
        hVar6.setScaleVelocity(hVar4, hVar5, fG);
        P.b bVar = this.f8260j;
        if (bVar != null) {
            double[] dArr = this.f8265o;
            if (dArr.length > 0) {
                double d9 = fG;
                bVar.getPos(d9, dArr);
                this.f8260j.getSlope(d9, this.f8266p);
                this.f8255e.m(f9, f10, fArr, this.f8264n, this.f8266p, this.f8265o);
            }
            hVar6.applyTransform(f9, f10, i8, i9, fArr);
            return;
        }
        int i10 = 0;
        if (this.f8259i == null) {
            s sVar = this.f8256f;
            float f11 = sVar.f8398e;
            s sVar2 = this.f8255e;
            float f12 = f11 - sVar2.f8398e;
            h hVar7 = hVar5;
            float f13 = sVar.f8399f - sVar2.f8399f;
            h hVar8 = hVar4;
            float f14 = (sVar.f8400g - sVar2.f8400g) + f12;
            float f15 = (sVar.f8401h - sVar2.f8401h) + f13;
            fArr[0] = (f12 * (1.0f - f9)) + (f14 * f9);
            fArr[1] = (f13 * (1.0f - f10)) + (f15 * f10);
            hVar6.clear();
            hVar6.setRotationVelocity(vVar3, fG);
            hVar6.setTranslationVelocity(vVar, vVar2, fG);
            hVar6.setScaleVelocity(vVar4, vVar5, fG);
            hVar6.setRotationVelocity(hVar3, fG);
            hVar6.setTranslationVelocity(hVar, hVar2, fG);
            hVar6.setScaleVelocity(hVar8, hVar7, fG);
            hVar6.applyTransform(f9, f10, i8, i9, fArr);
            return;
        }
        double dG = g(fG, this.f8272v);
        this.f8259i[0].getSlope(dG, this.f8266p);
        this.f8259i[0].getPos(dG, this.f8265o);
        float f16 = this.f8272v[0];
        while (true) {
            double[] dArr2 = this.f8266p;
            if (i10 >= dArr2.length) {
                this.f8255e.m(f9, f10, fArr, this.f8264n, dArr2, this.f8265o);
                hVar6.applyTransform(f9, f10, i8, i9, fArr);
                return;
            } else {
                dArr2[i10] = dArr2[i10] * f16;
                i10++;
            }
        }
    }

    boolean r(View view, float f8, long j8, f fVar) {
        w.d dVar;
        boolean pathRotate;
        double d9;
        float fG = g(f8, null);
        HashMap map = this.f8275y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((v) it.next()).setProperty(view, fG);
            }
        }
        HashMap map2 = this.f8274x;
        if (map2 != null) {
            dVar = null;
            boolean property = false;
            for (w wVar : map2.values()) {
                if (wVar instanceof w.d) {
                    dVar = (w.d) wVar;
                } else {
                    property |= wVar.setProperty(view, fG, j8, fVar);
                }
            }
            pathRotate = property;
        } else {
            dVar = null;
            pathRotate = false;
        }
        P.b[] bVarArr = this.f8259i;
        if (bVarArr != null) {
            double d10 = fG;
            bVarArr[0].getPos(d10, this.f8265o);
            this.f8259i[0].getSlope(d10, this.f8266p);
            P.b bVar = this.f8260j;
            if (bVar != null) {
                double[] dArr = this.f8265o;
                if (dArr.length > 0) {
                    bVar.getPos(d10, dArr);
                    this.f8260j.getSlope(d10, this.f8266p);
                }
            }
            this.f8255e.n(view, this.f8264n, this.f8265o, this.f8266p, null);
            HashMap map3 = this.f8275y;
            if (map3 != null) {
                for (v vVar : map3.values()) {
                    if (vVar instanceof v.d) {
                        double[] dArr2 = this.f8266p;
                        ((v.d) vVar).setPathRotate(view, fG, dArr2[0], dArr2[1]);
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.f8266p;
                d9 = d10;
                pathRotate |= dVar.setPathRotate(view, fVar, fG, j8, dArr3[0], dArr3[1]);
            } else {
                d9 = d10;
            }
            int i8 = 1;
            while (true) {
                P.b[] bVarArr2 = this.f8259i;
                if (i8 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i8].getPos(d9, this.f8270t);
                ((androidx.constraintlayout.widget.a) this.f8255e.f8405l.get(this.f8267q[i8 - 1])).setInterpolatedValue(view, this.f8270t);
                i8++;
            }
            n nVar = this.f8257g;
            if (nVar.f8224b == 0) {
                if (fG <= 0.0f) {
                    view.setVisibility(nVar.f8225c);
                } else if (fG >= 1.0f) {
                    view.setVisibility(this.f8258h.f8225c);
                } else if (this.f8258h.f8225c != nVar.f8225c) {
                    view.setVisibility(0);
                }
            }
            if (this.f8249A != null) {
                int i9 = 0;
                while (true) {
                    m[] mVarArr = this.f8249A;
                    if (i9 >= mVarArr.length) {
                        break;
                    }
                    mVarArr[i9].conditionallyFire(fG, view);
                    i9++;
                }
            }
        } else {
            s sVar = this.f8255e;
            float f9 = sVar.f8398e;
            s sVar2 = this.f8256f;
            float f10 = f9 + ((sVar2.f8398e - f9) * fG);
            float f11 = sVar.f8399f;
            float f12 = f11 + ((sVar2.f8399f - f11) * fG);
            float f13 = sVar.f8400g;
            float f14 = sVar2.f8400g;
            float f15 = sVar.f8401h;
            float f16 = sVar2.f8401h;
            float f17 = f10 + 0.5f;
            int i10 = (int) f17;
            float f18 = f12 + 0.5f;
            int i11 = (int) f18;
            int i12 = (int) (f17 + ((f14 - f13) * fG) + f13);
            int i13 = (int) (f18 + ((f16 - f15) * fG) + f15);
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (f14 != f13 || f16 != f15) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            }
            view.layout(i10, i11, i12, i13);
        }
        HashMap map4 = this.f8276z;
        if (map4 != null) {
            for (h hVar : map4.values()) {
                if (hVar instanceof h.f) {
                    double[] dArr4 = this.f8266p;
                    ((h.f) hVar).setPathRotate(view, fG, dArr4[0], dArr4[1]);
                } else {
                    hVar.setProperty(view, fG);
                }
            }
        }
        return pathRotate;
    }

    void s(View view, k kVar, float f8, float f9, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        s sVar = this.f8255e;
        float f10 = sVar.f8398e;
        rectF.left = f10;
        float f11 = sVar.f8399f;
        rectF.top = f11;
        rectF.right = f10 + sVar.f8400g;
        rectF.bottom = f11 + sVar.f8401h;
        RectF rectF2 = new RectF();
        s sVar2 = this.f8256f;
        float f12 = sVar2.f8398e;
        rectF2.left = f12;
        float f13 = sVar2.f8399f;
        rectF2.top = f13;
        rectF2.right = f12 + sVar2.f8400g;
        rectF2.bottom = f13 + sVar2.f8401h;
        kVar.positionAttributes(view, rectF, rectF2, f8, f9, strArr, fArr);
    }

    public void setDrawPath(int i8) {
        this.f8255e.f8395b = i8;
    }

    public void setPathMotionArc(int i8) {
        this.f8250B = i8;
    }

    public void setView(View view) {
        this.f8251a = view;
        this.f8252b = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f8253c = ((ConstraintLayout.b) layoutParams).getConstraintTag();
        }
    }

    public void setup(int i8, int i9, float f8, long j8) {
        ArrayList arrayList;
        String[] strArr;
        HashSet hashSet;
        w wVarC;
        androidx.constraintlayout.widget.a aVar;
        v vVarB;
        androidx.constraintlayout.widget.a aVar2;
        new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashMap<String, Integer> map = new HashMap<>();
        int i10 = this.f8250B;
        if (i10 != d.UNSET) {
            this.f8255e.f8404k = i10;
        }
        this.f8257g.b(this.f8258h, hashSet3);
        ArrayList arrayList2 = this.f8273w;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar instanceof j) {
                    j jVar = (j) dVar;
                    q(new s(i8, i9, jVar, this.f8255e, this.f8256f));
                    int i11 = jVar.f8181f;
                    if (i11 != d.UNSET) {
                        this.f8254d = i11;
                    }
                } else if (dVar instanceof g) {
                    dVar.getAttributeNames(hashSet4);
                } else if (dVar instanceof l) {
                    dVar.getAttributeNames(hashSet2);
                } else if (dVar instanceof m) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((m) dVar);
                } else {
                    dVar.setInterpolation(map);
                    dVar.getAttributeNames(hashSet3);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f8249A = (m[]) arrayList.toArray(new m[0]);
        }
        char c9 = 1;
        if (!hashSet3.isEmpty()) {
            this.f8275y = new HashMap();
            Iterator it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    Iterator it3 = this.f8273w.iterator();
                    while (it3.hasNext()) {
                        d dVar2 = (d) it3.next();
                        HashMap map2 = dVar2.f8102e;
                        if (map2 != null && (aVar2 = (androidx.constraintlayout.widget.a) map2.get(str2)) != null) {
                            sparseArray.append(dVar2.f8098a, aVar2);
                        }
                    }
                    vVarB = v.a(str, sparseArray);
                } else {
                    vVarB = v.b(str);
                }
                if (vVarB != null) {
                    vVarB.setType(str);
                    this.f8275y.put(str, vVarB);
                }
            }
            ArrayList arrayList3 = this.f8273w;
            if (arrayList3 != null) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    d dVar3 = (d) it4.next();
                    if (dVar3 instanceof e) {
                        dVar3.addValues(this.f8275y);
                    }
                }
            }
            this.f8257g.addValues(this.f8275y, 0);
            this.f8258h.addValues(this.f8275y, 100);
            for (String str3 : this.f8275y.keySet()) {
                ((v) this.f8275y.get(str3)).setup(map.containsKey(str3) ? map.get(str3).intValue() : 0);
            }
        }
        if (!hashSet2.isEmpty()) {
            if (this.f8274x == null) {
                this.f8274x = new HashMap();
            }
            Iterator it5 = hashSet2.iterator();
            while (it5.hasNext()) {
                String str4 = (String) it5.next();
                if (!this.f8274x.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        Iterator it6 = this.f8273w.iterator();
                        while (it6.hasNext()) {
                            d dVar4 = (d) it6.next();
                            HashMap map3 = dVar4.f8102e;
                            if (map3 != null && (aVar = (androidx.constraintlayout.widget.a) map3.get(str5)) != null) {
                                sparseArray2.append(dVar4.f8098a, aVar);
                            }
                        }
                        wVarC = w.b(str4, sparseArray2);
                    } else {
                        wVarC = w.c(str4, j8);
                    }
                    if (wVarC != null) {
                        wVarC.setType(str4);
                        this.f8274x.put(str4, wVarC);
                    }
                }
            }
            ArrayList arrayList4 = this.f8273w;
            if (arrayList4 != null) {
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    d dVar5 = (d) it7.next();
                    if (dVar5 instanceof l) {
                        ((l) dVar5).addTimeValues(this.f8274x);
                    }
                }
            }
            for (String str6 : this.f8274x.keySet()) {
                ((w) this.f8274x.get(str6)).setup(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.f8271u.size();
        int i12 = size + 2;
        s[] sVarArr = new s[i12];
        sVarArr[0] = this.f8255e;
        sVarArr[size + 1] = this.f8256f;
        if (this.f8271u.size() > 0 && this.f8254d == -1) {
            this.f8254d = 0;
        }
        Iterator it8 = this.f8271u.iterator();
        int i13 = 1;
        while (it8.hasNext()) {
            sVarArr[i13] = (s) it8.next();
            i13++;
        }
        HashSet hashSet5 = new HashSet();
        for (String str7 : this.f8256f.f8405l.keySet()) {
            if (this.f8255e.f8405l.containsKey(str7)) {
                if (!hashSet3.contains("CUSTOM," + str7)) {
                    hashSet5.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet5.toArray(new String[0]);
        this.f8267q = strArr2;
        this.f8268r = new int[strArr2.length];
        int i14 = 0;
        while (true) {
            strArr = this.f8267q;
            if (i14 >= strArr.length) {
                break;
            }
            String str8 = strArr[i14];
            this.f8268r[i14] = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= i12) {
                    break;
                }
                if (sVarArr[i15].f8405l.containsKey(str8)) {
                    int[] iArr = this.f8268r;
                    iArr[i14] = iArr[i14] + ((androidx.constraintlayout.widget.a) sVarArr[i15].f8405l.get(str8)).noOfInterpValues();
                    break;
                }
                i15++;
            }
            i14++;
        }
        boolean z8 = sVarArr[0].f8404k != d.UNSET;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i16 = 1; i16 < i12; i16++) {
            sVarArr[i16].b(sVarArr[i16 - 1], zArr, this.f8267q, z8);
        }
        int i17 = 0;
        for (int i18 = 1; i18 < length; i18++) {
            if (zArr[i18]) {
                i17++;
            }
        }
        int[] iArr2 = new int[i17];
        this.f8264n = iArr2;
        this.f8265o = new double[iArr2.length];
        this.f8266p = new double[iArr2.length];
        int i19 = 0;
        for (int i20 = 1; i20 < length; i20++) {
            if (zArr[i20]) {
                this.f8264n[i19] = i20;
                i19++;
            }
        }
        int i21 = 2;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i12, this.f8264n.length);
        double[] dArr2 = new double[i12];
        for (int i22 = 0; i22 < i12; i22++) {
            sVarArr[i22].c(dArr[i22], this.f8264n);
            dArr2[i22] = sVarArr[i22].f8396c;
        }
        int i23 = 0;
        while (true) {
            int[] iArr3 = this.f8264n;
            if (i23 >= iArr3.length) {
                break;
            }
            if (iArr3[i23] < s.f8393p.length) {
                String str9 = s.f8393p[this.f8264n[i23]] + " [";
                for (int i24 = 0; i24 < i12; i24++) {
                    str9 = str9 + dArr[i24][i23];
                }
            }
            i23++;
        }
        this.f8259i = new P.b[this.f8267q.length + 1];
        int i25 = 0;
        while (true) {
            String[] strArr3 = this.f8267q;
            if (i25 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i25];
            int i26 = 0;
            int i27 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i26 < i12) {
                if (sVarArr[i26].h(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i12];
                        int[] iArr4 = new int[i21];
                        iArr4[c9] = sVarArr[i26].f(str10);
                        iArr4[0] = i12;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr4);
                    }
                    s sVar = sVarArr[i26];
                    hashSet = hashSet4;
                    dArr3[i27] = sVar.f8396c;
                    sVar.e(str10, dArr4[i27], 0);
                    i27++;
                } else {
                    hashSet = hashSet4;
                }
                i26++;
                hashSet4 = hashSet;
                i21 = 2;
                c9 = 1;
            }
            i25++;
            this.f8259i[i25] = P.b.get(this.f8254d, Arrays.copyOf(dArr3, i27), (double[][]) Arrays.copyOf(dArr4, i27));
            hashSet4 = hashSet4;
            i21 = 2;
            c9 = 1;
        }
        HashSet hashSet6 = hashSet4;
        this.f8259i[0] = P.b.get(this.f8254d, dArr2, dArr);
        if (sVarArr[0].f8404k != d.UNSET) {
            int[] iArr5 = new int[i12];
            double[] dArr5 = new double[i12];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i12, 2);
            for (int i28 = 0; i28 < i12; i28++) {
                iArr5[i28] = sVarArr[i28].f8404k;
                dArr5[i28] = r8.f8396c;
                double[] dArr7 = dArr6[i28];
                dArr7[0] = r8.f8398e;
                dArr7[1] = r8.f8399f;
            }
            this.f8260j = P.b.getArc(iArr5, dArr5, dArr6);
        }
        this.f8276z = new HashMap();
        if (this.f8273w != null) {
            Iterator it9 = hashSet6.iterator();
            float fP = Float.NaN;
            while (it9.hasNext()) {
                String str11 = (String) it9.next();
                h hVarA = h.a(str11);
                if (hVarA != null) {
                    if (hVarA.variesByPath() && Float.isNaN(fP)) {
                        fP = p();
                    }
                    hVarA.setType(str11);
                    this.f8276z.put(str11, hVarA);
                }
            }
            Iterator it10 = this.f8273w.iterator();
            while (it10.hasNext()) {
                d dVar6 = (d) it10.next();
                if (dVar6 instanceof g) {
                    ((g) dVar6).addCycleValues(this.f8276z);
                }
            }
            Iterator it11 = this.f8276z.values().iterator();
            while (it11.hasNext()) {
                ((h) it11.next()).setup(fP);
            }
        }
    }

    public String toString() {
        return " start: x: " + this.f8255e.f8398e + " y: " + this.f8255e.f8399f + " end: x: " + this.f8256f.f8398e + " y: " + this.f8256f.f8399f;
    }

    void u(R.e eVar, androidx.constraintlayout.widget.d dVar) {
        s sVar = this.f8256f;
        sVar.f8396c = 1.0f;
        sVar.f8397d = 1.0f;
        t(sVar);
        this.f8256f.l(eVar.getX(), eVar.getY(), eVar.getWidth(), eVar.getHeight());
        this.f8256f.applyParameters(dVar.getParameters(this.f8252b));
        this.f8258h.setState(eVar, dVar, this.f8252b);
    }

    void v(View view) {
        s sVar = this.f8255e;
        sVar.f8396c = 0.0f;
        sVar.f8397d = 0.0f;
        sVar.l(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f8257g.setState(view);
    }

    void w(R.e eVar, androidx.constraintlayout.widget.d dVar) {
        s sVar = this.f8255e;
        sVar.f8396c = 0.0f;
        sVar.f8397d = 0.0f;
        t(sVar);
        this.f8255e.l(eVar.getX(), eVar.getY(), eVar.getWidth(), eVar.getHeight());
        d.a parameters = dVar.getParameters(this.f8252b);
        this.f8255e.applyParameters(parameters);
        this.f8261k = parameters.motion.mMotionStagger;
        this.f8257g.setState(eVar, dVar, this.f8252b);
    }
}
