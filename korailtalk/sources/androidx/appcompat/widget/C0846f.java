package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.InterfaceC0973l0;
import h.AbstractC5563a;

/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0846f extends Button implements InterfaceC0973l0, androidx.core.widget.b, androidx.core.widget.k {

    /* renamed from: a, reason: collision with root package name */
    private final C0845e f7104a;

    /* renamed from: b, reason: collision with root package name */
    private final I f7105b;

    public C0846f(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7104a;
        if (c0845e != null) {
            c0845e.b();
        }
        I i8 = this.f7105b;
        if (i8 != null) {
            i8.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMaxTextSize();
        }
        I i8 = this.f7105b;
        if (i8 != null) {
            return i8.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMinTextSize();
        }
        I i8 = this.f7105b;
        if (i8 != null) {
            return i8.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeStepGranularity();
        }
        I i8 = this.f7105b;
        if (i8 != null) {
            return i8.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextAvailableSizes();
        }
        I i8 = this.f7105b;
        return i8 != null ? i8.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        I i8 = this.f7105b;
        if (i8 != null) {
            return i8.i();
        }
        return 0;
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7104a;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7104a;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.k
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7105b.j();
    }

    @Override // androidx.core.widget.k
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7105b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        I i12 = this.f7105b;
        if (i12 != null) {
            i12.o(z8, i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        I i11 = this.f7105b;
        if (i11 == null || androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE || !i11.l()) {
            return;
        }
        this.f7105b.c();
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
            return;
        }
        I i12 = this.f7105b;
        if (i12 != null) {
            i12.t(i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i8) {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
            return;
        }
        I i9 = this.f7105b;
        if (i9 != null) {
            i9.u(iArr, i8);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeWithDefaults(int i8) {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeWithDefaults(i8);
            return;
        }
        I i9 = this.f7105b;
        if (i9 != null) {
            i9.v(i8);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7104a;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7104a;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void setSupportAllCaps(boolean z8) {
        I i8 = this.f7105b;
        if (i8 != null) {
            i8.s(z8);
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7104a;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7104a;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7105b.w(colorStateList);
        this.f7105b.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7105b.x(mode);
        this.f7105b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        I i9 = this.f7105b;
        if (i9 != null) {
            i9.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i8, float f8) {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setTextSize(i8, f8);
            return;
        }
        I i9 = this.f7105b;
        if (i9 != null) {
            i9.A(i8, f8);
        }
    }

    public C0846f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.buttonStyle);
    }

    public C0846f(Context context, AttributeSet attributeSet, int i8) {
        super(o0.wrap(context), attributeSet, i8);
        n0.checkAppCompatTheme(this, getContext());
        C0845e c0845e = new C0845e(this);
        this.f7104a = c0845e;
        c0845e.e(attributeSet, i8);
        I i9 = new I(this);
        this.f7105b = i9;
        i9.m(attributeSet, i8);
        i9.b();
    }
}
