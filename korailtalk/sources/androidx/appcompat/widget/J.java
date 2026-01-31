package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.m;
import androidx.core.view.InterfaceC0973l0;
import i.AbstractC5638a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class J extends TextView implements InterfaceC0973l0, androidx.core.widget.k, androidx.core.widget.b {

    /* renamed from: a, reason: collision with root package name */
    private final C0845e f6818a;

    /* renamed from: b, reason: collision with root package name */
    private final I f6819b;

    /* renamed from: c, reason: collision with root package name */
    private final C f6820c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6821d;

    /* renamed from: e, reason: collision with root package name */
    private Future f6822e;

    public J(Context context) {
        this(context, null);
    }

    private void a() {
        Future future = this.f6822e;
        if (future != null) {
            try {
                this.f6822e = null;
                androidx.core.widget.h.setPrecomputedText(this, (androidx.core.text.m) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f6818a;
        if (c0845e != null) {
            c0845e.b();
        }
        I i8 = this.f6819b;
        if (i8 != null) {
            i8.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMaxTextSize();
        }
        I i8 = this.f6819b;
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
        I i8 = this.f6819b;
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
        I i8 = this.f6819b;
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
        I i8 = this.f6819b;
        return i8 != null ? i8.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        I i8 = this.f6819b;
        if (i8 != null) {
            return i8.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.h.getFirstBaselineToTopHeight(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.h.getLastBaselineToBottomHeight(this);
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f6818a;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f6818a;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.k
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6819b.j();
    }

    @Override // androidx.core.widget.k
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6819b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        a();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C c9;
        return (Build.VERSION.SDK_INT >= 28 || (c9 = this.f6820c) == null) ? super.getTextClassifier() : c9.getTextClassifier();
    }

    public m.b getTextMetricsParamsCompat() {
        return androidx.core.widget.h.getTextMetricsParams(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f6819b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC0852l.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        I i12 = this.f6819b;
        if (i12 != null) {
            i12.o(z8, i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i8, int i9) {
        a();
        super.onMeasure(i8, i9);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        I i11 = this.f6819b;
        if (i11 == null || androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE || !i11.l()) {
            return;
        }
        this.f6819b.c();
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
            return;
        }
        I i12 = this.f6819b;
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
        I i9 = this.f6819b;
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
        I i9 = this.f6819b;
        if (i9 != null) {
            i9.v(i8);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f6818a;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f6818a;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        I i8 = this.f6819b;
        if (i8 != null) {
            i8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        I i8 = this.f6819b;
        if (i8 != null) {
            i8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        I i8 = this.f6819b;
        if (i8 != null) {
            i8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        I i8 = this.f6819b;
        if (i8 != null) {
            i8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i8);
        } else {
            androidx.core.widget.h.setFirstBaselineToTopHeight(this, i8);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i8);
        } else {
            androidx.core.widget.h.setLastBaselineToBottomHeight(this, i8);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i8) {
        androidx.core.widget.h.setLineHeight(this, i8);
    }

    public void setPrecomputedText(androidx.core.text.m mVar) {
        androidx.core.widget.h.setPrecomputedText(this, mVar);
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f6818a;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f6818a;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f6819b.w(colorStateList);
        this.f6819b.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f6819b.x(mode);
        this.f6819b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        I i9 = this.f6819b;
        if (i9 != null) {
            i9.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C c9;
        if (Build.VERSION.SDK_INT >= 28 || (c9 = this.f6820c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c9.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.m> future) {
        this.f6822e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(m.b bVar) {
        androidx.core.widget.h.setTextMetricsParams(this, bVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i8, float f8) {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setTextSize(i8, f8);
            return;
        }
        I i9 = this.f6819b;
        if (i9 != null) {
            i9.A(i8, f8);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i8) {
        if (this.f6821d) {
            return;
        }
        Typeface typefaceCreate = (typeface == null || i8 <= 0) ? null : androidx.core.graphics.d.create(getContext(), typeface, i8);
        this.f6821d = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i8);
        } finally {
            this.f6821d = false;
        }
    }

    public J(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public J(Context context, AttributeSet attributeSet, int i8) {
        super(o0.wrap(context), attributeSet, i8);
        this.f6821d = false;
        n0.checkAppCompatTheme(this, getContext());
        C0845e c0845e = new C0845e(this);
        this.f6818a = c0845e;
        c0845e.e(attributeSet, i8);
        I i9 = new I(this);
        this.f6819b = i9;
        i9.m(attributeSet, i8);
        i9.b();
        this.f6820c = new C(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i8 != 0 ? AbstractC5638a.getDrawable(context, i8) : null, i9 != 0 ? AbstractC5638a.getDrawable(context, i9) : null, i10 != 0 ? AbstractC5638a.getDrawable(context, i10) : null, i11 != 0 ? AbstractC5638a.getDrawable(context, i11) : null);
        I i12 = this.f6819b;
        if (i12 != null) {
            i12.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i8 != 0 ? AbstractC5638a.getDrawable(context, i8) : null, i9 != 0 ? AbstractC5638a.getDrawable(context, i9) : null, i10 != 0 ? AbstractC5638a.getDrawable(context, i10) : null, i11 != 0 ? AbstractC5638a.getDrawable(context, i11) : null);
        I i12 = this.f6819b;
        if (i12 != null) {
            i12.p();
        }
    }
}
