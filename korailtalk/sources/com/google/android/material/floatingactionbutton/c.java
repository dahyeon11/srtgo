package com.google.android.material.floatingactionbutton;

import a3.k;
import a3.l;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
class c extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    private final Paint f24839b;

    /* renamed from: h, reason: collision with root package name */
    float f24845h;

    /* renamed from: i, reason: collision with root package name */
    private int f24846i;

    /* renamed from: j, reason: collision with root package name */
    private int f24847j;

    /* renamed from: k, reason: collision with root package name */
    private int f24848k;

    /* renamed from: l, reason: collision with root package name */
    private int f24849l;

    /* renamed from: m, reason: collision with root package name */
    private int f24850m;

    /* renamed from: o, reason: collision with root package name */
    private k f24852o;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f24853p;

    /* renamed from: a, reason: collision with root package name */
    private final l f24838a = l.getInstance();

    /* renamed from: c, reason: collision with root package name */
    private final Path f24840c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final Rect f24841d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final RectF f24842e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    private final RectF f24843f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final b f24844g = new b();

    /* renamed from: n, reason: collision with root package name */
    private boolean f24851n = true;

    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return c.this;
        }
    }

    c(k kVar) {
        this.f24852o = kVar;
        Paint paint = new Paint(1);
        this.f24839b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        copyBounds(this.f24841d);
        float fHeight = this.f24845h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{androidx.core.graphics.a.compositeColors(this.f24846i, this.f24850m), androidx.core.graphics.a.compositeColors(this.f24847j, this.f24850m), androidx.core.graphics.a.compositeColors(androidx.core.graphics.a.setAlphaComponent(this.f24847j, 0), this.f24850m), androidx.core.graphics.a.compositeColors(androidx.core.graphics.a.setAlphaComponent(this.f24849l, 0), this.f24850m), androidx.core.graphics.a.compositeColors(this.f24849l, this.f24850m), androidx.core.graphics.a.compositeColors(this.f24848k, this.f24850m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    protected RectF b() {
        this.f24843f.set(getBounds());
        return this.f24843f;
    }

    void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f24850m = colorStateList.getColorForState(getState(), this.f24850m);
        }
        this.f24853p = colorStateList;
        this.f24851n = true;
        invalidateSelf();
    }

    void d(int i8, int i9, int i10, int i11) {
        this.f24846i = i8;
        this.f24847j = i9;
        this.f24848k = i10;
        this.f24849l = i11;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f24851n) {
            this.f24839b.setShader(a());
            this.f24851n = false;
        }
        float strokeWidth = this.f24839b.getStrokeWidth() / 2.0f;
        copyBounds(this.f24841d);
        this.f24842e.set(this.f24841d);
        float fMin = Math.min(this.f24852o.getTopLeftCornerSize().getCornerSize(b()), this.f24842e.width() / 2.0f);
        if (this.f24852o.isRoundRect(b())) {
            this.f24842e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f24842e, fMin, fMin, this.f24839b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f24844g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f24845h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f24852o.isRoundRect(b())) {
            outline.setRoundRect(getBounds(), this.f24852o.getTopLeftCornerSize().getCornerSize(b()));
            return;
        }
        copyBounds(this.f24841d);
        this.f24842e.set(this.f24841d);
        this.f24838a.calculatePath(this.f24852o, 1.0f, this.f24842e, this.f24840c);
        if (this.f24840c.isConvex()) {
            outline.setConvexPath(this.f24840c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f24852o.isRoundRect(b())) {
            return true;
        }
        int iRound = Math.round(this.f24845h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    public k getShapeAppearanceModel() {
        return this.f24852o;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f24853p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f24851n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f24853p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f24850m)) != this.f24850m) {
            this.f24851n = true;
            this.f24850m = colorForState;
        }
        if (this.f24851n) {
            invalidateSelf();
        }
        return this.f24851n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f24839b.setAlpha(i8);
        invalidateSelf();
    }

    public void setBorderWidth(float f8) {
        if (this.f24845h != f8) {
            this.f24845h = f8;
            this.f24839b.setStrokeWidth(f8 * 1.3333f);
            this.f24851n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24839b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f24852o = kVar;
        invalidateSelf();
    }
}
