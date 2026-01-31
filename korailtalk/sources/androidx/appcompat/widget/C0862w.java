package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5572j;

/* renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0862w extends C0857q {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f7268d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f7269e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f7270f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f7271g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7272h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7273i;

    C0862w(SeekBar seekBar) {
        super(seekBar);
        this.f7270f = null;
        this.f7271g = null;
        this.f7272h = false;
        this.f7273i = false;
        this.f7268d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f7269e;
        if (drawable != null) {
            if (this.f7272h || this.f7273i) {
                Drawable drawableWrap = androidx.core.graphics.drawable.a.wrap(drawable.mutate());
                this.f7269e = drawableWrap;
                if (this.f7272h) {
                    androidx.core.graphics.drawable.a.setTintList(drawableWrap, this.f7270f);
                }
                if (this.f7273i) {
                    androidx.core.graphics.drawable.a.setTintMode(this.f7269e, this.f7271g);
                }
                if (this.f7269e.isStateful()) {
                    this.f7269e.setState(this.f7268d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C0857q
    void c(AttributeSet attributeSet, int i8) {
        super.c(attributeSet, i8);
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(this.f7268d.getContext(), attributeSet, AbstractC5572j.AppCompatSeekBar, i8, 0);
        SeekBar seekBar = this.f7268d;
        AbstractC0985p0.saveAttributeDataForStyleable(seekBar, seekBar.getContext(), AbstractC5572j.AppCompatSeekBar, attributeSet, r0VarObtainStyledAttributes.getWrappedTypeArray(), i8, 0);
        Drawable drawableIfKnown = r0VarObtainStyledAttributes.getDrawableIfKnown(AbstractC5572j.AppCompatSeekBar_android_thumb);
        if (drawableIfKnown != null) {
            this.f7268d.setThumb(drawableIfKnown);
        }
        j(r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.AppCompatSeekBar_tickMark));
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f7271g = W.parseTintMode(r0VarObtainStyledAttributes.getInt(AbstractC5572j.AppCompatSeekBar_tickMarkTintMode, -1), this.f7271g);
            this.f7273i = true;
        }
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatSeekBar_tickMarkTint)) {
            this.f7270f = r0VarObtainStyledAttributes.getColorStateList(AbstractC5572j.AppCompatSeekBar_tickMarkTint);
            this.f7272h = true;
        }
        r0VarObtainStyledAttributes.recycle();
        f();
    }

    void g(Canvas canvas) {
        if (this.f7269e != null) {
            int max = this.f7268d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f7269e.getIntrinsicWidth();
                int intrinsicHeight = this.f7269e.getIntrinsicHeight();
                int i8 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i9 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f7269e.setBounds(-i8, -i9, i8, i9);
                float width = ((this.f7268d.getWidth() - this.f7268d.getPaddingLeft()) - this.f7268d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f7268d.getPaddingLeft(), this.f7268d.getHeight() / 2);
                for (int i10 = 0; i10 <= max; i10++) {
                    this.f7269e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f7269e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f7268d.getDrawableState())) {
            this.f7268d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f7269e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f7269e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f7269e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f7268d);
            androidx.core.graphics.drawable.a.setLayoutDirection(drawable, AbstractC0985p0.getLayoutDirection(this.f7268d));
            if (drawable.isStateful()) {
                drawable.setState(this.f7268d.getDrawableState());
            }
            f();
        }
        this.f7268d.invalidate();
    }
}
