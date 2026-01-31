package Y2;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* loaded from: classes2.dex */
public abstract class b {
    public static final boolean USE_FRAMEWORK_RIPPLE = true;

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f5597a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f5598b = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f5599c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f5600d = {R.attr.state_hovered};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f5601e = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f5602f = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f5603g = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f5604h = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f5605i = {R.attr.state_selected};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f5606j = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: k, reason: collision with root package name */
    static final String f5607k = b.class.getSimpleName();

    private static int a(int i8) {
        return androidx.core.graphics.a.setAlphaComponent(i8, Math.min(Color.alpha(i8) * 2, 255));
    }

    private static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return USE_FRAMEWORK_RIPPLE ? a(colorForState) : colorForState;
    }

    public static ColorStateList convertToRippleDrawableColor(ColorStateList colorStateList) {
        if (USE_FRAMEWORK_RIPPLE) {
            return new ColorStateList(new int[][]{f5605i, StateSet.NOTHING}, new int[]{b(colorStateList, f5601e), b(colorStateList, f5597a)});
        }
        int[] iArr = f5601e;
        int[] iArr2 = f5602f;
        int[] iArr3 = f5603g;
        int[] iArr4 = f5604h;
        int[] iArr5 = f5597a;
        int[] iArr6 = f5598b;
        int[] iArr7 = f5599c;
        int[] iArr8 = f5600d;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f5605i, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{b(colorStateList, iArr), b(colorStateList, iArr2), b(colorStateList, iArr3), b(colorStateList, iArr4), 0, b(colorStateList, iArr5), b(colorStateList, iArr6), b(colorStateList, iArr7), b(colorStateList, iArr8), 0});
    }

    public static ColorStateList sanitizeRippleDrawableColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f5606j, 0)) != 0) {
            Log.w(f5607k, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean shouldDrawRippleCompat(int[] iArr) {
        boolean z8 = false;
        boolean z9 = false;
        for (int i8 : iArr) {
            if (i8 == 16842910) {
                z8 = true;
            } else if (i8 == 16842908 || i8 == 16842919 || i8 == 16843623) {
                z9 = true;
            }
        }
        return z8 && z9;
    }
}
