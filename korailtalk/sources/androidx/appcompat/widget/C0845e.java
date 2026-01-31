package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5572j;

/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
class C0845e {

    /* renamed from: a */
    private final View f7098a;

    /* renamed from: d */
    private p0 f7101d;

    /* renamed from: e */
    private p0 f7102e;

    /* renamed from: f */
    private p0 f7103f;

    /* renamed from: c */
    private int f7100c = -1;

    /* renamed from: b */
    private final C0850j f7099b = C0850j.get();

    C0845e(View view) {
        this.f7098a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f7103f == null) {
            this.f7103f = new p0();
        }
        p0 p0Var = this.f7103f;
        p0Var.a();
        ColorStateList backgroundTintList = AbstractC0985p0.getBackgroundTintList(this.f7098a);
        if (backgroundTintList != null) {
            p0Var.mHasTintList = true;
            p0Var.mTintList = backgroundTintList;
        }
        PorterDuff.Mode backgroundTintMode = AbstractC0985p0.getBackgroundTintMode(this.f7098a);
        if (backgroundTintMode != null) {
            p0Var.mHasTintMode = true;
            p0Var.mTintMode = backgroundTintMode;
        }
        if (!p0Var.mHasTintList && !p0Var.mHasTintMode) {
            return false;
        }
        C0850j.d(drawable, p0Var, this.f7098a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f7101d != null;
    }

    void b() {
        Drawable background = this.f7098a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            p0 p0Var = this.f7102e;
            if (p0Var != null) {
                C0850j.d(background, p0Var, this.f7098a.getDrawableState());
                return;
            }
            p0 p0Var2 = this.f7101d;
            if (p0Var2 != null) {
                C0850j.d(background, p0Var2, this.f7098a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        p0 p0Var = this.f7102e;
        if (p0Var != null) {
            return p0Var.mTintList;
        }
        return null;
    }

    PorterDuff.Mode d() {
        p0 p0Var = this.f7102e;
        if (p0Var != null) {
            return p0Var.mTintMode;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i8) {
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(this.f7098a.getContext(), attributeSet, AbstractC5572j.ViewBackgroundHelper, i8, 0);
        View view = this.f7098a;
        AbstractC0985p0.saveAttributeDataForStyleable(view, view.getContext(), AbstractC5572j.ViewBackgroundHelper, attributeSet, r0VarObtainStyledAttributes.getWrappedTypeArray(), i8, 0);
        try {
            if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.ViewBackgroundHelper_android_background)) {
                this.f7100c = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListC = this.f7099b.c(this.f7098a.getContext(), this.f7100c);
                if (colorStateListC != null) {
                    h(colorStateListC);
                }
            }
            if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.ViewBackgroundHelper_backgroundTint)) {
                AbstractC0985p0.setBackgroundTintList(this.f7098a, r0VarObtainStyledAttributes.getColorStateList(AbstractC5572j.ViewBackgroundHelper_backgroundTint));
            }
            if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.ViewBackgroundHelper_backgroundTintMode)) {
                AbstractC0985p0.setBackgroundTintMode(this.f7098a, W.parseTintMode(r0VarObtainStyledAttributes.getInt(AbstractC5572j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            r0VarObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            r0VarObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.f7100c = -1;
        h(null);
        b();
    }

    void g(int i8) {
        this.f7100c = i8;
        C0850j c0850j = this.f7099b;
        h(c0850j != null ? c0850j.c(this.f7098a.getContext(), i8) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f7101d == null) {
                this.f7101d = new p0();
            }
            p0 p0Var = this.f7101d;
            p0Var.mTintList = colorStateList;
            p0Var.mHasTintList = true;
        } else {
            this.f7101d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f7102e == null) {
            this.f7102e = new p0();
        }
        p0 p0Var = this.f7102e;
        p0Var.mTintList = colorStateList;
        p0Var.mHasTintList = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f7102e == null) {
            this.f7102e = new p0();
        }
        p0 p0Var = this.f7102e;
        p0Var.mTintMode = mode;
        p0Var.mHasTintMode = true;
        b();
    }
}
