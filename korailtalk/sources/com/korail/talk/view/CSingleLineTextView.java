package com.korail.talk.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.J;

/* loaded from: classes.dex */
public class CSingleLineTextView extends J {

    /* renamed from: f, reason: collision with root package name */
    private float f29331f;

    /* renamed from: g, reason: collision with root package name */
    private int f29332g;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (CSingleLineTextView.this.getHeight() > 0) {
                CSingleLineTextView cSingleLineTextView = CSingleLineTextView.this;
                cSingleLineTextView.f29332g = cSingleLineTextView.getHeight();
            }
            CSingleLineTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (CSingleLineTextView.this.f29332g > CSingleLineTextView.this.getHeight()) {
                CSingleLineTextView cSingleLineTextView = CSingleLineTextView.this;
                cSingleLineTextView.setHeight(cSingleLineTextView.f29332g);
            }
            CSingleLineTextView cSingleLineTextView2 = CSingleLineTextView.this;
            cSingleLineTextView2.f(cSingleLineTextView2.getText().toString(), CSingleLineTextView.this.getWidth());
            CSingleLineTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public CSingleLineTextView(Context context) {
        super(context);
        e(context, null);
    }

    private void e(Context context, AttributeSet attributeSet) {
        this.f29331f = getTextSize();
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
        I4.a.getInstance().applyFont(context, this, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str, int i8) {
        if (i8 <= 0 || str.isEmpty()) {
            return;
        }
        int paddingLeft = (i8 - getPaddingLeft()) - getPaddingRight();
        float f8 = this.f29331f;
        setTextSize(0, f8);
        float f9 = paddingLeft;
        if (getPaint().measureText(str) <= f9) {
            return;
        }
        float f10 = 20.0f;
        while (f8 - f10 > 0.5f) {
            float f11 = (f8 + f10) / 2.0f;
            setTextSize(0, f11);
            if (getPaint().measureText(str) > f9) {
                f8 = f11;
            } else {
                f10 = f11;
            }
        }
        setTextSize(0, f10);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    @Override // androidx.appcompat.widget.J, android.widget.TextView, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        if (z8) {
            f(getText().toString(), getWidth());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        if (i8 != i10) {
            f(getText().toString(), i8);
        }
    }

    @Override // androidx.appcompat.widget.J, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        f(charSequence.toString(), getWidth());
    }

    public CSingleLineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet);
    }

    public CSingleLineTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        e(context, attributeSet);
    }
}
