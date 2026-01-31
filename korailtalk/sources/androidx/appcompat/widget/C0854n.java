package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5572j;
import i.AbstractC5638a;

/* renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0854n {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f7196a;

    /* renamed from: b, reason: collision with root package name */
    private p0 f7197b;

    /* renamed from: c, reason: collision with root package name */
    private p0 f7198c;

    /* renamed from: d, reason: collision with root package name */
    private p0 f7199d;

    public C0854n(ImageView imageView) {
        this.f7196a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f7199d == null) {
            this.f7199d = new p0();
        }
        p0 p0Var = this.f7199d;
        p0Var.a();
        ColorStateList imageTintList = androidx.core.widget.e.getImageTintList(this.f7196a);
        if (imageTintList != null) {
            p0Var.mHasTintList = true;
            p0Var.mTintList = imageTintList;
        }
        PorterDuff.Mode imageTintMode = androidx.core.widget.e.getImageTintMode(this.f7196a);
        if (imageTintMode != null) {
            p0Var.mHasTintMode = true;
            p0Var.mTintMode = imageTintMode;
        }
        if (!p0Var.mHasTintList && !p0Var.mHasTintMode) {
            return false;
        }
        C0850j.d(drawable, p0Var, this.f7196a.getDrawableState());
        return true;
    }

    private boolean h() {
        return this.f7197b != null;
    }

    void b() {
        Drawable drawable = this.f7196a.getDrawable();
        if (drawable != null) {
            W.a(drawable);
        }
        if (drawable != null) {
            if (h() && a(drawable)) {
                return;
            }
            p0 p0Var = this.f7198c;
            if (p0Var != null) {
                C0850j.d(drawable, p0Var, this.f7196a.getDrawableState());
                return;
            }
            p0 p0Var2 = this.f7197b;
            if (p0Var2 != null) {
                C0850j.d(drawable, p0Var2, this.f7196a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        p0 p0Var = this.f7198c;
        if (p0Var != null) {
            return p0Var.mTintList;
        }
        return null;
    }

    PorterDuff.Mode d() {
        p0 p0Var = this.f7198c;
        if (p0Var != null) {
            return p0Var.mTintMode;
        }
        return null;
    }

    boolean e() {
        return !(this.f7196a.getBackground() instanceof RippleDrawable);
    }

    void f(ColorStateList colorStateList) {
        if (this.f7198c == null) {
            this.f7198c = new p0();
        }
        p0 p0Var = this.f7198c;
        p0Var.mTintList = colorStateList;
        p0Var.mHasTintList = true;
        b();
    }

    void g(PorterDuff.Mode mode) {
        if (this.f7198c == null) {
            this.f7198c = new p0();
        }
        p0 p0Var = this.f7198c;
        p0Var.mTintMode = mode;
        p0Var.mHasTintMode = true;
        b();
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i8) {
        int resourceId;
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(this.f7196a.getContext(), attributeSet, AbstractC5572j.AppCompatImageView, i8, 0);
        ImageView imageView = this.f7196a;
        AbstractC0985p0.saveAttributeDataForStyleable(imageView, imageView.getContext(), AbstractC5572j.AppCompatImageView, attributeSet, r0VarObtainStyledAttributes.getWrappedTypeArray(), i8, 0);
        try {
            Drawable drawable = this.f7196a.getDrawable();
            if (drawable == null && (resourceId = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = AbstractC5638a.getDrawable(this.f7196a.getContext(), resourceId)) != null) {
                this.f7196a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                W.a(drawable);
            }
            if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatImageView_tint)) {
                androidx.core.widget.e.setImageTintList(this.f7196a, r0VarObtainStyledAttributes.getColorStateList(AbstractC5572j.AppCompatImageView_tint));
            }
            if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatImageView_tintMode)) {
                androidx.core.widget.e.setImageTintMode(this.f7196a, W.parseTintMode(r0VarObtainStyledAttributes.getInt(AbstractC5572j.AppCompatImageView_tintMode, -1), null));
            }
            r0VarObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            r0VarObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setImageResource(int i8) {
        if (i8 != 0) {
            Drawable drawable = AbstractC5638a.getDrawable(this.f7196a.getContext(), i8);
            if (drawable != null) {
                W.a(drawable);
            }
            this.f7196a.setImageDrawable(drawable);
        } else {
            this.f7196a.setImageDrawable(null);
        }
        b();
    }
}
