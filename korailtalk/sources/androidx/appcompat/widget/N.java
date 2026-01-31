package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.core.view.InterfaceC0973l0;

/* loaded from: classes.dex */
public class N extends ToggleButton implements InterfaceC0973l0 {

    /* renamed from: a, reason: collision with root package name */
    private final C0845e f6852a;

    /* renamed from: b, reason: collision with root package name */
    private final I f6853b;

    public N(Context context) {
        this(context, null);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f6852a;
        if (c0845e != null) {
            c0845e.b();
        }
        I i8 = this.f6853b;
        if (i8 != null) {
            i8.b();
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f6852a;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f6852a;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f6852a;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f6852a;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f6852a;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f6852a;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    public N(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public N(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        n0.checkAppCompatTheme(this, getContext());
        C0845e c0845e = new C0845e(this);
        this.f6852a = c0845e;
        c0845e.e(attributeSet, i8);
        I i9 = new I(this);
        this.f6853b = i9;
        i9.m(attributeSet, i8);
    }
}
