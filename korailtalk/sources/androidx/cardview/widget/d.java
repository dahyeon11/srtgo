package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f8043a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f8045c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f8046d;

    /* renamed from: e, reason: collision with root package name */
    private float f8047e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f8050h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f8051i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f8052j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8048f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8049g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f8053k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f8044b = new Paint(5);

    d(ColorStateList colorStateList, float f8) {
        this.f8043a = f8;
        c(colorStateList);
        this.f8045c = new RectF();
        this.f8046d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f8050h = colorStateList;
        this.f8044b.setColor(colorStateList.getColorForState(getState(), this.f8050h.getDefaultColor()));
    }

    private void f(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f8045c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f8046d.set(rect);
        if (this.f8048f) {
            this.f8046d.inset((int) Math.ceil(e.a(this.f8047e, this.f8043a, this.f8049g)), (int) Math.ceil(e.b(this.f8047e, this.f8043a, this.f8049g)));
            this.f8045c.set(this.f8046d);
        }
    }

    float b() {
        return this.f8047e;
    }

    void d(float f8, boolean z8, boolean z9) {
        if (f8 == this.f8047e && this.f8048f == z8 && this.f8049g == z9) {
            return;
        }
        this.f8047e = f8;
        this.f8048f = z8;
        this.f8049g = z9;
        f(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z8;
        Paint paint = this.f8044b;
        if (this.f8051i == null || paint.getColorFilter() != null) {
            z8 = false;
        } else {
            paint.setColorFilter(this.f8051i);
            z8 = true;
        }
        RectF rectF = this.f8045c;
        float f8 = this.f8043a;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        if (z8) {
            paint.setColorFilter(null);
        }
    }

    void e(float f8) {
        if (f8 == this.f8043a) {
            return;
        }
        this.f8043a = f8;
        f(null);
        invalidateSelf();
    }

    public ColorStateList getColor() {
        return this.f8050h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f8046d, this.f8043a);
    }

    public float getRadius() {
        return this.f8043a;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f8052j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f8050h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f8050h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z8 = colorForState != this.f8044b.getColor();
        if (z8) {
            this.f8044b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f8052j;
        if (colorStateList2 == null || (mode = this.f8053k) == null) {
            return z8;
        }
        this.f8051i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f8044b.setAlpha(i8);
    }

    public void setColor(ColorStateList colorStateList) {
        c(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8044b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f8052j = colorStateList;
        this.f8051i = a(colorStateList, this.f8053k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f8053k = mode;
        this.f8051i = a(this.f8052j, mode);
        invalidateSelf();
    }
}
