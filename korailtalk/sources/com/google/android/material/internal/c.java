package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.F;

/* loaded from: classes2.dex */
public class c extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private int f24990a;

    /* renamed from: b, reason: collision with root package name */
    private int f24991b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24992c;

    /* renamed from: d, reason: collision with root package name */
    private int f24993d;

    public c(Context context) {
        this(context, null);
    }

    private static int a(int i8, int i9, int i10) {
        return i9 != Integer.MIN_VALUE ? i9 != 1073741824 ? i10 : i8 : Math.min(i10, i8);
    }

    private void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, J2.l.FlowLayout, 0, 0);
        this.f24990a = typedArrayObtainStyledAttributes.getDimensionPixelSize(J2.l.FlowLayout_lineSpacing, 0);
        this.f24991b = typedArrayObtainStyledAttributes.getDimensionPixelSize(J2.l.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected int getItemSpacing() {
        return this.f24991b;
    }

    protected int getLineSpacing() {
        return this.f24990a;
    }

    protected int getRowCount() {
        return this.f24993d;
    }

    public int getRowIndex(View view) {
        Object tag = view.getTag(J2.f.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean isSingleLine() {
        return this.f24992c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.f24993d = 0;
            return;
        }
        this.f24993d = 1;
        boolean z9 = AbstractC0985p0.getLayoutDirection(this) == 1;
        int paddingRight = z9 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z9 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i12 = (i10 - i8) - paddingLeft;
        int measuredWidth = paddingRight;
        int i13 = paddingTop;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(J2.f.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = F.getMarginStart(marginLayoutParams);
                    marginEnd = F.getMarginEnd(marginLayoutParams);
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = measuredWidth + marginStart + childAt.getMeasuredWidth();
                if (!this.f24992c && measuredWidth2 > i12) {
                    i13 = this.f24990a + paddingTop;
                    this.f24993d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(J2.f.row_index_key, Integer.valueOf(this.f24993d - 1));
                int i15 = measuredWidth + marginStart;
                int measuredWidth3 = childAt.getMeasuredWidth() + i15;
                int measuredHeight = childAt.getMeasuredHeight() + i13;
                if (z9) {
                    childAt.layout(i12 - measuredWidth3, i13, (i12 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(i15, i13, measuredWidth3, measuredHeight);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.f24991b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i9);
        int i12 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i12 - getPaddingRight();
        int i13 = paddingTop;
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i8, i9);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i10 = marginLayoutParams.leftMargin;
                    i11 = marginLayoutParams.rightMargin;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i16 = paddingLeft2;
                if (paddingLeft2 + i10 + childAt.getMeasuredWidth() <= paddingRight || isSingleLine()) {
                    paddingLeft = i16;
                } else {
                    paddingLeft = getPaddingLeft();
                    i13 = this.f24990a + paddingTop;
                }
                int measuredWidth = paddingLeft + i10 + childAt.getMeasuredWidth();
                int measuredHeight = i13 + childAt.getMeasuredHeight();
                if (measuredWidth > i14) {
                    i14 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i10 + i11 + childAt.getMeasuredWidth() + this.f24991b;
                if (i15 == getChildCount() - 1) {
                    i14 += i11;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i14 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i8) {
        this.f24991b = i8;
    }

    protected void setLineSpacing(int i8) {
        this.f24990a = i8;
    }

    public void setSingleLine(boolean z8) {
        this.f24992c = z8;
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f24992c = false;
        b(context, attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f24992c = false;
        b(context, attributeSet);
    }
}
