package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import h.AbstractC5572j;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f7200a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f7201b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f7202c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f7203d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f7204e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f7205f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f7206g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f7207h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f7208i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f7209j = new int[1];

    static int a(Context context, int i8, float f8) {
        return androidx.core.graphics.a.setAlphaComponent(getThemeAttrColor(context, i8), Math.round(Color.alpha(r0) * f8));
    }

    private static TypedValue b() {
        ThreadLocal threadLocal = f7200a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static void checkAppCompatTheme(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC5572j.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList createDisabledStateList(int i8, int i9) {
        return new ColorStateList(new int[][]{f7201b, f7208i}, new int[]{i9, i8});
    }

    public static int getDisabledThemeAttrColor(Context context, int i8) {
        ColorStateList themeAttrColorStateList = getThemeAttrColorStateList(context, i8);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            return themeAttrColorStateList.getColorForState(f7201b, themeAttrColorStateList.getDefaultColor());
        }
        TypedValue typedValueB = b();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueB, true);
        return a(context, i8, typedValueB.getFloat());
    }

    public static int getThemeAttrColor(Context context, int i8) {
        int[] iArr = f7209j;
        iArr[0] = i8;
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return r0VarObtainStyledAttributes.getColor(0, 0);
        } finally {
            r0VarObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList getThemeAttrColorStateList(Context context, int i8) {
        int[] iArr = f7209j;
        iArr[0] = i8;
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return r0VarObtainStyledAttributes.getColorStateList(0);
        } finally {
            r0VarObtainStyledAttributes.recycle();
        }
    }
}
