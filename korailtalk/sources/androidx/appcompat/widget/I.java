package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.h;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5572j;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class I {

    /* renamed from: a */
    private final TextView f6797a;

    /* renamed from: b */
    private p0 f6798b;

    /* renamed from: c */
    private p0 f6799c;

    /* renamed from: d */
    private p0 f6800d;

    /* renamed from: e */
    private p0 f6801e;

    /* renamed from: f */
    private p0 f6802f;

    /* renamed from: g */
    private p0 f6803g;

    /* renamed from: h */
    private p0 f6804h;

    /* renamed from: i */
    private final K f6805i;

    /* renamed from: j */
    private int f6806j = 0;

    /* renamed from: k */
    private int f6807k = -1;

    /* renamed from: l */
    private Typeface f6808l;

    /* renamed from: m */
    private boolean f6809m;

    class a extends h.f {

        /* renamed from: a */
        final /* synthetic */ int f6810a;

        /* renamed from: b */
        final /* synthetic */ int f6811b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f6812c;

        a(int i8, int i9, WeakReference weakReference) {
            this.f6810a = i8;
            this.f6811b = i9;
            this.f6812c = weakReference;
        }

        @Override // androidx.core.content.res.h.f
        /* renamed from: onFontRetrievalFailed */
        public void c(int i8) {
        }

        @Override // androidx.core.content.res.h.f
        /* renamed from: onFontRetrieved */
        public void d(Typeface typeface) {
            int i8;
            if (Build.VERSION.SDK_INT >= 28 && (i8 = this.f6810a) != -1) {
                typeface = Typeface.create(typeface, i8, (this.f6811b & 2) != 0);
            }
            I.this.n(this.f6812c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f6814a;

        /* renamed from: b */
        final /* synthetic */ Typeface f6815b;

        /* renamed from: c */
        final /* synthetic */ int f6816c;

        b(TextView textView, Typeface typeface, int i8) {
            this.f6814a = textView;
            this.f6815b = typeface;
            this.f6816c = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6814a.setTypeface(this.f6815b, this.f6816c);
        }
    }

    I(TextView textView) {
        this.f6797a = textView;
        this.f6805i = new K(textView);
    }

    private void B(int i8, float f8) {
        this.f6805i.u(i8, f8);
    }

    private void C(Context context, r0 r0Var) {
        String string;
        this.f6806j = r0Var.getInt(AbstractC5572j.TextAppearance_android_textStyle, this.f6806j);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = r0Var.getInt(AbstractC5572j.TextAppearance_android_textFontWeight, -1);
            this.f6807k = i9;
            if (i9 != -1) {
                this.f6806j &= 2;
            }
        }
        if (!r0Var.hasValue(AbstractC5572j.TextAppearance_android_fontFamily) && !r0Var.hasValue(AbstractC5572j.TextAppearance_fontFamily)) {
            if (r0Var.hasValue(AbstractC5572j.TextAppearance_android_typeface)) {
                this.f6809m = false;
                int i10 = r0Var.getInt(AbstractC5572j.TextAppearance_android_typeface, 1);
                if (i10 == 1) {
                    this.f6808l = Typeface.SANS_SERIF;
                    return;
                } else if (i10 == 2) {
                    this.f6808l = Typeface.SERIF;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f6808l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f6808l = null;
        int i11 = r0Var.hasValue(AbstractC5572j.TextAppearance_fontFamily) ? AbstractC5572j.TextAppearance_fontFamily : AbstractC5572j.TextAppearance_android_fontFamily;
        int i12 = this.f6807k;
        int i13 = this.f6806j;
        if (!context.isRestricted()) {
            try {
                Typeface font = r0Var.getFont(i11, this.f6806j, new a(i12, i13, new WeakReference(this.f6797a)));
                if (font != null) {
                    if (i8 < 28 || this.f6807k == -1) {
                        this.f6808l = font;
                    } else {
                        this.f6808l = Typeface.create(Typeface.create(font, 0), this.f6807k, (this.f6806j & 2) != 0);
                    }
                }
                this.f6809m = this.f6808l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f6808l != null || (string = r0Var.getString(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f6807k == -1) {
            this.f6808l = Typeface.create(string, this.f6806j);
        } else {
            this.f6808l = Typeface.create(Typeface.create(string, 0), this.f6807k, (this.f6806j & 2) != 0);
        }
    }

    private void a(Drawable drawable, p0 p0Var) {
        if (drawable == null || p0Var == null) {
            return;
        }
        C0850j.d(drawable, p0Var, this.f6797a.getDrawableState());
    }

    private static p0 d(Context context, C0850j c0850j, int i8) {
        ColorStateList colorStateListC = c0850j.c(context, i8);
        if (colorStateListC == null) {
            return null;
        }
        p0 p0Var = new p0();
        p0Var.mHasTintList = true;
        p0Var.mTintList = colorStateListC;
        return p0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f6797a.getCompoundDrawablesRelative();
            TextView textView = this.f6797a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f6797a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f6797a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f6797a.getCompoundDrawables();
        TextView textView3 = this.f6797a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        p0 p0Var = this.f6804h;
        this.f6798b = p0Var;
        this.f6799c = p0Var;
        this.f6800d = p0Var;
        this.f6801e = p0Var;
        this.f6802f = p0Var;
        this.f6803g = p0Var;
    }

    void A(int i8, float f8) {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE || l()) {
            return;
        }
        B(i8, f8);
    }

    void b() {
        if (this.f6798b != null || this.f6799c != null || this.f6800d != null || this.f6801e != null) {
            Drawable[] compoundDrawables = this.f6797a.getCompoundDrawables();
            a(compoundDrawables[0], this.f6798b);
            a(compoundDrawables[1], this.f6799c);
            a(compoundDrawables[2], this.f6800d);
            a(compoundDrawables[3], this.f6801e);
        }
        if (this.f6802f == null && this.f6803g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f6797a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f6802f);
        a(compoundDrawablesRelative[2], this.f6803g);
    }

    void c() {
        this.f6805i.a();
    }

    int e() {
        return this.f6805i.g();
    }

    int f() {
        return this.f6805i.h();
    }

    int g() {
        return this.f6805i.i();
    }

    int[] h() {
        return this.f6805i.j();
    }

    int i() {
        return this.f6805i.k();
    }

    ColorStateList j() {
        p0 p0Var = this.f6804h;
        if (p0Var != null) {
            return p0Var.mTintList;
        }
        return null;
    }

    PorterDuff.Mode k() {
        p0 p0Var = this.f6804h;
        if (p0Var != null) {
            return p0Var.mTintMode;
        }
        return null;
    }

    boolean l() {
        return this.f6805i.o();
    }

    void m(AttributeSet attributeSet, int i8) {
        boolean z8;
        boolean z9;
        String string;
        String string2;
        boolean z10;
        Context context = this.f6797a.getContext();
        C0850j c0850j = C0850j.get();
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(context, attributeSet, AbstractC5572j.AppCompatTextHelper, i8, 0);
        TextView textView = this.f6797a;
        AbstractC0985p0.saveAttributeDataForStyleable(textView, textView.getContext(), AbstractC5572j.AppCompatTextHelper, attributeSet, r0VarObtainStyledAttributes.getWrappedTypeArray(), i8, 0);
        int resourceId = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.AppCompatTextHelper_android_textAppearance, -1);
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTextHelper_android_drawableLeft)) {
            this.f6798b = d(context, c0850j, r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTextHelper_android_drawableTop)) {
            this.f6799c = d(context, c0850j, r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTextHelper_android_drawableRight)) {
            this.f6800d = d(context, c0850j, r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTextHelper_android_drawableBottom)) {
            this.f6801e = d(context, c0850j, r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        int i9 = Build.VERSION.SDK_INT;
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTextHelper_android_drawableStart)) {
            this.f6802f = d(context, c0850j, r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTextHelper_android_drawableEnd)) {
            this.f6803g = d(context, c0850j, r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        r0VarObtainStyledAttributes.recycle();
        boolean z11 = this.f6797a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            r0 r0VarObtainStyledAttributes2 = r0.obtainStyledAttributes(context, resourceId, AbstractC5572j.TextAppearance);
            if (z11 || !r0VarObtainStyledAttributes2.hasValue(AbstractC5572j.TextAppearance_textAllCaps)) {
                z8 = false;
                z9 = false;
            } else {
                z8 = r0VarObtainStyledAttributes2.getBoolean(AbstractC5572j.TextAppearance_textAllCaps, false);
                z9 = true;
            }
            C(context, r0VarObtainStyledAttributes2);
            string2 = r0VarObtainStyledAttributes2.hasValue(AbstractC5572j.TextAppearance_textLocale) ? r0VarObtainStyledAttributes2.getString(AbstractC5572j.TextAppearance_textLocale) : null;
            string = (i9 < 26 || !r0VarObtainStyledAttributes2.hasValue(AbstractC5572j.TextAppearance_fontVariationSettings)) ? null : r0VarObtainStyledAttributes2.getString(AbstractC5572j.TextAppearance_fontVariationSettings);
            r0VarObtainStyledAttributes2.recycle();
        } else {
            z8 = false;
            z9 = false;
            string = null;
            string2 = null;
        }
        r0 r0VarObtainStyledAttributes3 = r0.obtainStyledAttributes(context, attributeSet, AbstractC5572j.TextAppearance, i8, 0);
        if (z11 || !r0VarObtainStyledAttributes3.hasValue(AbstractC5572j.TextAppearance_textAllCaps)) {
            z10 = z9;
        } else {
            z8 = r0VarObtainStyledAttributes3.getBoolean(AbstractC5572j.TextAppearance_textAllCaps, false);
            z10 = true;
        }
        if (r0VarObtainStyledAttributes3.hasValue(AbstractC5572j.TextAppearance_textLocale)) {
            string2 = r0VarObtainStyledAttributes3.getString(AbstractC5572j.TextAppearance_textLocale);
        }
        if (i9 >= 26 && r0VarObtainStyledAttributes3.hasValue(AbstractC5572j.TextAppearance_fontVariationSettings)) {
            string = r0VarObtainStyledAttributes3.getString(AbstractC5572j.TextAppearance_fontVariationSettings);
        }
        if (i9 >= 28 && r0VarObtainStyledAttributes3.hasValue(AbstractC5572j.TextAppearance_android_textSize) && r0VarObtainStyledAttributes3.getDimensionPixelSize(AbstractC5572j.TextAppearance_android_textSize, -1) == 0) {
            this.f6797a.setTextSize(0, 0.0f);
        }
        C(context, r0VarObtainStyledAttributes3);
        r0VarObtainStyledAttributes3.recycle();
        if (!z11 && z10) {
            s(z8);
        }
        Typeface typeface = this.f6808l;
        if (typeface != null) {
            if (this.f6807k == -1) {
                this.f6797a.setTypeface(typeface, this.f6806j);
            } else {
                this.f6797a.setTypeface(typeface);
            }
        }
        if (string != null) {
            this.f6797a.setFontVariationSettings(string);
        }
        if (string2 != null) {
            this.f6797a.setTextLocales(LocaleList.forLanguageTags(string2));
        }
        this.f6805i.p(attributeSet, i8);
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE && this.f6805i.k() != 0) {
            int[] iArrJ = this.f6805i.j();
            if (iArrJ.length > 0) {
                if (this.f6797a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f6797a.setAutoSizeTextTypeUniformWithConfiguration(this.f6805i.h(), this.f6805i.g(), this.f6805i.i(), 0);
                } else {
                    this.f6797a.setAutoSizeTextTypeUniformWithPresetSizes(iArrJ, 0);
                }
            }
        }
        r0 r0VarObtainStyledAttributes4 = r0.obtainStyledAttributes(context, attributeSet, AbstractC5572j.AppCompatTextView);
        int resourceId2 = r0VarObtainStyledAttributes4.getResourceId(AbstractC5572j.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawable = resourceId2 != -1 ? c0850j.getDrawable(context, resourceId2) : null;
        int resourceId3 = r0VarObtainStyledAttributes4.getResourceId(AbstractC5572j.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawable2 = resourceId3 != -1 ? c0850j.getDrawable(context, resourceId3) : null;
        int resourceId4 = r0VarObtainStyledAttributes4.getResourceId(AbstractC5572j.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawable3 = resourceId4 != -1 ? c0850j.getDrawable(context, resourceId4) : null;
        int resourceId5 = r0VarObtainStyledAttributes4.getResourceId(AbstractC5572j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawable4 = resourceId5 != -1 ? c0850j.getDrawable(context, resourceId5) : null;
        int resourceId6 = r0VarObtainStyledAttributes4.getResourceId(AbstractC5572j.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawable5 = resourceId6 != -1 ? c0850j.getDrawable(context, resourceId6) : null;
        int resourceId7 = r0VarObtainStyledAttributes4.getResourceId(AbstractC5572j.AppCompatTextView_drawableEndCompat, -1);
        y(drawable, drawable2, drawable3, drawable4, drawable5, resourceId7 != -1 ? c0850j.getDrawable(context, resourceId7) : null);
        if (r0VarObtainStyledAttributes4.hasValue(AbstractC5572j.AppCompatTextView_drawableTint)) {
            androidx.core.widget.h.setCompoundDrawableTintList(this.f6797a, r0VarObtainStyledAttributes4.getColorStateList(AbstractC5572j.AppCompatTextView_drawableTint));
        }
        if (r0VarObtainStyledAttributes4.hasValue(AbstractC5572j.AppCompatTextView_drawableTintMode)) {
            androidx.core.widget.h.setCompoundDrawableTintMode(this.f6797a, W.parseTintMode(r0VarObtainStyledAttributes4.getInt(AbstractC5572j.AppCompatTextView_drawableTintMode, -1), null));
        }
        int dimensionPixelSize = r0VarObtainStyledAttributes4.getDimensionPixelSize(AbstractC5572j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize2 = r0VarObtainStyledAttributes4.getDimensionPixelSize(AbstractC5572j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int dimensionPixelSize3 = r0VarObtainStyledAttributes4.getDimensionPixelSize(AbstractC5572j.AppCompatTextView_lineHeight, -1);
        r0VarObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            androidx.core.widget.h.setFirstBaselineToTopHeight(this.f6797a, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            androidx.core.widget.h.setLastBaselineToBottomHeight(this.f6797a, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            androidx.core.widget.h.setLineHeight(this.f6797a, dimensionPixelSize3);
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f6809m) {
            this.f6808l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (AbstractC0985p0.isAttachedToWindow(textView)) {
                    textView.post(new b(textView, typeface, this.f6806j));
                } else {
                    textView.setTypeface(typeface, this.f6806j);
                }
            }
        }
    }

    void o(boolean z8, int i8, int i9, int i10, int i11) {
        if (androidx.core.widget.b.PLATFORM_SUPPORTS_AUTOSIZE) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i8) {
        String string;
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(context, i8, AbstractC5572j.TextAppearance);
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.TextAppearance_textAllCaps)) {
            s(r0VarObtainStyledAttributes.getBoolean(AbstractC5572j.TextAppearance_textAllCaps, false));
        }
        int i9 = Build.VERSION.SDK_INT;
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.TextAppearance_android_textSize) && r0VarObtainStyledAttributes.getDimensionPixelSize(AbstractC5572j.TextAppearance_android_textSize, -1) == 0) {
            this.f6797a.setTextSize(0, 0.0f);
        }
        C(context, r0VarObtainStyledAttributes);
        if (i9 >= 26 && r0VarObtainStyledAttributes.hasValue(AbstractC5572j.TextAppearance_fontVariationSettings) && (string = r0VarObtainStyledAttributes.getString(AbstractC5572j.TextAppearance_fontVariationSettings)) != null) {
            this.f6797a.setFontVariationSettings(string);
        }
        r0VarObtainStyledAttributes.recycle();
        Typeface typeface = this.f6808l;
        if (typeface != null) {
            this.f6797a.setTypeface(typeface, this.f6806j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        androidx.core.view.inputmethod.c.setInitialSurroundingText(editorInfo, textView.getText());
    }

    void s(boolean z8) {
        this.f6797a.setAllCaps(z8);
    }

    void t(int i8, int i9, int i10, int i11) {
        this.f6805i.q(i8, i9, i10, i11);
    }

    void u(int[] iArr, int i8) {
        this.f6805i.r(iArr, i8);
    }

    void v(int i8) {
        this.f6805i.s(i8);
    }

    void w(ColorStateList colorStateList) {
        if (this.f6804h == null) {
            this.f6804h = new p0();
        }
        p0 p0Var = this.f6804h;
        p0Var.mTintList = colorStateList;
        p0Var.mHasTintList = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f6804h == null) {
            this.f6804h = new p0();
        }
        p0 p0Var = this.f6804h;
        p0Var.mTintMode = mode;
        p0Var.mHasTintMode = mode != null;
        z();
    }
}
