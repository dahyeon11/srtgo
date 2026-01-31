package androidx.constraintlayout.motion.widget;

import R.e;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.t;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.core.view.T;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import y1.C6521b;

/* loaded from: classes.dex */
public class r extends ConstraintLayout implements T {
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    public static boolean IS_IN_EDIT_MODE = false;
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;

    /* renamed from: A */
    Interpolator f8281A;

    /* renamed from: A0 */
    int f8282A0;

    /* renamed from: B */
    float f8283B;

    /* renamed from: B0 */
    int f8284B0;

    /* renamed from: C */
    private int f8285C;

    /* renamed from: C0 */
    int f8286C0;

    /* renamed from: D */
    int f8287D;

    /* renamed from: D0 */
    int f8288D0;

    /* renamed from: E */
    private int f8289E;

    /* renamed from: E0 */
    int f8290E0;

    /* renamed from: F */
    private int f8291F;

    /* renamed from: F0 */
    float f8292F0;

    /* renamed from: G */
    private int f8293G;

    /* renamed from: G0 */
    private androidx.constraintlayout.motion.widget.f f8294G0;

    /* renamed from: H */
    private boolean f8295H;

    /* renamed from: H0 */
    private boolean f8296H0;

    /* renamed from: I */
    HashMap f8297I;

    /* renamed from: I0 */
    private h f8298I0;

    /* renamed from: J */
    private long f8299J;

    /* renamed from: J0 */
    j f8300J0;

    /* renamed from: K */
    private float f8301K;

    /* renamed from: K0 */
    e f8302K0;

    /* renamed from: L */
    float f8303L;

    /* renamed from: L0 */
    private boolean f8304L0;

    /* renamed from: M */
    float f8305M;

    /* renamed from: M0 */
    private RectF f8306M0;

    /* renamed from: N */
    private long f8307N;

    /* renamed from: N0 */
    private View f8308N0;

    /* renamed from: O */
    float f8309O;

    /* renamed from: O0 */
    ArrayList f8310O0;

    /* renamed from: P */
    private boolean f8311P;

    /* renamed from: Q */
    boolean f8312Q;

    /* renamed from: R */
    boolean f8313R;

    /* renamed from: S */
    private i f8314S;

    /* renamed from: T */
    private float f8315T;

    /* renamed from: U */
    private float f8316U;

    /* renamed from: V */
    int f8317V;

    /* renamed from: W */
    d f8318W;

    /* renamed from: a0 */
    private boolean f8319a0;

    /* renamed from: b0 */
    private P.g f8320b0;

    /* renamed from: c0 */
    private c f8321c0;

    /* renamed from: d0 */
    private androidx.constraintlayout.motion.widget.c f8322d0;

    /* renamed from: e0 */
    boolean f8323e0;

    /* renamed from: f0 */
    int f8324f0;

    /* renamed from: g0 */
    int f8325g0;

    /* renamed from: h0 */
    int f8326h0;

    /* renamed from: i0 */
    int f8327i0;

    /* renamed from: j0 */
    boolean f8328j0;

    /* renamed from: k0 */
    float f8329k0;

    /* renamed from: l0 */
    float f8330l0;

    /* renamed from: m0 */
    long f8331m0;

    /* renamed from: n0 */
    float f8332n0;

    /* renamed from: o0 */
    private boolean f8333o0;

    /* renamed from: p0 */
    private ArrayList f8334p0;

    /* renamed from: q0 */
    private ArrayList f8335q0;

    /* renamed from: r0 */
    private ArrayList f8336r0;

    /* renamed from: s0 */
    private int f8337s0;

    /* renamed from: t0 */
    private long f8338t0;

    /* renamed from: u0 */
    private float f8339u0;

    /* renamed from: v0 */
    private int f8340v0;

    /* renamed from: w0 */
    private float f8341w0;

    /* renamed from: x0 */
    boolean f8342x0;

    /* renamed from: y0 */
    protected boolean f8343y0;

    /* renamed from: z */
    t f8344z;

    /* renamed from: z0 */
    int f8345z0;

    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f8346a;

        a(View view) {
            this.f8346a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8346a.setNestedScrollingEnabled(true);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f8348a;

        static {
            int[] iArr = new int[j.values().length];
            f8348a = iArr;
            try {
                iArr[j.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8348a[j.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8348a[j.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8348a[j.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c extends q {

        /* renamed from: a */
        float f8349a = 0.0f;

        /* renamed from: b */
        float f8350b = 0.0f;

        /* renamed from: c */
        float f8351c;

        c() {
        }

        public void config(float f8, float f9, float f10) {
            this.f8349a = f8;
            this.f8350b = f9;
            this.f8351c = f10;
        }

        @Override // androidx.constraintlayout.motion.widget.q, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9;
            float f10;
            float f11 = this.f8349a;
            if (f11 > 0.0f) {
                float f12 = this.f8351c;
                if (f11 / f12 < f8) {
                    f8 = f11 / f12;
                }
                r.this.f8283B = f11 - (f12 * f8);
                f9 = (f11 * f8) - (((f12 * f8) * f8) / 2.0f);
                f10 = this.f8350b;
            } else {
                float f13 = this.f8351c;
                if ((-f11) / f13 < f8) {
                    f8 = (-f11) / f13;
                }
                r.this.f8283B = (f13 * f8) + f11;
                f9 = (f11 * f8) + (((f13 * f8) * f8) / 2.0f);
                f10 = this.f8350b;
            }
            return f9 + f10;
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public float getVelocity() {
            return r.this.f8283B;
        }
    }

    private class d {

        /* renamed from: a */
        float[] f8353a;

        /* renamed from: b */
        int[] f8354b;

        /* renamed from: c */
        float[] f8355c;

        /* renamed from: d */
        Path f8356d;

        /* renamed from: e */
        Paint f8357e;

        /* renamed from: f */
        Paint f8358f;

        /* renamed from: g */
        Paint f8359g;

        /* renamed from: h */
        Paint f8360h;

        /* renamed from: i */
        Paint f8361i;

        /* renamed from: j */
        private float[] f8362j;

        /* renamed from: p */
        DashPathEffect f8368p;

        /* renamed from: q */
        int f8369q;

        /* renamed from: t */
        int f8372t;

        /* renamed from: k */
        final int f8363k = -21965;

        /* renamed from: l */
        final int f8364l = -2067046;

        /* renamed from: m */
        final int f8365m = -13391360;

        /* renamed from: n */
        final int f8366n = 1996488704;

        /* renamed from: o */
        final int f8367o = 10;

        /* renamed from: r */
        Rect f8370r = new Rect();

        /* renamed from: s */
        boolean f8371s = false;

        public d() {
            this.f8372t = 1;
            Paint paint = new Paint();
            this.f8357e = paint;
            paint.setAntiAlias(true);
            this.f8357e.setColor(-21965);
            this.f8357e.setStrokeWidth(2.0f);
            Paint paint2 = this.f8357e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f8358f = paint3;
            paint3.setAntiAlias(true);
            this.f8358f.setColor(-2067046);
            this.f8358f.setStrokeWidth(2.0f);
            this.f8358f.setStyle(style);
            Paint paint4 = new Paint();
            this.f8359g = paint4;
            paint4.setAntiAlias(true);
            this.f8359g.setColor(-13391360);
            this.f8359g.setStrokeWidth(2.0f);
            this.f8359g.setStyle(style);
            Paint paint5 = new Paint();
            this.f8360h = paint5;
            paint5.setAntiAlias(true);
            this.f8360h.setColor(-13391360);
            this.f8360h.setTextSize(r.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f8362j = new float[8];
            Paint paint6 = new Paint();
            this.f8361i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f8368p = dashPathEffect;
            this.f8359g.setPathEffect(dashPathEffect);
            this.f8355c = new float[100];
            this.f8354b = new int[50];
            if (this.f8371s) {
                this.f8357e.setStrokeWidth(8.0f);
                this.f8361i.setStrokeWidth(8.0f);
                this.f8358f.setStrokeWidth(8.0f);
                this.f8372t = 4;
            }
        }

        private void a(Canvas canvas) {
            canvas.drawLines(this.f8353a, this.f8357e);
        }

        private void b(Canvas canvas) {
            boolean z8 = false;
            boolean z9 = false;
            for (int i8 = 0; i8 < this.f8369q; i8++) {
                int i9 = this.f8354b[i8];
                if (i9 == 1) {
                    z8 = true;
                }
                if (i9 == 2) {
                    z9 = true;
                }
            }
            if (z8) {
                e(canvas);
            }
            if (z9) {
                c(canvas);
            }
        }

        private void c(Canvas canvas) {
            float[] fArr = this.f8353a;
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = fArr[fArr.length - 2];
            float f11 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f8, f10), Math.max(f9, f11), Math.max(f8, f10), Math.max(f9, f11), this.f8359g);
            canvas.drawLine(Math.min(f8, f10), Math.min(f9, f11), Math.min(f8, f10), Math.max(f9, f11), this.f8359g);
        }

        private void d(Canvas canvas, float f8, float f9) {
            float[] fArr = this.f8353a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            float fMin = Math.min(f10, f12);
            float fMax = Math.max(f11, f13);
            float fMin2 = f8 - Math.min(f10, f12);
            float fMax2 = Math.max(f11, f13) - f9;
            String str = "" + (((int) (((fMin2 * 100.0f) / Math.abs(f12 - f10)) + 0.5d)) / 100.0f);
            j(str, this.f8360h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f8370r.width() / 2)) + fMin, f9 - 20.0f, this.f8360h);
            canvas.drawLine(f8, f9, Math.min(f10, f12), f9, this.f8359g);
            String str2 = "" + (((int) (((fMax2 * 100.0f) / Math.abs(f13 - f11)) + 0.5d)) / 100.0f);
            j(str2, this.f8360h);
            canvas.drawText(str2, f8 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f8370r.height() / 2)), this.f8360h);
            canvas.drawLine(f8, f9, f8, Math.max(f11, f13), this.f8359g);
        }

        private void e(Canvas canvas) {
            float[] fArr = this.f8353a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f8359g);
        }

        private void f(Canvas canvas, float f8, float f9) {
            float[] fArr = this.f8353a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f10 - f12, f11 - f13);
            float f14 = f12 - f10;
            float f15 = f13 - f11;
            float f16 = (((f8 - f10) * f14) + ((f9 - f11) * f15)) / (fHypot * fHypot);
            float f17 = f10 + (f14 * f16);
            float f18 = f11 + (f16 * f15);
            Path path = new Path();
            path.moveTo(f8, f9);
            path.lineTo(f17, f18);
            float fHypot2 = (float) Math.hypot(f17 - f8, f18 - f9);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            j(str, this.f8360h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f8370r.width() / 2), -20.0f, this.f8360h);
            canvas.drawLine(f8, f9, f17, f18, this.f8359g);
        }

