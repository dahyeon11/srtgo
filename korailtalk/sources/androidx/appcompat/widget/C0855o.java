package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.view.InterfaceC0973l0;
import h.AbstractC5563a;
import i.AbstractC5638a;

/* renamed from: androidx.appcompat.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0855o extends MultiAutoCompleteTextView implements InterfaceC0973l0 {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f7210c = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    private final C0845e f7211a;

    /* renamed from: b, reason: collision with root package name */
    private final I f7212b;

    public C0855o(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7211a;
        if (c0845e != null) {
            c0845e.b();
        }
        I i8 = this.f7212b;
        if (i8 != null) {
            i8.b();
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7211a;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7211a;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC0852l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7211a;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7211a;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i8) {
        setDropDownBackgroundDrawable(AbstractC5638a.getDrawable(getContext(), i8));
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7211a;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7211a;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        I i9 = this.f7212b;
        if (i9 != null) {
            i9.q(context, i8);
        }
    }

    public C0855o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.autoCompleteTextViewStyle);
    }

    public C0855o(Context context, AttributeSet attributeSet, int i8) {
        super(o0.wrap(context), attributeSet, i8);
        n0.checkAppCompatTheme(this, getContext());
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(getContext(), attributeSet, f7210c, i8, 0);
        if (r0VarObtainStyledAttributes.hasValue(0)) {
            setDropDownBackgroundDrawable(r0VarObtainStyledAttributes.getDrawable(0));
        }
        r0VarObtainStyledAttributes.recycle();
        C0845e c0845e = new C0845e(this);
        this.f7211a = c0845e;
        c0845e.e(attributeSet, i8);
        I i9 = new I(this);
        this.f7212b = i9;
        i9.m(attributeSet, i8);
        i9.b();
    }
}
