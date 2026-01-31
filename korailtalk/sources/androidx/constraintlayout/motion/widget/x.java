package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.r;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class x {

    /* renamed from: v */
    private static final float[][] f8478v = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: w */
    private static final float[][] f8479w = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: m */
    private float f8492m;

    /* renamed from: n */
    private float f8493n;

    /* renamed from: o */
    private final r f8494o;

    /* renamed from: a */
    private int f8480a = 0;

    /* renamed from: b */
    private int f8481b = 0;

    /* renamed from: c */
    private int f8482c = 0;

    /* renamed from: d */
    private int f8483d = -1;

    /* renamed from: e */
    private int f8484e = -1;

    /* renamed from: f */
    private int f8485f = -1;

    /* renamed from: g */
    private float f8486g = 0.5f;

    /* renamed from: h */
    private float f8487h = 0.5f;

    /* renamed from: i */
    private float f8488i = 0.0f;

    /* renamed from: j */
    private float f8489j = 1.0f;

    /* renamed from: k */
    private boolean f8490k = false;

    /* renamed from: l */
    private float[] f8491l = new float[2];

    /* renamed from: p */
    private float f8495p = 4.0f;

    /* renamed from: q */
    private float f8496q = 1.2f;

    /* renamed from: r */
    private boolean f8497r = true;

    /* renamed from: s */
    private float f8498s = 1.0f;

    /* renamed from: t */
    private int f8499t = 0;

    /* renamed from: u */
    private float f8500u = 10.0f;

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    class b implements NestedScrollView.d {
        b() {
        }

        @Override // androidx.core.widget.NestedScrollView.d
        public void onScrollChange(NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11) {
        }
    }

    x(Context context, r rVar, XmlPullParser xmlPullParser) {
        this.f8494o = rVar;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = typedArray.getIndex(i8);
            if (index == androidx.constraintlayout.widget.i.OnSwipe_touchAnchorId) {
                this.f8483d = typedArray.getResourceId(index, this.f8483d);
            } else if (index == androidx.constraintlayout.widget.i.OnSwipe_touchAnchorSide) {
                int i9 = typedArray.getInt(index, this.f8480a);
                this.f8480a = i9;
                float[] fArr = f8478v[i9];
                this.f8487h = fArr[0];
                this.f8486g = fArr[1];
            } else if (index == androidx.constraintlayout.widget.i.OnSwipe_dragDirection) {
                int i10 = typedArray.getInt(index, this.f8481b);
                this.f8481b = i10;
                float[] fArr2 = f8479w[i10];
                this.f8488i = fArr2[0];
                this.f8489j = fArr2[1];
            } else if (index == androidx.constraintlayout.widget.i.OnSwipe_maxVelocity) {
                this.f8495p = typedArray.getFloat(index, this.f8495p);
            } else if (index == androidx.constraintlayout.widget.i.OnSwipe_maxAcceleration) {
                this.f8496q = typedArray.getFloat(index, this.f8496q);
            } else if (index == androidx.constraintlayout.widget.i.OnSwipe_moveWhenScrollAtTop) {
                this.f8497r = typedArray.getBoolean(index, this.f8497r);
            } else if (index == androidx.constraintlayout.widget.i.OnSwipe_dragScale) {
                this.f8498s = typedArray.getFloat(index, this.f8498s);
            } else if (index == androidx.constraintlayout.widget.i.OnSwipe_dragThreshold) {
                this.f8500u = typedArray.getFloat(index, this.f8500u);
            } else if (index == androidx.constraintlayout.widget.i.OnSwipe_touchRegionId) {
                this.f8484e = typedArray.getResourceId(index, this.f8484e);
            } else if (index == androidx.constraintlayout.widget.i.OnSwipe_onTouchUp) {
                this.f8482c = typedArray.getInt(index, this.f8482c);
            } else if (index == androidx.constraintlayout.widget.i.OnSwipe_nestedScrollFlags) {
                this.f8499t = typedArray.getInteger(index, 0);
            } else if (index == androidx.constraintlayout.widget.i.OnSwipe_limitBoundsTo) {
                this.f8485f = typedArray.getResourceId(index, 0);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.OnSwipe);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    float a(float f8, float f9) {
        return (f8 * this.f8488i) + (f9 * this.f8489j);
    }

    RectF d(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i8 = this.f8485f;
        if (i8 == -1 || (viewFindViewById = viewGroup.findViewById(i8)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    float e() {
        return this.f8496q;
    }

    boolean f() {
        return this.f8497r;
    }

    float g(float f8, float f9) throws Resources.NotFoundException {
        this.f8494o.T(this.f8483d, this.f8494o.getProgress(), this.f8487h, this.f8486g, this.f8491l);
        float f10 = this.f8488i;
        if (f10 != 0.0f) {
            float[] fArr = this.f8491l;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f8 * f10) / fArr[0];
        }
        float[] fArr2 = this.f8491l;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f9 * this.f8489j) / fArr2[1];
    }

    public int getAnchorId() {
        return this.f8483d;
    }

    public int getFlags() {
        return this.f8499t;
    }

    public float getMaxVelocity() {
        return this.f8495p;
    }

    RectF h(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i8 = this.f8484e;
        if (i8 == -1 || (viewFindViewById = viewGroup.findViewById(i8)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    int i() {
        return this.f8484e;
    }

    void j(MotionEvent motionEvent, r.f fVar, int i8, t tVar) throws Resources.NotFoundException {
        int i9;
        fVar.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f8492m = motionEvent.getRawX();
            this.f8493n = motionEvent.getRawY();
            this.f8490k = false;
            return;
        }
        if (action == 1) {
            this.f8490k = false;
            fVar.computeCurrentVelocity(1000);
            float xVelocity = fVar.getXVelocity();
            float yVelocity = fVar.getYVelocity();
            float progress = this.f8494o.getProgress();
            int i10 = this.f8483d;
            if (i10 != -1) {
                this.f8494o.T(i10, progress, this.f8487h, this.f8486g, this.f8491l);
            } else {
                float fMin = Math.min(this.f8494o.getWidth(), this.f8494o.getHeight());
                float[] fArr = this.f8491l;
                fArr[1] = this.f8489j * fMin;
                fArr[0] = fMin * this.f8488i;
            }
            float f8 = this.f8488i;
            float[] fArr2 = this.f8491l;
            float f9 = f8 != 0.0f ? xVelocity / fArr2[0] : yVelocity / fArr2[1];
            float f10 = !Float.isNaN(f9) ? (f9 / 3.0f) + progress : progress;
            if (f10 == 0.0f || f10 == 1.0f || (i9 = this.f8482c) == 3) {
                if (0.0f >= f10 || 1.0f <= f10) {
                    this.f8494o.setState(r.j.FINISHED);
                    return;
                }
                return;
            }
            this.f8494o.touchAnimateTo(i9, ((double) f10) < 0.5d ? 0.0f : 1.0f, f9);
            if (0.0f >= progress || 1.0f <= progress) {
                this.f8494o.setState(r.j.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f8493n;
        float rawX = motionEvent.getRawX() - this.f8492m;
        if (Math.abs((this.f8488i * rawX) + (this.f8489j * rawY)) > this.f8500u || this.f8490k) {
            float progress2 = this.f8494o.getProgress();
            if (!this.f8490k) {
                this.f8490k = true;
                this.f8494o.setProgress(progress2);
            }
            int i11 = this.f8483d;
            if (i11 != -1) {
                this.f8494o.T(i11, progress2, this.f8487h, this.f8486g, this.f8491l);
            } else {
                float fMin2 = Math.min(this.f8494o.getWidth(), this.f8494o.getHeight());
                float[] fArr3 = this.f8491l;
                fArr3[1] = this.f8489j * fMin2;
                fArr3[0] = fMin2 * this.f8488i;
            }
            float f11 = this.f8488i;
            float[] fArr4 = this.f8491l;
            if (Math.abs(((f11 * fArr4[0]) + (this.f8489j * fArr4[1])) * this.f8498s) < 0.01d) {
                float[] fArr5 = this.f8491l;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            float fMax = Math.max(Math.min(progress2 + (this.f8488i != 0.0f ? rawX / this.f8491l[0] : rawY / this.f8491l[1]), 1.0f), 0.0f);
            if (fMax != this.f8494o.getProgress()) {
                this.f8494o.setProgress(fMax);
                fVar.computeCurrentVelocity(1000);
                this.f8494o.f8283B = this.f8488i != 0.0f ? fVar.getXVelocity() / this.f8491l[0] : fVar.getYVelocity() / this.f8491l[1];
            } else {
                this.f8494o.f8283B = 0.0f;
            }
            this.f8492m = motionEvent.getRawX();
            this.f8493n = motionEvent.getRawY();
        }
    }

    void k(float f8, float f9) throws Resources.NotFoundException {
        float progress = this.f8494o.getProgress();
        if (!this.f8490k) {
            this.f8490k = true;
            this.f8494o.setProgress(progress);
        }
        this.f8494o.T(this.f8483d, progress, this.f8487h, this.f8486g, this.f8491l);
        float f10 = this.f8488i;
        float[] fArr = this.f8491l;
        if (Math.abs((f10 * fArr[0]) + (this.f8489j * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f8491l;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f11 = this.f8488i;
        float fMax = Math.max(Math.min(progress + (f11 != 0.0f ? (f8 * f11) / this.f8491l[0] : (f9 * this.f8489j) / this.f8491l[1]), 1.0f), 0.0f);
        if (fMax != this.f8494o.getProgress()) {
            this.f8494o.setProgress(fMax);
        }
    }

    void l(float f8, float f9) throws Resources.NotFoundException {
        this.f8490k = false;
        float progress = this.f8494o.getProgress();
        this.f8494o.T(this.f8483d, progress, this.f8487h, this.f8486g, this.f8491l);
        float f10 = this.f8488i;
        float[] fArr = this.f8491l;
        float f11 = f10 != 0.0f ? (f8 * f10) / fArr[0] : (f9 * this.f8489j) / fArr[1];
        if (!Float.isNaN(f11)) {
            progress += f11 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z8 = progress != 1.0f;
            int i8 = this.f8482c;
            if ((i8 != 3) && z8) {
                this.f8494o.touchAnimateTo(i8, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f11);
            }
        }
    }

    void m(float f8, float f9) {
        this.f8492m = f8;
        this.f8493n = f9;
    }

    void n(float f8, float f9) {
        this.f8492m = f8;
        this.f8493n = f9;
        this.f8490k = false;
    }

    void o() {
        View viewFindViewById;
        int i8 = this.f8483d;
        if (i8 != -1) {
            viewFindViewById = this.f8494o.findViewById(i8);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + androidx.constraintlayout.motion.widget.b.getName(this.f8494o.getContext(), this.f8483d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }

    public void setAnchorId(int i8) {
        this.f8483d = i8;
    }

    public void setMaxAcceleration(float f8) {
        this.f8496q = f8;
    }

    public void setMaxVelocity(float f8) {
        this.f8495p = f8;
    }

    public void setRTL(boolean z8) {
        if (z8) {
            float[][] fArr = f8479w;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f8478v;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f8479w;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f8478v;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f8478v[this.f8480a];
        this.f8487h = fArr5[0];
        this.f8486g = fArr5[1];
        float[] fArr6 = f8479w[this.f8481b];
        this.f8488i = fArr6[0];
        this.f8489j = fArr6[1];
    }

    public void setTouchAnchorLocation(float f8, float f9) {
        this.f8487h = f8;
        this.f8486g = f9;
    }

    public String toString() {
        return this.f8488i + " , " + this.f8489j;
    }
}
