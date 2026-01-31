package com.google.android.material.timepicker;

import J2.k;
import J2.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.AbstractC0985p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    private ValueAnimator f25402a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25403b;

    /* renamed from: c, reason: collision with root package name */
    private float f25404c;

    /* renamed from: d, reason: collision with root package name */
    private float f25405d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25406e;

    /* renamed from: f, reason: collision with root package name */
    private int f25407f;

    /* renamed from: g, reason: collision with root package name */
    private final List f25408g;

    /* renamed from: h, reason: collision with root package name */
    private final int f25409h;

    /* renamed from: i, reason: collision with root package name */
    private final float f25410i;

    /* renamed from: j, reason: collision with root package name */
    private final Paint f25411j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f25412k;

    /* renamed from: l, reason: collision with root package name */
    private final int f25413l;

    /* renamed from: m, reason: collision with root package name */
    private float f25414m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f25415n;

    /* renamed from: o, reason: collision with root package name */
    private double f25416o;

    /* renamed from: p, reason: collision with root package name */
    private int f25417p;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
    }

    public interface d {
        void onRotate(float f8, boolean z8);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.f25417p * ((float) Math.cos(this.f25416o))) + width;
        float f8 = height;
        float fSin = (this.f25417p * ((float) Math.sin(this.f25416o))) + f8;
        this.f25411j.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f25409h, this.f25411j);
        double dSin = Math.sin(this.f25416o);
        double dCos = Math.cos(this.f25416o);
        this.f25411j.setStrokeWidth(this.f25413l);
        canvas.drawLine(width, f8, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f25411j);
        canvas.drawCircle(width, f8, this.f25410i, this.f25411j);
    }

    private int c(float f8, float f9) {
        int degrees = (int) Math.toDegrees(Math.atan2(f9 - (getHeight() / 2), f8 - (getWidth() / 2)));
        int i8 = degrees + 90;
        return i8 < 0 ? degrees + 450 : i8;
    }

    private Pair d(float f8) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f8) > 180.0f) {
            if (handRotation > 180.0f && f8 < 180.0f) {
                f8 += 360.0f;
            }
            if (handRotation < 180.0f && f8 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair(Float.valueOf(handRotation), Float.valueOf(f8));
    }

    private boolean e(float f8, float f9, boolean z8, boolean z9, boolean z10) {
        float fC = c(f8, f9);
        boolean z11 = false;
        boolean z12 = getHandRotation() != fC;
        if (z9 && z12) {
            return true;
        }
        if (!z12 && !z8) {
            return false;
        }
        if (z10 && this.f25403b) {
            z11 = true;
        }
        setHandRotation(fC, z11);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(float f8, boolean z8) {
        float f9 = f8 % 360.0f;
        this.f25414m = f9;
        this.f25416o = Math.toRadians(f9 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.f25417p * ((float) Math.cos(this.f25416o)));
        float fSin = height + (this.f25417p * ((float) Math.sin(this.f25416o)));
        RectF rectF = this.f25412k;
        int i8 = this.f25409h;
        rectF.set(width - i8, fSin - i8, width + i8, fSin + i8);
        Iterator it = this.f25408g.iterator();
        while (it.hasNext()) {
            ((d) it.next()).onRotate(f9, z8);
        }
        invalidate();
    }

    public void addOnRotateListener(d dVar) {
        this.f25408g.add(dVar);
    }

    public RectF getCurrentSelectorBox() {
        return this.f25412k;
    }

    public float getHandRotation() {
        return this.f25414m;
    }

    public int getSelectorRadius() {
        return this.f25409h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z9;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x8 = motionEvent.getX();
        float y8 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f25404c = x8;
            this.f25405d = y8;
            this.f25406e = true;
            this.f25415n = false;
            z8 = true;
            z9 = false;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i8 = (int) (x8 - this.f25404c);
            int i9 = (int) (y8 - this.f25405d);
            this.f25406e = (i8 * i8) + (i9 * i9) > this.f25407f;
            z9 = this.f25415n;
            z10 = actionMasked == 1;
            z8 = false;
        } else {
            z9 = false;
            z8 = false;
            z10 = false;
        }
        this.f25415n |= e(x8, y8, z9, z8, z10);
        return true;
    }

    public void setAnimateOnTouchUp(boolean z8) {
        this.f25403b = z8;
    }

    public void setCircleRadius(int i8) {
        this.f25417p = i8;
        invalidate();
    }

    public void setHandRotation(float f8) {
        setHandRotation(f8, false);
    }

    public void setOnActionUpListener(c cVar) {
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.materialClockStyle);
    }

    public void setHandRotation(float f8, boolean z8) {
        ValueAnimator valueAnimator = this.f25402a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z8) {
            f(f8, false);
            return;
        }
        Pair pairD = d(f8);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pairD.first).floatValue(), ((Float) pairD.second).floatValue());
        this.f25402a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f25402a.addUpdateListener(new a());
        this.f25402a.addListener(new b());
        this.f25402a.start();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f25408g = new ArrayList();
        Paint paint = new Paint();
        this.f25411j = paint;
        this.f25412k = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ClockHandView, i8, k.Widget_MaterialComponents_TimePicker_Clock);
        this.f25417p = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.ClockHandView_materialCircleRadius, 0);
        this.f25409h = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.ClockHandView_selectorSize, 0);
        this.f25413l = getResources().getDimensionPixelSize(J2.d.material_clock_hand_stroke_width);
        this.f25410i = r6.getDimensionPixelSize(J2.d.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(l.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.f25407f = ViewConfiguration.get(context).getScaledTouchSlop();
        AbstractC0985p0.setImportantForAccessibility(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