        private void g(Canvas canvas, float f8, float f9, int i8, int i9) {
            String str = "" + (((int) ((((f8 - (i8 / 2)) * 100.0f) / (r.this.getWidth() - i8)) + 0.5d)) / 100.0f);
            j(str, this.f8360h);
            canvas.drawText(str, ((f8 / 2.0f) - (this.f8370r.width() / 2)) + 0.0f, f9 - 20.0f, this.f8360h);
            canvas.drawLine(f8, f9, Math.min(0.0f, 1.0f), f9, this.f8359g);
            String str2 = "" + (((int) ((((f9 - (i9 / 2)) * 100.0f) / (r.this.getHeight() - i9)) + 0.5d)) / 100.0f);
            j(str2, this.f8360h);
            canvas.drawText(str2, f8 + 5.0f, 0.0f - ((f9 / 2.0f) - (this.f8370r.height() / 2)), this.f8360h);
            canvas.drawLine(f8, f9, f8, Math.max(0.0f, 1.0f), this.f8359g);
        }

        private void h(Canvas canvas, o oVar) {
            this.f8356d.reset();
            for (int i8 = 0; i8 <= 50; i8++) {
                oVar.e(i8 / 50, this.f8362j, 0);
                Path path = this.f8356d;
                float[] fArr = this.f8362j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f8356d;
                float[] fArr2 = this.f8362j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f8356d;
                float[] fArr3 = this.f8362j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f8356d;
                float[] fArr4 = this.f8362j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f8356d.close();
            }
            this.f8357e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f8356d, this.f8357e);
            canvas.translate(-2.0f, -2.0f);
            this.f8357e.setColor(W.a.CATEGORY_MASK);
            canvas.drawPath(this.f8356d, this.f8357e);
        }

        private void i(Canvas canvas, int i8, int i9, o oVar) {
            int width;
            int height;
            int i10;
            float f8;
            float f9;
            View view = oVar.f8251a;
            if (view != null) {
                width = view.getWidth();
                height = oVar.f8251a.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i11 = 1; i11 < i9 - 1; i11++) {
                if (i8 != 4 || this.f8354b[i11 - 1] != 0) {
                    float[] fArr = this.f8355c;
                    int i12 = i11 * 2;
                    float f10 = fArr[i12];
                    float f11 = fArr[i12 + 1];
                    this.f8356d.reset();
                    this.f8356d.moveTo(f10, f11 + 10.0f);
                    this.f8356d.lineTo(f10 + 10.0f, f11);
                    this.f8356d.lineTo(f10, f11 - 10.0f);
                    this.f8356d.lineTo(f10 - 10.0f, f11);
                    this.f8356d.close();
                    int i13 = i11 - 1;
                    oVar.l(i13);
                    if (i8 == 4) {
                        int i14 = this.f8354b[i13];
                        if (i14 == 1) {
                            f(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i14 == 2) {
                            d(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else {
                            if (i14 == 3) {
                                i10 = 3;
                                f8 = f11;
                                f9 = f10;
                                g(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f8356d, this.f8361i);
                        }
                        i10 = 3;
                        f8 = f11;
                        f9 = f10;
                        canvas.drawPath(this.f8356d, this.f8361i);
                    } else {
                        i10 = 3;
                        f8 = f11;
                        f9 = f10;
                    }
                    if (i8 == 2) {
                        f(canvas, f9 - 0.0f, f8 - 0.0f);
                    }
                    if (i8 == i10) {
                        d(canvas, f9 - 0.0f, f8 - 0.0f);
                    }
                    if (i8 == 6) {
                        g(canvas, f9 - 0.0f, f8 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f8356d, this.f8361i);
                }
            }
            float[] fArr2 = this.f8353a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f8358f);
                float[] fArr3 = this.f8353a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f8358f);
            }
        }

        public void draw(Canvas canvas, HashMap<View, o> map, int i8, int i9) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!r.this.isInEditMode() && (i9 & 1) == 2) {
                String str = r.this.getContext().getResources().getResourceName(r.this.f8289E) + ":" + r.this.getProgress();
                canvas.drawText(str, 10.0f, r.this.getHeight() - 30, this.f8360h);
                canvas.drawText(str, 11.0f, r.this.getHeight() - 29, this.f8357e);
            }
            for (o oVar : map.values()) {
                int drawPath = oVar.getDrawPath();
                if (i9 > 0 && drawPath == 0) {
                    drawPath = 1;
                }
                if (drawPath != 0) {
                    this.f8369q = oVar.c(this.f8355c, this.f8354b);
                    if (drawPath >= 1) {
                        int i10 = i8 / 16;
                        float[] fArr = this.f8353a;
                        if (fArr == null || fArr.length != i10 * 2) {
                            this.f8353a = new float[i10 * 2];
                            this.f8356d = new Path();
                        }
                        int i11 = this.f8372t;
                        canvas.translate(i11, i11);
                        this.f8357e.setColor(1996488704);
                        this.f8361i.setColor(1996488704);
                        this.f8358f.setColor(1996488704);
                        this.f8359g.setColor(1996488704);
                        oVar.d(this.f8353a, i10);
                        drawAll(canvas, drawPath, this.f8369q, oVar);
                        this.f8357e.setColor(-21965);
                        this.f8358f.setColor(-2067046);
                        this.f8361i.setColor(-2067046);
                        this.f8359g.setColor(-13391360);
                        int i12 = this.f8372t;
                        canvas.translate(-i12, -i12);
                        drawAll(canvas, drawPath, this.f8369q, oVar);
                        if (drawPath == 5) {
                            h(canvas, oVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void drawAll(Canvas canvas, int i8, int i9, o oVar) {
            if (i8 == 4) {
                b(canvas);
            }
            if (i8 == 2) {
                e(canvas);
            }
            if (i8 == 3) {
                c(canvas);
            }
            a(canvas);
            i(canvas, i8, i9, oVar);
        }

        void j(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f8370r);
        }
    }

    class e {

        /* renamed from: a */
        R.f f8374a = new R.f();

        /* renamed from: b */
        R.f f8375b = new R.f();

        /* renamed from: c */
        androidx.constraintlayout.widget.d f8376c = null;

        /* renamed from: d */
        androidx.constraintlayout.widget.d f8377d = null;

        /* renamed from: e */
        int f8378e;

        /* renamed from: f */
        int f8379f;

        e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void d(R.f fVar, androidx.constraintlayout.widget.d dVar) throws NumberFormatException {
            SparseArray<R.e> sparseArray = new SparseArray<>();
            e.a aVar = new e.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, fVar);
            sparseArray.put(r.this.getId(), fVar);
            Iterator<R.e> it = fVar.getChildren().iterator();
            while (it.hasNext()) {
                R.e next = it.next();
                sparseArray.put(((View) next.getCompanionWidget()).getId(), next);
            }
            Iterator<R.e> it2 = fVar.getChildren().iterator();
            while (it2.hasNext()) {
                R.e next2 = it2.next();
                View view = (View) next2.getCompanionWidget();
                dVar.applyToLayoutParams(view.getId(), aVar);
                next2.setWidth(dVar.getWidth(view.getId()));
                next2.setHeight(dVar.getHeight(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.b) {
                    dVar.applyToHelper((androidx.constraintlayout.widget.b) view, next2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).validateParams();
                    }
                }
                aVar.resolveLayoutDirection(r.this.getLayoutDirection());
                r.this.c(false, view, next2, aVar, sparseArray);
                if (dVar.getVisibilityMode(view.getId()) == 1) {
                    next2.setVisibility(view.getVisibility());
                } else {
                    next2.setVisibility(dVar.getVisibility(view.getId()));
                }
            }
            Iterator<R.e> it3 = fVar.getChildren().iterator();
            while (it3.hasNext()) {
                R.e next3 = it3.next();
                if (next3 instanceof R.l) {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) next3.getCompanionWidget();
                    R.i iVar = (R.i) next3;
                    bVar.updatePreLayout(fVar, iVar, sparseArray);
                    ((R.l) iVar).captureWidgets();
                }
            }
        }

        void a(R.f fVar, R.f fVar2) {
            ArrayList<R.e> children = fVar.getChildren();
            HashMap<R.e, R.e> map = new HashMap<>();
            map.put(fVar, fVar2);
            fVar2.getChildren().clear();
            fVar2.copy(fVar, map);
            Iterator<R.e> it = children.iterator();
            while (it.hasNext()) {
                R.e next = it.next();
                R.e aVar = next instanceof R.a ? new R.a() : next instanceof R.h ? new R.h() : next instanceof R.g ? new R.g() : next instanceof R.i ? new R.j() : new R.e();
                fVar2.add(aVar);
                map.put(next, aVar);
            }
            Iterator<R.e> it2 = children.iterator();
            while (it2.hasNext()) {
                R.e next2 = it2.next();
                map.get(next2).copy(next2, map);
            }
        }

        R.e b(R.f fVar, View view) {
            if (fVar.getCompanionWidget() == view) {
                return fVar;
            }
            ArrayList<R.e> children = fVar.getChildren();
            int size = children.size();
            for (int i8 = 0; i8 < size; i8++) {
                R.e eVar = children.get(i8);
                if (eVar.getCompanionWidget() == view) {
                    return eVar;
                }
            }
            return null;
        }

        public void build() {
            int childCount = r.this.getChildCount();
            r.this.f8297I.clear();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = r.this.getChildAt(i8);
                r.this.f8297I.put(childAt, new o(childAt));
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt2 = r.this.getChildAt(i9);
                o oVar = (o) r.this.f8297I.get(childAt2);
                if (oVar != null) {
                    if (this.f8376c != null) {
                        R.e eVarB = b(this.f8374a, childAt2);
                        if (eVarB != null) {
                            oVar.w(eVarB, this.f8376c);
                        } else if (r.this.f8317V != 0) {
                            Log.e("MotionLayout", androidx.constraintlayout.motion.widget.b.getLocation() + "no widget for  " + androidx.constraintlayout.motion.widget.b.getName(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.f8377d != null) {
                        R.e eVarB2 = b(this.f8375b, childAt2);
                        if (eVarB2 != null) {
                            oVar.u(eVarB2, this.f8377d);
                        } else if (r.this.f8317V != 0) {
                            Log.e("MotionLayout", androidx.constraintlayout.motion.widget.b.getLocation() + "no widget for  " + androidx.constraintlayout.motion.widget.b.getName(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
        }

        void c(R.f fVar, androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) throws NumberFormatException {
            this.f8376c = dVar;
            this.f8377d = dVar2;
            this.f8374a = new R.f();
            this.f8375b = new R.f();
            this.f8374a.setMeasurer(((ConstraintLayout) r.this).f8508c.getMeasurer());
            this.f8375b.setMeasurer(((ConstraintLayout) r.this).f8508c.getMeasurer());
            this.f8374a.removeAllChildren();
            this.f8375b.removeAllChildren();
            a(((ConstraintLayout) r.this).f8508c, this.f8374a);
            a(((ConstraintLayout) r.this).f8508c, this.f8375b);
            if (r.this.f8305M > 0.5d) {
                if (dVar != null) {
                    d(this.f8374a, dVar);
                }
                d(this.f8375b, dVar2);
            } else {
                d(this.f8375b, dVar2);
                if (dVar != null) {
                    d(this.f8374a, dVar);
                }
            }
            this.f8374a.setRtl(r.this.g());
            this.f8374a.updateHierarchy();
            this.f8375b.setRtl(r.this.g());
            this.f8375b.updateHierarchy();
            ViewGroup.LayoutParams layoutParams = r.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    R.f fVar2 = this.f8374a;
                    e.b bVar = e.b.WRAP_CONTENT;
                    fVar2.setHorizontalDimensionBehaviour(bVar);
                    this.f8375b.setHorizontalDimensionBehaviour(bVar);
                }
                if (layoutParams.height == -2) {
                    R.f fVar3 = this.f8374a;
                    e.b bVar2 = e.b.WRAP_CONTENT;
                    fVar3.setVerticalDimensionBehaviour(bVar2);
                    this.f8375b.setVerticalDimensionBehaviour(bVar2);
                }
            }
        }

        public boolean isNotConfiguredWith(int i8, int i9) {
            return (i8 == this.f8378e && i9 == this.f8379f) ? false : true;
        }

        public void measure(int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i8);
            int mode2 = View.MeasureSpec.getMode(i9);
            r rVar = r.this;
            rVar.f8288D0 = mode;
            rVar.f8290E0 = mode2;
            int optimizationLevel = rVar.getOptimizationLevel();
            r rVar2 = r.this;
            if (rVar2.f8287D == rVar2.getStartState()) {
                r.this.k(this.f8375b, optimizationLevel, i8, i9);
                if (this.f8376c != null) {
                    r.this.k(this.f8374a, optimizationLevel, i8, i9);
                }
            } else {
                if (this.f8376c != null) {
                    r.this.k(this.f8374a, optimizationLevel, i8, i9);
                }
                r.this.k(this.f8375b, optimizationLevel, i8, i9);
            }
            boolean z8 = true;
            if (!(r.this.getParent() instanceof r) || mode != 1073741824 || mode2 != 1073741824) {
                r rVar3 = r.this;
                rVar3.f8288D0 = mode;
                rVar3.f8290E0 = mode2;
                if (rVar3.f8287D == rVar3.getStartState()) {
                    r.this.k(this.f8375b, optimizationLevel, i8, i9);
                    if (this.f8376c != null) {
                        r.this.k(this.f8374a, optimizationLevel, i8, i9);
                    }
                } else {
                    if (this.f8376c != null) {
                        r.this.k(this.f8374a, optimizationLevel, i8, i9);
                    }
                    r.this.k(this.f8375b, optimizationLevel, i8, i9);
                }
                r.this.f8345z0 = this.f8374a.getWidth();
                r.this.f8282A0 = this.f8374a.getHeight();
                r.this.f8284B0 = this.f8375b.getWidth();
                r.this.f8286C0 = this.f8375b.getHeight();
                r rVar4 = r.this;
                rVar4.f8343y0 = (rVar4.f8345z0 == rVar4.f8284B0 && rVar4.f8282A0 == rVar4.f8286C0) ? false : true;
            }
            r rVar5 = r.this;
            int i10 = rVar5.f8345z0;
            int i11 = rVar5.f8282A0;
            int i12 = rVar5.f8288D0;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                i10 = (int) (i10 + (rVar5.f8292F0 * (rVar5.f8284B0 - i10)));
            }
            int i13 = rVar5.f8290E0;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                i11 = (int) (i11 + (rVar5.f8292F0 * (rVar5.f8286C0 - i11)));
            }
            boolean z9 = this.f8374a.isWidthMeasuredTooSmall() || this.f8375b.isWidthMeasuredTooSmall();
            if (!this.f8374a.isHeightMeasuredTooSmall() && !this.f8375b.isHeightMeasuredTooSmall()) {
                z8 = false;
            }
            r.this.j(i8, i9, i10, i11, z9, z8);
        }

        public void reEvaluateState() {
            measure(r.this.f8291F, r.this.f8293G);
            r.this.b0();
        }

        public void setMeasuredId(int i8, int i9) {
            this.f8378e = i8;
            this.f8379f = i9;
        }
    }

    protected interface f {
        void addMovement(MotionEvent motionEvent);

        void clear();

        void computeCurrentVelocity(int i8);

        void computeCurrentVelocity(int i8, float f8);

        float getXVelocity();

        float getXVelocity(int i8);

        float getYVelocity();

        float getYVelocity(int i8);

        void recycle();
    }

    class h {

        /* renamed from: a */
        float f8383a = Float.NaN;

        /* renamed from: b */
        float f8384b = Float.NaN;

        /* renamed from: c */
        int f8385c = -1;

        /* renamed from: d */
        int f8386d = -1;

        /* renamed from: e */
        final String f8387e = "motion.progress";

        /* renamed from: f */
        final String f8388f = "motion.velocity";

        /* renamed from: g */
        final String f8389g = "motion.StartState";

        /* renamed from: h */
        final String f8390h = "motion.EndState";

        h() {
        }

        void a() throws NumberFormatException {
            int i8 = this.f8385c;
            if (i8 != -1 || this.f8386d != -1) {
                if (i8 == -1) {
                    r.this.transitionToState(this.f8386d);
                } else {
                    int i9 = this.f8386d;
                    if (i9 == -1) {
                        r.this.setState(i8, -1, -1);
                    } else {
                        r.this.setTransition(i8, i9);
                    }
                }
                r.this.setState(j.SETUP);
            }
            if (Float.isNaN(this.f8384b)) {
                if (Float.isNaN(this.f8383a)) {
                    return;
                }
                r.this.setProgress(this.f8383a);
            } else {
                r.this.setProgress(this.f8383a, this.f8384b);
                this.f8383a = Float.NaN;
                this.f8384b = Float.NaN;
                this.f8385c = -1;
                this.f8386d = -1;
            }
        }

        public Bundle getTransitionState() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f8383a);
            bundle.putFloat("motion.velocity", this.f8384b);
            bundle.putInt("motion.StartState", this.f8385c);
            bundle.putInt("motion.EndState", this.f8386d);
            return bundle;
        }

        public void recordState() {
            this.f8386d = r.this.f8289E;
            this.f8385c = r.this.f8285C;
            this.f8384b = r.this.getVelocity();
            this.f8383a = r.this.getProgress();
        }

        public void setEndState(int i8) {
            this.f8386d = i8;
        }

        public void setProgress(float f8) {
            this.f8383a = f8;
        }

        public void setStartState(int i8) {
            this.f8385c = i8;
        }

        public void setTransitionState(Bundle bundle) {
            this.f8383a = bundle.getFloat("motion.progress");
            this.f8384b = bundle.getFloat("motion.velocity");
            this.f8385c = bundle.getInt("motion.StartState");
            this.f8386d = bundle.getInt("motion.EndState");
        }

        public void setVelocity(float f8) {
            this.f8384b = f8;
        }
    }

    public interface i {
        void onTransitionChange(r rVar, int i8, int i9, float f8);

        void onTransitionCompleted(r rVar, int i8);

        void onTransitionStarted(r rVar, int i8, int i9);

        void onTransitionTrigger(r rVar, int i8, boolean z8, float f8);
    }

    enum j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public r(Context context) {
        super(context);
        this.f8283B = 0.0f;
        this.f8285C = -1;
        this.f8287D = -1;
        this.f8289E = -1;
        this.f8291F = 0;
        this.f8293G = 0;
        this.f8295H = true;
        this.f8297I = new HashMap();
        this.f8299J = 0L;
        this.f8301K = 1.0f;
        this.f8303L = 0.0f;
        this.f8305M = 0.0f;
        this.f8309O = 0.0f;
        this.f8312Q = false;
        this.f8313R = false;
        this.f8317V = 0;
        this.f8319a0 = false;
        this.f8320b0 = new P.g();
        this.f8321c0 = new c();
        this.f8323e0 = true;
        this.f8328j0 = false;
        this.f8333o0 = false;
        this.f8334p0 = null;
        this.f8335q0 = null;
        this.f8336r0 = null;
        this.f8337s0 = 0;
        this.f8338t0 = -1L;
        this.f8339u0 = 0.0f;
        this.f8340v0 = 0;
        this.f8341w0 = 0.0f;
        this.f8342x0 = false;
        this.f8343y0 = false;
        this.f8294G0 = new androidx.constraintlayout.motion.widget.f();
        this.f8296H0 = false;
        this.f8300J0 = j.UNDEFINED;
        this.f8302K0 = new e();
        this.f8304L0 = false;
        this.f8306M0 = new RectF();
        this.f8308N0 = null;
        this.f8310O0 = new ArrayList();
        W(null);
    }

    private void K() {
        t tVar = this.f8344z;
        if (tVar == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int iQ = tVar.q();
        t tVar2 = this.f8344z;
        L(iQ, tVar2.f(tVar2.q()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<t.b> it = this.f8344z.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            t.b next = it.next();
            t.b bVar = this.f8344z.f8411c;
            M(next);
            int startConstraintSetId = next.getStartConstraintSetId();
            int endConstraintSetId = next.getEndConstraintSetId();
            String name = androidx.constraintlayout.motion.widget.b.getName(getContext(), startConstraintSetId);
            String name2 = androidx.constraintlayout.motion.widget.b.getName(getContext(), endConstraintSetId);
            if (sparseIntArray.get(startConstraintSetId) == endConstraintSetId) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + name + "->" + name2);
            }
            if (sparseIntArray2.get(endConstraintSetId) == startConstraintSetId) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + name + "->" + name2);
            }
            sparseIntArray.put(startConstraintSetId, endConstraintSetId);
            sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
            if (this.f8344z.f(startConstraintSetId) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + name);
            }
            if (this.f8344z.f(endConstraintSetId) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + name);
            }
        }
    }

    private void L(int i8, androidx.constraintlayout.widget.d dVar) {
        String name = androidx.constraintlayout.motion.widget.b.getName(getContext(), i8);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int id = childAt.getId();
            if (id == -1) {
                Log.w("MotionLayout", "CHECK: " + name + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (dVar.getConstraint(id) == null) {
                Log.w("MotionLayout", "CHECK: " + name + " NO CONSTRAINTS for " + androidx.constraintlayout.motion.widget.b.getName(childAt));
            }
        }
        int[] knownIds = dVar.getKnownIds();
        for (int i10 = 0; i10 < knownIds.length; i10++) {
            int i11 = knownIds[i10];
            String name2 = androidx.constraintlayout.motion.widget.b.getName(getContext(), i11);
            if (findViewById(knownIds[i10]) == null) {
                Log.w("MotionLayout", "CHECK: " + name + " NO View matches id " + name2);
            }
            if (dVar.getHeight(i11) == -1) {
                Log.w("MotionLayout", "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
            if (dVar.getWidth(i11) == -1) {
                Log.w("MotionLayout", "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void M(t.b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("CHECK: transition = ");
        sb.append(bVar.debugString(getContext()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CHECK: transition.setDuration = ");
        sb2.append(bVar.getDuration());
        if (bVar.getStartConstraintSetId() == bVar.getEndConstraintSetId()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void N() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            o oVar = (o) this.f8297I.get(childAt);
            if (oVar != null) {
                oVar.v(childAt);
            }
        }
    }

    private void Q() {
        boolean z8;
        float fSignum = Math.signum(this.f8309O - this.f8305M);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f8281A;
        float interpolation = this.f8305M + (!(interpolator instanceof P.g) ? (((nanoTime - this.f8307N) * fSignum) * 1.0E-9f) / this.f8301K : 0.0f);
        if (this.f8311P) {
            interpolation = this.f8309O;
        }
        if ((fSignum <= 0.0f || interpolation < this.f8309O) && (fSignum > 0.0f || interpolation > this.f8309O)) {
            z8 = false;
        } else {
            interpolation = this.f8309O;
            z8 = true;
        }
        if (interpolator != null && !z8) {
            interpolation = this.f8319a0 ? interpolator.getInterpolation((nanoTime - this.f8299J) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f8309O) || (fSignum <= 0.0f && interpolation <= this.f8309O)) {
            interpolation = this.f8309O;
        }
        this.f8292F0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            o oVar = (o) this.f8297I.get(childAt);
            if (oVar != null) {
                oVar.r(childAt, interpolation, nanoTime2, this.f8294G0);
            }
        }
        if (this.f8343y0) {
            requestLayout();
        }
    }

    private void R() {
        ArrayList arrayList;
        if ((this.f8314S == null && ((arrayList = this.f8336r0) == null || arrayList.isEmpty())) || this.f8341w0 == this.f8303L) {
            return;
        }
        if (this.f8340v0 != -1) {
            i iVar = this.f8314S;
            if (iVar != null) {
                iVar.onTransitionStarted(this, this.f8285C, this.f8289E);
            }
            ArrayList arrayList2 = this.f8336r0;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).onTransitionStarted(this, this.f8285C, this.f8289E);
                }
            }
            this.f8342x0 = true;
        }
        this.f8340v0 = -1;
        float f8 = this.f8303L;
        this.f8341w0 = f8;
        i iVar2 = this.f8314S;
        if (iVar2 != null) {
            iVar2.onTransitionChange(this, this.f8285C, this.f8289E, f8);
        }
        ArrayList arrayList3 = this.f8336r0;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((i) it2.next()).onTransitionChange(this, this.f8285C, this.f8289E, this.f8303L);
            }
        }
        this.f8342x0 = true;
    }

    private boolean V(float f8, float f9, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                if (V(view.getLeft() + f8, view.getTop() + f9, viewGroup.getChildAt(i8), motionEvent)) {
                    return true;
                }
            }
        }
        this.f8306M0.set(view.getLeft() + f8, view.getTop() + f9, f8 + view.getRight(), f9 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (this.f8306M0.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    private void W(AttributeSet attributeSet) {
        t tVar;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z8 = true;
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == androidx.constraintlayout.widget.i.MotionLayout_layoutDescription) {
                    this.f8344z = new t(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == androidx.constraintlayout.widget.i.MotionLayout_currentState) {
                    this.f8287D = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == androidx.constraintlayout.widget.i.MotionLayout_motionProgress) {
                    this.f8309O = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f8312Q = true;
                } else if (index == androidx.constraintlayout.widget.i.MotionLayout_applyMotionScene) {
                    z8 = typedArrayObtainStyledAttributes.getBoolean(index, z8);
                } else if (index == androidx.constraintlayout.widget.i.MotionLayout_showPaths) {
                    if (this.f8317V == 0) {
                        this.f8317V = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == androidx.constraintlayout.widget.i.MotionLayout_motionDebug) {
                    this.f8317V = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f8344z == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z8) {
                this.f8344z = null;
            }
        }
        if (this.f8317V != 0) {
            K();
        }
        if (this.f8287D != -1 || (tVar = this.f8344z) == null) {
            return;
        }
        this.f8287D = tVar.q();
        this.f8285C = this.f8344z.q();
        this.f8289E = this.f8344z.h();
    }

    private void a0() {
        ArrayList arrayList;
        if (this.f8314S == null && ((arrayList = this.f8336r0) == null || arrayList.isEmpty())) {
            return;
        }
        this.f8342x0 = false;
        Iterator it = this.f8310O0.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar = this.f8314S;
            if (iVar != null) {
                iVar.onTransitionCompleted(this, num.intValue());
            }
            ArrayList arrayList2 = this.f8336r0;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).onTransitionCompleted(this, num.intValue());
                }
            }
        }
        this.f8310O0.clear();
    }

    public void b0() {
        int childCount = getChildCount();
        this.f8302K0.build();
        this.f8312Q = true;
        int width = getWidth();
        int height = getHeight();
        int iGatPathMotionArc = this.f8344z.gatPathMotionArc();
        int i8 = 0;
        if (iGatPathMotionArc != -1) {
            for (int i9 = 0; i9 < childCount; i9++) {
                o oVar = (o) this.f8297I.get(getChildAt(i9));
                if (oVar != null) {
                    oVar.setPathMotionArc(iGatPathMotionArc);
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            o oVar2 = (o) this.f8297I.get(getChildAt(i10));
            if (oVar2 != null) {
                this.f8344z.getKeyFrames(oVar2);
                oVar2.setup(width, height, this.f8301K, getNanoTime());
            }
        }
        float staggered = this.f8344z.getStaggered();
        if (staggered != 0.0f) {
            boolean z8 = ((double) staggered) < 0.0d;
            float fAbs = Math.abs(staggered);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i11 = 0; i11 < childCount; i11++) {
                o oVar3 = (o) this.f8297I.get(getChildAt(i11));
                if (!Float.isNaN(oVar3.f8261k)) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        o oVar4 = (o) this.f8297I.get(getChildAt(i12));
                        if (!Float.isNaN(oVar4.f8261k)) {
                            fMin = Math.min(fMin, oVar4.f8261k);
                            fMax = Math.max(fMax, oVar4.f8261k);
                        }
                    }
                    while (i8 < childCount) {
                        o oVar5 = (o) this.f8297I.get(getChildAt(i8));
                        if (!Float.isNaN(oVar5.f8261k)) {
                            oVar5.f8263m = 1.0f / (1.0f - fAbs);
                            if (z8) {
                                oVar5.f8262l = fAbs - (((fMax - oVar5.f8261k) / (fMax - fMin)) * fAbs);
                            } else {
                                oVar5.f8262l = fAbs - (((oVar5.f8261k - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i8++;
                    }
                    return;
                }
                float fJ = oVar3.j();
                float fK = oVar3.k();
                float f8 = z8 ? fK - fJ : fK + fJ;
                fMin2 = Math.min(fMin2, f8);
                fMax2 = Math.max(fMax2, f8);
            }
            while (i8 < childCount) {
                o oVar6 = (o) this.f8297I.get(getChildAt(i8));
                float fJ2 = oVar6.j();
                float fK2 = oVar6.k();
                float f9 = z8 ? fK2 - fJ2 : fK2 + fJ2;
                oVar6.f8263m = 1.0f / (1.0f - fAbs);
                oVar6.f8262l = fAbs - (((f9 - fMin2) * fAbs) / (fMax2 - fMin2));
                i8++;
            }
        }
    }

    private static boolean c0(float f8, float f9, float f10) {
        if (f8 > 0.0f) {
            float f11 = f8 / f10;
            return f9 + ((f8 * f11) - (((f10 * f11) * f11) / 2.0f)) > 1.0f;
        }
        float f12 = (-f8) / f10;
        return f9 + ((f8 * f12) + (((f10 * f12) * f12) / 2.0f)) < 0.0f;
    }

    void J(float f8) {
        if (this.f8344z == null) {
            return;
        }
        float f9 = this.f8305M;
        float f10 = this.f8303L;
        if (f9 != f10 && this.f8311P) {
            this.f8305M = f10;
        }
        float f11 = this.f8305M;
        if (f11 == f8) {
            return;
        }
        this.f8319a0 = false;
        this.f8309O = f8;
        this.f8301K = r0.getDuration() / 1000.0f;
        setProgress(this.f8309O);
        this.f8281A = this.f8344z.getInterpolator();
        this.f8311P = false;
        this.f8299J = getNanoTime();
        this.f8312Q = true;
        this.f8303L = f11;
        this.f8305M = f11;
        invalidate();
    }

    void O(boolean z8) {
        t tVar = this.f8344z;
        if (tVar == null) {
            return;
        }
        tVar.disableAutoTransition(z8);
    }

    void P(boolean z8) {
        float f8;
        boolean z9;
        int i8;
        float interpolation;
        boolean z10;
        if (this.f8307N == -1) {
            this.f8307N = getNanoTime();
        }
        float f9 = this.f8305M;
        if (f9 > 0.0f && f9 < 1.0f) {
            this.f8287D = -1;
        }
        boolean z11 = false;
        if (this.f8333o0 || (this.f8312Q && (z8 || this.f8309O != f9))) {
            float fSignum = Math.signum(this.f8309O - f9);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f8281A;
            if (interpolator instanceof q) {
                f8 = 0.0f;
            } else {
                f8 = (((nanoTime - this.f8307N) * fSignum) * 1.0E-9f) / this.f8301K;
                this.f8283B = f8;
            }
            float f10 = this.f8305M + f8;
            if (this.f8311P) {
                f10 = this.f8309O;
            }
            if ((fSignum <= 0.0f || f10 < this.f8309O) && (fSignum > 0.0f || f10 > this.f8309O)) {
                z9 = false;
            } else {
                f10 = this.f8309O;
                this.f8312Q = false;
                z9 = true;
            }
            this.f8305M = f10;
            this.f8303L = f10;
            this.f8307N = nanoTime;
            if (interpolator != null && !z9) {
                if (this.f8319a0) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.f8299J) * 1.0E-9f);
                    this.f8305M = interpolation;
                    this.f8307N = nanoTime;
                    Interpolator interpolator2 = this.f8281A;
                    if (interpolator2 instanceof q) {
                        float velocity = ((q) interpolator2).getVelocity();
                        this.f8283B = velocity;
                        if (Math.abs(velocity) * this.f8301K <= 1.0E-5f) {
                            this.f8312Q = false;
                        }
                        if (velocity > 0.0f && interpolation >= 1.0f) {
                            this.f8305M = 1.0f;
                            this.f8312Q = false;
                            interpolation = 1.0f;
                        }
                        if (velocity < 0.0f && interpolation <= 0.0f) {
                            this.f8305M = 0.0f;
                            this.f8312Q = false;
                            f10 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f10);
                    Interpolator interpolator3 = this.f8281A;
                    if (interpolator3 instanceof q) {
                        this.f8283B = ((q) interpolator3).getVelocity();
                    } else {
                        this.f8283B = ((interpolator3.getInterpolation(f10 + f8) - interpolation) * fSignum) / f8;
                    }
                }
                f10 = interpolation;
            }
            if (Math.abs(this.f8283B) > 1.0E-5f) {
                setState(j.MOVING);
            }
            if ((fSignum > 0.0f && f10 >= this.f8309O) || (fSignum <= 0.0f && f10 <= this.f8309O)) {
                f10 = this.f8309O;
                this.f8312Q = false;
            }
            if (f10 >= 1.0f || f10 <= 0.0f) {
                this.f8312Q = false;
                setState(j.FINISHED);
            }
            int childCount = getChildCount();
            this.f8333o0 = false;
            long nanoTime2 = getNanoTime();
            this.f8292F0 = f10;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                o oVar = (o) this.f8297I.get(childAt);
                if (oVar != null) {
                    this.f8333o0 = oVar.r(childAt, f10, nanoTime2, this.f8294G0) | this.f8333o0;
                }
            }
            boolean z12 = (fSignum > 0.0f && f10 >= this.f8309O) || (fSignum <= 0.0f && f10 <= this.f8309O);
            if (!this.f8333o0 && !this.f8312Q && z12) {
                setState(j.FINISHED);
            }
            if (this.f8343y0) {
                requestLayout();
            }
            this.f8333o0 = (!z12) | this.f8333o0;
            if (f10 <= 0.0f && (i8 = this.f8285C) != -1 && this.f8287D != i8) {
                this.f8287D = i8;
                this.f8344z.f(i8).applyCustomAttributes(this);
                setState(j.FINISHED);
                z11 = true;
            }
            if (f10 >= 1.0d) {
                int i10 = this.f8287D;
                int i11 = this.f8289E;
                if (i10 != i11) {
                    this.f8287D = i11;
                    this.f8344z.f(i11).applyCustomAttributes(this);
                    setState(j.FINISHED);
                    z11 = true;
                }
            }
            if (this.f8333o0 || this.f8312Q) {
                invalidate();
            } else if ((fSignum > 0.0f && f10 == 1.0f) || (fSignum < 0.0f && f10 == 0.0f)) {
                setState(j.FINISHED);
            }
            if ((!this.f8333o0 && this.f8312Q && fSignum > 0.0f && f10 == 1.0f) || (fSignum < 0.0f && f10 == 0.0f)) {
                Z();
            }
        }
        float f11 = this.f8305M;
        if (f11 < 1.0f) {
            if (f11 <= 0.0f) {
                int i12 = this.f8287D;
                int i13 = this.f8285C;
                z10 = i12 == i13 ? z11 : true;
                this.f8287D = i13;
            }
            this.f8304L0 |= z11;
            if (z11 && !this.f8296H0) {
                requestLayout();
            }
            this.f8303L = this.f8305M;
        }
        int i14 = this.f8287D;
        int i15 = this.f8289E;
        z10 = i14 == i15 ? z11 : true;
        this.f8287D = i15;
        z11 = z10;
        this.f8304L0 |= z11;
        if (z11) {
            requestLayout();
        }
        this.f8303L = this.f8305M;
    }

    protected void S() {
        int iIntValue;
        ArrayList arrayList;
        if ((this.f8314S != null || ((arrayList = this.f8336r0) != null && !arrayList.isEmpty())) && this.f8340v0 == -1) {
            this.f8340v0 = this.f8287D;
            if (this.f8310O0.isEmpty()) {
                iIntValue = -1;
            } else {
                iIntValue = ((Integer) this.f8310O0.get(r0.size() - 1)).intValue();
            }
            int i8 = this.f8287D;
            if (iIntValue != i8 && i8 != -1) {
                this.f8310O0.add(Integer.valueOf(i8));
            }
        }
        a0();
    }

    void T(int i8, float f8, float f9, float f10, float[] fArr) throws Resources.NotFoundException {
        String resourceName;
        HashMap map = this.f8297I;
        View viewById = getViewById(i8);
        o oVar = (o) map.get(viewById);
        if (oVar != null) {
            oVar.i(f8, f9, f10, fArr);
            float y8 = viewById.getY();
            this.f8315T = f8;
            this.f8316U = y8;
            return;
        }
        if (viewById == null) {
            resourceName = "" + i8;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(i8);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    String U(int i8) {
        t tVar = this.f8344z;
        if (tVar == null) {
            return null;
        }
        return tVar.lookUpConstraintName(i8);
    }

    int X(String str) {
        t tVar = this.f8344z;
        if (tVar == null) {
            return 0;
        }
        return tVar.lookUpConstraintId(str);
    }

    protected f Y() {
        return g.obtain();
    }

    void Z() {
        t tVar = this.f8344z;
        if (tVar == null) {
            return;
        }
        if (tVar.e(this, this.f8287D)) {
            requestLayout();
            return;
        }
        int i8 = this.f8287D;
        if (i8 != -1) {
            this.f8344z.addOnClickListeners(this, i8);
        }
        if (this.f8344z.E()) {
            this.f8344z.D();
        }
    }

    public void addTransitionListener(i iVar) {
        if (this.f8336r0 == null) {
            this.f8336r0 = new ArrayList();
        }
        this.f8336r0.add(iVar);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) throws NumberFormatException {
        P(false);
        super.dispatchDraw(canvas);
        if (this.f8344z == null) {
            return;
        }
        if ((this.f8317V & 1) == 1 && !isInEditMode()) {
            this.f8337s0++;
            long nanoTime = getNanoTime();
            long j8 = this.f8338t0;
            if (j8 != -1) {
                if (nanoTime - j8 > 200000000) {
                    this.f8339u0 = ((int) ((this.f8337s0 / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f8337s0 = 0;
                    this.f8338t0 = nanoTime;
                }
            } else {
                this.f8338t0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            String str = this.f8339u0 + " fps " + androidx.constraintlayout.motion.widget.b.getState(this, this.f8285C) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(androidx.constraintlayout.motion.widget.b.getState(this, this.f8289E));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i8 = this.f8287D;
            sb.append(i8 == -1 ? C6521b.UNDEFINED_DOMAIN : androidx.constraintlayout.motion.widget.b.getState(this, i8));
            String string = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f8317V > 1) {
            if (this.f8318W == null) {
                this.f8318W = new d();
            }
            this.f8318W.draw(canvas, this.f8297I, this.f8344z.getDuration(), this.f8317V);
        }
    }

    public void enableTransition(int i8, boolean z8) {
        t.b transition = getTransition(i8);
        if (z8) {
            transition.setEnable(true);
            return;
        }
        t tVar = this.f8344z;
        if (transition == tVar.f8411c) {
            Iterator<t.b> it = tVar.getTransitionsWithState(this.f8287D).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                t.b next = it.next();
                if (next.isEnabled()) {
                    this.f8344z.f8411c = next;
                    break;
                }
            }
        }
        transition.setEnable(false);
    }

    public void fireTrigger(int i8, boolean z8, float f8) {
        i iVar = this.f8314S;
        if (iVar != null) {
            iVar.onTransitionTrigger(this, i8, z8, f8);
        }
        ArrayList arrayList = this.f8336r0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).onTransitionTrigger(this, i8, z8, f8);
            }
        }
    }

    public androidx.constraintlayout.widget.d getConstraintSet(int i8) {
        t tVar = this.f8344z;
        if (tVar == null) {
            return null;
        }
        return tVar.f(i8);
    }

    public int[] getConstraintSetIds() {
        t tVar = this.f8344z;
        if (tVar == null) {
            return null;
        }
        return tVar.getConstraintSetIds();
    }

    public int getCurrentState() {
        return this.f8287D;
    }

    public void getDebugMode(boolean z8) {
        this.f8317V = z8 ? 2 : 1;
        invalidate();
    }

    public ArrayList<t.b> getDefinedTransitions() {
        t tVar = this.f8344z;
        if (tVar == null) {
            return null;
        }
        return tVar.getDefinedTransitions();
    }

    public androidx.constraintlayout.motion.widget.c getDesignTool() {
        if (this.f8322d0 == null) {
            this.f8322d0 = new androidx.constraintlayout.motion.widget.c(this);
        }
        return this.f8322d0;
    }

    public int getEndState() {
        return this.f8289E;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f8305M;
    }

    public int getStartState() {
        return this.f8285C;
    }

    public float getTargetPosition() {
        return this.f8309O;
    }

    public t.b getTransition(int i8) {
        return this.f8344z.getTransitionById(i8);
    }

    public Bundle getTransitionState() {
        if (this.f8298I0 == null) {
            this.f8298I0 = new h();
        }
        this.f8298I0.recordState();
        return this.f8298I0.getTransitionState();
    }

    public long getTransitionTimeMs() {
        if (this.f8344z != null) {
            this.f8301K = r0.getDuration() / 1000.0f;
        }
        return (long) (this.f8301K * 1000.0f);
    }

    public float getVelocity() {
        return this.f8283B;
    }

    public void getViewVelocity(View view, float f8, float f9, float[] fArr, int i8) {
        float interpolation;
        float velocity = this.f8283B;
        float f10 = this.f8305M;
        if (this.f8281A != null) {
            float fSignum = Math.signum(this.f8309O - f10);
            float interpolation2 = this.f8281A.getInterpolation(this.f8305M + 1.0E-5f);
            interpolation = this.f8281A.getInterpolation(this.f8305M);
            velocity = (fSignum * ((interpolation2 - interpolation) / 1.0E-5f)) / this.f8301K;
        } else {
            interpolation = f10;
        }
        Interpolator interpolator = this.f8281A;
        if (interpolator instanceof q) {
            velocity = ((q) interpolator).getVelocity();
        }
        o oVar = (o) this.f8297I.get(view);
        if ((i8 & 1) == 0) {
            oVar.o(interpolation, view.getWidth(), view.getHeight(), f8, f9, fArr);
        } else {
            oVar.i(interpolation, f8, f9, fArr);
        }
        if (i8 < 2) {
            fArr[0] = fArr[0] * velocity;
            fArr[1] = fArr[1] * velocity;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void i(int i8) {
        this.f8516k = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public boolean isInteractionEnabled() {
        return this.f8295H;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i8) {
        if (i8 == 0) {
            this.f8344z = null;
            return;
        }
        try {
            this.f8344z = new t(getContext(), this, i8);
            if (isAttachedToWindow()) {
                this.f8344z.B(this);
                this.f8302K0.c(this.f8508c, this.f8344z.f(this.f8285C), this.f8344z.f(this.f8289E));
                rebuildScene();
                this.f8344z.setRtl(g());
            }
        } catch (Exception e8) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws NumberFormatException {
        t.b bVar;
        int i8;
        super.onAttachedToWindow();
        t tVar = this.f8344z;
        if (tVar != null && (i8 = this.f8287D) != -1) {
            androidx.constraintlayout.widget.d dVarF = tVar.f(i8);
            this.f8344z.B(this);
            if (dVarF != null) {
                dVarF.applyTo(this);
            }
            this.f8285C = this.f8287D;
        }
        Z();
        h hVar = this.f8298I0;
        if (hVar != null) {
            hVar.a();
            return;
        }
        t tVar2 = this.f8344z;
        if (tVar2 == null || (bVar = tVar2.f8411c) == null || bVar.getAutoTransition() != 4) {
            return;
        }
        transitionToEnd();
        setState(j.SETUP);
        setState(j.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        t.b bVar;
        x touchResponse;
        int i8;
        RectF rectFH;
        t tVar = this.f8344z;
        if (tVar != null && this.f8295H && (bVar = tVar.f8411c) != null && bVar.isEnabled() && (touchResponse = bVar.getTouchResponse()) != null && ((motionEvent.getAction() != 0 || (rectFH = touchResponse.h(this, new RectF())) == null || rectFH.contains(motionEvent.getX(), motionEvent.getY())) && (i8 = touchResponse.i()) != -1)) {
            View view = this.f8308N0;
            if (view == null || view.getId() != i8) {
                this.f8308N0 = findViewById(i8);
            }
            if (this.f8308N0 != null) {
                this.f8306M0.set(r0.getLeft(), this.f8308N0.getTop(), this.f8308N0.getRight(), this.f8308N0.getBottom());
                if (this.f8306M0.contains(motionEvent.getX(), motionEvent.getY()) && !V(0.0f, 0.0f, this.f8308N0, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        this.f8296H0 = true;
        try {
            if (this.f8344z == null) {
                super.onLayout(z8, i8, i9, i10, i11);
                return;
            }
            int i12 = i10 - i8;
            int i13 = i11 - i9;
            if (this.f8326h0 != i12 || this.f8327i0 != i13) {
                rebuildScene();
                P(true);
            }
            this.f8326h0 = i12;
            this.f8327i0 = i13;
            this.f8324f0 = i12;
            this.f8325g0 = i13;
        } finally {
            this.f8296H0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i8, int i9) throws NumberFormatException {
        if (this.f8344z == null) {
            super.onMeasure(i8, i9);
            return;
        }
        boolean z8 = false;
        boolean z9 = (this.f8291F == i8 && this.f8293G == i9) ? false : true;
        if (this.f8304L0) {
            this.f8304L0 = false;
            Z();
            a0();
            z9 = true;
        }
        if (this.f8513h) {
            z9 = true;
        }
        this.f8291F = i8;
        this.f8293G = i9;
        int iQ = this.f8344z.q();
        int iH = this.f8344z.h();
        if ((z9 || this.f8302K0.isNotConfiguredWith(iQ, iH)) && this.f8285C != -1) {
            super.onMeasure(i8, i9);
            this.f8302K0.c(this.f8508c, this.f8344z.f(iQ), this.f8344z.f(iH));
            this.f8302K0.reEvaluateState();
            this.f8302K0.setMeasuredId(iQ, iH);
        } else {
            z8 = true;
        }
        if (this.f8343y0 || z8) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int width = this.f8508c.getWidth() + getPaddingLeft() + getPaddingRight();
            int height = this.f8508c.getHeight() + paddingTop;
            int i10 = this.f8288D0;
            if (i10 == Integer.MIN_VALUE || i10 == 0) {
                width = (int) (this.f8345z0 + (this.f8292F0 * (this.f8284B0 - r7)));
                requestLayout();
            }
            int i11 = this.f8290E0;
            if (i11 == Integer.MIN_VALUE || i11 == 0) {
                height = (int) (this.f8282A0 + (this.f8292F0 * (this.f8286C0 - r7)));
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        Q();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.T, androidx.core.view.S
    public boolean onNestedFling(View view, float f8, float f9, boolean z8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.T, androidx.core.view.S
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    @Override // androidx.core.view.T
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr, int i10) {
        t.b bVar;
        x touchResponse;
        int i11;
        t tVar = this.f8344z;
        if (tVar == null || (bVar = tVar.f8411c) == null || !bVar.isEnabled()) {
            return;
        }
        t.b bVar2 = this.f8344z.f8411c;
        if (bVar2 == null || !bVar2.isEnabled() || (touchResponse = bVar2.getTouchResponse()) == null || (i11 = touchResponse.i()) == -1 || view.getId() == i11) {
            t tVar2 = this.f8344z;
            if (tVar2 != null && tVar2.n()) {
                float f8 = this.f8303L;
                if ((f8 == 1.0f || f8 == 0.0f) && view.canScrollVertically(-1)) {
                    return;
                }
            }
            if (bVar2.getTouchResponse() != null && (this.f8344z.f8411c.getTouchResponse().getFlags() & 1) != 0) {
                float fO = this.f8344z.o(i8, i9);
                float f9 = this.f8305M;
                if ((f9 <= 0.0f && fO < 0.0f) || (f9 >= 1.0f && fO > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f10 = this.f8303L;
            long nanoTime = getNanoTime();
            float f11 = i8;
            this.f8329k0 = f11;
            float f12 = i9;
            this.f8330l0 = f12;
            this.f8332n0 = (float) ((nanoTime - this.f8331m0) * 1.0E-9d);
            this.f8331m0 = nanoTime;
            this.f8344z.x(f11, f12);
            if (f10 != this.f8303L) {
                iArr[0] = i8;
                iArr[1] = i9;
            }
            P(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f8328j0 = true;
        }
    }

    @Override // androidx.core.view.T
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12) {
    }

    @Override // androidx.core.view.T
    public void onNestedScrollAccepted(View view, View view2, int i8, int i9) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        t tVar = this.f8344z;
        if (tVar != null) {
            tVar.setRtl(g());
        }
    }

    @Override // androidx.core.view.T
    public boolean onStartNestedScroll(View view, View view2, int i8, int i9) {
        t.b bVar;
        t tVar = this.f8344z;
        return (tVar == null || (bVar = tVar.f8411c) == null || bVar.getTouchResponse() == null || (this.f8344z.f8411c.getTouchResponse().getFlags() & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.T
    public void onStopNestedScroll(View view, int i8) {
        t tVar = this.f8344z;
        if (tVar == null) {
            return;
        }
        float f8 = this.f8329k0;
        float f9 = this.f8332n0;
        tVar.y(f8 / f9, this.f8330l0 / f9);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        t tVar = this.f8344z;
        if (tVar == null || !this.f8295H || !tVar.E()) {
            return super.onTouchEvent(motionEvent);
        }
        t.b bVar = this.f8344z.f8411c;
        if (bVar != null && !bVar.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f8344z.z(motionEvent, getCurrentState(), this);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof p) {
            p pVar = (p) view;
            if (this.f8336r0 == null) {
                this.f8336r0 = new ArrayList();
            }
            this.f8336r0.add(pVar);
            if (pVar.isUsedOnShow()) {
                if (this.f8334p0 == null) {
                    this.f8334p0 = new ArrayList();
                }
                this.f8334p0.add(pVar);
            }
            if (pVar.isUseOnHide()) {
                if (this.f8335q0 == null) {
                    this.f8335q0 = new ArrayList();
                }
                this.f8335q0.add(pVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f8334p0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f8335q0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e("MotionLayout", "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.f8302K0.reEvaluateState();
        invalidate();
    }

    public boolean removeTransitionListener(i iVar) {
        ArrayList arrayList = this.f8336r0;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(iVar);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        t tVar;
        t.b bVar;
        if (this.f8343y0 || this.f8287D != -1 || (tVar = this.f8344z) == null || (bVar = tVar.f8411c) == null || bVar.getLayoutDuringTransition() != 0) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i8) {
        this.f8317V = i8;
        invalidate();
    }

    public void setInteractionEnabled(boolean z8) {
        this.f8295H = z8;
    }

    public void setInterpolatedProgress(float f8) {
        if (this.f8344z != null) {
            setState(j.MOVING);
            Interpolator interpolator = this.f8344z.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f8));
                return;
            }
        }
        setProgress(f8);
    }

    public void setOnHide(float f8) {
        ArrayList arrayList = this.f8335q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((p) this.f8335q0.get(i8)).setProgress(f8);
            }
        }
    }

    public void setOnShow(float f8) {
        ArrayList arrayList = this.f8334p0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((p) this.f8334p0.get(i8)).setProgress(f8);
            }
        }
    }

    public void setProgress(float f8, float f9) {
        if (isAttachedToWindow()) {
            setProgress(f8);
            setState(j.MOVING);
            this.f8283B = f9;
            J(1.0f);
            return;
        }
        if (this.f8298I0 == null) {
            this.f8298I0 = new h();
        }
        this.f8298I0.setProgress(f8);
        this.f8298I0.setVelocity(f9);
    }

    public void setScene(t tVar) {
        this.f8344z = tVar;
        tVar.setRtl(g());
        rebuildScene();
    }

    void setState(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar == jVar2 && this.f8287D == -1) {
            return;
        }
        j jVar3 = this.f8300J0;
        this.f8300J0 = jVar;
        j jVar4 = j.MOVING;
        if (jVar3 == jVar4 && jVar == jVar4) {
            R();
        }
        int i8 = b.f8348a[jVar3.ordinal()];
        if (i8 != 1 && i8 != 2) {
            if (i8 == 3 && jVar == jVar2) {
                S();
                return;
            }
            return;
        }
        if (jVar == jVar4) {
            R();
        }
        if (jVar == jVar2) {
            S();
        }
    }

    public void setTransition(int i8, int i9) throws NumberFormatException {
        if (!isAttachedToWindow()) {
            if (this.f8298I0 == null) {
                this.f8298I0 = new h();
            }
            this.f8298I0.setStartState(i8);
            this.f8298I0.setEndState(i9);
            return;
        }
        t tVar = this.f8344z;
        if (tVar != null) {
            this.f8285C = i8;
            this.f8289E = i9;
            tVar.C(i8, i9);
            this.f8302K0.c(this.f8508c, this.f8344z.f(i8), this.f8344z.f(i9));
            rebuildScene();
            this.f8305M = 0.0f;
            transitionToStart();
        }
    }

    public void setTransitionDuration(int i8) {
        t tVar = this.f8344z;
        if (tVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            tVar.setDuration(i8);
        }
    }

    public void setTransitionListener(i iVar) {
        this.f8314S = iVar;
    }

    public void setTransitionState(Bundle bundle) throws NumberFormatException {
        if (this.f8298I0 == null) {
            this.f8298I0 = new h();
        }
        this.f8298I0.setTransitionState(bundle);
        if (isAttachedToWindow()) {
            this.f8298I0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.b.getName(context, this.f8285C) + "->" + androidx.constraintlayout.motion.widget.b.getName(context, this.f8289E) + " (pos:" + this.f8305M + " Dpos/Dt:" + this.f8283B;
    }

    public void touchAnimateTo(int i8, float f8, float f9) {
        if (this.f8344z == null || this.f8305M == f8) {
            return;
        }
        this.f8319a0 = true;
        this.f8299J = getNanoTime();
        float duration = this.f8344z.getDuration() / 1000.0f;
        this.f8301K = duration;
        this.f8309O = f8;
        this.f8312Q = true;
        if (i8 == 0 || i8 == 1 || i8 == 2) {
            if (i8 == 1) {
                f8 = 0.0f;
            } else if (i8 == 2) {
                f8 = 1.0f;
            }
            this.f8320b0.config(this.f8305M, f8, f9, duration, this.f8344z.l(), this.f8344z.m());
            int i9 = this.f8287D;
            this.f8309O = f8;
            this.f8287D = i9;
            this.f8281A = this.f8320b0;
        } else if (i8 == 4) {
            this.f8321c0.config(f9, this.f8305M, this.f8344z.l());
            this.f8281A = this.f8321c0;
        } else if (i8 == 5) {
            if (c0(f9, this.f8305M, this.f8344z.l())) {
                this.f8321c0.config(f9, this.f8305M, this.f8344z.l());
                this.f8281A = this.f8321c0;
            } else {
                this.f8320b0.config(this.f8305M, f8, f9, this.f8301K, this.f8344z.l(), this.f8344z.m());
                this.f8283B = 0.0f;
                int i10 = this.f8287D;
                this.f8309O = f8;
                this.f8287D = i10;
                this.f8281A = this.f8320b0;
            }
        }
        this.f8311P = false;
        this.f8299J = getNanoTime();
        invalidate();
    }

    public void transitionToEnd() {
        J(1.0f);
    }

    public void transitionToStart() {
        J(0.0f);
    }

    public void transitionToState(int i8) throws NumberFormatException {
        if (isAttachedToWindow()) {
            transitionToState(i8, -1, -1);
            return;
        }
        if (this.f8298I0 == null) {
            this.f8298I0 = new h();
        }
        this.f8298I0.setEndState(i8);
    }

    public void updateState(int i8, androidx.constraintlayout.widget.d dVar) throws NumberFormatException {
        t tVar = this.f8344z;
        if (tVar != null) {
            tVar.setConstraintSet(i8, dVar);
        }
        updateState();
        if (this.f8287D == i8) {
            dVar.applyTo(this);
        }
    }

    private static class g implements f {

        /* renamed from: b */
        private static g f8381b = new g();

        /* renamed from: a */
        VelocityTracker f8382a;

        private g() {
        }

        public static g obtain() {
            f8381b.f8382a = VelocityTracker.obtain();
            return f8381b;
        }

        @Override // androidx.constraintlayout.motion.widget.r.f
        public void addMovement(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f8382a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.r.f
        public void clear() {
            VelocityTracker velocityTracker = this.f8382a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.r.f
        public void computeCurrentVelocity(int i8) {
            VelocityTracker velocityTracker = this.f8382a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i8);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.r.f
        public float getXVelocity() {
            VelocityTracker velocityTracker = this.f8382a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.r.f
        public float getYVelocity() {
            VelocityTracker velocityTracker = this.f8382a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.r.f
        public void recycle() {
            VelocityTracker velocityTracker = this.f8382a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f8382a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.r.f
        public void computeCurrentVelocity(int i8, float f8) {
            VelocityTracker velocityTracker = this.f8382a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i8, f8);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.r.f
        public float getXVelocity(int i8) {
            VelocityTracker velocityTracker = this.f8382a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i8);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.r.f
        public float getYVelocity(int i8) {
            if (this.f8382a != null) {
                return getYVelocity(i8);
            }
            return 0.0f;
        }
    }

    @Override // androidx.core.view.T
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        if (this.f8328j0 || i8 != 0 || i9 != 0) {
            iArr[0] = iArr[0] + i10;
            iArr[1] = iArr[1] + i11;
        }
        this.f8328j0 = false;
    }

    public void transitionToState(int i8, int i9, int i10) throws NumberFormatException {
        androidx.constraintlayout.widget.j jVar;
        int iConvertToConstraintSet;
        t tVar = this.f8344z;
        if (tVar != null && (jVar = tVar.f8410b) != null && (iConvertToConstraintSet = jVar.convertToConstraintSet(this.f8287D, i8, i9, i10)) != -1) {
            i8 = iConvertToConstraintSet;
        }
        int i11 = this.f8287D;
        if (i11 == i8) {
            return;
        }
        if (this.f8285C == i8) {
            J(0.0f);
            return;
        }
        if (this.f8289E == i8) {
            J(1.0f);
            return;
        }
        this.f8289E = i8;
        if (i11 != -1) {
            setTransition(i11, i8);
            J(1.0f);
            this.f8305M = 0.0f;
            transitionToEnd();
            return;
        }
        this.f8319a0 = false;
        this.f8309O = 1.0f;
        this.f8303L = 0.0f;
        this.f8305M = 0.0f;
        this.f8307N = getNanoTime();
        this.f8299J = getNanoTime();
        this.f8311P = false;
        this.f8281A = null;
        this.f8301K = this.f8344z.getDuration() / 1000.0f;
        this.f8285C = -1;
        this.f8344z.C(-1, this.f8289E);
        this.f8344z.q();
        int childCount = getChildCount();
        this.f8297I.clear();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            this.f8297I.put(childAt, new o(childAt));
        }
        this.f8312Q = true;
        this.f8302K0.c(this.f8508c, null, this.f8344z.f(i8));
        rebuildScene();
        this.f8302K0.build();
        N();
        int width = getWidth();
        int height = getHeight();
        for (int i13 = 0; i13 < childCount; i13++) {
            o oVar = (o) this.f8297I.get(getChildAt(i13));
            this.f8344z.getKeyFrames(oVar);
            oVar.setup(width, height, this.f8301K, getNanoTime());
        }
        float staggered = this.f8344z.getStaggered();
        if (staggered != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i14 = 0; i14 < childCount; i14++) {
                o oVar2 = (o) this.f8297I.get(getChildAt(i14));
                float fK = oVar2.k() + oVar2.j();
                fMin = Math.min(fMin, fK);
                fMax = Math.max(fMax, fK);
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                o oVar3 = (o) this.f8297I.get(getChildAt(i15));
                float fJ = oVar3.j();
                float fK2 = oVar3.k();
                oVar3.f8263m = 1.0f / (1.0f - staggered);
                oVar3.f8262l = staggered - ((((fJ + fK2) - fMin) * staggered) / (fMax - fMin));
            }
        }
        this.f8303L = 0.0f;
        this.f8305M = 0.0f;
        this.f8312Q = true;
        invalidate();
    }

    public void updateState() throws NumberFormatException {
        this.f8302K0.c(this.f8508c, this.f8344z.f(this.f8285C), this.f8344z.f(this.f8289E));
        rebuildScene();
    }

    public void setProgress(float f8) {
        if (f8 < 0.0f || f8 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f8298I0 == null) {
                this.f8298I0 = new h();
            }
            this.f8298I0.setProgress(f8);
            return;
        }
        if (f8 <= 0.0f) {
            this.f8287D = this.f8285C;
            if (this.f8305M == 0.0f) {
                setState(j.FINISHED);
            }
        } else if (f8 >= 1.0f) {
            this.f8287D = this.f8289E;
            if (this.f8305M == 1.0f) {
                setState(j.FINISHED);
            }
        } else {
            this.f8287D = -1;
            setState(j.MOVING);
        }
        if (this.f8344z == null) {
            return;
        }
        this.f8311P = true;
        this.f8309O = f8;
        this.f8303L = f8;
        this.f8307N = -1L;
        this.f8299J = -1L;
        this.f8281A = null;
        this.f8312Q = true;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i8, int i9, int i10) {
        setState(j.SETUP);
        this.f8287D = i8;
        this.f8285C = -1;
        this.f8289E = -1;
        androidx.constraintlayout.widget.c cVar = this.f8516k;
        if (cVar != null) {
            cVar.updateConstraints(i8, i9, i10);
            return;
        }
        t tVar = this.f8344z;
        if (tVar != null) {
            tVar.f(i8).applyTo(this);
        }
    }

    public void setTransition(int i8) throws NumberFormatException {
        float f8;
        if (this.f8344z != null) {
            t.b transition = getTransition(i8);
            this.f8285C = transition.getStartConstraintSetId();
            this.f8289E = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.f8298I0 == null) {
                    this.f8298I0 = new h();
                }
                this.f8298I0.setStartState(this.f8285C);
                this.f8298I0.setEndState(this.f8289E);
                return;
            }
            int i9 = this.f8287D;
            if (i9 == this.f8285C) {
                f8 = 0.0f;
            } else {
                f8 = i9 == this.f8289E ? 1.0f : Float.NaN;
            }
            this.f8344z.setTransition(transition);
            this.f8302K0.c(this.f8508c, this.f8344z.f(this.f8285C), this.f8344z.f(this.f8289E));
            rebuildScene();
            this.f8305M = Float.isNaN(f8) ? 0.0f : f8;
            if (Float.isNaN(f8)) {
                StringBuilder sb = new StringBuilder();
                sb.append(androidx.constraintlayout.motion.widget.b.getLocation());
                sb.append(" transitionToStart ");
                transitionToStart();
                return;
            }
            setProgress(f8);
        }
    }

    protected void setTransition(t.b bVar) throws NumberFormatException {
        this.f8344z.setTransition(bVar);
        setState(j.SETUP);
        if (this.f8287D == this.f8344z.h()) {
            this.f8305M = 1.0f;
            this.f8303L = 1.0f;
            this.f8309O = 1.0f;
        } else {
            this.f8305M = 0.0f;
            this.f8303L = 0.0f;
            this.f8309O = 0.0f;
        }
        this.f8307N = bVar.isTransitionFlag(1) ? -1L : getNanoTime();
        int iQ = this.f8344z.q();
        int iH = this.f8344z.h();
        if (iQ == this.f8285C && iH == this.f8289E) {
            return;
        }
        this.f8285C = iQ;
        this.f8289E = iH;
        this.f8344z.C(iQ, iH);
        this.f8302K0.c(this.f8508c, this.f8344z.f(this.f8285C), this.f8344z.f(this.f8289E));
        this.f8302K0.setMeasuredId(this.f8285C, this.f8289E);
        this.f8302K0.reEvaluateState();
        rebuildScene();
    }

    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8283B = 0.0f;
        this.f8285C = -1;
        this.f8287D = -1;
        this.f8289E = -1;
        this.f8291F = 0;
        this.f8293G = 0;
        this.f8295H = true;
        this.f8297I = new HashMap();
        this.f8299J = 0L;
        this.f8301K = 1.0f;
        this.f8303L = 0.0f;
        this.f8305M = 0.0f;
        this.f8309O = 0.0f;
        this.f8312Q = false;
        this.f8313R = false;
        this.f8317V = 0;
        this.f8319a0 = false;
        this.f8320b0 = new P.g();
        this.f8321c0 = new c();
        this.f8323e0 = true;
        this.f8328j0 = false;
        this.f8333o0 = false;
        this.f8334p0 = null;
        this.f8335q0 = null;
        this.f8336r0 = null;
        this.f8337s0 = 0;
        this.f8338t0 = -1L;
        this.f8339u0 = 0.0f;
        this.f8340v0 = 0;
        this.f8341w0 = 0.0f;
        this.f8342x0 = false;
        this.f8343y0 = false;
        this.f8294G0 = new androidx.constraintlayout.motion.widget.f();
        this.f8296H0 = false;
        this.f8300J0 = j.UNDEFINED;
        this.f8302K0 = new e();
        this.f8304L0 = false;
        this.f8306M0 = new RectF();
        this.f8308N0 = null;
        this.f8310O0 = new ArrayList();
        W(attributeSet);
    }

    public r(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f8283B = 0.0f;
        this.f8285C = -1;
        this.f8287D = -1;
        this.f8289E = -1;
        this.f8291F = 0;
        this.f8293G = 0;
        this.f8295H = true;
        this.f8297I = new HashMap();
        this.f8299J = 0L;
        this.f8301K = 1.0f;
        this.f8303L = 0.0f;
        this.f8305M = 0.0f;
        this.f8309O = 0.0f;
        this.f8312Q = false;
        this.f8313R = false;
        this.f8317V = 0;
        this.f8319a0 = false;
        this.f8320b0 = new P.g();
        this.f8321c0 = new c();
        this.f8323e0 = true;
        this.f8328j0 = false;
        this.f8333o0 = false;
        this.f8334p0 = null;
        this.f8335q0 = null;
        this.f8336r0 = null;
        this.f8337s0 = 0;
        this.f8338t0 = -1L;
        this.f8339u0 = 0.0f;
        this.f8340v0 = 0;
        this.f8341w0 = 0.0f;
        this.f8342x0 = false;
        this.f8343y0 = false;
        this.f8294G0 = new androidx.constraintlayout.motion.widget.f();
        this.f8296H0 = false;
        this.f8300J0 = j.UNDEFINED;
        this.f8302K0 = new e();
        this.f8304L0 = false;
        this.f8306M0 = new RectF();
        this.f8308N0 = null;
        this.f8310O0 = new ArrayList();
        W(attributeSet);
    }
}
