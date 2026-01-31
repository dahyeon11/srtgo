package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5572j;
import i.AbstractC5638a;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
class C0849i {

    /* renamed from: a */
    private final CompoundButton f7128a;

    /* renamed from: b */
    private ColorStateList f7129b = null;

    /* renamed from: c */
    private PorterDuff.Mode f7130c = null;

    /* renamed from: d */
    private boolean f7131d = false;

    /* renamed from: e */
    private boolean f7132e = false;

    /* renamed from: f */
    private boolean f7133f;

    C0849i(CompoundButton compoundButton) {
        this.f7128a = compoundButton;
    }

    void a() {
        Drawable buttonDrawable = androidx.core.widget.c.getButtonDrawable(this.f7128a);
        if (buttonDrawable != null) {
            if (this.f7131d || this.f7132e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.wrap(buttonDrawable).mutate();
                if (this.f7131d) {
                    androidx.core.graphics.drawable.a.setTintList(drawableMutate, this.f7129b);
                }
                if (this.f7132e) {
                    androidx.core.graphics.drawable.a.setTintMode(drawableMutate, this.f7130c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f7128a.getDrawableState());
                }
                this.f7128a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i8) {
        return i8;
    }

    ColorStateList c() {
        return this.f7129b;
    }

    PorterDuff.Mode d() {
        return this.f7130c;
    }

    void e(AttributeSet attributeSet, int i8) {
        int resourceId;
        int resourceId2;
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(this.f7128a.getContext(), attributeSet, AbstractC5572j.CompoundButton, i8, 0);
        CompoundButton compoundButton = this.f7128a;
        AbstractC0985p0.saveAttributeDataForStyleable(compoundButton, compoundButton.getContext(), AbstractC5572j.CompoundButton, attributeSet, r0VarObtainStyledAttributes.getWrappedTypeArray(), i8, 0);
        try {
            if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.CompoundButton_buttonCompat) && (resourceId2 = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f7128a;
                    compoundButton2.setButtonDrawable(AbstractC5638a.getDrawable(compoundButton2.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.CompoundButton_android_button) && (resourceId = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.CompoundButton_android_button, 0)) != 0) {
                CompoundButton compoundButton3 = this.f7128a;
                compoundButton3.setButtonDrawable(AbstractC5638a.getDrawable(compoundButton3.getContext(), resourceId));
            }
            if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.CompoundButton_buttonTint)) {
                androidx.core.widget.c.setButtonTintList(this.f7128a, r0VarObtainStyledAttributes.getColorStateList(AbstractC5572j.CompoundButton_buttonTint));
            }
            if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.CompoundButton_buttonTintMode)) {
                androidx.core.widget.c.setButtonTintMode(this.f7128a, W.parseTintMode(r0VarObtainStyledAttributes.getInt(AbstractC5572j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            r0VarObtainStyledAttributes.recycle();
        }
    }

    void f() {
        if (this.f7133f) {
            this.f7133f = false;
        } else {
            this.f7133f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f7129b = colorStateList;
        this.f7131d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f7130c = mode;
        this.f7132e = true;
        a();
    }
}
