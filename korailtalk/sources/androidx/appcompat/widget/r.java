package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.view.InterfaceC0973l0;
import h.AbstractC5563a;
import i.AbstractC5638a;

/* loaded from: classes.dex */
public class r extends RadioButton implements androidx.core.widget.j, InterfaceC0973l0 {

    /* renamed from: a, reason: collision with root package name */
    private final C0849i f7223a;

    /* renamed from: b, reason: collision with root package name */
    private final C0845e f7224b;

    /* renamed from: c, reason: collision with root package name */
    private final I f7225c;

    public r(Context context) {
        this(context, null);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7224b;
        if (c0845e != null) {
            c0845e.b();
        }
        I i8 = this.f7225c;
        if (i8 != null) {
            i8.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0849i c0849i = this.f7223a;
        return c0849i != null ? c0849i.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7224b;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7224b;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportButtonTintList() {
        C0849i c0849i = this.f7223a;
        if (c0849i != null) {
            return c0849i.c();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public PorterDuff.Mode getSupportButtonTintMode() {
        C0849i c0849i = this.f7223a;
        if (c0849i != null) {
            return c0849i.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7224b;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7224b;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0849i c0849i = this.f7223a;
        if (c0849i != null) {
            c0849i.f();
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7224b;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7224b;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0849i c0849i = this.f7223a;
        if (c0849i != null) {
            c0849i.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0849i c0849i = this.f7223a;
        if (c0849i != null) {
            c0849i.h(mode);
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.radioButtonStyle);
    }

    public r(Context context, AttributeSet attributeSet, int i8) {
        super(o0.wrap(context), attributeSet, i8);
        n0.checkAppCompatTheme(this, getContext());
        C0849i c0849i = new C0849i(this);
        this.f7223a = c0849i;
        c0849i.e(attributeSet, i8);
        C0845e c0845e = new C0845e(this);
        this.f7224b = c0845e;
        c0845e.e(attributeSet, i8);
        I i9 = new I(this);
        this.f7225c = i9;
        i9.m(attributeSet, i8);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i8) {
        setButtonDrawable(AbstractC5638a.getDrawable(getContext(), i8));
    }
}
