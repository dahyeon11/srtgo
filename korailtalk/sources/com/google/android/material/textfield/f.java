package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.J;
import androidx.core.view.AbstractC0985p0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25344a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputLayout f25345b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f25346c;

    /* renamed from: d, reason: collision with root package name */
    private int f25347d;

    /* renamed from: e, reason: collision with root package name */
    private FrameLayout f25348e;

    /* renamed from: f, reason: collision with root package name */
    private Animator f25349f;

    /* renamed from: g, reason: collision with root package name */
    private final float f25350g;

    /* renamed from: h, reason: collision with root package name */
    private int f25351h;

    /* renamed from: i, reason: collision with root package name */
    private int f25352i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f25353j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25354k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f25355l;

    /* renamed from: m, reason: collision with root package name */
    private CharSequence f25356m;

    /* renamed from: n, reason: collision with root package name */
    private int f25357n;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f25358o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f25359p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f25360q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f25361r;

    /* renamed from: s, reason: collision with root package name */
    private int f25362s;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f25363t;

    /* renamed from: u, reason: collision with root package name */
    private Typeface f25364u;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f25365a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f25366b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f25367c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f25368d;

        a(int i8, TextView textView, int i9, TextView textView2) {
            this.f25365a = i8;
            this.f25366b = textView;
            this.f25367c = i9;
            this.f25368d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f25351h = this.f25365a;
            f.this.f25349f = null;
            TextView textView = this.f25366b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f25367c == 1 && f.this.f25355l != null) {
                    f.this.f25355l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f25368d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f25368d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f25368d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        this.f25344a = textInputLayout.getContext();
        this.f25345b = textInputLayout;
        this.f25350g = r0.getResources().getDimensionPixelSize(J2.d.design_textinput_caption_translate_y);
    }

    private void A(int i8, int i9) {
        TextView textViewL;
        TextView textViewL2;
        if (i8 == i9) {
            return;
        }
        if (i9 != 0 && (textViewL2 = l(i9)) != null) {
            textViewL2.setVisibility(0);
            textViewL2.setAlpha(1.0f);
        }
        if (i8 != 0 && (textViewL = l(i8)) != null) {
            textViewL.setVisibility(4);
            if (i8 == 1) {
                textViewL.setText((CharSequence) null);
            }
        }
        this.f25351h = i9;
    }

    private void I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void K(ViewGroup viewGroup, int i8) {
        if (i8 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean L(TextView textView, CharSequence charSequence) {
        return AbstractC0985p0.isLaidOut(this.f25345b) && this.f25345b.isEnabled() && !(this.f25352i == this.f25351h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void O(int i8, int i9, boolean z8) {
        if (i8 == i9) {
            return;
        }
        if (z8) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f25349f = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.f25360q, this.f25361r, 2, i8, i9);
            h(arrayList, this.f25354k, this.f25355l, 1, i8, i9);
            K2.b.playTogether(animatorSet, arrayList);
            animatorSet.addListener(new a(i9, l(i8), i8, l(i9)));
            animatorSet.start();
        } else {
            A(i8, i9);
        }
        this.f25345b.i0();
        this.f25345b.l0(z8);
        this.f25345b.v0();
    }

    private boolean f() {
        return (this.f25346c == null || this.f25345b.getEditText() == null) ? false : true;
    }

    private void h(List list, boolean z8, TextView textView, int i8, int i9, int i10) {
        if (textView == null || !z8) {
            return;
        }
        if (i8 == i10 || i8 == i9) {
            list.add(i(textView, i10 == i8));
            if (i10 == i8) {
                list.add(j(textView));
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z8) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z8 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(K2.a.LINEAR_INTERPOLATOR);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f25350g, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(K2.a.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        return objectAnimatorOfFloat;
    }

    private TextView l(int i8) {
        if (i8 == 1) {
            return this.f25355l;
        }
        if (i8 != 2) {
            return null;
        }
        return this.f25361r;
    }

    private int s(boolean z8, int i8, int i9) {
        return z8 ? this.f25344a.getResources().getDimensionPixelSize(i8) : i9;
    }

    private boolean v(int i8) {
        return (i8 != 1 || this.f25355l == null || TextUtils.isEmpty(this.f25353j)) ? false : true;
    }

    void B(CharSequence charSequence) {
        this.f25356m = charSequence;
        TextView textView = this.f25355l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void C(boolean z8) {
        if (this.f25354k == z8) {
            return;
        }
        g();
        if (z8) {
            J j8 = new J(this.f25344a);
            this.f25355l = j8;
            j8.setId(J2.f.textinput_error);
            this.f25355l.setTextAlignment(5);
            Typeface typeface = this.f25364u;
            if (typeface != null) {
                this.f25355l.setTypeface(typeface);
            }
            D(this.f25357n);
            E(this.f25358o);
            B(this.f25356m);
            this.f25355l.setVisibility(4);
            AbstractC0985p0.setAccessibilityLiveRegion(this.f25355l, 1);
            d(this.f25355l, 0);
        } else {
            t();
            z(this.f25355l, 0);
            this.f25355l = null;
            this.f25345b.i0();
            this.f25345b.v0();
        }
        this.f25354k = z8;
    }

    void D(int i8) {
        this.f25357n = i8;
        TextView textView = this.f25355l;
        if (textView != null) {
            this.f25345b.V(textView, i8);
        }
    }

    void E(ColorStateList colorStateList) {
        this.f25358o = colorStateList;
        TextView textView = this.f25355l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void F(int i8) {
        this.f25362s = i8;
        TextView textView = this.f25361r;
        if (textView != null) {
            androidx.core.widget.h.setTextAppearance(textView, i8);
        }
    }

    void G(boolean z8) {
        if (this.f25360q == z8) {
            return;
        }
        g();
        if (z8) {
            J j8 = new J(this.f25344a);
            this.f25361r = j8;
            j8.setId(J2.f.textinput_helper_text);
            this.f25361r.setTextAlignment(5);
            Typeface typeface = this.f25364u;
            if (typeface != null) {
                this.f25361r.setTypeface(typeface);
            }
            this.f25361r.setVisibility(4);
            AbstractC0985p0.setAccessibilityLiveRegion(this.f25361r, 1);
            F(this.f25362s);
            H(this.f25363t);
            d(this.f25361r, 1);
        } else {
            u();
            z(this.f25361r, 1);
            this.f25361r = null;
            this.f25345b.i0();
            this.f25345b.v0();
        }
        this.f25360q = z8;
    }

    void H(ColorStateList colorStateList) {
        this.f25363t = colorStateList;
        TextView textView = this.f25361r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(Typeface typeface) {
        if (typeface != this.f25364u) {
            this.f25364u = typeface;
            I(this.f25355l, typeface);
            I(this.f25361r, typeface);
        }
    }

    void M(CharSequence charSequence) {
        g();
        this.f25353j = charSequence;
        this.f25355l.setText(charSequence);
        int i8 = this.f25351h;
        if (i8 != 1) {
            this.f25352i = 1;
        }
        O(i8, this.f25352i, L(this.f25355l, charSequence));
    }

    void N(CharSequence charSequence) {
        g();
        this.f25359p = charSequence;
        this.f25361r.setText(charSequence);
        int i8 = this.f25351h;
        if (i8 != 2) {
            this.f25352i = 2;
        }
        O(i8, this.f25352i, L(this.f25361r, charSequence));
    }

    void d(TextView textView, int i8) {
        if (this.f25346c == null && this.f25348e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f25344a);
            this.f25346c = linearLayout;
            linearLayout.setOrientation(0);
            this.f25345b.addView(this.f25346c, -1, -2);
            this.f25348e = new FrameLayout(this.f25344a);
            this.f25346c.addView(this.f25348e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f25345b.getEditText() != null) {
                e();
            }
        }
        if (w(i8)) {
            this.f25348e.setVisibility(0);
            this.f25348e.addView(textView);
        } else {
            this.f25346c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f25346c.setVisibility(0);
        this.f25347d++;
    }

    void e() {
        if (f()) {
            EditText editText = this.f25345b.getEditText();
            boolean zIsFontScaleAtLeast1_3 = X2.c.isFontScaleAtLeast1_3(this.f25344a);
            AbstractC0985p0.setPaddingRelative(this.f25346c, s(zIsFontScaleAtLeast1_3, J2.d.material_helper_text_font_1_3_padding_horizontal, AbstractC0985p0.getPaddingStart(editText)), s(zIsFontScaleAtLeast1_3, J2.d.material_helper_text_font_1_3_padding_top, this.f25344a.getResources().getDimensionPixelSize(J2.d.material_helper_text_default_padding_top)), s(zIsFontScaleAtLeast1_3, J2.d.material_helper_text_font_1_3_padding_horizontal, AbstractC0985p0.getPaddingEnd(editText)), 0);
        }
    }

    void g() {
        Animator animator = this.f25349f;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean k() {
        return v(this.f25352i);
    }

    CharSequence m() {
        return this.f25356m;
    }

    CharSequence n() {
        return this.f25353j;
    }

    int o() {
        TextView textView = this.f25355l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList p() {
        TextView textView = this.f25355l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence q() {
        return this.f25359p;
    }

    int r() {
        TextView textView = this.f25361r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void t() {
        this.f25353j = null;
        g();
        if (this.f25351h == 1) {
            if (!this.f25360q || TextUtils.isEmpty(this.f25359p)) {
                this.f25352i = 0;
            } else {
                this.f25352i = 2;
            }
        }
        O(this.f25351h, this.f25352i, L(this.f25355l, null));
    }

    void u() {
        g();
        int i8 = this.f25351h;
        if (i8 == 2) {
            this.f25352i = 0;
        }
        O(i8, this.f25352i, L(this.f25361r, null));
    }

    boolean w(int i8) {
        return i8 == 0 || i8 == 1;
    }

    boolean x() {
        return this.f25354k;
    }

    boolean y() {
        return this.f25360q;
    }

    void z(TextView textView, int i8) {
        FrameLayout frameLayout;
        if (this.f25346c == null) {
            return;
        }
        if (!w(i8) || (frameLayout = this.f25348e) == null) {
            this.f25346c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i9 = this.f25347d - 1;
        this.f25347d = i9;
        K(this.f25346c, i9);
    }
}
