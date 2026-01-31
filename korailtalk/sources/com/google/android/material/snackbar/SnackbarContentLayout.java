package com.google.android.material.snackbar;

import J2.d;
import J2.f;
import J2.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC0985p0;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: a, reason: collision with root package name */
    private TextView f25099a;

    /* renamed from: b, reason: collision with root package name */
    private Button f25100b;

    /* renamed from: c, reason: collision with root package name */
    private int f25101c;

    /* renamed from: d, reason: collision with root package name */
    private int f25102d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    private static void b(View view, int i8, int i9) {
        if (AbstractC0985p0.isPaddingRelative(view)) {
            AbstractC0985p0.setPaddingRelative(view, AbstractC0985p0.getPaddingStart(view), i8, AbstractC0985p0.getPaddingEnd(view), i9);
        } else {
            view.setPadding(view.getPaddingLeft(), i8, view.getPaddingRight(), i9);
        }
    }

    private boolean c(int i8, int i9, int i10) {
        boolean z8;
        if (i8 != getOrientation()) {
            setOrientation(i8);
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f25099a.getPaddingTop() == i9 && this.f25099a.getPaddingBottom() == i10) {
            return z8;
        }
        b(this.f25099a, i9, i10);
        return true;
    }

    void a(float f8) {
        if (f8 != 1.0f) {
            this.f25100b.setTextColor(Q2.a.layer(Q2.a.getColor(this, J2.b.colorSurface), this.f25100b.getCurrentTextColor(), f8));
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void animateContentIn(int i8, int i9) {
        this.f25099a.setAlpha(0.0f);
        long j8 = i9;
        long j9 = i8;
        this.f25099a.animate().alpha(1.0f).setDuration(j8).setStartDelay(j9).start();
        if (this.f25100b.getVisibility() == 0) {
            this.f25100b.setAlpha(0.0f);
            this.f25100b.animate().alpha(1.0f).setDuration(j8).setStartDelay(j9).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void animateContentOut(int i8, int i9) {
        this.f25099a.setAlpha(1.0f);
        long j8 = i9;
        long j9 = i8;
        this.f25099a.animate().alpha(0.0f).setDuration(j8).setStartDelay(j9).start();
        if (this.f25100b.getVisibility() == 0) {
            this.f25100b.setAlpha(1.0f);
            this.f25100b.animate().alpha(0.0f).setDuration(j8).setStartDelay(j9).start();
        }
    }

    public Button getActionView() {
        return this.f25100b;
    }

    public TextView getMessageView() {
        return this.f25099a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f25099a = (TextView) findViewById(f.snackbar_text);
        this.f25100b = (Button) findViewById(f.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) throws Resources.NotFoundException {
        super.onMeasure(i8, i9);
        if (this.f25101c > 0) {
            int measuredWidth = getMeasuredWidth();
            int i10 = this.f25101c;
            if (measuredWidth > i10) {
                i8 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                super.onMeasure(i8, i9);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(d.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(d.design_snackbar_padding_vertical);
        boolean z8 = this.f25099a.getLayout().getLineCount() > 1;
        if (!z8 || this.f25102d <= 0 || this.f25100b.getMeasuredWidth() <= this.f25102d) {
            if (!z8) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!c(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!c(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i8, i9);
    }

    public void setMaxInlineActionWidth(int i8) {
        this.f25102d = i8;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.SnackbarLayout);
        this.f25101c = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.SnackbarLayout_android_maxWidth, -1);
        this.f25102d = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
