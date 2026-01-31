package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public class j extends k {
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;

    /* renamed from: g, reason: collision with root package name */
    String f8168g = null;

    /* renamed from: h, reason: collision with root package name */
    int f8169h = d.UNSET;

    /* renamed from: i, reason: collision with root package name */
    int f8170i = 0;

    /* renamed from: j, reason: collision with root package name */
    float f8171j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    float f8172k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    float f8173l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    float f8174m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    float f8175n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    float f8176o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    int f8177p = 0;

    /* renamed from: q, reason: collision with root package name */
    private float f8178q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    private float f8179r = Float.NaN;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SparseIntArray f8180a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8180a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.KeyPosition_motionTarget, 1);
            f8180a.append(androidx.constraintlayout.widget.i.KeyPosition_framePosition, 2);
            f8180a.append(androidx.constraintlayout.widget.i.KeyPosition_transitionEasing, 3);
            f8180a.append(androidx.constraintlayout.widget.i.KeyPosition_curveFit, 4);
            f8180a.append(androidx.constraintlayout.widget.i.KeyPosition_drawPath, 5);
            f8180a.append(androidx.constraintlayout.widget.i.KeyPosition_percentX, 6);
            f8180a.append(androidx.constraintlayout.widget.i.KeyPosition_percentY, 7);
            f8180a.append(androidx.constraintlayout.widget.i.KeyPosition_keyPositionType, 9);
            f8180a.append(androidx.constraintlayout.widget.i.KeyPosition_sizePercent, 8);
            f8180a.append(androidx.constraintlayout.widget.i.KeyPosition_percentWidth, 11);
            f8180a.append(androidx.constraintlayout.widget.i.KeyPosition_percentHeight, 12);
            f8180a.append(androidx.constraintlayout.widget.i.KeyPosition_pathMotionArc, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(j jVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArray.getIndex(i8);
                switch (f8180a.get(index)) {
                    case 1:
                        if (r.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, jVar.f8099b);
                            jVar.f8099b = resourceId;
                            if (resourceId == -1) {
                                jVar.f8100c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            jVar.f8100c = typedArray.getString(index);
                            break;
                        } else {
                            jVar.f8099b = typedArray.getResourceId(index, jVar.f8099b);
                            break;
                        }
                    case 2:
                        jVar.f8098a = typedArray.getInt(index, jVar.f8098a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            jVar.f8168g = typedArray.getString(index);
                            break;
                        } else {
                            jVar.f8168g = P.c.NAMED_EASING[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        jVar.f8181f = typedArray.getInteger(index, jVar.f8181f);
                        break;
                    case 5:
                        jVar.f8170i = typedArray.getInt(index, jVar.f8170i);
                        break;
                    case 6:
                        jVar.f8173l = typedArray.getFloat(index, jVar.f8173l);
                        break;
                    case 7:
                        jVar.f8174m = typedArray.getFloat(index, jVar.f8174m);
                        break;
                    case 8:
                        float f8 = typedArray.getFloat(index, jVar.f8172k);
                        jVar.f8171j = f8;
                        jVar.f8172k = f8;
                        break;
                    case 9:
                        jVar.f8177p = typedArray.getInt(index, jVar.f8177p);
                        break;
                    case 10:
                        jVar.f8169h = typedArray.getInt(index, jVar.f8169h);
                        break;
                    case 11:
                        jVar.f8171j = typedArray.getFloat(index, jVar.f8171j);
                        break;
                    case 12:
                        jVar.f8172k = typedArray.getFloat(index, jVar.f8172k);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8180a.get(index));
                        break;
                }
            }
            if (jVar.f8098a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public j() {
        this.f8101d = 2;
    }

    private void e(float f8, float f9, float f10, float f11) {
        float f12 = f10 - f8;
        float f13 = f11 - f9;
        float f14 = Float.isNaN(this.f8173l) ? 0.0f : this.f8173l;
        float f15 = Float.isNaN(this.f8176o) ? 0.0f : this.f8176o;
        float f16 = Float.isNaN(this.f8174m) ? 0.0f : this.f8174m;
        this.f8178q = (int) (f8 + (f14 * f12) + ((Float.isNaN(this.f8175n) ? 0.0f : this.f8175n) * f13));
        this.f8179r = (int) (f9 + (f12 * f15) + (f13 * f16));
    }

    private void f(float f8, float f9, float f10, float f11) {
        float f12 = f10 - f8;
        float f13 = f11 - f9;
        float f14 = this.f8173l;
        float f15 = this.f8174m;
        this.f8178q = f8 + (f12 * f14) + ((-f13) * f15);
        this.f8179r = f9 + (f13 * f14) + (f12 * f15);
    }

    private void h(int i8, int i9) {
        float f8 = this.f8173l;
        float f9 = 0;
        this.f8178q = (i8 * f8) + f9;
        this.f8179r = (i9 * f8) + f9;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void addValues(HashMap<String, v> map) {
    }

    void g(int i8, int i9, float f8, float f9, float f10, float f11) {
        int i10 = this.f8177p;
        if (i10 == 1) {
            f(f8, f9, f10, f11);
        } else if (i10 != 2) {
            e(f8, f9, f10, f11);
        } else {
            h(i8, i9);
        }
    }

    void i(RectF rectF, RectF rectF2, float f8, float f9, String[] strArr, float[] fArr) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fCenterX2 = rectF2.centerX() - fCenterX;
        float fCenterY2 = rectF2.centerY() - fCenterY;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f8 - fCenterX) / fCenterX2;
            strArr[1] = "percentY";
            fArr[1] = (f9 - fCenterY) / fCenterY2;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = (f8 - fCenterX) / fCenterX2;
            fArr[1] = (f9 - fCenterY) / fCenterY2;
        } else {
            fArr[1] = (f8 - fCenterX) / fCenterX2;
            fArr[0] = (f9 - fCenterY) / fCenterY2;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public boolean intersects(int i8, int i9, RectF rectF, RectF rectF2, float f8, float f9) {
        g(i8, i9, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        return Math.abs(f8 - this.f8178q) < 20.0f && Math.abs(f9 - this.f8179r) < 20.0f;
    }

    void j(RectF rectF, RectF rectF2, float f8, float f9, String[] strArr, float[] fArr) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fCenterX2 = rectF2.centerX() - fCenterX;
        float fCenterY2 = rectF2.centerY() - fCenterY;
        float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f10 = fCenterX2 / fHypot;
        float f11 = fCenterY2 / fHypot;
        float f12 = f9 - fCenterY;
        float f13 = f8 - fCenterX;
        float f14 = ((f10 * f12) - (f13 * f11)) / fHypot;
        float f15 = ((f10 * f13) + (f11 * f12)) / fHypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f15;
                fArr[1] = f14;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f15;
        fArr[1] = f14;
    }

    void k(View view, RectF rectF, RectF rectF2, float f8, float f9, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f8 / width;
            strArr[1] = "percentY";
            fArr[1] = f9 / height;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = f8 / width;
            fArr[1] = f9 / height;
        } else {
            fArr[1] = f8 / width;
            fArr[0] = f9 / height;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void load(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.KeyPosition));
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public void positionAttributes(View view, RectF rectF, RectF rectF2, float f8, float f9, String[] strArr, float[] fArr) {
        int i8 = this.f8177p;
        if (i8 == 1) {
            j(rectF, rectF2, f8, f9, strArr, fArr);
        } else if (i8 != 2) {
            i(rectF, rectF2, f8, f9, strArr, fArr);
        } else {
            k(view, rectF, rectF2, f8, f9, strArr, fArr);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void setValue(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "transitionEasing":
                this.f8168g = obj.toString();
                break;
            case "percentWidth":
                this.f8171j = c(obj);
                break;
            case "percentHeight":
                this.f8172k = c(obj);
                break;
            case "drawPath":
                this.f8170i = d(obj);
                break;
            case "sizePercent":
                float fC = c(obj);
                this.f8171j = fC;
                this.f8172k = fC;
                break;
            case "percentX":
                this.f8173l = c(obj);
                break;
            case "percentY":
                this.f8174m = c(obj);
                break;
        }
    }
}
