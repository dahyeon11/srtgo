package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.A;

/* loaded from: classes2.dex */
public class d extends LinearLayoutCompat {

    /* renamed from: p, reason: collision with root package name */
    private Drawable f24994p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f24995q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f24996r;

    /* renamed from: s, reason: collision with root package name */
    private int f24997s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f24998t;

    /* renamed from: u, reason: collision with root package name */
    boolean f24999u;

    public d(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f24994p;
        if (drawable != null) {
            if (this.f24999u) {
                this.f24999u = false;
                Rect rect = this.f24995q;
                Rect rect2 = this.f24996r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f24998t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f24997s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f8, float f9) {
        super.drawableHotspotChanged(f8, f9);
        Drawable drawable = this.f24994p;
        if (drawable != null) {
            drawable.setHotspot(f8, f9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f24994p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f24994p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f24994p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f24997s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f24994p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        this.f24999u = z8 | this.f24999u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.f24999u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f24994p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f24994p);
            }
            this.f24994p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f24997s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i8) {
        if (this.f24997s != i8) {
            if ((8388615 & i8) == 0) {
                i8 |= A.START;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            this.f24997s = i8;
            if (i8 == 119 && this.f24994p != null) {
                this.f24994p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f24994p;
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f24995q = new Rect();
        this.f24996r = new Rect();
        this.f24997s = 119;
        this.f24998t = true;
        this.f24999u = false;
        TypedArray typedArrayObtainStyledAttributes = k.obtainStyledAttributes(context, attributeSet, J2.l.ForegroundLinearLayout, i8, 0, new int[0]);
        this.f24997s = typedArrayObtainStyledAttributes.getInt(J2.l.ForegroundLinearLayout_android_foregroundGravity, this.f24997s);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(J2.l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f24998t = typedArrayObtainStyledAttributes.getBoolean(J2.l.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
