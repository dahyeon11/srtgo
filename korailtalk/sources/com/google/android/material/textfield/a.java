package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import i.AbstractC5638a;

/* loaded from: classes2.dex */
class a extends com.google.android.material.textfield.e {

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f25292d;

    /* renamed from: e, reason: collision with root package name */
    private final View.OnFocusChangeListener f25293e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.f f25294f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.g f25295g;

    /* renamed from: h, reason: collision with root package name */
    private AnimatorSet f25296h;

    /* renamed from: i, reason: collision with root package name */
    private ValueAnimator f25297i;

    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    class C0203a implements TextWatcher {
        C0203a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f25341a.getSuffixText() != null) {
                return;
            }
            a.this.i(a.l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z8) {
            a.this.i(!TextUtils.isEmpty(((EditText) view).getText()) && z8);
        }
    }

    class c implements TextInputLayout.f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void onEditTextAttached(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && a.l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.f25293e);
            editText.removeTextChangedListener(a.this.f25292d);
            editText.addTextChangedListener(a.this.f25292d);
        }
    }

    class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        class RunnableC0204a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EditText f25302a;

            RunnableC0204a(EditText editText) {
                this.f25302a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25302a.removeTextChangedListener(a.this.f25292d);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void onEndIconChanged(TextInputLayout textInputLayout, int i8) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i8 != 2) {
                return;
            }
            editText.post(new RunnableC0204a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f25293e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f25341a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f25341a.refreshEndIconDrawableState();
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f25341a.setEndIconVisible(true);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f25341a.setEndIconVisible(false);
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f25343c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f25343c.setScaleX(fFloatValue);
            a.this.f25343c.setScaleY(fFloatValue);
        }
    }

    a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f25292d = new C0203a();
        this.f25293e = new b();
        this.f25294f = new c();
        this.f25295g = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z8) {
        boolean z9 = this.f25341a.isEndIconVisible() == z8;
        if (z8 && !this.f25296h.isRunning()) {
            this.f25297i.cancel();
            this.f25296h.start();
            if (z9) {
                this.f25296h.end();
                return;
            }
            return;
        }
        if (z8) {
            return;
        }
        this.f25296h.cancel();
        this.f25297i.start();
        if (z9) {
            this.f25297i.end();
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(K2.a.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new h());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(K2.a.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new i());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(Editable editable) {
        return editable.length() > 0;
    }

    private void m() {
        ValueAnimator valueAnimatorK = k();
        ValueAnimator valueAnimatorJ = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f25296h = animatorSet;
        animatorSet.playTogether(valueAnimatorK, valueAnimatorJ);
        this.f25296h.addListener(new f());
        ValueAnimator valueAnimatorJ2 = j(1.0f, 0.0f);
        this.f25297i = valueAnimatorJ2;
        valueAnimatorJ2.addListener(new g());
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.f25341a.setEndIconDrawable(AbstractC5638a.getDrawable(this.f25342b, J2.e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f25341a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(J2.j.clear_text_end_icon_content_description));
        this.f25341a.setEndIconOnClickListener(new e());
        this.f25341a.addOnEditTextAttachedListener(this.f25294f);
        this.f25341a.addOnEndIconChangedListener(this.f25295g);
        m();
    }

    @Override // com.google.android.material.textfield.e
    void c(boolean z8) {
        if (this.f25341a.getSuffixText() == null) {
            return;
        }
        i(z8);
    }
}
