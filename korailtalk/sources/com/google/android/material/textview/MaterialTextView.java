package com.google.android.material.textview;

import J2.l;
import X2.b;
import X2.c;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.J;
import c3.AbstractC1090a;

/* loaded from: classes2.dex */
public class MaterialTextView extends J {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    private void b(Resources.Theme theme, int i8) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i8, l.MaterialTextAppearance);
        int iE = e(getContext(), typedArrayObtainStyledAttributes, l.MaterialTextAppearance_android_lineHeight, l.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (iE >= 0) {
            setLineHeight(iE);
        }
    }

    private static boolean c(Context context) {
        return b.resolveBoolean(context, J2.b.textAppearanceLineHeightEnabled, true);
    }

    private static int d(Resources.Theme theme, AttributeSet attributeSet, int i8, int i9) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.MaterialTextView, i8, i9);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int e(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i8 = 0; i8 < iArr.length && dimensionPixelSize < 0; i8++) {
            dimensionPixelSize = c.getDimensionPixelSize(context, typedArray, iArr[i8], -1);
        }
        return dimensionPixelSize;
    }

    private static boolean f(Context context, Resources.Theme theme, AttributeSet attributeSet, int i8, int i9) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.MaterialTextView, i8, i9);
        int iE = e(context, typedArrayObtainStyledAttributes, l.MaterialTextView_android_lineHeight, l.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return iE != -1;
    }

    @Override // androidx.appcompat.widget.J, android.widget.TextView
    public void setTextAppearance(Context context, int i8) throws Resources.NotFoundException {
        super.setTextAppearance(context, i8);
        if (c(context)) {
            b(context.getTheme(), i8);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i8, int i9) throws Resources.NotFoundException {
        int iD;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        Context context2 = getContext();
        if (c(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (f(context2, theme, attributeSet, i8, i9) || (iD = d(theme, attributeSet, i8, i9)) == -1) {
                return;
            }
            b(theme, iD);
        }
    }
}
