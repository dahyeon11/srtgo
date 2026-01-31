package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.r0;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f25024a = {J2.b.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f25025b = {J2.b.colorPrimaryVariant};

    private static void a(Context context, AttributeSet attributeSet, int i8, int i9) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J2.l.ThemeEnforcement, i8, i9);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(J2.l.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z8) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(J2.b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                checkMaterialTheme(context);
            }
        }
        checkAppCompatTheme(context);
    }

    private static void b(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9, int... iArr2) {
        boolean zD;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J2.l.ThemeEnforcement, i8, i9);
        if (!typedArrayObtainStyledAttributes.getBoolean(J2.l.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zD = typedArrayObtainStyledAttributes.getResourceId(J2.l.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            zD = d(context, attributeSet, iArr, i8, i9, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zD) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void c(Context context, int[] iArr, String str) {
        if (e(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static void checkAppCompatTheme(Context context) {
        c(context, f25024a, "Theme.AppCompat");
    }

    public static void checkMaterialTheme(Context context) {
        c(context, f25025b, "Theme.MaterialComponents");
    }

    private static boolean d(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i8, i9);
        for (int i10 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i10, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    private static boolean e(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i8 = 0; i8 < iArr.length; i8++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i8)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean isAppCompatTheme(Context context) {
        return e(context, f25024a);
    }

    public static boolean isMaterialTheme(Context context) {
        return e(context, f25025b);
    }

    public static TypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9, int... iArr2) {
        a(context, attributeSet, i8, i9);
        b(context, attributeSet, iArr, i8, i9, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i8, i9);
    }

    public static r0 obtainTintedStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9, int... iArr2) {
        a(context, attributeSet, i8, i9);
        b(context, attributeSet, iArr, i8, i9, iArr2);
        return r0.obtainStyledAttributes(context, attributeSet, iArr, i8, i9);
    }
}
