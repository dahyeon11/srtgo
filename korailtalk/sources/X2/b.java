package X2;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes2.dex */
public class b {
    public static TypedValue resolve(Context context, int i8) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i8, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(Context context, int i8, boolean z8) {
        TypedValue typedValueResolve = resolve(context, i8);
        return (typedValueResolve == null || typedValueResolve.type != 18) ? z8 : typedValueResolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(Context context, int i8, String str) {
        return resolveOrThrow(context, i8, str) != 0;
    }

    public static int resolveDimension(Context context, int i8, int i9) {
        TypedValue typedValueResolve = resolve(context, i8);
        return (int) ((typedValueResolve == null || typedValueResolve.type != 5) ? context.getResources().getDimension(i9) : typedValueResolve.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int resolveMinimumAccessibleTouchTarget(Context context) {
        return resolveDimension(context, J2.b.minTouchTargetSize, J2.d.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(Context context, int i8, String str) {
        TypedValue typedValueResolve = resolve(context, i8);
        if (typedValueResolve != null) {
            return typedValueResolve.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i8)));
    }

    public static int resolveOrThrow(View view, int i8) {
        return resolveOrThrow(view.getContext(), i8, view.getClass().getCanonicalName());
    }
}
